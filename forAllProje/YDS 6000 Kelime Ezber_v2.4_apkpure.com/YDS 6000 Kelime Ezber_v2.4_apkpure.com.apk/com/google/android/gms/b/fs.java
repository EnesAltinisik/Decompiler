package com.google.android.gms.b;

import com.google.android.gms.b.ft.a;
import com.google.android.gms.b.ft.b;
import java.util.Comparator;

public class fs<K, V> implements ft<K, V> {
    private static final fs a = new fs();

    private fs() {
    }

    public static <K, V> fs<K, V> a() {
        return a;
    }

    public ft<K, V> a(K k, V v, a aVar, ft<K, V> ftVar, ft<K, V> ftVar2) {
        return this;
    }

    public ft<K, V> a(K k, V v, Comparator<K> comparator) {
        return new fu(k, v);
    }

    public ft<K, V> a(K k, Comparator<K> comparator) {
        return this;
    }

    public void a(b<K, V> bVar) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public K d() {
        return null;
    }

    public V e() {
        return null;
    }

    public ft<K, V> f() {
        return this;
    }

    public ft<K, V> g() {
        return this;
    }

    public ft<K, V> h() {
        return this;
    }

    public int i() {
        return 0;
    }
}
