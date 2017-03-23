package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxr extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        double zzb = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[0]);
        double zzb2 = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[1]);
        return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? new zzabj(Double.valueOf(Double.NaN)) : (Double.isInfinite(zzb) || zzb2 == 0.0d) ? new zzabj(Double.valueOf(Double.NaN)) : (Double.isInfinite(zzb) || !Double.isInfinite(zzb2)) ? (zzb != 0.0d || zzb2 == 0.0d || Double.isInfinite(zzb2)) ? new zzabj(Double.valueOf(zzb % zzb2)) : new zzabj(Double.valueOf(zzb)) : new zzabj(Double.valueOf(zzb));
    }
}
