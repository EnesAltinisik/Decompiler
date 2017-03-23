package com.google.android.gms.internal;

public class zzagm {
    private final zzahp zzbPo;
    private final boolean zzbPp;
    private final boolean zzbPq;

    public zzagm(zzahp com_google_android_gms_internal_zzahp, boolean z, boolean z2) {
        this.zzbPo = com_google_android_gms_internal_zzahp;
        this.zzbPp = z;
        this.zzbPq = z2;
    }

    public boolean zzM(zzafa com_google_android_gms_internal_zzafa) {
        return com_google_android_gms_internal_zzafa.isEmpty() ? zzSr() && !this.zzbPq : zzf(com_google_android_gms_internal_zzafa.zzRt());
    }

    public zzahu zzPj() {
        return this.zzbPo.zzPj();
    }

    public boolean zzSr() {
        return this.zzbPp;
    }

    public boolean zzSs() {
        return this.zzbPq;
    }

    public zzahp zzSt() {
        return this.zzbPo;
    }

    public boolean zzf(zzahi com_google_android_gms_internal_zzahi) {
        return (zzSr() && !this.zzbPq) || this.zzbPo.zzPj().zzk(com_google_android_gms_internal_zzahi);
    }
}
