package com.google.android.gms.b;

import com.google.android.gms.b.ft.a;
import com.google.android.gms.b.ft.b;
import java.util.Comparator;

public abstract class fv<K, V> implements ft<K, V> {
    private final K a;
    private final V b;
    private ft<K, V> c;
    private final ft<K, V> d;

    fv(K k, V v, ft<K, V> ftVar, ft<K, V> ftVar2) {
        ft a;
        ft a2;
        this.a = k;
        this.b = v;
        if (ftVar == null) {
            a = fs.a();
        }
        this.c = a;
        if (ftVar2 == null) {
            a2 = fs.a();
        }
        this.d = a2;
    }

    private static a b(ft ftVar) {
        return ftVar.b() ? a.BLACK : a.RED;
    }

    private ft<K, V> j() {
        if (this.c.c()) {
            return fs.a();
        }
        if (!(f().b() || f().f().b())) {
            this = k();
        }
        return a(null, null, ((fv) this.c).j(), null).m();
    }

    private fv<K, V> k() {
        fv<K, V> p = p();
        return p.g().f().b() ? p.a(null, null, null, ((fv) p.g()).o()).n().p() : p;
    }

    private fv<K, V> l() {
        fv<K, V> p = p();
        return p.f().f().b() ? p.o().p() : p;
    }

    private fv<K, V> m() {
        fv<K, V> n;
        if (this.d.b() && !this.c.b()) {
            n = n();
        }
        if (n.c.b() && ((fv) n.c).c.b()) {
            n = n.o();
        }
        return (n.c.b() && n.d.b()) ? n.p() : n;
    }

    private fv<K, V> n() {
        return (fv) this.d.a(null, null, a(), (fv) a(null, null, a.RED, null, ((fv) this.d).c), null);
    }

    private fv<K, V> o() {
        return (fv) this.c.a(null, null, a(), null, (fv) a(null, null, a.RED, ((fv) this.c).d, null));
    }

    private fv<K, V> p() {
        return (fv) a(null, null, b(this), this.c.a(null, null, b(this.c), null, null), this.d.a(null, null, b(this.d), null, null));
    }

    protected abstract a a();

    public /* synthetic */ ft a(Object obj, Object obj2, a aVar, ft ftVar, ft ftVar2) {
        return b(obj, obj2, aVar, ftVar, ftVar2);
    }

    public ft<K, V> a(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.a);
        fv a = compare < 0 ? a(null, null, this.c.a(k, v, comparator), null) : compare == 0 ? a(k, v, null, null) : a(null, null, null, this.d.a(k, v, comparator));
        return a.m();
    }

    public ft<K, V> a(K k, Comparator<K> comparator) {
        fv a;
        if (comparator.compare(k, this.a) < 0) {
            if (!(this.c.c() || this.c.b() || ((fv) this.c).c.b())) {
                this = k();
            }
            a = a(null, null, this.c.a(k, comparator), null);
        } else {
            if (this.c.b()) {
                this = o();
            }
            if (!(this.d.c() || this.d.b() || ((fv) this.d).c.b())) {
                this = l();
            }
            if (comparator.compare(k, this.a) == 0) {
                if (this.d.c()) {
                    return fs.a();
                }
                ft h = this.d.h();
                this = a(h.d(), h.e(), null, ((fv) this.d).j());
            }
            a = a(null, null, null, this.d.a(k, comparator));
        }
        return a.m();
    }

    protected abstract fv<K, V> a(K k, V v, ft<K, V> ftVar, ft<K, V> ftVar2);

    public void a(b<K, V> bVar) {
        this.c.a(bVar);
        bVar.a(this.a, this.b);
        this.d.a(bVar);
    }

    void a(ft<K, V> ftVar) {
        this.c = ftVar;
    }

    public fv<K, V> b(K k, V v, a aVar, ft<K, V> ftVar, ft<K, V> ftVar2) {
        Object obj;
        Object obj2;
        ft ftVar3;
        ft ftVar4;
        if (k == null) {
            obj = this.a;
        }
        if (v == null) {
            obj2 = this.b;
        }
        if (ftVar == null) {
            ftVar3 = this.c;
        }
        if (ftVar2 == null) {
            ftVar4 = this.d;
        }
        return aVar == a.RED ? new fu(obj, obj2, ftVar3, ftVar4) : new fr(obj, obj2, ftVar3, ftVar4);
    }

    public boolean c() {
        return false;
    }

    public K d() {
        return this.a;
    }

    public V e() {
        return this.b;
    }

    public ft<K, V> f() {
        return this.c;
    }

    public ft<K, V> g() {
        return this.d;
    }

    public ft<K, V> h() {
        return this.c.c() ? this : this.c.h();
    }

    public int i() {
        return (this.c.i() + 1) + this.d.i();
    }
}
