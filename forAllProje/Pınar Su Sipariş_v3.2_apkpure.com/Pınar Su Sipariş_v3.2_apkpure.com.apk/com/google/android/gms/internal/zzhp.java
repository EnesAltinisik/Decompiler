package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchase;

@zzig
public class zzhp implements InAppPurchase {
    private final zzhg zzJt;

    public zzhp(zzhg com_google_android_gms_internal_zzhg) {
        this.zzJt = com_google_android_gms_internal_zzhg;
    }

    public String getProductId() {
        try {
            return this.zzJt.getProductId();
        } catch (Throwable e) {
            zzb.zzd("Could not forward getProductId to InAppPurchase", e);
            return null;
        }
    }

    public void recordPlayBillingResolution(int i) {
        try {
            this.zzJt.recordPlayBillingResolution(i);
        } catch (Throwable e) {
            zzb.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", e);
        }
    }

    public void recordResolution(int i) {
        try {
            this.zzJt.recordResolution(i);
        } catch (Throwable e) {
            zzb.zzd("Could not forward recordResolution to InAppPurchase", e);
        }
    }
}
