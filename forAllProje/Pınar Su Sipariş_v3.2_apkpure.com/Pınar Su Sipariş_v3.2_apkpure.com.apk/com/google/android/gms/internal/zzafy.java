package com.google.android.gms.internal;

import com.google.android.gms.internal.zzafw.zza;

public class zzafy extends zzafw {
    private final zzahu zzbOC;

    public zzafy(zzafx com_google_android_gms_internal_zzafx, zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        super(zza.Overwrite, com_google_android_gms_internal_zzafx, com_google_android_gms_internal_zzafa);
        this.zzbOC = com_google_android_gms_internal_zzahu;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[]{zzPn(), zzRZ(), this.zzbOC});
    }

    public zzahu zzSf() {
        return this.zzbOC;
    }

    public zzafw zzc(zzahi com_google_android_gms_internal_zzahi) {
        return this.zzbHw.isEmpty() ? new zzafy(this.zzbOo, zzafa.zzRq(), this.zzbOC.zzm(com_google_android_gms_internal_zzahi)) : new zzafy(this.zzbOo, this.zzbHw.zzRu(), this.zzbOC);
    }
}
