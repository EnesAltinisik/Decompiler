package com.google.android.gms.b;

import com.google.android.gms.b.hu.a;

public class hw extends hu {
    private final jr a;

    public hw(hv hvVar, gx gxVar, jr jrVar) {
        super(a.Overwrite, hvVar, gxVar);
        this.a = jrVar;
    }

    public hu a(je jeVar) {
        return this.d.h() ? new hw(this.c, gx.a(), this.a.c(jeVar)) : new hw(this.c, this.d.e(), this.a);
    }

    public jr a() {
        return this.a;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[]{c(), d(), this.a});
    }
}
