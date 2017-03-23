package com.google.android.gms.b;

import java.util.Map.Entry;

public class ii<T> {
    static final /* synthetic */ boolean a = (!ii.class.desiredAssertionStatus());
    private je b;
    private ii<T> c;
    private ij<T> d;

    public interface b<T> {
        void a(ii<T> iiVar);
    }

    public interface a<T> {
        boolean a(ii<T> iiVar);
    }

    public ii() {
        this(null, null, new ij());
    }

    public ii(je jeVar, ii<T> iiVar, ij<T> ijVar) {
        this.b = jeVar;
        this.c = iiVar;
        this.d = ijVar;
    }

    private void a(je jeVar, ii<T> iiVar) {
        boolean d = iiVar.d();
        boolean containsKey = this.d.a.containsKey(jeVar);
        if (d && containsKey) {
            this.d.a.remove(jeVar);
            e();
        } else if (!d && !containsKey) {
            this.d.a.put(jeVar, iiVar.d);
            e();
        }
    }

    private void e() {
        if (this.c != null) {
            this.c.a(this.b, this);
        }
    }

    public ii<T> a(gx gxVar) {
        ii<T> iiVar;
        je d = gxVar.d();
        while (d != null) {
            ii<T> iiVar2 = new ii(d, iiVar, iiVar.d.a.containsKey(d) ? (ij) iiVar.d.a.get(d) : new ij());
            gxVar = gxVar.e();
            d = gxVar.d();
            iiVar = iiVar2;
        }
        return iiVar;
    }

    public T a() {
        return this.d.b;
    }

    String a(String str) {
        String d = this.b == null ? "<anon>" : this.b.d();
        String valueOf = String.valueOf(this.d.a(String.valueOf(str).concat("\t")));
        return new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(d).length()) + String.valueOf(valueOf).length()).append(str).append(d).append("\n").append(valueOf).toString();
    }

    public void a(b<T> bVar) {
        a(bVar, false, false);
    }

    public void a(final b<T> bVar, boolean z, final boolean z2) {
        if (z && !z2) {
            bVar.a(this);
        }
        b(new b<T>(this) {
            public void a(ii<T> iiVar) {
                iiVar.a(bVar, true, z2);
            }
        });
        if (z && z2) {
            bVar.a(this);
        }
    }

    public void a(T t) {
        this.d.b = t;
        e();
    }

    public boolean a(a<T> aVar) {
        return a((a) aVar, false);
    }

    public boolean a(a<T> aVar, boolean z) {
        if (!z) {
            this = this.c;
        }
        while (this != null) {
            aVar.a(this);
            this = this.c;
        }
        return false;
    }

    public gx b() {
        if (this.c != null) {
            if (a || this.b != null) {
                return this.c.b().a(this.b);
            }
            throw new AssertionError();
        } else if (this.b == null) {
            return gx.a();
        } else {
            return new gx(this.b);
        }
    }

    public void b(b<T> bVar) {
        Object[] toArray = this.d.a.entrySet().toArray();
        for (Object obj : toArray) {
            Entry entry = (Entry) obj;
            bVar.a(new ii((je) entry.getKey(), this, (ij) entry.getValue()));
        }
    }

    public boolean c() {
        return !this.d.a.isEmpty();
    }

    public boolean d() {
        return this.d.b == null && this.d.a.isEmpty();
    }

    public String toString() {
        return a("");
    }
}
