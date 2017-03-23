package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzk;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.internal.zzoo.zza;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zzof extends GoogleApiClient implements zza {
    private final Context mContext;
    private final Looper zzakW;
    private final int zzall;
    private final GoogleApiAvailability zzaln;
    final Api.zza<? extends zztv, zztw> zzalo;
    final zzg zzamS;
    final Map<Api<?>, Integer> zzamT;
    private final Lock zzamw;
    private final zzl zzanf;
    private zzoo zzang = null;
    final Queue<zznt.zza<?, ?>> zzanh = new LinkedList();
    private volatile boolean zzani;
    private long zzanj = 120000;
    private long zzank = 5000;
    private final a zzanl;
    zzol zzanm;
    final Map<zzc<?>, zze> zzann;
    Set<Scope> zzano = new HashSet();
    private final zzov zzanp = new zzov();
    private final ArrayList<zznw> zzanq;
    private Integer zzanr = null;
    Set<zzpe> zzans = null;
    final zzpf zzant;
    private final zzl.zza zzanu = new zzl.zza(this) {
        final /* synthetic */ zzof a;

        {
            this.a = r1;
        }

        public boolean isConnected() {
            return this.a.isConnected();
        }

        public Bundle zzqr() {
            return null;
        }
    };

    final class a extends Handler {
        final /* synthetic */ zzof a;

        a(zzof com_google_android_gms_internal_zzof, Looper looper) {
            this.a = com_google_android_gms_internal_zzof;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.zzsh();
                    return;
                case 2:
                    this.a.resume();
                    return;
                default:
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    static class b extends zzol.zza {
        private WeakReference<zzof> a;

        b(zzof com_google_android_gms_internal_zzof) {
            this.a = new WeakReference(com_google_android_gms_internal_zzof);
        }

        public void zzrG() {
            zzof com_google_android_gms_internal_zzof = (zzof) this.a.get();
            if (com_google_android_gms_internal_zzof != null) {
                com_google_android_gms_internal_zzof.resume();
            }
        }
    }

    public zzof(Context context, Lock lock, Looper looper, zzg com_google_android_gms_common_internal_zzg, GoogleApiAvailability googleApiAvailability, Api.zza<? extends zztv, zztw> com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw, Map<Api<?>, Integer> map, List<ConnectionCallbacks> list, List<OnConnectionFailedListener> list2, Map<zzc<?>, zze> map2, int i, int i2, ArrayList<zznw> arrayList) {
        this.mContext = context;
        this.zzamw = lock;
        this.zzanf = new zzl(looper, this.zzanu);
        this.zzakW = looper;
        this.zzanl = new a(this, looper);
        this.zzaln = googleApiAvailability;
        this.zzall = i;
        if (this.zzall >= 0) {
            this.zzanr = Integer.valueOf(i2);
        }
        this.zzamT = map;
        this.zzann = map2;
        this.zzanq = arrayList;
        this.zzant = new zzpf(this.zzann);
        for (ConnectionCallbacks registerConnectionCallbacks : list) {
            this.zzanf.registerConnectionCallbacks(registerConnectionCallbacks);
        }
        for (OnConnectionFailedListener registerConnectionFailedListener : list2) {
            this.zzanf.registerConnectionFailedListener(registerConnectionFailedListener);
        }
        this.zzamS = com_google_android_gms_common_internal_zzg;
        this.zzalo = com_google_android_gms_common_api_Api_zza__extends_com_google_android_gms_internal_zztv__com_google_android_gms_internal_zztw;
    }

    private void resume() {
        this.zzamw.lock();
        try {
            if (zzsf()) {
                zzsg();
            }
            this.zzamw.unlock();
        } catch (Throwable th) {
            this.zzamw.unlock();
        }
    }

    public static int zza(Iterable<zze> iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (zze com_google_android_gms_common_api_Api_zze : iterable) {
            if (com_google_android_gms_common_api_Api_zze.zzpd()) {
                i2 = 1;
            }
            i = com_google_android_gms_common_api_Api_zze.zzps() ? 1 : i;
        }
        return i2 != 0 ? (i == 0 || !z) ? 1 : 2 : 3;
    }

    private void zza(final GoogleApiClient googleApiClient, final zzpb com_google_android_gms_internal_zzpb, final boolean z) {
        zzpl.zzasx.zzf(googleApiClient).setResultCallback(new ResultCallback<Status>(this) {
            final /* synthetic */ zzof d;

            public void a(Status status) {
                zzk.zzab(this.d.mContext).zzpE();
                if (status.isSuccess() && this.d.isConnected()) {
                    this.d.reconnect();
                }
                com_google_android_gms_internal_zzpb.zzb(status);
                if (z) {
                    googleApiClient.disconnect();
                }
            }

            public /* synthetic */ void onResult(Result result) {
                a((Status) result);
            }
        });
    }

    private void zzb(zzop com_google_android_gms_internal_zzop) {
        if (this.zzall >= 0) {
            zznr.zza(com_google_android_gms_internal_zzop).zzbG(this.zzall);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    private void zzbJ(int i) {
        if (this.zzanr == null) {
            this.zzanr = Integer.valueOf(i);
        } else if (this.zzanr.intValue() != i) {
            String valueOf = String.valueOf(zzbK(i));
            String valueOf2 = String.valueOf(zzbK(this.zzanr.intValue()));
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Cannot use sign-in mode: ").append(valueOf).append(". Mode was already set to ").append(valueOf2).toString());
        }
        if (this.zzang == null) {
            Object obj = null;
            Object obj2 = null;
            for (zze com_google_android_gms_common_api_Api_zze : this.zzann.values()) {
                if (com_google_android_gms_common_api_Api_zze.zzpd()) {
                    obj2 = 1;
                }
                obj = com_google_android_gms_common_api_Api_zze.zzps() ? 1 : obj;
            }
            switch (this.zzanr.intValue()) {
                case 1:
                    if (obj2 == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (obj != null) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (obj2 != null) {
                        this.zzang = ag.a(this.mContext, this, this.zzamw, this.zzakW, this.zzaln, this.zzann, this.zzamS, this.zzamT, this.zzalo, this.zzanq);
                        return;
                    }
                    break;
            }
            this.zzang = new zzoh(this.mContext, this, this.zzamw, this.zzakW, this.zzaln, this.zzann, this.zzamS, this.zzamT, this.zzalo, this.zzanq, this);
        }
    }

    static String zzbK(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    private void zzsg() {
        this.zzanf.zztJ();
        this.zzang.connect();
    }

    private void zzsh() {
        this.zzamw.lock();
        try {
            if (zzsj()) {
                zzsg();
            }
            this.zzamw.unlock();
        } catch (Throwable th) {
            this.zzamw.unlock();
        }
    }

    public ConnectionResult blockingConnect() {
        boolean z = true;
        zzaa.zza(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.zzamw.lock();
        try {
            if (this.zzall >= 0) {
                if (this.zzanr == null) {
                    z = false;
                }
                zzaa.zza(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zzanr == null) {
                this.zzanr = Integer.valueOf(zza(this.zzann.values(), false));
            } else if (this.zzanr.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zzbJ(this.zzanr.intValue());
            this.zzanf.zztJ();
            ConnectionResult blockingConnect = this.zzang.blockingConnect();
            return blockingConnect;
        } finally {
            this.zzamw.unlock();
        }
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        zzaa.zza(z, (Object) "blockingConnect must not be called on the UI thread");
        zzaa.zzb((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.zzamw.lock();
        try {
            if (this.zzanr == null) {
                this.zzanr = Integer.valueOf(zza(this.zzann.values(), false));
            } else if (this.zzanr.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zzbJ(this.zzanr.intValue());
            this.zzanf.zztJ();
            ConnectionResult blockingConnect = this.zzang.blockingConnect(j, timeUnit);
            return blockingConnect;
        } finally {
            this.zzamw.unlock();
        }
    }

    public PendingResult<Status> clearDefaultAccountAndReconnect() {
        zzaa.zza(isConnected(), (Object) "GoogleApiClient is not connected yet.");
        zzaa.zza(this.zzanr.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        final PendingResult com_google_android_gms_internal_zzpb = new zzpb((GoogleApiClient) this);
        if (this.zzann.containsKey(zzpl.zzaaz)) {
            zza(this, com_google_android_gms_internal_zzpb, false);
        } else {
            final AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new Builder(this.mContext).addApi(zzpl.API).addConnectionCallbacks(new ConnectionCallbacks(this) {
                final /* synthetic */ zzof c;

                public void onConnected(Bundle bundle) {
                    this.c.zza((GoogleApiClient) atomicReference.get(), com_google_android_gms_internal_zzpb, true);
                }

                public void onConnectionSuspended(int i) {
                }
            }).addOnConnectionFailedListener(new OnConnectionFailedListener(this) {
                final /* synthetic */ zzof b;

                public void onConnectionFailed(ConnectionResult connectionResult) {
                    com_google_android_gms_internal_zzpb.zzb(new Status(8));
                }
            }).setHandler(this.zzanl).build();
            atomicReference.set(build);
            build.connect();
        }
        return com_google_android_gms_internal_zzpb;
    }

    public void connect() {
        boolean z = false;
        this.zzamw.lock();
        try {
            if (this.zzall >= 0) {
                if (this.zzanr != null) {
                    z = true;
                }
                zzaa.zza(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zzanr == null) {
                this.zzanr = Integer.valueOf(zza(this.zzann.values(), false));
            } else if (this.zzanr.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(this.zzanr.intValue());
        } finally {
            this.zzamw.unlock();
        }
    }

    public void connect(int i) {
        boolean z = true;
        this.zzamw.lock();
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            zzaa.zzb(z, "Illegal sign-in mode: " + i);
            zzbJ(i);
            zzsg();
        } finally {
            this.zzamw.unlock();
        }
    }

    public void disconnect() {
        this.zzamw.lock();
        try {
            this.zzant.release();
            if (this.zzang != null) {
                this.zzang.disconnect();
            }
            this.zzanp.release();
            for (zznt.zza com_google_android_gms_internal_zznt_zza : this.zzanh) {
                com_google_android_gms_internal_zznt_zza.zza(null);
                com_google_android_gms_internal_zznt_zza.cancel();
            }
            this.zzanh.clear();
            if (this.zzang != null) {
                zzsj();
                this.zzanf.zztI();
                this.zzamw.unlock();
            }
        } finally {
            this.zzamw.unlock();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.mContext);
        printWriter.append(str).append("mResuming=").print(this.zzani);
        printWriter.append(" mWorkQueue.size()=").print(this.zzanh.size());
        this.zzant.dump(printWriter);
        if (this.zzang != null) {
            this.zzang.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public ConnectionResult getConnectionResult(Api<?> api) {
        this.zzamw.lock();
        try {
            if (!isConnected() && !zzsf()) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            } else if (this.zzann.containsKey(api.zzre())) {
                ConnectionResult connectionResult = this.zzang.getConnectionResult(api);
                if (connectionResult != null) {
                    this.zzamw.unlock();
                } else if (zzsf()) {
                    connectionResult = ConnectionResult.zzakj;
                } else {
                    Log.i("GoogleApiClientImpl", zzsl());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(api.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    connectionResult = new ConnectionResult(8, null);
                    this.zzamw.unlock();
                }
                return connectionResult;
            } else {
                throw new IllegalArgumentException(String.valueOf(api.getName()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.zzamw.unlock();
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public Looper getLooper() {
        return this.zzakW;
    }

    public int getSessionId() {
        return System.identityHashCode(this);
    }

    public boolean hasConnectedApi(Api<?> api) {
        zze com_google_android_gms_common_api_Api_zze = (zze) this.zzann.get(api.zzre());
        return com_google_android_gms_common_api_Api_zze != null && com_google_android_gms_common_api_Api_zze.isConnected();
    }

    public boolean isConnected() {
        return this.zzang != null && this.zzang.isConnected();
    }

    public boolean isConnecting() {
        return this.zzang != null && this.zzang.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks) {
        return this.zzanf.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener) {
        return this.zzanf.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void reconnect() {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.zzanf.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.zzanf.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void stopAutoManage(FragmentActivity fragmentActivity) {
        zzb(new zzop(fragmentActivity));
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.zzanf.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.zzanf.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    public <C extends zze> C zza(zzc<C> com_google_android_gms_common_api_Api_zzc_C) {
        Object obj = (zze) this.zzann.get(com_google_android_gms_common_api_Api_zzc_C);
        zzaa.zzb(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public void zza(zzpe com_google_android_gms_internal_zzpe) {
        this.zzamw.lock();
        try {
            if (this.zzans == null) {
                this.zzans = new HashSet();
            }
            this.zzans.add(com_google_android_gms_internal_zzpe);
        } finally {
            this.zzamw.unlock();
        }
    }

    public boolean zza(Api<?> api) {
        return this.zzann.containsKey(api.zzre());
    }

    public boolean zza(zzpa com_google_android_gms_internal_zzpa) {
        return this.zzang != null && this.zzang.zza(com_google_android_gms_internal_zzpa);
    }

    <C extends zze> C zzb(zzc<?> com_google_android_gms_common_api_Api_zzc_) {
        Object obj = (zze) this.zzann.get(com_google_android_gms_common_api_Api_zzc_);
        zzaa.zzb(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public void zzb(zzpe com_google_android_gms_internal_zzpe) {
        this.zzamw.lock();
        try {
            if (this.zzans == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.zzans.remove(com_google_android_gms_internal_zzpe)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!zzsk()) {
                this.zzang.zzrN();
            }
            this.zzamw.unlock();
        } catch (Throwable th) {
            this.zzamw.unlock();
        }
    }

    public <A extends zzb, R extends Result, T extends zznt.zza<R, A>> T zzc(T t) {
        zzaa.zzb(t.zzre() != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.zzann.containsKey(t.zzre());
        String name = t.zzrl() != null ? t.zzrl().getName() : "the API";
        zzaa.zzb(containsKey, new StringBuilder(String.valueOf(name).length() + 65).append("GoogleApiClient is not configured to use ").append(name).append(" required for this call.").toString());
        this.zzamw.lock();
        try {
            if (this.zzang == null) {
                this.zzanh.add(t);
            } else {
                t = this.zzang.zzc(t);
                this.zzamw.unlock();
            }
            return t;
        } finally {
            this.zzamw.unlock();
        }
    }

    public void zzc(int i, boolean z) {
        if (i == 1 && !z) {
            zzsi();
        }
        this.zzant.zzsL();
        this.zzanf.zzcc(i);
        this.zzanf.zztI();
        if (i == 2) {
            zzsg();
        }
    }

    public <A extends zzb, T extends zznt.zza<? extends Result, A>> T zzd(T t) {
        zzaa.zzb(t.zzre() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.zzann.containsKey(t.zzre());
        String name = t.zzrl() != null ? t.zzrl().getName() : "the API";
        zzaa.zzb(containsKey, new StringBuilder(String.valueOf(name).length() + 65).append("GoogleApiClient is not configured to use ").append(name).append(" required for this call.").toString());
        this.zzamw.lock();
        try {
            if (this.zzang == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (zzsf()) {
                this.zzanh.add(t);
                while (!this.zzanh.isEmpty()) {
                    zznt.zza com_google_android_gms_internal_zznt_zza = (zznt.zza) this.zzanh.remove();
                    this.zzant.zzg(com_google_android_gms_internal_zznt_zza);
                    com_google_android_gms_internal_zznt_zza.zzx(Status.zzaly);
                }
            } else {
                t = this.zzang.zzd(t);
                this.zzamw.unlock();
            }
            return t;
        } finally {
            this.zzamw.unlock();
        }
    }

    public void zzd(ConnectionResult connectionResult) {
        if (!this.zzaln.zzc(this.mContext, connectionResult.getErrorCode())) {
            zzsj();
        }
        if (!zzsf()) {
            this.zzanf.zzm(connectionResult);
            this.zzanf.zztI();
        }
    }

    public void zzk(Bundle bundle) {
        while (!this.zzanh.isEmpty()) {
            zzd((zznt.zza) this.zzanh.remove());
        }
        this.zzanf.zzm(bundle);
    }

    public void zzrr() {
        if (this.zzang != null) {
            this.zzang.zzrr();
        }
    }

    public <L> zzou<L> zzs(L l) {
        this.zzamw.lock();
        try {
            zzou<L> zza = this.zzanp.zza(l, this.zzakW);
            return zza;
        } finally {
            this.zzamw.unlock();
        }
    }

    boolean zzsf() {
        return this.zzani;
    }

    void zzsi() {
        if (!zzsf()) {
            this.zzani = true;
            if (this.zzanm == null) {
                this.zzanm = this.zzaln.zza(this.mContext.getApplicationContext(), new b(this));
            }
            this.zzanl.sendMessageDelayed(this.zzanl.obtainMessage(1), this.zzanj);
            this.zzanl.sendMessageDelayed(this.zzanl.obtainMessage(2), this.zzank);
        }
    }

    boolean zzsj() {
        if (!zzsf()) {
            return false;
        }
        this.zzani = false;
        this.zzanl.removeMessages(2);
        this.zzanl.removeMessages(1);
        if (this.zzanm != null) {
            this.zzanm.unregister();
            this.zzanm = null;
        }
        return true;
    }

    boolean zzsk() {
        boolean z = false;
        this.zzamw.lock();
        try {
            if (this.zzans != null) {
                if (!this.zzans.isEmpty()) {
                    z = true;
                }
                this.zzamw.unlock();
            }
            return z;
        } finally {
            this.zzamw.unlock();
        }
    }

    String zzsl() {
        Writer stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
}
