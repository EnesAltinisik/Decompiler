package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagv.zza;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzafi {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafi.class.desiredAssertionStatus());
    private final Map<zzagt, zzagv> zzbNj = new HashMap();
    private final zzagd zzbNk;

    public zzafi(zzagd com_google_android_gms_internal_zzagd) {
        this.zzbNk = com_google_android_gms_internal_zzagd;
    }

    private List<zzagp> zza(zzagv com_google_android_gms_internal_zzagv, zzafw com_google_android_gms_internal_zzafw, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu) {
        zza zzb = com_google_android_gms_internal_zzagv.zzb(com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu);
        if (!com_google_android_gms_internal_zzagv.zzSS().zzSO()) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            for (zzago com_google_android_gms_internal_zzago : zzb.zzbQb) {
                zzagq.zza zzSw = com_google_android_gms_internal_zzago.zzSw();
                if (zzSw == zzagq.zza.CHILD_ADDED) {
                    hashSet2.add(com_google_android_gms_internal_zzago.zzSv());
                } else if (zzSw == zzagq.zza.CHILD_REMOVED) {
                    hashSet.add(com_google_android_gms_internal_zzago.zzSv());
                }
            }
            if (!(hashSet2.isEmpty() && hashSet.isEmpty())) {
                this.zzbNk.zza(com_google_android_gms_internal_zzagv.zzSS(), hashSet2, hashSet);
            }
        }
        return zzb.zzbQa;
    }

    public boolean isEmpty() {
        return this.zzbNj.isEmpty();
    }

    public List<zzagv> zzRH() {
        List<zzagv> arrayList = new ArrayList();
        for (Entry value : this.zzbNj.entrySet()) {
            zzagv com_google_android_gms_internal_zzagv = (zzagv) value.getValue();
            if (!com_google_android_gms_internal_zzagv.zzSS().zzSO()) {
                arrayList.add(com_google_android_gms_internal_zzagv);
            }
        }
        return arrayList;
    }

    public boolean zzRI() {
        return zzRJ() != null;
    }

    public zzagv zzRJ() {
        for (Entry value : this.zzbNj.entrySet()) {
            zzagv com_google_android_gms_internal_zzagv = (zzagv) value.getValue();
            if (com_google_android_gms_internal_zzagv.zzSS().zzSO()) {
                return com_google_android_gms_internal_zzagv;
            }
        }
        return null;
    }

    public zzais<List<zzagu>, List<zzagq>> zza(zzagu com_google_android_gms_internal_zzagu, zzaew com_google_android_gms_internal_zzaew, DatabaseError databaseError) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        boolean zzRI = zzRI();
        zzagv com_google_android_gms_internal_zzagv;
        if (com_google_android_gms_internal_zzagu.isDefault()) {
            Iterator it = this.zzbNj.entrySet().iterator();
            while (it.hasNext()) {
                com_google_android_gms_internal_zzagv = (zzagv) ((Entry) it.next()).getValue();
                arrayList2.addAll(com_google_android_gms_internal_zzagv.zza(com_google_android_gms_internal_zzaew, databaseError));
                if (com_google_android_gms_internal_zzagv.isEmpty()) {
                    it.remove();
                    if (!com_google_android_gms_internal_zzagv.zzSS().zzSO()) {
                        arrayList.add(com_google_android_gms_internal_zzagv.zzSS());
                    }
                }
            }
        } else {
            com_google_android_gms_internal_zzagv = (zzagv) this.zzbNj.get(com_google_android_gms_internal_zzagu.zzSR());
            if (com_google_android_gms_internal_zzagv != null) {
                arrayList2.addAll(com_google_android_gms_internal_zzagv.zza(com_google_android_gms_internal_zzaew, databaseError));
                if (com_google_android_gms_internal_zzagv.isEmpty()) {
                    this.zzbNj.remove(com_google_android_gms_internal_zzagu.zzSR());
                    if (!com_google_android_gms_internal_zzagv.zzSS().zzSO()) {
                        arrayList.add(com_google_android_gms_internal_zzagv.zzSS());
                    }
                }
            }
        }
        if (zzRI && !zzRI()) {
            arrayList.add(zzagu.zzN(com_google_android_gms_internal_zzagu.zzPn()));
        }
        return new zzais(arrayList, arrayList2);
    }

    public List<zzagp> zza(zzaew com_google_android_gms_internal_zzaew, zzafr com_google_android_gms_internal_zzafr, zzagm com_google_android_gms_internal_zzagm) {
        zzagu zzQM = com_google_android_gms_internal_zzaew.zzQM();
        zzagv com_google_android_gms_internal_zzagv = (zzagv) this.zzbNj.get(zzQM.zzSR());
        if (com_google_android_gms_internal_zzagv == null) {
            boolean z;
            zzahu zzc = com_google_android_gms_internal_zzafr.zzc(com_google_android_gms_internal_zzagm.zzSr() ? com_google_android_gms_internal_zzagm.zzPj() : null);
            if (zzc != null) {
                z = true;
            } else {
                zzc = com_google_android_gms_internal_zzafr.zzd(com_google_android_gms_internal_zzagm.zzPj());
                z = false;
            }
            zzagv com_google_android_gms_internal_zzagv2 = new zzagv(zzQM, new zzagw(new zzagm(zzahp.zza(zzc, zzQM.zzSK()), z, false), com_google_android_gms_internal_zzagm));
            if (!zzQM.zzSO()) {
                Set hashSet = new HashSet();
                for (zzaht zzTK : com_google_android_gms_internal_zzagv2.zzSU()) {
                    hashSet.add(zzTK.zzTK());
                }
                this.zzbNk.zza(zzQM, hashSet);
            }
            this.zzbNj.put(zzQM.zzSR(), com_google_android_gms_internal_zzagv2);
            com_google_android_gms_internal_zzagv = com_google_android_gms_internal_zzagv2;
        }
        com_google_android_gms_internal_zzagv.zzb(com_google_android_gms_internal_zzaew);
        return com_google_android_gms_internal_zzagv.zzl(com_google_android_gms_internal_zzaew);
    }

    public List<zzagp> zza(zzafw com_google_android_gms_internal_zzafw, zzafr com_google_android_gms_internal_zzafr, zzahu com_google_android_gms_internal_zzahu) {
        zzagt zzSe = com_google_android_gms_internal_zzafw.zzRZ().zzSe();
        if (zzSe != null) {
            zzagv com_google_android_gms_internal_zzagv = (zzagv) this.zzbNj.get(zzSe);
            if ($assertionsDisabled || com_google_android_gms_internal_zzagv != null) {
                return zza(com_google_android_gms_internal_zzagv, com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu);
            }
            throw new AssertionError();
        }
        List<zzagp> arrayList = new ArrayList();
        for (Entry value : this.zzbNj.entrySet()) {
            arrayList.addAll(zza((zzagv) value.getValue(), com_google_android_gms_internal_zzafw, com_google_android_gms_internal_zzafr, com_google_android_gms_internal_zzahu));
        }
        return arrayList;
    }

    public zzagv zzb(zzagu com_google_android_gms_internal_zzagu) {
        return com_google_android_gms_internal_zzagu.zzSO() ? zzRJ() : (zzagv) this.zzbNj.get(com_google_android_gms_internal_zzagu.zzSR());
    }

    public boolean zzc(zzagu com_google_android_gms_internal_zzagu) {
        return zzb(com_google_android_gms_internal_zzagu) != null;
    }

    public zzahu zzs(zzafa com_google_android_gms_internal_zzafa) {
        for (zzagv com_google_android_gms_internal_zzagv : this.zzbNj.values()) {
            if (com_google_android_gms_internal_zzagv.zzs(com_google_android_gms_internal_zzafa) != null) {
                return com_google_android_gms_internal_zzagv.zzs(com_google_android_gms_internal_zzafa);
            }
        }
        return null;
    }
}
