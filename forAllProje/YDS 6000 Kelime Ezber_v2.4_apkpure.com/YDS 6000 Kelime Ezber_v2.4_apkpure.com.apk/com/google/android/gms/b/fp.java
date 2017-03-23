package com.google.android.gms.b;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Stack;

public class fp<K, V> implements Iterator<Entry<K, V>> {
    private final Stack<fv<K, V>> a = new Stack();
    private final boolean b;

    fp(ft<K, V> ftVar, K k, Comparator<K> comparator, boolean z) {
        this.b = z;
        ft ftVar2 = ftVar;
        while (!ftVar2.c()) {
            int compare = k != null ? z ? comparator.compare(k, ftVar2.d()) : comparator.compare(ftVar2.d(), k) : 1;
            if (compare < 0) {
                ftVar2 = z ? ftVar2.f() : ftVar2.g();
            } else if (compare == 0) {
                this.a.push((fv) ftVar2);
                return;
            } else {
                this.a.push((fv) ftVar2);
                ftVar2 = z ? ftVar2.g() : ftVar2.f();
            }
        }
    }

    public Entry<K, V> a() {
        try {
            fv fvVar = (fv) this.a.pop();
            Entry simpleEntry = new SimpleEntry(fvVar.d(), fvVar.e());
            ft f;
            if (this.b) {
                for (f = fvVar.f(); !f.c(); f = f.g()) {
                    this.a.push((fv) f);
                }
            } else {
                for (f = fvVar.g(); !f.c(); f = f.f()) {
                    this.a.push((fv) f);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.a.size() > 0;
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
