package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.a.a.h;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class e implements l, OnItemClickListener {
    Context a;
    LayoutInflater b;
    f c;
    ExpandedMenuView d;
    int e;
    int f;
    a g;
    private int h;
    private android.support.v7.view.menu.l.a i;
    private int j;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {
        final /* synthetic */ e a;
        private int b = -1;

        public /* synthetic */ Object getItem(int i) {
            return a(i);
        }

        public a(e eVar) {
            this.a = eVar;
            a();
        }

        public int getCount() {
            int size = this.a.c.l().size() - this.a.h;
            return this.b < 0 ? size : size - 1;
        }

        public h a(int i) {
            ArrayList l = this.a.c.l();
            int a = this.a.h + i;
            if (this.b >= 0 && a >= this.b) {
                a++;
            }
            return (h) l.get(a);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            if (view == null) {
                inflate = this.a.b.inflate(this.a.f, viewGroup, false);
            } else {
                inflate = view;
            }
            ((android.support.v7.view.menu.m.a) inflate).a(a(i), 0);
            return inflate;
        }

        void a() {
            h r = this.a.c.r();
            if (r != null) {
                ArrayList l = this.a.c.l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((h) l.get(i)) == r) {
                        this.b = i;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i) {
        this(i, 0);
        this.a = context;
        this.b = LayoutInflater.from(this.a);
    }

    public e(int i, int i2) {
        this.f = i;
        this.e = i2;
    }

    public void a(Context context, f fVar) {
        if (this.e != 0) {
            this.a = new ContextThemeWrapper(context, this.e);
            this.b = LayoutInflater.from(this.a);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(this.a);
            }
        }
        this.c = fVar;
        if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
    }

    public m a(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(h.abc_expanded_menu_layout, viewGroup, false);
            if (this.g == null) {
                this.g = new a(this);
            }
            this.d.setAdapter(this.g);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public ListAdapter a() {
        if (this.g == null) {
            this.g = new a(this);
        }
        return this.g;
    }

    public void b(boolean z) {
        if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
    }

    public void a(android.support.v7.view.menu.l.a aVar) {
        this.i = aVar;
    }

    public boolean a(p pVar) {
        if (!pVar.hasVisibleItems()) {
            return false;
        }
        new g(pVar).a(null);
        if (this.i != null) {
            this.i.onOpenSubMenu(pVar);
        }
        return true;
    }

    public void a(f fVar, boolean z) {
        if (this.i != null) {
            this.i.onCloseMenu(fVar, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.a(this.g.a(i), (l) this, 0);
    }

    public boolean b() {
        return false;
    }

    public boolean a(f fVar, h hVar) {
        return false;
    }

    public boolean b(f fVar, h hVar) {
        return false;
    }

    public void a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.d != null) {
            this.d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public int c() {
        return this.j;
    }

    public Parcelable d() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        a(bundle);
        return bundle;
    }

    public void a(Parcelable parcelable) {
        b((Bundle) parcelable);
    }
}
