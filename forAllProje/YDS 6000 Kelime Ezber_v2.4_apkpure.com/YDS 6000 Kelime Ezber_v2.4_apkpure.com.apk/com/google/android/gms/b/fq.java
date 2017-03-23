package com.google.android.gms.b;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class fq<T> implements Iterable<T> {
    private final fo<T, Void> a;

    private static class a<T> implements Iterator<T> {
        final Iterator<Entry<T, Void>> a;

        public a(Iterator<Entry<T, Void>> it) {
            this.a = it;
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public T next() {
            return ((Entry) this.a.next()).getKey();
        }

        public void remove() {
            this.a.remove();
        }
    }

    private fq(fo<T, Void> foVar) {
        this.a = foVar;
    }

    public fq(List<T> list, Comparator<T> comparator) {
        this.a = com.google.android.gms.b.fo.a.a(list, Collections.emptyMap(), com.google.android.gms.b.fo.a.a(), comparator);
    }

    public fq<T> a(T t) {
        fo c = this.a.c(t);
        return c == this.a ? this : new fq(c);
    }

    public fq<T> b(T t) {
        return new fq(this.a.a(t, null));
    }

    public T c(T t) {
        return this.a.d(t);
    }

    public Iterator<T> iterator() {
        return new a(this.a.iterator());
    }
}
