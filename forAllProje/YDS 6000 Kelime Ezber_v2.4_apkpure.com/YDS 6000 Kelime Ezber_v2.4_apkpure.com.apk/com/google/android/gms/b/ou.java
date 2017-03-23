package com.google.android.gms.b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.purchase.b;
import java.util.concurrent.atomic.AtomicBoolean;

@vz
public class ou {
    final oe a;
    private final tm b;
    private final nw c;
    private final AtomicBoolean d;
    private final j e;
    private nn f;
    private a g;
    private d[] h;
    private com.google.android.gms.ads.a.a i;
    private f j;
    private ok k;
    private b l;
    private c m;
    private com.google.android.gms.ads.purchase.d n;
    private k o;
    private String p;
    private String q;
    private ViewGroup r;
    private int s;
    private boolean t;

    public ou(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, nw.a(), i);
    }

    public ou(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, nw.a(), i);
    }

    ou(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, nw nwVar, int i) {
        this(viewGroup, attributeSet, z, nwVar, null, i);
    }

    ou(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, nw nwVar, ok okVar, int i) {
        this.b = new tm();
        this.e = new j();
        this.a = new oe(this) {
            final /* synthetic */ ou a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.e.a(this.a.m());
                super.a();
            }

            public void a(int i) {
                this.a.e.a(this.a.m());
                super.a(i);
            }
        };
        this.r = viewGroup;
        this.c = nwVar;
        this.k = okVar;
        this.d = new AtomicBoolean(false);
        this.s = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                oa oaVar = new oa(context, attributeSet);
                this.h = oaVar.a(z);
                this.p = oaVar.a();
                if (viewGroup.isInEditMode()) {
                    oc.a().a(viewGroup, a(context, this.h[0], this.s), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                oc.a().a(viewGroup, new nx(context, d.a), e.getMessage(), e.getMessage());
            }
        }
    }

    private static nx a(Context context, d dVar, int i) {
        nx nxVar = new nx(context, dVar);
        nxVar.a(a(i));
        return nxVar;
    }

    private static nx a(Context context, d[] dVarArr, int i) {
        nx nxVar = new nx(context, dVarArr);
        nxVar.a(a(i));
        return nxVar;
    }

    private static boolean a(int i) {
        return i == 1;
    }

    private void q() {
        try {
            com.google.android.gms.a.a j = this.k.j();
            if (j != null) {
                this.r.addView((View) com.google.android.gms.a.b.a(j));
            }
        } catch (Throwable e) {
            zy.c("Failed to get an ad frame.", e);
        }
    }

    public void a() {
        try {
            if (this.k != null) {
                this.k.i();
            }
        } catch (Throwable e) {
            zy.c("Failed to destroy AdView.", e);
        }
    }

    public void a(com.google.android.gms.ads.a.a aVar) {
        try {
            this.i = aVar;
            if (this.k != null) {
                this.k.a(aVar != null ? new nz(aVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the AppEventListener.", e);
        }
    }

    public void a(c cVar) {
        this.m = cVar;
        try {
            if (this.k != null) {
                this.k.a(cVar != null ? new qf(cVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public void a(a aVar) {
        this.g = aVar;
        this.a.a(aVar);
    }

    public void a(f fVar) {
        this.j = fVar;
        try {
            if (this.k != null) {
                this.k.a(this.j == null ? null : this.j.a());
            }
        } catch (Throwable e) {
            zy.c("Failed to set correlator.", e);
        }
    }

    public void a(k kVar) {
        this.o = kVar;
        try {
            if (this.k != null) {
                this.k.a(kVar == null ? null : new ph(kVar));
            }
        } catch (Throwable e) {
            zy.c("Failed to set video options.", e);
        }
    }

    public void a(b bVar) {
        if (this.n != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.l = bVar;
            if (this.k != null) {
                this.k.a(bVar != null ? new vb(bVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void a(nn nnVar) {
        try {
            this.f = nnVar;
            if (this.k != null) {
                this.k.a(nnVar != null ? new no(nnVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the AdClickListener.", e);
        }
    }

    public void a(ot otVar) {
        try {
            if (this.k == null) {
                o();
            }
            if (this.k.a(this.c.a(this.r.getContext(), otVar))) {
                this.b.a(otVar.j());
            }
        } catch (Throwable e) {
            zy.c("Failed to load ad.", e);
        }
    }

    public void a(String str) {
        if (this.p != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.p = str;
    }

    public void a(boolean z) {
        this.t = z;
        try {
            if (this.k != null) {
                this.k.a(this.t);
            }
        } catch (Throwable e) {
            zy.c("Failed to set manual impressions.", e);
        }
    }

    public void a(d... dVarArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        b(dVarArr);
    }

    public boolean a(nx nxVar) {
        return "search_v2".equals(nxVar.b);
    }

    public a b() {
        return this.g;
    }

    public void b(d... dVarArr) {
        this.h = dVarArr;
        try {
            if (this.k != null) {
                this.k.a(a(this.r.getContext(), this.h, this.s));
            }
        } catch (Throwable e) {
            zy.c("Failed to set the ad size.", e);
        }
        this.r.requestLayout();
    }

    public d c() {
        try {
            if (this.k != null) {
                nx k = this.k.k();
                if (k != null) {
                    return k.b();
                }
            }
        } catch (Throwable e) {
            zy.c("Failed to get the current AdSize.", e);
        }
        return this.h != null ? this.h[0] : null;
    }

    public d[] d() {
        return this.h;
    }

    public String e() {
        return this.p;
    }

    public com.google.android.gms.ads.a.a f() {
        return this.i;
    }

    public b g() {
        return this.l;
    }

    public c h() {
        return this.m;
    }

    public void i() {
        try {
            if (this.k != null) {
                this.k.n();
            }
        } catch (Throwable e) {
            zy.c("Failed to call pause.", e);
        }
    }

    public void j() {
        try {
            if (this.k != null) {
                this.k.o();
            }
        } catch (Throwable e) {
            zy.c("Failed to call resume.", e);
        }
    }

    public String k() {
        try {
            if (this.k != null) {
                return this.k.F();
            }
        } catch (Throwable e) {
            zy.c("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public j l() {
        return this.e;
    }

    public or m() {
        or orVar = null;
        if (this.k != null) {
            try {
                orVar = this.k.r();
            } catch (Throwable e) {
                zy.c("Failed to retrieve VideoController.", e);
            }
        }
        return orVar;
    }

    public k n() {
        return this.o;
    }

    void o() {
        if ((this.h == null || this.p == null) && this.k == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        this.k = p();
        this.k.a(new np(this.a));
        if (this.f != null) {
            this.k.a(new no(this.f));
        }
        if (this.i != null) {
            this.k.a(new nz(this.i));
        }
        if (this.l != null) {
            this.k.a(new vb(this.l));
        }
        if (this.n != null) {
            this.k.a(new vf(this.n), this.q);
        }
        if (this.m != null) {
            this.k.a(new qf(this.m));
        }
        if (this.j != null) {
            this.k.a(this.j.a());
        }
        if (this.o != null) {
            this.k.a(new ph(this.o));
        }
        this.k.a(this.t);
        q();
    }

    protected ok p() {
        Context context = this.r.getContext();
        nx a = a(context, this.h, this.s);
        return a(a) ? oc.b().a(context, a, this.p) : oc.b().a(context, a, this.p, this.b);
    }
}
