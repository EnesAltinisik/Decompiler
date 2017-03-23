package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Stack;

public class zzadt<K, V> implements Iterator<Entry<K, V>> {
    private final Stack<zzadz<K, V>> zzbIl = new Stack();
    private final boolean zzbIm;

    zzadt(zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, K k, Comparator<K> comparator, boolean z) {
        this.zzbIm = z;
        zzadx com_google_android_gms_internal_zzadx = com_google_android_gms_internal_zzadx_K__V;
        while (!com_google_android_gms_internal_zzadx.isEmpty()) {
            int compare = k != null ? z ? comparator.compare(k, com_google_android_gms_internal_zzadx.getKey()) : comparator.compare(com_google_android_gms_internal_zzadx.getKey(), k) : 1;
            if (compare < 0) {
                com_google_android_gms_internal_zzadx = z ? com_google_android_gms_internal_zzadx.zzPE() : com_google_android_gms_internal_zzadx.zzPF();
            } else if (compare == 0) {
                this.zzbIl.push((zzadz) com_google_android_gms_internal_zzadx);
                return;
            } else {
                this.zzbIl.push((zzadz) com_google_android_gms_internal_zzadx);
                com_google_android_gms_internal_zzadx = z ? com_google_android_gms_internal_zzadx.zzPF() : com_google_android_gms_internal_zzadx.zzPE();
            }
        }
    }

    public boolean hasNext() {
        return this.zzbIl.size() > 0;
    }

    public Entry<K, V> next() {
        try {
            zzadz com_google_android_gms_internal_zzadz = (zzadz) this.zzbIl.pop();
            Entry simpleEntry = new SimpleEntry(com_google_android_gms_internal_zzadz.getKey(), com_google_android_gms_internal_zzadz.getValue());
            zzadx zzPE;
            if (this.zzbIm) {
                for (zzPE = com_google_android_gms_internal_zzadz.zzPE(); !zzPE.isEmpty(); zzPE = zzPE.zzPF()) {
                    this.zzbIl.push((zzadz) zzPE);
                }
            } else {
                for (zzPE = com_google_android_gms_internal_zzadz.zzPF(); !zzPE.isEmpty(); zzPE = zzPE.zzPE()) {
                    this.zzbIl.push((zzadz) zzPE);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
