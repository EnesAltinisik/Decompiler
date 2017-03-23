package com.google.android.gms.internal;

import java.io.IOException;

public interface zzamn {

    public static final class zza extends zzamj {
        public String name;
        public zzb[] zzcat;

        public zza() {
            zzXe();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzamn_zza = (zza) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzamn_zza.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzamn_zza.name)) {
                return false;
            }
            return zzamh.equals(this.zzcat, com_google_android_gms_internal_zzamn_zza.zzcat);
        }

        public int hashCode() {
            return (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + zzamh.hashCode(this.zzcat);
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzW(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.name != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.name);
            }
            if (this.zzcat != null && this.zzcat.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzcat) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzW(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzcat == null ? 0 : this.zzcat.length;
                        Object obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcat, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzcat = obj;
                        continue;
                    default:
                        if (!zzamm.zzb(com_google_android_gms_internal_zzamb, zzWC)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public zza zzXe() {
            this.name = null;
            this.zzcat = zzb.zzXf();
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.name != null) {
                zzy += zzamc.zzr(1, this.name);
            }
            if (this.zzcat == null || this.zzcat.length <= 0) {
                return zzy;
            }
            int i = zzy;
            for (zzamj com_google_android_gms_internal_zzamj : this.zzcat) {
                if (com_google_android_gms_internal_zzamj != null) {
                    i += zzamc.zzc(2, com_google_android_gms_internal_zzamj);
                }
            }
            return i;
        }
    }

    public static final class zzb extends zzamj {
        private static volatile zzb[] zzcau;
        public String name;
        public Integer zzcav;
        public Boolean zzcaw;

        public zzb() {
            zzXg();
        }

        public static zzb[] zzXf() {
            if (zzcau == null) {
                synchronized (zzamh.zzcai) {
                    if (zzcau == null) {
                        zzcau = new zzb[0];
                    }
                }
            }
            return zzcau;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzamn_zzb = (zzb) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzamn_zzb.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzamn_zzb.name)) {
                return false;
            }
            if (this.zzcav == null) {
                if (com_google_android_gms_internal_zzamn_zzb.zzcav != null) {
                    return false;
                }
            } else if (!this.zzcav.equals(com_google_android_gms_internal_zzamn_zzb.zzcav)) {
                return false;
            }
            return this.zzcaw == null ? com_google_android_gms_internal_zzamn_zzb.zzcaw == null : this.zzcaw.equals(com_google_android_gms_internal_zzamn_zzb.zzcaw);
        }

        public int hashCode() {
            int i = 0;
            int intValue = ((this.zzcav == null ? 0 : this.zzcav.intValue()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.zzcaw != null) {
                i = this.zzcaw.hashCode();
            }
            return intValue + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzX(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.name != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.name);
            }
            if (this.zzcav != null) {
                com_google_android_gms_internal_zzamc.zzE(3, this.zzcav.intValue());
            }
            if (this.zzcaw != null) {
                com_google_android_gms_internal_zzamc.zzj(4, this.zzcaw.booleanValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzX(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                this.zzcav = Integer.valueOf(zzWC);
                                break;
                            default:
                                continue;
                        }
                    case 32:
                        this.zzcaw = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    default:
                        if (!zzamm.zzb(com_google_android_gms_internal_zzamb, zzWC)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public zzb zzXg() {
            this.name = null;
            this.zzcaw = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.name != null) {
                zzy += zzamc.zzr(1, this.name);
            }
            if (this.zzcav != null) {
                zzy += zzamc.zzG(3, this.zzcav.intValue());
            }
            return this.zzcaw != null ? zzy + zzamc.zzk(4, this.zzcaw.booleanValue()) : zzy;
        }
    }
}
