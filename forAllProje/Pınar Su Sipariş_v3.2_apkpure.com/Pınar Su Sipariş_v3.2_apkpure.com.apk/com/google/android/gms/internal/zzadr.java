package com.google.android.gms.internal;

import com.google.android.gms.internal.zzads.zza.zza;
import com.google.android.gms.internal.zzadx.zzb;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzadr<K, V> extends zzads<K, V> {
    private final K[] zzbId;
    private final V[] zzbIe;
    private final Comparator<K> zzbIf;

    public zzadr(Comparator<K> comparator) {
        this.zzbId = new Object[0];
        this.zzbIe = new Object[0];
        this.zzbIf = comparator;
    }

    private zzadr(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.zzbId = kArr;
        this.zzbIe = vArr;
        this.zzbIf = comparator;
    }

    public static <A, B, C> zzadr<A, C> zza(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzads_zza_zza_A__B, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        size = 0;
        for (Object next : list) {
            objArr[size] = next;
            objArr2[size] = map.get(com_google_android_gms_internal_zzads_zza_zza_A__B.zzah(next));
            size++;
        }
        return new zzadr(comparator, objArr, objArr2);
    }

    public static <K, V> zzadr<K, V> zza(Map<K, V> map, Comparator<K> comparator) {
        return zza(new ArrayList(map.keySet()), map, zzads.zza.zzPy(), comparator);
    }

    private static <T> T[] zza(T[] tArr, int i) {
        int length = tArr.length - 1;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, i);
        System.arraycopy(tArr, i + 1, obj, i, length - i);
        return obj;
    }

    private static <T> T[] zza(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, i);
        obj[i] = t;
        System.arraycopy(tArr, i, obj, i + 1, (length - i) - 1);
        return obj;
    }

    private int zzaf(K k) {
        int i = 0;
        while (i < this.zzbId.length && this.zzbIf.compare(this.zzbId[i], k) < 0) {
            i++;
        }
        return i;
    }

    private int zzag(K k) {
        int i = 0;
        Object[] objArr = this.zzbId;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (this.zzbIf.compare(k, objArr[i2]) == 0) {
                return i;
            }
            i2++;
            i++;
        }
        return -1;
    }

    private static <T> T[] zzb(T[] tArr, int i, T t) {
        int length = tArr.length;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, length);
        obj[i] = t;
        return obj;
    }

    private Iterator<Entry<K, V>> zzh(final int i, final boolean z) {
        return new Iterator<Entry<K, V>>(this) {
            int a = i;
            final /* synthetic */ zzadr d;

            public Entry<K, V> a() {
                Object obj = this.d.zzbId[this.a];
                Object obj2 = this.d.zzbIe[this.a];
                this.a = z ? this.a - 1 : this.a + 1;
                return new SimpleImmutableEntry(obj, obj2);
            }

            public boolean hasNext() {
                return z ? this.a >= 0 : this.a < this.d.zzbId.length;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    public boolean containsKey(K k) {
        return zzag(k) != -1;
    }

    public V get(K k) {
        int zzag = zzag(k);
        return zzag != -1 ? this.zzbIe[zzag] : null;
    }

    public boolean isEmpty() {
        return this.zzbId.length == 0;
    }

    public Iterator<Entry<K, V>> iterator() {
        return zzh(0, false);
    }

    public int size() {
        return this.zzbId.length;
    }

    public K zzPu() {
        return this.zzbId.length > 0 ? this.zzbId[0] : null;
    }

    public K zzPv() {
        return this.zzbId.length > 0 ? this.zzbId[this.zzbId.length - 1] : null;
    }

    public Iterator<Entry<K, V>> zzPw() {
        return zzh(this.zzbId.length - 1, true);
    }

    public Comparator<K> zzPx() {
        return this.zzbIf;
    }

    public void zza(zzb<K, V> com_google_android_gms_internal_zzadx_zzb_K__V) {
        for (int i = 0; i < this.zzbId.length; i++) {
            com_google_android_gms_internal_zzadx_zzb_K__V.zzk(this.zzbId[i], this.zzbIe[i]);
        }
    }

    public zzads<K, V> zzad(K k) {
        int zzag = zzag(k);
        if (zzag == -1) {
            return this;
        }
        return new zzadr(this.zzbIf, zza(this.zzbId, zzag), zza(this.zzbIe, zzag));
    }

    public K zzae(K k) {
        int zzag = zzag(k);
        if (zzag != -1) {
            return zzag > 0 ? this.zzbId[zzag - 1] : null;
        } else {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
    }

    public zzads<K, V> zzj(K k, V v) {
        int zzag = zzag(k);
        if (zzag != -1) {
            if (this.zzbId[zzag] == k && this.zzbIe[zzag] == v) {
                return this;
            }
            return new zzadr(this.zzbIf, zzb(this.zzbId, zzag, k), zzb(this.zzbIe, zzag, v));
        } else if (this.zzbId.length > 25) {
            Map hashMap = new HashMap(this.zzbId.length + 1);
            for (zzag = 0; zzag < this.zzbId.length; zzag++) {
                hashMap.put(this.zzbId[zzag], this.zzbIe[zzag]);
            }
            hashMap.put(k, v);
            return zzaea.zzc(hashMap, this.zzbIf);
        } else {
            zzag = zzaf(k);
            return new zzadr(this.zzbIf, zza(this.zzbId, zzag, k), zza(this.zzbIe, zzag, v));
        }
    }
}
