package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.internal.zznt.zza;

public class zzok<O extends ApiOptions> extends zzob {
    private final zzc<O> zzaoe;

    public zzok(zzc<O> com_google_android_gms_common_api_zzc_O) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zzaoe = com_google_android_gms_common_api_zzc_O;
    }

    public Looper getLooper() {
        return this.zzaoe.getLooper();
    }

    public void zza(zzpe com_google_android_gms_internal_zzpe) {
        this.zzaoe.zzrj();
    }

    public void zzb(zzpe com_google_android_gms_internal_zzpe) {
        this.zzaoe.zzrk();
    }

    public <A extends zzb, R extends Result, T extends zza<R, A>> T zzc(T t) {
        return this.zzaoe.zza((zza) t);
    }

    public <A extends zzb, T extends zza<? extends Result, A>> T zzd(T t) {
        return this.zzaoe.zzb((zza) t);
    }
}
