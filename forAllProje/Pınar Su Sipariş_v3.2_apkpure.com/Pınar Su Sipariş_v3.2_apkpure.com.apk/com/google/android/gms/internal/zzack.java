package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public final class zzack extends zzamd<zzack> {
    public zza[] zzbEg;

    public static final class zza extends zzamd<zza> {
        private static volatile zza[] zzbEh;
        public String name;
        public zza zzbEi;

        public static final class zza extends zzamd<zza> {
            private static volatile zza[] zzbEj;
            public int type;
            public zza zzbEk;

            public static final class zza extends zzamd<zza> {
                public byte[] zzbEl;
                public String zzbEm;
                public double zzbEn;
                public float zzbEo;
                public long zzbEp;
                public int zzbEq;
                public int zzbEr;
                public boolean zzbEs;
                public zza[] zzbEt;
                public zza[] zzbEu;
                public String[] zzbEv;
                public long[] zzbEw;
                public float[] zzbEx;
                public long zzbEy;

                public zza() {
                    zzNQ();
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof zza)) {
                        return false;
                    }
                    zza com_google_android_gms_internal_zzack_zza_zza_zza = (zza) obj;
                    if (!Arrays.equals(this.zzbEl, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEl)) {
                        return false;
                    }
                    if (this.zzbEm == null) {
                        if (com_google_android_gms_internal_zzack_zza_zza_zza.zzbEm != null) {
                            return false;
                        }
                    } else if (!this.zzbEm.equals(com_google_android_gms_internal_zzack_zza_zza_zza.zzbEm)) {
                        return false;
                    }
                    return (Double.doubleToLongBits(this.zzbEn) == Double.doubleToLongBits(com_google_android_gms_internal_zzack_zza_zza_zza.zzbEn) && Float.floatToIntBits(this.zzbEo) == Float.floatToIntBits(com_google_android_gms_internal_zzack_zza_zza_zza.zzbEo) && this.zzbEp == com_google_android_gms_internal_zzack_zza_zza_zza.zzbEp && this.zzbEq == com_google_android_gms_internal_zzack_zza_zza_zza.zzbEq && this.zzbEr == com_google_android_gms_internal_zzack_zza_zza_zza.zzbEr && this.zzbEs == com_google_android_gms_internal_zzack_zza_zza_zza.zzbEs && zzamh.equals(this.zzbEt, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEt) && zzamh.equals(this.zzbEu, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEu) && zzamh.equals(this.zzbEv, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEv) && zzamh.equals(this.zzbEw, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEw) && zzamh.equals(this.zzbEx, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEx) && this.zzbEy == com_google_android_gms_internal_zzack_zza_zza_zza.zzbEy) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzack_zza_zza_zza.zzcaa == null || com_google_android_gms_internal_zzack_zza_zza_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzack_zza_zza_zza.zzcaa) : false;
                }

                public int hashCode() {
                    int i = 0;
                    int hashCode = (this.zzbEm == null ? 0 : this.zzbEm.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.zzbEl)) * 31);
                    long doubleToLongBits = Double.doubleToLongBits(this.zzbEn);
                    hashCode = ((((((((((((((this.zzbEs ? 1231 : 1237) + (((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.zzbEo)) * 31) + ((int) (this.zzbEp ^ (this.zzbEp >>> 32)))) * 31) + this.zzbEq) * 31) + this.zzbEr) * 31)) * 31) + zzamh.hashCode(this.zzbEt)) * 31) + zzamh.hashCode(this.zzbEu)) * 31) + zzamh.hashCode(this.zzbEv)) * 31) + zzamh.hashCode(this.zzbEw)) * 31) + zzamh.hashCode(this.zzbEx)) * 31) + ((int) (this.zzbEy ^ (this.zzbEy >>> 32)))) * 31;
                    if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                        i = this.zzcaa.hashCode();
                    }
                    return hashCode + i;
                }

                public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                    return zzN(com_google_android_gms_internal_zzamb);
                }

                public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
                    int i = 0;
                    if (!Arrays.equals(this.zzbEl, zzamm.zzcas)) {
                        com_google_android_gms_internal_zzamc.zza(1, this.zzbEl);
                    }
                    if (!this.zzbEm.equals("")) {
                        com_google_android_gms_internal_zzamc.zzq(2, this.zzbEm);
                    }
                    if (Double.doubleToLongBits(this.zzbEn) != Double.doubleToLongBits(0.0d)) {
                        com_google_android_gms_internal_zzamc.zza(3, this.zzbEn);
                    }
                    if (Float.floatToIntBits(this.zzbEo) != Float.floatToIntBits(0.0f)) {
                        com_google_android_gms_internal_zzamc.zzb(4, this.zzbEo);
                    }
                    if (this.zzbEp != 0) {
                        com_google_android_gms_internal_zzamc.zzb(5, this.zzbEp);
                    }
                    if (this.zzbEq != 0) {
                        com_google_android_gms_internal_zzamc.zzE(6, this.zzbEq);
                    }
                    if (this.zzbEr != 0) {
                        com_google_android_gms_internal_zzamc.zzF(7, this.zzbEr);
                    }
                    if (this.zzbEs) {
                        com_google_android_gms_internal_zzamc.zzj(8, this.zzbEs);
                    }
                    if (this.zzbEt != null && this.zzbEt.length > 0) {
                        for (zzamj com_google_android_gms_internal_zzamj : this.zzbEt) {
                            if (com_google_android_gms_internal_zzamj != null) {
                                com_google_android_gms_internal_zzamc.zza(9, com_google_android_gms_internal_zzamj);
                            }
                        }
                    }
                    if (this.zzbEu != null && this.zzbEu.length > 0) {
                        for (zzamj com_google_android_gms_internal_zzamj2 : this.zzbEu) {
                            if (com_google_android_gms_internal_zzamj2 != null) {
                                com_google_android_gms_internal_zzamc.zza(10, com_google_android_gms_internal_zzamj2);
                            }
                        }
                    }
                    if (this.zzbEv != null && this.zzbEv.length > 0) {
                        for (String str : this.zzbEv) {
                            if (str != null) {
                                com_google_android_gms_internal_zzamc.zzq(11, str);
                            }
                        }
                    }
                    if (this.zzbEw != null && this.zzbEw.length > 0) {
                        for (long zzb : this.zzbEw) {
                            com_google_android_gms_internal_zzamc.zzb(12, zzb);
                        }
                    }
                    if (this.zzbEy != 0) {
                        com_google_android_gms_internal_zzamc.zzb(13, this.zzbEy);
                    }
                    if (this.zzbEx != null && this.zzbEx.length > 0) {
                        while (i < this.zzbEx.length) {
                            com_google_android_gms_internal_zzamc.zzb(14, this.zzbEx[i]);
                            i++;
                        }
                    }
                    super.writeTo(com_google_android_gms_internal_zzamc);
                }

                public zza zzN(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                    while (true) {
                        int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                        int zzc;
                        Object obj;
                        int zznW;
                        switch (zzWC) {
                            case 0:
                                break;
                            case 10:
                                this.zzbEl = com_google_android_gms_internal_zzamb.readBytes();
                                continue;
                            case 18:
                                this.zzbEm = com_google_android_gms_internal_zzamb.readString();
                                continue;
                            case 25:
                                this.zzbEn = com_google_android_gms_internal_zzamb.readDouble();
                                continue;
                            case 37:
                                this.zzbEo = com_google_android_gms_internal_zzamb.readFloat();
                                continue;
                            case 40:
                                this.zzbEp = com_google_android_gms_internal_zzamb.zzWF();
                                continue;
                            case 48:
                                this.zzbEq = com_google_android_gms_internal_zzamb.zzWG();
                                continue;
                            case 56:
                                this.zzbEr = com_google_android_gms_internal_zzamb.zzWJ();
                                continue;
                            case 64:
                                this.zzbEs = com_google_android_gms_internal_zzamb.zzWI();
                                continue;
                            case 74:
                                zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 74);
                                zzWC = this.zzbEt == null ? 0 : this.zzbEt.length;
                                obj = new zza[(zzc + zzWC)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzbEt, 0, obj, 0, zzWC);
                                }
                                while (zzWC < obj.length - 1) {
                                    obj[zzWC] = new zza();
                                    com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                                    com_google_android_gms_internal_zzamb.zzWC();
                                    zzWC++;
                                }
                                obj[zzWC] = new zza();
                                com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                                this.zzbEt = obj;
                                continue;
                            case 82:
                                zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 82);
                                zzWC = this.zzbEu == null ? 0 : this.zzbEu.length;
                                obj = new zza[(zzc + zzWC)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzbEu, 0, obj, 0, zzWC);
                                }
                                while (zzWC < obj.length - 1) {
                                    obj[zzWC] = new zza();
                                    com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                                    com_google_android_gms_internal_zzamb.zzWC();
                                    zzWC++;
                                }
                                obj[zzWC] = new zza();
                                com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                                this.zzbEu = obj;
                                continue;
                            case 90:
                                zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 90);
                                zzWC = this.zzbEv == null ? 0 : this.zzbEv.length;
                                obj = new String[(zzc + zzWC)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzbEv, 0, obj, 0, zzWC);
                                }
                                while (zzWC < obj.length - 1) {
                                    obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                                    com_google_android_gms_internal_zzamb.zzWC();
                                    zzWC++;
                                }
                                obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                                this.zzbEv = obj;
                                continue;
                            case 96:
                                zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 96);
                                zzWC = this.zzbEw == null ? 0 : this.zzbEw.length;
                                obj = new long[(zzc + zzWC)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzbEw, 0, obj, 0, zzWC);
                                }
                                while (zzWC < obj.length - 1) {
                                    obj[zzWC] = com_google_android_gms_internal_zzamb.zzWF();
                                    com_google_android_gms_internal_zzamb.zzWC();
                                    zzWC++;
                                }
                                obj[zzWC] = com_google_android_gms_internal_zzamb.zzWF();
                                this.zzbEw = obj;
                                continue;
                            case 98:
                                zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                                zzc = com_google_android_gms_internal_zzamb.getPosition();
                                zzWC = 0;
                                while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                                    com_google_android_gms_internal_zzamb.zzWF();
                                    zzWC++;
                                }
                                com_google_android_gms_internal_zzamb.zznY(zzc);
                                zzc = this.zzbEw == null ? 0 : this.zzbEw.length;
                                Object obj2 = new long[(zzWC + zzc)];
                                if (zzc != 0) {
                                    System.arraycopy(this.zzbEw, 0, obj2, 0, zzc);
                                }
                                while (zzc < obj2.length) {
                                    obj2[zzc] = com_google_android_gms_internal_zzamb.zzWF();
                                    zzc++;
                                }
                                this.zzbEw = obj2;
                                com_google_android_gms_internal_zzamb.zznX(zznW);
                                continue;
                            case 104:
                                this.zzbEy = com_google_android_gms_internal_zzamb.zzWF();
                                continue;
                            case 114:
                                zzWC = com_google_android_gms_internal_zzamb.zzWL();
                                zzc = com_google_android_gms_internal_zzamb.zznW(zzWC);
                                zznW = zzWC / 4;
                                zzWC = this.zzbEx == null ? 0 : this.zzbEx.length;
                                Object obj3 = new float[(zznW + zzWC)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzbEx, 0, obj3, 0, zzWC);
                                }
                                while (zzWC < obj3.length) {
                                    obj3[zzWC] = com_google_android_gms_internal_zzamb.readFloat();
                                    zzWC++;
                                }
                                this.zzbEx = obj3;
                                com_google_android_gms_internal_zzamb.zznX(zzc);
                                continue;
                            case 117:
                                zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 117);
                                zzWC = this.zzbEx == null ? 0 : this.zzbEx.length;
                                obj = new float[(zzc + zzWC)];
                                if (zzWC != 0) {
                                    System.arraycopy(this.zzbEx, 0, obj, 0, zzWC);
                                }
                                while (zzWC < obj.length - 1) {
                                    obj[zzWC] = com_google_android_gms_internal_zzamb.readFloat();
                                    com_google_android_gms_internal_zzamb.zzWC();
                                    zzWC++;
                                }
                                obj[zzWC] = com_google_android_gms_internal_zzamb.readFloat();
                                this.zzbEx = obj;
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

                public zza zzNQ() {
                    this.zzbEl = zzamm.zzcas;
                    this.zzbEm = "";
                    this.zzbEn = 0.0d;
                    this.zzbEo = 0.0f;
                    this.zzbEp = 0;
                    this.zzbEq = 0;
                    this.zzbEr = 0;
                    this.zzbEs = false;
                    this.zzbEt = zza.zzNM();
                    this.zzbEu = zza.zzNO();
                    this.zzbEv = zzamm.zzcaq;
                    this.zzbEw = zzamm.zzcam;
                    this.zzbEx = zzamm.zzcan;
                    this.zzbEy = 0;
                    this.zzcaa = null;
                    this.zzcaj = -1;
                    return this;
                }

                protected int zzy() {
                    int i;
                    int i2 = 0;
                    int zzy = super.zzy();
                    if (!Arrays.equals(this.zzbEl, zzamm.zzcas)) {
                        zzy += zzamc.zzb(1, this.zzbEl);
                    }
                    if (!this.zzbEm.equals("")) {
                        zzy += zzamc.zzr(2, this.zzbEm);
                    }
                    if (Double.doubleToLongBits(this.zzbEn) != Double.doubleToLongBits(0.0d)) {
                        zzy += zzamc.zzb(3, this.zzbEn);
                    }
                    if (Float.floatToIntBits(this.zzbEo) != Float.floatToIntBits(0.0f)) {
                        zzy += zzamc.zzc(4, this.zzbEo);
                    }
                    if (this.zzbEp != 0) {
                        zzy += zzamc.zze(5, this.zzbEp);
                    }
                    if (this.zzbEq != 0) {
                        zzy += zzamc.zzG(6, this.zzbEq);
                    }
                    if (this.zzbEr != 0) {
                        zzy += zzamc.zzH(7, this.zzbEr);
                    }
                    if (this.zzbEs) {
                        zzy += zzamc.zzk(8, this.zzbEs);
                    }
                    if (this.zzbEt != null && this.zzbEt.length > 0) {
                        i = zzy;
                        for (zzamj com_google_android_gms_internal_zzamj : this.zzbEt) {
                            if (com_google_android_gms_internal_zzamj != null) {
                                i += zzamc.zzc(9, com_google_android_gms_internal_zzamj);
                            }
                        }
                        zzy = i;
                    }
                    if (this.zzbEu != null && this.zzbEu.length > 0) {
                        i = zzy;
                        for (zzamj com_google_android_gms_internal_zzamj2 : this.zzbEu) {
                            if (com_google_android_gms_internal_zzamj2 != null) {
                                i += zzamc.zzc(10, com_google_android_gms_internal_zzamj2);
                            }
                        }
                        zzy = i;
                    }
                    if (this.zzbEv != null && this.zzbEv.length > 0) {
                        int i3 = 0;
                        int i4 = 0;
                        for (String str : this.zzbEv) {
                            if (str != null) {
                                i4++;
                                i3 += zzamc.zziZ(str);
                            }
                        }
                        zzy = (zzy + i3) + (i4 * 1);
                    }
                    if (this.zzbEw != null && this.zzbEw.length > 0) {
                        i = 0;
                        while (i2 < this.zzbEw.length) {
                            i += zzamc.zzaU(this.zzbEw[i2]);
                            i2++;
                        }
                        zzy = (zzy + i) + (this.zzbEw.length * 1);
                    }
                    if (this.zzbEy != 0) {
                        zzy += zzamc.zze(13, this.zzbEy);
                    }
                    return (this.zzbEx == null || this.zzbEx.length <= 0) ? zzy : (zzy + (this.zzbEx.length * 4)) + (this.zzbEx.length * 1);
                }
            }

            public zza() {
                zzNP();
            }

            public static zza[] zzNO() {
                if (zzbEj == null) {
                    synchronized (zzamh.zzcai) {
                        if (zzbEj == null) {
                            zzbEj = new zza[0];
                        }
                    }
                }
                return zzbEj;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza com_google_android_gms_internal_zzack_zza_zza = (zza) obj;
                if (this.type != com_google_android_gms_internal_zzack_zza_zza.type) {
                    return false;
                }
                if (this.zzbEk == null) {
                    if (com_google_android_gms_internal_zzack_zza_zza.zzbEk != null) {
                        return false;
                    }
                } else if (!this.zzbEk.equals(com_google_android_gms_internal_zzack_zza_zza.zzbEk)) {
                    return false;
                }
                return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzack_zza_zza.zzcaa == null || com_google_android_gms_internal_zzack_zza_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzack_zza_zza.zzcaa);
            }

            public int hashCode() {
                int i = 0;
                int hashCode = ((this.zzbEk == null ? 0 : this.zzbEk.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.type) * 31)) * 31;
                if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                    i = this.zzcaa.hashCode();
                }
                return hashCode + i;
            }

            public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                return zzM(com_google_android_gms_internal_zzamb);
            }

            public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
                com_google_android_gms_internal_zzamc.zzE(1, this.type);
                if (this.zzbEk != null) {
                    com_google_android_gms_internal_zzamc.zza(2, this.zzbEk);
                }
                super.writeTo(com_google_android_gms_internal_zzamc);
            }

            public zza zzM(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                while (true) {
                    int zzWC = com_google_android_gms_internal_zzamb.zzWC();
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
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    this.type = zzWC;
                                    break;
                                default:
                                    continue;
                            }
                        case 18:
                            if (this.zzbEk == null) {
                                this.zzbEk = new zza();
                            }
                            com_google_android_gms_internal_zzamb.zza(this.zzbEk);
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

            public zza zzNP() {
                this.type = 1;
                this.zzbEk = null;
                this.zzcaa = null;
                this.zzcaj = -1;
                return this;
            }

            protected int zzy() {
                int zzy = super.zzy() + zzamc.zzG(1, this.type);
                return this.zzbEk != null ? zzy + zzamc.zzc(2, this.zzbEk) : zzy;
            }
        }

        public zza() {
            zzNN();
        }

        public static zza[] zzNM() {
            if (zzbEh == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbEh == null) {
                        zzbEh = new zza[0];
                    }
                }
            }
            return zzbEh;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzack_zza = (zza) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzack_zza.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzack_zza.name)) {
                return false;
            }
            if (this.zzbEi == null) {
                if (com_google_android_gms_internal_zzack_zza.zzbEi != null) {
                    return false;
                }
            } else if (!this.zzbEi.equals(com_google_android_gms_internal_zzack_zza.zzbEi)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzack_zza.zzcaa == null || com_google_android_gms_internal_zzack_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzack_zza.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbEi == null ? 0 : this.zzbEi.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzL(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            com_google_android_gms_internal_zzamc.zzq(1, this.name);
            if (this.zzbEi != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzbEi);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzL(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        if (this.zzbEi == null) {
                            this.zzbEi = new zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbEi);
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

        public zza zzNN() {
            this.name = "";
            this.zzbEi = null;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy() + zzamc.zzr(1, this.name);
            return this.zzbEi != null ? zzy + zzamc.zzc(2, this.zzbEi) : zzy;
        }
    }

    public zzack() {
        zzNL();
    }

    public static zzack zzF(byte[] bArr) throws zzami {
        return (zzack) zzamj.mergeFrom(new zzack(), bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzack)) {
            return false;
        }
        zzack com_google_android_gms_internal_zzack = (zzack) obj;
        return zzamh.equals(this.zzbEg, com_google_android_gms_internal_zzack.zzbEg) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzack.zzcaa == null || com_google_android_gms_internal_zzack.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzack.zzcaa) : false;
    }

    public int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzbEg)) * 31;
        int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
        return hashCode2 + hashCode;
    }

    public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        return zzK(com_google_android_gms_internal_zzamb);
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        if (this.zzbEg != null && this.zzbEg.length > 0) {
            for (zzamj com_google_android_gms_internal_zzamj : this.zzbEg) {
                if (com_google_android_gms_internal_zzamj != null) {
                    com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                }
            }
        }
        super.writeTo(com_google_android_gms_internal_zzamc);
    }

    public zzack zzK(zzamb com_google_android_gms_internal_zzamb) throws IOException {
        while (true) {
            int zzWC = com_google_android_gms_internal_zzamb.zzWC();
            switch (zzWC) {
                case 0:
                    break;
                case 10:
                    int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                    zzWC = this.zzbEg == null ? 0 : this.zzbEg.length;
                    Object obj = new zza[(zzc + zzWC)];
                    if (zzWC != 0) {
                        System.arraycopy(this.zzbEg, 0, obj, 0, zzWC);
                    }
                    while (zzWC < obj.length - 1) {
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        com_google_android_gms_internal_zzamb.zzWC();
                        zzWC++;
                    }
                    obj[zzWC] = new zza();
                    com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                    this.zzbEg = obj;
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

    public zzack zzNL() {
        this.zzbEg = zza.zzNM();
        this.zzcaa = null;
        this.zzcaj = -1;
        return this;
    }

    protected int zzy() {
        int zzy = super.zzy();
        if (this.zzbEg != null && this.zzbEg.length > 0) {
            for (zzamj com_google_android_gms_internal_zzamj : this.zzbEg) {
                if (com_google_android_gms_internal_zzamj != null) {
                    zzy += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                }
            }
        }
        return zzy;
    }
}
