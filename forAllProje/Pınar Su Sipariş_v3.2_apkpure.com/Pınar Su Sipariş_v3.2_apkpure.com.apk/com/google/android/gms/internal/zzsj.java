package com.google.android.gms.internal;

import java.io.IOException;

public interface zzsj {

    public static final class zza extends zzamd<zza> {
        public zza[] zzaTy;

        public static final class zza extends zzamd<zza> {
            private static volatile zza[] zzaTz;
            public int viewId;
            public String zzaTA;
            public String zzaTB;

            public zza() {
                zzBV();
            }

            public static zza[] zzBU() {
                if (zzaTz == null) {
                    synchronized (zzamh.zzcai) {
                        if (zzaTz == null) {
                            zzaTz = new zza[0];
                        }
                    }
                }
                return zzaTz;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza com_google_android_gms_internal_zzsj_zza_zza = (zza) obj;
                if (this.zzaTA == null) {
                    if (com_google_android_gms_internal_zzsj_zza_zza.zzaTA != null) {
                        return false;
                    }
                } else if (!this.zzaTA.equals(com_google_android_gms_internal_zzsj_zza_zza.zzaTA)) {
                    return false;
                }
                if (this.zzaTB == null) {
                    if (com_google_android_gms_internal_zzsj_zza_zza.zzaTB != null) {
                        return false;
                    }
                } else if (!this.zzaTB.equals(com_google_android_gms_internal_zzsj_zza_zza.zzaTB)) {
                    return false;
                }
                return this.viewId == com_google_android_gms_internal_zzsj_zza_zza.viewId ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzsj_zza_zza.zzcaa == null || com_google_android_gms_internal_zzsj_zza_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzsj_zza_zza.zzcaa) : false;
            }

            public int hashCode() {
                int i = 0;
                int hashCode = ((((this.zzaTB == null ? 0 : this.zzaTB.hashCode()) + (((this.zzaTA == null ? 0 : this.zzaTA.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + this.viewId) * 31;
                if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                    i = this.zzcaa.hashCode();
                }
                return hashCode + i;
            }

            public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                return zzp(com_google_android_gms_internal_zzamb);
            }

            public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
                if (!this.zzaTA.equals("")) {
                    com_google_android_gms_internal_zzamc.zzq(1, this.zzaTA);
                }
                if (!this.zzaTB.equals("")) {
                    com_google_android_gms_internal_zzamc.zzq(2, this.zzaTB);
                }
                if (this.viewId != 0) {
                    com_google_android_gms_internal_zzamc.zzE(3, this.viewId);
                }
                super.writeTo(com_google_android_gms_internal_zzamc);
            }

            public zza zzBV() {
                this.zzaTA = "";
                this.zzaTB = "";
                this.viewId = 0;
                this.zzcaa = null;
                this.zzcaj = -1;
                return this;
            }

            public zza zzp(zzamb com_google_android_gms_internal_zzamb) throws IOException {
                while (true) {
                    int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                    switch (zzWC) {
                        case 0:
                            break;
                        case 10:
                            this.zzaTA = com_google_android_gms_internal_zzamb.readString();
                            continue;
                        case 18:
                            this.zzaTB = com_google_android_gms_internal_zzamb.readString();
                            continue;
                        case 24:
                            this.viewId = com_google_android_gms_internal_zzamb.zzWG();
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
                if (!this.zzaTA.equals("")) {
                    zzy += zzamc.zzr(1, this.zzaTA);
                }
                if (!this.zzaTB.equals("")) {
                    zzy += zzamc.zzr(2, this.zzaTB);
                }
                return this.viewId != 0 ? zzy + zzamc.zzG(3, this.viewId) : zzy;
            }
        }

        public zza() {
            zzBT();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzsj_zza = (zza) obj;
            return zzamh.equals(this.zzaTy, com_google_android_gms_internal_zzsj_zza.zzaTy) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzsj_zza.zzcaa == null || com_google_android_gms_internal_zzsj_zza.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzsj_zza.zzcaa) : false;
        }

        public int hashCode() {
            int hashCode = (((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzaTy)) * 31;
            int hashCode2 = (this.zzcaa == null || this.zzcaa.isEmpty()) ? 0 : this.zzcaa.hashCode();
            return hashCode2 + hashCode;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzo(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzaTy != null && this.zzaTy.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzaTy) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzBT() {
            this.zzaTy = zza.zzBU();
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zza zzo(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zzaTy == null ? 0 : this.zzaTy.length;
                        Object obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzaTy, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzaTy = obj;
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
            if (this.zzaTy != null && this.zzaTy.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzaTy) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        zzy += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            return zzy;
        }
    }

    public static final class zzb extends zzamd<zzb> {
        private static volatile zzb[] zzaTC;
        public String name;
        public zzd zzaTD;

        public zzb() {
            zzBX();
        }

        public static zzb[] zzBW() {
            if (zzaTC == null) {
                synchronized (zzamh.zzcai) {
                    if (zzaTC == null) {
                        zzaTC = new zzb[0];
                    }
                }
            }
            return zzaTC;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzsj_zzb = (zzb) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzsj_zzb.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzsj_zzb.name)) {
                return false;
            }
            if (this.zzaTD == null) {
                if (com_google_android_gms_internal_zzsj_zzb.zzaTD != null) {
                    return false;
                }
            } else if (!this.zzaTD.equals(com_google_android_gms_internal_zzsj_zzb.zzaTD)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzsj_zzb.zzcaa == null || com_google_android_gms_internal_zzsj_zzb.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzsj_zzb.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzaTD == null ? 0 : this.zzaTD.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzq(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.name.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.name);
            }
            if (this.zzaTD != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzaTD);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzBX() {
            this.name = "";
            this.zzaTD = null;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzb zzq(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        if (this.zzaTD == null) {
                            this.zzaTD = new zzd();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzaTD);
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
            return this.zzaTD != null ? zzy + zzamc.zzc(2, this.zzaTD) : zzy;
        }
    }

    public static final class zzc extends zzamd<zzc> {
        public String type;
        public zzb[] zzaTE;

        public zzc() {
            zzBY();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzsj_zzc = (zzc) obj;
            if (this.type == null) {
                if (com_google_android_gms_internal_zzsj_zzc.type != null) {
                    return false;
                }
            } else if (!this.type.equals(com_google_android_gms_internal_zzsj_zzc.type)) {
                return false;
            }
            return zzamh.equals(this.zzaTE, com_google_android_gms_internal_zzsj_zzc.zzaTE) ? (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzsj_zzc.zzcaa == null || com_google_android_gms_internal_zzsj_zzc.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzsj_zzc.zzcaa) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.type == null ? 0 : this.type.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + zzamh.hashCode(this.zzaTE)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzr(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (!this.type.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(1, this.type);
            }
            if (this.zzaTE != null && this.zzaTE.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzaTE) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzBY() {
            this.type = "";
            this.zzaTE = zzb.zzBW();
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzc zzr(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.type = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzaTE == null ? 0 : this.zzaTE.length;
                        Object obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzaTE, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzaTE = obj;
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
            if (!this.type.equals("")) {
                zzy += zzamc.zzr(1, this.type);
            }
            if (this.zzaTE == null || this.zzaTE.length <= 0) {
                return zzy;
            }
            int i = zzy;
            for (zzamj com_google_android_gms_internal_zzamj : this.zzaTE) {
                if (com_google_android_gms_internal_zzamj != null) {
                    i += zzamc.zzc(2, com_google_android_gms_internal_zzamj);
                }
            }
            return i;
        }
    }

    public static final class zzd extends zzamd<zzd> {
        public boolean zzaTF;
        public long zzaTG;
        public double zzaTH;
        public zzc zzaTI;
        public String zzasH;

        public zzd() {
            zzBZ();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzsj_zzd = (zzd) obj;
            if (this.zzaTF != com_google_android_gms_internal_zzsj_zzd.zzaTF) {
                return false;
            }
            if (this.zzasH == null) {
                if (com_google_android_gms_internal_zzsj_zzd.zzasH != null) {
                    return false;
                }
            } else if (!this.zzasH.equals(com_google_android_gms_internal_zzsj_zzd.zzasH)) {
                return false;
            }
            if (this.zzaTG != com_google_android_gms_internal_zzsj_zzd.zzaTG || Double.doubleToLongBits(this.zzaTH) != Double.doubleToLongBits(com_google_android_gms_internal_zzsj_zzd.zzaTH)) {
                return false;
            }
            if (this.zzaTI == null) {
                if (com_google_android_gms_internal_zzsj_zzd.zzaTI != null) {
                    return false;
                }
            } else if (!this.zzaTI.equals(com_google_android_gms_internal_zzsj_zzd.zzaTI)) {
                return false;
            }
            return (this.zzcaa == null || this.zzcaa.isEmpty()) ? com_google_android_gms_internal_zzsj_zzd.zzcaa == null || com_google_android_gms_internal_zzsj_zzd.zzcaa.isEmpty() : this.zzcaa.equals(com_google_android_gms_internal_zzsj_zzd.zzcaa);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((this.zzasH == null ? 0 : this.zzasH.hashCode()) + (((this.zzaTF ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + ((int) (this.zzaTG ^ (this.zzaTG >>> 32)));
            long doubleToLongBits = Double.doubleToLongBits(this.zzaTH);
            hashCode = ((this.zzaTI == null ? 0 : this.zzaTI.hashCode()) + (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31)) * 31;
            if (!(this.zzcaa == null || this.zzcaa.isEmpty())) {
                i = this.zzcaa.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzs(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzaTF) {
                com_google_android_gms_internal_zzamc.zzj(1, this.zzaTF);
            }
            if (!this.zzasH.equals("")) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzasH);
            }
            if (this.zzaTG != 0) {
                com_google_android_gms_internal_zzamc.zzb(3, this.zzaTG);
            }
            if (Double.doubleToLongBits(this.zzaTH) != Double.doubleToLongBits(0.0d)) {
                com_google_android_gms_internal_zzamc.zza(4, this.zzaTH);
            }
            if (this.zzaTI != null) {
                com_google_android_gms_internal_zzamc.zza(5, this.zzaTI);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzd zzBZ() {
            this.zzaTF = false;
            this.zzasH = "";
            this.zzaTG = 0;
            this.zzaTH = 0.0d;
            this.zzaTI = null;
            this.zzcaa = null;
            this.zzcaj = -1;
            return this;
        }

        public zzd zzs(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzaTF = com_google_android_gms_internal_zzamb.zzWI();
                        continue;
                    case 18:
                        this.zzasH = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        this.zzaTG = com_google_android_gms_internal_zzamb.zzWF();
                        continue;
                    case 33:
                        this.zzaTH = com_google_android_gms_internal_zzamb.readDouble();
                        continue;
                    case 42:
                        if (this.zzaTI == null) {
                            this.zzaTI = new zzc();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzaTI);
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
            if (this.zzaTF) {
                zzy += zzamc.zzk(1, this.zzaTF);
            }
            if (!this.zzasH.equals("")) {
                zzy += zzamc.zzr(2, this.zzasH);
            }
            if (this.zzaTG != 0) {
                zzy += zzamc.zze(3, this.zzaTG);
            }
            if (Double.doubleToLongBits(this.zzaTH) != Double.doubleToLongBits(0.0d)) {
                zzy += zzamc.zzb(4, this.zzaTH);
            }
            return this.zzaTI != null ? zzy + zzamc.zzc(5, this.zzaTI) : zzy;
        }
    }
}
