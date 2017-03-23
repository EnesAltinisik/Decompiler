package com.google.android.gms.internal;

import java.util.Comparator;

public class zzaeb<A extends Comparable<A>> implements Comparator<A> {
    private static zzaeb zzbIG = new zzaeb();

    private zzaeb() {
    }

    public static <T extends Comparable<T>> zzaeb<T> zzi(Class<T> cls) {
        return zzbIG;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((Comparable) obj, (Comparable) obj2);
    }

    public int zza(A a, A a2) {
        return a.compareTo(a2);
    }
}
