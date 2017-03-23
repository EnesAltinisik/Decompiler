package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    CustomEventBanner zzTi;
    CustomEventInterstitial zzTj;
    CustomEventNative zzTk;
    private View zzbl;

    static final class a implements CustomEventBannerListener {
        private final CustomEventAdapter a;
        private final MediationBannerListener b;

        public a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.a = customEventAdapter;
            this.b = mediationBannerListener;
        }

        public void onAdClicked() {
            zzb.zzaU("Custom event adapter called onAdClicked.");
            this.b.onAdClicked(this.a);
        }

        public void onAdClosed() {
            zzb.zzaU("Custom event adapter called onAdClosed.");
            this.b.onAdClosed(this.a);
        }

        public void onAdFailedToLoad(int i) {
            zzb.zzaU("Custom event adapter called onAdFailedToLoad.");
            this.b.onAdFailedToLoad(this.a, i);
        }

        public void onAdLeftApplication() {
            zzb.zzaU("Custom event adapter called onAdLeftApplication.");
            this.b.onAdLeftApplication(this.a);
        }

        public void onAdLoaded(View view) {
            zzb.zzaU("Custom event adapter called onAdLoaded.");
            this.a.zza(view);
            this.b.onAdLoaded(this.a);
        }

        public void onAdOpened() {
            zzb.zzaU("Custom event adapter called onAdOpened.");
            this.b.onAdOpened(this.a);
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

        public void onAdClicked() {
            zzb.zzaU("Custom event adapter called onAdClicked.");
            this.c.onAdClicked(this.b);
        }

        public void onAdClosed() {
            zzb.zzaU("Custom event adapter called onAdClosed.");
            this.c.onAdClosed(this.b);
        }

        public void onAdFailedToLoad(int i) {
            zzb.zzaU("Custom event adapter called onFailedToReceiveAd.");
            this.c.onAdFailedToLoad(this.b, i);
        }

        public void onAdLeftApplication() {
            zzb.zzaU("Custom event adapter called onAdLeftApplication.");
            this.c.onAdLeftApplication(this.b);
        }

        public void onAdLoaded() {
            zzb.zzaU("Custom event adapter called onReceivedAd.");
            this.c.onAdLoaded(this.a);
        }

        public void onAdOpened() {
            zzb.zzaU("Custom event adapter called onAdOpened.");
            this.c.onAdOpened(this.b);
        }
    }

    static class c implements CustomEventNativeListener {
        private final CustomEventAdapter a;
        private final MediationNativeListener b;

        public c(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.a = customEventAdapter;
            this.b = mediationNativeListener;
        }

        public void onAdClicked() {
            zzb.zzaU("Custom event adapter called onAdClicked.");
            this.b.onAdClicked(this.a);
        }

        public void onAdClosed() {
            zzb.zzaU("Custom event adapter called onAdClosed.");
            this.b.onAdClosed(this.a);
        }

        public void onAdFailedToLoad(int i) {
            zzb.zzaU("Custom event adapter called onAdFailedToLoad.");
            this.b.onAdFailedToLoad(this.a, i);
        }

        public void onAdImpression() {
            zzb.zzaU("Custom event adapter called onAdImpression.");
            this.b.onAdImpression(this.a);
        }

        public void onAdLeftApplication() {
            zzb.zzaU("Custom event adapter called onAdLeftApplication.");
            this.b.onAdLeftApplication(this.a);
        }

        public void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzb.zzaU("Custom event adapter called onAdLoaded.");
            this.b.onAdLoaded(this.a, nativeAdMapper);
        }

        public void onAdOpened() {
            zzb.zzaU("Custom event adapter called onAdOpened.");
            this.b.onAdOpened(this.a);
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

    public View getBannerView() {
        return this.zzbl;
    }

    public void onDestroy() {
        if (this.zzTi != null) {
            this.zzTi.onDestroy();
        }
        if (this.zzTj != null) {
            this.zzTj.onDestroy();
        }
        if (this.zzTk != null) {
            this.zzTk.onDestroy();
        }
    }

    public void onPause() {
        if (this.zzTi != null) {
            this.zzTi.onPause();
        }
        if (this.zzTj != null) {
            this.zzTj.onPause();
        }
        if (this.zzTk != null) {
            this.zzTk.onPause();
        }
    }

    public void onResume() {
        if (this.zzTi != null) {
            this.zzTi.onResume();
        }
        if (this.zzTj != null) {
            this.zzTj.onResume();
        }
        if (this.zzTk != null) {
            this.zzTk.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzTi = (CustomEventBanner) zzj(bundle.getString("class_name"));
        if (this.zzTi == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzTi.requestBannerAd(context, new a(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzTj = (CustomEventInterstitial) zzj(bundle.getString("class_name"));
        if (this.zzTj == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzTj.requestInterstitialAd(context, zza(mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.zzTk = (CustomEventNative) zzj(bundle.getString("class_name"));
        if (this.zzTk == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzTk.requestNativeAd(context, new c(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void showInterstitial() {
        this.zzTj.showInterstitial();
    }

    b zza(MediationInterstitialListener mediationInterstitialListener) {
        return new b(this, this, mediationInterstitialListener);
    }
}
