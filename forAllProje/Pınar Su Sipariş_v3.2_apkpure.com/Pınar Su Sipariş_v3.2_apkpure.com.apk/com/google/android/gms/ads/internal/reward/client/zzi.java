package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzig;

@zzig
public class zzi implements RewardedVideoAd {
    private final Context mContext;
    private final zzb zzOD;
    private RewardedVideoAdListener zzaY;
    private final Object zzpp = new Object();

    public zzi(Context context, zzb com_google_android_gms_ads_internal_reward_client_zzb) {
        this.zzOD = com_google_android_gms_ads_internal_reward_client_zzb;
        this.mContext = context;
    }

    public void destroy() {
        destroy(null);
    }

    public void destroy(Context context) {
        synchronized (this.zzpp) {
            if (this.zzOD == null) {
                return;
            }
            try {
                this.zzOD.zzh(zze.zzD(context));
            } catch (Throwable e) {
                zzb.zzd("Could not forward destroy to RewardedVideoAd", e);
            }
        }
    }

    public RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.zzpp) {
            rewardedVideoAdListener = this.zzaY;
        }
        return rewardedVideoAdListener;
    }

    public String getUserId() {
        zzb.zzaW("RewardedVideoAd.getUserId() is deprecated. Please do not call this method.");
        return null;
    }

    public boolean isLoaded() {
        boolean z = false;
        synchronized (this.zzpp) {
            if (this.zzOD == null) {
            } else {
                try {
                    z = this.zzOD.isLoaded();
                } catch (Throwable e) {
                    zzb.zzd("Could not forward isLoaded to RewardedVideoAd", e);
                }
            }
        }
        return z;
    }

    public void loadAd(String str, AdRequest adRequest) {
        synchronized (this.zzpp) {
            if (this.zzOD == null) {
                return;
            }
            try {
                this.zzOD.zza(zzh.zzdB().zza(this.mContext, adRequest.zzaX(), str));
            } catch (Throwable e) {
                zzb.zzd("Could not forward loadAd to RewardedVideoAd", e);
            }
        }
    }

    public void pause() {
        pause(null);
    }

    public void pause(Context context) {
        synchronized (this.zzpp) {
            if (this.zzOD == null) {
                return;
            }
            try {
                this.zzOD.zzf(zze.zzD(context));
            } catch (Throwable e) {
                zzb.zzd("Could not forward pause to RewardedVideoAd", e);
            }
        }
    }

    public void resume() {
        resume(null);
    }

    public void resume(Context context) {
        synchronized (this.zzpp) {
            if (this.zzOD == null) {
                return;
            }
            try {
                this.zzOD.zzg(zze.zzD(context));
            } catch (Throwable e) {
                zzb.zzd("Could not forward resume to RewardedVideoAd", e);
            }
        }
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.zzpp) {
            this.zzaY = rewardedVideoAdListener;
            if (this.zzOD != null) {
                try {
                    this.zzOD.zza(new zzg(rewardedVideoAdListener));
                } catch (Throwable e) {
                    zzb.zzd("Could not forward setRewardedVideoAdListener to RewardedVideoAd", e);
                }
            }
        }
    }

    public void setUserId(String str) {
        zzb.zzaW("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void show() {
        synchronized (this.zzpp) {
            if (this.zzOD == null) {
                return;
            }
            try {
                this.zzOD.show();
            } catch (Throwable e) {
                zzb.zzd("Could not forward show to RewardedVideoAd", e);
            }
        }
    }
}
