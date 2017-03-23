package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class zznv<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zzalX = new ThreadLocal<Boolean>() {
        protected Boolean a() {
            return Boolean.valueOf(false);
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };
    private boolean zzK;
    private final Object zzalY;
    protected final zza<R> zzalZ;
    private R zzals;
    protected final WeakReference<GoogleApiClient> zzama;
    private final ArrayList<com.google.android.gms.common.api.PendingResult.zza> zzamb;
    private ResultCallback<? super R> zzamc;
    private a zzamd;
    private volatile boolean zzame;
    private boolean zzamf;
    private zzr zzamg;
    private volatile zzpe<R> zzamh;
    private boolean zzami;
    private final CountDownLatch zzqF;

    private final class a {
        final /* synthetic */ zznv a;

        private a(zznv com_google_android_gms_internal_zznv) {
            this.a = com_google_android_gms_internal_zznv;
        }

        protected void finalize() throws Throwable {
            zznv.zzd(this.a.zzals);
            super.finalize();
        }
    }

    public static class zza<R extends Result> extends Handler {
        public zza() {
            this(Looper.getMainLooper());
        }

        public zza(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    zzb((ResultCallback) pair.first, (Result) pair.second);
                    return;
                case 2:
                    ((zznv) message.obj).zzy(Status.zzalz);
                    return;
                default:
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                    return;
            }
        }

        public void zza(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void zza(zznv<R> com_google_android_gms_internal_zznv_R, long j) {
            sendMessageDelayed(obtainMessage(2, com_google_android_gms_internal_zznv_R), j);
        }

        protected void zzb(ResultCallback<? super R> resultCallback, R r) {
            try {
                resultCallback.onResult(r);
            } catch (RuntimeException e) {
                zznv.zzd(r);
                throw e;
            }
        }

        public void zzrL() {
            removeMessages(2);
        }
    }

    @Deprecated
    zznv() {
        this.zzalY = new Object();
        this.zzqF = new CountDownLatch(1);
        this.zzamb = new ArrayList();
        this.zzami = false;
        this.zzalZ = new zza(Looper.getMainLooper());
        this.zzama = new WeakReference(null);
    }

    @Deprecated
    protected zznv(Looper looper) {
        this.zzalY = new Object();
        this.zzqF = new CountDownLatch(1);
        this.zzamb = new ArrayList();
        this.zzami = false;
        this.zzalZ = new zza(looper);
        this.zzama = new WeakReference(null);
    }

    protected zznv(GoogleApiClient googleApiClient) {
        this.zzalY = new Object();
        this.zzqF = new CountDownLatch(1);
        this.zzamb = new ArrayList();
        this.zzami = false;
        this.zzalZ = new zza(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zzama = new WeakReference(googleApiClient);
    }

    private R get() {
        R r;
        boolean z = true;
        synchronized (this.zzalY) {
            if (this.zzame) {
                z = false;
            }
            zzaa.zza(z, (Object) "Result has already been consumed.");
            zzaa.zza(isReady(), (Object) "Result is not ready.");
            r = this.zzals;
            this.zzals = null;
            this.zzamc = null;
            this.zzame = true;
        }
        zzrE();
        return r;
    }

    private void zzc(R r) {
        this.zzals = r;
        this.zzamg = null;
        this.zzqF.countDown();
        Status status = this.zzals.getStatus();
        if (this.zzK) {
            this.zzamc = null;
        } else if (this.zzamc != null) {
            this.zzalZ.zzrL();
            this.zzalZ.zza(this.zzamc, get());
        } else if (this.zzals instanceof Releasable) {
            this.zzamd = new a();
        }
        Iterator it = this.zzamb.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.PendingResult.zza) it.next()).zzt(status);
        }
        this.zzamb.clear();
    }

    public static void zzd(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                String valueOf = String.valueOf(result);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    public final R await() {
        boolean z = true;
        zzaa.zza(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        zzaa.zza(!this.zzame, (Object) "Result has already been consumed");
        if (this.zzamh != null) {
            z = false;
        }
        zzaa.zza(z, (Object) "Cannot await if then() has been called.");
        try {
            this.zzqF.await();
        } catch (InterruptedException e) {
            zzy(Status.zzalx);
        }
        zzaa.zza(isReady(), (Object) "Result is not ready.");
        return get();
    }

    public final R await(long j, TimeUnit timeUnit) {
        boolean z = true;
        boolean z2 = j <= 0 || Looper.myLooper() != Looper.getMainLooper();
        zzaa.zza(z2, (Object) "await must not be called on the UI thread when time is greater than zero.");
        zzaa.zza(!this.zzame, (Object) "Result has already been consumed.");
        if (this.zzamh != null) {
            z = false;
        }
        zzaa.zza(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.zzqF.await(j, timeUnit)) {
                zzy(Status.zzalz);
            }
        } catch (InterruptedException e) {
            zzy(Status.zzalx);
        }
        zzaa.zza(isReady(), (Object) "Result is not ready.");
        return get();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
        r2 = this;
        r1 = r2.zzalY;
        monitor-enter(r1);
        r0 = r2.zzK;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.zzame;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = r2.zzamg;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r2.zzamg;	 Catch:{ RemoteException -> 0x002c }
        r0.cancel();	 Catch:{ RemoteException -> 0x002c }
    L_0x0016:
        r0 = r2.zzals;	 Catch:{ all -> 0x0029 }
        zzd(r0);	 Catch:{ all -> 0x0029 }
        r0 = 1;
        r2.zzK = r0;	 Catch:{ all -> 0x0029 }
        r0 = com.google.android.gms.common.api.Status.zzalA;	 Catch:{ all -> 0x0029 }
        r0 = r2.zzc(r0);	 Catch:{ all -> 0x0029 }
        r2.zzc(r0);	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        goto L_0x000c;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zznv.cancel():void");
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zzalY) {
            z = this.zzK;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zzqF.getCount() == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r3 = r5.zzalY;
        monitor-enter(r3);
        if (r6 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r5.zzamc = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r5.zzame;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        com.google.android.gms.common.internal.zzaa.zza(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r5.zzamh;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.zzaa.zza(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r5.isCanceled();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r5.isReady();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r5.zzalZ;	 Catch:{ all -> 0x0027 }
        r1 = r5.get();	 Catch:{ all -> 0x0027 }
        r0.zza(r6, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r5.zzamc = r6;	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zznv.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r3 = r6.zzalY;
        monitor-enter(r3);
        if (r7 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r6.zzamc = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r6.zzame;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        com.google.android.gms.common.internal.zzaa.zza(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r6.zzamh;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.zzaa.zza(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r6.isCanceled();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r6.isReady();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r6.zzalZ;	 Catch:{ all -> 0x0027 }
        r1 = r6.get();	 Catch:{ all -> 0x0027 }
        r0.zza(r7, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r6.zzamc = r7;	 Catch:{ all -> 0x0027 }
        r0 = r6.zzalZ;	 Catch:{ all -> 0x0027 }
        r4 = r10.toMillis(r8);	 Catch:{ all -> 0x0027 }
        r0.zza(r6, r4);	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zznv.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        boolean z = true;
        zzaa.zza(!this.zzame, (Object) "Result has already been consumed.");
        synchronized (this.zzalY) {
            zzaa.zza(this.zzamh == null, (Object) "Cannot call then() twice.");
            if (this.zzamc != null) {
                z = false;
            }
            zzaa.zza(z, (Object) "Cannot call then() if callbacks are set.");
            this.zzami = true;
            this.zzamh = new zzpe(this.zzama);
            then = this.zzamh.then(resultTransform);
            if (isReady()) {
                this.zzalZ.zza(this.zzamh, get());
            } else {
                this.zzamc = this.zzamh;
            }
        }
        return then;
    }

    public final void zza(com.google.android.gms.common.api.PendingResult.zza com_google_android_gms_common_api_PendingResult_zza) {
        boolean z = true;
        zzaa.zza(!this.zzame, (Object) "Result has already been consumed.");
        if (com_google_android_gms_common_api_PendingResult_zza == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "Callback cannot be null.");
        synchronized (this.zzalY) {
            if (isReady()) {
                com_google_android_gms_common_api_PendingResult_zza.zzt(this.zzals.getStatus());
            } else {
                this.zzamb.add(com_google_android_gms_common_api_PendingResult_zza);
            }
        }
    }

    protected final void zza(zzr com_google_android_gms_common_internal_zzr) {
        synchronized (this.zzalY) {
            this.zzamg = com_google_android_gms_common_internal_zzr;
        }
    }

    public final void zzb(R r) {
        boolean z = true;
        synchronized (this.zzalY) {
            if (this.zzamf || this.zzK || (isReady() && zzrJ())) {
                zzd(r);
                return;
            }
            zzaa.zza(!isReady(), (Object) "Results have already been set");
            if (this.zzame) {
                z = false;
            }
            zzaa.zza(z, (Object) "Result has already been consumed");
            zzc((Result) r);
        }
    }

    protected abstract R zzc(Status status);

    protected void zzrE() {
    }

    public boolean zzrH() {
        boolean isCanceled;
        synchronized (this.zzalY) {
            if (((GoogleApiClient) this.zzama.get()) == null || !this.zzami) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public void zzrI() {
        boolean z = this.zzami || ((Boolean) zzalX.get()).booleanValue();
        this.zzami = z;
    }

    boolean zzrJ() {
        return false;
    }

    public Integer zzrv() {
        return null;
    }

    public final void zzy(Status status) {
        synchronized (this.zzalY) {
            if (!isReady()) {
                zzb(zzc(status));
                this.zzamf = true;
            }
        }
    }
}
