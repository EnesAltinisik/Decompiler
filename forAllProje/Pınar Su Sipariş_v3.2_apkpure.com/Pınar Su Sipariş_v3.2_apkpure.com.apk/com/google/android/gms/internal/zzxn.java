package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxn implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        int i = 0;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length <= 0) {
            z = false;
        }
        zzaa.zzaj(z);
        int length = com_google_android_gms_internal_zzabh_Arr.length;
        while (i < length) {
            Object obj = com_google_android_gms_internal_zzabh_Arr[i];
            zzaa.zzz(obj);
            zzaa.zzaj(obj instanceof zzabp);
            com_google_android_gms_internal_zzuw.zza((String) ((zzabp) obj).zzMk(), zzabl.zzbvN);
            i++;
        }
        return zzabl.zzbvN;
    }
}
