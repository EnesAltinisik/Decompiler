package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.FitnessActivities;

public class zzzf implements zzvh {
    private final String zzbuw = Build.MANUFACTURER;
    private final String zzbux = Build.MODEL;

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        String str = this.zzbuw;
        String str2 = this.zzbux;
        if (!(str2.startsWith(str) || str.equals(FitnessActivities.UNKNOWN))) {
            str2 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
        }
        return new zzabp(str2);
    }
}
