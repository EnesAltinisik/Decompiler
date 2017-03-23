package com.google.android.gms.b;

import com.google.android.gms.ads.d.a.a;
import com.google.android.gms.ads.d.a.b;
import com.google.android.gms.common.internal.c;

@vz
public class yi implements b {
    private final yh a;

    public yi(yh yhVar) {
        this.a = yhVar;
    }

    public void a(a aVar) {
        c.b("onInitializationSucceeded must be called on the main UI thread.");
        zy.b("Adapter called onInitializationSucceeded.");
        try {
            this.a.a(com.google.android.gms.a.b.a((Object) aVar));
        } catch (Throwable e) {
            zy.c("Could not call onInitializationSucceeded.", e);
        }
    }

    public void a(a aVar, int i) {
        c.b("onAdFailedToLoad must be called on the main UI thread.");
        zy.b("Adapter called onAdFailedToLoad.");
        try {
            this.a.b(com.google.android.gms.a.b.a((Object) aVar), i);
        } catch (Throwable e) {
            zy.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public void a(a aVar, com.google.android.gms.ads.d.a aVar2) {
        c.b("onRewarded must be called on the main UI thread.");
        zy.b("Adapter called onRewarded.");
        if (aVar2 != null) {
            try {
                this.a.a(com.google.android.gms.a.b.a((Object) aVar), new yj(aVar2));
                return;
            } catch (Throwable e) {
                zy.c("Could not call onRewarded.", e);
                return;
            }
        }
        this.a.a(com.google.android.gms.a.b.a((Object) aVar), new yj(aVar.getClass().getName(), 1));
    }

    public void b(a aVar) {
        c.b("onAdLoaded must be called on the main UI thread.");
        zy.b("Adapter called onAdLoaded.");
        try {
            this.a.b(com.google.android.gms.a.b.a((Object) aVar));
        } catch (Throwable e) {
            zy.c("Could not call onAdLoaded.", e);
        }
    }

    public void c(a aVar) {
        c.b("onAdOpened must be called on the main UI thread.");
        zy.b("Adapter called onAdOpened.");
        try {
            this.a.c(com.google.android.gms.a.b.a((Object) aVar));
        } catch (Throwable e) {
            zy.c("Could not call onAdOpened.", e);
        }
    }

    public void d(a aVar) {
        c.b("onVideoStarted must be called on the main UI thread.");
        zy.b("Adapter called onVideoStarted.");
        try {
            this.a.d(com.google.android.gms.a.b.a((Object) aVar));
        } catch (Throwable e) {
            zy.c("Could not call onVideoStarted.", e);
        }
    }

    public void e(a aVar) {
        c.b("onAdClosed must be called on the main UI thread.");
        zy.b("Adapter called onAdClosed.");
        try {
            this.a.e(com.google.android.gms.a.b.a((Object) aVar));
        } catch (Throwable e) {
            zy.c("Could not call onAdClosed.", e);
        }
    }

    public void f(a aVar) {
        c.b("onAdLeftApplication must be called on the main UI thread.");
        zy.b("Adapter called onAdLeftApplication.");
        try {
            this.a.g(com.google.android.gms.a.b.a((Object) aVar));
        } catch (Throwable e) {
            zy.c("Could not call onAdLeftApplication.", e);
        }
    }
}
