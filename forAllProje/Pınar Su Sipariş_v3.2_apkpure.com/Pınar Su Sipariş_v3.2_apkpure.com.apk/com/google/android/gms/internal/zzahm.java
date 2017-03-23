package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahu.zza;

public class zzahm extends zzahr<zzahm> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahm.class.desiredAssertionStatus());
    private final Double zzbQU;

    public zzahm(Double d, zzahu com_google_android_gms_internal_zzahu) {
        super(com_google_android_gms_internal_zzahu);
        this.zzbQU = d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzahm)) {
            return false;
        }
        zzahm com_google_android_gms_internal_zzahm = (zzahm) obj;
        return this.zzbQU.equals(com_google_android_gms_internal_zzahm.zzbQU) && this.zzbQE.equals(com_google_android_gms_internal_zzahm.zzbQE);
    }

    public Object getValue() {
        return this.zzbQU;
    }

    public int hashCode() {
        return this.zzbQU.hashCode() + this.zzbQE.hashCode();
    }

    protected zza zzTg() {
        return zza.Number;
    }

    protected int zza(zzahm com_google_android_gms_internal_zzahm) {
        return this.zzbQU.compareTo(com_google_android_gms_internal_zzahm.zzbQU);
    }

    public String zza(zza com_google_android_gms_internal_zzahu_zza) {
        String valueOf = String.valueOf(String.valueOf(zzb(com_google_android_gms_internal_zzahu_zza)).concat("number:"));
        String valueOf2 = String.valueOf(zzaiv.zzn(this.zzbQU.doubleValue()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public /* synthetic */ zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return zzj(com_google_android_gms_internal_zzahu);
    }

    public zzahm zzj(zzahu com_google_android_gms_internal_zzahu) {
        if ($assertionsDisabled || zzahy.zzp(com_google_android_gms_internal_zzahu)) {
            return new zzahm(this.zzbQU, com_google_android_gms_internal_zzahu);
        }
        throw new AssertionError();
    }
}
