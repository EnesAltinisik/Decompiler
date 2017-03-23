package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;

public class zzzd implements zzvh {
    private zze zzsd = new zzh();

    public void zza(zze com_google_android_gms_common_util_zze) {
        this.zzsd = (zze) zzaa.zzz(com_google_android_gms_common_util_zze);
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        return new zzabj(Double.valueOf((double) this.zzsd.currentTimeMillis()));
    }
}
