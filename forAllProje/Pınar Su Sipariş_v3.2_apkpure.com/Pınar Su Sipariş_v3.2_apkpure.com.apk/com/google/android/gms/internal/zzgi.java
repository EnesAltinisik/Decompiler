package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.common.internal.zzaa;

@zzig
public final class zzgi implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzgc zzFD;
    private NativeAdMapper zzFE;

    public zzgi(zzgc com_google_android_gms_internal_zzgc) {
        this.zzFD = com_google_android_gms_internal_zzgc;
    }

    public void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        zzaa.zzdc("onAdClicked must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdClicked.");
        try {
            this.zzFD.onAdClicked();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdClicked.", e);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzaa.zzdc("onAdClicked must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdClicked.");
        try {
            this.zzFD.onAdClicked();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdClicked.", e);
        }
    }

    public void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        zzaa.zzdc("onAdClicked must be called on the main UI thread.");
        NativeAdMapper zzfM = zzfM();
        if (zzfM == null) {
            zzb.zzaW("Could not call onAdClicked since NativeAdMapper is null.");
        } else if (zzfM.getOverrideClickHandling()) {
            zzb.zzaU("Adapter called onAdClicked.");
            try {
                this.zzFD.onAdClicked();
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdClicked.", e);
            }
        } else {
            zzb.zzaU("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        zzaa.zzdc("onAdClosed must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdClosed.");
        try {
            this.zzFD.onAdClosed();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdClosed.", e);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzaa.zzdc("onAdClosed must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdClosed.");
        try {
            this.zzFD.onAdClosed();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdClosed.", e);
        }
    }

    public void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        zzaa.zzdc("onAdClosed must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdClosed.");
        try {
            this.zzFD.onAdClosed();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdClosed.", e);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        zzaa.zzdc("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.zzFD.onAdFailedToLoad(i);
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        zzaa.zzdc("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.zzFD.onAdFailedToLoad(i);
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        zzaa.zzdc("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.zzFD.onAdFailedToLoad(i);
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        zzaa.zzdc("onAdImpression must be called on the main UI thread.");
        NativeAdMapper zzfM = zzfM();
        if (zzfM == null) {
            zzb.zzaW("Could not call onAdImpression since NativeAdMapper is null. ");
        } else if (zzfM.getOverrideImpressionRecording()) {
            zzb.zzaU("Adapter called onAdImpression.");
            try {
                this.zzFD.onAdImpression();
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdImpression.", e);
            }
        } else {
            zzb.zzaU("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        zzaa.zzdc("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdLeftApplication.");
        try {
            this.zzFD.onAdLeftApplication();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzaa.zzdc("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdLeftApplication.");
        try {
            this.zzFD.onAdLeftApplication();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        zzaa.zzdc("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdLeftApplication.");
        try {
            this.zzFD.onAdLeftApplication();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        zzaa.zzdc("onAdLoaded must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdLoaded.");
        try {
            this.zzFD.onAdLoaded();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdLoaded.", e);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzaa.zzdc("onAdLoaded must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdLoaded.");
        try {
            this.zzFD.onAdLoaded();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdLoaded.", e);
        }
    }

    public void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        zzaa.zzdc("onAdLoaded must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdLoaded.");
        this.zzFE = nativeAdMapper;
        try {
            this.zzFD.onAdLoaded();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdLoaded.", e);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        zzaa.zzdc("onAdOpened must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdOpened.");
        try {
            this.zzFD.onAdOpened();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdOpened.", e);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzaa.zzdc("onAdOpened must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdOpened.");
        try {
            this.zzFD.onAdOpened();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdOpened.", e);
        }
    }

    public void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        zzaa.zzdc("onAdOpened must be called on the main UI thread.");
        zzb.zzaU("Adapter called onAdOpened.");
        try {
            this.zzFD.onAdOpened();
        } catch (Throwable e) {
            zzb.zzd("Could not call onAdOpened.", e);
        }
    }

    public NativeAdMapper zzfM() {
        return this.zzFE;
    }
}
