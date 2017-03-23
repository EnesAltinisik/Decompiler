package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzww extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        for (zzabh zza : (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[0]).zzMk()) {
            zzabh<?> zza2 = zzabq.zza(com_google_android_gms_internal_zzuw, zza);
            if ((zza2 instanceof zzabl) && (zza2 == zzabl.zzbvK || zza2 == zzabl.zzbvL || ((zzabl) zza2).zzMr())) {
                return zza2;
            }
        }
        return zzabl.zzbvN;
    }
}
