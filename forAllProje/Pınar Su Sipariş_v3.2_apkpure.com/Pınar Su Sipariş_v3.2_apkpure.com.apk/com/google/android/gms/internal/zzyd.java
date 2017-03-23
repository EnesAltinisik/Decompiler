package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzyd extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length > 0 && com_google_android_gms_internal_zzabh_Arr.length <= 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        int zzc = (int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr.length < 2 ? zzabl.zzbvN : com_google_android_gms_internal_zzabh_Arr[1]);
        int length = str.length();
        if (com_google_android_gms_internal_zzabh_Arr.length == 3 && com_google_android_gms_internal_zzabh_Arr[2] != zzabl.zzbvN) {
            length = (int) zzvi.zzc(zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[2]));
        }
        zzc = Math.min(Math.max(zzc, 0), str.length());
        length = Math.min(Math.max(length, 0), str.length());
        return new zzabp(str.substring(Math.min(zzc, length), Math.max(zzc, length)));
    }
}
