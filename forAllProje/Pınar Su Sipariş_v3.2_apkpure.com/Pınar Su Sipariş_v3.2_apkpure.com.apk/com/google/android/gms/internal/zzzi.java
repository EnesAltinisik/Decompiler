package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzuu.zzc;

public class zzzi extends zzvj {
    private final zzc zzbuz;

    public zzzi(zzc com_google_android_gms_internal_zzuu_zzc) {
        this.zzbuz = com_google_android_gms_internal_zzuu_zzc;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        return zzabq.zzY(this.zzbuz.zzLr().zzKV());
    }
}
