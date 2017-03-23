package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxv extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length > 0);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        StringBuilder stringBuilder = new StringBuilder((String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk());
        while (i < com_google_android_gms_internal_zzabh_Arr.length) {
            stringBuilder.append(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[i]));
            i++;
        }
        return new zzabp(stringBuilder.toString());
    }
}
