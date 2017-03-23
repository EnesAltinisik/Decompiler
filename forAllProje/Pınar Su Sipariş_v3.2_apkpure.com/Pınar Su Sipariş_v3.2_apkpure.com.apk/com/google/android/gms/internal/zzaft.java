package com.google.android.gms.internal;

import com.google.android.gms.internal.zzafw.zza;

public class zzaft extends zzafw {
    private final boolean zzbOk;
    private final zzagi<Boolean> zzbOl;

    public zzaft(zzafa com_google_android_gms_internal_zzafa, zzagi<Boolean> com_google_android_gms_internal_zzagi_java_lang_Boolean, boolean z) {
        super(zza.AckUserWrite, zzafx.zzbOu, com_google_android_gms_internal_zzafa);
        this.zzbOl = com_google_android_gms_internal_zzagi_java_lang_Boolean;
        this.zzbOk = z;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[]{zzPn(), Boolean.valueOf(this.zzbOk), this.zzbOl});
    }

    public zzagi<Boolean> zzRW() {
        return this.zzbOl;
    }

    public boolean zzRX() {
        return this.zzbOk;
    }

    public zzafw zzc(zzahi com_google_android_gms_internal_zzahi) {
        if (!this.zzbHw.isEmpty()) {
            zzaiv.zzb(this.zzbHw.zzRt().equals(com_google_android_gms_internal_zzahi), "operationForChild called for unrelated child.");
            return new zzaft(this.zzbHw.zzRu(), this.zzbOl, this.zzbOk);
        } else if (this.zzbOl.getValue() != null) {
            zzaiv.zzb(this.zzbOl.zzSp().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new zzaft(zzafa.zzRq(), this.zzbOl.zzI(new zzafa(com_google_android_gms_internal_zzahi)), this.zzbOk);
        }
    }
}
