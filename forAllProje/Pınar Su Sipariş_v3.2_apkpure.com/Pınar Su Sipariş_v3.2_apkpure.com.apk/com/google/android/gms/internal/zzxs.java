package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.zzaa;

public class zzxs extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        double zzb = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[0]);
        double zzb2 = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzabj(Double.valueOf(Double.NaN));
        }
        if ((Double.isInfinite(zzb) && zzb2 == 0.0d) || (zzb == 0.0d && Double.isInfinite(zzb2))) {
            return new zzabj(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(zzb) && !Double.isInfinite(zzb2)) {
            return new zzabj(Double.valueOf(zzb * zzb2));
        }
        int i2 = ((double) Double.compare(zzb, 0.0d)) < 0.0d ? 1 : 0;
        if (((double) Double.compare(zzb2, 0.0d)) >= 0.0d) {
            i = 0;
        }
        return new zzabj(Double.valueOf((i2 ^ i) != 0 ? Double.NEGATIVE_INFINITY : MediaQueueItem.DEFAULT_PLAYBACK_DURATION));
    }
}
