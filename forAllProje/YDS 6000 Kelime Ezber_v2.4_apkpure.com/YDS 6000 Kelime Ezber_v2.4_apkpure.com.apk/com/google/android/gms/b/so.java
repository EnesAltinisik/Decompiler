package com.google.android.gms.b;

import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.LinkedList;

@vz
class so {
    private final LinkedList<a> a = new LinkedList();
    private ns b;
    private final String c;
    private final int d;
    private boolean e;

    class a {
        l a;
        ns b;
        sk c;
        long d;
        boolean e;
        boolean f;
        final /* synthetic */ so g;

        a(so soVar, sj sjVar) {
            this.g = soVar;
            this.a = sjVar.b(soVar.c);
            this.c = new sk();
            this.c.a(this.a);
        }

        a(so soVar, sj sjVar, ns nsVar) {
            this(soVar, sjVar);
            this.b = nsVar;
        }

        void a() {
            if (!this.e) {
                this.f = this.a.a(sm.b(this.b != null ? this.b : this.g.b));
                this.e = true;
                this.d = v.k().a();
            }
        }
    }

    so(ns nsVar, String str, int i) {
        c.a((Object) nsVar);
        c.a((Object) str);
        this.b = nsVar;
        this.c = str;
        this.d = i;
    }

    ns a() {
        return this.b;
    }

    a a(ns nsVar) {
        if (nsVar != null) {
            this.b = nsVar;
        }
        return (a) this.a.remove();
    }

    void a(sj sjVar) {
        a aVar = new a(this, sjVar);
        this.a.add(aVar);
        aVar.a();
    }

    void a(sj sjVar, ns nsVar) {
        this.a.add(new a(this, sjVar, nsVar));
    }

    int b() {
        return this.d;
    }

    String c() {
        return this.c;
    }

    int d() {
        return this.a.size();
    }

    int e() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((a) it.next()).e ? i + 1 : i;
        }
        return i;
    }

    void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    void g() {
        this.e = true;
    }

    boolean h() {
        return this.e;
    }
}
