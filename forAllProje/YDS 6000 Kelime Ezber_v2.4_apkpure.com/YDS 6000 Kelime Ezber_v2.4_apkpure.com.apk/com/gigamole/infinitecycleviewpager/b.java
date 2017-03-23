package com.gigamole.infinitecycleviewpager;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.v4.view.aa;
import android.view.View;
import android.view.ViewGroup;

class b extends aa {
    private final aa a;
    private a b;

    protected interface a {
    }

    public b(aa aaVar) {
        this.a = aaVar;
    }

    protected int a(int i) {
        return i % this.a.b();
    }

    public int a(Object obj) {
        return this.a.a(obj);
    }

    public Parcelable a() {
        return this.a.a();
    }

    public Object a(ViewGroup viewGroup, int i) {
        return this.a.a(viewGroup, a(i));
    }

    public void a(DataSetObserver dataSetObserver) {
        this.a.a(dataSetObserver);
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
        this.a.a(parcelable, classLoader);
    }

    public void a(ViewGroup viewGroup) {
        this.a.a(viewGroup);
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        this.a.a(viewGroup, a(i), obj);
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public boolean a(View view, Object obj) {
        return this.a.a(view, obj);
    }

    public int b() {
        return this.a.b() == 0 ? 0 : 10000000;
    }

    public void b(DataSetObserver dataSetObserver) {
        this.a.b(dataSetObserver);
    }

    public void b(ViewGroup viewGroup) {
        this.a.b(viewGroup);
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        this.a.b(viewGroup, i, obj);
    }

    public aa c() {
        return this.a;
    }

    public CharSequence c(int i) {
        return this.a.c(a(i));
    }

    public float d(int i) {
        return this.a.d(a(i));
    }
}
