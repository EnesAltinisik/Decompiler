package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznq;
import com.google.android.gms.internal.zznt.zza;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzok;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzpd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzc<O extends ApiOptions> {
    private final Context mContext;
    private final int mId;
    private final zzov zzakS;
    private final Api<O> zzakT;
    private final O zzakU;
    private final zznq<O> zzakV;
    private final Looper zzakW;
    private final zzoj zzakX;
    private final GoogleApiClient zzakY;
    private final AtomicBoolean zzakZ;
    private final AtomicInteger zzala;

    public zzc(Context context, Api<O> api, O o) {
        this(context, api, o, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    public zzc(Context context, Api<O> api, O o, Looper looper) {
        this.zzakZ = new AtomicBoolean(false);
        this.zzala = new AtomicInteger(0);
        zzaa.zzb((Object) context, (Object) "Null context is not permitted.");
        zzaa.zzb((Object) api, (Object) "Api must not be null.");
        zzaa.zzb((Object) looper, (Object) "Looper must not be null.");
        this.mContext = context.getApplicationContext();
        this.zzakT = api;
        this.zzakU = o;
        this.zzakW = looper;
        this.zzakS = new zzov();
        this.zzakV = new zznq(this.zzakT, this.zzakU);
        this.zzakY = new zzok(this);
        Pair zza = zzoj.zza(this.mContext, this);
        this.zzakX = (zzoj) zza.first;
        this.mId = ((Integer) zza.second).intValue();
    }

    private <A extends zzb, T extends zza<? extends Result, A>> T zza(int i, T t) {
        t.zzrI();
        this.zzakX.zza(this, i, t);
        return t;
    }

    private <TResult, A extends zzb> Task<TResult> zza(int i, zzpd<A, TResult> com_google_android_gms_internal_zzpd_A__TResult) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzakX.zza(this, i, com_google_android_gms_internal_zzpd_A__TResult, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public int getInstanceId() {
        return this.mId;
    }

    public Looper getLooper() {
        return this.zzakW;
    }

    public void release() {
        boolean z = true;
        if (!this.zzakZ.getAndSet(true)) {
            this.zzakS.release();
            zzoj com_google_android_gms_internal_zzoj = this.zzakX;
            int i = this.mId;
            if (this.zzala.get() <= 0) {
                z = false;
            }
            com_google_android_gms_internal_zzoj.zzd(i, z);
        }
    }

    public <A extends zzb, T extends zza<? extends Result, A>> T zza(T t) {
        return zza(0, (zza) t);
    }

    public <TResult, A extends zzb> Task<TResult> zza(zzpd<A, TResult> com_google_android_gms_internal_zzpd_A__TResult) {
        return zza(0, (zzpd) com_google_android_gms_internal_zzpd_A__TResult);
    }

    public <A extends zzb, T extends zza<? extends Result, A>> T zzb(T t) {
        return zza(1, (zza) t);
    }

    public <TResult, A extends zzb> Task<TResult> zzb(zzpd<A, TResult> com_google_android_gms_internal_zzpd_A__TResult) {
        return zza(1, (zzpd) com_google_android_gms_internal_zzpd_A__TResult);
    }

    public void zzrj() {
        this.zzala.incrementAndGet();
    }

    public void zzrk() {
        if (this.zzala.decrementAndGet() == 0 && this.zzakZ.get()) {
            this.zzakX.zzd(this.mId, false);
        }
    }

    public Api<O> zzrl() {
        return this.zzakT;
    }

    public O zzrm() {
        return this.zzakU;
    }

    public zznq<O> zzrn() {
        return this.zzakV;
    }

    public GoogleApiClient zzro() {
        return this.zzakY;
    }
}
