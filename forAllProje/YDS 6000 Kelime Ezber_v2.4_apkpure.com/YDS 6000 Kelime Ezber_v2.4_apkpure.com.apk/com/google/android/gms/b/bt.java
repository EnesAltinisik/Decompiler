package com.google.android.gms.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.i.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Map;

public class bt extends cx {
    private final Map<String, Long> a = new a();
    private final Map<String, Integer> b = new a();
    private long c;

    public bt(cv cvVar) {
        super(cvVar);
    }

    private void a(long j, f fVar) {
        if (fVar == null) {
            u().D().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            u().D().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            db.a(fVar, bundle);
            h().a("am", "_xa", bundle);
        }
    }

    private void a(String str, long j) {
        c();
        e();
        c.a(str);
        if (this.b.isEmpty()) {
            this.c = j;
        }
        Integer num = (Integer) this.b.get(str);
        if (num != null) {
            this.b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.b.size() >= 100) {
            u().z().a("Too many ads visible");
        } else {
            this.b.put(str, Integer.valueOf(1));
            this.a.put(str, Long.valueOf(j));
        }
    }

    private void a(String str, long j, f fVar) {
        if (fVar == null) {
            u().D().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            u().D().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            db.a(fVar, bundle);
            h().a("am", "_xu", bundle);
        }
    }

    private void b(long j) {
        for (String put : this.a.keySet()) {
            this.a.put(put, Long.valueOf(j));
        }
        if (!this.a.isEmpty()) {
            this.c = j;
        }
    }

    private void b(String str, long j) {
        c();
        e();
        c.a(str);
        Integer num = (Integer) this.b.get(str);
        if (num != null) {
            f x = l().x();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.b.remove(str);
                Long l = (Long) this.a.get(str);
                if (l == null) {
                    u().x().a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.a.remove(str);
                    a(str, longValue, x);
                }
                if (!this.b.isEmpty()) {
                    return;
                }
                if (this.c == 0) {
                    u().x().a("First ad exposure time was never set");
                    return;
                }
                a(j - this.c, x);
                this.c = 0;
                return;
            }
            this.b.put(str, Integer.valueOf(intValue));
            return;
        }
        u().x().a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public void a() {
        final long b = m().b();
        t().a(new Runnable(this) {
            final /* synthetic */ bt b;

            public void run() {
                this.b.b(b);
            }
        });
    }

    public void a(long j) {
        f x = l().x();
        for (String str : this.a.keySet()) {
            a(str, j - ((Long) this.a.get(str)).longValue(), x);
        }
        if (!this.a.isEmpty()) {
            a(j - this.c, x);
        }
        b(j);
    }

    public void a(final String str) {
        if (VERSION.SDK_INT >= 14) {
            if (str == null || str.length() == 0) {
                u().x().a("Ad unit id must be a non-empty string");
                return;
            }
            final long b = m().b();
            t().a(new Runnable(this) {
                final /* synthetic */ bt c;

                public void run() {
                    this.c.a(str, b);
                }
            });
        }
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public void b(final String str) {
        if (VERSION.SDK_INT >= 14) {
            if (str == null || str.length() == 0) {
                u().x().a("Ad unit id must be a non-empty string");
                return;
            }
            final long b = m().b();
            t().a(new Runnable(this) {
                final /* synthetic */ bt c;

                public void run() {
                    this.c.b(str, b);
                }
            });
        }
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

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
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
}
