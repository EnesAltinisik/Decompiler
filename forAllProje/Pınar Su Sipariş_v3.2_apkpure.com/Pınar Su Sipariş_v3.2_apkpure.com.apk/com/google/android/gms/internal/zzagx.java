package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzagx {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagx.class.desiredAssertionStatus());
    private static com.google.android.gms.internal.zzahb.zza zzbQf = new com.google.android.gms.internal.zzahb.zza() {
        public zzaht zza(zzaho com_google_android_gms_internal_zzaho, zzaht com_google_android_gms_internal_zzaht, boolean z) {
            return null;
        }

        public zzahu zzh(zzahi com_google_android_gms_internal_zzahi) {
            return null;
        }
    };
    private final zzahb zzbQe;

    private static class a implements com.google.android.gms.internal.zzahb.zza {
        private final zzafr a;
        private final zzagw b;
        private final zzahu c;

        public a(zzafr com_google_android_gms_internal_zzafr, zzagw com_google_android_gms_internal_zzagw, zzahu com_google_android_gms_internal_zzahu) {
            this.a = com_google_android_gms_internal_zzafr;
            this.b = com_google_android_gms_internal_zzagw;
            this.c = com_google_android_gms_internal_zzahu;
        }

        public zzaht zza(zzaho com_google_android_gms_internal_zzaho, zzaht com_google_android_gms_internal_zzaht, boolean z) {
            return this.a.zza(this.c != null ? this.c : this.b.zzSY(), com_google_android_gms_internal_zzaht, z, com_google_android_gms_internal_zzaho);
        }

        public zzahu zzh(zzahi com_google_android_gms_internal_zzahi) {
            zzagm zzSV = this.b.zzSV();
            if (zzSV.zzf(com_google_android_gms_internal_zzahi)) {
                return zzSV.zzPj().zzm(com_google_android_gms_internal_zzahi);
            }
            return this.a.zza(com_google_android_gms_internal_zzahi, this.c != null ? new zzagm(zzahp.zza(this.c, zzahq.zzTH()), true, false) : this.b.zzSX());
        }
    }

    public static class zza {
        public final zzagw zzbPX;
        public final List<zzago> zzbQb;

        public zza(zzagw com_google_android_gms_internal_zzagw, List<zzago> list) {
            this.zzbPX = com_google_android_gms_internal_zzagw;
            this.zzbQb = list;
        }
    }

    public zzagx(zzahb com_google_android_gms_internal_zzahb) {
        this.zzbQe = com_google_android_gms_internal_zzahb;
    }

    private zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu, zzagy com_google_android_gms_internal_zzagy) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzaes.zzQO() == null) {
            Entry entry;
            zzafa zzh;
            Iterator it = com_google_android_gms_internal_zzaes.iterator();
            zzagw com_google_android_gms_internal_zzagw2 = com_google_android_gms_internal_zzagw;
            while (it.hasNext()) {
                entry = (Entry) it.next();
                zzh = com_google_android_gms_internal_zzafa.zzh((zzafa) entry.getKey());
                if (zza(com_google_android_gms_internal_zzagw, zzh.zzRt())) {
                    com_google_android_gms_internal_zzagw2 = zza(com_google_android_gms_internal_zzagw2, zzh, (zzahu) entry.getValue(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                }
            }
            it = com_google_android_gms_internal_zzaes.iterator();
            while (it.hasNext()) {
                entry = (Entry) it.next();
                zzh = com_google_android_gms_internal_zzafa.zzh((zzafa) entry.getKey());
                if (!zza(com_google_android_gms_internal_zzagw, zzh.zzRt())) {
                    com_google_android_gms_internal_zzagw2 = zza(com_google_android_gms_internal_zzagw2, zzh, (zzahu) entry.getValue(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                }
            }
            return com_google_android_gms_internal_zzagw2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu, boolean z, zzagy com_google_android_gms_internal_zzagy) {
        if (com_google_android_gms_internal_zzagw.zzSX().zzPj().isEmpty() && !com_google_android_gms_internal_zzagw.zzSX().zzSr()) {
            return com_google_android_gms_internal_zzagw;
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzaes.zzQO() == null) {
            zzahi com_google_android_gms_internal_zzahi;
            if (!com_google_android_gms_internal_zzafa.isEmpty()) {
                com_google_android_gms_internal_zzaes = zzaes.zzQN().zzb(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzaes);
            }
            zzahu zzPj = com_google_android_gms_internal_zzagw.zzSX().zzPj();
            Map zzQQ = com_google_android_gms_internal_zzaes.zzQQ();
            zzagw com_google_android_gms_internal_zzagw2 = com_google_android_gms_internal_zzagw;
            for (Entry entry : zzQQ.entrySet()) {
                com_google_android_gms_internal_zzahi = (zzahi) entry.getKey();
                if (zzPj.zzk(com_google_android_gms_internal_zzahi)) {
                    com_google_android_gms_internal_zzagw2 = zza(com_google_android_gms_internal_zzagw2, new zzafa(com_google_android_gms_internal_zzahi), ((zzaes) entry.getValue()).zzb(zzPj.zzm(com_google_android_gms_internal_zzahi)), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, z, com_google_android_gms_internal_zzagy);
                }
            }
            for (Entry entry2 : zzQQ.entrySet()) {
                com_google_android_gms_internal_zzahi = (zzahi) entry2.getKey();
                Object obj = (com_google_android_gms_internal_zzagw.zzSX().zzf(com_google_android_gms_internal_zzahi) || ((zzaes) entry2.getValue()).zzQO() != null) ? null : 1;
                if (!zzPj.zzk(com_google_android_gms_internal_zzahi) && obj == null) {
                    com_google_android_gms_internal_zzagw2 = zza(com_google_android_gms_internal_zzagw2, new zzafa(com_google_android_gms_internal_zzahi), ((zzaes) entry2.getValue()).zzb(zzPj.zzm(com_google_android_gms_internal_zzahi)), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, z, com_google_android_gms_internal_zzagy);
                }
            }
            return com_google_android_gms_internal_zzagw2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzafr com_google_android_gms_internal_zzafr, com.google.android.gms.internal.zzahb.zza com_google_android_gms_internal_zzahb_zza, zzagy com_google_android_gms_internal_zzagy) {
        zzagm zzSV = com_google_android_gms_internal_zzagw.zzSV();
        if (com_google_android_gms_internal_zzafr.zzv(com_google_android_gms_internal_zzafa) != null) {
            return com_google_android_gms_internal_zzagw;
        }
        zzahp zza;
        zzahu zza2;
        if (!com_google_android_gms_internal_zzafa.isEmpty()) {
            zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
            if (!zzRt.zzTl()) {
                zzahu zzl;
                zzafa zzRu = com_google_android_gms_internal_zzafa.zzRu();
                if (zzSV.zzf(zzRt)) {
                    zza2 = com_google_android_gms_internal_zzafr.zza(com_google_android_gms_internal_zzafa, zzSV.zzPj(), com_google_android_gms_internal_zzagw.zzSX().zzPj());
                    zzl = zza2 != null ? zzSV.zzPj().zzm(zzRt).zzl(zzRu, zza2) : zzSV.zzPj().zzm(zzRt);
                } else {
                    zzl = com_google_android_gms_internal_zzafr.zza(zzRt, com_google_android_gms_internal_zzagw.zzSX());
                }
                zza = zzl != null ? this.zzbQe.zza(zzSV.zzSt(), zzRt, zzl, zzRu, com_google_android_gms_internal_zzahb_zza, com_google_android_gms_internal_zzagy) : zzSV.zzSt();
            } else if ($assertionsDisabled || com_google_android_gms_internal_zzafa.size() == 1) {
                zza2 = com_google_android_gms_internal_zzafr.zza(com_google_android_gms_internal_zzafa, zzSV.zzPj(), com_google_android_gms_internal_zzagw.zzSX().zzPj());
                zza = zza2 != null ? this.zzbQe.zza(zzSV.zzSt(), zza2) : zzSV.zzSt();
            } else {
                throw new AssertionError("Can't have a priority with additional path components");
            }
        } else if ($assertionsDisabled || com_google_android_gms_internal_zzagw.zzSX().zzSr()) {
            if (com_google_android_gms_internal_zzagw.zzSX().zzSs()) {
                zza2 = com_google_android_gms_internal_zzagw.zzSY();
                if (!(zza2 instanceof zzahj)) {
                    zza2 = zzahn.zzTA();
                }
                zza2 = com_google_android_gms_internal_zzafr.zzd(zza2);
            } else {
                zza2 = com_google_android_gms_internal_zzafr.zzc(com_google_android_gms_internal_zzagw.zzSY());
            }
            zza = this.zzbQe.zza(com_google_android_gms_internal_zzagw.zzSV().zzSt(), zzahp.zza(zza2, this.zzbQe.zzSK()), com_google_android_gms_internal_zzagy);
        } else {
            throw new AssertionError("If change path is empty, we must have complete server data");
        }
        boolean z = zzSV.zzSr() || com_google_android_gms_internal_zzafa.isEmpty();
        return com_google_android_gms_internal_zzagw.zza(zza, z, this.zzbQe.zzTb());
    }

    private zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzagi<Boolean> com_google_android_gms_internal_zzagi_java_lang_Boolean, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu, zzagy com_google_android_gms_internal_zzagy) {
        if (com_google_android_gms_internal_zzafr.zzv(com_google_android_gms_internal_zzafa) != null) {
            return com_google_android_gms_internal_zzagw;
        }
        boolean zzSs = com_google_android_gms_internal_zzagw.zzSX().zzSs();
        zzagm zzSX = com_google_android_gms_internal_zzagw.zzSX();
        zzaes zzQN;
        if (com_google_android_gms_internal_zzagi_java_lang_Boolean.getValue() == null) {
            zzQN = zzaes.zzQN();
            Iterator it = com_google_android_gms_internal_zzagi_java_lang_Boolean.iterator();
            while (it.hasNext()) {
                zzafa com_google_android_gms_internal_zzafa2 = (zzafa) ((Entry) it.next()).getKey();
                zzafa zzh = com_google_android_gms_internal_zzafa.zzh(com_google_android_gms_internal_zzafa2);
                if (zzSX.zzM(zzh)) {
                    zzQN = zzQN.zze(com_google_android_gms_internal_zzafa2, zzSX.zzPj().zzO(zzh));
                }
            }
            return zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafa, zzQN, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, zzSs, com_google_android_gms_internal_zzagy);
        } else if ((com_google_android_gms_internal_zzafa.isEmpty() && zzSX.zzSr()) || zzSX.zzM(com_google_android_gms_internal_zzafa)) {
            return zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafa, zzSX.zzPj().zzO(com_google_android_gms_internal_zzafa), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, zzSs, com_google_android_gms_internal_zzagy);
        } else if (!com_google_android_gms_internal_zzafa.isEmpty()) {
            return com_google_android_gms_internal_zzagw;
        } else {
            zzQN = zzaes.zzQN();
            for (zzaht com_google_android_gms_internal_zzaht : zzSX.zzPj()) {
                zzQN = zzQN.zza(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj());
            }
            return zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafa, zzQN, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, zzSs, com_google_android_gms_internal_zzagy);
        }
    }

    private zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu2, zzagy com_google_android_gms_internal_zzagy) {
        zzagm zzSV = com_google_android_gms_internal_zzagw.zzSV();
        com.google.android.gms.internal.zzahb.zza aVar = new a(com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzahu2);
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return com_google_android_gms_internal_zzagw.zza(this.zzbQe.zza(com_google_android_gms_internal_zzagw.zzSV().zzSt(), zzahp.zza(com_google_android_gms_internal_zzahu, this.zzbQe.zzSK()), com_google_android_gms_internal_zzagy), true, this.zzbQe.zzTb());
        }
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        if (zzRt.zzTl()) {
            return com_google_android_gms_internal_zzagw.zza(this.zzbQe.zza(com_google_android_gms_internal_zzagw.zzSV().zzSt(), com_google_android_gms_internal_zzahu), zzSV.zzSr(), zzSV.zzSs());
        }
        zzahu com_google_android_gms_internal_zzahu3;
        zzafa zzRu = com_google_android_gms_internal_zzafa.zzRu();
        zzahu zzm = zzSV.zzPj().zzm(zzRt);
        if (zzRu.isEmpty()) {
            com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu;
        } else {
            com_google_android_gms_internal_zzahu3 = aVar.zzh(zzRt);
            if (com_google_android_gms_internal_zzahu3 == null) {
                com_google_android_gms_internal_zzahu3 = zzahn.zzTA();
            } else if (!(zzRu.zzRw().zzTl() && com_google_android_gms_internal_zzahu3.zzO(zzRu.zzRv()).isEmpty())) {
                com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu3.zzl(zzRu, com_google_android_gms_internal_zzahu);
            }
        }
        return !zzm.equals(com_google_android_gms_internal_zzahu3) ? com_google_android_gms_internal_zzagw.zza(this.zzbQe.zza(zzSV.zzSt(), zzRt, com_google_android_gms_internal_zzahu3, zzRu, aVar, com_google_android_gms_internal_zzagy), zzSV.zzSr(), this.zzbQe.zzTb()) : com_google_android_gms_internal_zzagw;
    }

    private zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu2, boolean z, zzagy com_google_android_gms_internal_zzagy) {
        zzahp zza;
        zzagm zzSX = com_google_android_gms_internal_zzagw.zzSX();
        zzahb zzTa = z ? this.zzbQe : this.zzbQe.zzTa();
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            zza = zzTa.zza(zzSX.zzSt(), zzahp.zza(com_google_android_gms_internal_zzahu, zzTa.zzSK()), null);
        } else if (!zzTa.zzTb() || zzSX.zzSs()) {
            zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
            if (!zzSX.zzM(com_google_android_gms_internal_zzafa) && com_google_android_gms_internal_zzafa.size() > 1) {
                return com_google_android_gms_internal_zzagw;
            }
            zzafa zzRu = com_google_android_gms_internal_zzafa.zzRu();
            zzahu zzl = zzSX.zzPj().zzm(zzRt).zzl(zzRu, com_google_android_gms_internal_zzahu);
            zza = zzRt.zzTl() ? zzTa.zza(zzSX.zzSt(), zzl) : zzTa.zza(zzSX.zzSt(), zzRt, zzl, zzRu, zzbQf, null);
        } else if ($assertionsDisabled || !com_google_android_gms_internal_zzafa.isEmpty()) {
            zzahi zzRt2 = com_google_android_gms_internal_zzafa.zzRt();
            zza = zzTa.zza(zzSX.zzSt(), zzSX.zzSt().zzh(zzRt2, zzSX.zzPj().zzm(zzRt2).zzl(com_google_android_gms_internal_zzafa.zzRu(), com_google_android_gms_internal_zzahu)), null);
        } else {
            throw new AssertionError("An empty path should have been caught in the other branch");
        }
        boolean z2 = zzSX.zzSr() || com_google_android_gms_internal_zzafa.isEmpty();
        zzagw zzb = com_google_android_gms_internal_zzagw.zzb(zza, z2, zzTa.zzTb());
        return zza(zzb, com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzafr, new a(com_google_android_gms_internal_zzafr, zzb, com_google_android_gms_internal_zzahu2), com_google_android_gms_internal_zzagy);
    }

    private void zza(zzagw com_google_android_gms_internal_zzagw, zzagw com_google_android_gms_internal_zzagw2, List<zzago> list) {
        zzagm zzSV = com_google_android_gms_internal_zzagw2.zzSV();
        if (zzSV.zzSr()) {
            Object obj = (zzSV.zzPj().zzTo() || zzSV.zzPj().isEmpty()) ? 1 : null;
            if (!list.isEmpty() || !com_google_android_gms_internal_zzagw.zzSV().zzSr() || ((obj != null && !zzSV.zzPj().equals(com_google_android_gms_internal_zzagw.zzSW())) || !zzSV.zzPj().zzTp().equals(com_google_android_gms_internal_zzagw.zzSW().zzTp()))) {
                list.add(zzago.zza(zzSV.zzSt()));
            }
        }
    }

    private static boolean zza(zzagw com_google_android_gms_internal_zzagw, zzahi com_google_android_gms_internal_zzahi) {
        return com_google_android_gms_internal_zzagw.zzSV().zzf(com_google_android_gms_internal_zzahi);
    }

    private zzagw zzb(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu, zzagy com_google_android_gms_internal_zzagy) {
        zzagm zzSX = com_google_android_gms_internal_zzagw.zzSX();
        zzahp zzSt = zzSX.zzSt();
        boolean z = zzSX.zzSr() || com_google_android_gms_internal_zzafa.isEmpty();
        return zza(com_google_android_gms_internal_zzagw.zzb(zzSt, z, zzSX.zzSs()), com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzafr, zzbQf, com_google_android_gms_internal_zzagy);
    }

    public zzagw zza(zzagw com_google_android_gms_internal_zzagw, zzafa com_google_android_gms_internal_zzafa, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu, zzagy com_google_android_gms_internal_zzagy) {
        if (com_google_android_gms_internal_zzafr.zzv(com_google_android_gms_internal_zzafa) != null) {
            return com_google_android_gms_internal_zzagw;
        }
        com.google.android.gms.internal.zzahb.zza aVar = new a(com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzahu);
        zzahp zzSt = com_google_android_gms_internal_zzagw.zzSV().zzSt();
        if (com_google_android_gms_internal_zzafa.isEmpty() || com_google_android_gms_internal_zzafa.zzRt().zzTl()) {
            zzSt = this.zzbQe.zza(zzSt, zzahp.zza(com_google_android_gms_internal_zzagw.zzSX().zzSr() ? com_google_android_gms_internal_zzafr.zzc(com_google_android_gms_internal_zzagw.zzSY()) : com_google_android_gms_internal_zzafr.zzd(com_google_android_gms_internal_zzagw.zzSX().zzPj()), this.zzbQe.zzSK()), com_google_android_gms_internal_zzagy);
        } else {
            zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
            zzahu zza = com_google_android_gms_internal_zzafr.zza(zzRt, com_google_android_gms_internal_zzagw.zzSX());
            if (zza == null && com_google_android_gms_internal_zzagw.zzSX().zzf(zzRt)) {
                zza = zzSt.zzPj().zzm(zzRt);
            }
            if (zza != null) {
                zzSt = this.zzbQe.zza(zzSt, zzRt, zza, com_google_android_gms_internal_zzafa.zzRu(), aVar, com_google_android_gms_internal_zzagy);
            } else if (zza == null && com_google_android_gms_internal_zzagw.zzSV().zzPj().zzk(zzRt)) {
                zzSt = this.zzbQe.zza(zzSt, zzRt, zzahn.zzTA(), com_google_android_gms_internal_zzafa.zzRu(), aVar, com_google_android_gms_internal_zzagy);
            }
            if (zzSt.zzPj().isEmpty() && com_google_android_gms_internal_zzagw.zzSX().zzSr()) {
                zzahu zzc = com_google_android_gms_internal_zzafr.zzc(com_google_android_gms_internal_zzagw.zzSY());
                if (zzc.zzTo()) {
                    zzSt = this.zzbQe.zza(zzSt, zzahp.zza(zzc, this.zzbQe.zzSK()), com_google_android_gms_internal_zzagy);
                }
            }
        }
        boolean z = com_google_android_gms_internal_zzagw.zzSX().zzSr() || com_google_android_gms_internal_zzafr.zzv(zzafa.zzRq()) != null;
        return com_google_android_gms_internal_zzagw.zza(zzSt, z, this.zzbQe.zzTb());
    }

    public zza zza(zzagw com_google_android_gms_internal_zzagw, zzafw com_google_android_gms_internal_zzafw, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu) {
        zzagw zza;
        zzagy com_google_android_gms_internal_zzagy = new zzagy();
        boolean z;
        switch (com_google_android_gms_internal_zzafw.zzSa()) {
            case Overwrite:
                zzafy com_google_android_gms_internal_zzafy = (zzafy) com_google_android_gms_internal_zzafw;
                if (com_google_android_gms_internal_zzafy.zzRZ().zzSb()) {
                    zza = zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafy.zzPn(), com_google_android_gms_internal_zzafy.zzSf(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                    break;
                } else if ($assertionsDisabled || com_google_android_gms_internal_zzafy.zzRZ().zzSc()) {
                    z = com_google_android_gms_internal_zzafy.zzRZ().zzSd() || (com_google_android_gms_internal_zzagw.zzSX().zzSs() && !com_google_android_gms_internal_zzafy.zzPn().isEmpty());
                    zza = zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafy.zzPn(), com_google_android_gms_internal_zzafy.zzSf(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, z, com_google_android_gms_internal_zzagy);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case Merge:
                zzafv com_google_android_gms_internal_zzafv = (zzafv) com_google_android_gms_internal_zzafw;
                if (com_google_android_gms_internal_zzafv.zzRZ().zzSb()) {
                    zza = zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafv.zzPn(), com_google_android_gms_internal_zzafv.zzRY(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                    break;
                } else if ($assertionsDisabled || com_google_android_gms_internal_zzafv.zzRZ().zzSc()) {
                    z = com_google_android_gms_internal_zzafv.zzRZ().zzSd() || com_google_android_gms_internal_zzagw.zzSX().zzSs();
                    zza = zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafv.zzPn(), com_google_android_gms_internal_zzafv.zzRY(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, z, com_google_android_gms_internal_zzagy);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case AckUserWrite:
                zzaft com_google_android_gms_internal_zzaft = (zzaft) com_google_android_gms_internal_zzafw;
                if (!com_google_android_gms_internal_zzaft.zzRX()) {
                    zza = zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzaft.zzPn(), com_google_android_gms_internal_zzaft.zzRW(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                    break;
                }
                zza = zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzaft.zzPn(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                break;
            case ListenComplete:
                zza = zzb(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafw.zzPn(), com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzagy);
                break;
            default:
                String valueOf = String.valueOf(com_google_android_gms_internal_zzafw.zzSa());
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown operation: ").append(valueOf).toString());
        }
        List arrayList = new ArrayList(com_google_android_gms_internal_zzagy.zzSZ());
        zza(com_google_android_gms_internal_zzagw, zza, arrayList);
        return new zza(zza, arrayList);
    }
}
