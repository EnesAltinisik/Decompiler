package com.google.android.gms.internal;

import java.io.IOException;

public interface zzso {

    public static final class zza extends zzamj {
        private static volatile zza[] zzbgI;
        public String name;
        public Boolean zzbgJ;
        public Boolean zzbgK;

        public zza() {
            zzGX();
        }

        public static zza[] zzGW() {
            if (zzbgI == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgI == null) {
                        zzbgI = new zza[0];
                    }
                }
            }
            return zzbgI;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzso_zza = (zza) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzso_zza.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzso_zza.name)) {
                return false;
            }
            if (this.zzbgJ == null) {
                if (com_google_android_gms_internal_zzso_zza.zzbgJ != null) {
                    return false;
                }
            } else if (!this.zzbgJ.equals(com_google_android_gms_internal_zzso_zza.zzbgJ)) {
                return false;
            }
            return this.zzbgK == null ? com_google_android_gms_internal_zzso_zza.zzbgK == null : this.zzbgK.equals(com_google_android_gms_internal_zzso_zza.zzbgK);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgJ == null ? 0 : this.zzbgJ.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.zzbgK != null) {
                i = this.zzbgK.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzz(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.name != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.name);
            }
            if (this.zzbgJ != null) {
                com_google_android_gms_internal_zzamc.zzj(2, this.zzbgJ.booleanValue());
            }
            if (this.zzbgK != null) {
                com_google_android_gms_internal_zzamc.zzj(3, this.zzbgK.booleanValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzGX() {
            this.name = null;
            this.zzbgJ = null;
            this.zzbgK = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.name != null) {
                zzy += zzamc.zzr(1, this.name);
            }
            if (this.zzbgJ != null) {
                zzy += zzamc.zzk(2, this.zzbgJ.booleanValue());
            }
            return this.zzbgK != null ? zzy + zzamc.zzk(3, this.zzbgK.booleanValue()) : zzy;
        }

        public zza zzz(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 16:
                        this.zzbgJ = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 24:
                        this.zzbgK = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
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
    }

    public static final class zzb extends zzamj {
        public String zzbbK;
        public Long zzbgL;
        public Integer zzbgM;
        public zzc[] zzbgN;
        public zza[] zzbgO;
        public com.google.android.gms.internal.zzsn.zza[] zzbgP;

        public zzb() {
            zzGY();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzso_zzb = (zzb) obj;
            if (this.zzbgL == null) {
                if (com_google_android_gms_internal_zzso_zzb.zzbgL != null) {
                    return false;
                }
            } else if (!this.zzbgL.equals(com_google_android_gms_internal_zzso_zzb.zzbgL)) {
                return false;
            }
            if (this.zzbbK == null) {
                if (com_google_android_gms_internal_zzso_zzb.zzbbK != null) {
                    return false;
                }
            } else if (!this.zzbbK.equals(com_google_android_gms_internal_zzso_zzb.zzbbK)) {
                return false;
            }
            if (this.zzbgM == null) {
                if (com_google_android_gms_internal_zzso_zzb.zzbgM != null) {
                    return false;
                }
            } else if (!this.zzbgM.equals(com_google_android_gms_internal_zzso_zzb.zzbgM)) {
                return false;
            }
            return !zzamh.equals(this.zzbgN, com_google_android_gms_internal_zzso_zzb.zzbgN) ? false : !zzamh.equals(this.zzbgO, com_google_android_gms_internal_zzso_zzb.zzbgO) ? false : zzamh.equals(this.zzbgP, com_google_android_gms_internal_zzso_zzb.zzbgP);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbbK == null ? 0 : this.zzbbK.hashCode()) + (((this.zzbgL == null ? 0 : this.zzbgL.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.zzbgM != null) {
                i = this.zzbgM.hashCode();
            }
            return ((((((hashCode + i) * 31) + zzamh.hashCode(this.zzbgN)) * 31) + zzamh.hashCode(this.zzbgO)) * 31) + zzamh.hashCode(this.zzbgP);
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzA(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzbgL != null) {
                com_google_android_gms_internal_zzamc.zzb(1, this.zzbgL.longValue());
            }
            if (this.zzbbK != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzbbK);
            }
            if (this.zzbgM != null) {
                com_google_android_gms_internal_zzamc.zzE(3, this.zzbgM.intValue());
            }
            if (this.zzbgN != null && this.zzbgN.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgN) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(4, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzbgO != null && this.zzbgO.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zzbgO) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        com_google_android_gms_internal_zzamc.zza(5, com_google_android_gms_internal_zzamj2);
                    }
                }
            }
            if (this.zzbgP != null && this.zzbgP.length > 0) {
                while (i < this.zzbgP.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zzbgP[i];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        com_google_android_gms_internal_zzamc.zza(6, com_google_android_gms_internal_zzamj3);
                    }
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzA(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbgL = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 18:
                        this.zzbbK = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        this.zzbgM = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 34:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 34);
                        zzWC = this.zzbgN == null ? 0 : this.zzbgN.length;
                        obj = new zzc[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgN, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzc();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzc();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgN = obj;
                        continue;
                    case 42:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 42);
                        zzWC = this.zzbgO == null ? 0 : this.zzbgO.length;
                        obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgO, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgO = obj;
                        continue;
                    case 50:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 50);
                        zzWC = this.zzbgP == null ? 0 : this.zzbgP.length;
                        obj = new com.google.android.gms.internal.zzsn.zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgP, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new com.google.android.gms.internal.zzsn.zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new com.google.android.gms.internal.zzsn.zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgP = obj;
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

        public zzb zzGY() {
            this.zzbgL = null;
            this.zzbbK = null;
            this.zzbgM = null;
            this.zzbgN = zzc.zzGZ();
            this.zzbgO = zza.zzGW();
            this.zzbgP = com.google.android.gms.internal.zzsn.zza.zzGM();
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int i;
            int i2 = 0;
            int zzy = super.zzy();
            if (this.zzbgL != null) {
                zzy += zzamc.zze(1, this.zzbgL.longValue());
            }
            if (this.zzbbK != null) {
                zzy += zzamc.zzr(2, this.zzbbK);
            }
            if (this.zzbgM != null) {
                zzy += zzamc.zzG(3, this.zzbgM.intValue());
            }
            if (this.zzbgN != null && this.zzbgN.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgN) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(4, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (this.zzbgO != null && this.zzbgO.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zzbgO) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        i += zzamc.zzc(5, com_google_android_gms_internal_zzamj2);
                    }
                }
                zzy = i;
            }
            if (this.zzbgP != null && this.zzbgP.length > 0) {
                while (i2 < this.zzbgP.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zzbgP[i2];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        zzy += zzamc.zzc(6, com_google_android_gms_internal_zzamj3);
                    }
                    i2++;
                }
            }
            return zzy;
        }
    }

    public static final class zzc extends zzamj {
        private static volatile zzc[] zzbgQ;
        public String value;
        public String zzaB;

        public zzc() {
            zzHa();
        }

        public static zzc[] zzGZ() {
            if (zzbgQ == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgQ == null) {
                        zzbgQ = new zzc[0];
                    }
                }
            }
            return zzbgQ;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzso_zzc = (zzc) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzso_zzc.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzso_zzc.zzaB)) {
                return false;
            }
            return this.value == null ? com_google_android_gms_internal_zzso_zzc.value == null : this.value.equals(com_google_android_gms_internal_zzso_zzc.value);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
            if (this.value != null) {
                i = this.value.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzB(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzaB != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.zzaB);
            }
            if (this.value != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.value);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzB(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.zzaB = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        this.value = com_google_android_gms_internal_zzamb.readString();
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

        public zzc zzHa() {
            this.zzaB = null;
            this.value = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzaB != null) {
                zzy += zzamc.zzr(1, this.zzaB);
            }
            return this.value != null ? zzy + zzamc.zzr(2, this.value) : zzy;
        }
    }
}
