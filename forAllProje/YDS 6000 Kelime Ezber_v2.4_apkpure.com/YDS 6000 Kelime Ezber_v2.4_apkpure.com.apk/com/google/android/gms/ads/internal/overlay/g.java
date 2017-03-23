package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.aar;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zd;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zl;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.util.k;
import java.util.Collections;
import java.util.Map;

@vz
public class g extends com.google.android.gms.b.un.a implements x {
    static final int a = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel b;
    aaq c;
    c d;
    r e;
    boolean f = false;
    FrameLayout g;
    CustomViewCallback h;
    boolean i = false;
    boolean j = false;
    b k;
    boolean l = false;
    int m = 0;
    o n;
    private final Activity o;
    private final Object p = new Object();
    private Runnable q;
    private boolean r;
    private boolean s;
    private boolean t = false;
    private boolean u = false;
    private boolean v = true;

    @vz
    private static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    @vz
    static class b extends RelativeLayout {
        zl a;
        boolean b;

        public b(Context context, String str) {
            super(context);
            this.a = new zl(context, str);
        }

        void a() {
            this.b = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.b) {
                this.a.a(motionEvent);
            }
            return false;
        }
    }

    @vz
    public static class c {
        public final int a;
        public final LayoutParams b;
        public final ViewGroup c;
        public final Context d;

        public c(aaq com_google_android_gms_b_aaq) {
            this.b = com_google_android_gms_b_aaq.getLayoutParams();
            ViewParent parent = com_google_android_gms_b_aaq.getParent();
            this.d = com_google_android_gms_b_aaq.g();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
            this.c = (ViewGroup) parent;
            this.a = this.c.indexOfChild(com_google_android_gms_b_aaq.b());
            this.c.removeView(com_google_android_gms_b_aaq.b());
            com_google_android_gms_b_aaq.a(true);
        }
    }

    @vz
    private class d extends zd {
        final /* synthetic */ g a;

        private d(g gVar) {
            this.a = gVar;
        }

        public void a() {
            Bitmap a = v.z().a(Integer.valueOf(this.a.b.q.g));
            if (a != null) {
                final Drawable a2 = v.g().a(this.a.o, a, this.a.b.q.e, this.a.b.q.f);
                zi.a.post(new Runnable(this) {
                    final /* synthetic */ d b;

                    public void run() {
                        this.b.a.o.getWindow().setBackgroundDrawable(a2);
                    }
                });
            }
        }

        public void b() {
        }
    }

    public g(Activity activity) {
        this.o = activity;
        this.n = new v();
    }

    public void a() {
        this.m = 2;
        this.o.finish();
    }

    public void a(int i) {
        this.o.setRequestedOrientation(i);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
        boolean z = false;
        this.o.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.i = z;
        try {
            this.b = AdOverlayInfoParcel.a(this.o.getIntent());
            if (this.b == null) {
                throw new a("Could not get info for ad overlay.");
            }
            if (this.b.n.d > 7500000) {
                this.m = 3;
            }
            if (this.o.getIntent() != null) {
                this.v = this.o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.b.q != null) {
                this.j = this.b.q.b;
            } else {
                this.j = false;
            }
            if (((Boolean) pr.bT.c()).booleanValue() && this.j && this.b.q.g != -1) {
                new d().e();
            }
            if (bundle == null) {
                if (this.b.d != null && this.v) {
                    this.b.d.d();
                }
                if (!(this.b.l == 1 || this.b.c == null)) {
                    this.b.c.e();
                }
            }
            this.k = new b(this.o, this.b.p);
            this.k.setId(1000);
            switch (this.b.l) {
                case 1:
                    b(false);
                    return;
                case 2:
                    this.d = new c(this.b.e);
                    b(false);
                    return;
                case 3:
                    b(true);
                    return;
                case 4:
                    if (this.i) {
                        this.m = 3;
                        this.o.finish();
                        return;
                    } else if (!v.b().a(this.o, this.b.b, this.b.j)) {
                        this.m = 3;
                        this.o.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new a("Could not determine ad overlay type.");
            }
        } catch (a e) {
            zy.e(e.getMessage());
            this.m = 3;
            this.o.finish();
        }
    }

    public void a(View view, CustomViewCallback customViewCallback) {
        this.g = new FrameLayout(this.o);
        this.g.setBackgroundColor(-16777216);
        this.g.addView(view, -1, -1);
        this.o.setContentView(this.g);
        l();
        this.h = customViewCallback;
        this.f = true;
    }

    public void a(com.google.android.gms.a.a aVar) {
        if (((Boolean) pr.di.c()).booleanValue() && k.l()) {
            if (v.e().a(this.o, (Configuration) com.google.android.gms.a.b.a(aVar))) {
                this.o.getWindow().addFlags(1024);
                this.o.getWindow().clearFlags(2048);
                return;
            }
            this.o.getWindow().addFlags(2048);
            this.o.getWindow().clearFlags(1024);
        }
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
    }

    public void a(boolean z) {
        this.e = new r(this.o, z ? 50 : 32, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.e.a(z, this.b.h);
        this.k.addView(this.e, layoutParams);
    }

    public void a(boolean z, boolean z2) {
        if (this.e != null) {
            this.e.a(z, z2);
        }
    }

    public void b() {
        if (this.b != null && this.f) {
            a(this.b.k);
        }
        if (this.g != null) {
            this.o.setContentView(this.k);
            l();
            this.g.removeAllViews();
            this.g = null;
        }
        if (this.h != null) {
            this.h.onCustomViewHidden();
            this.h = null;
        }
        this.f = false;
    }

    protected void b(int i) {
        this.c.a(i);
    }

    public void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    protected void b(boolean z) {
        if (!this.s) {
            this.o.requestWindowFeature(1);
        }
        Window window = this.o.getWindow();
        if (window == null) {
            throw new a("Invalid activity, no window available.");
        }
        boolean a = (k.l() && ((Boolean) pr.di.c()).booleanValue()) ? v.e().a(this.o, this.o.getResources().getConfiguration()) : true;
        Object obj = (this.b.q == null || !this.b.q.c) ? null : 1;
        if (!(this.j && obj == null) && a) {
            window.setFlags(1024, 1024);
        }
        aar l = this.b.e.l();
        boolean b = l != null ? l.b() : false;
        this.l = false;
        if (b) {
            if (this.b.k == v.g().a()) {
                this.l = this.o.getResources().getConfiguration().orientation == 1;
            } else if (this.b.k == v.g().b()) {
                this.l = this.o.getResources().getConfiguration().orientation == 2;
            }
        }
        zy.b("Delay onShow to next orientation change: " + this.l);
        a(this.b.k);
        if (v.g().a(window)) {
            zy.b("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.j) {
            this.k.setBackgroundColor(a);
        } else {
            this.k.setBackgroundColor(-16777216);
        }
        this.o.setContentView(this.k);
        l();
        if (z) {
            this.c = v.f().a(this.o, this.b.e.k(), true, b, null, this.b.n, null, null, this.b.e.h());
            this.c.l().a(null, null, this.b.f, this.b.j, true, this.b.o, null, this.b.e.l().a(), null, null);
            this.c.l().a(new com.google.android.gms.b.aar.a(this) {
                public void a(aaq com_google_android_gms_b_aaq, boolean z) {
                    com_google_android_gms_b_aaq.d();
                }
            });
            if (this.b.m != null) {
                this.c.loadUrl(this.b.m);
            } else if (this.b.i != null) {
                this.c.loadDataWithBaseURL(this.b.g, this.b.i, "text/html", "UTF-8", null);
            } else {
                throw new a("No URL or HTML to display in ad overlay.");
            }
            if (this.b.e != null) {
                this.b.e.b(this);
            }
        } else {
            this.c = this.b.e;
            this.c.a(this.o);
        }
        this.c.a(this);
        ViewParent parent = this.c.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.c.b());
        }
        if (this.j) {
            this.c.F();
        }
        this.k.addView(this.c.b(), -1, -1);
        if (!(z || this.l)) {
            q();
        }
        a(b);
        if (this.c.m()) {
            a(b, true);
        }
        com.google.android.gms.ads.internal.d h = this.c.h();
        p pVar = h != null ? h.c : null;
        if (pVar != null) {
            this.n = pVar.a(this.o, this.c, this.k);
        } else {
            zy.e("Appstreaming controller is null.");
        }
    }

    public void c() {
        this.m = 1;
        this.o.finish();
    }

    public void d() {
        this.m = 0;
    }

    public boolean e() {
        boolean z = true;
        this.m = 0;
        if (this.c != null) {
            if (!this.c.t()) {
                z = false;
            }
            if (!z) {
                this.c.a("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    public void f() {
    }

    public void g() {
        if (!((Boolean) pr.dj.c()).booleanValue()) {
            return;
        }
        if (this.c == null || this.c.r()) {
            zy.e("The webview does not exist. Ignoring action.");
        } else {
            v.g().b(this.c);
        }
    }

    public void h() {
        if (this.b != null && this.b.l == 4) {
            if (this.i) {
                this.m = 3;
                this.o.finish();
            } else {
                this.i = true;
            }
        }
        if (this.b.d != null) {
            this.b.d.c();
        }
        if (!((Boolean) pr.dj.c()).booleanValue()) {
            if (this.c == null || this.c.r()) {
                zy.e("The webview does not exist. Ignoring action.");
            } else {
                v.g().b(this.c);
            }
        }
    }

    public void i() {
        b();
        if (this.b.d != null) {
            this.b.d.b();
        }
        if (!(((Boolean) pr.dj.c()).booleanValue() || this.c == null || (this.o.isFinishing() && this.d != null))) {
            v.g().a(this.c);
        }
        n();
    }

    public void j() {
        if (((Boolean) pr.dj.c()).booleanValue() && this.c != null && (!this.o.isFinishing() || this.d == null)) {
            v.g().a(this.c);
        }
        n();
    }

    public void k() {
        if (this.c != null) {
            this.k.removeView(this.c.b());
        }
        n();
    }

    public void l() {
        this.s = true;
    }

    public void m() {
        this.k.removeView(this.e);
        a(true);
    }

    protected void n() {
        if (this.o.isFinishing() && !this.t) {
            this.t = true;
            if (this.c != null) {
                b(this.m);
                synchronized (this.p) {
                    if (!this.r && this.c.A()) {
                        this.q = new Runnable(this) {
                            final /* synthetic */ g a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                this.a.o();
                            }
                        };
                        zi.a.postDelayed(this.q, ((Long) pr.aJ.c()).longValue());
                        return;
                    }
                }
            }
            o();
        }
    }

    void o() {
        if (!this.u) {
            this.u = true;
            if (this.c != null) {
                this.k.removeView(this.c.b());
                if (this.d != null) {
                    this.c.a(this.d.d);
                    this.c.a(false);
                    this.d.c.addView(this.c.b(), this.d.a, this.d.b);
                    this.d = null;
                } else if (this.o.getApplicationContext() != null) {
                    this.c.a(this.o.getApplicationContext());
                }
                this.c = null;
            }
            if (this.b != null && this.b.d != null) {
                this.b.d.a();
            }
        }
    }

    public void p() {
        if (this.l) {
            this.l = false;
            q();
        }
    }

    protected void q() {
        this.c.d();
    }

    public void r() {
        this.k.a();
    }

    public void s() {
        synchronized (this.p) {
            this.r = true;
            if (this.q != null) {
                zi.a.removeCallbacks(this.q);
                zi.a.post(this.q);
            }
        }
    }
}
