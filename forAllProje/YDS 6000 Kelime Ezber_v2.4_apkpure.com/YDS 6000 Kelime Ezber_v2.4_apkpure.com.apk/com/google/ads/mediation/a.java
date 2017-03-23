package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.b.abf;
import com.google.android.gms.b.nn;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zy;
import java.util.Date;
import java.util.Set;

@vz
public abstract class a implements com.google.android.gms.ads.d.a.a, com.google.android.gms.ads.mediation.c, g, abf {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    protected AdView zzcC;
    protected com.google.android.gms.ads.g zzcD;
    private com.google.android.gms.ads.b zzcE;
    private Context zzcF;
    private com.google.android.gms.ads.g zzcG;
    private com.google.android.gms.ads.d.a.b zzcH;
    final com.google.android.gms.ads.d.b zzcI = new com.google.android.gms.ads.d.b(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void a() {
            this.a.zzcH.b(this.a);
        }

        public void a(int i) {
            this.a.zzcH.a(this.a, i);
        }

        public void a(com.google.android.gms.ads.d.a aVar) {
            this.a.zzcH.a(this.a, aVar);
        }

        public void b() {
            this.a.zzcH.c(this.a);
        }

        public void c() {
            this.a.zzcH.d(this.a);
        }

        public void d() {
            this.a.zzcH.e(this.a);
            this.a.zzcG = null;
        }

        public void e() {
            this.a.zzcH.f(this.a);
        }
    };

    static class a extends j {
        private final com.google.android.gms.ads.b.d d;

        public a(com.google.android.gms.ads.b.d dVar) {
            this.d = dVar;
            a(dVar.b().toString());
            a(dVar.c());
            b(dVar.d().toString());
            a(dVar.e());
            c(dVar.f().toString());
            if (dVar.g() != null) {
                a(dVar.g().doubleValue());
            }
            if (dVar.h() != null) {
                d(dVar.h().toString());
            }
            if (dVar.i() != null) {
                e(dVar.i().toString());
            }
            a(true);
            b(true);
            a(dVar.j());
        }

        public void a(View view) {
            if (view instanceof com.google.android.gms.ads.b.c) {
                ((com.google.android.gms.ads.b.c) view).setNativeAd(this.d);
            }
        }
    }

    static class b extends k {
        private final com.google.android.gms.ads.b.e d;

        public b(com.google.android.gms.ads.b.e eVar) {
            this.d = eVar;
            a(eVar.b().toString());
            a(eVar.c());
            b(eVar.d().toString());
            if (eVar.e() != null) {
                a(eVar.e());
            }
            c(eVar.f().toString());
            d(eVar.g().toString());
            a(true);
            b(true);
        }

        public void a(View view) {
            if (view instanceof com.google.android.gms.ads.b.c) {
                ((com.google.android.gms.ads.b.c) view).setNativeAd(this.d);
            }
        }
    }

    static final class c extends com.google.android.gms.ads.a implements nn {
        final a a;
        final com.google.android.gms.ads.mediation.d b;

        public c(a aVar, com.google.android.gms.ads.mediation.d dVar) {
            this.a = aVar;
            this.b = dVar;
        }

        public void a() {
            this.b.a(this.a);
        }

        public void a(int i) {
            this.b.a(this.a, i);
        }

        public void b() {
            this.b.c(this.a);
        }

        public void c() {
            this.b.b(this.a);
        }

        public void d() {
            this.b.d(this.a);
        }

        public void e() {
            this.b.e(this.a);
        }
    }

    static final class d extends com.google.android.gms.ads.a implements nn {
        final a a;
        final f b;

        public d(a aVar, f fVar) {
            this.a = aVar;
            this.b = fVar;
        }

        public void a() {
            this.b.a(this.a);
        }

        public void a(int i) {
            this.b.a(this.a, i);
        }

        public void b() {
            this.b.c(this.a);
        }

        public void c() {
            this.b.b(this.a);
        }

        public void d() {
            this.b.d(this.a);
        }

        public void e() {
            this.b.e(this.a);
        }
    }

    static final class e extends com.google.android.gms.ads.a implements com.google.android.gms.ads.b.d.a, com.google.android.gms.ads.b.e.a, nn {
        final a a;
        final h b;

        public e(a aVar, h hVar) {
            this.a = aVar;
            this.b = hVar;
        }

        public void a() {
        }

        public void a(int i) {
            this.b.a(this.a, i);
        }

        public void a(com.google.android.gms.ads.b.d dVar) {
            this.b.a(this.a, new a(dVar));
        }

        public void a(com.google.android.gms.ads.b.e eVar) {
            this.b.a(this.a, new b(eVar));
        }

        public void b() {
            this.b.b(this.a);
        }

        public void c() {
            this.b.a(this.a);
        }

        public void d() {
            this.b.c(this.a);
        }

        public void e() {
            this.b.d(this.a);
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzcC;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new com.google.android.gms.ads.mediation.b.a().a(1).a();
    }

    public void initialize(Context context, com.google.android.gms.ads.mediation.a aVar, String str, com.google.android.gms.ads.d.a.b bVar, Bundle bundle, Bundle bundle2) {
        this.zzcF = context.getApplicationContext();
        this.zzcH = bVar;
        this.zzcH.a(this);
    }

    public boolean isInitialized() {
        return this.zzcH != null;
    }

    public void loadAd(com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        if (this.zzcF == null || this.zzcH == null) {
            zy.c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzcG = new com.google.android.gms.ads.g(this.zzcF);
        this.zzcG.a(true);
        this.zzcG.a(getAdUnitId(bundle));
        this.zzcG.a(this.zzcI);
        this.zzcG.a(zza(this.zzcF, aVar, bundle2, bundle));
    }

    public void onDestroy() {
        if (this.zzcC != null) {
            this.zzcC.c();
            this.zzcC = null;
        }
        if (this.zzcD != null) {
            this.zzcD = null;
        }
        if (this.zzcE != null) {
            this.zzcE = null;
        }
        if (this.zzcG != null) {
            this.zzcG = null;
        }
    }

    public void onPause() {
        if (this.zzcC != null) {
            this.zzcC.b();
        }
    }

    public void onResume() {
        if (this.zzcC != null) {
            this.zzcC.a();
        }
    }

    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.d dVar, Bundle bundle, com.google.android.gms.ads.d dVar2, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.zzcC = new AdView(context);
        this.zzcC.setAdSize(new com.google.android.gms.ads.d(dVar2.b(), dVar2.a()));
        this.zzcC.setAdUnitId(getAdUnitId(bundle));
        this.zzcC.setAdListener(new c(this, dVar));
        this.zzcC.a(zza(context, aVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, f fVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.zzcD = new com.google.android.gms.ads.g(context);
        this.zzcD.a(getAdUnitId(bundle));
        this.zzcD.a(new d(this, fVar));
        this.zzcD.a(zza(context, aVar, bundle2, bundle));
    }

    public void requestNativeAd(Context context, h hVar, Bundle bundle, l lVar, Bundle bundle2) {
        com.google.android.gms.ads.b.e.a eVar = new e(this, hVar);
        com.google.android.gms.ads.b.a a = zza(context, bundle.getString(AD_UNIT_ID_PARAMETER)).a((com.google.android.gms.ads.a) eVar);
        com.google.android.gms.ads.b.b h = lVar.h();
        if (h != null) {
            a.a(h);
        }
        if (lVar.i()) {
            a.a((com.google.android.gms.ads.b.d.a) eVar);
        }
        if (lVar.j()) {
            a.a(eVar);
        }
        this.zzcE = a.a();
        this.zzcE.a(zza(context, lVar, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzcD.b();
    }

    public void showVideo() {
        this.zzcG.b();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    com.google.android.gms.ads.b.a zza(Context context, String str) {
        return new com.google.android.gms.ads.b.a(context, str);
    }

    com.google.android.gms.ads.c zza(Context context, com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        com.google.android.gms.ads.c.a aVar2 = new com.google.android.gms.ads.c.a();
        Date a = aVar.a();
        if (a != null) {
            aVar2.a(a);
        }
        int b = aVar.b();
        if (b != 0) {
            aVar2.a(b);
        }
        Set<String> c = aVar.c();
        if (c != null) {
            for (String a2 : c) {
                aVar2.a(a2);
            }
        }
        Location d = aVar.d();
        if (d != null) {
            aVar2.a(d);
        }
        if (aVar.f()) {
            aVar2.b(oc.a().a(context));
        }
        if (aVar.e() != -1) {
            aVar2.a(aVar.e() == 1);
        }
        aVar2.b(aVar.g());
        aVar2.a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.a();
    }
}
