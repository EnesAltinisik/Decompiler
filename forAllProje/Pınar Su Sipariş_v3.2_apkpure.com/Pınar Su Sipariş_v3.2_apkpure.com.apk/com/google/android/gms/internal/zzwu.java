package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzwu extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        if (com_google_android_gms_internal_zzuw.has(str)) {
            com_google_android_gms_internal_zzuw.zzb(str, com_google_android_gms_internal_zzabh_Arr[1]);
            return com_google_android_gms_internal_zzabh_Arr[1];
        }
        String str2 = "Attempting to assign to undefined variable ";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
