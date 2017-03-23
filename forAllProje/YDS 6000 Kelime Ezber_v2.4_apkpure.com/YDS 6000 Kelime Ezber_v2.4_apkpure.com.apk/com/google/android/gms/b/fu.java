package com.google.android.gms.b;

import com.google.android.gms.b.ft.a;

public class fu<K, V> extends fv<K, V> {
    fu(K k, V v) {
        super(k, v, fs.a(), fs.a());
    }

    fu(K k, V v, ft<K, V> ftVar, ft<K, V> ftVar2) {
        super(k, v, ftVar, ftVar2);
    }

    protected a a() {
        return a.RED;
    }

    protected fv<K, V> a(K k, V v, ft<K, V> ftVar, ft<K, V> ftVar2) {
        Object d;
        Object e;
        ft f;
        ft g;
        if (k == null) {
            d = d();
        }
        if (v == null) {
            e = e();
        }
        if (ftVar == null) {
            f = f();
        }
        if (ftVar2 == null) {
            g = g();
        }
        return new fu(d, e, f, g);
    }

    public boolean b() {
        return true;
    }
}
