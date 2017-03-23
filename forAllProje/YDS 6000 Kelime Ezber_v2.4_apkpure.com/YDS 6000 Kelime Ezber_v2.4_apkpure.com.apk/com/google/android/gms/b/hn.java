package com.google.android.gms.b;

import com.google.android.gms.b.ip.a;
import com.google.firebase.database.b;
import com.google.firebase.database.m;
import com.google.firebase.database.n;

public class hn extends gs {
    private final gz b;
    private final m c;
    private final it d;

    public hn(gz gzVar, m mVar, it itVar) {
        this.b = gzVar;
        this.c = mVar;
        this.d = itVar;
    }

    public in a(im imVar, it itVar) {
        return new in(a.VALUE, this, n.a(n.a(this.b, itVar.a()), imVar.c()), null);
    }

    public it a() {
        return this.d;
    }

    public void a(in inVar) {
        if (!c()) {
            this.c.a(inVar.c());
        }
    }

    public void a(b bVar) {
        this.c.a(bVar);
    }

    public boolean a(gs gsVar) {
        return (gsVar instanceof hn) && ((hn) gsVar).c.equals(this.c);
    }

    public boolean a(a aVar) {
        return aVar == a.VALUE;
    }

    public boolean equals(Object obj) {
        return (obj instanceof hn) && ((hn) obj).c.equals(this.c) && ((hn) obj).b.equals(this.b) && ((hn) obj).d.equals(this.d);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
