package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzlm;
import java.util.Date;
import java.util.Set;

@zzig
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzlm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    protected AdView zzaS;
    protected InterstitialAd zzaT;
    private AdLoader zzaU;
    private Context zzaV;
    private InterstitialAd zzaW;
    private MediationRewardedVideoAdListener zzaX;
    final RewardedVideoAdListener zzaY = new RewardedVideoAdListener(this) {
        final /* synthetic */ AbstractAdViewAdapter a;

        {
            this.a = r1;
        }

        public void onRewarded(RewardItem rewardItem) {
            this.a.zzaX.onRewarded(this.a, rewardItem);
        }

        public void onRewardedVideoAdClosed() {
            this.a.zzaX.onAdClosed(this.a);
            this.a.zzaW = null;
        }

        public void onRewardedVideoAdFailedToLoad(int i) {
            this.a.zzaX.onAdFailedToLoad(this.a, i);
        }

        public void onRewardedVideoAdLeftApplication() {
            this.a.zzaX.onAdLeftApplication(this.a);
        }

        public void onRewardedVideoAdLoaded() {
            this.a.zzaX.onAdLoaded(this.a);
        }

        public void onRewardedVideoAdOpened() {
            this.a.zzaX.onAdOpened(this.a);
        }

        public void onRewardedVideoStarted() {
            this.a.zzaX.onVideoStarted(this.a);
        }
    };

    static class a extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd a;

        public a(NativeAppInstallAd nativeAppInstallAd) {
            this.a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            setStore(nativeAppInstallAd.getStore().toString());
            setPrice(nativeAppInstallAd.getPrice().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
        }

        public void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.a);
            }
        }
    }

    static class b extends NativeContentAdMapper {
        private final NativeContentAd a;

        public b(NativeContentAd nativeContentAd) {
            this.a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            setLogo(nativeContentAd.getLogo());
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
        }

        public void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.a);
            }
        }
    }

    static final class c extends AdListener implements zza {
        final AbstractAdViewAdapter a;
        final MediationBannerListener b;

        public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.a = abstractAdViewAdapter;
            this.b = mediationBannerListener;
        }

        public void onAdClicked() {
            this.b.onAdClicked(this.a);
        }

        public void onAdClosed() {
            this.b.onAdClosed(this.a);
        }

        public void onAdFailedToLoad(int i) {
            this.b.onAdFailedToLoad(this.a, i);
        }

        public void onAdLeftApplication() {
            this.b.onAdLeftApplication(this.a);
        }

        public void onAdLoaded() {
            this.b.onAdLoaded(this.a);
        }

        public void onAdOpened() {
            this.b.onAdOpened(this.a);
        }
    }

    static final class d extends AdListener implements zza {
        final AbstractAdViewAdapter a;
        final MediationInterstitialListener b;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.a = abstractAdViewAdapter;
            this.b = mediationInterstitialListener;
        }

        public void onAdClicked() {
            this.b.onAdClicked(this.a);
        }

        public void onAdClosed() {
            this.b.onAdClosed(this.a);
        }

        public void onAdFailedToLoad(int i) {
            this.b.onAdFailedToLoad(this.a, i);
        }

        public void onAdLeftApplication() {
            this.b.onAdLeftApplication(this.a);
        }

        public void onAdLoaded() {
            this.b.onAdLoaded(this.a);
        }

        public void onAdOpened() {
            this.b.onAdOpened(this.a);
        }
    }

    static final class e extends AdListener implements OnAppInstallAdLoadedListener, OnContentAdLoadedListener, zza {
        final AbstractAdViewAdapter a;
        final MediationNativeListener b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.a = abstractAdViewAdapter;
            this.b = mediationNativeListener;
        }

        public void onAdClicked() {
            this.b.onAdClicked(this.a);
        }

        public void onAdClosed() {
            this.b.onAdClosed(this.a);
        }

        public void onAdFailedToLoad(int i) {
            this.b.onAdFailedToLoad(this.a, i);
        }

        public void onAdLeftApplication() {
            this.b.onAdLeftApplication(this.a);
        }

        public void onAdLoaded() {
        }

        public void onAdOpened() {
            this.b.onAdOpened(this.a);
        }

        public void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.b.onAdLoaded(this.a, new a(nativeAppInstallAd));
        }

        public void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.b.onAdLoaded(this.a, new b(nativeContentAd));
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzaS;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzZ(1).zzki();
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzaV = context.getApplicationContext();
        this.zzaX = mediationRewardedVideoAdListener;
        this.zzaX.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzaX != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzaV == null || this.zzaX == null) {
            zzb.e("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzaW = new InterstitialAd(this.zzaV);
        this.zzaW.zzc(true);
        this.zzaW.setAdUnitId(getAdUnitId(bundle));
        this.zzaW.setRewardedVideoAdListener(this.zzaY);
        this.zzaW.loadAd(zza(this.zzaV, mediationAdRequest, bundle2, bundle));
    }

    public void onDestroy() {
        if (this.zzaS != null) {
            this.zzaS.destroy();
            this.zzaS = null;
        }
        if (this.zzaT != null) {
            this.zzaT = null;
        }
        if (this.zzaU != null) {
            this.zzaU = null;
        }
        if (this.zzaW != null) {
            this.zzaW = null;
        }
    }

    public void onPause() {
        if (this.zzaS != null) {
            this.zzaS.pause();
        }
    }

    public void onResume() {
        if (this.zzaS != null) {
            this.zzaS.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzaS = new AdView(context);
        this.zzaS.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzaS.setAdUnitId(getAdUnitId(bundle));
        this.zzaS.setAdListener(new c(this, mediationBannerListener));
        this.zzaS.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzaT = new InterstitialAd(context);
        this.zzaT.setAdUnitId(getAdUnitId(bundle));
        this.zzaT.setAdListener(new d(this, mediationInterstitialListener));
        this.zzaT.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        OnContentAdLoadedListener eVar = new e(this, mediationNativeListener);
        Builder withAdListener = zza(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(eVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(eVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(eVar);
        }
        this.zzaU = withAdListener.build();
        this.zzaU.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzaT.show();
    }

    public void showVideo() {
        this.zzaW.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    Builder zza(Context context, String str) {
        return new Builder(context, str);
    }

    AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            builder.addTestDevice(zzm.zzdQ().zzP(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }
}
