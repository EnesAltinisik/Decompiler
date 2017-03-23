package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagq.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class zzagr {
    private final zzagu zzbPF;
    private final zzaho zzbPG;

    public zzagr(zzagu com_google_android_gms_internal_zzagu) {
        this.zzbPF = com_google_android_gms_internal_zzagu;
        this.zzbPG = com_google_android_gms_internal_zzagu.zzSK();
    }

    private Comparator<zzago> zzSB() {
        return new Comparator<zzago>(this) {
            static final /* synthetic */ boolean a = (!zzagr.class.desiredAssertionStatus());
            final /* synthetic */ zzagr b;

            {
                this.b = r1;
            }

            public int a(zzago com_google_android_gms_internal_zzago, zzago com_google_android_gms_internal_zzago2) {
                if (a || !(com_google_android_gms_internal_zzago.zzSv() == null || com_google_android_gms_internal_zzago2.zzSv() == null)) {
                    return this.b.zzbPG.compare(new zzaht(com_google_android_gms_internal_zzago.zzSv(), com_google_android_gms_internal_zzago.zzSt().zzPj()), new zzaht(com_google_android_gms_internal_zzago2.zzSv(), com_google_android_gms_internal_zzago2.zzSt().zzPj()));
                }
                throw new AssertionError();
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((zzago) obj, (zzago) obj2);
            }
        };
    }

    private zzagp zza(zzago com_google_android_gms_internal_zzago, zzaew com_google_android_gms_internal_zzaew, zzahp com_google_android_gms_internal_zzahp) {
        if (!(com_google_android_gms_internal_zzago.zzSw().equals(zza.VALUE) || com_google_android_gms_internal_zzago.zzSw().equals(zza.CHILD_REMOVED))) {
            com_google_android_gms_internal_zzago = com_google_android_gms_internal_zzago.zzg(com_google_android_gms_internal_zzahp.zza(com_google_android_gms_internal_zzago.zzSv(), com_google_android_gms_internal_zzago.zzSt().zzPj(), this.zzbPG));
        }
        return com_google_android_gms_internal_zzaew.zza(com_google_android_gms_internal_zzago, this.zzbPF);
    }

    private void zza(List<zzagp> list, zza com_google_android_gms_internal_zzagq_zza, List<zzago> list2, List<zzaew> list3, zzahp com_google_android_gms_internal_zzahp) {
        List<zzago> arrayList = new ArrayList();
        for (zzago com_google_android_gms_internal_zzago : list2) {
            if (com_google_android_gms_internal_zzago.zzSw().equals(com_google_android_gms_internal_zzagq_zza)) {
                arrayList.add(com_google_android_gms_internal_zzago);
            }
        }
        Collections.sort(arrayList, zzSB());
        for (zzago com_google_android_gms_internal_zzago2 : arrayList) {
            for (zzaew com_google_android_gms_internal_zzaew : list3) {
                if (com_google_android_gms_internal_zzaew.zza(com_google_android_gms_internal_zzagq_zza)) {
                    list.add(zza(com_google_android_gms_internal_zzago2, com_google_android_gms_internal_zzaew, com_google_android_gms_internal_zzahp));
                }
            }
        }
    }

    public List<zzagp> zza(List<zzago> list, zzahp com_google_android_gms_internal_zzahp, List<zzaew> list2) {
        List<zzagp> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (zzago com_google_android_gms_internal_zzago : list) {
            if (com_google_android_gms_internal_zzago.zzSw().equals(zza.CHILD_CHANGED) && this.zzbPG.zza(com_google_android_gms_internal_zzago.zzSy().zzPj(), com_google_android_gms_internal_zzago.zzSt().zzPj())) {
                arrayList2.add(zzago.zzc(com_google_android_gms_internal_zzago.zzSv(), com_google_android_gms_internal_zzago.zzSt()));
            }
        }
        zza(arrayList, zza.CHILD_REMOVED, list, list2, com_google_android_gms_internal_zzahp);
        zza(arrayList, zza.CHILD_ADDED, list, list2, com_google_android_gms_internal_zzahp);
        zza(arrayList, zza.CHILD_MOVED, arrayList2, list2, com_google_android_gms_internal_zzahp);
        zza(arrayList, zza.CHILD_CHANGED, list, list2, com_google_android_gms_internal_zzahp);
        zza(arrayList, zza.VALUE, list, list2, com_google_android_gms_internal_zzahp);
        return arrayList;
    }
}
