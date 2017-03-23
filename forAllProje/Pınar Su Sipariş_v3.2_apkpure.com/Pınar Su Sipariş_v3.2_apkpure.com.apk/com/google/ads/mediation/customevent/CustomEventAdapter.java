package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    private View zzbl;
    CustomEventBanner zzbm;
    CustomEventInterstitial zzbn;

    static final class a implements CustomEventBannerListener {
        private final CustomEventAdapter a;
        private final MediationBannerListener b;

        public a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.a = customEventAdapter;
            this.b = mediationBannerListener;
        }

        public void onClick() {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.b.onClick(this.a);
        }

        public void onDismissScreen() {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.b.onDismissScreen(this.a);
        }

        public void onFailedToReceiveAd() {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.b.onFailedToReceiveAd(this.a, ErrorCode.NO_FILL);
        }

        public void onLeaveApplication() {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.b.onLeaveApplication(this.a);
        }

        public void onPresentScreen() {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.b.onPresentScreen(this.a);
        }

        public void onReceivedAd(View view) {
            zzb.zzaU("Custom event adapter called onReceivedAd.");
            this.a.zza(view);
            this.b.onReceivedAd(this.a);
        }
    }

    class b implements CustomEventInterstitialListener {
        final /* synthetic */ CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final MediationInterstitialListener c;

        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.a = customEventAdapter;
            this.b = customEventAdapter2;
            this.c = mediationInterstitialListener;
        }

        public void onDismissScreen() {
            zzb.zzaU("Custom event adapter called onDismissScreen.");
            this.c.onDismissScreen(this.b);
        }

        public void onFailedToReceiveAd() {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.c.onFailedToReceiveAd(this.b, ErrorCode.NO_FILL);
        }

        public void onLeaveApplication() {
            zzb.zzaU("Custom event adapter called onLeaveApplication.");
            this.c.onLeaveApplication(this.b);
        }

        public void onPresentScreen() {
            zzb.zzaU("Custom event adapter called onPresentScreen.");
            this.c.onPresentScreen(this.b);
        }

        public void onReceivedAd() {
            zzb.zzaU("Custom event adapter called onReceivedAd.");
            this.c.onReceivedAd(this.a);
        }
    }

    private void zza(View view) {
        this.zzbl = view;
    }

    private static <T> T zzj(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    public void destroy() {
        if (this.zzbm != null) {
            this.zzbm.destroy();
        }
        if (this.zzbn != null) {
            this.zzbn.destroy();
        }
    }

    public Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public View getBannerView() {
        return this.zzbl;
    }

    public Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.zzbm = (CustomEventBanner) zzj(customEventServerParameters.className);
        if (this.zzbm == null) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.zzbm.requestBannerAd(new a(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.zzbn = (CustomEventInterstitial) zzj(customEventServerParameters.className);
        if (this.zzbn == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.zzbn.requestInterstitialAd(zza(mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public void showInterstitial() {
        this.zzbn.showInterstitial();
    }

    b zza(MediationInterstitialListener mediationInterstitialListener) {
        return new b(this, this, mediationInterstitialListener);
    }
}
