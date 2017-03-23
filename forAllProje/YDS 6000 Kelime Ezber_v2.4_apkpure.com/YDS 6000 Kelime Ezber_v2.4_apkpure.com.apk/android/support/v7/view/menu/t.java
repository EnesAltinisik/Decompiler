package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.au;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class t extends m implements o, OnKeyListener, OnItemClickListener, OnDismissListener {
    final au a;
    View b;
    private final Context c;
    private final h d;
    private final g e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private final OnGlobalLayoutListener j = new OnGlobalLayoutListener(this) {
        final /* synthetic */ t a;

        {
            this.a = r1;
        }

        public void onGlobalLayout() {
            if (this.a.f() && !this.a.a.c()) {
                View view = this.a.b;
                if (view == null || !view.isShown()) {
                    this.a.e();
                } else {
                    this.a.a.d();
                }
            }
        }
    };
    private OnDismissListener k;
    private View l;
    private a m;
    private ViewTreeObserver n;
    private boolean o;
    private boolean p;
    private int q;
    private int r = 0;
    private boolean s;

    public t(Context context, h hVar, View view, int i, int i2, boolean z) {
        this.c = context;
        this.d = hVar;
        this.f = z;
        this.e = new g(hVar, LayoutInflater.from(context), this.f);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.a = new au(this.c, null, this.h, this.i);
        hVar.a((o) this, context);
    }

    private boolean j() {
        if (f()) {
            return true;
        }
        if (this.o || this.l == null) {
            return false;
        }
        this.b = this.l;
        this.a.a((OnDismissListener) this);
        this.a.a((OnItemClickListener) this);
        this.a.a(true);
        View view = this.b;
        boolean z = this.n == null;
        this.n = view.getViewTreeObserver();
        if (z) {
            this.n.addOnGlobalLayoutListener(this.j);
        }
        this.a.b(view);
        this.a.e(this.r);
        if (!this.p) {
            this.q = m.a(this.e, null, this.c, this.g);
            this.p = true;
        }
        this.a.g(this.q);
        this.a.h(2);
        this.a.a(i());
        this.a.d();
        ViewGroup g = this.a.g();
        g.setOnKeyListener(this);
        if (this.s && this.d.m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(R.layout.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.d.m());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, null, false);
        }
        this.a.a(this.e);
        this.a.d();
        return true;
    }

    public void a(int i) {
        this.r = i;
    }

    public void a(Parcelable parcelable) {
    }

    public void a(h hVar) {
    }

    public void a(h hVar, boolean z) {
        if (hVar == this.d) {
            e();
            if (this.m != null) {
                this.m.a(hVar, z);
            }
        }
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public void a(View view) {
        this.l = view;
    }

    public void a(OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(boolean z) {
        this.p = false;
        if (this.e != null) {
            this.e.notifyDataSetChanged();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(u uVar) {
        if (uVar.hasVisibleItems()) {
            n nVar = new n(this.c, uVar, this.b, this.f, this.h, this.i);
            nVar.a(this.m);
            nVar.a(m.b((h) uVar));
            nVar.a(this.k);
            this.k = null;
            this.d.b(false);
            if (nVar.a(this.a.j(), this.a.k())) {
                if (this.m != null) {
                    this.m.a(uVar);
                }
                return true;
            }
        }
        return false;
    }

    public void b(int i) {
        this.a.c(i);
    }

    public void b(boolean z) {
        this.e.a(z);
    }

    public Parcelable c() {
        return null;
    }

    public void c(int i) {
        this.a.d(i);
    }

    public void c(boolean z) {
        this.s = z;
    }

    public void d() {
        if (!j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void e() {
        if (f()) {
            this.a.e();
        }
    }

    public boolean f() {
        return !this.o && this.a.f();
    }

    public ListView g() {
        return this.a.g();
    }

    public void onDismiss() {
        this.o = true;
        this.d.close();
        if (this.n != null) {
            if (!this.n.isAlive()) {
                this.n = this.b.getViewTreeObserver();
            }
            this.n.removeGlobalOnLayoutListener(this.j);
            this.n = null;
        }
        if (this.k != null) {
            this.k.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        e();
        return true;
    }
}
