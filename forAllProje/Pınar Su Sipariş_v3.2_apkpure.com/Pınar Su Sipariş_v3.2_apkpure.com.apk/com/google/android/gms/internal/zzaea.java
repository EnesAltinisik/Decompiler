package com.google.android.gms.internal;

import com.google.android.gms.internal.zzads.zza.zza;
import com.google.android.gms.internal.zzadx.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzaea<K, V> extends zzads<K, V> {
    private Comparator<K> zzbIf;
    private zzadx<K, V> zzbIx;

    private static class a<A, B, C> {
        private final List<A> a;
        private final Map<B, C> b;
        private final zza<A, B> c;
        private zzadz<A, C> d;
        private zzadz<A, C> e;

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

        private a(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzads_zza_zza_A__B) {
            this.a = list;
            this.b = map;
            this.c = com_google_android_gms_internal_zzads_zza_zza_A__B;
        }

        private zzadx<A, C> a(int i, int i2) {
            if (i2 == 0) {
                return zzadw.zzPD();
            }
            if (i2 == 1) {
                Object obj = this.a.get(i);
                return new zzadv(obj, a(obj), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            zzadx a = a(i, i3);
            zzadx a2 = a(i4 + 1, i3);
            obj = this.a.get(i4);
            return new zzadv(obj, a(obj), a, a2);
        }

        public static <A, B, C> zzaea<A, C> a(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzads_zza_zza_A__B, Comparator<A> comparator) {
            a aVar = new a(list, map, com_google_android_gms_internal_zzads_zza_zza_A__B);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                int i;
                b bVar = (b) it.next();
                size -= bVar.b;
                if (bVar.a) {
                    aVar.a(zzadx.zza.BLACK, bVar.b, size);
                    i = size;
                } else {
                    aVar.a(zzadx.zza.BLACK, bVar.b, size);
                    size -= bVar.b;
                    aVar.a(zzadx.zza.RED, bVar.b, size);
                    i = size;
                }
                size = i;
            }
            return new zzaea(aVar.d == null ? zzadw.zzPD() : aVar.d, comparator);
        }

        private C a(A a) {
            return this.b.get(this.c.zzah(a));
        }

        private void a(zzadx.zza com_google_android_gms_internal_zzadx_zza, int i, int i2) {
            zzadx a = a(i2 + 1, i - 1);
            Object obj = this.a.get(i2);
            Object com_google_android_gms_internal_zzady = com_google_android_gms_internal_zzadx_zza == zzadx.zza.RED ? new zzady(obj, a(obj), null, a) : new zzadv(obj, a(obj), null, a);
            if (this.d == null) {
                this.d = com_google_android_gms_internal_zzady;
                this.e = com_google_android_gms_internal_zzady;
                return;
            }
            this.e.zzb(com_google_android_gms_internal_zzady);
            this.e = com_google_android_gms_internal_zzady;
        }
    }

    private zzaea(zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, Comparator<K> comparator) {
        this.zzbIx = com_google_android_gms_internal_zzadx_K__V;
        this.zzbIf = comparator;
    }

    private zzadx<K, V> zzal(K k) {
        zzadx<K, V> com_google_android_gms_internal_zzadx_K__V = this.zzbIx;
        while (!com_google_android_gms_internal_zzadx_K__V.isEmpty()) {
            int compare = this.zzbIf.compare(k, com_google_android_gms_internal_zzadx_K__V.getKey());
            if (compare < 0) {
                com_google_android_gms_internal_zzadx_K__V = com_google_android_gms_internal_zzadx_K__V.zzPE();
            } else if (compare == 0) {
                return com_google_android_gms_internal_zzadx_K__V;
            } else {
                com_google_android_gms_internal_zzadx_K__V = com_google_android_gms_internal_zzadx_K__V.zzPF();
            }
        }
        return null;
    }

    public static <A, B, C> zzaea<A, C> zzc(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzads_zza_zza_A__B, Comparator<A> comparator) {
        return a.a(list, map, com_google_android_gms_internal_zzads_zza_zza_A__B, comparator);
    }

    public static <A, B> zzaea<A, B> zzc(Map<A, B> map, Comparator<A> comparator) {
        return a.a(new ArrayList(map.keySet()), map, zzads.zza.zzPy(), comparator);
    }

    public boolean containsKey(K k) {
        return zzal(k) != null;
    }

    public V get(K k) {
        zzadx zzal = zzal(k);
        return zzal != null ? zzal.getValue() : null;
    }

    public boolean isEmpty() {
        return this.zzbIx.isEmpty();
    }

    public Iterator<Entry<K, V>> iterator() {
        return new zzadt(this.zzbIx, null, this.zzbIf, false);
    }

    public int size() {
        return this.zzbIx.zzPI();
    }

    public K zzPu() {
        return this.zzbIx.zzPG().getKey();
    }

    public K zzPv() {
        return this.zzbIx.zzPH().getKey();
    }

    public Iterator<Entry<K, V>> zzPw() {
        return new zzadt(this.zzbIx, null, this.zzbIf, true);
    }

    public Comparator<K> zzPx() {
        return this.zzbIf;
    }

    public void zza(zzb<K, V> com_google_android_gms_internal_zzadx_zzb_K__V) {
        this.zzbIx.zza(com_google_android_gms_internal_zzadx_zzb_K__V);
    }

    public zzads<K, V> zzad(K k) {
        if (!containsKey(k)) {
            return this;
        }
        return new zzaea(this.zzbIx.zza(k, this.zzbIf).zza(null, null, zzadx.zza.BLACK, null, null), this.zzbIf);
    }

    public K zzae(K k) {
        zzadx com_google_android_gms_internal_zzadx = this.zzbIx;
        zzadx com_google_android_gms_internal_zzadx2 = null;
        while (!com_google_android_gms_internal_zzadx.isEmpty()) {
            int compare = this.zzbIf.compare(k, com_google_android_gms_internal_zzadx.getKey());
            if (compare == 0) {
                if (com_google_android_gms_internal_zzadx.zzPE().isEmpty()) {
                    return com_google_android_gms_internal_zzadx2 != null ? com_google_android_gms_internal_zzadx2.getKey() : null;
                } else {
                    com_google_android_gms_internal_zzadx2 = com_google_android_gms_internal_zzadx.zzPE();
                    while (!com_google_android_gms_internal_zzadx2.zzPF().isEmpty()) {
                        com_google_android_gms_internal_zzadx2 = com_google_android_gms_internal_zzadx2.zzPF();
                    }
                    return com_google_android_gms_internal_zzadx2.getKey();
                }
            } else if (compare < 0) {
                com_google_android_gms_internal_zzadx = com_google_android_gms_internal_zzadx.zzPE();
            } else {
                zzadx com_google_android_gms_internal_zzadx3 = com_google_android_gms_internal_zzadx;
                com_google_android_gms_internal_zzadx = com_google_android_gms_internal_zzadx.zzPF();
                com_google_android_gms_internal_zzadx2 = com_google_android_gms_internal_zzadx3;
            }
        }
        String valueOf = String.valueOf(k);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Couldn't find predecessor key of non-present key: ").append(valueOf).toString());
    }

    public zzads<K, V> zzj(K k, V v) {
        return new zzaea(this.zzbIx.zza(k, v, this.zzbIf).zza(null, null, zzadx.zza.BLACK, null, null), this.zzbIf);
    }
}
