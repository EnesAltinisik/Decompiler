package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.widget.FrameLayout;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.purchase.e;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oi;
import com.google.android.gms.b.ok;
import com.google.android.gms.b.on.a;
import com.google.android.gms.b.op;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qt;
import com.google.android.gms.b.qx;
import com.google.android.gms.b.sp;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.un;
import com.google.android.gms.b.ux;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.xn;
import com.google.android.gms.b.xq;
import com.google.android.gms.common.util.DynamiteApi;

@Keep
@vz
@DynamiteApi
public class ClientApi extends a {
    public oi createAdLoaderBuilder(com.google.android.gms.a.a aVar, String str, tn tnVar, int i) {
        return new k((Context) b.a(aVar), str, tnVar, new aab(10084000, i, true), d.a());
    }

    public un createAdOverlay(com.google.android.gms.a.a aVar) {
        return new g((Activity) b.a(aVar));
    }

    public ok createBannerAdManager(com.google.android.gms.a.a aVar, nx nxVar, String str, tn tnVar, int i) {
        return new f((Context) b.a(aVar), nxVar, str, tnVar, new aab(10084000, i, true), d.a());
    }

    public ux createInAppPurchaseManager(com.google.android.gms.a.a aVar) {
        return new e((Activity) b.a(aVar));
    }

    public ok createInterstitialAdManager(com.google.android.gms.a.a aVar, nx nxVar, String str, tn tnVar, int i) {
        Context context = (Context) b.a(aVar);
        pr.a(context);
        aab com_google_android_gms_b_aab = new aab(10084000, i, true);
        boolean equals = "reward_mb".equals(nxVar.b);
        Object obj = ((equals || !((Boolean) pr.aK.c()).booleanValue()) && !(equals && ((Boolean) pr.aL.c()).booleanValue())) ? null : 1;
        if (obj != null) {
            return new sp(context, str, tnVar, com_google_android_gms_b_aab, d.a());
        }
        return new l(context, nxVar, str, tnVar, com_google_android_gms_b_aab, d.a());
    }

    public qx createNativeAdViewDelegate(com.google.android.gms.a.a aVar, com.google.android.gms.a.a aVar2) {
        return new qt((FrameLayout) b.a(aVar), (FrameLayout) b.a(aVar2));
    }

    public xq createRewardedVideoAd(com.google.android.gms.a.a aVar, tn tnVar, int i) {
        return new xn((Context) b.a(aVar), d.a(), tnVar, new aab(10084000, i, true));
    }

    public ok createSearchAdManager(com.google.android.gms.a.a aVar, nx nxVar, String str, int i) {
        return new u((Context) b.a(aVar), nxVar, str, new aab(10084000, i, true));
    }

    public op getMobileAdsSettingsManager(com.google.android.gms.a.a aVar) {
        return null;
    }

    public op getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.a.a aVar, int i) {
        return p.a((Context) b.a(aVar), new aab(10084000, i, true));
    }
}
