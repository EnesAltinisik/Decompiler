package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.d;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.purchase.g;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qa;
import com.google.android.gms.b.rs;
import com.google.android.gms.b.tf;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.us;
import com.google.android.gms.b.uu;
import com.google.android.gms.b.uv;
import com.google.android.gms.b.va;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.wf.a;
import com.google.android.gms.b.wm;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.yv;
import com.google.android.gms.b.yw;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@vz
public abstract class b extends a implements j, com.google.android.gms.ads.internal.purchase.j, t, rs, tf {
    protected final tn j;
    protected transient boolean k;
    private final Messenger l;

    public b(Context context, nx nxVar, String str, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        this(new w(context, nxVar, str, com_google_android_gms_b_aab), tnVar, null, dVar);
    }

    protected b(w wVar, tn tnVar, s sVar, d dVar) {
        super(wVar, sVar, dVar);
        this.j = tnVar;
        this.l = new Messenger(new us(this.f.c));
        this.k = false;
    }

    private a a(ns nsVar, Bundle bundle, yw ywVar) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.f.c.getApplicationInfo();
        try {
            packageInfo = this.f.c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.f.c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.f.f == null || this.f.f.getParent() == null)) {
            int[] iArr = new int[2];
            this.f.f.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = this.f.f.getWidth();
            int height = this.f.f.getHeight();
            int i3 = 0;
            if (this.f.f.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i);
            bundle2.putInt("y", i2);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i3);
        }
        String d = v.i().d();
        this.f.l = new yv(d, this.f.b);
        this.f.l.a(nsVar);
        String a = v.e().a(this.f.c, this.f.f, this.f.i);
        long j = 0;
        if (this.f.p != null) {
            try {
                j = this.f.p.a();
            } catch (RemoteException e2) {
                zy.e("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a2 = v.i().a(this.f.c, this, d);
        List arrayList = new ArrayList();
        for (i = 0; i < this.f.v.size(); i++) {
            arrayList.add((String) this.f.v.b(i));
        }
        boolean z = this.f.q != null;
        boolean z2 = this.f.r != null && v.i().u();
        String str = "";
        if (((Boolean) pr.cR.c()).booleanValue()) {
            zy.b("Getting webview cookie from CookieManager.");
            CookieManager b = v.g().b(this.f.c);
            if (b != null) {
                str = b.getCookie("googleads.g.doubleclick.net");
            }
        }
        String str2 = null;
        if (ywVar != null) {
            str2 = ywVar.c();
        }
        return new a(bundle2, nsVar, this.f.i, this.f.b, applicationInfo, packageInfo, d, v.i().a(), this.f.e, a2, this.f.A, arrayList, bundle, v.i().h(), this.l, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, a, j, uuid, pr.a(), this.f.a, this.f.w, new wm(z, z2, false), this.f.h(), v.e().g(), v.e().h(), v.e().k(this.f.c), v.e().b(this.f.f), this.f.c instanceof Activity, v.i().m(), str, str2, v.i().p(), v.B().a(), v.e().i(), v.m().a());
    }

    public void A() {
        f();
    }

    public void B() {
        d();
    }

    public void C() {
        if (this.f.j != null) {
            String str = this.f.j.q;
            zy.e(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(this.f.j, true);
        v();
    }

    public void D() {
        E();
    }

    public void E() {
        a(this.f.j, false);
    }

    public String F() {
        return this.f.j == null ? null : this.f.j.q;
    }

    public void G() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void H() {
        v.e().a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e.b();
            }
        });
    }

    public void I() {
        v.e().a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.e.c();
            }
        });
    }

    public void a() {
        this.h.b(this.f.j);
        this.k = false;
        s();
        this.f.l.c();
    }

    public void a(uv uvVar) {
        c.b("setInAppPurchaseListener must be called on the main UI thread.");
        this.f.q = uvVar;
    }

    public void a(va vaVar, String str) {
        c.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f.B = new k(str);
        this.f.r = vaVar;
        if (!v.i().g() && vaVar != null) {
            new com.google.android.gms.ads.internal.purchase.c(this.f.c, this.f.r, this.f.B).e();
        }
    }

    protected void a(yu yuVar, boolean z) {
        if (yuVar == null) {
            zy.e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.c(yuVar);
        if (!(yuVar.r == null || yuVar.r.d == null)) {
            v.x().a(this.f.c, this.f.e.b, yuVar, this.f.b, z, yuVar.r.d);
        }
        if (yuVar.o != null && yuVar.o.g != null) {
            v.x().a(this.f.c, this.f.e.b, yuVar, this.f.b, z, yuVar.o.g);
        }
    }

    public void a(String str, ArrayList<String> arrayList) {
        uu dVar = new d(str, arrayList, this.f.c, this.f.e.b);
        if (this.f.q == null) {
            zy.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!oc.a().b(this.f.c)) {
                zy.e("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.f.r == null) {
                zy.e("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.f.B == null) {
                zy.e("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.f.F) {
                zy.e("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.f.F = true;
                try {
                    if (this.f.r.a(str)) {
                        v.s().a(this.f.c, this.f.e.e, new GInAppPurchaseManagerInfoParcel(this.f.c, this.f.B, dVar, this));
                        return;
                    } else {
                        this.f.F = false;
                        return;
                    }
                } catch (RemoteException e) {
                    zy.e("Could not start In-App purchase.");
                    this.f.F = false;
                    return;
                }
            }
        }
        try {
            this.f.q.a(dVar);
        } catch (RemoteException e2) {
            zy.e("Could not start In-App purchase.");
        }
    }

    public void a(String str, boolean z, int i, final Intent intent, f fVar) {
        try {
            if (this.f.r != null) {
                this.f.r.a(new g(this.f.c, str, z, i, intent, fVar));
            }
        } catch (RemoteException e) {
            zy.e("Fail to invoke PlayStorePurchaseListener.");
        }
        zi.a.postDelayed(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                int a = v.s().a(intent);
                v.s();
                if (!(a != 0 || this.b.f.j == null || this.b.f.j.b == null || this.b.f.j.b.i() == null)) {
                    this.b.f.j.b.i().a();
                }
                this.b.f.F = false;
            }
        }, 500);
    }

    public boolean a(ns nsVar, qa qaVar) {
        if (!x()) {
            return false;
        }
        Bundle m = v.e().m(this.f.c);
        this.e.a();
        this.f.E = 0;
        yw ywVar = null;
        if (((Boolean) pr.cz.c()).booleanValue()) {
            ywVar = v.i().q();
            v.A().a(this.f.c, this.f.e, false, ywVar, ywVar.d(), this.f.b);
        }
        a a = a(nsVar, m, ywVar);
        qaVar.a("seq_num", a.g);
        qaVar.a("request_id", a.v);
        qaVar.a("session_id", a.h);
        if (a.f != null) {
            qaVar.a("app_version", String.valueOf(a.f.versionCode));
        }
        this.f.g = v.a().a(this.f.c, a, this.f.d, this);
        return true;
    }

    protected boolean a(ns nsVar, yu yuVar, boolean z) {
        if (!z && this.f.e()) {
            if (yuVar.h > 0) {
                this.e.a(nsVar, yuVar.h);
            } else if (yuVar.r != null && yuVar.r.i > 0) {
                this.e.a(nsVar, yuVar.r.i);
            } else if (!yuVar.n && yuVar.d == 2) {
                this.e.b(nsVar);
            }
        }
        return this.e.d();
    }

    boolean a(yu yuVar) {
        ns nsVar;
        boolean z = false;
        if (this.g != null) {
            nsVar = this.g;
            this.g = null;
        } else {
            nsVar = yuVar.a;
            if (nsVar.c != null) {
                z = nsVar.c.getBoolean("_noRefresh", false);
            }
        }
        return a(nsVar, yuVar, z);
    }

    protected boolean a(yu yuVar, yu yuVar2) {
        int i;
        int i2 = 0;
        if (!(yuVar == null || yuVar.s == null)) {
            yuVar.s.a(null);
        }
        if (yuVar2.s != null) {
            yuVar2.s.a((tf) this);
        }
        if (yuVar2.r != null) {
            i = yuVar2.r.o;
            i2 = yuVar2.r.p;
        } else {
            i = 0;
        }
        this.f.C.a(i, i2);
        return true;
    }

    public void b() {
        this.h.d(this.f.j);
    }

    public void b(yu yuVar) {
        super.b(yuVar);
        if (yuVar.o != null) {
            zy.b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f.f != null) {
                this.f.f.d();
            }
            zy.b("Pinging network fill URLs.");
            v.x().a(this.f.c, this.f.e.b, yuVar, this.f.b, false, yuVar.o.h);
            if (!(yuVar.r == null || yuVar.r.f == null || yuVar.r.f.size() <= 0)) {
                zy.b("Pinging urls remotely");
                v.e().a(this.f.c, yuVar.r.f);
            }
        } else {
            zy.b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f.f != null) {
                this.f.f.c();
            }
        }
        if (yuVar.d == 3 && yuVar.r != null && yuVar.r.e != null) {
            zy.b("Pinging no fill URLs.");
            v.x().a(this.f.c, this.f.e.b, yuVar, this.f.b, false, yuVar.r.e);
        }
    }

    protected boolean b(ns nsVar) {
        return super.b(nsVar) && !this.k;
    }

    public void c() {
        this.h.e(this.f.j);
    }

    public void d() {
        this.k = true;
        u();
    }

    public void e() {
        if (this.f.j == null) {
            zy.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f.j.r == null || this.f.j.r.c == null)) {
            v.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.r.c);
        }
        if (!(this.f.j.o == null || this.f.j.o.f == null)) {
            v.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.f);
        }
        super.e();
    }

    public void n() {
        c.b("pause must be called on the main UI thread.");
        if (!(this.f.j == null || this.f.j.b == null || !this.f.e())) {
            v.g().a(this.f.j.b);
        }
        if (!(this.f.j == null || this.f.j.p == null)) {
            try {
                this.f.j.p.d();
            } catch (RemoteException e) {
                zy.e("Could not pause mediation adapter.");
            }
        }
        this.h.d(this.f.j);
        this.e.b();
    }

    public void o() {
        c.b("resume must be called on the main UI thread.");
        aaq com_google_android_gms_b_aaq = null;
        if (!(this.f.j == null || this.f.j.b == null)) {
            com_google_android_gms_b_aaq = this.f.j.b;
        }
        if (com_google_android_gms_b_aaq != null && this.f.e()) {
            v.g().b(this.f.j.b);
        }
        if (!(this.f.j == null || this.f.j.p == null)) {
            try {
                this.f.j.p.e();
            } catch (RemoteException e) {
                zy.e("Could not resume mediation adapter.");
            }
        }
        if (com_google_android_gms_b_aaq == null || !com_google_android_gms_b_aaq.u()) {
            this.e.c();
        }
        this.h.e(this.f.j);
    }

    protected boolean x() {
        return v.e().a(this.f.c.getPackageManager(), this.f.c.getPackageName(), "android.permission.INTERNET") && v.e().a(this.f.c);
    }

    public void y() {
        e();
    }

    public void z() {
        a();
    }
}
