package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements com.google.android.gms.ads.mediation.c, e, g {
    b a;
    e b;
    g c;
    private View d;

    static final class a implements c {
        private final CustomEventAdapter a;
        private final d b;

        public a(CustomEventAdapter customEventAdapter, d dVar) {
            this.a = customEventAdapter;
            this.b = dVar;
        }
    }

    class b implements f {
        final /* synthetic */ CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final f c;

        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, f fVar) {
            this.a = customEventAdapter;
            this.b = customEventAdapter2;
            this.c = fVar;
        }
    }

    static class c implements h {
        private final CustomEventAdapter a;
        private final h b;

        public c(CustomEventAdapter customEventAdapter, h hVar) {
            this.a = customEventAdapter;
            this.b = hVar;
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            zy.e(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    b a(f fVar) {
        return new b(this, this, fVar);
    }

    public View getBannerView() {
        return this.d;
    }

    public void onDestroy() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public void onPause() {
        if (this.a != null) {
            this.a.b();
        }
        if (this.b != null) {
            this.b.b();
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    public void onResume() {
        if (this.a != null) {
            this.a.c();
        }
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.c();
        }
    }

    public void requestBannerAd(Context context, d dVar, Bundle bundle, com.google.android.gms.ads.d dVar2, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.a = (b) a(bundle.getString("class_name"));
        if (this.a == null) {
            dVar.a(this, 0);
            return;
        }
        this.a.a(context, new a(this, dVar), bundle.getString("parameter"), dVar2, aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestInterstitialAd(Context context, f fVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.b = (e) a(bundle.getString("class_name"));
        if (this.b == null) {
            fVar.a(this, 0);
            return;
        }
        this.b.a(context, a(fVar), bundle.getString("parameter"), aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestNativeAd(Context context, h hVar, Bundle bundle, l lVar, Bundle bundle2) {
        this.c = (g) a(bundle.getString("class_name"));
        if (this.c == null) {
            hVar.a((g) this, 0);
            return;
        }
        this.c.a(context, new c(this, hVar), bundle.getString("parameter"), lVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void showInterstitial() {
        this.b.d();
    }
}
