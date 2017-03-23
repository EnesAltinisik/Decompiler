package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.zzhl.zza;

@zzig
public final class zzhq extends zza {
    private final PlayStorePurchaseListener zzwk;

    public zzhq(PlayStorePurchaseListener playStorePurchaseListener) {
        this.zzwk = playStorePurchaseListener;
    }

    public boolean isValidPurchase(String str) {
        return this.zzwk.isValidPurchase(str);
    }

    public void zza(zzhk com_google_android_gms_internal_zzhk) {
        this.zzwk.onInAppPurchaseFinished(new zzho(com_google_android_gms_internal_zzhk));
    }
}
