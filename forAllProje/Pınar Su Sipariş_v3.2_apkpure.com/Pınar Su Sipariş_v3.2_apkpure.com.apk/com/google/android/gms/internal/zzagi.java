package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzagi<T> implements Iterable<Entry<zzafa, T>> {
    private static final zzads zzbPd = com.google.android.gms.internal.zzads.zza.zza(zzaeb.zzi(zzahi.class));
    private static final zzagi zzbPe = new zzagi(null, zzbPd);
    private final T zzbIu;
    private final zzads<zzahi, zzagi<T>> zzbPc;

    public interface zza<T, R> {
        R zza(zzafa com_google_android_gms_internal_zzafa, T t, R r);
    }

    public zzagi(T t) {
        this(t, zzbPd);
    }

    public zzagi(T t, zzads<zzahi, zzagi<T>> com_google_android_gms_internal_zzads_com_google_android_gms_internal_zzahi__com_google_android_gms_internal_zzagi_T) {
        this.zzbIu = t;
        this.zzbPc = com_google_android_gms_internal_zzads_com_google_android_gms_internal_zzahi__com_google_android_gms_internal_zzagi_T;
    }

    public static <V> zzagi<V> zzSo() {
        return zzbPe;
    }

    private <R> R zza(zzafa com_google_android_gms_internal_zzafa, zza<? super T, R> com_google_android_gms_internal_zzagi_zza__super_T__R, R r) {
        Iterator it = this.zzbPc.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            r = ((zzagi) entry.getValue()).zza(com_google_android_gms_internal_zzafa.zza((zzahi) entry.getKey()), com_google_android_gms_internal_zzagi_zza__super_T__R, r);
        }
        return this.zzbIu != null ? com_google_android_gms_internal_zzagi_zza__super_T__R.zza(com_google_android_gms_internal_zzafa, this.zzbIu, r) : r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzagi com_google_android_gms_internal_zzagi = (zzagi) obj;
        if (this.zzbPc == null ? com_google_android_gms_internal_zzagi.zzbPc != null : !this.zzbPc.equals(com_google_android_gms_internal_zzagi.zzbPc)) {
            return false;
        }
        if (this.zzbIu != null) {
            if (this.zzbIu.equals(com_google_android_gms_internal_zzagi.zzbIu)) {
                return true;
            }
        } else if (com_google_android_gms_internal_zzagi.zzbIu == null) {
            return true;
        }
        return false;
    }

    public T getValue() {
        return this.zzbIu;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.zzbIu != null ? this.zzbIu.hashCode() : 0) * 31;
        if (this.zzbPc != null) {
            i = this.zzbPc.hashCode();
        }
        return hashCode + i;
    }

    public boolean isEmpty() {
        return this.zzbIu == null && this.zzbPc.isEmpty();
    }

    public Iterator<Entry<zzafa, T>> iterator() {
        final List arrayList = new ArrayList();
        zza(new zza<T, Void>(this) {
            final /* synthetic */ zzagi b;

            public Void a(zzafa com_google_android_gms_internal_zzafa, T t, Void voidR) {
                arrayList.add(new SimpleImmutableEntry(com_google_android_gms_internal_zzafa, t));
                return null;
            }

            public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                return a(com_google_android_gms_internal_zzafa, obj, (Void) obj2);
            }
        });
        return arrayList.iterator();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImmutableTree { value=");
        stringBuilder.append(getValue());
        stringBuilder.append(", children={");
        Iterator it = this.zzbPc.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            stringBuilder.append(((zzahi) entry.getKey()).asString());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("} }");
        return stringBuilder.toString();
    }

    public Collection<T> values() {
        final Collection arrayList = new ArrayList();
        zza(new zza<T, Void>(this) {
            final /* synthetic */ zzagi b;

            public Void a(zzafa com_google_android_gms_internal_zzafa, T t, Void voidR) {
                arrayList.add(t);
                return null;
            }

            public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                return a(com_google_android_gms_internal_zzafa, obj, (Void) obj2);
            }
        });
        return arrayList;
    }

    public zzafa zzG(zzafa com_google_android_gms_internal_zzafa) {
        return zza(com_google_android_gms_internal_zzafa, zzagj.zzbPh);
    }

    public T zzH(zzafa com_google_android_gms_internal_zzafa) {
        return zzc(com_google_android_gms_internal_zzafa, zzagj.zzbPh);
    }

    public zzagi<T> zzI(zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return this;
        }
        zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get(com_google_android_gms_internal_zzafa.zzRt());
        return com_google_android_gms_internal_zzagi != null ? com_google_android_gms_internal_zzagi.zzI(com_google_android_gms_internal_zzafa.zzRu()) : zzSo();
    }

    public zzagi<T> zzJ(zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return this.zzbPc.isEmpty() ? zzSo() : new zzagi(null, this.zzbPc);
        } else {
            zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
            zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get(zzRt);
            if (com_google_android_gms_internal_zzagi == null) {
                return this;
            }
            com_google_android_gms_internal_zzagi = com_google_android_gms_internal_zzagi.zzJ(com_google_android_gms_internal_zzafa.zzRu());
            zzads zzad = com_google_android_gms_internal_zzagi.isEmpty() ? this.zzbPc.zzad(zzRt) : this.zzbPc.zzj(zzRt, com_google_android_gms_internal_zzagi);
            return (this.zzbIu == null && zzad.isEmpty()) ? zzSo() : new zzagi(this.zzbIu, zzad);
        }
    }

    public T zzK(zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return this.zzbIu;
        }
        zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get(com_google_android_gms_internal_zzafa.zzRt());
        return com_google_android_gms_internal_zzagi != null ? com_google_android_gms_internal_zzagi.zzK(com_google_android_gms_internal_zzafa.zzRu()) : null;
    }

    public zzads<zzahi, zzagi<T>> zzSp() {
        return this.zzbPc;
    }

    public zzafa zza(zzafa com_google_android_gms_internal_zzafa, zzagj<? super T> com_google_android_gms_internal_zzagj__super_T) {
        if (this.zzbIu != null && com_google_android_gms_internal_zzagj__super_T.zzap(this.zzbIu)) {
            return zzafa.zzRq();
        }
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return null;
        }
        zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get(com_google_android_gms_internal_zzafa.zzRt());
        if (com_google_android_gms_internal_zzagi == null) {
            return null;
        }
        zzafa zza = com_google_android_gms_internal_zzagi.zza(com_google_android_gms_internal_zzafa.zzRu(), (zzagj) com_google_android_gms_internal_zzagj__super_T);
        if (zza == null) {
            return null;
        }
        return new zzafa(r2).zzh(zza);
    }

    public zzagi<T> zza(zzafa com_google_android_gms_internal_zzafa, zzagi<T> com_google_android_gms_internal_zzagi_T) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return com_google_android_gms_internal_zzagi_T;
        }
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get(zzRt);
        if (com_google_android_gms_internal_zzagi == null) {
            com_google_android_gms_internal_zzagi = zzSo();
        }
        com_google_android_gms_internal_zzagi = com_google_android_gms_internal_zzagi.zza(com_google_android_gms_internal_zzafa.zzRu(), (zzagi) com_google_android_gms_internal_zzagi_T);
        return new zzagi(this.zzbIu, com_google_android_gms_internal_zzagi.isEmpty() ? this.zzbPc.zzad(zzRt) : this.zzbPc.zzj(zzRt, com_google_android_gms_internal_zzagi));
    }

    public void zza(zza<T, Void> com_google_android_gms_internal_zzagi_zza_T__java_lang_Void) {
        zza(zzafa.zzRq(), com_google_android_gms_internal_zzagi_zza_T__java_lang_Void, null);
    }

    public zzagi<T> zzb(zzafa com_google_android_gms_internal_zzafa, T t) {
        if (com_google_android_gms_internal_zzafa.isEmpty()) {
            return new zzagi(t, this.zzbPc);
        }
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get(zzRt);
        if (com_google_android_gms_internal_zzagi == null) {
            com_google_android_gms_internal_zzagi = zzSo();
        }
        return new zzagi(this.zzbIu, this.zzbPc.zzj(zzRt, com_google_android_gms_internal_zzagi.zzb(com_google_android_gms_internal_zzafa.zzRu(), (Object) t)));
    }

    public T zzb(zzafa com_google_android_gms_internal_zzafa, zzagj<? super T> com_google_android_gms_internal_zzagj__super_T) {
        if (this.zzbIu != null && com_google_android_gms_internal_zzagj__super_T.zzap(this.zzbIu)) {
            return this.zzbIu;
        }
        Iterator it = com_google_android_gms_internal_zzafa.iterator();
        while (it.hasNext()) {
            zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get((zzahi) it.next());
            if (com_google_android_gms_internal_zzagi == null) {
                return null;
            }
            if (com_google_android_gms_internal_zzagi.zzbIu != null && com_google_android_gms_internal_zzagj__super_T.zzap(com_google_android_gms_internal_zzagi.zzbIu)) {
                return com_google_android_gms_internal_zzagi.zzbIu;
            }
            this = com_google_android_gms_internal_zzagi;
        }
        return null;
    }

    public <R> R zzb(R r, zza<? super T, R> com_google_android_gms_internal_zzagi_zza__super_T__R) {
        return zza(zzafa.zzRq(), com_google_android_gms_internal_zzagi_zza__super_T__R, r);
    }

    public boolean zzb(zzagj<? super T> com_google_android_gms_internal_zzagj__super_T) {
        if (this.zzbIu != null && com_google_android_gms_internal_zzagj__super_T.zzap(this.zzbIu)) {
            return true;
        }
        Iterator it = this.zzbPc.iterator();
        while (it.hasNext()) {
            if (((zzagi) ((Entry) it.next()).getValue()).zzb(com_google_android_gms_internal_zzagj__super_T)) {
                return true;
            }
        }
        return false;
    }

    public T zzc(zzafa com_google_android_gms_internal_zzafa, zzagj<? super T> com_google_android_gms_internal_zzagj__super_T) {
        T t = (this.zzbIu == null || !com_google_android_gms_internal_zzagj__super_T.zzap(this.zzbIu)) ? null : this.zzbIu;
        Iterator it = com_google_android_gms_internal_zzafa.iterator();
        T t2 = t;
        while (it.hasNext()) {
            zzagi com_google_android_gms_internal_zzagi = (zzagi) this.zzbPc.get((zzahi) it.next());
            if (com_google_android_gms_internal_zzagi == null) {
                break;
            }
            if (com_google_android_gms_internal_zzagi.zzbIu != null && com_google_android_gms_internal_zzagj__super_T.zzap(com_google_android_gms_internal_zzagi.zzbIu)) {
                t2 = com_google_android_gms_internal_zzagi.zzbIu;
            }
            this = com_google_android_gms_internal_zzagi;
        }
        return t2;
    }

    public zzagi<T> zze(zzahi com_google_android_gms_internal_zzahi) {
        zzagi<T> com_google_android_gms_internal_zzagi_T = (zzagi) this.zzbPc.get(com_google_android_gms_internal_zzahi);
        return com_google_android_gms_internal_zzagi_T != null ? com_google_android_gms_internal_zzagi_T : zzSo();
    }
}
