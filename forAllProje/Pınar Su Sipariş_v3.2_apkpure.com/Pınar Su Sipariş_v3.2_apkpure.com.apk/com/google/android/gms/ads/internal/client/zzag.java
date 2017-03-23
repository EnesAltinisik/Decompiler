package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzfz;
import com.google.android.gms.internal.zzig;

@zzig
public class zzag {
    private static final Object zzrs = new Object();
    private static zzag zzws;
    private zzz zzwt;
    private RewardedVideoAd zzwu;

    private zzag() {
    }

    public static zzag zzei() {
        zzag com_google_android_gms_ads_internal_client_zzag;
        synchronized (zzrs) {
            if (zzws == null) {
                zzws = new zzag();
            }
            com_google_android_gms_ads_internal_client_zzag = zzws;
        }
        return com_google_android_gms_ads_internal_client_zzag;
    }

    public RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        RewardedVideoAd rewardedVideoAd;
        synchronized (zzrs) {
            if (this.zzwu != null) {
                rewardedVideoAd = this.zzwu;
            } else {
                this.zzwu = new zzi(context, zzm.zzdR().zza(context, new zzfz()));
                rewardedVideoAd = this.zzwu;
            }
        }
        return rewardedVideoAd;
    }

    public void setAppMuted(boolean z) {
        zzaa.zza(this.zzwt != null, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.zzwt.setAppMuted(z);
        } catch (Throwable e) {
            zzb.zzb("Unable to set app mute state.", e);
        }
    }

    public void setAppVolume(float f) {
        boolean z = true;
        boolean z2 = 0.0f <= f && f <= TextTrackStyle.DEFAULT_FONT_SCALE;
        zzaa.zzb(z2, (Object) "The app volume must be a value between 0 and 1 inclusive.");
        if (this.zzwt == null) {
            z = false;
        }
        zzaa.zza(z, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.zzwt.setAppVolume(f);
        } catch (Throwable e) {
            zzb.zzb("Unable to set app volume.", e);
        }
    }

    public void zza(Context context, String str, zzah com_google_android_gms_ads_internal_client_zzah) {
        synchronized (zzrs) {
            if (this.zzwt != null) {
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            } else {
                try {
                    this.zzwt = zzm.zzdR().zzl(context);
                    this.zzwt.initialize();
                    if (str != null) {
                        this.zzwt.zzu(str);
                    }
                } catch (Throwable e) {
                    zzb.zzd("Fail to initialize or set applicationCode on mobile ads setting manager", e);
                }
            }
        }
    }
}
