package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxc implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        zzabh<?> zzhc = com_google_android_gms_internal_zzuw.zzhc((String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk());
        if (zzhc instanceof zzabo) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        } else if (!(zzhc instanceof zzabl) || zzhc == zzabl.zzbvN || zzhc == zzabl.zzbvM) {
            return zzhc;
        } else {
            throw new IllegalStateException("Illegal InternalType encountered in Get.");
        }
    }
}
