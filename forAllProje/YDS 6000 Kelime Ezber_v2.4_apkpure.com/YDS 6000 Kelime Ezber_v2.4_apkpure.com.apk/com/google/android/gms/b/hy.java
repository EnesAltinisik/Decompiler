package com.google.android.gms.b;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class hy implements ib {
    static final /* synthetic */ boolean a = (!hy.class.desiredAssertionStatus());
    private final ic b;
    private final if c;
    private final jb d;
    private final hx e;
    private long f;

    public hy(gq gqVar, ic icVar, hx hxVar) {
        this(gqVar, icVar, hxVar, new km());
    }

    public hy(gq gqVar, ic icVar, hx hxVar, kl klVar) {
        this.f = 0;
        this.b = icVar;
        this.d = gqVar.a("Persistence");
        this.c = new if(this.b, this.d, klVar);
        this.e = hxVar;
    }

    private void b() {
        this.f++;
        if (this.e.a(this.f)) {
            if (this.d.a()) {
                this.d.a("Reached prune check threshold.", new Object[0]);
            }
            this.f = 0;
            int i = 1;
            long b = this.b.b();
            if (this.d.a()) {
                this.d.a("Cache size: " + b, new Object[0]);
            }
            while (i != 0 && this.e.a(r2, this.c.a())) {
                id a = this.c.a(this.e);
                if (a.a()) {
                    this.b.a(gx.a(), a);
                } else {
                    i = 0;
                }
                b = this.b.b();
                if (this.d.a()) {
                    this.d.a("Cache size after prune: " + b, new Object[0]);
                }
            }
        }
    }

    public <T> T a(Callable<T> callable) {
        this.b.d();
        try {
            T call = callable.call();
            this.b.f();
            this.b.e();
            return call;
        } catch (Throwable th) {
            this.b.e();
        }
    }

    public List<hl> a() {
        return this.b.a();
    }

    public void a(long j) {
        this.b.a(j);
    }

    public void a(gx gxVar, go goVar) {
        Iterator it = goVar.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a(gxVar.a((gx) entry.getKey()), (jr) entry.getValue());
        }
    }

    public void a(gx gxVar, go goVar, long j) {
        this.b.a(gxVar, goVar, j);
    }

    public void a(gx gxVar, jr jrVar) {
        if (!this.c.c(gxVar)) {
            this.b.a(gxVar, jrVar);
            this.c.b(gxVar);
        }
    }

    public void a(gx gxVar, jr jrVar, long j) {
        this.b.a(gxVar, jrVar, j);
    }

    public void a(it itVar) {
        this.c.c(itVar);
    }

    public void a(it itVar, jr jrVar) {
        if (itVar.d()) {
            this.b.a(itVar.a(), jrVar);
        } else {
            this.b.b(itVar.a(), jrVar);
        }
        b(itVar);
        b();
    }

    public void a(it itVar, Set<je> set, Set<je> set2) {
        if (a || !itVar.d()) {
            ie a = this.c.a(itVar);
            if (a || (a != null && a.e)) {
                this.b.a(a.a, (Set) set, (Set) set2);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public void b(gx gxVar, go goVar) {
        this.b.a(gxVar, goVar);
        b();
    }

    public void b(it itVar) {
        if (itVar.d()) {
            this.c.a(itVar.a());
        } else {
            this.c.d(itVar);
        }
    }
}
