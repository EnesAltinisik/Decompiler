package com.arlib.floatingsearchview.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.u;
import android.support.v7.widget.ar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import com.arlib.floatingsearchview.R;
import java.util.ArrayList;

public class a implements o, OnKeyListener, OnGlobalLayoutListener, OnItemClickListener, OnDismissListener {
    static final int a = R.layout.abc_popup_menu_item_layout;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final h e;
    private final a f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private ar l;
    private ViewTreeObserver m;
    private android.support.v7.view.menu.o.a n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    private class a extends BaseAdapter {
        final /* synthetic */ a a;
        private h b;
        private int c = -1;

        public a(a aVar, h hVar) {
            this.a = aVar;
            this.b = hVar;
            a();
        }

        public j a(int i) {
            ArrayList l = this.a.g ? this.b.l() : this.b.i();
            if (this.c >= 0 && i >= this.c) {
                i++;
            }
            return (j) l.get(i);
        }

        void a() {
            j r = this.a.e.r();
            if (r != null) {
                ArrayList l = this.a.e.l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((j) l.get(i)) == r) {
                        this.c = i;
                        return;
                    }
                }
            }
            this.c = -1;
        }

        public int getCount() {
            ArrayList l = this.a.g ? this.b.l() : this.b.i();
            return this.c < 0 ? l.size() : l.size() - 1;
        }

        public /* synthetic */ Object getItem(int i) {
            return a(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? this.a.d.inflate(a.a, viewGroup, false) : view;
            android.support.v7.view.menu.p.a aVar = (android.support.v7.view.menu.p.a) inflate;
            if (this.a.b) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            aVar.a(a(i), 0);
            return inflate;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public a(Context context, h hVar, View view) {
        this(context, hVar, view, false, R.attr.popupMenuStyle);
    }

    public a(Context context, h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public a(Context context, h hVar, View view, boolean z, int i, int i2) {
        this.r = 0;
        this.c = context;
        this.d = LayoutInflater.from(context);
        this.e = hVar;
        this.f = new a(this, this.e);
        this.g = z;
        this.i = i;
        this.j = i2;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.k = view;
        hVar.a((o) this, context);
    }

    private int h() {
        ListAdapter listAdapter = this.f;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i = 0;
        int i2 = 0;
        View view = null;
        int i3 = 0;
        while (i < count) {
            View view2;
            int itemViewType = listAdapter.getItemViewType(i);
            if (itemViewType != i2) {
                i2 = itemViewType;
                view2 = null;
            } else {
                view2 = view;
            }
            if (this.o == null) {
                this.o = new FrameLayout(this.c);
            }
            view = listAdapter.getView(i, view2, this.o);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            itemViewType = view.getMeasuredWidth();
            if (itemViewType >= this.h) {
                return this.h;
            }
            if (itemViewType <= i3) {
                itemViewType = i3;
            }
            i++;
            i3 = itemViewType;
        }
        return i3;
    }

    public void a(Context context, h hVar) {
    }

    public void a(Parcelable parcelable) {
    }

    public void a(h hVar, boolean z) {
        if (hVar == this.e) {
            f();
            if (this.n != null) {
                this.n.a(hVar, z);
            }
        }
    }

    public void a(android.support.v7.view.menu.o.a aVar) {
        this.n = aVar;
    }

    public void a(boolean z) {
        this.p = false;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(h hVar, j jVar) {
        return false;
    }

    public boolean a(u uVar) {
        if (uVar.hasVisibleItems()) {
            boolean z;
            a aVar = new a(this.c, uVar, this.k);
            aVar.a(this.n);
            int size = uVar.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = uVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            z = false;
            aVar.b(z);
            if (aVar.e()) {
                if (this.n == null) {
                    return true;
                }
                this.n.a(uVar);
                return true;
            }
        }
        return false;
    }

    public int b() {
        return 0;
    }

    public void b(boolean z) {
        this.b = z;
    }

    public boolean b(h hVar, j jVar) {
        return false;
    }

    public Parcelable c() {
        return null;
    }

    public void d() {
        if (!e()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean e() {
        boolean z = false;
        this.l = new ar(this.c, null, this.i, this.j);
        this.l.a((OnDismissListener) this);
        this.l.a((OnItemClickListener) this);
        this.l.a(this.f);
        this.l.a(true);
        View view = this.k;
        if (view == null) {
            return false;
        }
        if (this.m == null) {
            z = true;
        }
        this.m = view.getViewTreeObserver();
        if (z) {
            this.m.addOnGlobalLayoutListener(this);
        }
        this.l.b(view);
        this.l.e(this.r);
        if (!this.p) {
            this.q = h();
            this.p = true;
        }
        this.l.g(this.q);
        this.l.h(2);
        int a = b.a(4) + (-this.k.getHeight());
        int width = (-this.q) + this.k.getWidth();
        if (VERSION.SDK_INT < 21) {
            a = (-this.k.getHeight()) - b.a(4);
            width = ((-this.q) + this.k.getWidth()) - b.a(8);
        }
        this.l.d(a);
        this.l.c(width);
        this.l.d();
        this.l.g().setOnKeyListener(this);
        return true;
    }

    public void f() {
        if (g()) {
            this.l.e();
        }
    }

    public boolean g() {
        return this.l != null && this.l.f();
    }

    public void onDismiss() {
        this.l = null;
        this.e.close();
        if (this.m != null) {
            if (!this.m.isAlive()) {
                this.m = this.k.getViewTreeObserver();
            }
            this.m.removeGlobalOnLayoutListener(this);
            this.m = null;
        }
    }

    public void onGlobalLayout() {
        if (g()) {
            View view = this.k;
            if (view == null || !view.isShown()) {
                f();
            } else if (g()) {
                this.l.d();
            }
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        a aVar = this.f;
        aVar.b.a(aVar.a(i), 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        f();
        return true;
    }
}
