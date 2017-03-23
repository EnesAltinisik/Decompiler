package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzyb extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length > 0 && com_google_android_gms_internal_zzabh_Arr.length <= 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        double zzc = com_google_android_gms_internal_zzabh_Arr.length < 2 ? 0.0d : zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[1]);
        double length = (double) str.length();
        if (com_google_android_gms_internal_zzabh_Arr.length == 3 && com_google_android_gms_internal_zzabh_Arr[2] != zzabl.zzbvN) {
            length = zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[2]);
        }
        int max = zzc < 0.0d ? (int) Math.max(zzc + ((double) str.length()), 0.0d) : (int) Math.min(zzc, (double) str.length());
        return new zzabp(str.substring(max, Math.max(0, (length < 0.0d ? (int) Math.max(((double) str.length()) + length, 0.0d) : (int) Math.min(length, (double) str.length())) - max) + max));
    }
}
