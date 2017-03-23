package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxd implements zzvh {
    private static zzuu zzbsl;

    public zzxd(zzuu com_google_android_gms_internal_zzuu) {
        zzbsl = com_google_android_gms_internal_zzuu;
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        return zzbsl.zzgY((String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk());
    }
}
