package com.google.android.gms.internal;

import java.io.IOException;

public interface zzsn {

    public static final class zza extends zzamj {
        private static volatile zza[] zzbgh;
        public Integer zzbgi;
        public zze[] zzbgj;
        public zzb[] zzbgk;

        public zza() {
            zzGN();
        }

        public static zza[] zzGM() {
            if (zzbgh == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgh == null) {
                        zzbgh = new zza[0];
                    }
                }
            }
            return zzbgh;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzsn_zza = (zza) obj;
            if (this.zzbgi == null) {
                if (com_google_android_gms_internal_zzsn_zza.zzbgi != null) {
                    return false;
                }
            } else if (!this.zzbgi.equals(com_google_android_gms_internal_zzsn_zza.zzbgi)) {
                return false;
            }
            return !zzamh.equals(this.zzbgj, com_google_android_gms_internal_zzsn_zza.zzbgj) ? false : zzamh.equals(this.zzbgk, com_google_android_gms_internal_zzsn_zza.zzbgk);
        }

        public int hashCode() {
            return (((((this.zzbgi == null ? 0 : this.zzbgi.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + zzamh.hashCode(this.zzbgj)) * 31) + zzamh.hashCode(this.zzbgk);
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzt(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            int i = 0;
            if (this.zzbgi != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbgi.intValue());
            }
            if (this.zzbgj != null && this.zzbgj.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgj) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(2, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzbgk != null && this.zzbgk.length > 0) {
                while (i < this.zzbgk.length) {
                    zzamj com_google_android_gms_internal_zzamj2 = this.zzbgk[i];
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj2);
                    }
                    i++;
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zza zzGN() {
            this.zzbgi = null;
            this.zzbgj = zze.zzGT();
            this.zzbgk = zzb.zzGO();
            this.zzcaj = -1;
            return this;
        }

        public zza zzt(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                int zzc;
                Object obj;
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbgi = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 18:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 18);
                        zzWC = this.zzbgj == null ? 0 : this.zzbgj.length;
                        obj = new zze[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgj, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zze();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zze();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgj = obj;
                        continue;
                    case 26:
                        zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zzbgk == null ? 0 : this.zzbgk.length;
                        obj = new zzb[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgk, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzb();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzb();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgk = obj;
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
            int i = 0;
            int zzy = super.zzy();
            if (this.zzbgi != null) {
                zzy += zzamc.zzG(1, this.zzbgi.intValue());
            }
            if (this.zzbgj != null && this.zzbgj.length > 0) {
                int i2 = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgj) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i2 += zzamc.zzc(2, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i2;
            }
            if (this.zzbgk != null && this.zzbgk.length > 0) {
                while (i < this.zzbgk.length) {
                    zzamj com_google_android_gms_internal_zzamj2 = this.zzbgk[i];
                    if (com_google_android_gms_internal_zzamj2 != null) {
                        zzy += zzamc.zzc(3, com_google_android_gms_internal_zzamj2);
                    }
                    i++;
                }
            }
            return zzy;
        }
    }

    public static final class zzb extends zzamj {
        private static volatile zzb[] zzbgl;
        public Integer zzbgm;
        public String zzbgn;
        public zzc[] zzbgo;
        public Boolean zzbgp;
        public zzd zzbgq;

        public zzb() {
            zzGP();
        }

        public static zzb[] zzGO() {
            if (zzbgl == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgl == null) {
                        zzbgl = new zzb[0];
                    }
                }
            }
            return zzbgl;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzsn_zzb = (zzb) obj;
            if (this.zzbgm == null) {
                if (com_google_android_gms_internal_zzsn_zzb.zzbgm != null) {
                    return false;
                }
            } else if (!this.zzbgm.equals(com_google_android_gms_internal_zzsn_zzb.zzbgm)) {
                return false;
            }
            if (this.zzbgn == null) {
                if (com_google_android_gms_internal_zzsn_zzb.zzbgn != null) {
                    return false;
                }
            } else if (!this.zzbgn.equals(com_google_android_gms_internal_zzsn_zzb.zzbgn)) {
                return false;
            }
            if (!zzamh.equals(this.zzbgo, com_google_android_gms_internal_zzsn_zzb.zzbgo)) {
                return false;
            }
            if (this.zzbgp == null) {
                if (com_google_android_gms_internal_zzsn_zzb.zzbgp != null) {
                    return false;
                }
            } else if (!this.zzbgp.equals(com_google_android_gms_internal_zzsn_zzb.zzbgp)) {
                return false;
            }
            return this.zzbgq == null ? com_google_android_gms_internal_zzsn_zzb.zzbgq == null : this.zzbgq.equals(com_google_android_gms_internal_zzsn_zzb.zzbgq);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgp == null ? 0 : this.zzbgp.hashCode()) + (((((this.zzbgn == null ? 0 : this.zzbgn.hashCode()) + (((this.zzbgm == null ? 0 : this.zzbgm.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + zzamh.hashCode(this.zzbgo)) * 31)) * 31;
            if (this.zzbgq != null) {
                i = this.zzbgq.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzu(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgm != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbgm.intValue());
            }
            if (this.zzbgn != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzbgn);
            }
            if (this.zzbgo != null && this.zzbgo.length > 0) {
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgo) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        com_google_android_gms_internal_zzamc.zza(3, com_google_android_gms_internal_zzamj);
                    }
                }
            }
            if (this.zzbgp != null) {
                com_google_android_gms_internal_zzamc.zzj(4, this.zzbgp.booleanValue());
            }
            if (this.zzbgq != null) {
                com_google_android_gms_internal_zzamc.zza(5, this.zzbgq);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzb zzGP() {
            this.zzbgm = null;
            this.zzbgn = null;
            this.zzbgo = zzc.zzGQ();
            this.zzbgp = null;
            this.zzbgq = null;
            this.zzcaj = -1;
            return this;
        }

        public zzb zzu(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbgm = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 18:
                        this.zzbgn = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 26:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 26);
                        zzWC = this.zzbgo == null ? 0 : this.zzbgo.length;
                        Object obj = new zzc[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgo, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = new zzc();
                            com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = new zzc();
                        com_google_android_gms_internal_zzamb.zza(obj[zzWC]);
                        this.zzbgo = obj;
                        continue;
                    case 32:
                        this.zzbgp = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 42:
                        if (this.zzbgq == null) {
                            this.zzbgq = new zzd();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbgq);
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
            if (this.zzbgm != null) {
                zzy += zzamc.zzG(1, this.zzbgm.intValue());
            }
            if (this.zzbgn != null) {
                zzy += zzamc.zzr(2, this.zzbgn);
            }
            if (this.zzbgo != null && this.zzbgo.length > 0) {
                int i = zzy;
                for (zzamj com_google_android_gms_internal_zzamj : this.zzbgo) {
                    if (com_google_android_gms_internal_zzamj != null) {
                        i += zzamc.zzc(3, com_google_android_gms_internal_zzamj);
                    }
                }
                zzy = i;
            }
            if (this.zzbgp != null) {
                zzy += zzamc.zzk(4, this.zzbgp.booleanValue());
            }
            return this.zzbgq != null ? zzy + zzamc.zzc(5, this.zzbgq) : zzy;
        }
    }

    public static final class zzc extends zzamj {
        private static volatile zzc[] zzbgr;
        public zzf zzbgs;
        public zzd zzbgt;
        public Boolean zzbgu;
        public String zzbgv;

        public zzc() {
            zzGR();
        }

        public static zzc[] zzGQ() {
            if (zzbgr == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgr == null) {
                        zzbgr = new zzc[0];
                    }
                }
            }
            return zzbgr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzsn_zzc = (zzc) obj;
            if (this.zzbgs == null) {
                if (com_google_android_gms_internal_zzsn_zzc.zzbgs != null) {
                    return false;
                }
            } else if (!this.zzbgs.equals(com_google_android_gms_internal_zzsn_zzc.zzbgs)) {
                return false;
            }
            if (this.zzbgt == null) {
                if (com_google_android_gms_internal_zzsn_zzc.zzbgt != null) {
                    return false;
                }
            } else if (!this.zzbgt.equals(com_google_android_gms_internal_zzsn_zzc.zzbgt)) {
                return false;
            }
            if (this.zzbgu == null) {
                if (com_google_android_gms_internal_zzsn_zzc.zzbgu != null) {
                    return false;
                }
            } else if (!this.zzbgu.equals(com_google_android_gms_internal_zzsn_zzc.zzbgu)) {
                return false;
            }
            return this.zzbgv == null ? com_google_android_gms_internal_zzsn_zzc.zzbgv == null : this.zzbgv.equals(com_google_android_gms_internal_zzsn_zzc.zzbgv);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgu == null ? 0 : this.zzbgu.hashCode()) + (((this.zzbgt == null ? 0 : this.zzbgt.hashCode()) + (((this.zzbgs == null ? 0 : this.zzbgs.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.zzbgv != null) {
                i = this.zzbgv.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzv(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgs != null) {
                com_google_android_gms_internal_zzamc.zza(1, this.zzbgs);
            }
            if (this.zzbgt != null) {
                com_google_android_gms_internal_zzamc.zza(2, this.zzbgt);
            }
            if (this.zzbgu != null) {
                com_google_android_gms_internal_zzamc.zzj(3, this.zzbgu.booleanValue());
            }
            if (this.zzbgv != null) {
                com_google_android_gms_internal_zzamc.zzq(4, this.zzbgv);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzc zzGR() {
            this.zzbgs = null;
            this.zzbgt = null;
            this.zzbgu = null;
            this.zzbgv = null;
            this.zzcaj = -1;
            return this;
        }

        public zzc zzv(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 10:
                        if (this.zzbgs == null) {
                            this.zzbgs = new zzf();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbgs);
                        continue;
                    case 18:
                        if (this.zzbgt == null) {
                            this.zzbgt = new zzd();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbgt);
                        continue;
                    case 24:
                        this.zzbgu = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 34:
                        this.zzbgv = com_google_android_gms_internal_zzamb.readString();
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
            if (this.zzbgs != null) {
                zzy += zzamc.zzc(1, this.zzbgs);
            }
            if (this.zzbgt != null) {
                zzy += zzamc.zzc(2, this.zzbgt);
            }
            if (this.zzbgu != null) {
                zzy += zzamc.zzk(3, this.zzbgu.booleanValue());
            }
            return this.zzbgv != null ? zzy + zzamc.zzr(4, this.zzbgv) : zzy;
        }
    }

    public static final class zzd extends zzamj {
        public String zzbgA;
        public Integer zzbgw;
        public Boolean zzbgx;
        public String zzbgy;
        public String zzbgz;

        public zzd() {
            zzGS();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzsn_zzd = (zzd) obj;
            if (this.zzbgw == null) {
                if (com_google_android_gms_internal_zzsn_zzd.zzbgw != null) {
                    return false;
                }
            } else if (!this.zzbgw.equals(com_google_android_gms_internal_zzsn_zzd.zzbgw)) {
                return false;
            }
            if (this.zzbgx == null) {
                if (com_google_android_gms_internal_zzsn_zzd.zzbgx != null) {
                    return false;
                }
            } else if (!this.zzbgx.equals(com_google_android_gms_internal_zzsn_zzd.zzbgx)) {
                return false;
            }
            if (this.zzbgy == null) {
                if (com_google_android_gms_internal_zzsn_zzd.zzbgy != null) {
                    return false;
                }
            } else if (!this.zzbgy.equals(com_google_android_gms_internal_zzsn_zzd.zzbgy)) {
                return false;
            }
            if (this.zzbgz == null) {
                if (com_google_android_gms_internal_zzsn_zzd.zzbgz != null) {
                    return false;
                }
            } else if (!this.zzbgz.equals(com_google_android_gms_internal_zzsn_zzd.zzbgz)) {
                return false;
            }
            return this.zzbgA == null ? com_google_android_gms_internal_zzsn_zzd.zzbgA == null : this.zzbgA.equals(com_google_android_gms_internal_zzsn_zzd.zzbgA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgz == null ? 0 : this.zzbgz.hashCode()) + (((this.zzbgy == null ? 0 : this.zzbgy.hashCode()) + (((this.zzbgx == null ? 0 : this.zzbgx.hashCode()) + (((this.zzbgw == null ? 0 : this.zzbgw.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.zzbgA != null) {
                i = this.zzbgA.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzw(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgw != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbgw.intValue());
            }
            if (this.zzbgx != null) {
                com_google_android_gms_internal_zzamc.zzj(2, this.zzbgx.booleanValue());
            }
            if (this.zzbgy != null) {
                com_google_android_gms_internal_zzamc.zzq(3, this.zzbgy);
            }
            if (this.zzbgz != null) {
                com_google_android_gms_internal_zzamc.zzq(4, this.zzbgz);
            }
            if (this.zzbgA != null) {
                com_google_android_gms_internal_zzamc.zzq(5, this.zzbgA);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzd zzGS() {
            this.zzbgx = null;
            this.zzbgy = null;
            this.zzbgz = null;
            this.zzbgA = null;
            this.zzcaj = -1;
            return this;
        }

        public zzd zzw(zzamb com_google_android_gms_internal_zzamb) throws IOException {
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
                                this.zzbgw = Integer.valueOf(zzWC);
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.zzbgx = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 26:
                        this.zzbgy = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 34:
                        this.zzbgz = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 42:
                        this.zzbgA = com_google_android_gms_internal_zzamb.readString();
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
            if (this.zzbgw != null) {
                zzy += zzamc.zzG(1, this.zzbgw.intValue());
            }
            if (this.zzbgx != null) {
                zzy += zzamc.zzk(2, this.zzbgx.booleanValue());
            }
            if (this.zzbgy != null) {
                zzy += zzamc.zzr(3, this.zzbgy);
            }
            if (this.zzbgz != null) {
                zzy += zzamc.zzr(4, this.zzbgz);
            }
            return this.zzbgA != null ? zzy + zzamc.zzr(5, this.zzbgA) : zzy;
        }
    }

    public static final class zze extends zzamj {
        private static volatile zze[] zzbgB;
        public String zzbgC;
        public zzc zzbgD;
        public Integer zzbgm;

        public zze() {
            zzGU();
        }

        public static zze[] zzGT() {
            if (zzbgB == null) {
                synchronized (zzamh.zzcai) {
                    if (zzbgB == null) {
                        zzbgB = new zze[0];
                    }
                }
            }
            return zzbgB;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzsn_zze = (zze) obj;
            if (this.zzbgm == null) {
                if (com_google_android_gms_internal_zzsn_zze.zzbgm != null) {
                    return false;
                }
            } else if (!this.zzbgm.equals(com_google_android_gms_internal_zzsn_zze.zzbgm)) {
                return false;
            }
            if (this.zzbgC == null) {
                if (com_google_android_gms_internal_zzsn_zze.zzbgC != null) {
                    return false;
                }
            } else if (!this.zzbgC.equals(com_google_android_gms_internal_zzsn_zze.zzbgC)) {
                return false;
            }
            return this.zzbgD == null ? com_google_android_gms_internal_zzsn_zze.zzbgD == null : this.zzbgD.equals(com_google_android_gms_internal_zzsn_zze.zzbgD);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgC == null ? 0 : this.zzbgC.hashCode()) + (((this.zzbgm == null ? 0 : this.zzbgm.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.zzbgD != null) {
                i = this.zzbgD.hashCode();
            }
            return hashCode + i;
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzx(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgm != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbgm.intValue());
            }
            if (this.zzbgC != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzbgC);
            }
            if (this.zzbgD != null) {
                com_google_android_gms_internal_zzamc.zza(3, this.zzbgD);
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zze zzGU() {
            this.zzbgm = null;
            this.zzbgC = null;
            this.zzbgD = null;
            this.zzcaj = -1;
            return this;
        }

        public zze zzx(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            while (true) {
                int zzWC = com_google_android_gms_internal_zzamb.zzWC();
                switch (zzWC) {
                    case 0:
                        break;
                    case 8:
                        this.zzbgm = Integer.valueOf(com_google_android_gms_internal_zzamb.zzWG());
                        continue;
                    case 18:
                        this.zzbgC = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 26:
                        if (this.zzbgD == null) {
                            this.zzbgD = new zzc();
                        }
                        com_google_android_gms_internal_zzamb.zza(this.zzbgD);
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
            if (this.zzbgm != null) {
                zzy += zzamc.zzG(1, this.zzbgm.intValue());
            }
            if (this.zzbgC != null) {
                zzy += zzamc.zzr(2, this.zzbgC);
            }
            return this.zzbgD != null ? zzy + zzamc.zzc(3, this.zzbgD) : zzy;
        }
    }

    public static final class zzf extends zzamj {
        public Integer zzbgE;
        public String zzbgF;
        public Boolean zzbgG;
        public String[] zzbgH;

        public zzf() {
            zzGV();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzsn_zzf = (zzf) obj;
            if (this.zzbgE == null) {
                if (com_google_android_gms_internal_zzsn_zzf.zzbgE != null) {
                    return false;
                }
            } else if (!this.zzbgE.equals(com_google_android_gms_internal_zzsn_zzf.zzbgE)) {
                return false;
            }
            if (this.zzbgF == null) {
                if (com_google_android_gms_internal_zzsn_zzf.zzbgF != null) {
                    return false;
                }
            } else if (!this.zzbgF.equals(com_google_android_gms_internal_zzsn_zzf.zzbgF)) {
                return false;
            }
            if (this.zzbgG == null) {
                if (com_google_android_gms_internal_zzsn_zzf.zzbgG != null) {
                    return false;
                }
            } else if (!this.zzbgG.equals(com_google_android_gms_internal_zzsn_zzf.zzbgG)) {
                return false;
            }
            return zzamh.equals(this.zzbgH, com_google_android_gms_internal_zzsn_zzf.zzbgH);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbgF == null ? 0 : this.zzbgF.hashCode()) + (((this.zzbgE == null ? 0 : this.zzbgE.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.zzbgG != null) {
                i = this.zzbgG.hashCode();
            }
            return ((hashCode + i) * 31) + zzamh.hashCode(this.zzbgH);
        }

        public /* synthetic */ zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException {
            return zzy(com_google_android_gms_internal_zzamb);
        }

        public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
            if (this.zzbgE != null) {
                com_google_android_gms_internal_zzamc.zzE(1, this.zzbgE.intValue());
            }
            if (this.zzbgF != null) {
                com_google_android_gms_internal_zzamc.zzq(2, this.zzbgF);
            }
            if (this.zzbgG != null) {
                com_google_android_gms_internal_zzamc.zzj(3, this.zzbgG.booleanValue());
            }
            if (this.zzbgH != null && this.zzbgH.length > 0) {
                for (String str : this.zzbgH) {
                    if (str != null) {
                        com_google_android_gms_internal_zzamc.zzq(4, str);
                    }
                }
            }
            super.writeTo(com_google_android_gms_internal_zzamc);
        }

        public zzf zzGV() {
            this.zzbgF = null;
            this.zzbgG = null;
            this.zzbgH = zzamm.zzcaq;
            this.zzcaj = -1;
            return this;
        }

        protected int zzy() {
            int i = 0;
            int zzy = super.zzy();
            if (this.zzbgE != null) {
                zzy += zzamc.zzG(1, this.zzbgE.intValue());
            }
            if (this.zzbgF != null) {
                zzy += zzamc.zzr(2, this.zzbgF);
            }
            if (this.zzbgG != null) {
                zzy += zzamc.zzk(3, this.zzbgG.booleanValue());
            }
            if (this.zzbgH == null || this.zzbgH.length <= 0) {
                return zzy;
            }
            int i2 = 0;
            int i3 = 0;
            while (i < this.zzbgH.length) {
                String str = this.zzbgH[i];
                if (str != null) {
                    i3++;
                    i2 += zzamc.zziZ(str);
                }
                i++;
            }
            return (zzy + i2) + (i3 * 1);
        }

        public zzf zzy(zzamb com_google_android_gms_internal_zzamb) throws IOException {
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
                                this.zzbgE = Integer.valueOf(zzWC);
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.zzbgF = com_google_android_gms_internal_zzamb.readString();
                        continue;
                    case 24:
                        this.zzbgG = Boolean.valueOf(com_google_android_gms_internal_zzamb.zzWI());
                        continue;
                    case 34:
                        int zzc = zzamm.zzc(com_google_android_gms_internal_zzamb, 34);
                        zzWC = this.zzbgH == null ? 0 : this.zzbgH.length;
                        Object obj = new String[(zzc + zzWC)];
                        if (zzWC != 0) {
                            System.arraycopy(this.zzbgH, 0, obj, 0, zzWC);
                        }
                        while (zzWC < obj.length - 1) {
                            obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                            com_google_android_gms_internal_zzamb.zzWC();
                            zzWC++;
                        }
                        obj[zzWC] = com_google_android_gms_internal_zzamb.readString();
                        this.zzbgH = obj;
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
}
