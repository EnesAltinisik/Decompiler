package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzaf;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public final class InterstitialAd {
    private final zzaf zzpn;

    public InterstitialAd(Context context) {
        this.zzpn = new zzaf(context);
    }

    public AdListener getAdListener() {
        return this.zzpn.getAdListener();
    }

    public String getAdUnitId() {
        return this.zzpn.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.zzpn.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName() {
        return this.zzpn.getMediationAdapterClassName();
    }

    public boolean isLoaded() {
        return this.zzpn.isLoaded();
    }

    public boolean isLoading() {
        return this.zzpn.isLoading();
    }

    public void loadAd(AdRequest adRequest) {
        this.zzpn.zza(adRequest.zzaX());
    }

    public void setAdListener(AdListener adListener) {
        this.zzpn.setAdListener(adListener);
        if (adListener != null && (adListener instanceof zza)) {
            this.zzpn.zza((zza) adListener);
        } else if (adListener == null) {
            this.zzpn.zza(null);
        }
    }

    public void setAdUnitId(String str) {
        this.zzpn.setAdUnitId(str);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.zzpn.setInAppPurchaseListener(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        this.zzpn.setPlayStorePurchaseParams(playStorePurchaseListener, str);
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzpn.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    public void show() {
        this.zzpn.show();
    }

    public void zzc(boolean z) {
        this.zzpn.zzc(z);
    }
}
