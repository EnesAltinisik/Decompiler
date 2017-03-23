package com.google.android.gms.internal;

import com.google.android.gms.internal.zzads.zza;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzadu<T> implements Iterable<T> {
    private final zzads<T, Void> zzbIn;

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

    private zzadu(zzads<T, Void> com_google_android_gms_internal_zzads_T__java_lang_Void) {
        this.zzbIn = com_google_android_gms_internal_zzads_T__java_lang_Void;
    }

    public zzadu(List<T> list, Comparator<T> comparator) {
        this.zzbIn = zza.zzb(list, Collections.emptyMap(), zza.zzPy(), comparator);
    }

    public Iterator<T> iterator() {
        return new a(this.zzbIn.iterator());
    }

    public T zzPA() {
        return this.zzbIn.zzPv();
    }

    public Iterator<T> zzPw() {
        return new a(this.zzbIn.zzPw());
    }

    public T zzPz() {
        return this.zzbIn.zzPu();
    }

    public zzadu<T> zzai(T t) {
        zzads zzad = this.zzbIn.zzad(t);
        return zzad == this.zzbIn ? this : new zzadu(zzad);
    }

    public zzadu<T> zzaj(T t) {
        return new zzadu(this.zzbIn.zzj(t, null));
    }

    public T zzak(T t) {
        return this.zzbIn.zzae(t);
    }
}
