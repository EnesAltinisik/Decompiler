package com.google.android.gms.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.c;

public class dh extends cy {
    private boolean a;
    private final AlarmManager b = ((AlarmManager) n().getSystemService("alarm"));
    private final ca c;

    protected dh(cv cvVar) {
        super(cvVar);
        this.c = new ca(this, cvVar) {
            final /* synthetic */ dh a;

            public void a() {
                this.a.z();
            }
        };
    }

    private PendingIntent y() {
        Intent intent = new Intent();
        Context n = n();
        w().R();
        intent = intent.setClassName(n, "com.google.android.gms.measurement.AppMeasurementReceiver");
        intent.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(n(), 0, intent, 0);
    }

    private void z() {
        Intent intent = new Intent();
        Context n = n();
        w().R();
        intent = intent.setClassName(n, "com.google.android.gms.measurement.AppMeasurementReceiver");
        intent.setAction("com.google.android.gms.measurement.UPLOAD");
        n().sendBroadcast(intent);
    }

    protected void a() {
        this.b.cancel(y());
    }

    public void a(long j) {
        Q();
        w().R();
        if (!cs.a(n(), false)) {
            u().C().a("Receiver not registered/enabled");
        }
        w().R();
        if (!dd.a(n(), false)) {
            u().C().a("Service not registered/enabled");
        }
        x();
        long b = m().b() + j;
        this.a = true;
        if (j < w().ak() && !this.c.b()) {
            this.c.a(j);
        }
        this.b.setInexactRepeating(2, b, Math.max(w().al(), j), y());
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

    public void x() {
        Q();
        this.a = false;
        this.b.cancel(y());
        this.c.c();
    }
}
