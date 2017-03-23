package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;

@vz
public class ud implements e {
    private Activity a;
    private qg b;
    private f c;
    private Uri d;

    public static boolean a(Context context) {
        return qg.a(context);
    }

    public void onDestroy() {
        zy.b("Destroying AdMobCustomTabsAdapter adapter.");
        try {
            this.b.a(this.a);
        } catch (Throwable e) {
            zy.b("Exception while unbinding from CustomTabsService.", e);
        }
    }

    public void onPause() {
        zy.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public void onResume() {
        zy.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public void requestInterstitialAd(Context context, f fVar, Bundle bundle, a aVar, Bundle bundle2) {
        this.c = fVar;
        if (this.c == null) {
            zy.e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zy.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.c.a(this, 0);
        } else if (a(context)) {
            Object string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zy.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.c.a(this, 0);
                return;
            }
            this.a = (Activity) context;
            this.d = Uri.parse(string);
            this.b = new qg();
            this.b.a(new qg.a(this) {
            });
            this.b.b(this.a);
            this.c.a(this);
        } else {
            zy.e("Default browser does not support custom tabs. Bailing out.");
            this.c.a(this, 0);
        }
    }

    public void showInterstitial() {
        CustomTabsIntent build = new Builder(this.b.a()).build();
        build.intent.setData(this.d);
        final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.e(build.intent), null, new j(this) {
            final /* synthetic */ ud a;

            {
                this.a = r1;
            }

            public void a() {
                zy.b("AdMobCustomTabsAdapter overlay is closed.");
                this.a.c.c(this.a);
                this.a.b.a(this.a.a);
            }

            public void b() {
                zy.b("AdMobCustomTabsAdapter overlay is paused.");
            }

            public void c() {
                zy.b("AdMobCustomTabsAdapter overlay is resumed.");
            }

            public void d() {
                zy.b("Opening AdMobCustomTabsAdapter overlay.");
                this.a.c.b(this.a);
            }
        }, null, new aab(0, 0, false));
        zi.a.post(new Runnable(this) {
            final /* synthetic */ ud b;

            public void run() {
                v.c().a(this.b.a, adOverlayInfoParcel);
            }
        });
        v.i().d(false);
    }
}
