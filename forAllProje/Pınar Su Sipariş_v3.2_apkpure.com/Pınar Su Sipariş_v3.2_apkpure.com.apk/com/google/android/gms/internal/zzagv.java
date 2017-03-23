package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class zzagv {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagv.class.desiredAssertionStatus());
    private final zzagu zzbPF;
    private final zzagx zzbPW;
    private zzagw zzbPX;
    private final List<zzaew> zzbPY = new ArrayList();
    private final zzagr zzbPZ;

    public static class zza {
        public final List<zzagp> zzbQa;
        public final List<zzago> zzbQb;

        public zza(List<zzagp> list, List<zzago> list2) {
            this.zzbQa = list;
            this.zzbQb = list2;
        }
    }

    public zzagv(zzagu com_google_android_gms_internal_zzagu, zzagw com_google_android_gms_internal_zzagw) {
        this.zzbPF = com_google_android_gms_internal_zzagu;
        zzagz com_google_android_gms_internal_zzagz = new zzagz(com_google_android_gms_internal_zzagu.zzSK());
        zzahb zzSQ = com_google_android_gms_internal_zzagu.zzSR().zzSQ();
        this.zzbPW = new zzagx(zzSQ);
        zzagm zzSX = com_google_android_gms_internal_zzagw.zzSX();
        zzagm zzSV = com_google_android_gms_internal_zzagw.zzSV();
        zzahp zza = zzahp.zza(zzahn.zzTA(), com_google_android_gms_internal_zzagu.zzSK());
        zzahp zza2 = com_google_android_gms_internal_zzagz.zza(zza, zzSX.zzSt(), null);
        zza = zzSQ.zza(zza, zzSV.zzSt(), null);
        this.zzbPX = new zzagw(new zzagm(zza, zzSV.zzSr(), zzSQ.zzTb()), new zzagm(zza2, zzSX.zzSr(), com_google_android_gms_internal_zzagz.zzTb()));
        this.zzbPZ = new zzagr(com_google_android_gms_internal_zzagu);
    }

    private List<zzagp> zza(List<zzago> list, zzahp com_google_android_gms_internal_zzahp, zzaew com_google_android_gms_internal_zzaew) {
        List list2;
        if (com_google_android_gms_internal_zzaew == null) {
            list2 = this.zzbPY;
        } else {
            list2 = Arrays.asList(new zzaew[]{com_google_android_gms_internal_zzaew});
        }
        return this.zzbPZ.zza((List) list, com_google_android_gms_internal_zzahp, list2);
    }

    public boolean isEmpty() {
        return this.zzbPY.isEmpty();
    }

    public zzagu zzSS() {
        return this.zzbPF;
    }

    public zzahu zzST() {
        return this.zzbPX.zzSX().zzPj();
    }

    public zzahu zzSU() {
        return this.zzbPX.zzSV().zzPj();
    }

    public List<zzagq> zza(zzaew com_google_android_gms_internal_zzaew, DatabaseError databaseError) {
        List<zzagq> list;
        if (databaseError != null) {
            List<zzagq> arrayList = new ArrayList();
            if ($assertionsDisabled || com_google_android_gms_internal_zzaew == null) {
                zzafa zzPn = this.zzbPF.zzPn();
                for (zzaew com_google_android_gms_internal_zzagn : this.zzbPY) {
                    zzaew com_google_android_gms_internal_zzagn2;
                    arrayList.add(new zzagn(com_google_android_gms_internal_zzagn2, databaseError, zzPn));
                }
                list = arrayList;
            } else {
                throw new AssertionError("A cancel should cancel all event registrations");
            }
        }
        list = Collections.emptyList();
        if (com_google_android_gms_internal_zzaew != null) {
            int i = 0;
            int i2 = -1;
            while (i < this.zzbPY.size()) {
                com_google_android_gms_internal_zzagn2 = (zzaew) this.zzbPY.get(i);
                if (com_google_android_gms_internal_zzagn2.zzc(com_google_android_gms_internal_zzaew)) {
                    if (com_google_android_gms_internal_zzagn2.zzRm()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            i = i2;
            if (i != -1) {
                com_google_android_gms_internal_zzagn2 = (zzaew) this.zzbPY.get(i);
                this.zzbPY.remove(i);
                com_google_android_gms_internal_zzagn2.zzRl();
            }
        } else {
            for (zzaew com_google_android_gms_internal_zzagn22 : this.zzbPY) {
                com_google_android_gms_internal_zzagn22.zzRl();
            }
            this.zzbPY.clear();
        }
        return list;
    }

    public zza zzb(zzafw com_google_android_gms_internal_zzafw, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzafw.zzSa() == com.google.android.gms.internal.zzafw.zza.Merge && com_google_android_gms_internal_zzafw.zzRZ().zzSe() != null) {
            if (!$assertionsDisabled && this.zzbPX.zzSY() == null) {
                throw new AssertionError("We should always have a full cache before handling merges");
            } else if (!$assertionsDisabled && this.zzbPX.zzSW() == null) {
                throw new AssertionError("Missing event cache, even though we have a server cache");
            }
        }
        zzagw com_google_android_gms_internal_zzagw = this.zzbPX;
        com.google.android.gms.internal.zzagx.zza zza = this.zzbPW.zza(com_google_android_gms_internal_zzagw, com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu);
        if ($assertionsDisabled || zza.zzbPX.zzSX().zzSr() || !com_google_android_gms_internal_zzagw.zzSX().zzSr()) {
            this.zzbPX = zza.zzbPX;
            return new zza(zza(zza.zzbQb, zza.zzbPX.zzSV().zzSt(), null), zza.zzbQb);
        }
        throw new AssertionError("Once a server snap is complete, it should never go back");
    }

    public void zzb(zzaew com_google_android_gms_internal_zzaew) {
        this.zzbPY.add(com_google_android_gms_internal_zzaew);
    }

    public List<zzagp> zzl(zzaew com_google_android_gms_internal_zzaew) {
        zzagm zzSV = this.zzbPX.zzSV();
        List arrayList = new ArrayList();
        for (zzaht com_google_android_gms_internal_zzaht : zzSV.zzPj()) {
            arrayList.add(zzago.zzc(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj()));
        }
        if (zzSV.zzSr()) {
            arrayList.add(zzago.zza(zzSV.zzSt()));
        }
        return zza(arrayList, zzSV.zzSt(), com_google_android_gms_internal_zzaew);
    }

    public zzahu zzs(zzafa com_google_android_gms_internal_zzafa) {
        zzahu zzSY = this.zzbPX.zzSY();
        return (zzSY == null || (!this.zzbPF.zzSO() && (com_google_android_gms_internal_zzafa.isEmpty() || zzSY.zzm(com_google_android_gms_internal_zzafa.zzRt()).isEmpty()))) ? null : zzSY.zzO(com_google_android_gms_internal_zzafa);
    }
}
