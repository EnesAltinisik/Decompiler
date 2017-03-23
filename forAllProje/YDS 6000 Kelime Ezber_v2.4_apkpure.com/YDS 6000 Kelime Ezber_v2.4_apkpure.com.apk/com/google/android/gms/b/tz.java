package com.google.android.gms.b;

import android.location.Location;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.mediation.l;
import java.util.Date;
import java.util.List;
import java.util.Set;

@vz
public final class tz implements l {
    private final Date a;
    private final int b;
    private final Set<String> c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final qr g;
    private final List<String> h;
    private final boolean i;

    public tz(Date date, int i, Set<String> set, Location location, boolean z, int i2, qr qrVar, List<String> list, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = qrVar;
        this.h = list;
        this.i = z2;
    }

    public Date a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public Set<String> c() {
        return this.c;
    }

    public Location d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.i;
    }

    public b h() {
        if (this.g == null) {
            return null;
        }
        a b = new a().a(this.g.b).a(this.g.c).b(this.g.d);
        if (this.g.a >= 2) {
            b.b(this.g.e);
        }
        if (this.g.a >= 3 && this.g.f != null) {
            b.a(new k.a().a(this.g.f.b).a());
        }
        return b.a();
    }

    public boolean i() {
        return this.h != null && this.h.contains("2");
    }

    public boolean j() {
        return this.h != null && this.h.contains("1");
    }
}
