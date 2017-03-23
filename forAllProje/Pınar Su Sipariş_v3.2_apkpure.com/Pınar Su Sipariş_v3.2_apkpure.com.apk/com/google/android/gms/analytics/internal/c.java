package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;

class c {
    private final zze a;
    private long b;

    public c(zze com_google_android_gms_common_util_zze) {
        zzaa.zzz(com_google_android_gms_common_util_zze);
        this.a = com_google_android_gms_common_util_zze;
    }

    public c(zze com_google_android_gms_common_util_zze, long j) {
        zzaa.zzz(com_google_android_gms_common_util_zze);
        this.a = com_google_android_gms_common_util_zze;
        this.b = j;
    }

    public void a() {
        this.b = this.a.elapsedRealtime();
    }

    public boolean a(long j) {
        return this.b == 0 || this.a.elapsedRealtime() - this.b > j;
    }

    public void b() {
        this.b = 0;
    }
}
