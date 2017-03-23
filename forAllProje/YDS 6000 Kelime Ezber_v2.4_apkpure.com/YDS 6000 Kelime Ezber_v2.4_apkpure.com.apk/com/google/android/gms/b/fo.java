package com.google.android.gms.b;

import com.google.android.gms.b.ft.b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class fo<K, V> implements Iterable<Entry<K, V>> {

    public static class a {
        private static final a a = new a() {
            public Object a(Object obj) {
                return obj;
            }
        };

        public interface a<C, D> {
            D a(C c);
        }

        public static <A> a<A, A> a() {
            return a;
        }

        public static <K, V> fo<K, V> a(Comparator<K> comparator) {
            return new fm(comparator);
        }

        public static <A, B, C> fo<A, C> a(List<A> list, Map<B, C> map, a<A, B> aVar, Comparator<A> comparator) {
            return list.size() < 25 ? fm.a(list, map, aVar, comparator) : fw.a(list, map, aVar, comparator);
        }

        public static <A, B> fo<A, B> a(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? fm.a((Map) map, (Comparator) comparator) : fw.a((Map) map, (Comparator) comparator);
        }
    }

    public abstract int a();

    public abstract fo<K, V> a(K k, V v);

    public abstract void a(b<K, V> bVar);

    public abstract boolean a(K k);

    public abstract V b(K k);

    public abstract boolean b();

    public abstract fo<K, V> c(K k);

    public abstract Comparator<K> c();

    public abstract K d(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        if (!c().equals(foVar.c())) {
            return false;
        }
        if (a() != foVar.a()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = foVar.iterator();
        while (it.hasNext()) {
            if (!((Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = c().hashCode();
        Iterator it = iterator();
        int i = hashCode;
        while (it.hasNext()) {
            i = ((Entry) it.next()).hashCode() + (i * 31);
        }
        return i;
    }

    public abstract Iterator<Entry<K, V>> iterator();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("{");
        Iterator it = iterator();
        Object obj = 1;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append("(");
            stringBuilder.append(entry.getKey());
            stringBuilder.append("=>");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(")");
        }
        stringBuilder.append("};");
        return stringBuilder.toString();
    }
}
