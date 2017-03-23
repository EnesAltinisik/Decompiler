package com.google.android.gms.internal;

import java.io.IOException;

public final class zzqc extends zzamd<zzqc> {
    public long zzazb;
    public long zzaze;

    public zzqc() {
        zzwG();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqc)) {
            return false;
        }
        zzqc com_google_android_gms_internal_zzqc = (zzqc) obj;
        return (this.zzaze == com_google_android_gms_internal_zzqc.zzaze && this.zzazb == com_google_android_gms_internal_zzqc.zzazb) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzqc.zzcaa == null || com_google_android_gms_internal_zzqc.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzqc.zzcaa) : false;
    }

    public int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzaze ^ (this.zzaze >>> 32)))) * 31) + ((int) (this.zzazb ^ (this.zzazb >>> 32)))) * 31;
        int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
        return hashCode2 + hashCode;
    }

    public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        return zzn(com_google_android_gms_internal_zzamb);
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        com_google_android_gms_internal_zzamc.zzd(1, this.zzaze);
        com_google_android_gms_internal_zzamc.zzd(2, this.zzazb);
        super.writeTo(com_google_android_gms_internal_zzamc);
    }

    public zzqc zzn(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        while (true) {
            int zzWC = com_google_android_gms_internal_zzamb.zzWC();
            switch (zzWC) {
                case 0:
                    break;
                case 8:
                    this.zzaze = com_google_android_gms_internal_zzamb.zzWK();
                    continue;
                case 16:
                    this.zzazb = com_google_android_gms_internal_zzamb.zzWK();
                    continue;
                default:
                    if (!super.zza(com_google_android_gms_internal_zzamb, zzWC)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public zzqc zzwG() {
        this.zzaze = -1;
        this.zzazb = -1;
        this.zzcaa = null;
        this.zzcaj = -1;
        return this;
    }

    protected int zzy() {
        return (super.zzy() + zzamc.zzg(1, this.zzaze)) + zzamc.zzg(2, this.zzazb);
    }
}
