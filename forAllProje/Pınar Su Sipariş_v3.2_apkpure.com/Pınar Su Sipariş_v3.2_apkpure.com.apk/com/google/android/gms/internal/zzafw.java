package com.google.android.gms.internal;

public abstract class zzafw {
    protected final zzafa zzbHw;
    protected final zza zzbOn;
    protected final zzafx zzbOo;

    public enum zza {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    protected zzafw(zza com_google_android_gms_internal_zzafw_zza, zzafx com_google_android_gms_internal_zzafx, zzafa com_google_android_gms_internal_zzafa) {
        this.zzbOn = com_google_android_gms_internal_zzafw_zza;
        this.zzbOo = com_google_android_gms_internal_zzafx;
        this.zzbHw = com_google_android_gms_internal_zzafa;
    }

    public zzafa zzPn() {
        return this.zzbHw;
    }

    public zzafx zzRZ() {
        return this.zzbOo;
    }

    public zza zzSa() {
        return this.zzbOn;
    }

    public abstract zzafw zzc(zzahi com_google_android_gms_internal_zzahi);
}
