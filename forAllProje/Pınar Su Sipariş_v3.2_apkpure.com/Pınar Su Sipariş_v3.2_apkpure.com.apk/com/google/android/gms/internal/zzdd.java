package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdf.zza;

@zzig
public final class zzdd extends zza {
    private final zzh zzAh;
    private final String zzAi;
    private final String zzAj;

    public zzdd(zzh com_google_android_gms_ads_internal_zzh, String str, String str2) {
        this.zzAh = com_google_android_gms_ads_internal_zzh;
        this.zzAi = str;
        this.zzAj = str2;
    }

    public String getContent() {
        return this.zzAj;
    }

    public void recordClick() {
        this.zzAh.zzbC();
    }

    public void recordImpression() {
        this.zzAh.zzbD();
    }

    public String zzeE() {
        return this.zzAi;
    }

    public void zzi(zzd com_google_android_gms_dynamic_zzd) {
        if (com_google_android_gms_dynamic_zzd != null) {
            this.zzAh.zzc((View) zze.zzx(com_google_android_gms_dynamic_zzd));
        }
    }
}
