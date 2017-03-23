package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.reward.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzfz;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzig;

@zzig
public class zzaf {
    private final Context mContext;
    private RewardedVideoAdListener zzaY;
    private final zzh zzpd;
    private String zzqO;
    private zza zzuL;
    private AdListener zzuM;
    private AppEventListener zzvy;
    private final zzfz zzwc;
    private Correlator zzwg;
    private zzu zzwh;
    private InAppPurchaseListener zzwi;
    private OnCustomRenderedAdLoadedListener zzwj;
    private PlayStorePurchaseListener zzwk;
    private String zzwm;
    private PublisherInterstitialAd zzwq;
    private boolean zzwr;

    public zzaf(Context context) {
        this(context, zzh.zzdB(), null);
    }

    public zzaf(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzh.zzdB(), publisherInterstitialAd);
    }

    public zzaf(Context context, zzh com_google_android_gms_ads_internal_client_zzh, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzwc = new zzfz();
        this.mContext = context;
        this.zzpd = com_google_android_gms_ads_internal_client_zzh;
        this.zzwq = publisherInterstitialAd;
    }

    private void zzM(String str) throws RemoteException {
        if (this.zzqO == null) {
            zzN(str);
        }
        this.zzwh = zzm.zzdR().zzb(this.mContext, this.zzwr ? AdSizeParcel.zzdC() : new AdSizeParcel(), this.zzqO, this.zzwc);
        if (this.zzuM != null) {
            this.zzwh.zza(new zzc(this.zzuM));
        }
        if (this.zzuL != null) {
            this.zzwh.zza(new zzb(this.zzuL));
        }
        if (this.zzvy != null) {
            this.zzwh.zza(new zzj(this.zzvy));
        }
        if (this.zzwi != null) {
            this.zzwh.zza(new zzhm(this.zzwi));
        }
        if (this.zzwk != null) {
            this.zzwh.zza(new zzhq(this.zzwk), this.zzwm);
        }
        if (this.zzwj != null) {
            this.zzwh.zza(new zzdh(this.zzwj));
        }
        if (this.zzwg != null) {
            this.zzwh.zza(this.zzwg.zzaY());
        }
        if (this.zzaY != null) {
            this.zzwh.zza(new zzg(this.zzaY));
        }
    }

    private void zzN(String str) {
        if (this.zzwh == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    public AdListener getAdListener() {
        return this.zzuM;
    }

    public String getAdUnitId() {
        return this.zzqO;
    }

    public AppEventListener getAppEventListener() {
        return this.zzvy;
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.zzwi;
    }

    public String getMediationAdapterClassName() {
        try {
            if (this.zzwh != null) {
                return this.zzwh.getMediationAdapterClassName();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzwj;
    }

    public boolean isLoaded() {
        boolean z = false;
        try {
            if (this.zzwh != null) {
                z = this.zzwh.isReady();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to check if ad is ready.", e);
        }
        return z;
    }

    public boolean isLoading() {
        boolean z = false;
        try {
            if (this.zzwh != null) {
                z = this.zzwh.isLoading();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to check if ad is loading.", e);
        }
        return z;
    }

    public void setAdListener(AdListener adListener) {
        try {
            this.zzuM = adListener;
            if (this.zzwh != null) {
                this.zzwh.zza(adListener != null ? new zzc(adListener) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the AdListener.", e);
        }
    }

    public void setAdUnitId(String str) {
        if (this.zzqO != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzqO = str;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzvy = appEventListener;
            if (this.zzwh != null) {
                this.zzwh.zza(appEventListener != null ? new zzj(appEventListener) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the AppEventListener.", e);
        }
    }

    public void setCorrelator(Correlator correlator) {
        this.zzwg = correlator;
        try {
            if (this.zzwh != null) {
                this.zzwh.zza(this.zzwg == null ? null : this.zzwg.zzaY());
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set correlator.", e);
        }
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        if (this.zzwk != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.zzwi = inAppPurchaseListener;
            if (this.zzwh != null) {
                this.zzwh.zza(inAppPurchaseListener != null ? new zzhm(inAppPurchaseListener) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzwj = onCustomRenderedAdLoadedListener;
            if (this.zzwh != null) {
                this.zzwh.zza(onCustomRenderedAdLoadedListener != null ? new zzdh(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the OnCustomRenderedAdLoadedListener.", e);
        }
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        if (this.zzwi != null) {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        try {
            this.zzwk = playStorePurchaseListener;
            this.zzwm = str;
            if (this.zzwh != null) {
                this.zzwh.zza(playStorePurchaseListener != null ? new zzhq(playStorePurchaseListener) : null, str);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the play store purchase parameter.", e);
        }
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzaY = rewardedVideoAdListener;
            if (this.zzwh != null) {
                this.zzwh.zza(rewardedVideoAdListener != null ? new zzg(rewardedVideoAdListener) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the AdListener.", e);
        }
    }

    public void show() {
        try {
            zzN("show");
            this.zzwh.showInterstitial();
        } catch (Throwable e) {
            zzb.zzd("Failed to show interstitial.", e);
        }
    }

    public void zza(zza com_google_android_gms_ads_internal_client_zza) {
        try {
            this.zzuL = com_google_android_gms_ads_internal_client_zza;
            if (this.zzwh != null) {
                this.zzwh.zza(com_google_android_gms_ads_internal_client_zza != null ? new zzb(com_google_android_gms_ads_internal_client_zza) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the AdClickListener.", e);
        }
    }

    public void zza(zzad com_google_android_gms_ads_internal_client_zzad) {
        try {
            if (this.zzwh == null) {
                zzM("loadAd");
            }
            if (this.zzwh.zzb(this.zzpd.zza(this.mContext, com_google_android_gms_ads_internal_client_zzad))) {
                this.zzwc.zzh(com_google_android_gms_ads_internal_client_zzad.zzea());
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to load ad.", e);
        }
    }

    public void zzc(boolean z) {
        this.zzwr = z;
    }
}
