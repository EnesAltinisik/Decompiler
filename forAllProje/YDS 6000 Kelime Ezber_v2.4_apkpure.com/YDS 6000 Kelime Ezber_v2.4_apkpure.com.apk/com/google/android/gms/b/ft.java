package com.google.android.gms.b;

import java.util.Comparator;

public interface ft<K, V> {

    public enum a {
        RED,
        BLACK
    }

    public static abstract class b<K, V> {
        public abstract void a(K k, V v);
    }

    ft<K, V> a(K k, V v, a aVar, ft<K, V> ftVar, ft<K, V> ftVar2);

    ft<K, V> a(K k, V v, Comparator<K> comparator);

    ft<K, V> a(K k, Comparator<K> comparator);

    void a(b<K, V> bVar);

    boolean b();

    boolean c();

    K d();

    V e();

    ft<K, V> f();

    ft<K, V> g();

    ft<K, V> h();

    int i();
}
