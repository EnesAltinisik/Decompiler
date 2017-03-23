package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.R;
import android.support.v4.view.ah;
import android.support.v4.view.bf;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.u;
import android.support.v7.widget.RecyclerView.w;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

public class c implements o {
    LinearLayout a;
    android.support.v7.view.menu.h b;
    b c;
    LayoutInflater d;
    int e;
    boolean f;
    ColorStateList g;
    ColorStateList h;
    Drawable i;
    int j;
    final OnClickListener k = new OnClickListener(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            this.a.b(true);
            android.support.v7.view.menu.j itemData = navigationMenuItemView.getItemData();
            boolean a = this.a.b.a((MenuItem) itemData, this.a, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                this.a.c.a(itemData);
            }
            this.a.b(false);
            this.a.a(false);
        }
    };
    private NavigationMenuView l;
    private android.support.v7.view.menu.o.a m;
    private int n;
    private int o;

    private static abstract class j extends w {
        public j(View view) {
            super(view);
        }
    }

    private static class a extends j {
        public a(View view) {
            super(view);
        }
    }

    private class b extends android.support.v7.widget.RecyclerView.a<j> {
        final /* synthetic */ c a;
        private final ArrayList<d> b = new ArrayList();
        private android.support.v7.view.menu.j c;
        private boolean d;

        b(c cVar) {
            this.a = cVar;
            f();
        }

        private void a(int i, int i2) {
            while (i < i2) {
                ((f) this.b.get(i)).a = true;
                i++;
            }
        }

        private void f() {
            if (!this.d) {
                this.d = true;
                this.b.clear();
                this.b.add(new c());
                int i = -1;
                int i2 = 0;
                boolean z = false;
                int size = this.a.b.i().size();
                int i3 = 0;
                while (i3 < size) {
                    int i4;
                    android.support.v7.view.menu.j jVar = (android.support.v7.view.menu.j) this.a.b.i().get(i3);
                    if (jVar.isChecked()) {
                        a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.a(false);
                    }
                    int i5;
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.b.add(new e(this.a.j, 0));
                            }
                            this.b.add(new f(jVar));
                            Object obj = null;
                            int size2 = this.b.size();
                            int size3 = subMenu.size();
                            for (i5 = 0; i5 < size3; i5++) {
                                android.support.v7.view.menu.j jVar2 = (android.support.v7.view.menu.j) subMenu.getItem(i5);
                                if (jVar2.isVisible()) {
                                    if (obj == null && jVar2.getIcon() != null) {
                                        obj = 1;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.a(false);
                                    }
                                    if (jVar.isChecked()) {
                                        a(jVar);
                                    }
                                    this.b.add(new f(jVar2));
                                }
                            }
                            if (obj != null) {
                                a(size2, this.b.size());
                            }
                        }
                        i4 = i;
                    } else {
                        int size4;
                        boolean z2;
                        i5 = jVar.getGroupId();
                        if (i5 != i) {
                            size4 = this.b.size();
                            z2 = jVar.getIcon() != null;
                            if (i3 != 0) {
                                size4++;
                                this.b.add(new e(this.a.j, this.a.j));
                            }
                        } else if (z || jVar.getIcon() == null) {
                            z2 = z;
                            size4 = i2;
                        } else {
                            z2 = true;
                            a(i2, this.b.size());
                            size4 = i2;
                        }
                        f fVar = new f(jVar);
                        fVar.a = z2;
                        this.b.add(fVar);
                        z = z2;
                        i2 = size4;
                        i4 = i5;
                    }
                    i3++;
                    i = i4;
                }
                this.d = false;
            }
        }

        public int a() {
            return this.b.size();
        }

        public long a(int i) {
            return (long) i;
        }

        public j a(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new g(this.a.d, viewGroup, this.a.k);
                case 1:
                    return new i(this.a.d, viewGroup);
                case 2:
                    return new h(this.a.d, viewGroup);
                case 3:
                    return new a(this.a.a);
                default:
                    return null;
            }
        }

        public void a(Bundle bundle) {
            d dVar;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.d = true;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    dVar = (d) it.next();
                    if (dVar instanceof f) {
                        android.support.v7.view.menu.j a = ((f) dVar).a();
                        if (a != null && a.getItemId() == i) {
                            a(a);
                            break;
                        }
                    }
                }
                this.d = false;
                f();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                dVar = (d) it2.next();
                if (dVar instanceof f) {
                    android.support.v7.view.menu.j a2 = ((f) dVar).a();
                    View actionView = a2 != null ? a2.getActionView() : null;
                    if (actionView != null) {
                        actionView.restoreHierarchyState((SparseArray) sparseParcelableArray.get(a2.getItemId()));
                    }
                }
            }
        }

        public void a(j jVar) {
            if (jVar instanceof g) {
                ((NavigationMenuItemView) jVar.a).a();
            }
        }

        public void a(j jVar, int i) {
            switch (b(i)) {
                case 0:
                    View view = (NavigationMenuItemView) jVar.a;
                    view.setIconTintList(this.a.h);
                    if (this.a.f) {
                        view.setTextAppearance(this.a.e);
                    }
                    if (this.a.g != null) {
                        view.setTextColor(this.a.g);
                    }
                    ah.a(view, this.a.i != null ? this.a.i.getConstantState().newDrawable() : null);
                    f fVar = (f) this.b.get(i);
                    view.setNeedsEmptyIcon(fVar.a);
                    view.a(fVar.a(), 0);
                    return;
                case 1:
                    ((TextView) jVar.a).setText(((f) this.b.get(i)).a().getTitle());
                    return;
                case 2:
                    e eVar = (e) this.b.get(i);
                    jVar.a.setPadding(0, eVar.a(), 0, eVar.b());
                    return;
                default:
                    return;
            }
        }

        public void a(android.support.v7.view.menu.j jVar) {
            if (this.c != jVar && jVar.isCheckable()) {
                if (this.c != null) {
                    this.c.setChecked(false);
                }
                this.c = jVar;
                jVar.setChecked(true);
            }
        }

        public void a(boolean z) {
            this.d = z;
        }

        public int b(int i) {
            d dVar = (d) this.b.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                return ((f) dVar).a().hasSubMenu() ? 1 : 0;
            } else {
                throw new RuntimeException("Unknown item type.");
            }
        }

        public /* synthetic */ w b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public void b() {
            f();
            e();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            if (this.c != null) {
                bundle.putInt("android:menu:checked", this.c.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    android.support.v7.view.menu.j a = ((f) dVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        SparseArray eVar = new e();
                        actionView.saveHierarchyState(eVar);
                        sparseArray.put(a.getItemId(), eVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }
    }

    private interface d {
    }

    private static class c implements d {
        c() {
        }
    }

    private static class e implements d {
        private final int a;
        private final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    private static class f implements d {
        boolean a;
        private final android.support.v7.view.menu.j b;

        f(android.support.v7.view.menu.j jVar) {
            this.b = jVar;
        }

        public android.support.v7.view.menu.j a() {
            return this.b;
        }
    }

    private static class g extends j {
        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    private static class h extends j {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class i extends j {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public p a(ViewGroup viewGroup) {
        if (this.l == null) {
            this.l = (NavigationMenuView) this.d.inflate(R.layout.design_navigation_menu, viewGroup, false);
            if (this.c == null) {
                this.c = new b(this);
            }
            this.a = (LinearLayout) this.d.inflate(R.layout.design_navigation_item_header, this.l, false);
            this.l.setAdapter(this.c);
        }
        return this.l;
    }

    public void a(int i) {
        this.n = i;
    }

    public void a(Context context, android.support.v7.view.menu.h hVar) {
        this.d = LayoutInflater.from(context);
        this.b = hVar;
        this.j = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public void a(ColorStateList colorStateList) {
        this.h = colorStateList;
        a(false);
    }

    public void a(Drawable drawable) {
        this.i = drawable;
        a(false);
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.c.a(bundle2);
            }
            sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
        }
    }

    public void a(bf bfVar) {
        int b = bfVar.b();
        if (this.o != b) {
            this.o = b;
            if (this.a.getChildCount() == 0) {
                this.l.setPadding(0, this.o, 0, this.l.getPaddingBottom());
            }
        }
        ah.b(this.a, bfVar);
    }

    public void a(android.support.v7.view.menu.h hVar, boolean z) {
        if (this.m != null) {
            this.m.a(hVar, z);
        }
    }

    public void a(android.support.v7.view.menu.j jVar) {
        this.c.a(jVar);
    }

    public void a(android.support.v7.view.menu.o.a aVar) {
        this.m = aVar;
    }

    public void a(View view) {
        this.a.addView(view);
        this.l.setPadding(0, 0, 0, this.l.getPaddingBottom());
    }

    public void a(boolean z) {
        if (this.c != null) {
            this.c.b();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(android.support.v7.view.menu.h hVar, android.support.v7.view.menu.j jVar) {
        return false;
    }

    public boolean a(u uVar) {
        return false;
    }

    public int b() {
        return this.n;
    }

    public View b(int i) {
        View inflate = this.d.inflate(i, this.a, false);
        a(inflate);
        return inflate;
    }

    public void b(ColorStateList colorStateList) {
        this.g = colorStateList;
        a(false);
    }

    public void b(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }

    public boolean b(android.support.v7.view.menu.h hVar, android.support.v7.view.menu.j jVar) {
        return false;
    }

    public Parcelable c() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Parcelable bundle = new Bundle();
        if (this.l != null) {
            SparseArray sparseArray = new SparseArray();
            this.l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.c != null) {
            bundle.putBundle("android:menu:adapter", this.c.c());
        }
        if (this.a == null) {
            return bundle;
        }
        sparseArray = new SparseArray();
        this.a.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("android:menu:header", sparseArray);
        return bundle;
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
        a(false);
    }

    public int d() {
        return this.a.getChildCount();
    }

    public ColorStateList e() {
        return this.h;
    }

    public ColorStateList f() {
        return this.g;
    }

    public Drawable g() {
        return this.i;
    }
}
