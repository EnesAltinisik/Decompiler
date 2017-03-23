package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzj;
import java.io.IOException;

public interface zzabr {

    public static final class zza extends zzamd<zza> {
        public long zzbvZ;
        public zzj zzbwa;
        public zzf zzjG;

        public zza() {
            zzMy();
        }

        public static zza zzD(byte[] bArr) throws zzami {
            return (zza) zzamj.mergeFrom(new zza(), bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzabr_zza = (zza) obj;
            if (this.zzbvZ != com_google_android_gms_internal_zzabr_zza.zzbvZ) {
                return false;
            }
            if (this.zzjG == null) {
                if (com_google_android_gms_internal_zzabr_zza.zzjG != null) {
                    return false;
                }
            } else if (!this.zzjG.equals(com_google_android_gms_internal_zzabr_zza.zzjG)) {
                return false;
            }
            if (this.zzbwa == null) {
                if (com_google_android_gms_internal_zzabr_zza.zzbwa != null) {
                    return false;
                }
            } else if (!this.zzbwa.equals(com_google_android_gms_internal_zzabr_zza.zzbwa)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzabr_zza.zzcaa == null || com_google_android_gms_internal_zzabr_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzabr_zza.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbwa == null ? 0 : this.zzbwa.hashCode()) + (((this.zzjG == null ? 0 : this.zzjG.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzbvZ ^ (this.zzbvZ >>> 32)))) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzJ(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            com_google_android_gms_internal_zzamc.zzb(1, this.zzbvZ);
            if (this.zzjG != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzjG);
            }
            if (this.zzbwa != null) {
                com_google_android_gms_internal_zzamc.zza(3, this.zzbwa);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzJ(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbvZ = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 18:
                        if (this.zzjG == null) {
                            this.zzjG = new zzf();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzjG);
                        continue;
                    case 26:
                        if (this.zzbwa == null) {
                            this.zzbwa = new zzj();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbwa);
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

        public zza zzMy() {
            this.zzbvZ = 0;
            this.zzjG = null;
            this.zzbwa = null;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy() + zzamc.zze(1, this.zzbvZ);
            if (this.zzjG != null) {
                zzy += zzamc.zzc(2, this.zzjG);
            }
            return this.zzbwa != null ? zzy + zzamc.zzc(3, this.zzbwa) : zzy;
        }
    }
}
