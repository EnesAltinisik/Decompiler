package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.internal.client.zzaf;

public final class PublisherInterstitialAd {
    private final zzaf zzpn;

    public PublisherInterstitialAd(Context context) {
        this.zzpn = new zzaf(context, this);
    }

    public AdListener getAdListener() {
        return this.zzpn.getAdListener();
    }

    public String getAdUnitId() {
        return this.zzpn.getAdUnitId();
    }

    public AppEventListener getAppEventListener() {
        return this.zzpn.getAppEventListener();
    }

    public String getMediationAdapterClassName() {
        return this.zzpn.getMediationAdapterClassName();
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzpn.getOnCustomRenderedAdLoadedListener();
    }

    public boolean isLoaded() {
        return this.zzpn.isLoaded();
    }

    public boolean isLoading() {
        return this.zzpn.isLoading();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzpn.zza(publisherAdRequest.zzaX());
    }

    public void setAdListener(AdListener adListener) {
        this.zzpn.setAdListener(adListener);
    }

    public void setAdUnitId(String str) {
        this.zzpn.setAdUnitId(str);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zzpn.setAppEventListener(appEventListener);
    }

    public void setCorrelator(Correlator correlator) {
        this.zzpn.setCorrelator(correlator);
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzpn.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    public void show() {
        this.zzpn.show();
    }
}
