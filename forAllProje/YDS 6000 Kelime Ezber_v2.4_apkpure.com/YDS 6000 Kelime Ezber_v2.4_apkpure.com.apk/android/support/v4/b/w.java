package android.support.v4.b;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.b.l.d;
import android.support.v4.view.aa;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class w extends aa {
    private final q a;
    private x b = null;
    private ArrayList<d> c = new ArrayList();
    private ArrayList<l> d = new ArrayList();
    private l e = null;

    public w(q qVar) {
        this.a = qVar;
    }

    public Parcelable a() {
        Bundle bundle = null;
        if (this.c.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new d[this.c.size()];
            this.c.toArray(parcelableArr);
            bundle.putParcelableArray("states", parcelableArr);
        }
        Parcelable parcelable = bundle;
        for (int i = 0; i < this.d.size(); i++) {
            l lVar = (l) this.d.get(i);
            if (lVar != null && lVar.m()) {
                if (parcelable == null) {
                    parcelable = new Bundle();
                }
                this.a.a(parcelable, "f" + i, lVar);
            }
        }
        return parcelable;
    }

    public abstract l a(int i);

    public Object a(ViewGroup viewGroup, int i) {
        if (this.d.size() > i) {
            l lVar = (l) this.d.get(i);
            if (lVar != null) {
                return lVar;
            }
        }
        if (this.b == null) {
            this.b = this.a.a();
        }
        l a = a(i);
        if (this.c.size() > i) {
            d dVar = (d) this.c.get(i);
            if (dVar != null) {
                a.a(dVar);
            }
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        a.e(false);
        a.f(false);
        this.d.set(i, a);
        this.b.a(viewGroup.getId(), a);
        return a;
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.c.clear();
            this.d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.c.add((d) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    l a = this.a.a(bundle, str);
                    if (a != null) {
                        while (this.d.size() <= parseInt) {
                            this.d.add(null);
                        }
                        a.e(false);
                        this.d.set(parseInt, a);
                    } else {
                        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        l lVar = (l) obj;
        if (this.b == null) {
            this.b = this.a.a();
        }
        while (this.c.size() <= i) {
            this.c.add(null);
        }
        this.c.set(i, lVar.m() ? this.a.a(lVar) : null);
        this.d.set(i, null);
        this.b.a(lVar);
    }

    public boolean a(View view, Object obj) {
        return ((l) obj).p() == view;
    }

    public void b(ViewGroup viewGroup) {
        if (this.b != null) {
            this.b.d();
            this.b = null;
        }
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        l lVar = (l) obj;
        if (lVar != this.e) {
            if (this.e != null) {
                this.e.e(false);
                this.e.f(false);
            }
            if (lVar != null) {
                lVar.e(true);
                lVar.f(true);
            }
            this.e = lVar;
        }
    }
}
