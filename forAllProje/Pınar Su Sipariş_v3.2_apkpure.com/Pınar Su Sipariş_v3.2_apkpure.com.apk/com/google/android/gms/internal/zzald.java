package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class zzald<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzald.class.desiredAssertionStatus());
    private static final Comparator<Comparable> zzbXf = new Comparator<Comparable>() {
        public int a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Comparable) obj, (Comparable) obj2);
        }
    };
    int modCount;
    int size;
    Comparator<? super K> zzbIf;
    d<K, V> zzbXg;
    final d<K, V> zzbXh;
    private a zzbXi;
    private b zzbXj;

    private abstract class c<T> implements Iterator<T> {
        d<K, V> b;
        d<K, V> c;
        int d;
        final /* synthetic */ zzald e;

        private c(zzald com_google_android_gms_internal_zzald) {
            this.e = com_google_android_gms_internal_zzald;
            this.b = this.e.zzbXh.d;
            this.c = null;
            this.d = this.e.modCount;
        }

        final d<K, V> b() {
            d<K, V> dVar = this.b;
            if (dVar == this.e.zzbXh) {
                throw new NoSuchElementException();
            } else if (this.e.modCount != this.d) {
                throw new ConcurrentModificationException();
            } else {
                this.b = dVar.d;
                this.c = dVar;
                return dVar;
            }
        }

        public final boolean hasNext() {
            return this.b != this.e.zzbXh;
        }

        public final void remove() {
            if (this.c == null) {
                throw new IllegalStateException();
            }
            this.e.zza(this.c, true);
            this.c = null;
            this.d = this.e.modCount;
        }
    }

    class a extends AbstractSet<Entry<K, V>> {
        final /* synthetic */ zzald a;

        a(zzald com_google_android_gms_internal_zzald) {
            this.a = com_google_android_gms_internal_zzald;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && this.a.zzc((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new c<Entry<K, V>>(this) {
                final /* synthetic */ a a;

                {
                    this.a = r3;
                    zzald com_google_android_gms_internal_zzald = r3.a;
                }

                public Entry<K, V> a() {
                    return b();
                }

                public /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            d zzc = this.a.zzc((Entry) obj);
            if (zzc == null) {
                return false;
            }
            this.a.zza(zzc, true);
            return true;
        }

        public int size() {
            return this.a.size;
        }
    }

    final class b extends AbstractSet<K> {
        final /* synthetic */ zzald a;

        b(zzald com_google_android_gms_internal_zzald) {
            this.a = com_google_android_gms_internal_zzald;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new c<K>(this) {
                final /* synthetic */ b a;

                {
                    this.a = r3;
                    zzald com_google_android_gms_internal_zzald = r3.a;
                }

                public K next() {
                    return b().f;
                }
            };
        }

        public boolean remove(Object obj) {
            return this.a.zzaN(obj) != null;
        }

        public int size() {
            return this.a.size;
        }
    }

    static final class d<K, V> implements Entry<K, V> {
        d<K, V> a;
        d<K, V> b;
        d<K, V> c;
        d<K, V> d;
        d<K, V> e;
        final K f;
        V g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.a = dVar;
            this.f = k;
            this.h = 1;
            this.d = dVar2;
            this.e = dVar3;
            dVar3.d = this;
            dVar2.e = this;
        }

        public d<K, V> a() {
            d<K, V> dVar;
            for (d<K, V> dVar2 = this.b; dVar2 != null; dVar2 = dVar2.b) {
                dVar = dVar2;
            }
            return dVar;
        }

        public d<K, V> b() {
            d<K, V> dVar;
            for (d<K, V> dVar2 = this.c; dVar2 != null; dVar2 = dVar2.c) {
                dVar = dVar2;
            }
            return dVar;
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
            if (this.g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f;
        }

        public V getValue() {
            return this.g;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f == null ? 0 : this.f.hashCode();
            if (this.g != null) {
                i = this.g.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f);
            String valueOf2 = String.valueOf(this.g);
            return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
        }
    }

    public zzald() {
        this(zzbXf);
    }

    public zzald(Comparator<? super K> comparator) {
        Comparator comparator2;
        this.size = 0;
        this.modCount = 0;
        this.zzbXh = new d();
        if (comparator == null) {
            comparator2 = zzbXf;
        }
        this.zzbIf = comparator2;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void zza(d<K, V> dVar) {
        int i = 0;
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        d dVar4 = dVar3.b;
        d dVar5 = dVar3.c;
        dVar.c = dVar4;
        if (dVar4 != null) {
            dVar4.a = dVar;
        }
        zza((d) dVar, dVar3);
        dVar3.b = dVar;
        dVar.a = dVar3;
        dVar.h = Math.max(dVar2 != null ? dVar2.h : 0, dVar4 != null ? dVar4.h : 0) + 1;
        int i2 = dVar.h;
        if (dVar5 != null) {
            i = dVar5.h;
        }
        dVar3.h = Math.max(i2, i) + 1;
    }

    private void zza(d<K, V> dVar, d<K, V> dVar2) {
        d dVar3 = dVar.a;
        dVar.a = null;
        if (dVar2 != null) {
            dVar2.a = dVar3;
        }
        if (dVar3 == null) {
            this.zzbXg = dVar2;
        } else if (dVar3.b == dVar) {
            dVar3.b = dVar2;
        } else if ($assertionsDisabled || dVar3.c == dVar) {
            dVar3.c = dVar2;
        } else {
            throw new AssertionError();
        }
    }

    private void zzb(d<K, V> dVar) {
        int i = 0;
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        d dVar4 = dVar2.b;
        d dVar5 = dVar2.c;
        dVar.b = dVar5;
        if (dVar5 != null) {
            dVar5.a = dVar;
        }
        zza((d) dVar, dVar2);
        dVar2.c = dVar;
        dVar.a = dVar2;
        dVar.h = Math.max(dVar3 != null ? dVar3.h : 0, dVar5 != null ? dVar5.h : 0) + 1;
        int i2 = dVar.h;
        if (dVar4 != null) {
            i = dVar4.h;
        }
        dVar2.h = Math.max(i2, i) + 1;
    }

    private void zzb(d<K, V> dVar, boolean z) {
        d dVar2;
        while (dVar2 != null) {
            d dVar3 = dVar2.b;
            d dVar4 = dVar2.c;
            int i = dVar3 != null ? dVar3.h : 0;
            int i2 = dVar4 != null ? dVar4.h : 0;
            int i3 = i - i2;
            d dVar5;
            if (i3 == -2) {
                dVar3 = dVar4.b;
                dVar5 = dVar4.c;
                i2 = (dVar3 != null ? dVar3.h : 0) - (dVar5 != null ? dVar5.h : 0);
                if (i2 == -1 || (i2 == 0 && !z)) {
                    zza(dVar2);
                } else if ($assertionsDisabled || i2 == 1) {
                    zzb(dVar4);
                    zza(dVar2);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                dVar4 = dVar3.b;
                dVar5 = dVar3.c;
                i2 = (dVar4 != null ? dVar4.h : 0) - (dVar5 != null ? dVar5.h : 0);
                if (i2 == 1 || (i2 == 0 && !z)) {
                    zzb(dVar2);
                } else if ($assertionsDisabled || i2 == -1) {
                    zza(dVar3);
                    zzb(dVar2);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                dVar2.h = i + 1;
                if (z) {
                    return;
                }
            } else if ($assertionsDisabled || i3 == -1 || i3 == 1) {
                dVar2.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            dVar2 = dVar2.a;
        }
    }

    public void clear() {
        this.zzbXg = null;
        this.size = 0;
        this.modCount++;
        d dVar = this.zzbXh;
        dVar.e = dVar;
        dVar.d = dVar;
    }

    public boolean containsKey(Object obj) {
        return zzaM(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.zzbXi;
        if (set != null) {
            return set;
        }
        set = new a(this);
        this.zzbXi = set;
        return set;
    }

    public V get(Object obj) {
        d zzaM = zzaM(obj);
        return zzaM != null ? zzaM.g : null;
    }

    public Set<K> keySet() {
        Set set = this.zzbXj;
        if (set != null) {
            return set;
        }
        set = new b(this);
        this.zzbXj = set;
        return set;
    }

    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d zza = zza((Object) k, true);
        V v2 = zza.g;
        zza.g = v;
        return v2;
    }

    public V remove(Object obj) {
        d zzaN = zzaN(obj);
        return zzaN != null ? zzaN.g : null;
    }

    public int size() {
        return this.size;
    }

    d<K, V> zza(K k, boolean z) {
        int i;
        Comparator comparator = this.zzbIf;
        d<K, V> dVar = this.zzbXg;
        if (dVar != null) {
            int compareTo;
            Comparable comparable = comparator == zzbXf ? (Comparable) k : null;
            while (true) {
                compareTo = comparable != null ? comparable.compareTo(dVar.f) : comparator.compare(k, dVar.f);
                if (compareTo == 0) {
                    return dVar;
                }
                d<K, V> dVar2 = compareTo < 0 ? dVar.b : dVar.c;
                if (dVar2 == null) {
                    break;
                }
                dVar = dVar2;
            }
            int i2 = compareTo;
            d dVar3 = dVar;
            i = i2;
        } else {
            d<K, V> dVar4 = dVar;
            i = 0;
        }
        if (!z) {
            return null;
        }
        d<K, V> dVar5;
        d dVar6 = this.zzbXh;
        if (dVar3 != null) {
            dVar5 = new d(dVar3, k, dVar6, dVar6.e);
            if (i < 0) {
                dVar3.b = dVar5;
            } else {
                dVar3.c = dVar5;
            }
            zzb(dVar3, true);
        } else if (comparator != zzbXf || (k instanceof Comparable)) {
            dVar5 = new d(dVar3, k, dVar6, dVar6.e);
            this.zzbXg = dVar5;
        } else {
            throw new ClassCastException(String.valueOf(k.getClass().getName()).concat(" is not Comparable"));
        }
        this.size++;
        this.modCount++;
        return dVar5;
    }

    void zza(d<K, V> dVar, boolean z) {
        int i = 0;
        if (z) {
            dVar.e.d = dVar.d;
            dVar.d.e = dVar.e;
        }
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        d dVar4 = dVar.a;
        if (dVar2 == null || dVar3 == null) {
            if (dVar2 != null) {
                zza((d) dVar, dVar2);
                dVar.b = null;
            } else if (dVar3 != null) {
                zza((d) dVar, dVar3);
                dVar.c = null;
            } else {
                zza((d) dVar, null);
            }
            zzb(dVar4, false);
            this.size--;
            this.modCount++;
            return;
        }
        int i2;
        dVar2 = dVar2.h > dVar3.h ? dVar2.b() : dVar3.a();
        zza(dVar2, false);
        dVar4 = dVar.b;
        if (dVar4 != null) {
            i2 = dVar4.h;
            dVar2.b = dVar4;
            dVar4.a = dVar2;
            dVar.b = null;
        } else {
            i2 = 0;
        }
        dVar4 = dVar.c;
        if (dVar4 != null) {
            i = dVar4.h;
            dVar2.c = dVar4;
            dVar4.a = dVar2;
            dVar.c = null;
        }
        dVar2.h = Math.max(i2, i) + 1;
        zza((d) dVar, dVar2);
    }

    d<K, V> zzaM(Object obj) {
        d<K, V> dVar = null;
        if (obj != null) {
            try {
                dVar = zza(obj, false);
            } catch (ClassCastException e) {
            }
        }
        return dVar;
    }

    d<K, V> zzaN(Object obj) {
        d zzaM = zzaM(obj);
        if (zzaM != null) {
            zza(zzaM, true);
        }
        return zzaM;
    }

    d<K, V> zzc(Entry<?, ?> entry) {
        d<K, V> zzaM = zzaM(entry.getKey());
        Object obj = (zzaM == null || !equal(zzaM.g, entry.getValue())) ? null : 1;
        return obj != null ? zzaM : null;
    }
}
