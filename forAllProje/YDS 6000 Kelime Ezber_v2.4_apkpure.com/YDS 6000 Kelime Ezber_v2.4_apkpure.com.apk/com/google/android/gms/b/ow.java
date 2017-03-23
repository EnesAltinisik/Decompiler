package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.a.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.ads.purchase.d;

@vz
public class ow {
    private final tm a;
    private final Context b;
    private final nw c;
    private a d;
    private nn e;
    private ok f;
    private String g;
    private String h;
    private com.google.android.gms.ads.a.a i;
    private d j;
    private b k;
    private e l;
    private c m;
    private f n;
    private com.google.android.gms.ads.d.b o;
    private boolean p;

    public ow(Context context) {
        this(context, nw.a(), null);
    }

    public ow(Context context, nw nwVar, e eVar) {
        this.a = new tm();
        this.b = context;
        this.c = nwVar;
        this.l = eVar;
    }

    private void b(String str) {
        if (this.g == null) {
            c(str);
        }
        this.f = oc.b().b(this.b, this.p ? nx.a() : new nx(), this.g, this.a);
        if (this.d != null) {
            this.f.a(new np(this.d));
        }
        if (this.e != null) {
            this.f.a(new no(this.e));
        }
        if (this.i != null) {
            this.f.a(new nz(this.i));
        }
        if (this.k != null) {
            this.f.a(new vb(this.k));
        }
        if (this.j != null) {
            this.f.a(new vf(this.j), this.h);
        }
        if (this.m != null) {
            this.f.a(new qf(this.m));
        }
        if (this.n != null) {
            this.f.a(this.n.a());
        }
        if (this.o != null) {
            this.f.a(new xv(this.o));
        }
    }

    private void c(String str) {
        if (this.f == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    public void a(a aVar) {
        try {
            this.d = aVar;
            if (this.f != null) {
                this.f.a(aVar != null ? new np(aVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the AdListener.", e);
        }
    }

    public void a(com.google.android.gms.ads.d.b bVar) {
        try {
            this.o = bVar;
            if (this.f != null) {
                this.f.a(bVar != null ? new xv(bVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the AdListener.", e);
        }
    }

    public void a(nn nnVar) {
        try {
            this.e = nnVar;
            if (this.f != null) {
                this.f.a(nnVar != null ? new no(nnVar) : null);
            }
        } catch (Throwable e) {
            zy.c("Failed to set the AdClickListener.", e);
        }
    }

    public void a(ot otVar) {
        try {
            if (this.f == null) {
                b("loadAd");
            }
            if (this.f.a(this.c.a(this.b, otVar))) {
                this.a.a(otVar.j());
            }
        } catch (Throwable e) {
            zy.c("Failed to load ad.", e);
        }
    }

    public void a(String str) {
        if (this.g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.g = str;
    }

    public void a(boolean z) {
        this.p = z;
    }

    public boolean a() {
        boolean z = false;
        try {
            if (this.f != null) {
                z = this.f.l();
            }
        } catch (Throwable e) {
            zy.c("Failed to check if ad is ready.", e);
        }
        return z;
    }

    public void b() {
        try {
            c("show");
            this.f.G();
        } catch (Throwable e) {
            zy.c("Failed to show interstitial.", e);
        }
    }
}
