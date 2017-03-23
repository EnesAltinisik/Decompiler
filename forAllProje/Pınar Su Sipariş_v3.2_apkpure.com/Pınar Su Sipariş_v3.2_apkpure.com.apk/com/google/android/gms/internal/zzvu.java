package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzvu extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzabh<?> com_google_android_gms_internal_zzabh_;
        int i;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 2 || com_google_android_gms_internal_zzabh_Arr.length == 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabk);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        zzabk com_google_android_gms_internal_zzabk = (zzabk) com_google_android_gms_internal_zzabh_Arr[1];
        int size = ((List) com_google_android_gms_internal_zzabm.zzMk()).size();
        if (com_google_android_gms_internal_zzabh_Arr.length == 3) {
            com_google_android_gms_internal_zzabh_ = com_google_android_gms_internal_zzabh_Arr[2];
            i = 0;
        } else {
            zzaa.zzai(size > 0);
            zzabh<?> zzkZ = com_google_android_gms_internal_zzabm.zzkZ(0);
            int i2 = 1;
            i = 0;
            while (i < size) {
                if (com_google_android_gms_internal_zzabm.zzla(i)) {
                    zzkZ = com_google_android_gms_internal_zzabm.zzkZ(i);
                    i2 = i + 1;
                    break;
                }
                i++;
            }
            zzaa.zzai(i < size);
            i = i2;
            com_google_android_gms_internal_zzabh_ = zzkZ;
        }
        int i3 = i;
        while (i3 < size && i3 < ((List) com_google_android_gms_internal_zzabm.zzMk()).size()) {
            zzabh<?> zzb = com_google_android_gms_internal_zzabm.zzla(i3) ? ((zzvh) com_google_android_gms_internal_zzabk.zzMk()).zzb(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_, (zzabh) r2.get(i3), new zzabj(Double.valueOf((double) i3)), com_google_android_gms_internal_zzabm) : com_google_android_gms_internal_zzabh_;
            i3++;
            com_google_android_gms_internal_zzabh_ = zzb;
        }
        return com_google_android_gms_internal_zzabh_;
    }
}
