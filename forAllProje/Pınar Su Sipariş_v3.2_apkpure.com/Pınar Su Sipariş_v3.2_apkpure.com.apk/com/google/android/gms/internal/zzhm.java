package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.internal.zzhh.zza;

@zzig
public final class zzhm extends zza {
    private final InAppPurchaseListener zzwi;

    public zzhm(InAppPurchaseListener inAppPurchaseListener) {
        this.zzwi = inAppPurchaseListener;
    }

    public void zza(zzhg com_google_android_gms_internal_zzhg) {
        this.zzwi.onInAppPurchaseRequested(new zzhp(com_google_android_gms_internal_zzhg));
    }
}
