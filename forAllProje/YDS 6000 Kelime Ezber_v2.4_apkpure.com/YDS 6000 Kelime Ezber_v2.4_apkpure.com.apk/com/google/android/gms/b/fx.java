package com.google.android.gms.b;

import java.util.Comparator;

public class fx<A extends Comparable<A>> implements Comparator<A> {
    private static fx a = new fx();

    private fx() {
    }

    public static <T extends Comparable<T>> fx<T> a(Class<T> cls) {
        return a;
    }

    public int a(A a, A a2) {
        return a.compareTo(a2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Comparable) obj, (Comparable) obj2);
    }
}
