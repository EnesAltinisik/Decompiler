package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import java.util.ArrayList;
import java.util.List;

public abstract class zzh<T extends zzh> {
    private final zzi zzUw;
    protected final zze zzUx;
    private final List<zzf> zzUy = new ArrayList();

    protected zzh(zzi com_google_android_gms_analytics_zzi, zze com_google_android_gms_common_util_zze) {
        zzaa.zzz(com_google_android_gms_analytics_zzi);
        this.zzUw = com_google_android_gms_analytics_zzi;
        zze com_google_android_gms_analytics_zze = new zze(this, com_google_android_gms_common_util_zze);
        com_google_android_gms_analytics_zze.zzkI();
        this.zzUx = com_google_android_gms_analytics_zze;
    }

    protected void zza(zze com_google_android_gms_analytics_zze) {
    }

    protected void zzd(zze com_google_android_gms_analytics_zze) {
        for (zzf zza : this.zzUy) {
            zza.zza(this, com_google_android_gms_analytics_zze);
        }
    }

    protected zzi zzkG() {
        return this.zzUw;
    }

    public zze zzkJ() {
        return this.zzUx;
    }

    public List<zzk> zzkK() {
        return this.zzUx.zzkA();
    }

    public zze zzkk() {
        zze zzky = this.zzUx.zzky();
        zzd(zzky);
        return zzky;
    }
}
