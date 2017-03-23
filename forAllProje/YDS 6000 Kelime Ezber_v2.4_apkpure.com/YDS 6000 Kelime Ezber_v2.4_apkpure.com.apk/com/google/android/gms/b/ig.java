package com.google.android.gms.b;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class ig<T> implements Iterable<Entry<gx, T>> {
    private static final fo c = com.google.android.gms.b.fo.a.a(fx.a(je.class));
    private static final ig d = new ig(null, c);
    private final T a;
    private final fo<je, ig<T>> b;

    public interface a<T, R> {
        R a(gx gxVar, T t, R r);
    }

    public ig(T t) {
        this(t, c);
    }

    public ig(T t, fo<je, ig<T>> foVar) {
        this.a = t;
        this.b = foVar;
    }

    public static <V> ig<V> a() {
        return d;
    }

    private <R> R a(gx gxVar, a<? super T, R> aVar, R r) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            r = ((ig) entry.getValue()).a(gxVar.a((je) entry.getKey()), aVar, r);
        }
        return this.a != null ? aVar.a(gxVar, this.a, r) : r;
    }

    public gx a(gx gxVar) {
        return a(gxVar, ih.d);
    }

    public gx a(gx gxVar, ih<? super T> ihVar) {
        if (this.a != null && ihVar.a(this.a)) {
            return gx.a();
        }
        if (gxVar.h()) {
            return null;
        }
        ig igVar = (ig) this.b.b(gxVar.d());
        if (igVar == null) {
            return null;
        }
        gx a = igVar.a(gxVar.e(), (ih) ihVar);
        if (a == null) {
            return null;
        }
        return new gx(r2).a(a);
    }

    public ig<T> a(gx gxVar, ig<T> igVar) {
        if (gxVar.h()) {
            return igVar;
        }
        je d = gxVar.d();
        ig igVar2 = (ig) this.b.b(d);
        if (igVar2 == null) {
            igVar2 = a();
        }
        igVar2 = igVar2.a(gxVar.e(), (ig) igVar);
        return new ig(this.a, igVar2.d() ? this.b.c(d) : this.b.a(d, igVar2));
    }

    public ig<T> a(gx gxVar, T t) {
        if (gxVar.h()) {
            return new ig(t, this.b);
        }
        je d = gxVar.d();
        ig igVar = (ig) this.b.b(d);
        if (igVar == null) {
            igVar = a();
        }
        return new ig(this.a, this.b.a(d, igVar.a(gxVar.e(), (Object) t)));
    }

    public ig<T> a(je jeVar) {
        ig<T> igVar = (ig) this.b.b(jeVar);
        return igVar != null ? igVar : a();
    }

    public <R> R a(R r, a<? super T, R> aVar) {
        return a(gx.a(), aVar, r);
    }

    public void a(a<T, Void> aVar) {
        a(gx.a(), aVar, null);
    }

    public boolean a(ih<? super T> ihVar) {
        if (this.a != null && ihVar.a(this.a)) {
            return true;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ig) ((Entry) it.next()).getValue()).a((ih) ihVar)) {
                return true;
            }
        }
        return false;
    }

    public T b() {
        return this.a;
    }

    public T b(gx gxVar) {
        return c(gxVar, ih.d);
    }

    public T b(gx gxVar, ih<? super T> ihVar) {
        if (this.a != null && ihVar.a(this.a)) {
            return this.a;
        }
        Iterator it = gxVar.iterator();
        while (it.hasNext()) {
            ig igVar = (ig) this.b.b((je) it.next());
            if (igVar == null) {
                return null;
            }
            if (igVar.a != null && ihVar.a(igVar.a)) {
                return igVar.a;
            }
            this = igVar;
        }
        return null;
    }

    public fo<je, ig<T>> c() {
        return this.b;
    }

    public ig<T> c(gx gxVar) {
        if (gxVar.h()) {
            return this;
        }
        ig igVar = (ig) this.b.b(gxVar.d());
        return igVar != null ? igVar.c(gxVar.e()) : a();
    }

    public T c(gx gxVar, ih<? super T> ihVar) {
        T t = (this.a == null || !ihVar.a(this.a)) ? null : this.a;
        Iterator it = gxVar.iterator();
        T t2 = t;
        while (it.hasNext()) {
            ig igVar = (ig) this.b.b((je) it.next());
            if (igVar == null) {
                break;
            }
            if (igVar.a != null && ihVar.a(igVar.a)) {
                t2 = igVar.a;
            }
            this = igVar;
        }
        return t2;
    }

    public ig<T> d(gx gxVar) {
        if (gxVar.h()) {
            return this.b.b() ? a() : new ig(null, this.b);
        } else {
            je d = gxVar.d();
            ig igVar = (ig) this.b.b(d);
            if (igVar == null) {
                return this;
            }
            igVar = igVar.d(gxVar.e());
            fo c = igVar.d() ? this.b.c(d) : this.b.a(d, igVar);
            return (this.a == null && c.b()) ? a() : new ig(this.a, c);
        }
    }

    public boolean d() {
        return this.a == null && this.b.b();
    }

    public T e(gx gxVar) {
        if (gxVar.h()) {
            return this.a;
        }
        ig igVar = (ig) this.b.b(gxVar.d());
        return igVar != null ? igVar.e(gxVar.e()) : null;
    }

    public Collection<T> e() {
        final Collection arrayList = new ArrayList();
        a(new a<T, Void>(this) {
            public Void a(gx gxVar, T t, Void voidR) {
                arrayList.add(t);
                return null;
            }
        });
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ig igVar = (ig) obj;
        if (this.b == null ? igVar.b != null : !this.b.equals(igVar.b)) {
            return false;
        }
        if (this.a != null) {
            if (this.a.equals(igVar.a)) {
                return true;
            }
        } else if (igVar.a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.a != null ? this.a.hashCode() : 0) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }

    public Iterator<Entry<gx, T>> iterator() {
        final List arrayList = new ArrayList();
        a(new a<T, Void>(this) {
            public Void a(gx gxVar, T t, Void voidR) {
                arrayList.add(new SimpleImmutableEntry(gxVar, t));
                return null;
            }
        });
        return arrayList.iterator();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImmutableTree { value=");
        stringBuilder.append(b());
        stringBuilder.append(", children={");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            stringBuilder.append(((je) entry.getKey()).d());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("} }");
        return stringBuilder.toString();
    }
}
