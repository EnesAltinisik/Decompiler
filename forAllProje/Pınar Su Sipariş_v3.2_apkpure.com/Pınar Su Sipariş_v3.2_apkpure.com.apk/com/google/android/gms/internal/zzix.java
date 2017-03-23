package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzb.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.dynamic.zze;

@zzig
public class zzix extends zza {
    private final Context mContext;
    private final zziy zzOx;
    private final Object zzpp = new Object();
    private final VersionInfoParcel zzqP;

    public zzix(Context context, zzd com_google_android_gms_ads_internal_zzd, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel) {
        this.mContext = context;
        this.zzqP = versionInfoParcel;
        this.zzOx = new zziy(context, com_google_android_gms_ads_internal_zzd, AdSizeParcel.zzdC(), com_google_android_gms_internal_zzga, versionInfoParcel);
    }

    public void destroy() {
        zzh(null);
    }

    public boolean isLoaded() {
        boolean isLoaded;
        synchronized (this.zzpp) {
            isLoaded = this.zzOx.isLoaded();
        }
        return isLoaded;
    }

    public void pause() {
        zzf(null);
    }

    public void resume() {
        zzg(null);
    }

    public void setUserId(String str) {
        zzb.zzaW("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void show() {
        synchronized (this.zzpp) {
            this.zzOx.zzil();
        }
    }

    public void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        synchronized (this.zzpp) {
            this.zzOx.zza(rewardedVideoAdRequestParcel);
        }
    }

    public void zza(com.google.android.gms.ads.internal.reward.client.zzd com_google_android_gms_ads_internal_reward_client_zzd) {
        synchronized (this.zzpp) {
            this.zzOx.zza(com_google_android_gms_ads_internal_reward_client_zzd);
        }
    }

    public void zzf(com.google.android.gms.dynamic.zzd com_google_android_gms_dynamic_zzd) {
        synchronized (this.zzpp) {
            this.zzOx.pause();
        }
    }

    public void zzg(com.google.android.gms.dynamic.zzd com_google_android_gms_dynamic_zzd) {
        synchronized (this.zzpp) {
            Context context = com_google_android_gms_dynamic_zzd == null ? null : (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
            if (context != null) {
                try {
                    this.zzOx.onContextChanged(context);
                } catch (Throwable e) {
                    zzb.zzd("Unable to extract updated context.", e);
                }
            }
            this.zzOx.resume();
        }
    }

    public void zzh(com.google.android.gms.dynamic.zzd com_google_android_gms_dynamic_zzd) {
        synchronized (this.zzpp) {
            this.zzOx.destroy();
        }
    }
}
