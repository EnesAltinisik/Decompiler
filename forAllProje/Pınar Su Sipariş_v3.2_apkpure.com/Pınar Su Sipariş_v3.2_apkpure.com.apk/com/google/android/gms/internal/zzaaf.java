package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public abstract class zzaaf extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 2) {
            z = false;
        }
        zzaa.zzaj(z);
        try {
            double zzb = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[0]);
            double zzb2 = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[1]);
            return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? new zzabi(Boolean.valueOf(false)) : new zzabi(Boolean.valueOf(zzf(zzb, zzb2)));
        } catch (IllegalArgumentException e) {
            return new zzabi(Boolean.valueOf(false));
        }
    }

    protected abstract boolean zzf(double d, double d2);
}
