package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzzt extends zzvj {
    private static final zzabj zzbuA = new zzabj(Double.valueOf(0.0d));
    private static final zzabj zzbuB = new zzabj(Double.valueOf(2.147483647E9d));

    private boolean zzg(zzabh<?> com_google_android_gms_internal_zzabh_) {
        return (com_google_android_gms_internal_zzabh_ instanceof zzabj) && !Double.isNaN(((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue());
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        double doubleValue;
        double doubleValue2;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr.length > 0 ? com_google_android_gms_internal_zzabh_Arr[0] : zzbuA;
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr.length > 1 ? com_google_android_gms_internal_zzabh_Arr[1] : zzbuB;
        if (zzg(com_google_android_gms_internal_zzabh) && zzg(com_google_android_gms_internal_zzabh2) && zzvi.zzb(com_google_android_gms_internal_zzabh, com_google_android_gms_internal_zzabh2)) {
            doubleValue = ((Double) ((zzabj) com_google_android_gms_internal_zzabh).zzMk()).doubleValue();
            doubleValue2 = ((Double) ((zzabj) com_google_android_gms_internal_zzabh2).zzMk()).doubleValue();
        } else {
            doubleValue2 = 2.147483647E9d;
            doubleValue = 0.0d;
        }
        return new zzabj(Double.valueOf((double) Math.round(((doubleValue2 - doubleValue) * Math.random()) + doubleValue)));
    }
}
