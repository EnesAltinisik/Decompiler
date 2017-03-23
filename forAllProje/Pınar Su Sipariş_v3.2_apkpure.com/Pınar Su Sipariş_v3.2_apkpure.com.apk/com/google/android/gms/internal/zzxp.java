package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxp extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr[1];
        if ((!(com_google_android_gms_internal_zzabh instanceof zzabl) || com_google_android_gms_internal_zzabh == zzabl.zzbvN || com_google_android_gms_internal_zzabh == zzabl.zzbvM) && (!(com_google_android_gms_internal_zzabh2 instanceof zzabl) || com_google_android_gms_internal_zzabh2 == zzabl.zzbvN || com_google_android_gms_internal_zzabh2 == zzabl.zzbvM)) {
            if ((com_google_android_gms_internal_zzabh instanceof zzabn) || (com_google_android_gms_internal_zzabh instanceof zzabm) || (com_google_android_gms_internal_zzabh instanceof zzabk)) {
                com_google_android_gms_internal_zzabh = new zzabp(zzvi.zzd(com_google_android_gms_internal_zzabh));
            }
            zzabh com_google_android_gms_internal_zzabp = ((com_google_android_gms_internal_zzabh2 instanceof zzabn) || (com_google_android_gms_internal_zzabh2 instanceof zzabm) || (com_google_android_gms_internal_zzabh2 instanceof zzabk)) ? new zzabp(zzvi.zzd(com_google_android_gms_internal_zzabh2)) : com_google_android_gms_internal_zzabh2;
            if (!(com_google_android_gms_internal_zzabh instanceof zzabp) && !(com_google_android_gms_internal_zzabp instanceof zzabp)) {
                return new zzabj(Double.valueOf(zzvi.zza(com_google_android_gms_internal_zzabh, com_google_android_gms_internal_zzabp)));
            }
            String valueOf = String.valueOf(zzvi.zzd(com_google_android_gms_internal_zzabh));
            String valueOf2 = String.valueOf(zzvi.zzd(com_google_android_gms_internal_zzabp));
            return new zzabp(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
