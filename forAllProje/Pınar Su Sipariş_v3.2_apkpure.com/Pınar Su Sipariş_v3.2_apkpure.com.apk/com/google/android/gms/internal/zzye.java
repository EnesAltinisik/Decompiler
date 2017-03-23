package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzye extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        return new zzabp(((String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk()).toLowerCase());
    }
}
