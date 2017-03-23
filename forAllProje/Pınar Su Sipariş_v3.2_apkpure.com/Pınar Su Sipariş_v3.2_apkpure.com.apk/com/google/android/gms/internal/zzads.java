package com.google.android.gms.internal;

import com.google.android.gms.internal.zzadx.zzb;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class zzads<K, V> implements Iterable<Entry<K, V>> {

    public static class zza {
        private static final zza zzbIk = new zza() {
            public Object zzah(Object obj) {
                return obj;
            }
        };

        public interface zza<C, D> {
            D zzah(C c);
        }

        public static <A> zza<A, A> zzPy() {
            return zzbIk;
        }

        public static <K, V> zzads<K, V> zza(Comparator<K> comparator) {
            return new zzadr(comparator);
        }

        public static <A, B, C> zzads<A, C> zzb(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzads_zza_zza_A__B, Comparator<A> comparator) {
            return list.size() < 25 ? zzadr.zza(list, map, com_google_android_gms_internal_zzads_zza_zza_A__B, comparator) : zzaea.zzc(list, map, com_google_android_gms_internal_zzads_zza_zza_A__B, comparator);
        }

        public static <A, B> zzads<A, B> zzb(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? zzadr.zza((Map) map, (Comparator) comparator) : zzaea.zzc(map, comparator);
        }
    }

    public abstract boolean containsKey(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzads)) {
            return false;
        }
        zzads com_google_android_gms_internal_zzads = (zzads) obj;
        if (!zzPx().equals(com_google_android_gms_internal_zzads.zzPx())) {
            return false;
        }
        if (size() != com_google_android_gms_internal_zzads.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = com_google_android_gms_internal_zzads.iterator();
        while (it.hasNext()) {
            if (!((Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract V get(K k);

    public int hashCode() {
        int hashCode = zzPx().hashCode();
        Iterator it = iterator();
        int i = hashCode;
        while (it.hasNext()) {
            i = ((Entry) it.next()).hashCode() + (i * 31);
        }
        return i;
    }

    public abstract boolean isEmpty();

    public abstract Iterator<Entry<K, V>> iterator();

    public abstract int size();

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

    public abstract K zzPu();

    public abstract K zzPv();

    public abstract Iterator<Entry<K, V>> zzPw();

    public abstract Comparator<K> zzPx();

    public abstract void zza(zzb<K, V> com_google_android_gms_internal_zzadx_zzb_K__V);

    public abstract zzads<K, V> zzad(K k);

    public abstract K zzae(K k);

    public abstract zzads<K, V> zzj(K k, V v);
}
