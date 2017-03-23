package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzvt extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        int size = ((List) com_google_android_gms_internal_zzabm.zzMk()).size();
        com_google_android_gms_internal_zzabm.setSize((com_google_android_gms_internal_zzabh_Arr.length + size) - 1);
        while (i < com_google_android_gms_internal_zzabh_Arr.length) {
            com_google_android_gms_internal_zzabm.zza(size, com_google_android_gms_internal_zzabh_Arr[i]);
            size++;
            i++;
        }
        return new zzabj(Double.valueOf((double) size));
    }
}
