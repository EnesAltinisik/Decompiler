package com.google.android.gms.internal;

import java.io.IOException;

public final class zzqa extends zzamd<zzqa> {
    public int versionCode;
    public long zzaza;
    public long zzazb;
    public long zzazc;

    public zzqa() {
        zzwE();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqa)) {
            return false;
        }
        zzqa com_google_android_gms_internal_zzqa = (zzqa) obj;
        return (this.versionCode == com_google_android_gms_internal_zzqa.versionCode && this.zzaza == com_google_android_gms_internal_zzqa.zzaza && this.zzazb == com_google_android_gms_internal_zzqa.zzazb && this.zzazc == com_google_android_gms_internal_zzqa.zzazc) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzqa.zzcaa == null || com_google_android_gms_internal_zzqa.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzqa.zzcaa) : false;
    }

    public int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.versionCode) * 31) + ((int) (this.zzaza ^ (this.zzaza >>> 32)))) * 31) + ((int) (this.zzazb ^ (this.zzazb >>> 32)))) * 31) + ((int) (this.zzazc ^ (this.zzazc >>> 32)))) * 31;
        int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
        return hashCode2 + hashCode;
    }

    public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        return zzl(com_google_android_gms_internal_zzamb);
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        com_google_android_gms_internal_zzamc.zzE(1, this.versionCode);
        com_google_android_gms_internal_zzamc.zzd(2, this.zzaza);
        com_google_android_gms_internal_zzamc.zzd(3, this.zzazb);
        com_google_android_gms_internal_zzamc.zzd(4, this.zzazc);
        super.writeTo(com_google_android_gms_internal_zzamc);
    }

    public zzqa zzl(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        while (true) {
            int zzWC = com_google_android_gms_internal_zzamb.zzWC();
            switch (zzWC) {
                case 0:
                    break;
                case 8:
                    this.versionCode = com_google_android_gms_internal_zzamb.zzWG();
                    continue;
                case 16:
                    this.zzaza = com_google_android_gms_internal_zzamb.zzWK();
                    continue;
                case 24:
                    this.zzazb = com_google_android_gms_internal_zzamb.zzWK();
                    continue;
                case 32:
                    this.zzazc = com_google_android_gms_internal_zzamb.zzWK();
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

    public zzqa zzwE() {
        this.versionCode = 1;
        this.zzaza = -1;
        this.zzazb = -1;
        this.zzazc = -1;
        this.zzcaa = null;
        this.zzcaj = -1;
        return this;
    }

    protected int zzy() {
        return (((super.zzy() + zzamc.zzG(1, this.versionCode)) + zzamc.zzg(2, this.zzaza)) + zzamc.zzg(3, this.zzazb)) + zzamc.zzg(4, this.zzazc);
    }
}
