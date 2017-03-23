package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Window;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.aar;
import com.google.android.gms.b.mo;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.rv;
import com.google.android.gms.b.sa;
import com.google.android.gms.b.sw;
import com.google.android.gms.b.td;
import com.google.android.gms.b.te;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.wi;
import com.google.android.gms.b.wz;
import com.google.android.gms.b.yj;
import com.google.android.gms.b.yo;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.zd;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.k;
import java.util.Collections;
import org.json.JSONObject;

@vz
public class l extends c implements rv, com.google.android.gms.b.sa.a {
    protected transient boolean l = false;
    private int m = -1;
    private boolean n;
    private float o;

    @vz
    private class a extends zd {
        final /* synthetic */ l a;
        private final int b;

        public a(l lVar, int i) {
            this.a = lVar;
            this.b = i;
        }

        public void a() {
            m mVar = new m(this.a.f.G, this.a.M(), this.a.n, this.a.o, this.a.f.G ? this.b : -1);
            int q = this.a.f.j.b.q();
            final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.a, this.a, this.a, this.a.f.j.b, q == -1 ? this.a.f.j.g : q, this.a.f.e, this.a.f.j.C, mVar);
            zi.a.post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    v.c().a(this.b.a.f.c, adOverlayInfoParcel);
                }
            });
        }

        public void b() {
        }
    }

    public l(Context context, nx nxVar, String str, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        super(context, nxVar, str, tnVar, com_google_android_gms_b_aab, dVar);
    }

    private void a(Bundle bundle) {
        v.e().b(this.f.c, this.f.e.b, "gmob-apps", bundle, false);
    }

    static com.google.android.gms.b.yu.a b(com.google.android.gms.b.yu.a aVar) {
        try {
            String jSONObject = wz.a(aVar.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.google.ads.mediation.a.AD_UNIT_ID_PARAMETER, aVar.a.e);
            td tdVar = new td(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            wi wiVar = aVar.b;
            te teVar = new te(Collections.singletonList(tdVar), -1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), wiVar.J, wiVar.K, "", -1, 0, 1, null, 0, -1, -1, false);
            return new com.google.android.gms.b.yu.a(aVar.a, new wi(aVar.a, wiVar.b, wiVar.c, Collections.emptyList(), Collections.emptyList(), wiVar.g, true, wiVar.i, Collections.emptyList(), wiVar.k, wiVar.l, wiVar.m, wiVar.n, wiVar.o, wiVar.p, wiVar.q, null, wiVar.s, wiVar.t, wiVar.u, wiVar.v, wiVar.w, wiVar.z, wiVar.A, wiVar.B, null, Collections.emptyList(), Collections.emptyList(), wiVar.F, wiVar.G, wiVar.H, wiVar.I, wiVar.J, wiVar.K, wiVar.L, null, wiVar.N, wiVar.O), teVar, aVar.d, aVar.e, aVar.f, aVar.g, null);
        } catch (Throwable e) {
            zy.b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return aVar;
        }
    }

    public void G() {
        c.b("showInterstitial must be called on the main UI thread.");
        if (this.f.j == null) {
            zy.e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) pr.bb.c()).booleanValue()) {
            Bundle bundle;
            String packageName = this.f.c.getApplicationContext() != null ? this.f.c.getApplicationContext().getPackageName() : this.f.c.getPackageName();
            if (!this.l) {
                zy.e("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                a(bundle);
            }
            if (!v.e().g(this.f.c)) {
                zy.e("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                a(bundle);
            }
        }
        if (!this.f.f()) {
            if (this.f.j.n && this.f.j.p != null) {
                try {
                    this.f.j.p.b();
                } catch (Throwable e) {
                    zy.c("Could not show interstitial.", e);
                    N();
                }
            } else if (this.f.j.b == null) {
                zy.e("The interstitial failed to load.");
            } else if (this.f.j.b.p()) {
                zy.e("The interstitial is already showing.");
            } else {
                this.f.j.b.a(true);
                if (this.f.j.j != null) {
                    this.h.a(this.f.i, this.f.j);
                }
                if (k.c()) {
                    final yu yuVar = this.f.j;
                    if (yuVar.a()) {
                        new mo(this.f.c, yuVar.b.b()).a(yuVar.b);
                    } else {
                        yuVar.b.l().a(new aar.c(this) {
                            final /* synthetic */ l b;

                            public void a() {
                                new mo(this.b.f.c, yuVar.b.b()).a(yuVar.b);
                            }
                        });
                    }
                }
                Bitmap h = this.f.G ? v.e().h(this.f.c) : null;
                this.m = v.z().a(h);
                if (!((Boolean) pr.bT.c()).booleanValue() || h == null) {
                    m mVar = new m(this.f.G, M(), false, 0.0f, -1);
                    int q = this.f.j.b.q();
                    if (q == -1) {
                        q = this.f.j.g;
                    }
                    v.c().a(this.f.c, new AdOverlayInfoParcel(this, this, this, this.f.j.b, q, this.f.e, this.f.j.C, mVar));
                    return;
                }
                new a(this, this.m).e();
            }
        }
    }

    protected boolean M() {
        if (!(this.f.c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f.c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        boolean z = (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        return z;
    }

    public void N() {
        v.z().b(Integer.valueOf(this.m));
        if (this.f.e()) {
            this.f.b();
            this.f.j = null;
            this.f.G = false;
            this.l = false;
        }
    }

    public void O() {
        if (!(this.f.j == null || this.f.j.y == null)) {
            v.e().a(this.f.c, this.f.e.b, this.f.j.y);
        }
        w();
    }

    protected aaq a(com.google.android.gms.b.yu.a aVar, e eVar, yo yoVar) {
        aaq a = v.f().a(this.f.c, this.f.i, false, false, this.f.d, this.f.e, this.a, this, this.i);
        a.l().a(this, null, this, this, ((Boolean) pr.ar.c()).booleanValue(), this, this, eVar, null, yoVar);
        a((sw) a);
        a.b(aVar.a.w);
        sa.a(a, (com.google.android.gms.b.sa.a) this);
        return a;
    }

    public void a(com.google.android.gms.b.yu.a aVar, qa qaVar) {
        Object obj = 1;
        if (!((Boolean) pr.aK.c()).booleanValue()) {
            super.a(aVar, qaVar);
        } else if (aVar.e != -2) {
            super.a(aVar, qaVar);
        } else {
            Bundle bundle = aVar.a.c.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            Object obj2 = (bundle == null || !bundle.containsKey("gw")) ? 1 : null;
            if (aVar.b.h) {
                obj = null;
            }
            if (!(obj2 == null || r2 == null)) {
                this.f.k = b(aVar);
            }
            super.a(this.f.k, qaVar);
        }
    }

    public void a(boolean z, float f) {
        this.n = z;
        this.o = f;
    }

    public boolean a(ns nsVar, qa qaVar) {
        if (this.f.j == null) {
            return super.a(nsVar, qaVar);
        }
        zy.e("An interstitial is already loading. Aborting.");
        return false;
    }

    protected boolean a(ns nsVar, yu yuVar, boolean z) {
        if (this.f.e() && yuVar.b != null) {
            v.g().a(yuVar.b);
        }
        return this.e.d();
    }

    public boolean a(yu yuVar, yu yuVar2) {
        if (!super.a(yuVar, yuVar2)) {
            return false;
        }
        if (!(this.f.e() || this.f.D == null || yuVar2.j == null)) {
            this.h.a(this.f.i, yuVar2, this.f.D);
        }
        return true;
    }

    public void b(yj yjVar) {
        if (this.f.j != null) {
            if (this.f.j.z != null) {
                v.e().a(this.f.c, this.f.e.b, this.f.j.z);
            }
            if (this.f.j.x != null) {
                yjVar = this.f.j.x;
            }
        }
        a(yjVar);
    }

    public void b(boolean z) {
        this.f.G = z;
    }

    public void d() {
        E();
        super.d();
        if (this.f.j != null && this.f.j.b != null) {
            aar l = this.f.j.b.l();
            if (l != null) {
                l.h();
            }
        }
    }

    protected void s() {
        N();
        super.s();
    }

    protected void v() {
        super.v();
        this.l = true;
    }
}
