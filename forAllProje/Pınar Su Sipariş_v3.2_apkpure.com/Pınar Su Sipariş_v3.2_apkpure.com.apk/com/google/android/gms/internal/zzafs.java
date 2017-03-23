package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class zzafs implements zzaex {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafs.class.desiredAssertionStatus());
    private static zzafs zzbOj = new zzafs();
    final HashMap<zzaew, List<zzaew>> zzbOi = new HashMap();

    private zzafs() {
    }

    public static zzafs zzRV() {
        return zzbOj;
    }

    private void zzj(zzaew com_google_android_gms_internal_zzaew) {
        int i = 0;
        synchronized (this.zzbOi) {
            List list = (List) this.zzbOi.get(com_google_android_gms_internal_zzaew);
            int i2;
            if (list != null) {
                int i3;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    if (list.get(i4) == com_google_android_gms_internal_zzaew) {
                        i3 = 1;
                        list.remove(i4);
                        break;
                    }
                }
                i3 = 0;
                if (list.isEmpty()) {
                    this.zzbOi.remove(com_google_android_gms_internal_zzaew);
                }
                i2 = i3;
            } else {
                i2 = 0;
            }
            if (!$assertionsDisabled && r0 == 0 && com_google_android_gms_internal_zzaew.zzRn()) {
                throw new AssertionError();
            }
            if (!com_google_android_gms_internal_zzaew.zzQM().isDefault()) {
                zzaew zza = com_google_android_gms_internal_zzaew.zza(zzagu.zzN(com_google_android_gms_internal_zzaew.zzQM().zzPn()));
                list = (List) this.zzbOi.get(zza);
                if (list != null) {
                    while (i < list.size()) {
                        if (list.get(i) == com_google_android_gms_internal_zzaew) {
                            list.remove(i);
                            break;
                        }
                        i++;
                    }
                    if (list.isEmpty()) {
                        this.zzbOi.remove(zza);
                    }
                }
            }
        }
    }

    public void zzd(zzaew com_google_android_gms_internal_zzaew) {
        zzj(com_google_android_gms_internal_zzaew);
    }

    public void zzi(zzaew com_google_android_gms_internal_zzaew) {
        synchronized (this.zzbOi) {
            List list = (List) this.zzbOi.get(com_google_android_gms_internal_zzaew);
            if (list == null) {
                list = new ArrayList();
                this.zzbOi.put(com_google_android_gms_internal_zzaew, list);
            }
            list.add(com_google_android_gms_internal_zzaew);
            if (!com_google_android_gms_internal_zzaew.zzQM().isDefault()) {
                zzaew zza = com_google_android_gms_internal_zzaew.zza(zzagu.zzN(com_google_android_gms_internal_zzaew.zzQM().zzPn()));
                list = (List) this.zzbOi.get(zza);
                if (list == null) {
                    list = new ArrayList();
                    this.zzbOi.put(zza, list);
                }
                list.add(com_google_android_gms_internal_zzaew);
            }
            com_google_android_gms_internal_zzaew.zzaR(true);
            com_google_android_gms_internal_zzaew.zza((zzaex) this);
        }
    }

    public void zzk(zzaew com_google_android_gms_internal_zzaew) {
        synchronized (this.zzbOi) {
            List list = (List) this.zzbOi.get(com_google_android_gms_internal_zzaew);
            if (!(list == null || list.isEmpty())) {
                if (com_google_android_gms_internal_zzaew.zzQM().isDefault()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        zzaew com_google_android_gms_internal_zzaew2 = (zzaew) list.get(size);
                        if (!hashSet.contains(com_google_android_gms_internal_zzaew2.zzQM())) {
                            hashSet.add(com_google_android_gms_internal_zzaew2.zzQM());
                            com_google_android_gms_internal_zzaew2.zzRl();
                        }
                    }
                } else {
                    ((zzaew) list.get(0)).zzRl();
                }
            }
        }
    }
}
