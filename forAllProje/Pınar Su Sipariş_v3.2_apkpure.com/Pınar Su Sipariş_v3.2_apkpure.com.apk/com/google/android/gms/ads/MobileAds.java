package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzag;
import com.google.android.gms.ads.internal.client.zzah;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MobileAds {

    public static final class Settings {
        private final zzah zzpo = new zzah();

        @Deprecated
        public String getTrackingId() {
            return this.zzpo.getTrackingId();
        }

        @Deprecated
        public boolean isGoogleAnalyticsEnabled() {
            return this.zzpo.isGoogleAnalyticsEnabled();
        }

        @Deprecated
        public Settings setGoogleAnalyticsEnabled(boolean z) {
            this.zzpo.zzo(z);
            return this;
        }

        @Deprecated
        public Settings setTrackingId(String str) {
            this.zzpo.zzO(str);
            return this;
        }

        zzah zzaZ() {
            return this.zzpo;
        }
    }

    private MobileAds() {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzag.zzei().getRewardedVideoAdInstance(context);
    }

    @Deprecated
    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzag.zzei().zza(context, str, settings == null ? null : settings.zzaZ());
    }

    public static void setAppMuted(boolean z) {
        zzag.zzei().setAppMuted(z);
    }

    public static void setAppVolume(float f) {
        zzag.zzei().setAppVolume(f);
    }
}
