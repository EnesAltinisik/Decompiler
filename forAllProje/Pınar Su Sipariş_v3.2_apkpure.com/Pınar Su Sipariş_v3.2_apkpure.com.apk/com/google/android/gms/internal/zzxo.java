package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzxo implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzabh zza;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 4);
        zzabh zza2 = zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[3]);
        zzaa.zzaj(zza2 instanceof zzabm);
        List list = (List) ((zzabm) zza2).zzMk();
        zzabh<?> com_google_android_gms_internal_zzabh_ = com_google_android_gms_internal_zzabh_Arr[2];
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ instanceof zzabi);
        if (((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk()).booleanValue()) {
            zza = zzabq.zza(com_google_android_gms_internal_zzuw, list);
            if (zza == zzabl.zzbvK) {
                return zzabl.zzbvN;
            }
            if (zza.zzMr()) {
                return zza;
            }
        }
        while (zzvi.zza(zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[0]))) {
            zza = zzabq.zza(com_google_android_gms_internal_zzuw, list);
            if (zza == zzabl.zzbvK) {
                return zzabl.zzbvN;
            }
            if (zza.zzMr()) {
                return zza;
            }
            zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[1]);
        }
        return zzabl.zzbvN;
    }
}
