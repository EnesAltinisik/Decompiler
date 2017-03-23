package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.c;

public class de extends cy {
    protected long a;
    private Handler b;
    private final ca c = new ca(this, this.n) {
        final /* synthetic */ de a;

        public void a() {
            this.a.z();
        }
    };
    private final ca d = new ca(this, this.n) {
        final /* synthetic */ de a;

        public void a() {
            this.a.B();
        }
    };

    de(cv cvVar) {
        super(cvVar);
    }

    private void A() {
        synchronized (this) {
            if (this.b == null) {
                this.b = new Handler(Looper.getMainLooper());
            }
        }
    }

    private void B() {
        e();
        a(false);
        f().a(m().b());
    }

    private void a(long j) {
        e();
        A();
        this.c.c();
        this.d.c();
        u().D().a("Activity resumed, time", Long.valueOf(j));
        this.a = j;
        if (m().a() - v().i.a() > v().k.a()) {
            v().j.a(true);
            v().l.a(0);
        }
        if (v().j.a()) {
            this.c.a(Math.max(0, v().h.a() - v().l.a()));
        } else {
            this.d.a(Math.max(0, 3600000 - v().l.a()));
        }
    }

    private void b(long j) {
        e();
        A();
        this.c.c();
        this.d.c();
        u().D().a("Activity paused, time", Long.valueOf(j));
        if (this.a != 0) {
            v().l.a(v().l.a() + (j - this.a));
        }
        v().k.a(m().a());
    }

    protected void a() {
    }

    public boolean a(boolean z) {
        e();
        Q();
        long b = m().b();
        if (this.a == 0) {
            this.a = b - 3600000;
        }
        long j = b - this.a;
        if (z || j >= 1000) {
            v().l.a(j);
            u().D().a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            db.a(l().x(), bundle);
            h().a("auto", "_e", bundle);
            this.a = b;
            this.d.c();
            this.d.a(Math.max(0, 3600000 - v().l.a()));
            return true;
        }
        u().D().a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }

    protected void x() {
        final long b = m().b();
        t().a(new Runnable(this) {
            final /* synthetic */ de b;

            public void run() {
                this.b.a(b);
            }
        });
    }

    protected void y() {
        final long b = m().b();
        t().a(new Runnable(this) {
            final /* synthetic */ de b;

            public void run() {
                this.b.b(b);
            }
        });
    }

    protected void z() {
        e();
        u().D().a("Session started, time", Long.valueOf(m().b()));
        v().j.a(false);
        h().a("auto", "_s", new Bundle());
    }
}
