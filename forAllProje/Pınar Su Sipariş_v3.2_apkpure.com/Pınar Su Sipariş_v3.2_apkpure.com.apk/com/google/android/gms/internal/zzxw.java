package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxw extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 2 || com_google_android_gms_internal_zzabh_Arr.length == 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        return new zzabj(Double.valueOf((double) str.indexOf(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]), (int) Math.min(Math.max(com_google_android_gms_internal_zzabh_Arr.length < 3 ? 0.0d : zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[2]), 0.0d), (double) str.length()))));
    }
}
