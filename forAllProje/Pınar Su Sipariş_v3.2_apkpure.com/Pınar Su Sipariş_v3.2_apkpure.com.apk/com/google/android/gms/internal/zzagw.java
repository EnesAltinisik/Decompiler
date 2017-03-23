package com.google.android.gms.internal;

public class zzagw {
    private final zzagm zzbQc;
    private final zzagm zzbQd;

    public zzagw(zzagm com_google_android_gms_internal_zzagm, zzagm com_google_android_gms_internal_zzagm2) {
        this.zzbQc = com_google_android_gms_internal_zzagm;
        this.zzbQd = com_google_android_gms_internal_zzagm2;
    }

    public zzagm zzSV() {
        return this.zzbQc;
    }

    public zzahu zzSW() {
        return this.zzbQc.zzSr() ? this.zzbQc.zzPj() : null;
    }

    public zzagm zzSX() {
        return this.zzbQd;
    }

    public zzahu zzSY() {
        return this.zzbQd.zzSr() ? this.zzbQd.zzPj() : null;
    }

    public zzagw zza(zzahp com_google_android_gms_internal_zzahp, boolean z, boolean z2) {
        return new zzagw(new zzagm(com_google_android_gms_internal_zzahp, z, z2), this.zzbQd);
    }

    public zzagw zzb(zzahp com_google_android_gms_internal_zzahp, boolean z, boolean z2) {
        return new zzagw(this.zzbQc, new zzagm(com_google_android_gms_internal_zzahp, z, z2));
    }
}
