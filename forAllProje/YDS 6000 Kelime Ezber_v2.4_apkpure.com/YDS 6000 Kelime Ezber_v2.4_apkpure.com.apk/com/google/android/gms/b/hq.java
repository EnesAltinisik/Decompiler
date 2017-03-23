package com.google.android.gms.b;

import java.util.Collections;
import java.util.List;

public class hq {
    private final gx a;
    private final hp b;

    public hq(gx gxVar, hp hpVar) {
        this.a = gxVar;
        this.b = hpVar;
    }

    public hq a(je jeVar) {
        return new hq(this.a.a(jeVar), this.b);
    }

    public jr a(gx gxVar) {
        return this.b.b(this.a.a(gxVar));
    }

    public jr a(gx gxVar, jr jrVar, jr jrVar2) {
        return this.b.a(this.a, gxVar, jrVar, jrVar2);
    }

    public jr a(je jeVar, ik ikVar) {
        return this.b.a(this.a, jeVar, ikVar);
    }

    public jr a(jr jrVar) {
        return a(jrVar, Collections.emptyList());
    }

    public jr a(jr jrVar, List<Long> list) {
        return a(jrVar, (List) list, false);
    }

    public jr a(jr jrVar, List<Long> list, boolean z) {
        return this.b.a(this.a, jrVar, (List) list, z);
    }

    public jr b(jr jrVar) {
        return this.b.a(this.a, jrVar);
    }
}
