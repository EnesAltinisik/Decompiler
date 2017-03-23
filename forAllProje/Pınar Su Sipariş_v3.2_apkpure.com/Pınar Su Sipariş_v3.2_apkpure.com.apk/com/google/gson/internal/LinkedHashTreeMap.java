package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = (!LinkedHashTreeMap.class.desiredAssertionStatus());
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Comparable) obj, (Comparable) obj2);
        }

        public int a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private c entrySet;
    final f<K, V> header;
    private d keySet;
    int modCount;
    int size;
    f<K, V>[] table;
    int threshold;

    static final class a<K, V> {
        private f<K, V> a;
        private int b;
        private int c;
        private int d;

        a() {
        }

        void a(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }

        void a(f<K, V> fVar) {
            fVar.c = null;
            fVar.a = null;
            fVar.b = null;
            fVar.i = 1;
            if (this.b > 0 && (this.d & 1) == 0) {
                this.d++;
                this.b--;
                this.c++;
            }
            fVar.a = this.a;
            this.a = fVar;
            this.d++;
            if (this.b > 0 && (this.d & 1) == 0) {
                this.d++;
                this.b--;
                this.c++;
            }
            for (int i = 4; (this.d & (i - 1)) == i - 1; i *= 2) {
                f fVar2;
                f fVar3;
                if (this.c == 0) {
                    fVar2 = this.a;
                    fVar3 = fVar2.a;
                    f fVar4 = fVar3.a;
                    fVar3.a = fVar4.a;
                    this.a = fVar3;
                    fVar3.b = fVar4;
                    fVar3.c = fVar2;
                    fVar3.i = fVar2.i + 1;
                    fVar4.a = fVar3;
                    fVar2.a = fVar3;
                } else if (this.c == 1) {
                    fVar2 = this.a;
                    fVar3 = fVar2.a;
                    this.a = fVar3;
                    fVar3.c = fVar2;
                    fVar3.i = fVar2.i + 1;
                    fVar2.a = fVar3;
                    this.c = 0;
                } else if (this.c == 2) {
                    this.c = 0;
                }
            }
        }

        f<K, V> a() {
            f<K, V> fVar = this.a;
            if (fVar.a == null) {
                return fVar;
            }
            throw new IllegalStateException();
        }
    }

    static class b<K, V> {
        private f<K, V> a;

        b() {
        }

        void a(f<K, V> fVar) {
            f fVar2 = null;
            while (fVar != null) {
                fVar.a = fVar2;
                f<K, V> fVar3 = fVar;
                fVar = fVar.b;
            }
            this.a = fVar2;
        }

        public f<K, V> a() {
            f<K, V> fVar = this.a;
            if (fVar == null) {
                return null;
            }
            f fVar2 = fVar.a;
            fVar.a = null;
            for (f fVar3 = fVar.c; fVar3 != null; fVar3 = fVar3.b) {
                fVar3.a = fVar2;
                fVar2 = fVar3;
            }
            this.a = fVar2;
            return fVar;
        }
    }

    private abstract class e<T> implements Iterator<T> {
        f<K, V> b = this.e.header.d;
        f<K, V> c = null;
        int d = this.e.modCount;
        final /* synthetic */ LinkedHashTreeMap e;

        e(LinkedHashTreeMap linkedHashTreeMap) {
            this.e = linkedHashTreeMap;
        }

        public final boolean hasNext() {
            return this.b != this.e.header;
        }

        final f<K, V> b() {
            f<K, V> fVar = this.b;
            if (fVar == this.e.header) {
                throw new NoSuchElementException();
            } else if (this.e.modCount != this.d) {
                throw new ConcurrentModificationException();
            } else {
                this.b = fVar.d;
                this.c = fVar;
                return fVar;
            }
        }

        public final void remove() {
            if (this.c == null) {
                throw new IllegalStateException();
            }
            this.e.removeInternal(this.c, true);
            this.c = null;
            this.d = this.e.modCount;
        }
    }

    final class c extends AbstractSet<Entry<K, V>> {
        final /* synthetic */ LinkedHashTreeMap a;

        c(LinkedHashTreeMap linkedHashTreeMap) {
            this.a = linkedHashTreeMap;
        }

        public int size() {
            return this.a.size;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new e<Entry<K, V>>(this) {
                final /* synthetic */ c a;

                {
                    this.a = r2;
                    LinkedHashTreeMap linkedHashTreeMap = r2.a;
                }

                public /* synthetic */ Object next() {
                    return a();
                }

                public Entry<K, V> a() {
                    return b();
                }
            };
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && this.a.findByEntry((Entry) obj) != null;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            f findByEntry = this.a.findByEntry((Entry) obj);
            if (findByEntry == null) {
                return false;
            }
            this.a.removeInternal(findByEntry, true);
            return true;
        }

        public void clear() {
            this.a.clear();
        }
    }

    final class d extends AbstractSet<K> {
        final /* synthetic */ LinkedHashTreeMap a;

        d(LinkedHashTreeMap linkedHashTreeMap) {
            this.a = linkedHashTreeMap;
        }

        public int size() {
            return this.a.size;
        }

        public Iterator<K> iterator() {
            return new e<K>(this) {
                final /* synthetic */ d a;

                {
                    this.a = r2;
                    LinkedHashTreeMap linkedHashTreeMap = r2.a;
                }

                public K next() {
                    return b().f;
                }
            };
        }

        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.a.removeInternalByKey(obj) != null;
        }

        public void clear() {
            this.a.clear();
        }
    }

    static final class f<K, V> implements Entry<K, V> {
        f<K, V> a;
        f<K, V> b;
        f<K, V> c;
        f<K, V> d;
        f<K, V> e;
        final K f;
        final int g;
        V h;
        int i;

        f() {
            this.f = null;
            this.g = -1;
            this.e = this;
            this.d = this;
        }

        f(f<K, V> fVar, K k, int i, f<K, V> fVar2, f<K, V> fVar3) {
            this.a = fVar;
            this.f = k;
            this.g = i;
            this.i = 1;
            this.d = fVar2;
            this.e = fVar3;
            fVar3.d = this;
            fVar2.e = this;
        }

        public K getKey() {
            return this.f;
        }

        public V getValue() {
            return this.h;
        }

        public V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f.equals(entry.getKey())) {
                return false;
            }
            if (this.h == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.h.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f == null ? 0 : this.f.hashCode();
            if (this.h != null) {
                i = this.h.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            return this.f + "=" + this.h;
        }

        public f<K, V> a() {
            f<K, V> fVar;
            for (f<K, V> fVar2 = this.b; fVar2 != null; fVar2 = fVar2.b) {
                fVar = fVar2;
            }
            return fVar;
        }

        public f<K, V> b() {
            f<K, V> fVar;
            for (f<K, V> fVar2 = this.c; fVar2 != null; fVar2 = fVar2.c) {
                fVar = fVar2;
            }
            return fVar;
        }
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        this.comparator = comparator;
        this.header = new f();
        this.table = new f[16];
        this.threshold = (this.table.length / 2) + (this.table.length / 4);
    }

    public int size() {
        return this.size;
    }

    public V get(Object obj) {
        f findByObject = findByObject(obj);
        return findByObject != null ? findByObject.h : null;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        f find = find(k, true);
        V v2 = find.h;
        find.h = v;
        return v2;
    }

    public void clear() {
        Arrays.fill(this.table, null);
        this.size = 0;
        this.modCount++;
        f fVar = this.header;
        f fVar2 = fVar.d;
        while (fVar2 != fVar) {
            f fVar3 = fVar2.d;
            fVar2.e = null;
            fVar2.d = null;
            fVar2 = fVar3;
        }
        fVar.e = fVar;
        fVar.d = fVar;
    }

    public V remove(Object obj) {
        f removeInternalByKey = removeInternalByKey(obj);
        return removeInternalByKey != null ? removeInternalByKey.h : null;
    }

    f<K, V> find(K k, boolean z) {
        int i;
        Comparator comparator = this.comparator;
        f[] fVarArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = secondaryHash & (fVarArr.length - 1);
        f fVar = fVarArr[length];
        if (fVar != null) {
            int compareTo;
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compareTo = comparable.compareTo(fVar.f);
                } else {
                    compareTo = comparator.compare(k, fVar.f);
                }
                if (compareTo == 0) {
                    return fVar;
                }
                f fVar2 = compareTo < 0 ? fVar.b : fVar.c;
                if (fVar2 == null) {
                    break;
                }
                fVar = fVar2;
            }
            i = compareTo;
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        f<K, V> fVar3;
        f fVar4 = this.header;
        if (fVar != null) {
            fVar3 = new f(fVar, k, secondaryHash, fVar4, fVar4.e);
            if (i < 0) {
                fVar.b = fVar3;
            } else {
                fVar.c = fVar3;
            }
            rebalance(fVar, true);
        } else if (comparator != NATURAL_ORDER || (k instanceof Comparable)) {
            fVar3 = new f(fVar, k, secondaryHash, fVar4, fVar4.e);
            fVarArr[length] = fVar3;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return fVar3;
    }

    f<K, V> findByObject(Object obj) {
        f<K, V> fVar = null;
        if (obj != null) {
            try {
                fVar = find(obj, false);
            } catch (ClassCastException e) {
            }
        }
        return fVar;
    }

    f<K, V> findByEntry(Entry<?, ?> entry) {
        f<K, V> findByObject = findByObject(entry.getKey());
        Object obj = (findByObject == null || !equal(findByObject.h, entry.getValue())) ? null : 1;
        return obj != null ? findByObject : null;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static int secondaryHash(int i) {
        int i2 = ((i >>> 20) ^ (i >>> 12)) ^ i;
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    void removeInternal(f<K, V> fVar, boolean z) {
        int i = 0;
        if (z) {
            fVar.e.d = fVar.d;
            fVar.d.e = fVar.e;
            fVar.e = null;
            fVar.d = null;
        }
        f fVar2 = fVar.b;
        f fVar3 = fVar.c;
        f fVar4 = fVar.a;
        if (fVar2 == null || fVar3 == null) {
            if (fVar2 != null) {
                replaceInParent(fVar, fVar2);
                fVar.b = null;
            } else if (fVar3 != null) {
                replaceInParent(fVar, fVar3);
                fVar.c = null;
            } else {
                replaceInParent(fVar, null);
            }
            rebalance(fVar4, false);
            this.size--;
            this.modCount++;
            return;
        }
        int i2;
        fVar2 = fVar2.i > fVar3.i ? fVar2.b() : fVar3.a();
        removeInternal(fVar2, false);
        fVar4 = fVar.b;
        if (fVar4 != null) {
            i2 = fVar4.i;
            fVar2.b = fVar4;
            fVar4.a = fVar2;
            fVar.b = null;
        } else {
            i2 = 0;
        }
        fVar4 = fVar.c;
        if (fVar4 != null) {
            i = fVar4.i;
            fVar2.c = fVar4;
            fVar4.a = fVar2;
            fVar.c = null;
        }
        fVar2.i = Math.max(i2, i) + 1;
        replaceInParent(fVar, fVar2);
    }

    f<K, V> removeInternalByKey(Object obj) {
        f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    private void replaceInParent(f<K, V> fVar, f<K, V> fVar2) {
        f fVar3 = fVar.a;
        fVar.a = null;
        if (fVar2 != null) {
            fVar2.a = fVar3;
        }
        if (fVar3 == null) {
            this.table[fVar.g & (this.table.length - 1)] = fVar2;
        } else if (fVar3.b == fVar) {
            fVar3.b = fVar2;
        } else if ($assertionsDisabled || fVar3.c == fVar) {
            fVar3.c = fVar2;
        } else {
            throw new AssertionError();
        }
    }

    private void rebalance(f<K, V> fVar, boolean z) {
        while (fVar != null) {
            int i;
            f fVar2 = fVar.b;
            f fVar3 = fVar.c;
            int i2 = fVar2 != null ? fVar2.i : 0;
            if (fVar3 != null) {
                i = fVar3.i;
            } else {
                i = 0;
            }
            int i3 = i2 - i;
            f fVar4;
            if (i3 == -2) {
                fVar2 = fVar3.b;
                fVar4 = fVar3.c;
                if (fVar4 != null) {
                    i2 = fVar4.i;
                } else {
                    i2 = 0;
                }
                if (fVar2 != null) {
                    i = fVar2.i;
                } else {
                    i = 0;
                }
                i -= i2;
                if (i == -1 || (i == 0 && !z)) {
                    rotateLeft(fVar);
                } else if ($assertionsDisabled || i == 1) {
                    rotateRight(fVar3);
                    rotateLeft(fVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                fVar3 = fVar2.b;
                fVar4 = fVar2.c;
                i2 = fVar4 != null ? fVar4.i : 0;
                if (fVar3 != null) {
                    i = fVar3.i;
                } else {
                    i = 0;
                }
                i -= i2;
                if (i == 1 || (i == 0 && !z)) {
                    rotateRight(fVar);
                } else if ($assertionsDisabled || i == -1) {
                    rotateLeft(fVar2);
                    rotateRight(fVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                fVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else if ($assertionsDisabled || i3 == -1 || i3 == 1) {
                fVar.i = Math.max(i2, i) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            fVar = fVar.a;
        }
    }

    private void rotateLeft(f<K, V> fVar) {
        int i;
        int i2 = 0;
        f fVar2 = fVar.b;
        f fVar3 = fVar.c;
        f fVar4 = fVar3.b;
        f fVar5 = fVar3.c;
        fVar.c = fVar4;
        if (fVar4 != null) {
            fVar4.a = fVar;
        }
        replaceInParent(fVar, fVar3);
        fVar3.b = fVar;
        fVar.a = fVar3;
        if (fVar2 != null) {
            i = fVar2.i;
        } else {
            i = 0;
        }
        fVar.i = Math.max(i, fVar4 != null ? fVar4.i : 0) + 1;
        int i3 = fVar.i;
        if (fVar5 != null) {
            i2 = fVar5.i;
        }
        fVar3.i = Math.max(i3, i2) + 1;
    }

    private void rotateRight(f<K, V> fVar) {
        int i;
        int i2 = 0;
        f fVar2 = fVar.b;
        f fVar3 = fVar.c;
        f fVar4 = fVar2.b;
        f fVar5 = fVar2.c;
        fVar.b = fVar5;
        if (fVar5 != null) {
            fVar5.a = fVar;
        }
        replaceInParent(fVar, fVar2);
        fVar2.c = fVar;
        fVar.a = fVar2;
        if (fVar3 != null) {
            i = fVar3.i;
        } else {
            i = 0;
        }
        fVar.i = Math.max(i, fVar5 != null ? fVar5.i : 0) + 1;
        int i3 = fVar.i;
        if (fVar4 != null) {
            i2 = fVar4.i;
        }
        fVar2.i = Math.max(i3, i2) + 1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<Entry<K, V>> cVar = new c(this);
        this.entrySet = cVar;
        return cVar;
    }

    public Set<K> keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> dVar = new d(this);
        this.keySet = dVar;
        return dVar;
    }

    private void doubleCapacity() {
        this.table = doubleCapacity(this.table);
        this.threshold = (this.table.length / 2) + (this.table.length / 4);
    }

    static <K, V> f<K, V>[] doubleCapacity(f<K, V>[] fVarArr) {
        int length = fVarArr.length;
        f<K, V>[] fVarArr2 = new f[(length * 2)];
        b bVar = new b();
        a aVar = new a();
        a aVar2 = new a();
        for (int i = 0; i < length; i++) {
            f fVar = fVarArr[i];
            if (fVar != null) {
                f a;
                f a2;
                bVar.a(fVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    f a3 = bVar.a();
                    if (a3 == null) {
                        break;
                    } else if ((a3.g & length) == 0) {
                        i3++;
                    } else {
                        i2++;
                    }
                }
                aVar.a(i3);
                aVar2.a(i2);
                bVar.a(fVar);
                while (true) {
                    fVar = bVar.a();
                    if (fVar == null) {
                        break;
                    } else if ((fVar.g & length) == 0) {
                        aVar.a(fVar);
                    } else {
                        aVar2.a(fVar);
                    }
                }
                if (i3 > 0) {
                    a = aVar.a();
                } else {
                    a = null;
                }
                fVarArr2[i] = a;
                i3 = i + length;
                if (i2 > 0) {
                    a2 = aVar2.a();
                } else {
                    a2 = null;
                }
                fVarArr2[i3] = a2;
            }
        }
        return fVarArr2;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
}
