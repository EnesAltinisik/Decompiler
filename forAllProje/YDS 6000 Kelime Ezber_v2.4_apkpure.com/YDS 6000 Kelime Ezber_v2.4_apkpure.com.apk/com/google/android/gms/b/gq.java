package com.google.android.gms.b;

import com.google.android.gms.b.jc.a;
import com.google.firebase.b;
import com.google.firebase.database.c;
import com.google.firebase.database.f;
import java.util.concurrent.ScheduledExecutorService;

public class gq {
    protected jc a;
    protected gu b;
    protected gm c;
    protected hc d;
    protected String e;
    protected String f;
    protected a g = a.INFO;
    protected boolean h;
    protected long i = 10485760;
    protected b j;
    private boolean k = false;
    private boolean l = false;
    private gy m;

    class AnonymousClass1 implements ga {
        final /* synthetic */ gm a;

        AnonymousClass1(gm gmVar) {
            this.a = gmVar;
        }

        public void a(boolean z, final ga.a aVar) {
            this.a.a(z, new gm.a(this) {
                public void a(String str) {
                    aVar.a(str);
                }

                public void b(String str) {
                    aVar.b(str);
                }
            });
        }
    }

    private static ga a(gm gmVar) {
        return new AnonymousClass1(gmVar);
    }

    private String c(String str) {
        return "Firebase/" + "5" + "/" + f.e() + "/" + str;
    }

    private gy o() {
        if (this.m == null) {
            if (ki.a()) {
                p();
            } else if (gv.a()) {
                gy gyVar = gv.INSTANCE;
                gyVar.b();
                this.m = gyVar;
            } else {
                this.m = gw.INSTANCE;
            }
        }
        return this.m;
    }

    private synchronized void p() {
        this.m = new fk(this.j);
    }

    private void q() {
        t();
        o();
        w();
        v();
        u();
        y();
        x();
    }

    private void r() {
        this.b.a();
        this.d.c();
    }

    private ScheduledExecutorService s() {
        hc k = k();
        if (k instanceof ko) {
            return ((ko) k).d();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private void t() {
        if (this.a == null) {
            this.a = o().a(this, this.g, null);
        }
    }

    private void u() {
        if (this.d == null) {
            this.d = this.m.b(this);
        }
    }

    private void v() {
        if (this.b == null) {
            this.b = o().a(this);
        }
    }

    private void w() {
        if (this.f == null) {
            this.f = c(o().c(this));
        }
    }

    private void x() {
        if (this.c == null) {
            this.c = o().a(s());
        }
    }

    private void y() {
        if (this.e == null) {
            this.e = "default";
        }
    }

    public gf a(gd gdVar, gf.a aVar) {
        return o().a(this, g(), gdVar, aVar);
    }

    public jb a(String str) {
        return new jb(this.a, str);
    }

    public boolean a() {
        return this.k;
    }

    ib b(String str) {
        if (!this.h) {
            return new ia();
        }
        ib a = this.m.a(this, str);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }

    synchronized void b() {
        if (!this.k) {
            this.k = true;
            q();
        }
    }

    public void c() {
        if (this.l) {
            r();
            this.l = false;
        }
    }

    protected void d() {
        if (a()) {
            throw new c("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public a e() {
        return this.g;
    }

    public jc f() {
        return this.a;
    }

    public gb g() {
        return new gb(f(), a(n()), s(), h(), f.e(), l());
    }

    public boolean h() {
        return this.h;
    }

    public long i() {
        return this.i;
    }

    public gu j() {
        return this.b;
    }

    public hc k() {
        return this.d;
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.e;
    }

    public gm n() {
        return this.c;
    }
}
