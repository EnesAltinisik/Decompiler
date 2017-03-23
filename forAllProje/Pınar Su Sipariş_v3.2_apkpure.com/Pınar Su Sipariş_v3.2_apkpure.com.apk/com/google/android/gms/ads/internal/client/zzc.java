package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.internal.zzig;

@zzig
public final class zzc extends zza {
    private final AdListener zzuM;

    public zzc(AdListener adListener) {
        this.zzuM = adListener;
    }

    public void onAdClosed() {
        this.zzuM.onAdClosed();
    }

    public void onAdFailedToLoad(int i) {
        this.zzuM.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication() {
        this.zzuM.onAdLeftApplication();
    }

    public void onAdLoaded() {
        this.zzuM.onAdLoaded();
    }

    public void onAdOpened() {
        this.zzuM.onAdOpened();
    }
}
