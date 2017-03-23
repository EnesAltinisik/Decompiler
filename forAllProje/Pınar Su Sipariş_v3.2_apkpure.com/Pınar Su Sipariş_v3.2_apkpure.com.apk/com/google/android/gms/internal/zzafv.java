package com.google.android.gms.internal;

import com.google.android.gms.internal.zzafw.zza;

public class zzafv extends zzafw {
    private final zzaes zzbOm;

    public zzafv(zzafx com_google_android_gms_internal_zzafx, zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        super(zza.Merge, com_google_android_gms_internal_zzafx, com_google_android_gms_internal_zzafa);
        this.zzbOm = com_google_android_gms_internal_zzaes;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", new Object[]{zzPn(), zzRZ(), this.zzbOm});
    }

    public zzaes zzRY() {
        return this.zzbOm;
    }

    public zzafw zzc(zzahi com_google_android_gms_internal_zzahi) {
        if (!this.zzbHw.isEmpty()) {
            return this.zzbHw.zzRt().equals(com_google_android_gms_internal_zzahi) ? new zzafv(this.zzbOo, this.zzbHw.zzRu(), this.zzbOm) : null;
        } else {
            zzaes zzg = this.zzbOm.zzg(new zzafa(com_google_android_gms_internal_zzahi));
            return zzg.isEmpty() ? null : zzg.zzQO() != null ? new zzafy(this.zzbOo, zzafa.zzRq(), zzg.zzQO()) : new zzafv(this.zzbOo, zzafa.zzRq(), zzg);
        }
    }
}
