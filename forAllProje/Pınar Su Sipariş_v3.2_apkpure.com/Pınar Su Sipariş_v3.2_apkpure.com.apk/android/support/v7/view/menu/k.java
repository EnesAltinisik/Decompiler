package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.a.a.d;
import android.support.v7.a.a.h;
import android.support.v7.widget.aj;
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
import java.util.ArrayList;

/* compiled from: MenuPopupHelper */
public class k implements l, OnKeyListener, OnGlobalLayoutListener, OnItemClickListener, OnDismissListener {
    static final int a = h.abc_popup_menu_item_layout;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final f e;
    private final a f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private aj l;
    private ViewTreeObserver m;
    private android.support.v7.view.menu.l.a n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    /* compiled from: MenuPopupHelper */
    private class a extends BaseAdapter {
        final /* synthetic */ k a;
        private f b;
        private int c = -1;

        public /* synthetic */ Object getItem(int i) {
            return a(i);
        }

        public a(k kVar, f fVar) {
            this.a = kVar;
            this.b = fVar;
            a();
        }

        public int getCount() {
            ArrayList l = this.a.g ? this.b.l() : this.b.i();
            if (this.c < 0) {
                return l.size();
            }
            return l.size() - 1;
        }

        public h a(int i) {
            ArrayList l = this.a.g ? this.b.l() : this.b.i();
            if (this.c >= 0 && i >= this.c) {
                i++;
            }
            return (h) l.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            if (view == null) {
                inflate = this.a.d.inflate(k.a, viewGroup, false);
            } else {
                inflate = view;
            }
            android.support.v7.view.menu.m.a aVar = (android.support.v7.view.menu.m.a) inflate;
            if (this.a.b) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            aVar.a(a(i), 0);
            return inflate;
        }

        void a() {
            h r = this.a.e.r();
            if (r != null) {
                ArrayList l = this.a.e.l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((h) l.get(i)) == r) {
                        this.c = i;
                        return;
                    }
                }
            }
            this.c = -1;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public k(Context context, f fVar) {
        this(context, fVar, null, false, android.support.v7.a.a.a.popupMenuStyle);
    }

    public k(Context context, f fVar, View view) {
        this(context, fVar, view, false, android.support.v7.a.a.a.popupMenuStyle);
    }

    public k(Context context, f fVar, View view, boolean z, int i) {
        this(context, fVar, view, z, i, 0);
    }

    public k(Context context, f fVar, View view, boolean z, int i, int i2) {
        this.r = 0;
        this.c = context;
        this.d = LayoutInflater.from(context);
        this.e = fVar;
        this.f = new a(this, this.e);
        this.g = z;
        this.i = i;
        this.j = i2;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.k = view;
        fVar.a((l) this, context);
    }

    public void a(View view) {
        this.k = view;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(int i) {
        this.r = i;
    }

    public void a() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public aj e() {
        return this.l;
    }

    public boolean f() {
        boolean z = false;
        this.l = new aj(this.c, null, this.i, this.j);
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
        this.l.a(view);
        this.l.d(this.r);
        if (!this.p) {
            this.q = i();
            this.p = true;
        }
        this.l.f(this.q);
        this.l.g(2);
        this.l.c();
        this.l.m().setOnKeyListener(this);
        return true;
    }

    public void g() {
        if (h()) {
            this.l.i();
        }
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

    public boolean h() {
        return this.l != null && this.l.k();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        a aVar = this.f;
        aVar.b.a(aVar.a(i), 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        g();
        return true;
    }

    private int i() {
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

    public void onGlobalLayout() {
        if (h()) {
            View view = this.k;
            if (view == null || !view.isShown()) {
                g();
            } else if (h()) {
                this.l.c();
            }
        }
    }

    public void a(Context context, f fVar) {
    }

    public void b(boolean z) {
        this.p = false;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public void a(android.support.v7.view.menu.l.a aVar) {
        this.n = aVar;
    }

    public boolean a(p pVar) {
        if (pVar.hasVisibleItems()) {
            boolean z;
            k kVar = new k(this.c, pVar, this.k);
            kVar.a(this.n);
            int size = pVar.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = pVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            z = false;
            kVar.a(z);
            if (kVar.f()) {
                if (this.n == null) {
                    return true;
                }
                this.n.onOpenSubMenu(pVar);
                return true;
            }
        }
        return false;
    }

    public void a(f fVar, boolean z) {
        if (fVar == this.e) {
            g();
            if (this.n != null) {
                this.n.onCloseMenu(fVar, z);
            }
        }
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

    public int c() {
        return 0;
    }

    public Parcelable d() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }
}
