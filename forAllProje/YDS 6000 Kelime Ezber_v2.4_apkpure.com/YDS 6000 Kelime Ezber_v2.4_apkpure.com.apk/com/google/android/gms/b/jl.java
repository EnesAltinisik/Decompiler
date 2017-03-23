package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class jl implements Iterable<jq> {
    private static final fq<jq> a = new fq(Collections.emptyList(), null);
    private final jr b;
    private fq<jq> c;
    private final jk d;

    private jl(jr jrVar, jk jkVar) {
        this.d = jkVar;
        this.b = jrVar;
        this.c = null;
    }

    private jl(jr jrVar, jk jkVar, fq<jq> fqVar) {
        this.d = jkVar;
        this.b = jrVar;
        this.c = fqVar;
    }

    public static jl a(jr jrVar) {
        return new jl(jrVar, ju.b());
    }

    public static jl a(jr jrVar, jk jkVar) {
        return new jl(jrVar, jkVar);
    }

    private void b() {
        if (this.c != null) {
            return;
        }
        if (this.d.equals(jn.b())) {
            this.c = a;
            return;
        }
        List arrayList = new ArrayList();
        Object obj = null;
        for (jq jqVar : this.b) {
            obj = (obj != null || this.d.a(jqVar.b())) ? 1 : null;
            arrayList.add(new jq(jqVar.a(), jqVar.b()));
        }
        if (obj != null) {
            this.c = new fq(arrayList, this.d);
        } else {
            this.c = a;
        }
    }

    public je a(je jeVar, jr jrVar, jk jkVar) {
        if (this.d.equals(jn.b()) || this.d.equals(jkVar)) {
            b();
            if (this.c == a) {
                return this.b.b(jeVar);
            }
            jq jqVar = (jq) this.c.c(new jq(jeVar, jrVar));
            return jqVar != null ? jqVar.a() : null;
        } else {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
    }

    public jl a(je jeVar, jr jrVar) {
        jr a = this.b.a(jeVar, jrVar);
        if (this.c == a && !this.d.a(jrVar)) {
            return new jl(a, this.d, a);
        }
        if (this.c == null || this.c == a) {
            return new jl(a, this.d, null);
        }
        fq a2 = this.c.a(new jq(jeVar, this.b.c(jeVar)));
        if (!jrVar.b()) {
            a2 = a2.b(new jq(jeVar, jrVar));
        }
        return new jl(a, this.d, a2);
    }

    public jr a() {
        return this.b;
    }

    public Iterator<jq> iterator() {
        b();
        return this.c == a ? this.b.iterator() : this.c.iterator();
    }
}
