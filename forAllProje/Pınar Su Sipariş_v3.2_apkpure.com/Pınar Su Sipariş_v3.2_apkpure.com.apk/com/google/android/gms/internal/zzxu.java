package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxu extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 0;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 1 || com_google_android_gms_internal_zzabh_Arr.length == 2;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        if (com_google_android_gms_internal_zzabh_Arr.length == 2) {
            i = (int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[1]);
        }
        return (i < 0 || i >= str.length()) ? new zzabp("") : new zzabp(String.valueOf(str.charAt(i)));
    }
}
