package com.google.android.gms.b;

import com.google.android.gms.b.ft.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fw<K, V> extends fo<K, V> {
    private ft<K, V> a;
    private Comparator<K> b;

    private static class a<A, B, C> {
        private final List<A> a;
        private final Map<B, C> b;
        private final com.google.android.gms.b.fo.a.a<A, B> c;
        private fv<A, C> d;
        private fv<A, C> e;

        static class a implements Iterable<b> {
            private long a;
            private final int b;

            public a(int i) {
                int i2 = i + 1;
                this.b = (int) Math.floor(Math.log((double) i2) / Math.log(2.0d));
                this.a = ((long) i2) & (((long) Math.pow(2.0d, (double) this.b)) - 1);
            }

            public Iterator<b> iterator() {
                return new Iterator<b>(this) {
                    final /* synthetic */ a a;
                    private int b = (this.a.b - 1);

                    {
                        this.a = r2;
                    }

                    public b a() {
                        boolean z = true;
                        long b = this.a.a & ((long) (1 << this.b));
                        b bVar = new b();
                        if (b != 0) {
                            z = false;
                        }
                        bVar.a = z;
                        bVar.b = (int) Math.pow(2.0d, (double) this.b);
                        this.b--;
                        return bVar;
                    }

                    public boolean hasNext() {
                        return this.b >= 0;
                    }

                    public /* synthetic */ Object next() {
                        return a();
                    }

                    public void remove() {
                    }
                };
            }
        }

        static class b {
            public boolean a;
            public int b;

            b() {
            }
        }

        private a(List<A> list, Map<B, C> map, com.google.android.gms.b.fo.a.a<A, B> aVar) {
            this.a = list;
            this.b = map;
            this.c = aVar;
        }

        private ft<A, C> a(int i, int i2) {
            if (i2 == 0) {
                return fs.a();
            }
            if (i2 == 1) {
                Object obj = this.a.get(i);
                return new fr(obj, a(obj), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            ft a = a(i, i3);
            ft a2 = a(i4 + 1, i3);
            obj = this.a.get(i4);
            return new fr(obj, a(obj), a, a2);
        }

        public static <A, B, C> fw<A, C> a(List<A> list, Map<B, C> map, com.google.android.gms.b.fo.a.a<A, B> aVar, Comparator<A> comparator) {
            a aVar2 = new a(list, map, aVar);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                int i;
                b bVar = (b) it.next();
                size -= bVar.b;
                if (bVar.a) {
                    aVar2.a(com.google.android.gms.b.ft.a.BLACK, bVar.b, size);
                    i = size;
                } else {
                    aVar2.a(com.google.android.gms.b.ft.a.BLACK, bVar.b, size);
                    size -= bVar.b;
                    aVar2.a(com.google.android.gms.b.ft.a.RED, bVar.b, size);
                    i = size;
                }
                size = i;
            }
            return new fw(aVar2.d == null ? fs.a() : aVar2.d, comparator);
        }

        private C a(A a) {
            return this.b.get(this.c.a(a));
        }

        private void a(com.google.android.gms.b.ft.a aVar, int i, int i2) {
            ft a = a(i2 + 1, i - 1);
            Object obj = this.a.get(i2);
            ft fuVar = aVar == com.google.android.gms.b.ft.a.RED ? new fu(obj, a(obj), null, a) : new fr(obj, a(obj), null, a);
            if (this.d == null) {
                this.d = fuVar;
                this.e = fuVar;
                return;
            }
            this.e.a(fuVar);
            this.e = fuVar;
        }
    }

    private fw(ft<K, V> ftVar, Comparator<K> comparator) {
        this.a = ftVar;
        this.b = comparator;
    }

    public static <A, B, C> fw<A, C> a(List<A> list, Map<B, C> map, com.google.android.gms.b.fo.a.a<A, B> aVar, Comparator<A> comparator) {
        return a.a(list, map, aVar, comparator);
    }

    public static <A, B> fw<A, B> a(Map<A, B> map, Comparator<A> comparator) {
        return a.a(new ArrayList(map.keySet()), map, com.google.android.gms.b.fo.a.a(), comparator);
    }

    private ft<K, V> e(K k) {
        ft<K, V> ftVar = this.a;
        while (!ftVar.c()) {
            int compare = this.b.compare(k, ftVar.d());
            if (compare < 0) {
                ftVar = ftVar.f();
            } else if (compare == 0) {
                return ftVar;
            } else {
                ftVar = ftVar.g();
            }
        }
        return null;
    }

    public int a() {
        return this.a.i();
    }

    public fo<K, V> a(K k, V v) {
        return new fw(this.a.a(k, v, this.b).a(null, null, com.google.android.gms.b.ft.a.BLACK, null, null), this.b);
    }

    public void a(b<K, V> bVar) {
        this.a.a(bVar);
    }

    public boolean a(K k) {
        return e(k) != null;
    }

    public V b(K k) {
        ft e = e(k);
        return e != null ? e.e() : null;
    }

    public boolean b() {
        return this.a.c();
    }

    public fo<K, V> c(K k) {
        if (!a((Object) k)) {
            return this;
        }
        return new fw(this.a.a(k, this.b).a(null, null, com.google.android.gms.b.ft.a.BLACK, null, null), this.b);
    }

    public Comparator<K> c() {
        return this.b;
    }

    public K d(K k) {
        ft ftVar = this.a;
        ft ftVar2 = null;
        while (!ftVar.c()) {
            int compare = this.b.compare(k, ftVar.d());
            if (compare == 0) {
                if (ftVar.f().c()) {
                    return ftVar2 != null ? ftVar2.d() : null;
                } else {
                    ftVar2 = ftVar.f();
                    while (!ftVar2.g().c()) {
                        ftVar2 = ftVar2.g();
                    }
                    return ftVar2.d();
                }
            } else if (compare < 0) {
                ftVar = ftVar.f();
            } else {
                ft ftVar3 = ftVar;
                ftVar = ftVar.g();
                ftVar2 = ftVar3;
            }
        }
        String valueOf = String.valueOf(k);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Couldn't find predecessor key of non-present key: ").append(valueOf).toString());
    }

    public Iterator<Entry<K, V>> iterator() {
        return new fp(this.a, null, this.b, false);
    }
}
