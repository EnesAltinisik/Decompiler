package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.internal.reward.client.zzd.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzig;

@zzig
public class zzg extends zza {
    private final RewardedVideoAdListener zzaY;

    public zzg(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzaY = rewardedVideoAdListener;
    }

    public void onRewardedVideoAdClosed() {
        if (this.zzaY != null) {
            this.zzaY.onRewardedVideoAdClosed();
        }
    }

    public void onRewardedVideoAdFailedToLoad(int i) {
        if (this.zzaY != null) {
            this.zzaY.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public void onRewardedVideoAdLeftApplication() {
        if (this.zzaY != null) {
            this.zzaY.onRewardedVideoAdLeftApplication();
        }
    }

    public void onRewardedVideoAdLoaded() {
        if (this.zzaY != null) {
            this.zzaY.onRewardedVideoAdLoaded();
        }
    }

    public void onRewardedVideoAdOpened() {
        if (this.zzaY != null) {
            this.zzaY.onRewardedVideoAdOpened();
        }
    }

    public void onRewardedVideoStarted() {
        if (this.zzaY != null) {
            this.zzaY.onRewardedVideoStarted();
        }
    }

    public void zza(zza com_google_android_gms_ads_internal_reward_client_zza) {
        if (this.zzaY != null) {
            this.zzaY.onRewarded(new zze(com_google_android_gms_ads_internal_reward_client_zza));
        }
    }
}
