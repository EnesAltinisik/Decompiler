package com.google.android.gms.internal;

import java.io.IOException;

public interface zzag {

    public static final class zza extends zzamd<zza> {
        private static volatile zza[] zzjI;
        public int type;
        public String zzjJ;
        public zza[] zzjK;
        public zza[] zzjL;
        public zza[] zzjM;
        public String zzjN;
        public String zzjO;
        public long zzjP;
        public boolean zzjQ;
        public zza[] zzjR;
        public int[] zzjS;
        public boolean zzjT;

        public zza() {
            zzQ();
        }

        public static zza[] zzP() {
            if (zzjI == null) {
                synchronized (zzamh.zzcai) {
                    if (zzjI == null) {
                        zzjI = new zza[0];
                    }
                }
            }
            return zzjI;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzag_zza = (zza) obj;
            if (this.type != com_google_android_gms_internal_zzag_zza.type) {
                return false;
            }
            if (this.zzjJ == null) {
                if (com_google_android_gms_internal_zzag_zza.zzjJ != null) {
                    return false;
                }
            } else if (!this.zzjJ.equals(com_google_android_gms_internal_zzag_zza.zzjJ)) {
                return false;
            }
            if (!zzamh.equals(this.zzjK, com_google_android_gms_internal_zzag_zza.zzjK) || !zzamh.equals(this.zzjL, com_google_android_gms_internal_zzag_zza.zzjL) || !zzamh.equals(this.zzjM, com_google_android_gms_internal_zzag_zza.zzjM)) {
                return false;
            }
            if (this.zzjN == null) {
                if (com_google_android_gms_internal_zzag_zza.zzjN != null) {
                    return false;
                }
            } else if (!this.zzjN.equals(com_google_android_gms_internal_zzag_zza.zzjN)) {
                return false;
            }
            if (this.zzjO == null) {
                if (com_google_android_gms_internal_zzag_zza.zzjO != null) {
                    return false;
                }
            } else if (!this.zzjO.equals(com_google_android_gms_internal_zzag_zza.zzjO)) {
                return false;
            }
            return (this.zzjP == com_google_android_gms_internal_zzag_zza.zzjP && this.zzjQ == com_google_android_gms_internal_zzag_zza.zzjQ && zzamh.equals(this.zzjR, com_google_android_gms_internal_zzag_zza.zzjR) && zzamh.equals(this.zzjS, com_google_android_gms_internal_zzag_zza.zzjS) && this.zzjT == com_google_android_gms_internal_zzag_zza.zzjT) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzag_zza.zzcaa == null || com_google_android_gms_internal_zzag_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzag_zza.zzcaa) : false;
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            int hashCode = ((((((this.zzjQ ? 1231 : 1237) + (((((this.zzjO == null ? 0 : this.zzjO.hashCode()) + (((this.zzjN == null ? 0 : this.zzjN.hashCode()) + (((((((((this.zzjJ == null ? 0 : this.zzjJ.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.type) * 31)) * 31) + zzamh.hashCode(this.zzjK)) * 31) + zzamh.hashCode(this.zzjL)) * 31) + zzamh.hashCode(this.zzjM)) * 31)) * 31)) * 31) + ((int) (this.zzjP ^ (this.zzjP >>> 32)))) * 31)) * 31) + zzamh.hashCode(this.zzjR)) * 31) + zzamh.hashCode(this.zzjS)) * 31;
            if (!this.zzjT) {
                i = 1237;
            }
            hashCode = (hashCode + i) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i2 = this.zzcaa.hashCode();
            }
            return hashCode + i2;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzk(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            com_google_android_gms_internal_zzamc.zzE(1, this.type);
            if (!this.zzjJ.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzjJ);
            }
            if (this.zzjK != null && this.zzjK.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzjK) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzjL != null && this.zzjL.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zzjL) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        com_google_android_gms_internal_zzamc.zza(4, com_google_android_gms_internal_zzamj2);
                    }
                }
            }
            if (this.zzjM != null && this.zzjM.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj22 : this.zzjM) {
                    if (com_google_android_gms_internal_zzamj22 != null) {
                        com_google_android_gms_internal_zzamc.zza(5, com_google_android_gms_internal_zzamj22);
                    }
                }
            }
            if (!this.zzjN.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(6, this.zzjN);
            }
            if (!this.zzjO.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(7, this.zzjO);
            }
            if (this.zzjP != 0) {
                com_google_android_gms_internal_zzamc.zzb(8, this.zzjP);
            }
            if (this.zzjT) {
                com_google_android_gms_internal_zzamc.zzj(9, this.zzjT);
            }
            if (this.zzjS != null && this.zzjS.length > 0) {
                for (int zzE : this.zzjS) {
                    com_google_android_gms_internal_zzamc.zzE(10, zzE);
                }
            }
            if (this.zzjR != null && this.zzjR.length > 0) {
                while (i < this.zzjR.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zzjR[i];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        com_google_android_gms_internal_zzamc.zza(11, com_google_android_gms_internal_zzamj3);
                    }
                    i++;
                }
            }
            if (this.zzjQ) {
                com_google_android_gms_internal_zzamc.zzj(12, this.zzjQ);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzQ() {
            this.type = 1;
            this.zzjJ = "";
            this.zzjK = zzP();
            this.zzjL = zzP();
            this.zzjM = zzP();
            this.zzjN = "";
            this.zzjO = "";
            this.zzjP = 0;
            this.zzjQ = false;
            this.zzjR = zzP();
            this.zzjS = zzamm.zzcal;
            this.zzjT = false;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zza zzk(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                int i;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.type = zzWC;
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.zzjJ = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 26:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zzjK == null ? 0 : this.zzjK.length;
                        obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjK, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzjK = obj;
                        continue;
                    case 34:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 34);
                        zzWC = this.zzjL == null ? 0 : this.zzjL.length;
                        obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjL, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzjL = obj;
                        continue;
                    case 42:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 42);
                        zzWC = this.zzjM == null ? 0 : this.zzjM.length;
                        obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjM, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzjM = obj;
                        continue;
                    case 50:
                        this.zzjN = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 58:
                        this.zzjO = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 64:
                        this.zzjP = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 72:
                        this.zzjT = com_google_android_gms_internal_zzamb.zzWI();
                        continue;
                    case 80:
                        int zzc2 = zzamm.zzc(com_google_android_gms_internal_zzamb, 80);
                        Object obj2 = new int[zzc2];
                        i = 0;
                        zzc = 0;
                        while (i < zzc2) {
                            if (i != 0) {
                                com_google_android_gms_internal_zzamb.zzWC();
                            }
                            int zzWG = com_google_android_gms_internal_zzamb.zzWG();
                            switch (zzWG) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                    zzWC = zzc + 1;
                                    obj2[zzc] = zzWG;
                                    break;
                                default:
                                    zzWC = zzc;
                                    break;
                            }
                            i++;
                            zzc = zzWC;
                        }
                        if (zzc != 0) {
                            zzWC = this.zzjS == null ? 0 : this.zzjS.length;
                            if (zzWC != 0 || zzc != zzc2) {
                                Object obj3 = new int[(zzWC + zzc)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzjS, 0, obj3, 0, zzWC);
                                }
                                System.arraycopy(obj2, 0, obj3, zzWC, zzc);
                                this.zzjS = obj3;
                                break;
                            }
                            this.zzjS = obj2;
                            break;
                        }
                        continue;
                    case 82:
                        i = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            switch (com_google_android_gms_internal_zzamb.zzWG()) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                    zzWC++;
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (zzWC != 0) {
                            com_google_android_gms_internal_zzamb.zznY(zzc);
                            zzc = this.zzjS == null ? 0 : this.zzjS.length;
                            Object obj4 = new int[(zzWC + zzc)];
                            if (zzc != 0) {
                                System.arraycopy(this.zzjS, 0, obj4, 0, zzc);
                            }
                            while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                                int zzWG2 = com_google_android_gms_internal_zzamb.zzWG();
                                switch (zzWG2) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                        zzWC = zzc + 1;
                                        obj4[zzc] = zzWG2;
                                        zzc = zzWC;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.zzjS = obj4;
                        }
                        com_google_android_gms_internal_zzamb.zznX(i);
                        continue;
                    case 90:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 90);
                        zzWC = this.zzjR == null ? 0 : this.zzjR.length;
                        obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjR, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzjR = obj;
                        continue;
                    case 96:
                        this.zzjQ = com_google_android_gms_internal_zzamb.zzWI();
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

        protected int zzy() {
            int i;
            int i2 = 0;
            int zzy = super.zzy() + zzamc.zzG(1, this.type);
            if (!this.zzjJ.equals("")) {
                zzy += zzamc.zzr(2, this.zzjJ);
            }
            if (this.zzjK != null && this.zzjK.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zzjK) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(3, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (this.zzjL != null && this.zzjL.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zzjL) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        i += zzamc.zzc(4, com_google_android_gms_internal_zzamj2);
                    }
                }
                zzy = i;
            }
            if (this.zzjM != null && this.zzjM.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj22 : this.zzjM) {
                    if (com_google_android_gms_internal_zzamj22 != null) {
                        i += zzamc.zzc(5, com_google_android_gms_internal_zzamj22);
                    }
                }
                zzy = i;
            }
            if (!this.zzjN.equals("")) {
                zzy += zzamc.zzr(6, this.zzjN);
            }
            if (!this.zzjO.equals("")) {
                zzy += zzamc.zzr(7, this.zzjO);
            }
            if (this.zzjP != 0) {
                zzy += zzamc.zze(8, this.zzjP);
            }
            if (this.zzjT) {
                zzy += zzamc.zzk(9, this.zzjT);
            }
            if (this.zzjS != null && this.zzjS.length > 0) {
                int i3 = 0;
                for (int zzoc : this.zzjS) {
                    i3 += zzamc.zzoc(zzoc);
                }
                zzy = (zzy + i3) + (this.zzjS.length * 1);
            }
            if (this.zzjR != null && this.zzjR.length > 0) {
                while (i2 < this.zzjR.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zzjR[i2];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        zzy += zzamc.zzc(11, com_google_android_gms_internal_zzamj3);
                    }
                    i2++;
                }
            }
            return this.zzjQ ? zzy + zzamc.zzk(12, this.zzjQ) : zzy;
        }
    }
}
