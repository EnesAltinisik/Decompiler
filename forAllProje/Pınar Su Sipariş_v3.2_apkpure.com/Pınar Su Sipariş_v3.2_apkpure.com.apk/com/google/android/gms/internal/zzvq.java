package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzvq extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length > 0 && com_google_android_gms_internal_zzabh_Arr.length <= 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        if (com_google_android_gms_internal_zzabh_Arr.length < 2) {
            zzabh com_google_android_gms_internal_zzabh = zzabl.zzbvN;
        } else {
            zzabh<?> com_google_android_gms_internal_zzabh_ = com_google_android_gms_internal_zzabh_Arr[1];
        }
        List list = (List) com_google_android_gms_internal_zzabm.zzMk();
        int size = list.size();
        int i2 = size - 1;
        if (com_google_android_gms_internal_zzabh_Arr.length == 3) {
            i2 = (int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[2]);
            i2 = i2 < 0 ? size - Math.abs(i2) : Math.min(i2, size - 1);
        }
        size = i2;
        while (size >= 0) {
            if (com_google_android_gms_internal_zzabm.zzla(size) && zzvi.zzd(r3, (zzabh) list.get(size))) {
                i = size;
                break;
            }
            size--;
        }
        i = -1;
        return new zzabj(Double.valueOf((double) i));
    }
}
