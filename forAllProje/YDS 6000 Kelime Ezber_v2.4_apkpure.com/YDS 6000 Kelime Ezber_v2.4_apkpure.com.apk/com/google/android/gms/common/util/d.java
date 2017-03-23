package com.google.android.gms.common.util;

import android.support.v4.i.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d {
    public static <T> List<T> a(T t) {
        return Collections.singletonList(t);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map aVar = new a(6);
        aVar.put(k, v);
        aVar.put(k2, v2);
        aVar.put(k3, v3);
        aVar.put(k4, v4);
        aVar.put(k5, v5);
        aVar.put(k6, v6);
        return Collections.unmodifiableMap(aVar);
    }

    public static <K, V> Map<K, V> a(K[] kArr, V[] vArr) {
        int i = 0;
        b((Object[]) kArr, (Object[]) vArr);
        int length = kArr.length;
        switch (length) {
            case 0:
                return b();
            case 1:
                return b(kArr[0], vArr[0]);
            default:
                Map aVar = length <= 32 ? new a(length) : new HashMap(length, 1.0f);
                while (i < length) {
                    aVar.put(kArr[i], vArr[i]);
                    i++;
                }
                return Collections.unmodifiableMap(aVar);
        }
    }

    public static <T> Set<T> a() {
        return Collections.emptySet();
    }

    public static <T> Set<T> a(T t, T t2) {
        Set aVar = new a(2);
        aVar.add(t);
        aVar.add(t2);
        return Collections.unmodifiableSet(aVar);
    }

    public static <T> Set<T> a(T t, T t2, T t3) {
        Set aVar = new a(3);
        aVar.add(t);
        aVar.add(t2);
        aVar.add(t3);
        return Collections.unmodifiableSet(aVar);
    }

    public static <T> Set<T> a(T t, T t2, T t3, T t4) {
        Set aVar = new a(4);
        aVar.add(t);
        aVar.add(t2);
        aVar.add(t3);
        aVar.add(t4);
        return Collections.unmodifiableSet(aVar);
    }

    public static <T> Set<T> a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return a();
            case 1:
                return b(tArr[0]);
            case 2:
                return a(tArr[0], tArr[1]);
            case 3:
                return a(tArr[0], tArr[1], tArr[2]);
            case 4:
                return a(tArr[0], tArr[1], tArr[2], tArr[3]);
            default:
                return Collections.unmodifiableSet(tArr.length <= 32 ? new a(Arrays.asList(tArr)) : new HashSet(Arrays.asList(tArr)));
        }
    }

    public static <K, V> Map<K, V> b() {
        return Collections.emptyMap();
    }

    public static <K, V> Map<K, V> b(K k, V v) {
        return Collections.singletonMap(k, v);
    }

    public static <T> Set<T> b(T t) {
        return Collections.singleton(t);
    }

    private static <K, V> void b(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + vArr.length);
        }
    }
}
