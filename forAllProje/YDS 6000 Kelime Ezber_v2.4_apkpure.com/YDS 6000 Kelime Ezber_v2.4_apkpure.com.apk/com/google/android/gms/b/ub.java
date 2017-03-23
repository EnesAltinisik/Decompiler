package com.google.android.gms.b;

import com.google.ads.a.a;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;

@vz
public final class ub<NETWORK_EXTRAS extends i, SERVER_PARAMETERS extends h> implements e, g {
    private final tp a;

    public ub(tp tpVar) {
        this.a = tpVar;
    }

    public void a(d<?, ?> dVar, final a aVar) {
        String valueOf = String.valueOf(aVar);
        zy.b(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (oc.a().b()) {
            try {
                this.a.a(uc.a(aVar));
                return;
            } catch (Throwable e) {
                zy.c("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zy.e("onFailedToReceiveAd must be called on the main UI thread.");
        zx.a.post(new Runnable(this) {
            final /* synthetic */ ub b;

            public void run() {
                try {
                    this.b.a.a(uc.a(aVar));
                } catch (Throwable e) {
                    zy.c("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void a(f<?, ?> fVar, final a aVar) {
        String valueOf = String.valueOf(aVar);
        zy.b(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (oc.a().b()) {
            try {
                this.a.a(uc.a(aVar));
                return;
            } catch (Throwable e) {
                zy.c("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zy.e("onFailedToReceiveAd must be called on the main UI thread.");
        zx.a.post(new Runnable(this) {
            final /* synthetic */ ub b;

            public void run() {
                try {
                    this.b.a.a(uc.a(aVar));
                } catch (Throwable e) {
                    zy.c("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }
}
