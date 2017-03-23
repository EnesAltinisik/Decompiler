package com.google.android.gms.b;

import com.google.android.gms.b.hu.a;

public class ht extends hu {
    private final go a;

    public ht(hv hvVar, gx gxVar, go goVar) {
        super(a.Merge, hvVar, gxVar);
        this.a = goVar;
    }

    public go a() {
        return this.a;
    }

    public hu a(je jeVar) {
        if (!this.d.h()) {
            return this.d.d().equals(jeVar) ? new ht(this.c, this.d.e(), this.a) : null;
        } else {
            go d = this.a.d(new gx(jeVar));
            return d.e() ? null : d.b() != null ? new hw(this.c, gx.a(), d.b()) : new ht(this.c, gx.a(), d);
        }
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", new Object[]{c(), d(), this.a});
    }
}
