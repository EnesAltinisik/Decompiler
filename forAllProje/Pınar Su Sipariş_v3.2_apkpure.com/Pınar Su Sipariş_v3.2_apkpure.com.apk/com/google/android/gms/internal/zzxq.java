package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.zzaa;

public class zzxq extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        double zzb = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[0]);
        double zzb2 = zzvi.zzb(com_google_android_gms_internal_zzabh_Arr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzabj(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzabj(Double.valueOf(Double.NaN));
        }
        int i = (((double) Double.compare(zzb, 0.0d)) < 0.0d ? 1 : 0) ^ (((double) Double.compare(zzb2, 0.0d)) < 0.0d ? 1 : 0);
        if (Double.isInfinite(zzb) && !Double.isInfinite(zzb2)) {
            return new zzabj(Double.valueOf(i != 0 ? Double.NEGATIVE_INFINITY : MediaQueueItem.DEFAULT_PLAYBACK_DURATION));
        } else if (!Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzabj(Double.valueOf(i != 0 ? -0.0d : 0.0d));
        } else if (zzb == 0.0d) {
            if (zzb2 == 0.0d) {
                return new zzabj(Double.valueOf(Double.NaN));
            }
            return new zzabj(Double.valueOf(i != 0 ? -0.0d : 0.0d));
        } else if (Double.isInfinite(zzb) || zzb == 0.0d || zzb2 != 0.0d) {
            return new zzabj(Double.valueOf(zzb / zzb2));
        } else {
            return new zzabj(Double.valueOf(i != 0 ? Double.NEGATIVE_INFINITY : MediaQueueItem.DEFAULT_PLAYBACK_DURATION));
        }
    }
}
