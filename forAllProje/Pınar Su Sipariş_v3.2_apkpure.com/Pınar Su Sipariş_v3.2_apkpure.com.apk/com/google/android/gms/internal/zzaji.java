package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public interface zzaji {

    public static final class zza extends zzamd<zza> {
        public long timestamp;
        public zzd[] zzbTD;

        public zza() {
            zzUG();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzaji_zza = (zza) obj;
            return (zzamh.equals(this.zzbTD, com_google_android_gms_internal_zzaji_zza.zzbTD) && this.timestamp == com_google_android_gms_internal_zzaji_zza.timestamp) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaji_zza.zzcaa == null || com_google_android_gms_internal_zzaji_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaji_zza.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzbTD)) * 31) + ((int) (this.timestamp ^ (this.timestamp >>> 32)))) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzP(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbTD != null && this.zzbTD.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbTD) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.timestamp != 0) {
                com_google_android_gms_internal_zzamc.zzc(2, this.timestamp);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzP(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zzbTD == null ? 0 : this.zzbTD.length;
                        Object obj = new zzd[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbTD, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzd();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzd();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbTD = obj;
                        continue;
                    case 17:
                        this.timestamp = com_google_android_gms_internal_zzamb.zzWH();
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

        public zza zzUG() {
            this.zzbTD = zzd.zzUK();
            this.timestamp = 0;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbTD != null && this.zzbTD.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbTD) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        zzy += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            return this.timestamp != 0 ? zzy + zzamc.zzf(2, this.timestamp) : zzy;
        }
    }

    public static final class zzb extends zzamd<zzb> {
        private static volatile zzb[] zzbTE;
        public String zzaB;
        public byte[] zzbTF;

        public zzb() {
            zzUI();
        }

        public static zzb[] zzUH() {
            if (zzbTE == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbTE == null) {
                        zzbTE = new zzb[0];
                    }
                }
            }
            return zzbTE;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzaji_zzb = (zzb) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzaji_zzb.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzaji_zzb.zzaB)) {
                return false;
            }
            return Arrays.equals(this.zzbTF, com_google_android_gms_internal_zzaji_zzb.zzbTF) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaji_zzb.zzcaa == null || com_google_android_gms_internal_zzaji_zzb.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaji_zzb.zzcaa) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + Arrays.hashCode(this.zzbTF)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzQ(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.zzaB.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.zzaB);
            }
            if (!Arrays.equals(this.zzbTF, zzamm.zzcas)) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzbTF);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzQ(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.zzaB = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        this.zzbTF = com_google_android_gms_internal_zzamb.readBytes();
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

        public zzb zzUI() {
            this.zzaB = "";
            this.zzbTF = zzamm.zzcas;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (!this.zzaB.equals("")) {
                zzy += zzamc.zzr(1, this.zzaB);
            }
            return !Arrays.equals(this.zzbTF, zzamm.zzcas) ? zzy + zzamc.zzb(2, this.zzbTF) : zzy;
        }
    }

    public static final class zzc extends zzamd<zzc> {
        public int zzbTG;
        public boolean zzbTH;

        public zzc() {
            zzUJ();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzaji_zzc = (zzc) obj;
            return (this.zzbTG == com_google_android_gms_internal_zzaji_zzc.zzbTG && this.zzbTH == com_google_android_gms_internal_zzaji_zzc.zzbTH) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaji_zzc.zzcaa == null || com_google_android_gms_internal_zzaji_zzc.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaji_zzc.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = ((this.zzbTH ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.zzbTG) * 31)) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzR(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbTG != 0) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbTG);
            }
            if (this.zzbTH) {
                com_google_android_gms_internal_zzamc.zzj(2, this.zzbTH);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzR(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbTG = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 16:
                        this.zzbTH = com_google_android_gms_internal_zzamb.zzWI();
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

        public zzc zzUJ() {
            this.zzbTG = 0;
            this.zzbTH = false;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbTG != 0) {
                zzy += zzamc.zzG(1, this.zzbTG);
            }
            return this.zzbTH ? zzy + zzamc.zzk(2, this.zzbTH) : zzy;
        }
    }

    public static final class zzd extends zzamd<zzd> {
        private static volatile zzd[] zzbTI;
        public String zzasB;
        public zzb[] zzbTJ;

        public zzd() {
            zzUL();
        }

        public static zzd[] zzUK() {
            if (zzbTI == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbTI == null) {
                        zzbTI = new zzd[0];
                    }
                }
            }
            return zzbTI;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzaji_zzd = (zzd) obj;
            if (this.zzasB == null) {
                if (com_google_android_gms_internal_zzaji_zzd.zzasB != null) {
                    return false;
                }
            } else if (!this.zzasB.equals(com_google_android_gms_internal_zzaji_zzd.zzasB)) {
                return false;
            }
            return zzamh.equals(this.zzbTJ, com_google_android_gms_internal_zzaji_zzd.zzbTJ) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaji_zzd.zzcaa == null || com_google_android_gms_internal_zzaji_zzd.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaji_zzd.zzcaa) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzasB == null ? 0 : this.zzasB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + zzamh.hashCode(this.zzbTJ)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzS(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.zzasB.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.zzasB);
            }
            if (this.zzbTJ != null && this.zzbTJ.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbTJ) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzd zzS(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.zzasB = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzbTJ == null ? 0 : this.zzbTJ.length;
                        Object obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbTJ, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbTJ = obj;
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

        public zzd zzUL() {
            this.zzasB = "";
            this.zzbTJ = zzb.zzUH();
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (!this.zzasB.equals("")) {
                zzy += zzamc.zzr(1, this.zzasB);
            }
            if (this.zzbTJ == null || this.zzbTJ.length <= 0) {
                return zzy;
            }
            int i = zzy;
            for (zzamj com_google_android_gms_internal_zzamj : this.zzbTJ) {
                if (com_google_android_gms_internal_zzamj != null) {
                    i += zzamc.zzc(2, com_google_android_gms_internal_zzamj);
                }
            }
            return i;
        }
    }

    public static final class zze extends zzamd<zze> {
        public zza zzbTK;
        public zza zzbTL;
        public zza zzbTM;
        public zzc zzbTN;
        public zzf[] zzbTO;

        public zze() {
            zzUM();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzaji_zze = (zze) obj;
            if (this.zzbTK == null) {
                if (com_google_android_gms_internal_zzaji_zze.zzbTK != null) {
                    return false;
                }
            } else if (!this.zzbTK.equals(com_google_android_gms_internal_zzaji_zze.zzbTK)) {
                return false;
            }
            if (this.zzbTL == null) {
                if (com_google_android_gms_internal_zzaji_zze.zzbTL != null) {
                    return false;
                }
            } else if (!this.zzbTL.equals(com_google_android_gms_internal_zzaji_zze.zzbTL)) {
                return false;
            }
            if (this.zzbTM == null) {
                if (com_google_android_gms_internal_zzaji_zze.zzbTM != null) {
                    return false;
                }
            } else if (!this.zzbTM.equals(com_google_android_gms_internal_zzaji_zze.zzbTM)) {
                return false;
            }
            if (this.zzbTN == null) {
                if (com_google_android_gms_internal_zzaji_zze.zzbTN != null) {
                    return false;
                }
            } else if (!this.zzbTN.equals(com_google_android_gms_internal_zzaji_zze.zzbTN)) {
                return false;
            }
            return zzamh.equals(this.zzbTO, com_google_android_gms_internal_zzaji_zze.zzbTO) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaji_zze.zzcaa == null || com_google_android_gms_internal_zzaji_zze.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaji_zze.zzcaa) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzbTN == null ? 0 : this.zzbTN.hashCode()) + (((this.zzbTM == null ? 0 : this.zzbTM.hashCode()) + (((this.zzbTL == null ? 0 : this.zzbTL.hashCode()) + (((this.zzbTK == null ? 0 : this.zzbTK.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31) + zzamh.hashCode(this.zzbTO)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzT(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbTK != null) {
                com_google_android_gms_internal_zzamc.zza(1, this.zzbTK);
            }
            if (this.zzbTL != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzbTL);
            }
            if (this.zzbTM != null) {
                com_google_android_gms_internal_zzamc.zza(3, this.zzbTM);
            }
            if (this.zzbTN != null) {
                com_google_android_gms_internal_zzamc.zza(4, this.zzbTN);
            }
            if (this.zzbTO != null && this.zzbTO.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbTO) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(5, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zze zzT(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        if (this.zzbTK == null) {
                            this.zzbTK = new zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbTK);
                        continue;
                    case 18:
                        if (this.zzbTL == null) {
                            this.zzbTL = new zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbTL);
                        continue;
                    case 26:
                        if (this.zzbTM == null) {
                            this.zzbTM = new zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbTM);
                        continue;
                    case 34:
                        if (this.zzbTN == null) {
                            this.zzbTN = new zzc();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbTN);
                        continue;
                    case 42:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 42);
                        zzWC = this.zzbTO == null ? 0 : this.zzbTO.length;
                        Object obj = new zzf[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbTO, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzf();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzf();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbTO = obj;
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

        public zze zzUM() {
            this.zzbTK = null;
            this.zzbTL = null;
            this.zzbTM = null;
            this.zzbTN = null;
            this.zzbTO = zzf.zzUN();
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbTK != null) {
                zzy += zzamc.zzc(1, this.zzbTK);
            }
            if (this.zzbTL != null) {
                zzy += zzamc.zzc(2, this.zzbTL);
            }
            if (this.zzbTM != null) {
                zzy += zzamc.zzc(3, this.zzbTM);
            }
            if (this.zzbTN != null) {
                zzy += zzamc.zzc(4, this.zzbTN);
            }
            if (this.zzbTO == null || this.zzbTO.length <= 0) {
                return zzy;
            }
            int i = zzy;
            for (zzamj com_google_android_gms_internal_zzamj : this.zzbTO) {
                if (com_google_android_gms_internal_zzamj != null) {
                    i += zzamc.zzc(5, com_google_android_gms_internal_zzamj);
                }
            }
            return i;
        }
    }

    public static final class zzf extends zzamd<zzf> {
        private static volatile zzf[] zzbTP;
        public int resourceId;
        public String zzasB;
        public long zzbTQ;

        public zzf() {
            zzUO();
        }

        public static zzf[] zzUN() {
            if (zzbTP == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbTP == null) {
                        zzbTP = new zzf[0];
                    }
                }
            }
            return zzbTP;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzaji_zzf = (zzf) obj;
            if (this.resourceId != com_google_android_gms_internal_zzaji_zzf.resourceId || this.zzbTQ != com_google_android_gms_internal_zzaji_zzf.zzbTQ) {
                return false;
            }
            if (this.zzasB == null) {
                if (com_google_android_gms_internal_zzaji_zzf.zzasB != null) {
                    return false;
                }
            } else if (!this.zzasB.equals(com_google_android_gms_internal_zzaji_zzf.zzasB)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaji_zzf.zzcaa == null || com_google_android_gms_internal_zzaji_zzf.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaji_zzf.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzasB == null ? 0 : this.zzasB.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.resourceId) * 31) + ((int) (this.zzbTQ ^ (this.zzbTQ >>> 32)))) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzU(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.resourceId != 0) {
                com_google_android_gms_internal_zzamc.zzE(1, this.resourceId);
            }
            if (this.zzbTQ != 0) {
                com_google_android_gms_internal_zzamc.zzc(2, this.zzbTQ);
            }
            if (!this.zzasB.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(3, this.zzasB);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzf zzU(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.resourceId = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 17:
                        this.zzbTQ = com_google_android_gms_internal_zzamb.zzWH();
                        continue;
                    case 26:
                        this.zzasB = com_google_android_gms_internal_zzamb.readString();
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

        public zzf zzUO() {
            this.resourceId = 0;
            this.zzbTQ = 0;
            this.zzasB = "";
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.resourceId != 0) {
                zzy += zzamc.zzG(1, this.resourceId);
            }
            if (this.zzbTQ != 0) {
                zzy += zzamc.zzf(2, this.zzbTQ);
            }
            return !this.zzasB.equals("") ? zzy + zzamc.zzr(3, this.zzasB) : zzy;
        }
    }
}
