package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzzc implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        return com_google_android_gms_internal_zzuw.has("gtm.globals.eventName") ? com_google_android_gms_internal_zzuw.zzhc("gtm.globals.eventName") : zzabl.zzbvM;
    }
}
