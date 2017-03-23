package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzwk extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        boolean z2 = false;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr[1];
        if ((com_google_android_gms_internal_zzabh instanceof zzabn) || (com_google_android_gms_internal_zzabh instanceof zzabm) || (com_google_android_gms_internal_zzabh instanceof zzabk)) {
            com_google_android_gms_internal_zzabh = new zzabp(zzvi.zzd(com_google_android_gms_internal_zzabh));
        }
        zzabh com_google_android_gms_internal_zzabp = ((com_google_android_gms_internal_zzabh2 instanceof zzabn) || (com_google_android_gms_internal_zzabh2 instanceof zzabm) || (com_google_android_gms_internal_zzabh2 instanceof zzabk)) ? new zzabp(zzvi.zzd(com_google_android_gms_internal_zzabh2)) : com_google_android_gms_internal_zzabh2;
        if (((com_google_android_gms_internal_zzabh instanceof zzabp) && (com_google_android_gms_internal_zzabp instanceof zzabp)) || !(Double.isNaN(zzvi.zzb(com_google_android_gms_internal_zzabh)) || Double.isNaN(zzvi.zzb(com_google_android_gms_internal_zzabp)))) {
            if (zzvi.zzb(com_google_android_gms_internal_zzabp, com_google_android_gms_internal_zzabh)) {
                z = false;
            }
            z2 = z;
        }
        return new zzabi(Boolean.valueOf(z2));
    }
}
