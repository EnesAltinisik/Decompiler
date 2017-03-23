package com.google.android.gms.b;

import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;

@vz
public final class tw implements d, f, h {
    private final tp a;
    private i b;

    public tw(tp tpVar) {
        this.a = tpVar;
    }

    public i a() {
        return this.b;
    }

    public void a(c cVar) {
        com.google.android.gms.common.internal.c.b("onAdLoaded must be called on the main UI thread.");
        zy.b("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (Throwable e) {
            zy.c("Could not call onAdLoaded.", e);
        }
    }

    public void a(c cVar, int i) {
        com.google.android.gms.common.internal.c.b("onAdFailedToLoad must be called on the main UI thread.");
        zy.b("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.a.a(i);
        } catch (Throwable e) {
            zy.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(e eVar) {
        com.google.android.gms.common.internal.c.b("onAdLoaded must be called on the main UI thread.");
        zy.b("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (Throwable e) {
            zy.c("Could not call onAdLoaded.", e);
        }
    }

    public void a(e eVar, int i) {
        com.google.android.gms.common.internal.c.b("onAdFailedToLoad must be called on the main UI thread.");
        zy.b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.a(i);
        } catch (Throwable e) {
            zy.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(g gVar) {
        com.google.android.gms.common.internal.c.b("onAdOpened must be called on the main UI thread.");
        zy.b("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (Throwable e) {
            zy.c("Could not call onAdOpened.", e);
        }
    }

    public void a(g gVar, int i) {
        com.google.android.gms.common.internal.c.b("onAdFailedToLoad must be called on the main UI thread.");
        zy.b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.a(i);
        } catch (Throwable e) {
            zy.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(g gVar, i iVar) {
        com.google.android.gms.common.internal.c.b("onAdLoaded must be called on the main UI thread.");
        zy.b("Adapter called onAdLoaded.");
        this.b = iVar;
        try {
            this.a.e();
        } catch (Throwable e) {
            zy.c("Could not call onAdLoaded.", e);
        }
    }

    public void b(c cVar) {
        com.google.android.gms.common.internal.c.b("onAdOpened must be called on the main UI thread.");
        zy.b("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (Throwable e) {
            zy.c("Could not call onAdOpened.", e);
        }
    }

    public void b(e eVar) {
        com.google.android.gms.common.internal.c.b("onAdOpened must be called on the main UI thread.");
        zy.b("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (Throwable e) {
            zy.c("Could not call onAdOpened.", e);
        }
    }

    public void b(g gVar) {
        com.google.android.gms.common.internal.c.b("onAdClosed must be called on the main UI thread.");
        zy.b("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (Throwable e) {
            zy.c("Could not call onAdClosed.", e);
        }
    }

    public void c(c cVar) {
        com.google.android.gms.common.internal.c.b("onAdClosed must be called on the main UI thread.");
        zy.b("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (Throwable e) {
            zy.c("Could not call onAdClosed.", e);
        }
    }

    public void c(e eVar) {
        com.google.android.gms.common.internal.c.b("onAdClosed must be called on the main UI thread.");
        zy.b("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (Throwable e) {
            zy.c("Could not call onAdClosed.", e);
        }
    }

    public void c(g gVar) {
        com.google.android.gms.common.internal.c.b("onAdLeftApplication must be called on the main UI thread.");
        zy.b("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (Throwable e) {
            zy.c("Could not call onAdLeftApplication.", e);
        }
    }

    public void d(c cVar) {
        com.google.android.gms.common.internal.c.b("onAdLeftApplication must be called on the main UI thread.");
        zy.b("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (Throwable e) {
            zy.c("Could not call onAdLeftApplication.", e);
        }
    }

    public void d(e eVar) {
        com.google.android.gms.common.internal.c.b("onAdLeftApplication must be called on the main UI thread.");
        zy.b("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (Throwable e) {
            zy.c("Could not call onAdLeftApplication.", e);
        }
    }

    public void d(g gVar) {
        com.google.android.gms.common.internal.c.b("onAdClicked must be called on the main UI thread.");
        i a = a();
        if (a == null) {
            zy.e("Could not call onAdClicked since NativeAdMapper is null.");
        } else if (a.b()) {
            zy.b("Adapter called onAdClicked.");
            try {
                this.a.a();
            } catch (Throwable e) {
                zy.c("Could not call onAdClicked.", e);
            }
        } else {
            zy.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        }
    }

    public void e(c cVar) {
        com.google.android.gms.common.internal.c.b("onAdClicked must be called on the main UI thread.");
        zy.b("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (Throwable e) {
            zy.c("Could not call onAdClicked.", e);
        }
    }

    public void e(e eVar) {
        com.google.android.gms.common.internal.c.b("onAdClicked must be called on the main UI thread.");
        zy.b("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (Throwable e) {
            zy.c("Could not call onAdClicked.", e);
        }
    }
}
