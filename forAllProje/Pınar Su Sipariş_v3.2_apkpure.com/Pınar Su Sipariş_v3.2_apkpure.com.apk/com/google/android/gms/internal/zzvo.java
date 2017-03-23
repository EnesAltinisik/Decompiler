package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzvo extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int zzc;
        int i;
        int i2 = 0;
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
        if (com_google_android_gms_internal_zzabh_Arr.length < 3) {
            zzabh com_google_android_gms_internal_zzabh2 = zzabl.zzbvN;
        } else {
            zzabh<?> com_google_android_gms_internal_zzabh_2 = com_google_android_gms_internal_zzabh_Arr[2];
        }
        List list = (List) com_google_android_gms_internal_zzabm.zzMk();
        int size = list.size();
        if (com_google_android_gms_internal_zzabh2 != zzabl.zzbvN) {
            zzc = (int) zzvi.zzc(com_google_android_gms_internal_zzabh2);
            i2 = zzc < 0 ? Math.max(size - Math.abs(zzc), 0) : zzc;
        }
        zzc = i2;
        while (zzc < size) {
            if (com_google_android_gms_internal_zzabm.zzla(zzc) && zzvi.zzd(r3, (zzabh) list.get(zzc))) {
                i = zzc;
                break;
            }
            zzc++;
        }
        i = -1;
        return new zzabj(Double.valueOf((double) i));
    }
}
