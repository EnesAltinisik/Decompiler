package com.google.android.gms.internal;

import java.io.IOException;

public interface zzaf {

    public static final class zza extends zzamd<zza> {
        public int level;
        public int zziC;
        public int zziD;

        public zza() {
            zzA();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzaf_zza = (zza) obj;
            return (this.level == com_google_android_gms_internal_zzaf_zza.level && this.zziC == com_google_android_gms_internal_zzaf_zza.zziC && this.zziD == com_google_android_gms_internal_zzaf_zza.zziD) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zza.zzcaa == null || com_google_android_gms_internal_zzaf_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zza.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.level) * 31) + this.zziC) * 31) + this.zziD) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zza(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.level != 1) {
                com_google_android_gms_internal_zzamc.zzE(1, this.level);
            }
            if (this.zziC != 0) {
                com_google_android_gms_internal_zzamc.zzE(2, this.zziC);
            }
            if (this.zziD != 0) {
                com_google_android_gms_internal_zzamc.zzE(3, this.zziD);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzA() {
            this.level = 1;
            this.zziC = 0;
            this.zziD = 0;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zza zza(zzamb com_google_android_gms_internal_zzamb) throws IOException {
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
                                this.level = zzWC;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.zziC = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 24:
                        this.zziD = com_google_android_gms_internal_zzamb.zzWG();
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
            if (this.level != 1) {
                zzy += zzamc.zzG(1, this.level);
            }
            if (this.zziC != 0) {
                zzy += zzamc.zzG(2, this.zziC);
            }
            return this.zziD != 0 ? zzy + zzamc.zzG(3, this.zziD) : zzy;
        }
    }

    public static final class zzb extends zzamd<zzb> {
        private static volatile zzb[] zziE;
        public int name;
        public int[] zziF;
        public int zziG;
        public boolean zziH;
        public boolean zziI;

        public zzb() {
            zzC();
        }

        public static zzb[] zzB() {
            if (zziE == null) {
                synchronized (zzamh.zzcai) {
                    if (zziE == null) {
                        zziE = new zzb[0];
                    }
                }
            }
            return zziE;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzaf_zzb = (zzb) obj;
            return (zzamh.equals(this.zziF, com_google_android_gms_internal_zzaf_zzb.zziF) && this.zziG == com_google_android_gms_internal_zzaf_zzb.zziG && this.name == com_google_android_gms_internal_zzaf_zzb.name && this.zziH == com_google_android_gms_internal_zzaf_zzb.zziH && this.zziI == com_google_android_gms_internal_zzaf_zzb.zziI) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzb.zzcaa == null || com_google_android_gms_internal_zzaf_zzb.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzb.zzcaa) : false;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = ((this.zziH ? 1231 : 1237) + ((((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zziF)) * 31) + this.zziG) * 31) + this.name) * 31)) * 31;
            if (!this.zziI) {
                i = 1237;
            }
            i = (hashCode + i) * 31;
            hashCode = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzb(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zziI) {
                com_google_android_gms_internal_zzamc.zzj(1, this.zziI);
            }
            com_google_android_gms_internal_zzamc.zzE(2, this.zziG);
            if (this.zziF != null && this.zziF.length > 0) {
                for (int zzE : this.zziF) {
                    com_google_android_gms_internal_zzamc.zzE(3, zzE);
                }
            }
            if (this.name != 0) {
                com_google_android_gms_internal_zzamc.zzE(4, this.name);
            }
            if (this.zziH) {
                com_google_android_gms_internal_zzamc.zzj(6, this.zziH);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzC() {
            this.zziF = zzamm.zzcal;
            this.zziG = 0;
            this.name = 0;
            this.zziH = false;
            this.zziI = false;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzb zzb(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zziI = com_google_android_gms_internal_zzamb.zzWI();
                        continue;
                    case 16:
                        this.zziG = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 24:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 24);
                        zzWC = this.zziF == null ? 0 : this.zziF.length;
                        Object obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziF, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zziF = obj;
                        continue;
                    case 26:
                        int zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zziF == null ? 0 : this.zziF.length;
                        Object obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zziF, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zziF = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 32:
                        this.name = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 48:
                        this.zziH = com_google_android_gms_internal_zzamb.zzWI();
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
            if (this.zziI) {
                zzy += zzamc.zzk(1, this.zziI);
            }
            int zzG = zzamc.zzG(2, this.zziG) + zzy;
            if (this.zziF == null || this.zziF.length <= 0) {
                zzy = zzG;
            } else {
                for (int zzoc : this.zziF) {
                    i += zzamc.zzoc(zzoc);
                }
                zzy = (zzG + i) + (this.zziF.length * 1);
            }
            if (this.name != 0) {
                zzy += zzamc.zzG(4, this.name);
            }
            return this.zziH ? zzy + zzamc.zzk(6, this.zziH) : zzy;
        }
    }

    public static final class zzc extends zzamd<zzc> {
        private static volatile zzc[] zziJ;
        public String zzaB;
        public long zziK;
        public long zziL;
        public boolean zziM;
        public long zziN;

        public zzc() {
            zzE();
        }

        public static zzc[] zzD() {
            if (zziJ == null) {
                synchronized (zzamh.zzcai) {
                    if (zziJ == null) {
                        zziJ = new zzc[0];
                    }
                }
            }
            return zziJ;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzaf_zzc = (zzc) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzaf_zzc.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzaf_zzc.zzaB)) {
                return false;
            }
            return (this.zziK == com_google_android_gms_internal_zzaf_zzc.zziK && this.zziL == com_google_android_gms_internal_zzaf_zzc.zziL && this.zziM == com_google_android_gms_internal_zzaf_zzc.zziM && this.zziN == com_google_android_gms_internal_zzaf_zzc.zziN) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzc.zzcaa == null || com_google_android_gms_internal_zzaf_zzc.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzc.zzcaa) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zziM ? 1231 : 1237) + (((((((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.zziK ^ (this.zziK >>> 32)))) * 31) + ((int) (this.zziL ^ (this.zziL >>> 32)))) * 31)) * 31) + ((int) (this.zziN ^ (this.zziN >>> 32)))) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzc(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.zzaB.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.zzaB);
            }
            if (this.zziK != 0) {
                com_google_android_gms_internal_zzamc.zzb(2, this.zziK);
            }
            if (this.zziL != 2147483647L) {
                com_google_android_gms_internal_zzamc.zzb(3, this.zziL);
            }
            if (this.zziM) {
                com_google_android_gms_internal_zzamc.zzj(4, this.zziM);
            }
            if (this.zziN != 0) {
                com_google_android_gms_internal_zzamc.zzb(5, this.zziN);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzE() {
            this.zzaB = "";
            this.zziK = 0;
            this.zziL = 2147483647L;
            this.zziM = false;
            this.zziN = 0;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzc zzc(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.zzaB = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 16:
                        this.zziK = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 24:
                        this.zziL = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 32:
                        this.zziM = com_google_android_gms_internal_zzamb.zzWI();
                        continue;
                    case 40:
                        this.zziN = com_google_android_gms_internal_zzamb.zzWF();
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
            if (this.zziK != 0) {
                zzy += zzamc.zze(2, this.zziK);
            }
            if (this.zziL != 2147483647L) {
                zzy += zzamc.zze(3, this.zziL);
            }
            if (this.zziM) {
                zzy += zzamc.zzk(4, this.zziM);
            }
            return this.zziN != 0 ? zzy + zzamc.zze(5, this.zziN) : zzy;
        }
    }

    public static final class zzd extends zzamd<zzd> {
        public com.google.android.gms.internal.zzag.zza[] zziO;
        public com.google.android.gms.internal.zzag.zza[] zziP;
        public zzc[] zziQ;

        public zzd() {
            zzF();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzaf_zzd = (zzd) obj;
            return (zzamh.equals(this.zziO, com_google_android_gms_internal_zzaf_zzd.zziO) && zzamh.equals(this.zziP, com_google_android_gms_internal_zzaf_zzd.zziP) && zzamh.equals(this.zziQ, com_google_android_gms_internal_zzaf_zzd.zziQ)) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzd.zzcaa == null || com_google_android_gms_internal_zzaf_zzd.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzd.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zziO)) * 31) + zzamh.hashCode(this.zziP)) * 31) + zzamh.hashCode(this.zziQ)) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzd(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zziO != null && this.zziO.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zziO) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zziP != null && this.zziP.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zziP) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj2);
                    }
                }
            }
            if (this.zziQ != null && this.zziQ.length > 0) {
                while (i < this.zziQ.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zziQ[i];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj3);
                    }
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzd zzF() {
            this.zziO = com.google.android.gms.internal.zzag.zza.zzP();
            this.zziP = com.google.android.gms.internal.zzag.zza.zzP();
            this.zziQ = zzc.zzD();
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzd zzd(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zziO == null ? 0 : this.zziO.length;
                        obj = new com.google.android.gms.internal.zzag.zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziO, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new com.google.android.gms.internal.zzag.zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new com.google.android.gms.internal.zzag.zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziO = obj;
                        continue;
                    case 18:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zziP == null ? 0 : this.zziP.length;
                        obj = new com.google.android.gms.internal.zzag.zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziP, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new com.google.android.gms.internal.zzag.zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new com.google.android.gms.internal.zzag.zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziP = obj;
                        continue;
                    case 26:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zziQ == null ? 0 : this.zziQ.length;
                        obj = new zzc[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziQ, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzc();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzc();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziQ = obj;
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
            if (this.zziO != null && this.zziO.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zziO) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (this.zziP != null && this.zziP.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zziP) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        i += zzamc.zzc(2, com_google_android_gms_internal_zzamj2);
                    }
                }
                zzy = i;
            }
            if (this.zziQ != null && this.zziQ.length > 0) {
                while (i2 < this.zziQ.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zziQ[i2];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        zzy += zzamc.zzc(3, com_google_android_gms_internal_zzamj3);
                    }
                    i2++;
                }
            }
            return zzy;
        }
    }

    public static final class zze extends zzamd<zze> {
        private static volatile zze[] zziR;
        public int key;
        public int value;

        public zze() {
            zzH();
        }

        public static zze[] zzG() {
            if (zziR == null) {
                synchronized (zzamh.zzcai) {
                    if (zziR == null) {
                        zziR = new zze[0];
                    }
                }
            }
            return zziR;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzaf_zze = (zze) obj;
            return (this.key == com_google_android_gms_internal_zzaf_zze.key && this.value == com_google_android_gms_internal_zzaf_zze.value) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zze.zzcaa == null || com_google_android_gms_internal_zzaf_zze.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zze.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.key) * 31) + this.value) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zze(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            com_google_android_gms_internal_zzamc.zzE(1, this.key);
            com_google_android_gms_internal_zzamc.zzE(2, this.value);
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zze zzH() {
            this.key = 0;
            this.value = 0;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zze zze(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.key = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 16:
                        this.value = com_google_android_gms_internal_zzamb.zzWG();
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
            return (super.zzy() + zzamc.zzG(1, this.key)) + zzamc.zzG(2, this.value);
        }
    }

    public static final class zzf extends zzamd<zzf> {
        public String version;
        public String[] zziS;
        public String[] zziT;
        public com.google.android.gms.internal.zzag.zza[] zziU;
        public zze[] zziV;
        public zzb[] zziW;
        public zzb[] zziX;
        public zzb[] zziY;
        public zzg[] zziZ;
        public String zzja;
        public String zzjb;
        public String zzjc;
        public zza zzjd;
        public float zzje;
        public boolean zzjf;
        public String[] zzjg;
        public int zzjh;

        public zzf() {
            zzI();
        }

        public static zzf zzc(byte[] bArr) throws zzami {
            return (zzf) zzamj.mergeFrom(new zzf(), bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzaf_zzf = (zzf) obj;
            if (!zzamh.equals(this.zziS, com_google_android_gms_internal_zzaf_zzf.zziS) || !zzamh.equals(this.zziT, com_google_android_gms_internal_zzaf_zzf.zziT) || !zzamh.equals(this.zziU, com_google_android_gms_internal_zzaf_zzf.zziU) || !zzamh.equals(this.zziV, com_google_android_gms_internal_zzaf_zzf.zziV) || !zzamh.equals(this.zziW, com_google_android_gms_internal_zzaf_zzf.zziW) || !zzamh.equals(this.zziX, com_google_android_gms_internal_zzaf_zzf.zziX) || !zzamh.equals(this.zziY, com_google_android_gms_internal_zzaf_zzf.zziY) || !zzamh.equals(this.zziZ, com_google_android_gms_internal_zzaf_zzf.zziZ)) {
                return false;
            }
            if (this.zzja == null) {
                if (com_google_android_gms_internal_zzaf_zzf.zzja != null) {
                    return false;
                }
            } else if (!this.zzja.equals(com_google_android_gms_internal_zzaf_zzf.zzja)) {
                return false;
            }
            if (this.zzjb == null) {
                if (com_google_android_gms_internal_zzaf_zzf.zzjb != null) {
                    return false;
                }
            } else if (!this.zzjb.equals(com_google_android_gms_internal_zzaf_zzf.zzjb)) {
                return false;
            }
            if (this.zzjc == null) {
                if (com_google_android_gms_internal_zzaf_zzf.zzjc != null) {
                    return false;
                }
            } else if (!this.zzjc.equals(com_google_android_gms_internal_zzaf_zzf.zzjc)) {
                return false;
            }
            if (this.version == null) {
                if (com_google_android_gms_internal_zzaf_zzf.version != null) {
                    return false;
                }
            } else if (!this.version.equals(com_google_android_gms_internal_zzaf_zzf.version)) {
                return false;
            }
            if (this.zzjd == null) {
                if (com_google_android_gms_internal_zzaf_zzf.zzjd != null) {
                    return false;
                }
            } else if (!this.zzjd.equals(com_google_android_gms_internal_zzaf_zzf.zzjd)) {
                return false;
            }
            return (Float.floatToIntBits(this.zzje) == Float.floatToIntBits(com_google_android_gms_internal_zzaf_zzf.zzje) && this.zzjf == com_google_android_gms_internal_zzaf_zzf.zzjf && zzamh.equals(this.zzjg, com_google_android_gms_internal_zzaf_zzf.zzjg) && this.zzjh == com_google_android_gms_internal_zzaf_zzf.zzjh) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzf.zzcaa == null || com_google_android_gms_internal_zzaf_zzf.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzf.zzcaa) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((this.zzjf ? 1231 : 1237) + (((((this.zzjd == null ? 0 : this.zzjd.hashCode()) + (((this.version == null ? 0 : this.version.hashCode()) + (((this.zzjc == null ? 0 : this.zzjc.hashCode()) + (((this.zzjb == null ? 0 : this.zzjb.hashCode()) + (((this.zzja == null ? 0 : this.zzja.hashCode()) + ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zziS)) * 31) + zzamh.hashCode(this.zziT)) * 31) + zzamh.hashCode(this.zziU)) * 31) + zzamh.hashCode(this.zziV)) * 31) + zzamh.hashCode(this.zziW)) * 31) + zzamh.hashCode(this.zziX)) * 31) + zzamh.hashCode(this.zziY)) * 31) + zzamh.hashCode(this.zziZ)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + Float.floatToIntBits(this.zzje)) * 31)) * 31) + zzamh.hashCode(this.zzjg)) * 31) + this.zzjh) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzf(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zziT != null && this.zziT.length > 0) {
                for (String str : this.zziT) {
                    if (str != null) {
                        com_google_android_gms_internal_zzamc.zzq(1, str);
                    }
                }
            }
            if (this.zziU != null && this.zziU.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zziU) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zziV != null && this.zziV.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zziV) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj2);
                    }
                }
            }
            if (this.zziW != null && this.zziW.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj22 : this.zziW) {
                    if (com_google_android_gms_internal_zzamj22 != null) {
                        com_google_android_gms_internal_zzamc.zza(4, com_google_android_gms_internal_zzamj22);
                    }
                }
            }
            if (this.zziX != null && this.zziX.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj222 : this.zziX) {
                    if (com_google_android_gms_internal_zzamj222 != null) {
                        com_google_android_gms_internal_zzamc.zza(5, com_google_android_gms_internal_zzamj222);
                    }
                }
            }
            if (this.zziY != null && this.zziY.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj2222 : this.zziY) {
                    if (com_google_android_gms_internal_zzamj2222 != null) {
                        com_google_android_gms_internal_zzamc.zza(6, com_google_android_gms_internal_zzamj2222);
                    }
                }
            }
            if (this.zziZ != null && this.zziZ.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj22222 : this.zziZ) {
                    if (com_google_android_gms_internal_zzamj22222 != null) {
                        com_google_android_gms_internal_zzamc.zza(7, com_google_android_gms_internal_zzamj22222);
                    }
                }
            }
            if (!this.zzja.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(9, this.zzja);
            }
            if (!this.zzjb.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(10, this.zzjb);
            }
            if (!this.zzjc.equals("0")) {
                com_google_android_gms_internal_zzamc.zzq(12, this.zzjc);
            }
            if (!this.version.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(13, this.version);
            }
            if (this.zzjd != null) {
                com_google_android_gms_internal_zzamc.zza(14, this.zzjd);
            }
            if (Float.floatToIntBits(this.zzje) != Float.floatToIntBits(0.0f)) {
                com_google_android_gms_internal_zzamc.zzb(15, this.zzje);
            }
            if (this.zzjg != null && this.zzjg.length > 0) {
                for (String str2 : this.zzjg) {
                    if (str2 != null) {
                        com_google_android_gms_internal_zzamc.zzq(16, str2);
                    }
                }
            }
            if (this.zzjh != 0) {
                com_google_android_gms_internal_zzamc.zzE(17, this.zzjh);
            }
            if (this.zzjf) {
                com_google_android_gms_internal_zzamc.zzj(18, this.zzjf);
            }
            if (this.zziS != null && this.zziS.length > 0) {
                while (i < this.zziS.length) {
                    String str3 = this.zziS[i];
                    if (str3 != null) {
                        com_google_android_gms_internal_zzamc.zzq(19, str3);
                    }
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzf zzI() {
            this.zziS = zzamm.zzcaq;
            this.zziT = zzamm.zzcaq;
            this.zziU = com.google.android.gms.internal.zzag.zza.zzP();
            this.zziV = zze.zzG();
            this.zziW = zzb.zzB();
            this.zziX = zzb.zzB();
            this.zziY = zzb.zzB();
            this.zziZ = zzg.zzJ();
            this.zzja = "";
            this.zzjb = "";
            this.zzjc = "0";
            this.version = "";
            this.zzjd = null;
            this.zzje = 0.0f;
            this.zzjf = false;
            this.zzjg = zzamm.zzcaq;
            this.zzjh = 0;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzf zzf(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zziT == null ? 0 : this.zziT.length;
                        obj = new String[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziT, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        this.zziT = obj;
                        continue;
                    case 18:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zziU == null ? 0 : this.zziU.length;
                        obj = new com.google.android.gms.internal.zzag.zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziU, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new com.google.android.gms.internal.zzag.zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new com.google.android.gms.internal.zzag.zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziU = obj;
                        continue;
                    case 26:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zziV == null ? 0 : this.zziV.length;
                        obj = new zze[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziV, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zze();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zze();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziV = obj;
                        continue;
                    case 34:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 34);
                        zzWC = this.zziW == null ? 0 : this.zziW.length;
                        obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziW, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziW = obj;
                        continue;
                    case 42:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 42);
                        zzWC = this.zziX == null ? 0 : this.zziX.length;
                        obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziX, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziX = obj;
                        continue;
                    case 50:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 50);
                        zzWC = this.zziY == null ? 0 : this.zziY.length;
                        obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziY, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziY = obj;
                        continue;
                    case 58:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 58);
                        zzWC = this.zziZ == null ? 0 : this.zziZ.length;
                        obj = new zzg[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziZ, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzg();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzg();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zziZ = obj;
                        continue;
                    case 74:
                        this.zzja = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 82:
                        this.zzjb = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 98:
                        this.zzjc = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 106:
                        this.version = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 114:
                        if (this.zzjd == null) {
                            this.zzjd = new zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzjd);
                        continue;
                    case 125:
                        this.zzje = com_google_android_gms_internal_zzamb.readFloat();
                        continue;
                    case 130:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 130);
                        zzWC = this.zzjg == null ? 0 : this.zzjg.length;
                        obj = new String[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjg, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        this.zzjg = obj;
                        continue;
                    case 136:
                        this.zzjh = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 144:
                        this.zzjf = com_google_android_gms_internal_zzamb.zzWI();
                        continue;
                    case 154:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 154);
                        zzWC = this.zziS == null ? 0 : this.zziS.length;
                        obj = new String[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zziS, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        this.zziS = obj;
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
            if (this.zziT == null || this.zziT.length <= 0) {
                i = zzy;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.zziT) {
                    if (str != null) {
                        i3++;
                        i2 += zzamc.zziZ(str);
                    }
                }
                i = (zzy + i2) + (i3 * 1);
            }
            if (this.zziU != null && this.zziU.length > 0) {
                i2 = i;
                for (zzamj com_google_android_gms_internal_zzamj : this.zziU) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i2 += zzamc.zzc(2, com_google_android_gms_internal_zzamj);
                    }
                }
                i = i2;
            }
            if (this.zziV != null && this.zziV.length > 0) {
                i2 = i;
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zziV) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        i2 += zzamc.zzc(3, com_google_android_gms_internal_zzamj2);
                    }
                }
                i = i2;
            }
            if (this.zziW != null && this.zziW.length > 0) {
                i2 = i;
                for (zzamj com_google_android_gms_internal_zzamj22 : this.zziW) {
                    if (com_google_android_gms_internal_zzamj22 != null) {
                        i2 += zzamc.zzc(4, com_google_android_gms_internal_zzamj22);
                    }
                }
                i = i2;
            }
            if (this.zziX != null && this.zziX.length > 0) {
                i2 = i;
                for (zzamj com_google_android_gms_internal_zzamj222 : this.zziX) {
                    if (com_google_android_gms_internal_zzamj222 != null) {
                        i2 += zzamc.zzc(5, com_google_android_gms_internal_zzamj222);
                    }
                }
                i = i2;
            }
            if (this.zziY != null && this.zziY.length > 0) {
                i2 = i;
                for (zzamj com_google_android_gms_internal_zzamj2222 : this.zziY) {
                    if (com_google_android_gms_internal_zzamj2222 != null) {
                        i2 += zzamc.zzc(6, com_google_android_gms_internal_zzamj2222);
                    }
                }
                i = i2;
            }
            if (this.zziZ != null && this.zziZ.length > 0) {
                i2 = i;
                for (zzamj com_google_android_gms_internal_zzamj22222 : this.zziZ) {
                    if (com_google_android_gms_internal_zzamj22222 != null) {
                        i2 += zzamc.zzc(7, com_google_android_gms_internal_zzamj22222);
                    }
                }
                i = i2;
            }
            if (!this.zzja.equals("")) {
                i += zzamc.zzr(9, this.zzja);
            }
            if (!this.zzjb.equals("")) {
                i += zzamc.zzr(10, this.zzjb);
            }
            if (!this.zzjc.equals("0")) {
                i += zzamc.zzr(12, this.zzjc);
            }
            if (!this.version.equals("")) {
                i += zzamc.zzr(13, this.version);
            }
            if (this.zzjd != null) {
                i += zzamc.zzc(14, this.zzjd);
            }
            if (Float.floatToIntBits(this.zzje) != Float.floatToIntBits(0.0f)) {
                i += zzamc.zzc(15, this.zzje);
            }
            if (this.zzjg != null && this.zzjg.length > 0) {
                i3 = 0;
                zzy = 0;
                for (String str2 : this.zzjg) {
                    if (str2 != null) {
                        zzy++;
                        i3 += zzamc.zziZ(str2);
                    }
                }
                i = (i + i3) + (zzy * 2);
            }
            if (this.zzjh != 0) {
                i += zzamc.zzG(17, this.zzjh);
            }
            if (this.zzjf) {
                i += zzamc.zzk(18, this.zzjf);
            }
            if (this.zziS == null || this.zziS.length <= 0) {
                return i;
            }
            i2 = 0;
            i3 = 0;
            while (i4 < this.zziS.length) {
                String str3 = this.zziS[i4];
                if (str3 != null) {
                    i3++;
                    i2 += zzamc.zziZ(str3);
                }
                i4++;
            }
            return (i + i2) + (i3 * 2);
        }
    }

    public static final class zzg extends zzamd<zzg> {
        private static volatile zzg[] zzji;
        public int[] zzjj;
        public int[] zzjk;
        public int[] zzjl;
        public int[] zzjm;
        public int[] zzjn;
        public int[] zzjo;
        public int[] zzjp;
        public int[] zzjq;
        public int[] zzjr;
        public int[] zzjs;

        public zzg() {
            zzK();
        }

        public static zzg[] zzJ() {
            if (zzji == null) {
                synchronized (zzamh.zzcai) {
                    if (zzji == null) {
                        zzji = new zzg[0];
                    }
                }
            }
            return zzji;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzg)) {
                return false;
            }
            zzg com_google_android_gms_internal_zzaf_zzg = (zzg) obj;
            return (zzamh.equals(this.zzjj, com_google_android_gms_internal_zzaf_zzg.zzjj) && zzamh.equals(this.zzjk, com_google_android_gms_internal_zzaf_zzg.zzjk) && zzamh.equals(this.zzjl, com_google_android_gms_internal_zzaf_zzg.zzjl) && zzamh.equals(this.zzjm, com_google_android_gms_internal_zzaf_zzg.zzjm) && zzamh.equals(this.zzjn, com_google_android_gms_internal_zzaf_zzg.zzjn) && zzamh.equals(this.zzjo, com_google_android_gms_internal_zzaf_zzg.zzjo) && zzamh.equals(this.zzjp, com_google_android_gms_internal_zzaf_zzg.zzjp) && zzamh.equals(this.zzjq, com_google_android_gms_internal_zzaf_zzg.zzjq) && zzamh.equals(this.zzjr, com_google_android_gms_internal_zzaf_zzg.zzjr) && zzamh.equals(this.zzjs, com_google_android_gms_internal_zzaf_zzg.zzjs)) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzg.zzcaa == null || com_google_android_gms_internal_zzaf_zzg.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzg.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzjj)) * 31) + zzamh.hashCode(this.zzjk)) * 31) + zzamh.hashCode(this.zzjl)) * 31) + zzamh.hashCode(this.zzjm)) * 31) + zzamh.hashCode(this.zzjn)) * 31) + zzamh.hashCode(this.zzjo)) * 31) + zzamh.hashCode(this.zzjp)) * 31) + zzamh.hashCode(this.zzjq)) * 31) + zzamh.hashCode(this.zzjr)) * 31) + zzamh.hashCode(this.zzjs)) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzg(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzjj != null && this.zzjj.length > 0) {
                for (int zzE : this.zzjj) {
                    com_google_android_gms_internal_zzamc.zzE(1, zzE);
                }
            }
            if (this.zzjk != null && this.zzjk.length > 0) {
                for (int zzE2 : this.zzjk) {
                    com_google_android_gms_internal_zzamc.zzE(2, zzE2);
                }
            }
            if (this.zzjl != null && this.zzjl.length > 0) {
                for (int zzE22 : this.zzjl) {
                    com_google_android_gms_internal_zzamc.zzE(3, zzE22);
                }
            }
            if (this.zzjm != null && this.zzjm.length > 0) {
                for (int zzE222 : this.zzjm) {
                    com_google_android_gms_internal_zzamc.zzE(4, zzE222);
                }
            }
            if (this.zzjn != null && this.zzjn.length > 0) {
                for (int zzE2222 : this.zzjn) {
                    com_google_android_gms_internal_zzamc.zzE(5, zzE2222);
                }
            }
            if (this.zzjo != null && this.zzjo.length > 0) {
                for (int zzE22222 : this.zzjo) {
                    com_google_android_gms_internal_zzamc.zzE(6, zzE22222);
                }
            }
            if (this.zzjp != null && this.zzjp.length > 0) {
                for (int zzE222222 : this.zzjp) {
                    com_google_android_gms_internal_zzamc.zzE(7, zzE222222);
                }
            }
            if (this.zzjq != null && this.zzjq.length > 0) {
                for (int zzE2222222 : this.zzjq) {
                    com_google_android_gms_internal_zzamc.zzE(8, zzE2222222);
                }
            }
            if (this.zzjr != null && this.zzjr.length > 0) {
                for (int zzE22222222 : this.zzjr) {
                    com_google_android_gms_internal_zzamc.zzE(9, zzE22222222);
                }
            }
            if (this.zzjs != null && this.zzjs.length > 0) {
                while (i < this.zzjs.length) {
                    com_google_android_gms_internal_zzamc.zzE(10, this.zzjs[i]);
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzg zzK() {
            this.zzjj = zzamm.zzcal;
            this.zzjk = zzamm.zzcal;
            this.zzjl = zzamm.zzcal;
            this.zzjm = zzamm.zzcal;
            this.zzjn = zzamm.zzcal;
            this.zzjo = zzamm.zzcal;
            this.zzjp = zzamm.zzcal;
            this.zzjq = zzamm.zzcal;
            this.zzjr = zzamm.zzcal;
            this.zzjs = zzamm.zzcal;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzg zzg(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                int zznW;
                Object obj2;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 8);
                        zzWC = this.zzjj == null ? 0 : this.zzjj.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjj, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjj = obj;
                        continue;
                    case 10:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjj == null ? 0 : this.zzjj.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjj, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjj = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 16:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 16);
                        zzWC = this.zzjk == null ? 0 : this.zzjk.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjk, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjk = obj;
                        continue;
                    case 18:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjk == null ? 0 : this.zzjk.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjk, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjk = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 24:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 24);
                        zzWC = this.zzjl == null ? 0 : this.zzjl.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjl, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjl = obj;
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
                        zzc = this.zzjl == null ? 0 : this.zzjl.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjl, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjl = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 32:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 32);
                        zzWC = this.zzjm == null ? 0 : this.zzjm.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjm, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjm = obj;
                        continue;
                    case 34:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjm == null ? 0 : this.zzjm.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjm, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjm = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 40:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 40);
                        zzWC = this.zzjn == null ? 0 : this.zzjn.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjn, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjn = obj;
                        continue;
                    case 42:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjn == null ? 0 : this.zzjn.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjn, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjn = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 48:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 48);
                        zzWC = this.zzjo == null ? 0 : this.zzjo.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjo, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjo = obj;
                        continue;
                    case 50:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjo == null ? 0 : this.zzjo.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjo, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjo = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 56:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 56);
                        zzWC = this.zzjp == null ? 0 : this.zzjp.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjp, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjp = obj;
                        continue;
                    case 58:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjp == null ? 0 : this.zzjp.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjp, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjp = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 64:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 64);
                        zzWC = this.zzjq == null ? 0 : this.zzjq.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjq, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjq = obj;
                        continue;
                    case 66:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjq == null ? 0 : this.zzjq.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjq, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjq = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 72:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 72);
                        zzWC = this.zzjr == null ? 0 : this.zzjr.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjr, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjr = obj;
                        continue;
                    case 74:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjr == null ? 0 : this.zzjr.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjr, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjr = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 80:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 80);
                        zzWC = this.zzjs == null ? 0 : this.zzjs.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjs, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjs = obj;
                        continue;
                    case 82:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjs == null ? 0 : this.zzjs.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjs, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjs = obj2;
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
            int i3 = 0;
            int zzy = super.zzy();
            if (this.zzjj == null || this.zzjj.length <= 0) {
                i = zzy;
            } else {
                i2 = 0;
                for (int zzoc : this.zzjj) {
                    i2 += zzamc.zzoc(zzoc);
                }
                i = (zzy + i2) + (this.zzjj.length * 1);
            }
            if (this.zzjk != null && this.zzjk.length > 0) {
                zzy = 0;
                for (int zzoc2 : this.zzjk) {
                    zzy += zzamc.zzoc(zzoc2);
                }
                i = (i + zzy) + (this.zzjk.length * 1);
            }
            if (this.zzjl != null && this.zzjl.length > 0) {
                zzy = 0;
                for (int zzoc22 : this.zzjl) {
                    zzy += zzamc.zzoc(zzoc22);
                }
                i = (i + zzy) + (this.zzjl.length * 1);
            }
            if (this.zzjm != null && this.zzjm.length > 0) {
                zzy = 0;
                for (int zzoc222 : this.zzjm) {
                    zzy += zzamc.zzoc(zzoc222);
                }
                i = (i + zzy) + (this.zzjm.length * 1);
            }
            if (this.zzjn != null && this.zzjn.length > 0) {
                zzy = 0;
                for (int zzoc2222 : this.zzjn) {
                    zzy += zzamc.zzoc(zzoc2222);
                }
                i = (i + zzy) + (this.zzjn.length * 1);
            }
            if (this.zzjo != null && this.zzjo.length > 0) {
                zzy = 0;
                for (int zzoc22222 : this.zzjo) {
                    zzy += zzamc.zzoc(zzoc22222);
                }
                i = (i + zzy) + (this.zzjo.length * 1);
            }
            if (this.zzjp != null && this.zzjp.length > 0) {
                zzy = 0;
                for (int zzoc222222 : this.zzjp) {
                    zzy += zzamc.zzoc(zzoc222222);
                }
                i = (i + zzy) + (this.zzjp.length * 1);
            }
            if (this.zzjq != null && this.zzjq.length > 0) {
                zzy = 0;
                for (int zzoc2222222 : this.zzjq) {
                    zzy += zzamc.zzoc(zzoc2222222);
                }
                i = (i + zzy) + (this.zzjq.length * 1);
            }
            if (this.zzjr != null && this.zzjr.length > 0) {
                zzy = 0;
                for (int zzoc22222222 : this.zzjr) {
                    zzy += zzamc.zzoc(zzoc22222222);
                }
                i = (i + zzy) + (this.zzjr.length * 1);
            }
            if (this.zzjs == null || this.zzjs.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.zzjs.length) {
                i2 += zzamc.zzoc(this.zzjs[i3]);
                i3++;
            }
            return (i + i2) + (this.zzjs.length * 1);
        }
    }

    public static final class zzh extends zzamd<zzh> {
        public static final zzame<com.google.android.gms.internal.zzag.zza, zzh> zzjt = zzame.zza(11, zzh.class, 810);
        private static final zzh[] zzju = new zzh[0];
        public int zzjA;
        public int zzjB;
        public int[] zzjv;
        public int[] zzjw;
        public int[] zzjx;
        public int zzjy;
        public int[] zzjz;

        public zzh() {
            zzL();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzh)) {
                return false;
            }
            zzh com_google_android_gms_internal_zzaf_zzh = (zzh) obj;
            return (zzamh.equals(this.zzjv, com_google_android_gms_internal_zzaf_zzh.zzjv) && zzamh.equals(this.zzjw, com_google_android_gms_internal_zzaf_zzh.zzjw) && zzamh.equals(this.zzjx, com_google_android_gms_internal_zzaf_zzh.zzjx) && this.zzjy == com_google_android_gms_internal_zzaf_zzh.zzjy && zzamh.equals(this.zzjz, com_google_android_gms_internal_zzaf_zzh.zzjz) && this.zzjA == com_google_android_gms_internal_zzaf_zzh.zzjA && this.zzjB == com_google_android_gms_internal_zzaf_zzh.zzjB) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzh.zzcaa == null || com_google_android_gms_internal_zzaf_zzh.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzh.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzjv)) * 31) + zzamh.hashCode(this.zzjw)) * 31) + zzamh.hashCode(this.zzjx)) * 31) + this.zzjy) * 31) + zzamh.hashCode(this.zzjz)) * 31) + this.zzjA) * 31) + this.zzjB) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzh(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzjv != null && this.zzjv.length > 0) {
                for (int zzE : this.zzjv) {
                    com_google_android_gms_internal_zzamc.zzE(1, zzE);
                }
            }
            if (this.zzjw != null && this.zzjw.length > 0) {
                for (int zzE2 : this.zzjw) {
                    com_google_android_gms_internal_zzamc.zzE(2, zzE2);
                }
            }
            if (this.zzjx != null && this.zzjx.length > 0) {
                for (int zzE22 : this.zzjx) {
                    com_google_android_gms_internal_zzamc.zzE(3, zzE22);
                }
            }
            if (this.zzjy != 0) {
                com_google_android_gms_internal_zzamc.zzE(4, this.zzjy);
            }
            if (this.zzjz != null && this.zzjz.length > 0) {
                while (i < this.zzjz.length) {
                    com_google_android_gms_internal_zzamc.zzE(5, this.zzjz[i]);
                    i++;
                }
            }
            if (this.zzjA != 0) {
                com_google_android_gms_internal_zzamc.zzE(6, this.zzjA);
            }
            if (this.zzjB != 0) {
                com_google_android_gms_internal_zzamc.zzE(7, this.zzjB);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzh zzL() {
            this.zzjv = zzamm.zzcal;
            this.zzjw = zzamm.zzcal;
            this.zzjx = zzamm.zzcal;
            this.zzjy = 0;
            this.zzjz = zzamm.zzcal;
            this.zzjA = 0;
            this.zzjB = 0;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzh zzh(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                int zznW;
                Object obj2;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 8);
                        zzWC = this.zzjv == null ? 0 : this.zzjv.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjv, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjv = obj;
                        continue;
                    case 10:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjv == null ? 0 : this.zzjv.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjv, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjv = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 16:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 16);
                        zzWC = this.zzjw == null ? 0 : this.zzjw.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjw, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjw = obj;
                        continue;
                    case 18:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjw == null ? 0 : this.zzjw.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjw, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjw = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 24:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 24);
                        zzWC = this.zzjx == null ? 0 : this.zzjx.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjx, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjx = obj;
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
                        zzc = this.zzjx == null ? 0 : this.zzjx.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjx, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjx = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 32:
                        this.zzjy = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 40:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 40);
                        zzWC = this.zzjz == null ? 0 : this.zzjz.length;
                        obj = new int[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjz, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWG();
                        this.zzjz = obj;
                        continue;
                    case 42:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWG();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzjz == null ? 0 : this.zzjz.length;
                        obj2 = new int[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzjz, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWG();
                            zzc++;
                        }
                        this.zzjz = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 48:
                        this.zzjA = com_google_android_gms_internal_zzamb.zzWG();
                        continue;
                    case 56:
                        this.zzjB = com_google_android_gms_internal_zzamb.zzWG();
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
            int i3 = 0;
            int zzy = super.zzy();
            if (this.zzjv == null || this.zzjv.length <= 0) {
                i = zzy;
            } else {
                i2 = 0;
                for (int zzoc : this.zzjv) {
                    i2 += zzamc.zzoc(zzoc);
                }
                i = (zzy + i2) + (this.zzjv.length * 1);
            }
            if (this.zzjw != null && this.zzjw.length > 0) {
                zzy = 0;
                for (int zzoc2 : this.zzjw) {
                    zzy += zzamc.zzoc(zzoc2);
                }
                i = (i + zzy) + (this.zzjw.length * 1);
            }
            if (this.zzjx != null && this.zzjx.length > 0) {
                zzy = 0;
                for (int zzoc22 : this.zzjx) {
                    zzy += zzamc.zzoc(zzoc22);
                }
                i = (i + zzy) + (this.zzjx.length * 1);
            }
            if (this.zzjy != 0) {
                i += zzamc.zzG(4, this.zzjy);
            }
            if (this.zzjz != null && this.zzjz.length > 0) {
                i2 = 0;
                while (i3 < this.zzjz.length) {
                    i2 += zzamc.zzoc(this.zzjz[i3]);
                    i3++;
                }
                i = (i + i2) + (this.zzjz.length * 1);
            }
            if (this.zzjA != 0) {
                i += zzamc.zzG(6, this.zzjA);
            }
            return this.zzjB != 0 ? i + zzamc.zzG(7, this.zzjB) : i;
        }
    }

    public static final class zzi extends zzamd<zzi> {
        private static volatile zzi[] zzjC;
        public String name;
        public com.google.android.gms.internal.zzag.zza zzjD;
        public zzd zzjE;

        public zzi() {
            zzN();
        }

        public static zzi[] zzM() {
            if (zzjC == null) {
                synchronized (zzamh.zzcai) {
                    if (zzjC == null) {
                        zzjC = new zzi[0];
                    }
                }
            }
            return zzjC;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzi)) {
                return false;
            }
            zzi com_google_android_gms_internal_zzaf_zzi = (zzi) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzaf_zzi.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzaf_zzi.name)) {
                return false;
            }
            if (this.zzjD == null) {
                if (com_google_android_gms_internal_zzaf_zzi.zzjD != null) {
                    return false;
                }
            } else if (!this.zzjD.equals(com_google_android_gms_internal_zzaf_zzi.zzjD)) {
                return false;
            }
            if (this.zzjE == null) {
                if (com_google_android_gms_internal_zzaf_zzi.zzjE != null) {
                    return false;
                }
            } else if (!this.zzjE.equals(com_google_android_gms_internal_zzaf_zzi.zzjE)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzi.zzcaa == null || com_google_android_gms_internal_zzaf_zzi.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzi.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzjE == null ? 0 : this.zzjE.hashCode()) + (((this.zzjD == null ? 0 : this.zzjD.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzi(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.name.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.name);
            }
            if (this.zzjD != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzjD);
            }
            if (this.zzjE != null) {
                com_google_android_gms_internal_zzamc.zza(3, this.zzjE);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzi zzN() {
            this.name = "";
            this.zzjD = null;
            this.zzjE = null;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzi zzi(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        if (this.zzjD == null) {
                            this.zzjD = new com.google.android.gms.internal.zzag.zza();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzjD);
                        continue;
                    case 26:
                        if (this.zzjE == null) {
                            this.zzjE = new zzd();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzjE);
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
            if (!this.name.equals("")) {
                zzy += zzamc.zzr(1, this.name);
            }
            if (this.zzjD != null) {
                zzy += zzamc.zzc(2, this.zzjD);
            }
            return this.zzjE != null ? zzy + zzamc.zzc(3, this.zzjE) : zzy;
        }
    }

    public static final class zzj extends zzamd<zzj> {
        public zzi[] zzjF;
        public zzf zzjG;
        public String zzjH;

        public zzj() {
            zzO();
        }

        public static zzj zzd(byte[] bArr) throws zzami {
            return (zzj) zzamj.mergeFrom(new zzj(), bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzj)) {
                return false;
            }
            zzj com_google_android_gms_internal_zzaf_zzj = (zzj) obj;
            if (!zzamh.equals(this.zzjF, com_google_android_gms_internal_zzaf_zzj.zzjF)) {
                return false;
            }
            if (this.zzjG == null) {
                if (com_google_android_gms_internal_zzaf_zzj.zzjG != null) {
                    return false;
                }
            } else if (!this.zzjG.equals(com_google_android_gms_internal_zzaf_zzj.zzjG)) {
                return false;
            }
            if (this.zzjH == null) {
                if (com_google_android_gms_internal_zzaf_zzj.zzjH != null) {
                    return false;
                }
            } else if (!this.zzjH.equals(com_google_android_gms_internal_zzaf_zzj.zzjH)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzaf_zzj.zzcaa == null || com_google_android_gms_internal_zzaf_zzj.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzaf_zzj.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzjH == null ? 0 : this.zzjH.hashCode()) + (((this.zzjG == null ? 0 : this.zzjG.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzjF)) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzj(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzjF != null && this.zzjF.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzjF) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzjG != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzjG);
            }
            if (!this.zzjH.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(3, this.zzjH);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzj zzO() {
            this.zzjF = zzi.zzM();
            this.zzjG = null;
            this.zzjH = "";
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzj zzj(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zzjF == null ? 0 : this.zzjF.length;
                        Object obj = new zzi[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzjF, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzi();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzi();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzjF = obj;
                        continue;
                    case 18:
                        if (this.zzjG == null) {
                            this.zzjG = new zzf();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzjG);
                        continue;
                    case 26:
                        this.zzjH = com_google_android_gms_internal_zzamb.readString();
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
            if (this.zzjF != null && this.zzjF.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzjF) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        zzy += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzjG != null) {
                zzy += zzamc.zzc(2, this.zzjG);
            }
            return !this.zzjH.equals("") ? zzy + zzamc.zzr(3, this.zzjH) : zzy;
        }
    }
}
