package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.HashMap;
import java.util.Map;

public class zzwz extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 0;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        Map hashMap = new HashMap();
        while (i < com_google_android_gms_internal_zzabh_Arr.length - 1) {
            String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[i]);
            zzabl com_google_android_gms_internal_zzabl = com_google_android_gms_internal_zzabh_Arr[i + 1];
            if (!(com_google_android_gms_internal_zzabl instanceof zzabl) || com_google_android_gms_internal_zzabl == zzabl.zzbvM || com_google_android_gms_internal_zzabl == zzabl.zzbvN) {
                hashMap.put(zzd, com_google_android_gms_internal_zzabl);
                i += 2;
            } else {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
        }
        return new zzabn(hashMap);
    }
}
