package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.zzaa;

public class zzxx extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 2 || com_google_android_gms_internal_zzabh_Arr.length == 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
        double d = MediaQueueItem.DEFAULT_PLAYBACK_DURATION;
        if (com_google_android_gms_internal_zzabh_Arr.length == 3 && !Double.isNaN(zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[2]))) {
            d = zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[2]);
        }
        return new zzabj(Double.valueOf((double) str.lastIndexOf(zzd, (int) Math.min(Math.max(d, 0.0d), (double) str.length()))));
    }
}
