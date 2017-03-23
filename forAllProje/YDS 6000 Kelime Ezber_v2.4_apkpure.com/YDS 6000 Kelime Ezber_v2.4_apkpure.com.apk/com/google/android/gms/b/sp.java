package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.ok.a;

@vz
public class sp extends a {
    private final String a;
    private final sj b;
    private l c;
    private final sl d;
    private va e;
    private String f;

    public sp(Context context, String str, tn tnVar, aab com_google_android_gms_b_aab, d dVar) {
        this(str, new sj(context, tnVar, com_google_android_gms_b_aab, dVar));
    }

    sp(String str, sj sjVar) {
        this.a = str;
        this.b = sjVar;
        this.d = new sl();
        v.t().a(sjVar);
    }

    private void b() {
        if (this.c != null && this.e != null) {
            this.c.a(this.e, this.f);
        }
    }

    static boolean b(ns nsVar) {
        Bundle a = sm.a(nsVar);
        return a != null && a.containsKey("gw");
    }

    static boolean c(ns nsVar) {
        Bundle a = sm.a(nsVar);
        return a != null && a.containsKey("_ad");
    }

    public String F() {
        return this.c != null ? this.c.F() : null;
    }

    public void G() {
        if (this.c != null) {
            this.c.G();
        } else {
            zy.e("Interstitial ad must be loaded before showInterstitial().");
        }
    }

    void a() {
        if (this.c == null) {
            this.c = this.b.a(this.a);
            this.d.a(this.c);
            b();
        }
    }

    public void a(nx nxVar) {
        if (this.c != null) {
            this.c.a(nxVar);
        }
    }

    public void a(of ofVar) {
        this.d.e = ofVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(og ogVar) {
        this.d.a = ogVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(om omVar) {
        this.d.b = omVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(oo ooVar) {
        a();
        if (this.c != null) {
            this.c.a(ooVar);
        }
    }

    public void a(ph phVar) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public void a(qe qeVar) {
        this.d.d = qeVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(uv uvVar) {
        this.d.c = uvVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(va vaVar, String str) {
        this.e = vaVar;
        this.f = str;
        b();
    }

    public void a(xs xsVar) {
        this.d.f = xsVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(String str) {
    }

    public void a(boolean z) {
        a();
        if (this.c != null) {
            this.c.a(z);
        }
    }

    public boolean a(ns nsVar) {
        if (((Boolean) pr.aI.c()).booleanValue()) {
            ns.a(nsVar);
        }
        if (!b(nsVar)) {
            a();
        }
        if (sm.c(nsVar)) {
            a();
        }
        if (nsVar.j != null) {
            a();
        }
        if (this.c != null) {
            return this.c.a(nsVar);
        }
        sm t = v.t();
        if (c(nsVar)) {
            t.b(nsVar, this.a);
        }
        a a = t.a(nsVar, this.a);
        if (a != null) {
            if (!a.e) {
                a.a();
            }
            this.c = a.a;
            a.c.a(this.d);
            this.d.a(this.c);
            b();
            return a.f;
        }
        a();
        return this.c.a(nsVar);
    }

    public void i() {
        if (this.c != null) {
            this.c.i();
        }
    }

    public com.google.android.gms.a.a j() {
        return this.c != null ? this.c.j() : null;
    }

    public nx k() {
        return this.c != null ? this.c.k() : null;
    }

    public boolean l() {
        return this.c != null && this.c.l();
    }

    public void m() {
        if (this.c != null) {
            this.c.m();
        } else {
            zy.e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public void n() {
        if (this.c != null) {
            this.c.n();
        }
    }

    public void o() {
        if (this.c != null) {
            this.c.o();
        }
    }

    public void p() {
        if (this.c != null) {
            this.c.p();
        }
    }

    public boolean q() {
        return this.c != null && this.c.q();
    }

    public or r() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }
}
