package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.zzig;

@zzig
public class zzo extends AdListener {
    private final Object lock = new Object();
    private AdListener zzvS;

    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzvS != null) {
                this.zzvS.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzvS != null) {
                this.zzvS.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzvS != null) {
                this.zzvS.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzvS != null) {
                this.zzvS.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzvS != null) {
                this.zzvS.onAdOpened();
            }
        }
    }

    public void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzvS = adListener;
        }
    }
}
