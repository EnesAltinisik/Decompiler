package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzfz;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzig;
import java.util.concurrent.atomic.AtomicBoolean;

@zzig
public class zzae {
    private final zzh zzpd;
    private String zzqO;
    private boolean zzqs;
    private zza zzuL;
    private AdListener zzuM;
    private AppEventListener zzvy;
    private AdSize[] zzvz;
    private final zzfz zzwc;
    private final AtomicBoolean zzwd;
    private final VideoController zzwe;
    final zzo zzwf;
    private Correlator zzwg;
    private zzu zzwh;
    private InAppPurchaseListener zzwi;
    private OnCustomRenderedAdLoadedListener zzwj;
    private PlayStorePurchaseListener zzwk;
    private VideoOptions zzwl;
    private String zzwm;
    private ViewGroup zzwn;
    private boolean zzwo;

    public zzae(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzh.zzdB(), false);
    }

    public zzae(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzh.zzdB(), false);
    }

    zzae(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzh com_google_android_gms_ads_internal_client_zzh, zzu com_google_android_gms_ads_internal_client_zzu, boolean z2) {
        this.zzwc = new zzfz();
        this.zzwe = new VideoController();
        this.zzwf = new zzo(this) {
            final /* synthetic */ zzae a;

            {
                this.a = r1;
            }

            public void onAdFailedToLoad(int i) {
                this.a.zzwe.zza(this.a.zzee());
                super.onAdFailedToLoad(i);
            }

            public void onAdLoaded() {
                this.a.zzwe.zza(this.a.zzee());
                super.onAdLoaded();
            }
        };
        this.zzwn = viewGroup;
        this.zzpd = com_google_android_gms_ads_internal_client_zzh;
        this.zzwh = com_google_android_gms_ads_internal_client_zzu;
        this.zzwd = new AtomicBoolean(false);
        this.zzwo = z2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzk com_google_android_gms_ads_internal_client_zzk = new zzk(context, attributeSet);
                this.zzvz = com_google_android_gms_ads_internal_client_zzk.zzk(z);
                this.zzqO = com_google_android_gms_ads_internal_client_zzk.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzm.zzdQ().zza(viewGroup, zza(context, this.zzvz[0], this.zzwo), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzm.zzdQ().zza(viewGroup, new AdSizeParcel(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    zzae(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzh com_google_android_gms_ads_internal_client_zzh, boolean z2) {
        this(viewGroup, attributeSet, z, com_google_android_gms_ads_internal_client_zzh, null, z2);
    }

    public zzae(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, boolean z2) {
        this(viewGroup, attributeSet, z, zzh.zzdB(), z2);
    }

    public zzae(ViewGroup viewGroup, boolean z) {
        this(viewGroup, null, false, zzh.zzdB(), z);
    }

    private static AdSizeParcel zza(Context context, AdSize adSize, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, adSize);
        adSizeParcel.zzj(z);
        return adSizeParcel;
    }

    private static AdSizeParcel zza(Context context, AdSize[] adSizeArr, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, adSizeArr);
        adSizeParcel.zzj(z);
        return adSizeParcel;
    }

    private void zzef() {
        try {
            zzd zzbh = this.zzwh.zzbh();
            if (zzbh != null) {
                this.zzwn.addView((View) zze.zzx(zzbh));
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to get an ad frame.", e);
        }
    }

    public void destroy() {
        try {
            if (this.zzwh != null) {
                this.zzwh.destroy();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to destroy AdView.", e);
        }
    }

    public AdListener getAdListener() {
        return this.zzuM;
    }

    public AdSize getAdSize() {
        try {
            if (this.zzwh != null) {
                AdSizeParcel zzbi = this.zzwh.zzbi();
                if (zzbi != null) {
                    return zzbi.zzdD();
                }
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to get the current AdSize.", e);
        }
        return this.zzvz != null ? this.zzvz[0] : null;
    }

    public AdSize[] getAdSizes() {
        return this.zzvz;
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

    public VideoController getVideoController() {
        return this.zzwe;
    }

    public VideoOptions getVideoOptions() {
        return this.zzwl;
    }

    public boolean isLoading() {
        try {
            if (this.zzwh != null) {
                return this.zzwh.isLoading();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to check if ad is loading.", e);
        }
        return false;
    }

    public void pause() {
        try {
            if (this.zzwh != null) {
                this.zzwh.pause();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to call pause.", e);
        }
    }

    public void recordManualImpression() {
        if (!this.zzwd.getAndSet(true)) {
            try {
                if (this.zzwh != null) {
                    this.zzwh.zzbk();
                }
            } catch (Throwable e) {
                zzb.zzd("Failed to record impression.", e);
            }
        }
    }

    public void resume() {
        try {
            if (this.zzwh != null) {
                this.zzwh.resume();
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to call resume.", e);
        }
    }

    public void setAdListener(AdListener adListener) {
        this.zzuM = adListener;
        this.zzwf.zza(adListener);
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (this.zzvz != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public void setAdUnitId(String str) {
        if (this.zzqO != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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

    public void setManualImpressionsEnabled(boolean z) {
        this.zzqs = z;
        try {
            if (this.zzwh != null) {
                this.zzwh.setManualImpressionsEnabled(this.zzqs);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set manual impressions.", e);
        }
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzwj = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzwh != null) {
                this.zzwh.zza(onCustomRenderedAdLoadedListener != null ? new zzdh(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        if (this.zzwi != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
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

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zzwl = videoOptions;
        try {
            if (this.zzwh != null) {
                this.zzwh.zza(videoOptions == null ? null : new VideoOptionsParcel(videoOptions));
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set video options.", e);
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
                zzeg();
            }
            if (this.zzwh.zzb(this.zzpd.zza(this.zzwn.getContext(), com_google_android_gms_ads_internal_client_zzad))) {
                this.zzwc.zzh(com_google_android_gms_ads_internal_client_zzad.zzea());
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to load ad.", e);
        }
    }

    public void zza(AdSize... adSizeArr) {
        this.zzvz = adSizeArr;
        try {
            if (this.zzwh != null) {
                this.zzwh.zza(zza(this.zzwn.getContext(), this.zzvz, this.zzwo));
            }
        } catch (Throwable e) {
            zzb.zzd("Failed to set the ad size.", e);
        }
        this.zzwn.requestLayout();
    }

    public boolean zzb(AdSizeParcel adSizeParcel) {
        return "search_v2".equals(adSizeParcel.zzvs);
    }

    public zzab zzee() {
        zzab com_google_android_gms_ads_internal_client_zzab = null;
        if (this.zzwh != null) {
            try {
                com_google_android_gms_ads_internal_client_zzab = this.zzwh.zzbl();
            } catch (Throwable e) {
                zzb.zzd("Failed to retrieve VideoController.", e);
            }
        }
        return com_google_android_gms_ads_internal_client_zzab;
    }

    void zzeg() throws RemoteException {
        if ((this.zzvz == null || this.zzqO == null) && this.zzwh == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        this.zzwh = zzeh();
        this.zzwh.zza(new zzc(this.zzwf));
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
        if (this.zzwl != null) {
            this.zzwh.zza(new VideoOptionsParcel(this.zzwl));
        }
        this.zzwh.setManualImpressionsEnabled(this.zzqs);
        zzef();
    }

    protected zzu zzeh() throws RemoteException {
        Context context = this.zzwn.getContext();
        AdSizeParcel zza = zza(context, this.zzvz, this.zzwo);
        return zzb(zza) ? zzm.zzdR().zza(context, zza, this.zzqO) : zzm.zzdR().zza(context, zza, this.zzqO, this.zzwc);
    }
}
