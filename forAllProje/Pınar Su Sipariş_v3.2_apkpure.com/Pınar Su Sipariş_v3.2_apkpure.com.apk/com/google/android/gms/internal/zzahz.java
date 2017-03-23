package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class zzahz {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahz.class.desiredAssertionStatus());
    private final zzafa zzbRo;
    private final zzafa zzbRp;
    private final zzahu zzbRq;

    public zzahz(zzael com_google_android_gms_internal_zzael) {
        zzafa com_google_android_gms_internal_zzafa = null;
        List zzQu = com_google_android_gms_internal_zzael.zzQu();
        this.zzbRo = zzQu != null ? new zzafa(zzQu) : null;
        List zzQv = com_google_android_gms_internal_zzael.zzQv();
        if (zzQv != null) {
            com_google_android_gms_internal_zzafa = new zzafa(zzQv);
        }
        this.zzbRp = com_google_android_gms_internal_zzafa;
        this.zzbRq = zzahv.zzaq(com_google_android_gms_internal_zzael.zzQw());
    }

    private zzahu zzb(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu2) {
        Object obj = 1;
        int zzj = this.zzbRo == null ? 1 : com_google_android_gms_internal_zzafa.zzj(this.zzbRo);
        int zzj2 = this.zzbRp == null ? -1 : com_google_android_gms_internal_zzafa.zzj(this.zzbRp);
        Object obj2 = (this.zzbRo == null || !com_google_android_gms_internal_zzafa.zzi(this.zzbRo)) ? null : 1;
        if (this.zzbRp == null || !com_google_android_gms_internal_zzafa.zzi(this.zzbRp)) {
            obj = null;
        }
        if (zzj > 0 && zzj2 < 0 && r1 == null) {
            return com_google_android_gms_internal_zzahu2;
        }
        if (zzj > 0 && r1 != null && com_google_android_gms_internal_zzahu2.zzTo()) {
            return com_google_android_gms_internal_zzahu2;
        }
        if (zzj <= 0 || zzj2 != 0) {
            if (obj2 != null || r1 != null) {
                Collection hashSet = new HashSet();
                for (zzaht zzTK : com_google_android_gms_internal_zzahu) {
                    hashSet.add(zzTK.zzTK());
                }
                for (zzaht zzTK2 : com_google_android_gms_internal_zzahu2) {
                    hashSet.add(zzTK2.zzTK());
                }
                List<zzahi> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!(com_google_android_gms_internal_zzahu2.zzTp().isEmpty() && com_google_android_gms_internal_zzahu.zzTp().isEmpty())) {
                    arrayList.add(zzahi.zzTj());
                }
                zzahu com_google_android_gms_internal_zzahu3 = com_google_android_gms_internal_zzahu;
                for (zzahi com_google_android_gms_internal_zzahi : arrayList) {
                    zzahu zzm = com_google_android_gms_internal_zzahu.zzm(com_google_android_gms_internal_zzahi);
                    zzahu zzb = zzb(com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzahi), com_google_android_gms_internal_zzahu.zzm(com_google_android_gms_internal_zzahi), com_google_android_gms_internal_zzahu2.zzm(com_google_android_gms_internal_zzahi));
                    com_google_android_gms_internal_zzahu3 = zzb != zzm ? com_google_android_gms_internal_zzahu3.zze(com_google_android_gms_internal_zzahi, zzb) : com_google_android_gms_internal_zzahu3;
                }
                return com_google_android_gms_internal_zzahu3;
            } else if ($assertionsDisabled || zzj2 > 0 || zzj <= 0) {
                return com_google_android_gms_internal_zzahu;
            } else {
                throw new AssertionError();
            }
        } else if (!$assertionsDisabled && r1 == null) {
            throw new AssertionError();
        } else if ($assertionsDisabled || !com_google_android_gms_internal_zzahu2.zzTo()) {
            return com_google_android_gms_internal_zzahu.zzTo() ? zzahn.zzTA() : com_google_android_gms_internal_zzahu;
        } else {
            throw new AssertionError();
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbRo);
        String valueOf2 = String.valueOf(this.zzbRp);
        String valueOf3 = String.valueOf(this.zzbRq);
        return new StringBuilder(((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("RangeMerge{optExclusiveStart=").append(valueOf).append(", optInclusiveEnd=").append(valueOf2).append(", snap=").append(valueOf3).append("}").toString();
    }

    public zzahu zzq(zzahu com_google_android_gms_internal_zzahu) {
        return zzb(zzafa.zzRq(), com_google_android_gms_internal_zzahu, this.zzbRq);
    }
}
