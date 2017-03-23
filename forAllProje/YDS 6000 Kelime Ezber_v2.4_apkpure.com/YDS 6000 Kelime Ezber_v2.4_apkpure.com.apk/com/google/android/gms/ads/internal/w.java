package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.aaq;
import com.google.android.gms.b.aar;
import com.google.android.gms.b.dp;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.of;
import com.google.android.gms.b.og;
import com.google.android.gms.b.om;
import com.google.android.gms.b.oo;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qe;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.re;
import com.google.android.gms.b.rf;
import com.google.android.gms.b.rg;
import com.google.android.gms.b.rh;
import com.google.android.gms.b.uv;
import com.google.android.gms.b.va;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.xs;
import com.google.android.gms.b.yu;
import com.google.android.gms.b.yv;
import com.google.android.gms.b.zb;
import com.google.android.gms.b.zd;
import com.google.android.gms.b.ze;
import com.google.android.gms.b.zk;
import com.google.android.gms.b.zl;
import com.google.android.gms.b.zt;
import com.google.android.gms.b.zw;
import com.google.android.gms.b.zy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@vz
public final class w implements OnGlobalLayoutListener, OnScrollChangedListener {
    List<String> A;
    k B;
    public zb C;
    View D;
    public int E;
    boolean F;
    boolean G;
    private HashSet<yv> H;
    private int I;
    private int J;
    private zt K;
    private boolean L;
    private boolean M;
    private boolean N;
    final String a;
    public String b;
    public final Context c;
    final dp d;
    public final aab e;
    a f;
    public zd g;
    public zk h;
    public nx i;
    public yu j;
    public com.google.android.gms.b.yu.a k;
    public yv l;
    of m;
    og n;
    om o;
    oo p;
    uv q;
    va r;
    re s;
    rf t;
    android.support.v4.i.k<String, rg> u;
    android.support.v4.i.k<String, rh> v;
    qr w;
    ph x;
    qe y;
    xs z;

    public static class a extends ViewSwitcher {
        private final zl a;
        private final zw b;
        private boolean c = true;

        public a(Context context, String str, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
            super(context);
            this.a = new zl(context);
            this.a.a(str);
            if (context instanceof Activity) {
                this.b = new zw((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
            } else {
                this.b = new zw(null, this, onGlobalLayoutListener, onScrollChangedListener);
            }
            this.b.a();
        }

        public zl a() {
            return this.a;
        }

        public void b() {
            ze.a("Disable position monitoring on adFrame.");
            if (this.b != null) {
                this.b.b();
            }
        }

        public void c() {
            ze.a("Enable debug gesture detector on adFrame.");
            this.c = true;
        }

        public void d() {
            ze.a("Disable debug gesture detector on adFrame.");
            this.c = false;
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.b != null) {
                this.b.c();
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.b != null) {
                this.b.d();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.c) {
                this.a.a(motionEvent);
            }
            return false;
        }

        public void removeAllViews() {
            List<aaq> arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAt instanceof aaq)) {
                    arrayList.add((aaq) childAt);
                }
            }
            super.removeAllViews();
            for (aaq destroy : arrayList) {
                destroy.destroy();
            }
        }
    }

    public w(Context context, nx nxVar, String str, aab com_google_android_gms_b_aab) {
        this(context, nxVar, str, com_google_android_gms_b_aab, null);
    }

    w(Context context, nx nxVar, String str, aab com_google_android_gms_b_aab, dp dpVar) {
        this.C = null;
        this.D = null;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = -1;
        this.J = -1;
        this.L = true;
        this.M = true;
        this.N = false;
        pr.a(context);
        if (v.i().f() != null) {
            List b = pr.b();
            if (com_google_android_gms_b_aab.c != 0) {
                b.add(Integer.toString(com_google_android_gms_b_aab.c));
            }
            v.i().f().a(b);
        }
        this.a = UUID.randomUUID().toString();
        if (nxVar.e || nxVar.i) {
            this.f = null;
        } else {
            this.f = new a(context, str, this, this);
            this.f.setMinimumWidth(nxVar.g);
            this.f.setMinimumHeight(nxVar.d);
            this.f.setVisibility(4);
        }
        this.i = nxVar;
        this.b = str;
        this.c = context;
        this.e = com_google_android_gms_b_aab;
        if (dpVar == null) {
            dpVar = new dp(new i(this));
        }
        this.d = dpVar;
        this.K = new zt(200);
        this.v = new android.support.v4.i.k();
    }

    private void b(boolean z) {
        boolean z2 = true;
        if (this.f != null && this.j != null && this.j.b != null && this.j.b.l() != null) {
            if (!z || this.K.a()) {
                if (this.j.b.l().b()) {
                    int[] iArr = new int[2];
                    this.f.getLocationOnScreen(iArr);
                    int b = oc.a().b(this.c, iArr[0]);
                    int b2 = oc.a().b(this.c, iArr[1]);
                    if (!(b == this.I && b2 == this.J)) {
                        this.I = b;
                        this.J = b2;
                        aar l = this.j.b.l();
                        b = this.I;
                        int i = this.J;
                        if (z) {
                            z2 = false;
                        }
                        l.a(b, i, z2);
                    }
                }
                k();
            }
        }
    }

    private void k() {
        if (this.f != null) {
            View findViewById = this.f.getRootView().findViewById(16908290);
            if (findViewById != null) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                this.f.getGlobalVisibleRect(rect);
                findViewById.getGlobalVisibleRect(rect2);
                if (rect.top != rect2.top) {
                    this.L = false;
                }
                if (rect.bottom != rect2.bottom) {
                    this.M = false;
                }
            }
        }
    }

    public HashSet<yv> a() {
        return this.H;
    }

    public void a(HashSet<yv> hashSet) {
        this.H = hashSet;
    }

    public void a(boolean z) {
        if (this.E == 0) {
            c();
        }
        if (this.g != null) {
            this.g.d();
        }
        if (this.h != null) {
            this.h.d();
        }
        if (z) {
            this.j = null;
        }
    }

    public void b() {
        if (this.j != null && this.j.b != null) {
            this.j.b.destroy();
        }
    }

    public void c() {
        if (this.j != null && this.j.b != null) {
            this.j.b.stopLoading();
        }
    }

    public void d() {
        if (this.j != null && this.j.p != null) {
            try {
                this.j.p.c();
            } catch (RemoteException e) {
                zy.e("Could not destroy mediation adapter.");
            }
        }
    }

    public boolean e() {
        return this.E == 0;
    }

    public boolean f() {
        return this.E == 1;
    }

    public void g() {
        if (this.f != null) {
            this.f.b();
        }
    }

    public String h() {
        return (this.L && this.M) ? "" : this.L ? this.N ? "top-scrollable" : "top-locked" : this.M ? this.N ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public void i() {
        if (this.l != null) {
            if (this.j != null) {
                this.l.a(this.j.A);
                this.l.b(this.j.B);
                this.l.b(this.j.n);
            }
            this.l.a(this.i.e);
        }
    }

    public void j() {
        g();
        this.n = null;
        this.o = null;
        this.r = null;
        this.q = null;
        this.y = null;
        this.p = null;
        a(false);
        if (this.f != null) {
            this.f.removeAllViews();
        }
        b();
        d();
        this.j = null;
    }

    public void onGlobalLayout() {
        b(false);
    }

    public void onScrollChanged() {
        b(true);
        this.N = true;
    }
}
