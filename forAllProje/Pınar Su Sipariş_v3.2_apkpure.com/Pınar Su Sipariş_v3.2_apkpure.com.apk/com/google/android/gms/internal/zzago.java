package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagq.zza;

public class zzago {
    private final zzahp zzbPo;
    private final zza zzbPt;
    private final zzahp zzbPu;
    private final zzahi zzbPv;
    private final zzahi zzbPw;

    private zzago(zza com_google_android_gms_internal_zzagq_zza, zzahp com_google_android_gms_internal_zzahp, zzahi com_google_android_gms_internal_zzahi, zzahi com_google_android_gms_internal_zzahi2, zzahp com_google_android_gms_internal_zzahp2) {
        this.zzbPt = com_google_android_gms_internal_zzagq_zza;
        this.zzbPo = com_google_android_gms_internal_zzahp;
        this.zzbPv = com_google_android_gms_internal_zzahi;
        this.zzbPw = com_google_android_gms_internal_zzahi2;
        this.zzbPu = com_google_android_gms_internal_zzahp2;
    }

    public static zzago zza(zzahi com_google_android_gms_internal_zzahi, zzahp com_google_android_gms_internal_zzahp) {
        return new zzago(zza.CHILD_ADDED, com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, null, null);
    }

    public static zzago zza(zzahi com_google_android_gms_internal_zzahi, zzahp com_google_android_gms_internal_zzahp, zzahp com_google_android_gms_internal_zzahp2) {
        return new zzago(zza.CHILD_CHANGED, com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, null, com_google_android_gms_internal_zzahp2);
    }

    public static zzago zza(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu2) {
        return zza(com_google_android_gms_internal_zzahi, zzahp.zzm(com_google_android_gms_internal_zzahu), zzahp.zzm(com_google_android_gms_internal_zzahu2));
    }

    public static zzago zza(zzahp com_google_android_gms_internal_zzahp) {
        return new zzago(zza.VALUE, com_google_android_gms_internal_zzahp, null, null, null);
    }

    public static zzago zzb(zzahi com_google_android_gms_internal_zzahi, zzahp com_google_android_gms_internal_zzahp) {
        return new zzago(zza.CHILD_REMOVED, com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, null, null);
    }

    public static zzago zzc(zzahi com_google_android_gms_internal_zzahi, zzahp com_google_android_gms_internal_zzahp) {
        return new zzago(zza.CHILD_MOVED, com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, null, null);
    }

    public static zzago zzc(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return zza(com_google_android_gms_internal_zzahi, zzahp.zzm(com_google_android_gms_internal_zzahu));
    }

    public static zzago zzd(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return zzb(com_google_android_gms_internal_zzahi, zzahp.zzm(com_google_android_gms_internal_zzahu));
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbPt);
        String valueOf2 = String.valueOf(this.zzbPv);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("Change: ").append(valueOf).append(" ").append(valueOf2).toString();
    }

    public zzahp zzSt() {
        return this.zzbPo;
    }

    public zzahi zzSv() {
        return this.zzbPv;
    }

    public zza zzSw() {
        return this.zzbPt;
    }

    public zzahi zzSx() {
        return this.zzbPw;
    }

    public zzahp zzSy() {
        return this.zzbPu;
    }

    public zzago zzg(zzahi com_google_android_gms_internal_zzahi) {
        return new zzago(this.zzbPt, this.zzbPo, this.zzbPv, com_google_android_gms_internal_zzahi, this.zzbPu);
    }
}
