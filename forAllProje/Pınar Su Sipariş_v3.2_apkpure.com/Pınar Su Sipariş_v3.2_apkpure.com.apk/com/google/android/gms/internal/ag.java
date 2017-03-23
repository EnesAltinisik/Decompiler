package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzoo.zza;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class ag implements zzoo {
    private final Context a;
    private final zzof b;
    private final Looper c;
    private final zzoh d;
    private final zzoh e;
    private final Map<zzc<?>, zzoh> f;
    private final Set<zzpa> g = Collections.newSetFromMap(new WeakHashMap());
    private final zze h;
    private Bundle i;
    private ConnectionResult j = null;
    private ConnectionResult k = null;
    private boolean l = false;
    private final Lock m;
    private int n = 0;

    private class a implements zza {
        final /* synthetic */ ag a;

        private a(ag agVar) {
            this.a = agVar;
        }

        public void zzc(int i, boolean z) {
            this.a.m.lock();
            try {
                if (this.a.l || this.a.k == null || !this.a.k.isSuccess()) {
                    this.a.l = false;
                    this.a.a(i, z);
                    return;
                }
                this.a.l = true;
                this.a.e.onConnectionSuspended(i);
                this.a.m.unlock();
            } finally {
                this.a.m.unlock();
            }
        }

        public void zzd(ConnectionResult connectionResult) {
            this.a.m.lock();
            try {
                this.a.j = connectionResult;
                this.a.c();
            } finally {
                this.a.m.unlock();
            }
        }

        public void zzk(Bundle bundle) {
            this.a.m.lock();
            try {
                this.a.a(bundle);
                this.a.j = ConnectionResult.zzakj;
                this.a.c();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private class b implements zza {
        final /* synthetic */ ag a;

        private b(ag agVar) {
            this.a = agVar;
        }

        public void zzc(int i, boolean z) {
            this.a.m.lock();
            try {
                if (this.a.l) {
                    this.a.l = false;
                    this.a.a(i, z);
                    return;
                }
                this.a.l = true;
                this.a.d.onConnectionSuspended(i);
                this.a.m.unlock();
            } finally {
                this.a.m.unlock();
            }
        }

        public void zzd(ConnectionResult connectionResult) {
            this.a.m.lock();
            try {
                this.a.k = connectionResult;
                this.a.c();
            } finally {
                this.a.m.unlock();
            }
        }

        public void zzk(Bundle bundle) {
            this.a.m.lock();
            try {
                this.a.k = ConnectionResult.zzakj;
                this.a.c();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private ag(Context context, zzof com_google_android_gms_internal_zzof, Lock lock, Looper looper, com.google.android.gms.common.zzc com_google_android_gms_common_zzc, Map<zzc<?>, zze> map, Map<zzc<?>, zze> map2, zzg com_google_android_gms_common_internal_zzg, Api.zza<? extends zztv, zztw> com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, zze com_google_android_gms_common_api_Api_zze, ArrayList<zznw> arrayList, ArrayList<zznw> arrayList2, Map<Api<?>, Integer> map3, Map<Api<?>, Integer> map4) {
        this.a = context;
        this.b = com_google_android_gms_internal_zzof;
        this.m = lock;
        this.c = looper;
        this.h = com_google_android_gms_common_api_Api_zze;
        this.d = new zzoh(context, this.b, lock, looper, com_google_android_gms_common_zzc, map2, null, map4, null, arrayList2, new a());
        this.e = new zzoh(context, this.b, lock, looper, com_google_android_gms_common_zzc, map, com_google_android_gms_common_internal_zzg, map3, com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, arrayList, new b());
        Map aVar = new android.support.v4.h.a();
        for (zzc put : map2.keySet()) {
            aVar.put(put, this.d);
        }
        for (zzc put2 : map.keySet()) {
            aVar.put(put2, this.e);
        }
        this.f = Collections.unmodifiableMap(aVar);
    }

    public static ag a(Context context, zzof com_google_android_gms_internal_zzof, Lock lock, Looper looper, com.google.android.gms.common.zzc com_google_android_gms_common_zzc, Map<zzc<?>, zze> map, zzg com_google_android_gms_common_internal_zzg, Map<Api<?>, Integer> map2, Api.zza<? extends zztv, zztw> com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, ArrayList<zznw> arrayList) {
        zze com_google_android_gms_common_api_Api_zze = null;
        Map aVar = new android.support.v4.h.a();
        Map aVar2 = new android.support.v4.h.a();
        for (Entry entry : map.entrySet()) {
            zze com_google_android_gms_common_api_Api_zze2 = (zze) entry.getValue();
            if (com_google_android_gms_common_api_Api_zze2.zzps()) {
                com_google_android_gms_common_api_Api_zze = com_google_android_gms_common_api_Api_zze2;
            }
            if (com_google_android_gms_common_api_Api_zze2.zzpd()) {
                aVar.put((zzc) entry.getKey(), com_google_android_gms_common_api_Api_zze2);
            } else {
                aVar2.put((zzc) entry.getKey(), com_google_android_gms_common_api_Api_zze2);
            }
        }
        zzaa.zza(!aVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map aVar3 = new android.support.v4.h.a();
        Map aVar4 = new android.support.v4.h.a();
        for (Api api : map2.keySet()) {
            zzc zzre = api.zzre();
            if (aVar.containsKey(zzre)) {
                aVar3.put(api, (Integer) map2.get(api));
            } else if (aVar2.containsKey(zzre)) {
                aVar4.put(api, (Integer) map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zznw com_google_android_gms_internal_zznw = (zznw) it.next();
            if (aVar3.containsKey(com_google_android_gms_internal_zznw.zzakT)) {
                arrayList2.add(com_google_android_gms_internal_zznw);
            } else if (aVar4.containsKey(com_google_android_gms_internal_zznw.zzakT)) {
                arrayList3.add(com_google_android_gms_internal_zznw);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        return new ag(context, com_google_android_gms_internal_zzof, lock, looper, com_google_android_gms_common_zzc, aVar, aVar2, com_google_android_gms_common_internal_zzg, com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, com_google_android_gms_common_api_Api_zze, arrayList2, arrayList3, aVar3, aVar4);
    }

    private void a(int i, boolean z) {
        this.b.zzc(i, z);
        this.k = null;
        this.j = null;
    }

    private void a(Bundle bundle) {
        if (this.i == null) {
            this.i = bundle;
        } else if (bundle != null) {
            this.i.putAll(bundle);
        }
    }

    private void a(ConnectionResult connectionResult) {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.b.zzd(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        e();
        this.n = 0;
    }

    private boolean a(zznt.zza<? extends Result, ? extends zzb> com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result___extends_com_google_android_gms_common_api_Api_zzb) {
        zzc zzre = com_google_android_gms_internal_zznt_zza__extends_com_google_android_gms_common_api_Result___extends_com_google_android_gms_common_api_Api_zzb.zzre();
        zzaa.zzb(this.f.containsKey(zzre), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((zzoh) this.f.get(zzre)).equals(this.e);
    }

    private void b() {
        this.k = null;
        this.j = null;
        this.d.connect();
        this.e.connect();
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    private void c() {
        if (b(this.j)) {
            if (b(this.k) || f()) {
                d();
            } else if (this.k == null) {
            } else {
                if (this.n == 1) {
                    e();
                    return;
                }
                a(this.k);
                this.d.disconnect();
            }
        } else if (this.j != null && b(this.k)) {
            this.e.disconnect();
            a(this.j);
        } else if (this.j != null && this.k != null) {
            ConnectionResult connectionResult = this.j;
            if (this.e.zzanF < this.d.zzanF) {
                connectionResult = this.k;
            }
            a(connectionResult);
        }
    }

    private void d() {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.b.zzk(this.i);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                break;
        }
        e();
        this.n = 0;
    }

    private void e() {
        for (zzpa zzpr : this.g) {
            zzpr.zzpr();
        }
        this.g.clear();
    }

    private boolean f() {
        return this.k != null && this.k.getErrorCode() == 4;
    }

    private PendingIntent g() {
        return this.h == null ? null : PendingIntent.getActivity(this.a, this.b.getSessionId(), this.h.zzpt(), 134217728);
    }

    public boolean a() {
        return this.e.isConnected();
    }

    public ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void connect() {
        this.n = 2;
        this.l = false;
        b();
    }

    public void disconnect() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.disconnect();
        this.e.disconnect();
        e();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.e.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.d.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public ConnectionResult getConnectionResult(Api<?> api) {
        return ((zzoh) this.f.get(api.zzre())).equals(this.e) ? f() ? new ConnectionResult(4, g()) : this.e.getConnectionResult(api) : this.d.getConnectionResult(api);
    }

    public boolean isConnected() {
        boolean z = true;
        this.m.lock();
        try {
            if (!(this.d.isConnected() && (a() || f() || this.n == 1))) {
                z = false;
            }
            this.m.unlock();
            return z;
        } catch (Throwable th) {
            this.m.unlock();
        }
    }

    public boolean isConnecting() {
        this.m.lock();
        try {
            boolean z = this.n == 2;
            this.m.unlock();
            return z;
        } catch (Throwable th) {
            this.m.unlock();
        }
    }

    public boolean zza(zzpa com_google_android_gms_internal_zzpa) {
        this.m.lock();
        try {
            if ((isConnecting() || isConnected()) && !a()) {
                this.g.add(com_google_android_gms_internal_zzpa);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                this.e.connect();
                return true;
            }
            this.m.unlock();
            return false;
        } finally {
            this.m.unlock();
        }
    }

    public <A extends zzb, R extends Result, T extends zznt.zza<R, A>> T zzc(T t) {
        if (!a((zznt.zza) t)) {
            return this.d.zzc((zznt.zza) t);
        }
        if (!f()) {
            return this.e.zzc((zznt.zza) t);
        }
        t.zzx(new Status(4, null, g()));
        return t;
    }

    public <A extends zzb, T extends zznt.zza<? extends Result, A>> T zzd(T t) {
        if (!a((zznt.zza) t)) {
            return this.d.zzd(t);
        }
        if (!f()) {
            return this.e.zzd(t);
        }
        t.zzx(new Status(4, null, g()));
        return t;
    }

    public void zzrN() {
        this.d.zzrN();
        this.e.zzrN();
    }

    public void zzrr() {
        this.m.lock();
        try {
            boolean isConnecting = isConnecting();
            this.e.disconnect();
            this.k = new ConnectionResult(4);
            if (isConnecting) {
                new Handler(this.c).post(new Runnable(this) {
                    final /* synthetic */ ag a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.m.lock();
                        try {
                            this.a.c();
                        } finally {
                            this.a.m.unlock();
                        }
                    }
                });
            } else {
                e();
            }
            this.m.unlock();
        } catch (Throwable th) {
            this.m.unlock();
        }
    }
}
