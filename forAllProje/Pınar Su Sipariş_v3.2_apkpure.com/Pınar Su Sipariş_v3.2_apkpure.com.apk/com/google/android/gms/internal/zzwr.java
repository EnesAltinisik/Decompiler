package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzwr implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 3);
        zzabh<?> zza = zzvi.zza(zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[0])) ? zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[1]) : zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[2]);
        if (!(zza instanceof zzabl) || zza == zzabl.zzbvN || zza == zzabl.zzbvM) {
            return zza;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
