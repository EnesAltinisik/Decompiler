package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzuu.zzc;

public class zzys extends zzvj {
    private final zzc zzbtj;

    public zzys(Context context, zzc com_google_android_gms_internal_zzuu_zzc) {
        this.zzbtj = com_google_android_gms_internal_zzuu_zzc;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        this.zzbtj.zzLr().zzaG(false);
        return zzabl.zzbvN;
    }
}
