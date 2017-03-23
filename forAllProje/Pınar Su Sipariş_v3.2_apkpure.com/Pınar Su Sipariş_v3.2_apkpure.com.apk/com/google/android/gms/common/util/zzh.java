package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class zzh implements zze {
    private static zzh zzaua;

    public static synchronized zze zzuW() {
        zze com_google_android_gms_common_util_zze;
        synchronized (zzh.class) {
            if (zzaua == null) {
                zzaua = new zzh();
            }
            com_google_android_gms_common_util_zze = zzaua;
        }
        return com_google_android_gms_common_util_zze;
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public long nanoTime() {
        return System.nanoTime();
    }
}
