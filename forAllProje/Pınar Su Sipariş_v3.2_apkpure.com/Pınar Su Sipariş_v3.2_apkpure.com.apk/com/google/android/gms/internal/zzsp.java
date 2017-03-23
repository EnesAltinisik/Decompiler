package com.google.android.gms.internal;

import java.io.IOException;

public interface zzsp {

    public static final class zza extends zzamj {
        private static volatile zza[] zzbgR;
        public zzf zzbgS;
        public zzf zzbgT;
        public Boolean zzbgU;
        public Integer zzbgi;

        public zza() {
            zzHc();
        }

        public static zza[] zzHb() {
            if (zzbgR == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgR == null) {
                        zzbgR = new zza[0];
                    }
                }
            }
            return zzbgR;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzsp_zza = (zza) obj;
            if (this.zzbgi == null) {
                if (com_google_android_gms_internal_zzsp_zza.zzbgi != null) {
                    return false;
                }
            } else if (!this.zzbgi.equals(com_google_android_gms_internal_zzsp_zza.zzbgi)) {
                return false;
            }
            if (this.zzbgS == null) {
                if (com_google_android_gms_internal_zzsp_zza.zzbgS != null) {
                    return false;
                }
            } else if (!this.zzbgS.equals(com_google_android_gms_internal_zzsp_zza.zzbgS)) {
                return false;
            }
            if (this.zzbgT == null) {
                if (com_google_android_gms_internal_zzsp_zza.zzbgT != null) {
                    return false;
                }
            } else if (!this.zzbgT.equals(com_google_android_gms_internal_zzsp_zza.zzbgT)) {
                return false;
            }
            return this.zzbgU == null ? com_google_android_gms_internal_zzsp_zza.zzbgU == null : this.zzbgU.equals(com_google_android_gms_internal_zzsp_zza.zzbgU);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgT == null ? 0 : this.zzbgT.hashCode()) + (((this.zzbgS == null ? 0 : this.zzbgS.hashCode()) + (((this.zzbgi == null ? 0 : this.zzbgi.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.zzbgU != null) {
                i = this.zzbgU.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzC(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgi != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbgi.intValue());
            }
            if (this.zzbgS != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzbgS);
            }
            if (this.zzbgT != null) {
                com_google_android_gms_internal_zzamc.zza(3, this.zzbgT);
            }
            if (this.zzbgU != null) {
                com_google_android_gms_internal_zzamc.zzj(4, this.zzbgU.booleanValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzC(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbgi = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 18:
                        if (this.zzbgS == null) {
                            this.zzbgS = new zzf();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbgS);
                        continue;
                    case 26:
                        if (this.zzbgT == null) {
                            this.zzbgT = new zzf();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbgT);
                        continue;
                    case 32:
                        this.zzbgU = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
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

        public zza zzHc() {
            this.zzbgi = null;
            this.zzbgS = null;
            this.zzbgT = null;
            this.zzbgU = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbgi != null) {
                zzy += zzamc.zzG(1, this.zzbgi.intValue());
            }
            if (this.zzbgS != null) {
                zzy += zzamc.zzc(2, this.zzbgS);
            }
            if (this.zzbgT != null) {
                zzy += zzamc.zzc(3, this.zzbgT);
            }
            return this.zzbgU != null ? zzy + zzamc.zzk(4, this.zzbgU.booleanValue()) : zzy;
        }
    }

    public static final class zzb extends zzamj {
        private static volatile zzb[] zzbgV;
        public Integer count;
        public String name;
        public zzc[] zzbgW;
        public Long zzbgX;
        public Long zzbgY;

        public zzb() {
            zzHe();
        }

        public static zzb[] zzHd() {
            if (zzbgV == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgV == null) {
                        zzbgV = new zzb[0];
                    }
                }
            }
            return zzbgV;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzsp_zzb = (zzb) obj;
            if (!zzamh.equals(this.zzbgW, com_google_android_gms_internal_zzsp_zzb.zzbgW)) {
                return false;
            }
            if (this.name == null) {
                if (com_google_android_gms_internal_zzsp_zzb.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzsp_zzb.name)) {
                return false;
            }
            if (this.zzbgX == null) {
                if (com_google_android_gms_internal_zzsp_zzb.zzbgX != null) {
                    return false;
                }
            } else if (!this.zzbgX.equals(com_google_android_gms_internal_zzsp_zzb.zzbgX)) {
                return false;
            }
            if (this.zzbgY == null) {
                if (com_google_android_gms_internal_zzsp_zzb.zzbgY != null) {
                    return false;
                }
            } else if (!this.zzbgY.equals(com_google_android_gms_internal_zzsp_zzb.zzbgY)) {
                return false;
            }
            return this.count == null ? com_google_android_gms_internal_zzsp_zzb.count == null : this.count.equals(com_google_android_gms_internal_zzsp_zzb.count);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgY == null ? 0 : this.zzbgY.hashCode()) + (((this.zzbgX == null ? 0 : this.zzbgX.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzbgW)) * 31)) * 31)) * 31)) * 31;
            if (this.count != null) {
                i = this.count.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzD(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgW != null && this.zzbgW.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgW) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.name != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.name);
            }
            if (this.zzbgX != null) {
                com_google_android_gms_internal_zzamc.zzb(3, this.zzbgX.longValue());
            }
            if (this.zzbgY != null) {
                com_google_android_gms_internal_zzamc.zzb(4, this.zzbgY.longValue());
            }
            if (this.count != null) {
                com_google_android_gms_internal_zzamc.zzE(5, this.count.intValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzD(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zzbgW == null ? 0 : this.zzbgW.length;
                        Object obj = new zzc[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgW, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzc();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzc();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgW = obj;
                        continue;
                    case 18:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        this.zzbgX = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 32:
                        this.zzbgY = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 40:
                        this.count = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
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

        public zzb zzHe() {
            this.zzbgW = zzc.zzHf();
            this.name = null;
            this.zzbgX = null;
            this.zzbgY = null;
            this.count = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbgW != null && this.zzbgW.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgW) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        zzy += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.name != null) {
                zzy += zzamc.zzr(2, this.name);
            }
            if (this.zzbgX != null) {
                zzy += zzamc.zze(3, this.zzbgX.longValue());
            }
            if (this.zzbgY != null) {
                zzy += zzamc.zze(4, this.zzbgY.longValue());
            }
            return this.count != null ? zzy + zzamc.zzG(5, this.count.intValue()) : zzy;
        }
    }

    public static final class zzc extends zzamj {
        private static volatile zzc[] zzbgZ;
        public String name;
        public String zzasH;
        public Float zzbge;
        public Double zzbgf;
        public Long zzbha;

        public zzc() {
            zzHg();
        }

        public static zzc[] zzHf() {
            if (zzbgZ == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgZ == null) {
                        zzbgZ = new zzc[0];
                    }
                }
            }
            return zzbgZ;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzsp_zzc = (zzc) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzsp_zzc.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzsp_zzc.name)) {
                return false;
            }
            if (this.zzasH == null) {
                if (com_google_android_gms_internal_zzsp_zzc.zzasH != null) {
                    return false;
                }
            } else if (!this.zzasH.equals(com_google_android_gms_internal_zzsp_zzc.zzasH)) {
                return false;
            }
            if (this.zzbha == null) {
                if (com_google_android_gms_internal_zzsp_zzc.zzbha != null) {
                    return false;
                }
            } else if (!this.zzbha.equals(com_google_android_gms_internal_zzsp_zzc.zzbha)) {
                return false;
            }
            if (this.zzbge == null) {
                if (com_google_android_gms_internal_zzsp_zzc.zzbge != null) {
                    return false;
                }
            } else if (!this.zzbge.equals(com_google_android_gms_internal_zzsp_zzc.zzbge)) {
                return false;
            }
            return this.zzbgf == null ? com_google_android_gms_internal_zzsp_zzc.zzbgf == null : this.zzbgf.equals(com_google_android_gms_internal_zzsp_zzc.zzbgf);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbge == null ? 0 : this.zzbge.hashCode()) + (((this.zzbha == null ? 0 : this.zzbha.hashCode()) + (((this.zzasH == null ? 0 : this.zzasH.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.zzbgf != null) {
                i = this.zzbgf.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzE(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.name != null) {
                com_google_android_gms_internal_zzamc.zzq(1, this.name);
            }
            if (this.zzasH != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzasH);
            }
            if (this.zzbha != null) {
                com_google_android_gms_internal_zzamc.zzb(3, this.zzbha.longValue());
            }
            if (this.zzbge != null) {
                com_google_android_gms_internal_zzamc.zzb(4, this.zzbge.floatValue());
            }
            if (this.zzbgf != null) {
                com_google_android_gms_internal_zzamc.zza(5, this.zzbgf.doubleValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzE(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 18:
                        this.zzasH = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        this.zzbha = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 37:
                        this.zzbge = Float.valueOf(com_google_android_gms_internal_zzamb.readFloat());
                        continue;
                    case 41:
                        this.zzbgf = Double.valueOf(com_google_android_gms_internal_zzamb.readDouble());
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

        public zzc zzHg() {
            this.name = null;
            this.zzasH = null;
            this.zzbha = null;
            this.zzbge = null;
            this.zzbgf = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.name != null) {
                zzy += zzamc.zzr(1, this.name);
            }
            if (this.zzasH != null) {
                zzy += zzamc.zzr(2, this.zzasH);
            }
            if (this.zzbha != null) {
                zzy += zzamc.zze(3, this.zzbha.longValue());
            }
            if (this.zzbge != null) {
                zzy += zzamc.zzc(4, this.zzbge.floatValue());
            }
            return this.zzbgf != null ? zzy + zzamc.zzb(5, this.zzbgf.doubleValue()) : zzy;
        }
    }

    public static final class zzd extends zzamj {
        public zze[] zzbhb;

        public zzd() {
            zzHh();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            return zzamh.equals(this.zzbhb, ((zzd) obj).zzbhb);
        }

        public int hashCode() {
            return ((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzbhb);
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzF(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbhb != null && this.zzbhb.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbhb) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzd zzF(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 10);
                        zzWC = this.zzbhb == null ? 0 : this.zzbhb.length;
                        Object obj = new zze[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbhb, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zze();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zze();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbhb = obj;
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

        public zzd zzHh() {
            this.zzbhb = zze.zzHi();
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbhb != null && this.zzbhb.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbhb) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        zzy += zzamc.zzc(1, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            return zzy;
        }
    }

    public static final class zze extends zzamj {
        private static volatile zze[] zzbhc;
        public String appId;
        public String osVersion;
        public String zzaUf;
        public String zzbbK;
        public String zzbbL;
        public String zzbbO;
        public String zzbbS;
        public Integer zzbhA;
        public String zzbhB;
        public Integer zzbhd;
        public zzb[] zzbhe;
        public zzg[] zzbhf;
        public Long zzbhg;
        public Long zzbhh;
        public Long zzbhi;
        public Long zzbhj;
        public Long zzbhk;
        public String zzbhl;
        public String zzbhm;
        public String zzbhn;
        public Integer zzbho;
        public Long zzbhp;
        public Long zzbhq;
        public String zzbhr;
        public Boolean zzbhs;
        public String zzbht;
        public Long zzbhu;
        public Integer zzbhv;
        public Boolean zzbhw;
        public zza[] zzbhx;
        public Integer zzbhy;
        public Integer zzbhz;

        public zze() {
            zzHj();
        }

        public static zze[] zzHi() {
            if (zzbhc == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbhc == null) {
                        zzbhc = new zze[0];
                    }
                }
            }
            return zzbhc;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzsp_zze = (zze) obj;
            if (this.zzbhd == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhd != null) {
                    return false;
                }
            } else if (!this.zzbhd.equals(com_google_android_gms_internal_zzsp_zze.zzbhd)) {
                return false;
            }
            if (!zzamh.equals(this.zzbhe, com_google_android_gms_internal_zzsp_zze.zzbhe)) {
                return false;
            }
            if (!zzamh.equals(this.zzbhf, com_google_android_gms_internal_zzsp_zze.zzbhf)) {
                return false;
            }
            if (this.zzbhg == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhg != null) {
                    return false;
                }
            } else if (!this.zzbhg.equals(com_google_android_gms_internal_zzsp_zze.zzbhg)) {
                return false;
            }
            if (this.zzbhh == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhh != null) {
                    return false;
                }
            } else if (!this.zzbhh.equals(com_google_android_gms_internal_zzsp_zze.zzbhh)) {
                return false;
            }
            if (this.zzbhi == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhi != null) {
                    return false;
                }
            } else if (!this.zzbhi.equals(com_google_android_gms_internal_zzsp_zze.zzbhi)) {
                return false;
            }
            if (this.zzbhj == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhj != null) {
                    return false;
                }
            } else if (!this.zzbhj.equals(com_google_android_gms_internal_zzsp_zze.zzbhj)) {
                return false;
            }
            if (this.zzbhk == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhk != null) {
                    return false;
                }
            } else if (!this.zzbhk.equals(com_google_android_gms_internal_zzsp_zze.zzbhk)) {
                return false;
            }
            if (this.zzbhl == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhl != null) {
                    return false;
                }
            } else if (!this.zzbhl.equals(com_google_android_gms_internal_zzsp_zze.zzbhl)) {
                return false;
            }
            if (this.osVersion == null) {
                if (com_google_android_gms_internal_zzsp_zze.osVersion != null) {
                    return false;
                }
            } else if (!this.osVersion.equals(com_google_android_gms_internal_zzsp_zze.osVersion)) {
                return false;
            }
            if (this.zzbhm == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhm != null) {
                    return false;
                }
            } else if (!this.zzbhm.equals(com_google_android_gms_internal_zzsp_zze.zzbhm)) {
                return false;
            }
            if (this.zzbhn == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhn != null) {
                    return false;
                }
            } else if (!this.zzbhn.equals(com_google_android_gms_internal_zzsp_zze.zzbhn)) {
                return false;
            }
            if (this.zzbho == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbho != null) {
                    return false;
                }
            } else if (!this.zzbho.equals(com_google_android_gms_internal_zzsp_zze.zzbho)) {
                return false;
            }
            if (this.zzbbL == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbbL != null) {
                    return false;
                }
            } else if (!this.zzbbL.equals(com_google_android_gms_internal_zzsp_zze.zzbbL)) {
                return false;
            }
            if (this.appId == null) {
                if (com_google_android_gms_internal_zzsp_zze.appId != null) {
                    return false;
                }
            } else if (!this.appId.equals(com_google_android_gms_internal_zzsp_zze.appId)) {
                return false;
            }
            if (this.zzaUf == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzaUf != null) {
                    return false;
                }
            } else if (!this.zzaUf.equals(com_google_android_gms_internal_zzsp_zze.zzaUf)) {
                return false;
            }
            if (this.zzbhp == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhp != null) {
                    return false;
                }
            } else if (!this.zzbhp.equals(com_google_android_gms_internal_zzsp_zze.zzbhp)) {
                return false;
            }
            if (this.zzbhq == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhq != null) {
                    return false;
                }
            } else if (!this.zzbhq.equals(com_google_android_gms_internal_zzsp_zze.zzbhq)) {
                return false;
            }
            if (this.zzbhr == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhr != null) {
                    return false;
                }
            } else if (!this.zzbhr.equals(com_google_android_gms_internal_zzsp_zze.zzbhr)) {
                return false;
            }
            if (this.zzbhs == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhs != null) {
                    return false;
                }
            } else if (!this.zzbhs.equals(com_google_android_gms_internal_zzsp_zze.zzbhs)) {
                return false;
            }
            if (this.zzbht == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbht != null) {
                    return false;
                }
            } else if (!this.zzbht.equals(com_google_android_gms_internal_zzsp_zze.zzbht)) {
                return false;
            }
            if (this.zzbhu == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhu != null) {
                    return false;
                }
            } else if (!this.zzbhu.equals(com_google_android_gms_internal_zzsp_zze.zzbhu)) {
                return false;
            }
            if (this.zzbhv == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhv != null) {
                    return false;
                }
            } else if (!this.zzbhv.equals(com_google_android_gms_internal_zzsp_zze.zzbhv)) {
                return false;
            }
            if (this.zzbbO == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbbO != null) {
                    return false;
                }
            } else if (!this.zzbbO.equals(com_google_android_gms_internal_zzsp_zze.zzbbO)) {
                return false;
            }
            if (this.zzbbK == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbbK != null) {
                    return false;
                }
            } else if (!this.zzbbK.equals(com_google_android_gms_internal_zzsp_zze.zzbbK)) {
                return false;
            }
            if (this.zzbhw == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhw != null) {
                    return false;
                }
            } else if (!this.zzbhw.equals(com_google_android_gms_internal_zzsp_zze.zzbhw)) {
                return false;
            }
            if (!zzamh.equals(this.zzbhx, com_google_android_gms_internal_zzsp_zze.zzbhx)) {
                return false;
            }
            if (this.zzbbS == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbbS != null) {
                    return false;
                }
            } else if (!this.zzbbS.equals(com_google_android_gms_internal_zzsp_zze.zzbbS)) {
                return false;
            }
            if (this.zzbhy == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhy != null) {
                    return false;
                }
            } else if (!this.zzbhy.equals(com_google_android_gms_internal_zzsp_zze.zzbhy)) {
                return false;
            }
            if (this.zzbhz == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhz != null) {
                    return false;
                }
            } else if (!this.zzbhz.equals(com_google_android_gms_internal_zzsp_zze.zzbhz)) {
                return false;
            }
            if (this.zzbhA == null) {
                if (com_google_android_gms_internal_zzsp_zze.zzbhA != null) {
                    return false;
                }
            } else if (!this.zzbhA.equals(com_google_android_gms_internal_zzsp_zze.zzbhA)) {
                return false;
            }
            return this.zzbhB == null ? com_google_android_gms_internal_zzsp_zze.zzbhB == null : this.zzbhB.equals(com_google_android_gms_internal_zzsp_zze.zzbhB);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbhA == null ? 0 : this.zzbhA.hashCode()) + (((this.zzbhz == null ? 0 : this.zzbhz.hashCode()) + (((this.zzbhy == null ? 0 : this.zzbhy.hashCode()) + (((this.zzbbS == null ? 0 : this.zzbbS.hashCode()) + (((((this.zzbhw == null ? 0 : this.zzbhw.hashCode()) + (((this.zzbbK == null ? 0 : this.zzbbK.hashCode()) + (((this.zzbbO == null ? 0 : this.zzbbO.hashCode()) + (((this.zzbhv == null ? 0 : this.zzbhv.hashCode()) + (((this.zzbhu == null ? 0 : this.zzbhu.hashCode()) + (((this.zzbht == null ? 0 : this.zzbht.hashCode()) + (((this.zzbhs == null ? 0 : this.zzbhs.hashCode()) + (((this.zzbhr == null ? 0 : this.zzbhr.hashCode()) + (((this.zzbhq == null ? 0 : this.zzbhq.hashCode()) + (((this.zzbhp == null ? 0 : this.zzbhp.hashCode()) + (((this.zzaUf == null ? 0 : this.zzaUf.hashCode()) + (((this.appId == null ? 0 : this.appId.hashCode()) + (((this.zzbbL == null ? 0 : this.zzbbL.hashCode()) + (((this.zzbho == null ? 0 : this.zzbho.hashCode()) + (((this.zzbhn == null ? 0 : this.zzbhn.hashCode()) + (((this.zzbhm == null ? 0 : this.zzbhm.hashCode()) + (((this.osVersion == null ? 0 : this.osVersion.hashCode()) + (((this.zzbhl == null ? 0 : this.zzbhl.hashCode()) + (((this.zzbhk == null ? 0 : this.zzbhk.hashCode()) + (((this.zzbhj == null ? 0 : this.zzbhj.hashCode()) + (((this.zzbhi == null ? 0 : this.zzbhi.hashCode()) + (((this.zzbhh == null ? 0 : this.zzbhh.hashCode()) + (((this.zzbhg == null ? 0 : this.zzbhg.hashCode()) + (((((((this.zzbhd == null ? 0 : this.zzbhd.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + zzamh.hashCode(this.zzbhe)) * 31) + zzamh.hashCode(this.zzbhf)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + zzamh.hashCode(this.zzbhx)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.zzbhB != null) {
                i = this.zzbhB.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzG(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzbhd != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbhd.intValue());
            }
            if (this.zzbhe != null && this.zzbhe.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbhe) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzbhf != null && this.zzbhf.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zzbhf) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj2);
                    }
                }
            }
            if (this.zzbhg != null) {
                com_google_android_gms_internal_zzamc.zzb(4, this.zzbhg.longValue());
            }
            if (this.zzbhh != null) {
                com_google_android_gms_internal_zzamc.zzb(5, this.zzbhh.longValue());
            }
            if (this.zzbhi != null) {
                com_google_android_gms_internal_zzamc.zzb(6, this.zzbhi.longValue());
            }
            if (this.zzbhk != null) {
                com_google_android_gms_internal_zzamc.zzb(7, this.zzbhk.longValue());
            }
            if (this.zzbhl != null) {
                com_google_android_gms_internal_zzamc.zzq(8, this.zzbhl);
            }
            if (this.osVersion != null) {
                com_google_android_gms_internal_zzamc.zzq(9, this.osVersion);
            }
            if (this.zzbhm != null) {
                com_google_android_gms_internal_zzamc.zzq(10, this.zzbhm);
            }
            if (this.zzbhn != null) {
                com_google_android_gms_internal_zzamc.zzq(11, this.zzbhn);
            }
            if (this.zzbho != null) {
                com_google_android_gms_internal_zzamc.zzE(12, this.zzbho.intValue());
            }
            if (this.zzbbL != null) {
                com_google_android_gms_internal_zzamc.zzq(13, this.zzbbL);
            }
            if (this.appId != null) {
                com_google_android_gms_internal_zzamc.zzq(14, this.appId);
            }
            if (this.zzaUf != null) {
                com_google_android_gms_internal_zzamc.zzq(16, this.zzaUf);
            }
            if (this.zzbhp != null) {
                com_google_android_gms_internal_zzamc.zzb(17, this.zzbhp.longValue());
            }
            if (this.zzbhq != null) {
                com_google_android_gms_internal_zzamc.zzb(18, this.zzbhq.longValue());
            }
            if (this.zzbhr != null) {
                com_google_android_gms_internal_zzamc.zzq(19, this.zzbhr);
            }
            if (this.zzbhs != null) {
                com_google_android_gms_internal_zzamc.zzj(20, this.zzbhs.booleanValue());
            }
            if (this.zzbht != null) {
                com_google_android_gms_internal_zzamc.zzq(21, this.zzbht);
            }
            if (this.zzbhu != null) {
                com_google_android_gms_internal_zzamc.zzb(22, this.zzbhu.longValue());
            }
            if (this.zzbhv != null) {
                com_google_android_gms_internal_zzamc.zzE(23, this.zzbhv.intValue());
            }
            if (this.zzbbO != null) {
                com_google_android_gms_internal_zzamc.zzq(24, this.zzbbO);
            }
            if (this.zzbbK != null) {
                com_google_android_gms_internal_zzamc.zzq(25, this.zzbbK);
            }
            if (this.zzbhj != null) {
                com_google_android_gms_internal_zzamc.zzb(26, this.zzbhj.longValue());
            }
            if (this.zzbhw != null) {
                com_google_android_gms_internal_zzamc.zzj(28, this.zzbhw.booleanValue());
            }
            if (this.zzbhx != null && this.zzbhx.length > 0) {
                while (i < this.zzbhx.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zzbhx[i];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        com_google_android_gms_internal_zzamc.zza(29, com_google_android_gms_internal_zzamj3);
                    }
                    i++;
                }
            }
            if (this.zzbbS != null) {
                com_google_android_gms_internal_zzamc.zzq(30, this.zzbbS);
            }
            if (this.zzbhy != null) {
                com_google_android_gms_internal_zzamc.zzE(31, this.zzbhy.intValue());
            }
            if (this.zzbhz != null) {
                com_google_android_gms_internal_zzamc.zzE(32, this.zzbhz.intValue());
            }
            if (this.zzbhA != null) {
                com_google_android_gms_internal_zzamc.zzE(33, this.zzbhA.intValue());
            }
            if (this.zzbhB != null) {
                com_google_android_gms_internal_zzamc.zzq(34, this.zzbhB);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zze zzG(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbhd = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 18:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzbhe == null ? 0 : this.zzbhe.length;
                        obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbhe, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbhe = obj;
                        continue;
                    case 26:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zzbhf == null ? 0 : this.zzbhf.length;
                        obj = new zzg[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbhf, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzg();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzg();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbhf = obj;
                        continue;
                    case 32:
                        this.zzbhg = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 40:
                        this.zzbhh = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 48:
                        this.zzbhi = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 56:
                        this.zzbhk = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 66:
                        this.zzbhl = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 74:
                        this.osVersion = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 82:
                        this.zzbhm = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 90:
                        this.zzbhn = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 96:
                        this.zzbho = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 106:
                        this.zzbbL = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 114:
                        this.appId = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 130:
                        this.zzaUf = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 136:
                        this.zzbhp = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 144:
                        this.zzbhq = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 154:
                        this.zzbhr = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 160:
                        this.zzbhs = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 170:
                        this.zzbht = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 176:
                        this.zzbhu = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 184:
                        this.zzbhv = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 194:
                        this.zzbbO = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 202:
                        this.zzbbK = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 208:
                        this.zzbhj = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 224:
                        this.zzbhw = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 234:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 234);
                        zzWC = this.zzbhx == null ? 0 : this.zzbhx.length;
                        obj = new zza[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbhx, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zza();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zza();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbhx = obj;
                        continue;
                    case 242:
                        this.zzbbS = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 248:
                        this.zzbhy = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 256:
                        this.zzbhz = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 264:
                        this.zzbhA = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 274:
                        this.zzbhB = com_google_android_gms_internal_zzamb.readString();
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

        public zze zzHj() {
            this.zzbhd = null;
            this.zzbhe = zzb.zzHd();
            this.zzbhf = zzg.zzHl();
            this.zzbhg = null;
            this.zzbhh = null;
            this.zzbhi = null;
            this.zzbhj = null;
            this.zzbhk = null;
            this.zzbhl = null;
            this.osVersion = null;
            this.zzbhm = null;
            this.zzbhn = null;
            this.zzbho = null;
            this.zzbbL = null;
            this.appId = null;
            this.zzaUf = null;
            this.zzbhp = null;
            this.zzbhq = null;
            this.zzbhr = null;
            this.zzbhs = null;
            this.zzbht = null;
            this.zzbhu = null;
            this.zzbhv = null;
            this.zzbbO = null;
            this.zzbbK = null;
            this.zzbhw = null;
            this.zzbhx = zza.zzHb();
            this.zzbbS = null;
            this.zzbhy = null;
            this.zzbhz = null;
            this.zzbhA = null;
            this.zzbhB = null;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int i;
            int i2 = 0;
            int zzy = super.zzy();
            if (this.zzbhd != null) {
                zzy += zzamc.zzG(1, this.zzbhd.intValue());
            }
            if (this.zzbhe != null && this.zzbhe.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbhe) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(2, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (this.zzbhf != null && this.zzbhf.length > 0) {
                i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj2 : this.zzbhf) {
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        i += zzamc.zzc(3, com_google_android_gms_internal_zzamj2);
                    }
                }
                zzy = i;
            }
            if (this.zzbhg != null) {
                zzy += zzamc.zze(4, this.zzbhg.longValue());
            }
            if (this.zzbhh != null) {
                zzy += zzamc.zze(5, this.zzbhh.longValue());
            }
            if (this.zzbhi != null) {
                zzy += zzamc.zze(6, this.zzbhi.longValue());
            }
            if (this.zzbhk != null) {
                zzy += zzamc.zze(7, this.zzbhk.longValue());
            }
            if (this.zzbhl != null) {
                zzy += zzamc.zzr(8, this.zzbhl);
            }
            if (this.osVersion != null) {
                zzy += zzamc.zzr(9, this.osVersion);
            }
            if (this.zzbhm != null) {
                zzy += zzamc.zzr(10, this.zzbhm);
            }
            if (this.zzbhn != null) {
                zzy += zzamc.zzr(11, this.zzbhn);
            }
            if (this.zzbho != null) {
                zzy += zzamc.zzG(12, this.zzbho.intValue());
            }
            if (this.zzbbL != null) {
                zzy += zzamc.zzr(13, this.zzbbL);
            }
            if (this.appId != null) {
                zzy += zzamc.zzr(14, this.appId);
            }
            if (this.zzaUf != null) {
                zzy += zzamc.zzr(16, this.zzaUf);
            }
            if (this.zzbhp != null) {
                zzy += zzamc.zze(17, this.zzbhp.longValue());
            }
            if (this.zzbhq != null) {
                zzy += zzamc.zze(18, this.zzbhq.longValue());
            }
            if (this.zzbhr != null) {
                zzy += zzamc.zzr(19, this.zzbhr);
            }
            if (this.zzbhs != null) {
                zzy += zzamc.zzk(20, this.zzbhs.booleanValue());
            }
            if (this.zzbht != null) {
                zzy += zzamc.zzr(21, this.zzbht);
            }
            if (this.zzbhu != null) {
                zzy += zzamc.zze(22, this.zzbhu.longValue());
            }
            if (this.zzbhv != null) {
                zzy += zzamc.zzG(23, this.zzbhv.intValue());
            }
            if (this.zzbbO != null) {
                zzy += zzamc.zzr(24, this.zzbbO);
            }
            if (this.zzbbK != null) {
                zzy += zzamc.zzr(25, this.zzbbK);
            }
            if (this.zzbhj != null) {
                zzy += zzamc.zze(26, this.zzbhj.longValue());
            }
            if (this.zzbhw != null) {
                zzy += zzamc.zzk(28, this.zzbhw.booleanValue());
            }
            if (this.zzbhx != null && this.zzbhx.length > 0) {
                while (i2 < this.zzbhx.length) {
                    zzamj com_google_android_gms_internal_zzamj3 = this.zzbhx[i2];
                    if (com_google_android_gms_internal_zzamj3 != null) {
                        zzy += zzamc.zzc(29, com_google_android_gms_internal_zzamj3);
                    }
                    i2++;
                }
            }
            if (this.zzbbS != null) {
                zzy += zzamc.zzr(30, this.zzbbS);
            }
            if (this.zzbhy != null) {
                zzy += zzamc.zzG(31, this.zzbhy.intValue());
            }
            if (this.zzbhz != null) {
                zzy += zzamc.zzG(32, this.zzbhz.intValue());
            }
            if (this.zzbhA != null) {
                zzy += zzamc.zzG(33, this.zzbhA.intValue());
            }
            return this.zzbhB != null ? zzy + zzamc.zzr(34, this.zzbhB) : zzy;
        }
    }

    public static final class zzf extends zzamj {
        public long[] zzbhC;
        public long[] zzbhD;

        public zzf() {
            zzHk();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzsp_zzf = (zzf) obj;
            return !zzamh.equals(this.zzbhC, com_google_android_gms_internal_zzsp_zzf.zzbhC) ? false : zzamh.equals(this.zzbhD, com_google_android_gms_internal_zzsp_zzf.zzbhD);
        }

        public int hashCode() {
            return ((((getClass().getName().hashCode() + 527) * 31) + zzamh.hashCode(this.zzbhC)) * 31) + zzamh.hashCode(this.zzbhD);
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzH(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzbhC != null && this.zzbhC.length > 0) {
                for (long zza : this.zzbhC) {
                    com_google_android_gms_internal_zzamc.zza(1, zza);
                }
            }
            if (this.zzbhD != null && this.zzbhD.length > 0) {
                while (i < this.zzbhD.length) {
                    com_google_android_gms_internal_zzamc.zza(2, this.zzbhD[i]);
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzf zzH(zzamb com_google_android_gms_internal_zzamb) throws IOException {
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
                        zzWC = this.zzbhC == null ? 0 : this.zzbhC.length;
                        obj = new long[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbhC, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWE();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWE();
                        this.zzbhC = obj;
                        continue;
                    case 10:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWE();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzbhC == null ? 0 : this.zzbhC.length;
                        obj2 = new long[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzbhC, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWE();
                            zzc++;
                        }
                        this.zzbhC = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
                        continue;
                    case 16:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 16);
                        zzWC = this.zzbhD == null ? 0 : this.zzbhD.length;
                        obj = new long[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbhD, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.zzWE();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.zzWE();
                        this.zzbhD = obj;
                        continue;
                    case 18:
                        zznW = com_google_android_gms_internal_zzamb.zznW(com_google_android_gms_internal_zzamb.zzWL());
                        zzc = com_google_android_gms_internal_zzamb.getPosition();
                        zzWC = 0;
                        while (com_google_android_gms_internal_zzamb.zzWQ() > 0) {
                            com_google_android_gms_internal_zzamb.zzWE();
                            zzWC++;
                        }
                        com_google_android_gms_internal_zzamb.zznY(zzc);
                        zzc = this.zzbhD == null ? 0 : this.zzbhD.length;
                        obj2 = new long[(zzWC + zzc)];
                        if (zzc != 0) {
                            System.arraycopy(this.zzbhD, 0, obj2, 0, zzc);
                        }
                        while (zzc < obj2.length) {
                            obj2[zzc] = com_google_android_gms_internal_zzamb.zzWE();
                            zzc++;
                        }
                        this.zzbhD = obj2;
                        com_google_android_gms_internal_zzamb.zznX(zznW);
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

        public zzf zzHk() {
            this.zzbhC = zzamm.zzcam;
            this.zzbhD = zzamm.zzcam;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int i;
            int i2;
            int i3 = 0;
            int zzy = super.zzy();
            if (this.zzbhC == null || this.zzbhC.length <= 0) {
                i = zzy;
            } else {
                i2 = 0;
                for (long zzaT : this.zzbhC) {
                    i2 += zzamc.zzaT(zzaT);
                }
                i = (zzy + i2) + (this.zzbhC.length * 1);
            }
            if (this.zzbhD == null || this.zzbhD.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.zzbhD.length) {
                i2 += zzamc.zzaT(this.zzbhD[i3]);
                i3++;
            }
            return (i + i2) + (this.zzbhD.length * 1);
        }
    }

    public static final class zzg extends zzamj {
        private static volatile zzg[] zzbhE;
        public String name;
        public String zzasH;
        public Float zzbge;
        public Double zzbgf;
        public Long zzbhF;
        public Long zzbha;

        public zzg() {
            zzHm();
        }

        public static zzg[] zzHl() {
            if (zzbhE == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbhE == null) {
                        zzbhE = new zzg[0];
                    }
                }
            }
            return zzbhE;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzg)) {
                return false;
            }
            zzg com_google_android_gms_internal_zzsp_zzg = (zzg) obj;
            if (this.zzbhF == null) {
                if (com_google_android_gms_internal_zzsp_zzg.zzbhF != null) {
                    return false;
                }
            } else if (!this.zzbhF.equals(com_google_android_gms_internal_zzsp_zzg.zzbhF)) {
                return false;
            }
            if (this.name == null) {
                if (com_google_android_gms_internal_zzsp_zzg.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzsp_zzg.name)) {
                return false;
            }
            if (this.zzasH == null) {
                if (com_google_android_gms_internal_zzsp_zzg.zzasH != null) {
                    return false;
                }
            } else if (!this.zzasH.equals(com_google_android_gms_internal_zzsp_zzg.zzasH)) {
                return false;
            }
            if (this.zzbha == null) {
                if (com_google_android_gms_internal_zzsp_zzg.zzbha != null) {
                    return false;
                }
            } else if (!this.zzbha.equals(com_google_android_gms_internal_zzsp_zzg.zzbha)) {
                return false;
            }
            if (this.zzbge == null) {
                if (com_google_android_gms_internal_zzsp_zzg.zzbge != null) {
                    return false;
                }
            } else if (!this.zzbge.equals(com_google_android_gms_internal_zzsp_zzg.zzbge)) {
                return false;
            }
            return this.zzbgf == null ? com_google_android_gms_internal_zzsp_zzg.zzbgf == null : this.zzbgf.equals(com_google_android_gms_internal_zzsp_zzg.zzbgf);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbge == null ? 0 : this.zzbge.hashCode()) + (((this.zzbha == null ? 0 : this.zzbha.hashCode()) + (((this.zzasH == null ? 0 : this.zzasH.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + (((this.zzbhF == null ? 0 : this.zzbhF.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.zzbgf != null) {
                i = this.zzbgf.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzI(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbhF != null) {
                com_google_android_gms_internal_zzamc.zzb(1, this.zzbhF.longValue());
            }
            if (this.name != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.name);
            }
            if (this.zzasH != null) {
                com_google_android_gms_internal_zzamc.zzq(3, this.zzasH);
            }
            if (this.zzbha != null) {
                com_google_android_gms_internal_zzamc.zzb(4, this.zzbha.longValue());
            }
            if (this.zzbge != null) {
                com_google_android_gms_internal_zzamc.zzb(5, this.zzbge.floatValue());
            }
            if (this.zzbgf != null) {
                com_google_android_gms_internal_zzamc.zza(6, this.zzbgf.doubleValue());
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzg zzHm() {
            this.zzbhF = null;
            this.name = null;
            this.zzasH = null;
            this.zzbha = null;
            this.zzbge = null;
            this.zzbgf = null;
            this.zzcaj = -1;
            return this;
        }

        public zzg zzI(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbhF = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 18:
                        this.name = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 26:
                        this.zzasH = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 32:
                        this.zzbha = Long.valueOf(com_google_android_gms_internal_zzamb.zzWF());
                        continue;
                    case 45:
                        this.zzbge = Float.valueOf(com_google_android_gms_internal_zzamb.readFloat());
                        continue;
                    case 49:
                        this.zzbgf = Double.valueOf(com_google_android_gms_internal_zzamb.readDouble());
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

        protected int zzy() {
            int zzy = super.zzy();
            if (this.zzbhF != null) {
                zzy += zzamc.zze(1, this.zzbhF.longValue());
            }
            if (this.name != null) {
                zzy += zzamc.zzr(2, this.name);
            }
            if (this.zzasH != null) {
                zzy += zzamc.zzr(3, this.zzasH);
            }
            if (this.zzbha != null) {
                zzy += zzamc.zze(4, this.zzbha.longValue());
            }
            if (this.zzbge != null) {
                zzy += zzamc.zzc(5, this.zzbge.floatValue());
            }
            return this.zzbgf != null ? zzy + zzamc.zzb(6, this.zzbgf.doubleValue()) : zzy;
        }
    }
}
