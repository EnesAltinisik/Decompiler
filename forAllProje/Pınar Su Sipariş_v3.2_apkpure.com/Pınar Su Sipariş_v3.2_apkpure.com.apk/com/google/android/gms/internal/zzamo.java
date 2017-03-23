package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public interface zzamo {

    public static final class zza extends zzamd<zza> {
        public long[] zzcaA;
        public String[] zzcax;
        public String[] zzcay;
        public int[] zzcaz;

        public zza() {
            zzXh();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzamo_zza = (zza) obj;
            return (zzamh.equals(this.zzcax, com_google_android_gms_internal_zzamo_zza.zzcax) && zzamh.equals(this.zzcay, com_google_android_gms_internal_zzamo_zza.zzcay) && zzamh.equals(this.zzcaz, com_google_android_gms_internal_zzamo_zza.zzcaz) && zzamh.equals(this.zzcaA, com_google_android_gms_internal_zzamo_zza.zzcaA)) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzamo_zza.zzcaa == null || com_google_android_gms_internal_zzamo_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzamo_zza.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzcax)) * 31) + zzamh.hashCode(this.zzcay)) * 31) + zzamh.hashCode(this.zzcaz)) * 31) + zzamh.hashCode(this.zzcaA)) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzY(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzcax != null && this.zzcax.length > 0) {
                for (String str : this.zzcax) {
                    if (str != null) {
                        com_google_android_gms_internal_zzamc.zzq(1, str);
                    }
                }
            }
            if (this.zzcay != null && this.zzcay.length > 0) {
                for (String str2 : this.zzcay) {
                    if (str2 != null) {
                        com_google_android_gms_internal_zzamc.zzq(2, str2);
                    }
                }
            }
            if (this.zzcaz != null && this.zzcaz.length > 0) {
                for (int zzE : this.zzcaz) {
                    com_google_android_gms_internal_zzamc.zzE(3, zzE);
                }
            }
            if (this.zzcaA != null && this.zzcaA.length > 0) {
                while (i < this.zzcaA.length) {
                    com_google_android_gms_internal_zzamc.zzb(4, this.zzcaA[i]);
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzXh() {
            this.zzcax = zzamm.zzcaq;
            this.zzcay = zzamm.zzcaq;
            this.zzcaz = zzamm.zzcal;
            this.zzcaA = zzamm.zzcam;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zza zzY(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                int zznW;
                Object obj2;
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zzcax == null ? 0 : this.zzcax.length;
                        obj = new String[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcax, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        this.zzcax = obj;
                        continue;
                    case 18:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzcay == null ? 0 : this.zzcay.length;
                        obj = new String[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcay, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        this.zzcay = obj;
                        continue;
                    case 24:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 24);
                        zzWC = this.zzcaz == null ? 0 : this.zzcaz.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcaz, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzcaz = obj;
                        continue;
                    case 26:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzcaz == null ? 0 : this.zzcaz.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzcaz, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzcaz = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 32:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 32);
                        zzWC = this.zzcaA == null ? 0 : this.zzcaA.length;
                        obj = new long[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcaA, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWF();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWF();
                        this.zzcaA = obj;
                        continue;
                    case 34:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWF();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzcaA == null ? 0 : this.zzcaA.length;
                        obj2 = new long[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzcaA, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWF();
                            zzc++;
                        }
                        this.zzcaA = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
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
            int i2;
            int i3;
            int i4 = 0;
            int zzy = super.zzy();
            if (this.zzcax == null || this.zzcax.length <= 0) {
                i = zzy;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.zzcax) {
                    if (str != null) {
                        i3++;
                        i2 += zzamc.zziZ(str);
                    }
                }
                i = (zzy + i2) + (i3 * 1);
            }
            if (this.zzcay != null && this.zzcay.length > 0) {
                i3 = 0;
                zzy = 0;
                for (String str2 : this.zzcay) {
                    if (str2 != null) {
                        zzy++;
                        i3 += zzamc.zziZ(str2);
                    }
                }
                i = (i + i3) + (zzy * 1);
            }
            if (this.zzcaz != null && this.zzcaz.length > 0) {
                i3 = 0;
                for (int zzy2 : this.zzcaz) {
                    i3 += zzamc.zzoc(zzy2);
                }
                i = (i + i3) + (this.zzcaz.length * 1);
            }
            if (this.zzcaA == null || this.zzcaA.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i4 < this.zzcaA.length) {
                i2 += zzamc.zzaU(this.zzcaA[i4]);
                i4++;
            }
            return (i + i2) + (this.zzcaA.length * 1);
        }
    }

    public static final class zzb extends zzamd<zzb> {
        public String version;
        public int zzcaB;
        public String zzcaC;

        public zzb() {
            zzXi();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzamo_zzb = (zzb) obj;
            if (this.zzcaB != com_google_android_gms_internal_zzamo_zzb.zzcaB) {
                return false;
            }
            if (this.zzcaC == null) {
                if (com_google_android_gms_internal_zzamo_zzb.zzcaC != null) {
                    return false;
                }
            } else if (!this.zzcaC.equals(com_google_android_gms_internal_zzamo_zzb.zzcaC)) {
                return false;
            }
            if (this.version == null) {
                if (com_google_android_gms_internal_zzamo_zzb.version != null) {
                    return false;
                }
            } else if (!this.version.equals(com_google_android_gms_internal_zzamo_zzb.version)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzamo_zzb.zzcaa == null || com_google_android_gms_internal_zzamo_zzb.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzamo_zzb.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.version == null ? 0 : this.version.hashCode()) + (((this.zzcaC == null ? 0 : this.zzcaC.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.zzcaB) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzZ(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzcaB != 0) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzcaB);
            }
            if (!this.zzcaC.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzcaC);
            }
            if (!this.version.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(3, this.version);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzXi() {
            this.zzcaB = 0;
            this.zzcaC = "";
            this.version = "";
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzb zzZ(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 0:
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
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                this.zzcaB = zzWC;
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.zzcaC = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 26:
                        this.version = com_google_android_gms_internal_zzamb.readString();
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
            int zzy = super.zzy();
            if (this.zzcaB != 0) {
                zzy += zzamc.zzG(1, this.zzcaB);
            }
            if (!this.zzcaC.equals("")) {
                zzy += zzamc.zzr(2, this.zzcaC);
            }
            return !this.version.equals("") ? zzy + zzamc.zzr(3, this.version) : zzy;
        }
    }

    public static final class zzc extends zzamd<zzc> {
        public byte[] zzcaD;
        public byte[][] zzcaE;
        public boolean zzcaF;

        public zzc() {
            zzXj();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzamo_zzc = (zzc) obj;
            return (Arrays.equals(this.zzcaD, com_google_android_gms_internal_zzamo_zzc.zzcaD) && zzamh.zza(this.zzcaE, com_google_android_gms_internal_zzamo_zzc.zzcaE) && this.zzcaF == com_google_android_gms_internal_zzamo_zzc.zzcaF) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzamo_zzc.zzcaa == null || com_google_android_gms_internal_zzamo_zzc.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzamo_zzc.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = ((this.zzcaF ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.zzcaD)) * 31) + zzamh.zza(this.zzcaE)) * 31)) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzaa(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!Arrays.equals(this.zzcaD, zzamm.zzcas)) {
                com_google_android_gms_internal_zzamc.zza(1, this.zzcaD);
            }
            if (this.zzcaE != null && this.zzcaE.length > 0) {
                for (byte[] bArr : this.zzcaE) {
                    if (bArr != null) {
                        com_google_android_gms_internal_zzamc.zza(2, bArr);
                    }
                }
            }
            if (this.zzcaF) {
                com_google_android_gms_internal_zzamc.zzj(3, this.zzcaF);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzXj() {
            this.zzcaD = zzamm.zzcas;
            this.zzcaE = zzamm.zzcar;
            this.zzcaF = false;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzc zzaa(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.zzcaD = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 18:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzcaE == null ? 0 : this.zzcaE.length;
                        Object obj = new byte[(zzc + zzWC)][];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcaE, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readBytes();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readBytes();
                        this.zzcaE = obj;
                        continue;
                    case 24:
                        this.zzcaF = com_google_android_gms_internal_zzamb.zzWI();
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
            int i = 0;
            int zzy = super.zzy();
            if (!Arrays.equals(this.zzcaD, zzamm.zzcas)) {
                zzy += zzamc.zzb(1, this.zzcaD);
            }
            if (this.zzcaE != null && this.zzcaE.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i < this.zzcaE.length) {
                    byte[] bArr = this.zzcaE[i];
                    if (bArr != null) {
                        i3++;
                        i2 += zzamc.zzQ(bArr);
                    }
                    i++;
                }
                zzy = (zzy + i2) + (i3 * 1);
            }
            return this.zzcaF ? zzy + zzamc.zzk(3, this.zzcaF) : zzy;
        }
    }

    public static final class zzd extends zzamd<zzd> {
        public String tag;
        public boolean zzbLB;
        public long zzcaG;
        public long zzcaH;
        public long zzcaI;
        public int zzcaJ;
        public zze[] zzcaK;
        public zzb zzcaL;
        public byte[] zzcaM;
        public byte[] zzcaN;
        public byte[] zzcaO;
        public zza zzcaP;
        public String zzcaQ;
        public long zzcaR;
        public zzc zzcaS;
        public byte[] zzcaT;
        public int zzcaU;
        public int[] zzcaV;
        public long zzcaW;
        public zzf zzcaX;
        public int zzoZ;

        public zzd() {
            zzXk();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzamo_zzd = (zzd) obj;
            if (this.zzcaG != com_google_android_gms_internal_zzamo_zzd.zzcaG || this.zzcaH != com_google_android_gms_internal_zzamo_zzd.zzcaH || this.zzcaI != com_google_android_gms_internal_zzamo_zzd.zzcaI) {
                return false;
            }
            if (this.tag == null) {
                if (com_google_android_gms_internal_zzamo_zzd.tag != null) {
                    return false;
                }
            } else if (!this.tag.equals(com_google_android_gms_internal_zzamo_zzd.tag)) {
                return false;
            }
            if (this.zzcaJ != com_google_android_gms_internal_zzamo_zzd.zzcaJ || this.zzoZ != com_google_android_gms_internal_zzamo_zzd.zzoZ || this.zzbLB != com_google_android_gms_internal_zzamo_zzd.zzbLB || !zzamh.equals(this.zzcaK, com_google_android_gms_internal_zzamo_zzd.zzcaK)) {
                return false;
            }
            if (this.zzcaL == null) {
                if (com_google_android_gms_internal_zzamo_zzd.zzcaL != null) {
                    return false;
                }
            } else if (!this.zzcaL.equals(com_google_android_gms_internal_zzamo_zzd.zzcaL)) {
                return false;
            }
            if (!Arrays.equals(this.zzcaM, com_google_android_gms_internal_zzamo_zzd.zzcaM) || !Arrays.equals(this.zzcaN, com_google_android_gms_internal_zzamo_zzd.zzcaN) || !Arrays.equals(this.zzcaO, com_google_android_gms_internal_zzamo_zzd.zzcaO)) {
                return false;
            }
            if (this.zzcaP == null) {
                if (com_google_android_gms_internal_zzamo_zzd.zzcaP != null) {
                    return false;
                }
            } else if (!this.zzcaP.equals(com_google_android_gms_internal_zzamo_zzd.zzcaP)) {
                return false;
            }
            if (this.zzcaQ == null) {
                if (com_google_android_gms_internal_zzamo_zzd.zzcaQ != null) {
                    return false;
                }
            } else if (!this.zzcaQ.equals(com_google_android_gms_internal_zzamo_zzd.zzcaQ)) {
                return false;
            }
            if (this.zzcaR != com_google_android_gms_internal_zzamo_zzd.zzcaR) {
                return false;
            }
            if (this.zzcaS == null) {
                if (com_google_android_gms_internal_zzamo_zzd.zzcaS != null) {
                    return false;
                }
            } else if (!this.zzcaS.equals(com_google_android_gms_internal_zzamo_zzd.zzcaS)) {
                return false;
            }
            if (!Arrays.equals(this.zzcaT, com_google_android_gms_internal_zzamo_zzd.zzcaT) || this.zzcaU != com_google_android_gms_internal_zzamo_zzd.zzcaU || !zzamh.equals(this.zzcaV, com_google_android_gms_internal_zzamo_zzd.zzcaV) || this.zzcaW != com_google_android_gms_internal_zzamo_zzd.zzcaW) {
                return false;
            }
            if (this.zzcaX == null) {
                if (com_google_android_gms_internal_zzamo_zzd.zzcaX != null) {
                    return false;
                }
            } else if (!this.zzcaX.equals(com_google_android_gms_internal_zzamo_zzd.zzcaX)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzamo_zzd.zzcaa == null || com_google_android_gms_internal_zzamo_zzd.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzamo_zzd.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzcaX == null ? 0 : this.zzcaX.hashCode()) + (((((((((((this.zzcaS == null ? 0 : this.zzcaS.hashCode()) + (((((this.zzcaQ == null ? 0 : this.zzcaQ.hashCode()) + (((this.zzcaP == null ? 0 : this.zzcaP.hashCode()) + (((((((((this.zzcaL == null ? 0 : this.zzcaL.hashCode()) + (((((this.zzbLB ? 1231 : 1237) + (((((((this.tag == null ? 0 : this.tag.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzcaG ^ (this.zzcaG >>> 32)))) * 31) + ((int) (this.zzcaH ^ (this.zzcaH >>> 32)))) * 31) + ((int) (this.zzcaI ^ (this.zzcaI >>> 32)))) * 31)) * 31) + this.zzcaJ) * 31) + this.zzoZ) * 31)) * 31) + zzamh.hashCode(this.zzcaK)) * 31)) * 31) + Arrays.hashCode(this.zzcaM)) * 31) + Arrays.hashCode(this.zzcaN)) * 31) + Arrays.hashCode(this.zzcaO)) * 31)) * 31)) * 31) + ((int) (this.zzcaR ^ (this.zzcaR >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.zzcaT)) * 31) + this.zzcaU) * 31) + zzamh.hashCode(this.zzcaV)) * 31) + ((int) (this.zzcaW ^ (this.zzcaW >>> 32)))) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzab(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzcaG != 0) {
                com_google_android_gms_internal_zzamc.zzb(1, this.zzcaG);
            }
            if (!this.tag.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(2, this.tag);
            }
            if (this.zzcaK != null && this.zzcaK.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzcaK) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (!Arrays.equals(this.zzcaM, zzamm.zzcas)) {
                com_google_android_gms_internal_zzamc.zza(6, this.zzcaM);
            }
            if (this.zzcaP != null) {
                com_google_android_gms_internal_zzamc.zza(7, this.zzcaP);
            }
            if (!Arrays.equals(this.zzcaN, zzamm.zzcas)) {
                com_google_android_gms_internal_zzamc.zza(8, this.zzcaN);
            }
            if (this.zzcaL != null) {
                com_google_android_gms_internal_zzamc.zza(9, this.zzcaL);
            }
            if (this.zzbLB) {
                com_google_android_gms_internal_zzamc.zzj(10, this.zzbLB);
            }
            if (this.zzcaJ != 0) {
                com_google_android_gms_internal_zzamc.zzE(11, this.zzcaJ);
            }
            if (this.zzoZ != 0) {
                com_google_android_gms_internal_zzamc.zzE(12, this.zzoZ);
            }
            if (!Arrays.equals(this.zzcaO, zzamm.zzcas)) {
                com_google_android_gms_internal_zzamc.zza(13, this.zzcaO);
            }
            if (!this.zzcaQ.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(14, this.zzcaQ);
            }
            if (this.zzcaR != 180000) {
                com_google_android_gms_internal_zzamc.zzd(15, this.zzcaR);
            }
            if (this.zzcaS != null) {
                com_google_android_gms_internal_zzamc.zza(16, this.zzcaS);
            }
            if (this.zzcaH != 0) {
                com_google_android_gms_internal_zzamc.zzb(17, this.zzcaH);
            }
            if (!Arrays.equals(this.zzcaT, zzamm.zzcas)) {
                com_google_android_gms_internal_zzamc.zza(18, this.zzcaT);
            }
            if (this.zzcaU != 0) {
                com_google_android_gms_internal_zzamc.zzE(19, this.zzcaU);
            }
            if (this.zzcaV != null && this.zzcaV.length > 0) {
                while (i < this.zzcaV.length) {
                    com_google_android_gms_internal_zzamc.zzE(20, this.zzcaV[i]);
                    i++;
                }
            }
            if (this.zzcaI != 0) {
                com_google_android_gms_internal_zzamc.zzb(21, this.zzcaI);
            }
            if (this.zzcaW != 0) {
                com_google_android_gms_internal_zzamc.zzb(22, this.zzcaW);
            }
            if (this.zzcaX != null) {
                com_google_android_gms_internal_zzamc.zza(23, this.zzcaX);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzd zzXk() {
            this.zzcaG = 0;
            this.zzcaH = 0;
            this.zzcaI = 0;
            this.tag = "";
            this.zzcaJ = 0;
            this.zzoZ = 0;
            this.zzbLB = false;
            this.zzcaK = zze.zzXl();
            this.zzcaL = null;
            this.zzcaM = zzamm.zzcas;
            this.zzcaN = zzamm.zzcas;
            this.zzcaO = zzamm.zzcas;
            this.zzcaP = null;
            this.zzcaQ = "";
            this.zzcaR = 180000;
            this.zzcaS = null;
            this.zzcaT = zzamm.zzcas;
            this.zzcaU = 0;
            this.zzcaV = zzamm.zzcal;
            this.zzcaW = 0;
            this.zzcaX = null;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzd zzab(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzcaG = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 18:
                        this.tag = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 26:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zzcaK == null ? 0 : this.zzcaK.length;
                        obj = new zze[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcaK, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zze();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zze();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzcaK = obj;
                        continue;
                    case 50:
                        this.zzcaM = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 58:
                        if (this.zzcaP == null) {
                            this.zzcaP = new zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzcaP);
                        continue;
                    case 66:
                        this.zzcaN = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 74:
                        if (this.zzcaL == null) {
                            this.zzcaL = new zzb();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzcaL);
                        continue;
                    case 80:
                        this.zzbLB = com_google_android_gms_internal_zzamb.zzWI();
                        continue;
                    case 88:
                        this.zzcaJ = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 96:
                        this.zzoZ = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 106:
                        this.zzcaO = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 114:
                        this.zzcaQ = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 120:
                        this.zzcaR = com_google_android_gms_internal_zzamb.zzWK();
                        continue;
                    case 130:
                        if (this.zzcaS == null) {
                            this.zzcaS = new zzc();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzcaS);
                        continue;
                    case 136:
                        this.zzcaH = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 146:
                        this.zzcaT = com_google_android_gms_internal_zzamb.readBytes();
                        continue;
                    case 152:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case 0:
                            case 1:
                            case 2:
                                this.zzcaU = zzWC;
                                break;
                            default:
                                continue;
                        }
                    case 160:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 160);
                        zzWC = this.zzcaV == null ? 0 : this.zzcaV.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzcaV, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzcaV = obj;
                        continue;
                    case 162:
                        int zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzcaV == null ? 0 : this.zzcaV.length;
                        Object obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzcaV, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzcaV = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 168:
                        this.zzcaI = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 176:
                        this.zzcaW = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 186:
                        if (this.zzcaX == null) {
                            this.zzcaX = new zzf();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzcaX);
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
            int zzy = super.zzy();
            if (this.zzcaG != 0) {
                zzy += zzamc.zze(1, this.zzcaG);
            }
            if (!this.tag.equals("")) {
                zzy += zzamc.zzr(2, this.tag);
            }
            if (this.zzcaK != null && this.zzcaK.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zzcaK) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(3, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (!Arrays.equals(this.zzcaM, zzamm.zzcas)) {
                zzy += zzamc.zzb(6, this.zzcaM);
            }
            if (this.zzcaP != null) {
                zzy += zzamc.zzc(7, this.zzcaP);
            }
            if (!Arrays.equals(this.zzcaN, zzamm.zzcas)) {
                zzy += zzamc.zzb(8, this.zzcaN);
            }
            if (this.zzcaL != null) {
                zzy += zzamc.zzc(9, this.zzcaL);
            }
            if (this.zzbLB) {
                zzy += zzamc.zzk(10, this.zzbLB);
            }
            if (this.zzcaJ != 0) {
                zzy += zzamc.zzG(11, this.zzcaJ);
            }
            if (this.zzoZ != 0) {
                zzy += zzamc.zzG(12, this.zzoZ);
            }
            if (!Arrays.equals(this.zzcaO, zzamm.zzcas)) {
                zzy += zzamc.zzb(13, this.zzcaO);
            }
            if (!this.zzcaQ.equals("")) {
                zzy += zzamc.zzr(14, this.zzcaQ);
            }
            if (this.zzcaR != 180000) {
                zzy += zzamc.zzg(15, this.zzcaR);
            }
            if (this.zzcaS != null) {
                zzy += zzamc.zzc(16, this.zzcaS);
            }
            if (this.zzcaH != 0) {
                zzy += zzamc.zze(17, this.zzcaH);
            }
            if (!Arrays.equals(this.zzcaT, zzamm.zzcas)) {
                zzy += zzamc.zzb(18, this.zzcaT);
            }
            if (this.zzcaU != 0) {
                zzy += zzamc.zzG(19, this.zzcaU);
            }
            if (this.zzcaV != null && this.zzcaV.length > 0) {
                i = 0;
                while (i2 < this.zzcaV.length) {
                    i += zzamc.zzoc(this.zzcaV[i2]);
                    i2++;
                }
                zzy = (zzy + i) + (this.zzcaV.length * 2);
            }
            if (this.zzcaI != 0) {
                zzy += zzamc.zze(21, this.zzcaI);
            }
            if (this.zzcaW != 0) {
                zzy += zzamc.zze(22, this.zzcaW);
            }
            return this.zzcaX != null ? zzy + zzamc.zzc(23, this.zzcaX) : zzy;
        }
    }

    public static final class zze extends zzamd<zze> {
        private static volatile zze[] zzcaY;
        public String value;
        public String zzaB;

        public zze() {
            zzXm();
        }

        public static zze[] zzXl() {
            if (zzcaY == null) {
                synchronized (zzamh.zzcai) {
                    if (zzcaY == null) {
                        zzcaY = new zze[0];
                    }
                }
            }
            return zzcaY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzamo_zze = (zze) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzamo_zze.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzamo_zze.zzaB)) {
                return false;
            }
            if (this.value == null) {
                if (com_google_android_gms_internal_zzamo_zze.value != null) {
                    return false;
                }
            } else if (!this.value.equals(com_google_android_gms_internal_zzamo_zze.value)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzamo_zze.zzcaa == null || com_google_android_gms_internal_zzamo_zze.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzamo_zze.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.value == null ? 0 : this.value.hashCode()) + (((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzac(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.zzaB.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.zzaB);
            }
            if (!this.value.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(2, this.value);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zze zzXm() {
            this.zzaB = "";
            this.value = "";
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zze zzac(zzamb com_google_android_gms_internal_zzamb) throws IOException {
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
                        if (!super.zza(com_google_android_gms_internal_zzamb, zzWC)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (!this.zzaB.equals("")) {
                zzy += zzamc.zzr(1, this.zzaB);
            }
            return !this.value.equals("") ? zzy + zzamc.zzr(2, this.value) : zzy;
        }
    }

    public static final class zzf extends zzamd<zzf> {
        public int zzcaZ;

        public zzf() {
            zzXn();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzamo_zzf = (zzf) obj;
            return this.zzcaZ == com_google_android_gms_internal_zzamo_zzf.zzcaZ ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzamo_zzf.zzcaa == null || com_google_android_gms_internal_zzamo_zzf.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzamo_zzf.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.zzcaZ) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzad(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzcaZ != -1) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzcaZ);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzf zzXn() {
            this.zzcaZ = -1;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzf zzad(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        zzWC = com_google_android_gms_internal_zzamb.zzWG();
                        switch (zzWC) {
                            case -1:
                            case 0:
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
                                this.zzcaZ = zzWC;
                                break;
                            default:
                                continue;
                        }
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
            int zzy = super.zzy();
            return this.zzcaZ != -1 ? zzy + zzamc.zzG(1, this.zzcaZ) : zzy;
        }
    }
}
