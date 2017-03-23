package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class zzoh implements zzoo {
    private final Context mContext;
    final zza<? extends zztv, zztw> zzalo;
    private final zzc zzamE;
    final zzg zzamS;
    final Map<Api<?>, Integer> zzamT;
    final zzof zzamm;
    private final Lock zzamw;
    private final Condition zzanA;
    private final b zzanB;
    final Map<Api.zzc<?>, ConnectionResult> zzanC = new HashMap();
    private volatile zzog zzanD;
    private ConnectionResult zzanE = null;
    int zzanF;
    final zzoo.zza zzanG;
    final Map<Api.zzc<?>, zze> zzann;

    static abstract class a {
        private final zzog a;

        protected a(zzog com_google_android_gms_internal_zzog) {
            this.a = com_google_android_gms_internal_zzog;
        }

        protected abstract void a();

        public final void a(zzoh com_google_android_gms_internal_zzoh) {
            com_google_android_gms_internal_zzoh.zzamw.lock();
            try {
                if (com_google_android_gms_internal_zzoh.zzanD == this.a) {
                    a();
                    com_google_android_gms_internal_zzoh.zzamw.unlock();
                }
            } finally {
                com_google_android_gms_internal_zzoh.zzamw.unlock();
            }
        }
    }

    final class b extends Handler {
        final /* synthetic */ zzoh a;

        b(zzoh com_google_android_gms_internal_zzoh, Looper looper) {
            this.a = com_google_android_gms_internal_zzoh;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ((a) message.obj).a(this.a);
                    return;
                case 2:
                    throw ((RuntimeException) message.obj);
                default:
                    Log.w("GACStateManager", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    public zzoh(Context context, zzof com_google_android_gms_internal_zzof, Lock lock, Looper looper, zzc com_google_android_gms_common_zzc, Map<Api.zzc<?>, zze> map, zzg com_google_android_gms_common_internal_zzg, Map<Api<?>, Integer> map2, zza<? extends zztv, zztw> com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, ArrayList<zznw> arrayList, zzoo.zza com_google_android_gms_internal_zzoo_zza) {
        this.mContext = context;
        this.zzamw = lock;
        this.zzamE = com_google_android_gms_common_zzc;
        this.zzann = map;
        this.zzamS = com_google_android_gms_common_internal_zzg;
        this.zzamT = map2;
        this.zzalo = com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw;
        this.zzamm = com_google_android_gms_internal_zzof;
        this.zzanG = com_google_android_gms_internal_zzoo_zza;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zznw) it.next()).zza(this);
        }
        this.zzanB = new b(this, looper);
        this.zzanA = lock.newCondition();
        this.zzanD = new zzoe(this);
    }

    public ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zzanA.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return isConnected() ? ConnectionResult.zzakj : this.zzanE != null ? this.zzanE : new ConnectionResult(13, null);
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        connect();
        long toNanos = timeUnit.toNanos(j);
        while (isConnecting()) {
            if (toNanos <= 0) {
                try {
                    disconnect();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.zzanA.awaitNanos(toNanos);
        }
        return isConnected() ? ConnectionResult.zzakj : this.zzanE != null ? this.zzanE : new ConnectionResult(13, null);
    }

    public void connect() {
        this.zzanD.connect();
    }

    public void disconnect() {
        if (this.zzanD.disconnect()) {
            this.zzanC.clear();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        for (Api api : this.zzamT.keySet()) {
            printWriter.append(str).append(api.getName()).println(":");
            ((zze) this.zzann.get(api.zzre())).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    public ConnectionResult getConnectionResult(Api<?> api) {
        Api.zzc zzre = api.zzre();
        if (this.zzann.containsKey(zzre)) {
            if (((zze) this.zzann.get(zzre)).isConnected()) {
                return ConnectionResult.zzakj;
            }
            if (this.zzanC.containsKey(zzre)) {
                return (ConnectionResult) this.zzanC.get(zzre);
            }
        }
        return null;
    }

    public boolean isConnected() {
        return this.zzanD instanceof zzoc;
    }

    public boolean isConnecting() {
        return this.zzanD instanceof zzod;
    }

    public void onConnected(Bundle bundle) {
        this.zzamw.lock();
        try {
            this.zzanD.onConnected(bundle);
        } finally {
            this.zzamw.unlock();
        }
    }

    public void onConnectionSuspended(int i) {
        this.zzamw.lock();
        try {
            this.zzanD.onConnectionSuspended(i);
        } finally {
            this.zzamw.unlock();
        }
    }

    public void zza(ConnectionResult connectionResult, Api<?> api, int i) {
        this.zzamw.lock();
        try {
            this.zzanD.zza(connectionResult, api, i);
        } finally {
            this.zzamw.unlock();
        }
    }

    void zza(a aVar) {
        this.zzanB.sendMessage(this.zzanB.obtainMessage(1, aVar));
    }

    void zza(RuntimeException runtimeException) {
        this.zzanB.sendMessage(this.zzanB.obtainMessage(2, runtimeException));
    }

    public boolean zza(zzpa com_google_android_gms_internal_zzpa) {
        return false;
    }

    public <A extends zzb, R extends Result, T extends zznt.zza<R, A>> T zzc(T t) {
        t.zzrI();
        return this.zzanD.zzc(t);
    }

    public <A extends zzb, T extends zznt.zza<? extends Result, A>> T zzd(T t) {
        t.zzrI();
        return this.zzanD.zzd(t);
    }

    void zzi(ConnectionResult connectionResult) {
        this.zzamw.lock();
        try {
            this.zzanE = connectionResult;
            this.zzanD = new zzoe(this);
            this.zzanD.begin();
            this.zzanA.signalAll();
        } finally {
            this.zzamw.unlock();
        }
    }

    public void zzrN() {
        if (isConnected()) {
            ((zzoc) this.zzanD).zzrW();
        }
    }

    public void zzrr() {
    }

    void zzsm() {
        this.zzamw.lock();
        try {
            this.zzanD = new zzod(this, this.zzamS, this.zzamT, this.zzamE, this.zzalo, this.zzamw, this.mContext);
            this.zzanD.begin();
            this.zzanA.signalAll();
        } finally {
            this.zzamw.unlock();
        }
    }

    void zzsn() {
        this.zzamw.lock();
        try {
            this.zzamm.zzsj();
            this.zzanD = new zzoc(this);
            this.zzanD.begin();
            this.zzanA.signalAll();
        } finally {
            this.zzamw.unlock();
        }
    }

    void zzso() {
        for (zze disconnect : this.zzann.values()) {
            disconnect.disconnect();
        }
    }
}
