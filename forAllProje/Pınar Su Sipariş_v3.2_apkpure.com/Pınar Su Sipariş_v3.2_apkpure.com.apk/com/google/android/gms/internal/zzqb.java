package com.google.android.gms.internal;

import java.io.IOException;

public final class zzqb extends zzamd<zzqb> {
    public int versionCode;
    public long zzazb;
    public String zzazd;
    public long zzaze;
    public int zzazf;

    public zzqb() {
        zzwF();
    }

    public static zzqb zzo(byte[] bArr) throws zzami {
        return (zzqb) zzamj.mergeFrom(new zzqb(), bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqb)) {
            return false;
        }
        zzqb com_google_android_gms_internal_zzqb = (zzqb) obj;
        if (this.versionCode != com_google_android_gms_internal_zzqb.versionCode) {
            return false;
        }
        if (this.zzazd == null) {
            if (com_google_android_gms_internal_zzqb.zzazd != null) {
                return false;
            }
        } else if (!this.zzazd.equals(com_google_android_gms_internal_zzqb.zzazd)) {
            return false;
        }
        return (this.zzaze == com_google_android_gms_internal_zzqb.zzaze && this.zzazb == com_google_android_gms_internal_zzqb.zzazb && this.zzazf == com_google_android_gms_internal_zzqb.zzazf) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzqb.zzcaa == null || com_google_android_gms_internal_zzqb.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzqb.zzcaa) : false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.zzazd == null ? 0 : this.zzazd.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.versionCode) * 31)) * 31) + ((int) (this.zzaze ^ (this.zzaze >>> 32)))) * 31) + ((int) (this.zzazb ^ (this.zzazb >>> 32)))) * 31) + this.zzazf) * 31;
        if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
            i = this.zzcaa.hashCode();
        }
        return hashCode + i;
    }

    public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        return zzm(com_google_android_gms_internal_zzamb);
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        com_google_android_gms_internal_zzamc.zzE(1, this.versionCode);
        com_google_android_gms_internal_zzamc.zzq(2, this.zzazd);
        com_google_android_gms_internal_zzamc.zzd(3, this.zzaze);
        com_google_android_gms_internal_zzamc.zzd(4, this.zzazb);
        if (this.zzazf != -1) {
            com_google_android_gms_internal_zzamc.zzE(5, this.zzazf);
        }
        super.writeTo(com_google_android_gms_internal_zzamc);
    }

    public zzqb zzm(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        while (true) {
            int zzWC = com_google_android_gms_internal_zzamb.zzWC();
            switch (zzWC) {
                case 0:
                    break;
                case 8:
                    this.versionCode = com_google_android_gms_internal_zzamb.zzWG();
                    continue;
                case 18:
                    this.zzazd = com_google_android_gms_internal_zzamb.readString();
                    continue;
                case 24:
                    this.zzaze = com_google_android_gms_internal_zzamb.zzWK();
                    continue;
                case 32:
                    this.zzazb = com_google_android_gms_internal_zzamb.zzWK();
                    continue;
                case 40:
                    this.zzazf = com_google_android_gms_internal_zzamb.zzWG();
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

    public zzqb zzwF() {
        this.versionCode = 1;
        this.zzazd = "";
        this.zzaze = -1;
        this.zzazb = -1;
        this.zzazf = -1;
        this.zzcaa = null;
        this.zzcaj = -1;
        return this;
    }

    protected int zzy() {
        int zzy = (((super.zzy() + zzamc.zzG(1, this.versionCode)) + zzamc.zzr(2, this.zzazd)) + zzamc.zzg(3, this.zzaze)) + zzamc.zzg(4, this.zzazb);
        return this.zzazf != -1 ? zzy + zzamc.zzG(5, this.zzazf) : zzy;
    }
}
