package com.google.android.gms.internal;

import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzagi.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzagh {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagh.class.desiredAssertionStatus());
    private static final zzagj<Map<zzagt, zzagg>> zzbOU = new zzagj<Map<zzagt, zzagg>>() {
        public boolean a(Map<zzagt, zzagg> map) {
            zzagg com_google_android_gms_internal_zzagg = (zzagg) map.get(zzagt.zzbPK);
            return com_google_android_gms_internal_zzagg != null && com_google_android_gms_internal_zzagg.zzbOS;
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((Map) obj);
        }
    };
    private static final zzagj<Map<zzagt, zzagg>> zzbOV = new zzagj<Map<zzagt, zzagg>>() {
        public boolean a(Map<zzagt, zzagg> map) {
            zzagg com_google_android_gms_internal_zzagg = (zzagg) map.get(zzagt.zzbPK);
            return com_google_android_gms_internal_zzagg != null && com_google_android_gms_internal_zzagg.zzbOT;
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((Map) obj);
        }
    };
    private static final zzagj<zzagg> zzbOW = new zzagj<zzagg>() {
        public boolean a(zzagg com_google_android_gms_internal_zzagg) {
            return !com_google_android_gms_internal_zzagg.zzbOT;
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((zzagg) obj);
        }
    };
    private static final zzagj<zzagg> zzbOX = new zzagj<zzagg>() {
        public boolean a(zzagg com_google_android_gms_internal_zzagg) {
            return !zzagh.zzbOW.zzap(com_google_android_gms_internal_zzagg);
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((zzagg) obj);
        }
    };
    private final zzahf zzbHV;
    private final zzage zzbOE;
    private zzagi<Map<zzagt, zzagg>> zzbOY;
    private final zzain zzbOZ;
    private long zzbPa = 0;

    public zzagh(zzage com_google_android_gms_internal_zzage, zzahf com_google_android_gms_internal_zzahf, zzain com_google_android_gms_internal_zzain) {
        this.zzbOE = com_google_android_gms_internal_zzage;
        this.zzbHV = com_google_android_gms_internal_zzahf;
        this.zzbOZ = com_google_android_gms_internal_zzain;
        this.zzbOY = new zzagi(null);
        zzSl();
        for (zzagg com_google_android_gms_internal_zzagg : this.zzbOE.zzPr()) {
            this.zzbPa = Math.max(com_google_android_gms_internal_zzagg.id + 1, this.zzbPa);
            zzb(com_google_android_gms_internal_zzagg);
        }
    }

    private boolean zzE(zzafa com_google_android_gms_internal_zzafa) {
        return this.zzbOY.zza(com_google_android_gms_internal_zzafa, zzbOU) != null;
    }

    private Set<Long> zzF(zzafa com_google_android_gms_internal_zzafa) {
        Set<Long> hashSet = new HashSet();
        Map map = (Map) this.zzbOY.zzK(com_google_android_gms_internal_zzafa);
        if (map != null) {
            for (zzagg com_google_android_gms_internal_zzagg : map.values()) {
                if (!com_google_android_gms_internal_zzagg.zzbOQ.zzSO()) {
                    hashSet.add(Long.valueOf(com_google_android_gms_internal_zzagg.id));
                }
            }
        }
        return hashSet;
    }

    private void zzSl() {
        try {
            this.zzbOE.beginTransaction();
            this.zzbOE.zzav(this.zzbOZ.zzUi());
            this.zzbOE.setTransactionSuccessful();
        } finally {
            this.zzbOE.endTransaction();
        }
    }

    private static long zza(zzafz com_google_android_gms_internal_zzafz, long j) {
        return j - Math.min((long) Math.floor((double) ((TextTrackStyle.DEFAULT_FONT_SCALE - com_google_android_gms_internal_zzafz.zzSg()) * ((float) j))), com_google_android_gms_internal_zzafz.zzSh());
    }

    private List<zzagg> zza(zzagj<zzagg> com_google_android_gms_internal_zzagj_com_google_android_gms_internal_zzagg) {
        List<zzagg> arrayList = new ArrayList();
        Iterator it = this.zzbOY.iterator();
        while (it.hasNext()) {
            for (zzagg com_google_android_gms_internal_zzagg : ((Map) ((Entry) it.next()).getValue()).values()) {
                if (com_google_android_gms_internal_zzagj_com_google_android_gms_internal_zzagg.zzap(com_google_android_gms_internal_zzagg)) {
                    arrayList.add(com_google_android_gms_internal_zzagg);
                }
            }
        }
        return arrayList;
    }

    private void zza(zzagg com_google_android_gms_internal_zzagg) {
        zzb(com_google_android_gms_internal_zzagg);
        this.zzbOE.zza(com_google_android_gms_internal_zzagg);
    }

    private void zzb(zzagg com_google_android_gms_internal_zzagg) {
        Map map;
        zzj(com_google_android_gms_internal_zzagg.zzbOQ);
        Map map2 = (Map) this.zzbOY.zzK(com_google_android_gms_internal_zzagg.zzbOQ.zzPn());
        if (map2 == null) {
            map2 = new HashMap();
            this.zzbOY = this.zzbOY.zzb(com_google_android_gms_internal_zzagg.zzbOQ.zzPn(), (Object) map2);
            map = map2;
        } else {
            map = map2;
        }
        zzagg com_google_android_gms_internal_zzagg2 = (zzagg) map.get(com_google_android_gms_internal_zzagg.zzbOQ.zzSR());
        boolean z = com_google_android_gms_internal_zzagg2 == null || com_google_android_gms_internal_zzagg2.id == com_google_android_gms_internal_zzagg.id;
        zzaiv.zzaN(z);
        map.put(com_google_android_gms_internal_zzagg.zzbOQ.zzSR(), com_google_android_gms_internal_zzagg);
    }

    private void zzb(zzagu com_google_android_gms_internal_zzagu, boolean z) {
        zzagu zzk = zzk(com_google_android_gms_internal_zzagu);
        zzagg zzl = zzl(zzk);
        long zzUi = this.zzbOZ.zzUi();
        if (zzl != null) {
            zzl = zzl.zzaH(zzUi).zzaS(z);
        } else if ($assertionsDisabled || z) {
            long j = this.zzbPa;
            this.zzbPa = 1 + j;
            zzl = new zzagg(j, zzk, zzUi, false, z);
        } else {
            throw new AssertionError("If we're setting the query to inactive, we should already be tracking it!");
        }
        zza(zzl);
    }

    private static void zzj(zzagu com_google_android_gms_internal_zzagu) {
        boolean z = !com_google_android_gms_internal_zzagu.zzSO() || com_google_android_gms_internal_zzagu.isDefault();
        zzaiv.zzb(z, "Can't have tracked non-default query that loads all data");
    }

    private static zzagu zzk(zzagu com_google_android_gms_internal_zzagu) {
        return com_google_android_gms_internal_zzagu.zzSO() ? zzagu.zzN(com_google_android_gms_internal_zzagu.zzPn()) : com_google_android_gms_internal_zzagu;
    }

    public void zzA(zzafa com_google_android_gms_internal_zzafa) {
        this.zzbOY.zzI(com_google_android_gms_internal_zzafa).zza(new zza<Map<zzagt, zzagg>, Void>(this) {
            final /* synthetic */ zzagh a;

            {
                this.a = r1;
            }

            public Void a(zzafa com_google_android_gms_internal_zzafa, Map<zzagt, zzagg> map, Void voidR) {
                for (Entry value : map.entrySet()) {
                    zzagg com_google_android_gms_internal_zzagg = (zzagg) value.getValue();
                    if (!com_google_android_gms_internal_zzagg.zzbOS) {
                        this.a.zza(com_google_android_gms_internal_zzagg.zzSk());
                    }
                }
                return null;
            }

            public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                return a(com_google_android_gms_internal_zzafa, (Map) obj, (Void) obj2);
            }
        });
    }

    public Set<zzahi> zzB(zzafa com_google_android_gms_internal_zzafa) {
        if ($assertionsDisabled || !zzo(zzagu.zzN(com_google_android_gms_internal_zzafa))) {
            Set<zzahi> hashSet = new HashSet();
            Set zzF = zzF(com_google_android_gms_internal_zzafa);
            if (!zzF.isEmpty()) {
                hashSet.addAll(this.zzbOE.zzg(zzF));
            }
            Iterator it = this.zzbOY.zzI(com_google_android_gms_internal_zzafa).zzSp().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                zzahi com_google_android_gms_internal_zzahi = (zzahi) entry.getKey();
                zzagi com_google_android_gms_internal_zzagi = (zzagi) entry.getValue();
                if (com_google_android_gms_internal_zzagi.getValue() != null && zzbOU.zzap((Map) com_google_android_gms_internal_zzagi.getValue())) {
                    hashSet.add(com_google_android_gms_internal_zzahi);
                }
            }
            return hashSet;
        }
        throw new AssertionError("Path is fully complete.");
    }

    public void zzC(zzafa com_google_android_gms_internal_zzafa) {
        if (!zzE(com_google_android_gms_internal_zzafa)) {
            zzagu zzN = zzagu.zzN(com_google_android_gms_internal_zzafa);
            zzagg zzl = zzl(zzN);
            if (zzl == null) {
                long j = this.zzbPa;
                this.zzbPa = 1 + j;
                zzl = new zzagg(j, zzN, this.zzbOZ.zzUi(), true, false);
            } else if ($assertionsDisabled || !zzl.zzbOS) {
                zzl = zzl.zzSk();
            } else {
                throw new AssertionError("This should have been handled above!");
            }
            zza(zzl);
        }
    }

    public boolean zzD(zzafa com_google_android_gms_internal_zzafa) {
        return this.zzbOY.zzb(com_google_android_gms_internal_zzafa, zzbOV) != null;
    }

    public long zzSm() {
        return (long) zza(zzbOW).size();
    }

    public zzagf zza(zzafz com_google_android_gms_internal_zzafz) {
        List zza = zza(zzbOW);
        long zza2 = zza(com_google_android_gms_internal_zzafz, (long) zza.size());
        zzagf com_google_android_gms_internal_zzagf = new zzagf();
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Pruning old queries.  Prunable: " + zza.size() + " Count to prune: " + zza2, new Object[0]);
        }
        Collections.sort(zza, new Comparator<zzagg>(this) {
            final /* synthetic */ zzagh a;

            {
                this.a = r1;
            }

            public int a(zzagg com_google_android_gms_internal_zzagg, zzagg com_google_android_gms_internal_zzagg2) {
                return zzaiv.zzf(com_google_android_gms_internal_zzagg.zzbOR, com_google_android_gms_internal_zzagg2.zzbOR);
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((zzagg) obj, (zzagg) obj2);
            }
        });
        for (int i = 0; ((long) i) < zza2; i++) {
            zzagg com_google_android_gms_internal_zzagg = (zzagg) zza.get(i);
            com_google_android_gms_internal_zzagf = com_google_android_gms_internal_zzagf.zzy(com_google_android_gms_internal_zzagg.zzbOQ.zzPn());
            zzm(com_google_android_gms_internal_zzagg.zzbOQ);
        }
        zzagf com_google_android_gms_internal_zzagf2 = com_google_android_gms_internal_zzagf;
        for (int i2 = (int) zza2; i2 < zza.size(); i2++) {
            com_google_android_gms_internal_zzagf2 = com_google_android_gms_internal_zzagf2.zzz(((zzagg) zza.get(i2)).zzbOQ.zzPn());
        }
        List<zzagg> zza3 = zza(zzbOX);
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Unprunable queries: " + zza3.size(), new Object[0]);
        }
        for (zzagg com_google_android_gms_internal_zzagg2 : zza3) {
            com_google_android_gms_internal_zzagf2 = com_google_android_gms_internal_zzagf2.zzz(com_google_android_gms_internal_zzagg2.zzbOQ.zzPn());
        }
        return com_google_android_gms_internal_zzagf2;
    }

    public void zzg(zzagu com_google_android_gms_internal_zzagu) {
        zzb(com_google_android_gms_internal_zzagu, true);
    }

    public void zzh(zzagu com_google_android_gms_internal_zzagu) {
        zzb(com_google_android_gms_internal_zzagu, false);
    }

    public zzagg zzl(zzagu com_google_android_gms_internal_zzagu) {
        zzagu zzk = zzk(com_google_android_gms_internal_zzagu);
        Map map = (Map) this.zzbOY.zzK(zzk.zzPn());
        return map != null ? (zzagg) map.get(zzk.zzSR()) : null;
    }

    public void zzm(zzagu com_google_android_gms_internal_zzagu) {
        zzagu zzk = zzk(com_google_android_gms_internal_zzagu);
        zzagg zzl = zzl(zzk);
        if ($assertionsDisabled || zzl != null) {
            this.zzbOE.zzau(zzl.id);
            Map map = (Map) this.zzbOY.zzK(zzk.zzPn());
            map.remove(zzk.zzSR());
            if (map.isEmpty()) {
                this.zzbOY = this.zzbOY.zzJ(zzk.zzPn());
                return;
            }
            return;
        }
        throw new AssertionError("Query must exist to be removed.");
    }

    public void zzn(zzagu com_google_android_gms_internal_zzagu) {
        zzagg zzl = zzl(zzk(com_google_android_gms_internal_zzagu));
        if (zzl != null && !zzl.zzbOS) {
            zza(zzl.zzSk());
        }
    }

    public boolean zzo(zzagu com_google_android_gms_internal_zzagu) {
        if (zzE(com_google_android_gms_internal_zzagu.zzPn())) {
            return true;
        }
        if (com_google_android_gms_internal_zzagu.zzSO()) {
            return false;
        }
        Map map = (Map) this.zzbOY.zzK(com_google_android_gms_internal_zzagu.zzPn());
        boolean z = map != null && map.containsKey(com_google_android_gms_internal_zzagu.zzSR()) && ((zzagg) map.get(com_google_android_gms_internal_zzagu.zzSR())).zzbOS;
        return z;
    }
}
