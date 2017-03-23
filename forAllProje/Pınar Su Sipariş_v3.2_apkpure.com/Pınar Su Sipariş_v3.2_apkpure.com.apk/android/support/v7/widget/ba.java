package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.support.v4.view.az;
import android.support.v4.view.be;
import android.support.v7.a.a.a;
import android.support.v7.a.a.e;
import android.support.v7.a.a.f;
import android.support.v7.a.a.i;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.l;
import android.support.v7.widget.Toolbar.b;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.cast.TextTrackStyle;

/* compiled from: ToolbarWidgetWrapper */
public class ba implements ad {
    private Toolbar a;
    private int b;
    private View c;
    private Spinner d;
    private View e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    private CharSequence j;
    private CharSequence k;
    private CharSequence l;
    private Callback m;
    private boolean n;
    private ActionMenuPresenter o;
    private int p;
    private final l q;
    private int r;
    private Drawable s;

    public ba(Toolbar toolbar, boolean z) {
        this(toolbar, z, i.abc_action_bar_up_description, e.abc_ic_ab_back_mtrl_am_alpha);
    }

    public ba(Toolbar toolbar, boolean z, int i, int i2) {
        this.p = 0;
        this.r = 0;
        this.a = toolbar;
        this.j = toolbar.getTitle();
        this.k = toolbar.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar.getNavigationIcon();
        if (z) {
            az a = az.a(toolbar.getContext(), null, k.ActionBar, a.actionBarStyle, 0);
            CharSequence c = a.c(k.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                b(c);
            }
            c = a.c(k.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c)) {
                c(c);
            }
            Drawable a2 = a.a(k.ActionBar_logo);
            if (a2 != null) {
                b(a2);
            }
            a2 = a.a(k.ActionBar_icon);
            if (this.h == null && a2 != null) {
                a(a2);
            }
            a2 = a.a(k.ActionBar_homeAsUpIndicator);
            if (a2 != null) {
                c(a2);
            }
            c(a.a(k.ActionBar_displayOptions, 0));
            int g = a.g(k.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g, this.a, false));
                c(this.b | 16);
            }
            g = a.f(k.ActionBar_height, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = g;
                this.a.setLayoutParams(layoutParams);
            }
            g = a.d(k.ActionBar_contentInsetStart, -1);
            int d = a.d(k.ActionBar_contentInsetEnd, -1);
            if (g >= 0 || d >= 0) {
                this.a.a(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.g(k.ActionBar_titleTextStyle, 0);
            if (g != 0) {
                this.a.a(this.a.getContext(), g);
            }
            g = a.g(k.ActionBar_subtitleTextStyle, 0);
            if (g != 0) {
                this.a.b(this.a.getContext(), g);
            }
            int g2 = a.g(k.ActionBar_popupTheme, 0);
            if (g2 != 0) {
                this.a.setPopupTheme(g2);
            }
            a.a();
        } else {
            this.b = A();
        }
        this.q = l.a();
        i(i);
        this.l = this.a.getNavigationContentDescription();
        e(this.q.a(b(), i2));
        this.a.setNavigationOnClickListener(new OnClickListener(this) {
            final android.support.v7.view.menu.a a = new android.support.v7.view.menu.a(this.b.a.getContext(), 0, 16908332, 0, 0, this.b.j);
            final /* synthetic */ ba b;

            {
                this.b = r8;
            }

            public void onClick(View view) {
                if (this.b.m != null && this.b.n) {
                    this.b.m.onMenuItemSelected(0, this.a);
                }
            }
        });
    }

    public void i(int i) {
        if (i != this.r) {
            this.r = i;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                g(this.r);
            }
        }
    }

    public void e(Drawable drawable) {
        if (this.s != drawable) {
            this.s = drawable;
            E();
        }
    }

    private int A() {
        if (this.a.getNavigationIcon() != null) {
            return 15;
        }
        return 11;
    }

    public ViewGroup a() {
        return this.a;
    }

    public Context b() {
        return this.a.getContext();
    }

    public boolean c() {
        return this.a.h();
    }

    public void d() {
        this.a.i();
    }

    public void a(Callback callback) {
        this.m = callback;
    }

    public void a(CharSequence charSequence) {
        if (!this.i) {
            e(charSequence);
        }
    }

    public CharSequence e() {
        return this.a.getTitle();
    }

    public void b(CharSequence charSequence) {
        this.i = true;
        e(charSequence);
    }

    private void e(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    public CharSequence f() {
        return this.a.getSubtitle();
    }

    public void c(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void h() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean i() {
        return this.f != null;
    }

    public boolean j() {
        return this.g != null;
    }

    public void a(int i) {
        a(i != 0 ? this.q.a(b(), i) : null);
    }

    public void a(Drawable drawable) {
        this.f = drawable;
        B();
    }

    public void b(int i) {
        b(i != 0 ? this.q.a(b(), i) : null);
    }

    public void b(Drawable drawable) {
        this.g = drawable;
        B();
    }

    private void B() {
        Drawable drawable = null;
        if ((this.b & 2) != 0) {
            drawable = (this.b & 1) != 0 ? this.g != null ? this.g : this.f : this.f;
        }
        this.a.setLogo(drawable);
    }

    public boolean k() {
        return this.a.a();
    }

    public boolean l() {
        return this.a.b();
    }

    public boolean m() {
        return this.a.c();
    }

    public boolean n() {
        return this.a.d();
    }

    public boolean o() {
        return this.a.e();
    }

    public void p() {
        this.n = true;
    }

    public void a(Menu menu, l.a aVar) {
        if (this.o == null) {
            this.o = new ActionMenuPresenter(this.a.getContext());
            this.o.a(f.action_menu_presenter);
        }
        this.o.a(aVar);
        this.a.a((android.support.v7.view.menu.f) menu, this.o);
    }

    public void q() {
        this.a.f();
    }

    public int r() {
        return this.b;
    }

    public void c(int i) {
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    E();
                    D();
                } else {
                    this.a.setNavigationIcon(null);
                }
            }
            if ((i2 & 3) != 0) {
                B();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.j);
                    this.a.setSubtitle(this.k);
                } else {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
            }
            if ((i2 & 16) != 0 && this.e != null) {
                if ((i & 16) != 0) {
                    this.a.addView(this.e);
                } else {
                    this.a.removeView(this.e);
                }
            }
        }
    }

    public void a(ar arVar) {
        if (this.c != null && this.c.getParent() == this.a) {
            this.a.removeView(this.c);
        }
        this.c = arVar;
        if (arVar != null && this.p == 2) {
            this.a.addView(this.c, 0);
            b bVar = (b) this.c.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.gravity = 8388691;
            arVar.setAllowCollapse(true);
        }
    }

    public boolean s() {
        return this.a.g();
    }

    public void a(boolean z) {
        this.a.setCollapsible(z);
    }

    public void b(boolean z) {
    }

    public int t() {
        return this.p;
    }

    public void d(int i) {
        int i2 = this.p;
        if (i != i2) {
            switch (i2) {
                case 1:
                    if (this.d != null && this.d.getParent() == this.a) {
                        this.a.removeView(this.d);
                        break;
                    }
                case 2:
                    if (this.c != null && this.c.getParent() == this.a) {
                        this.a.removeView(this.c);
                        break;
                    }
            }
            this.p = i;
            switch (i) {
                case 0:
                    return;
                case 1:
                    C();
                    this.a.addView(this.d, 0);
                    return;
                case 2:
                    if (this.c != null) {
                        this.a.addView(this.c, 0);
                        b bVar = (b) this.c.getLayoutParams();
                        bVar.width = -2;
                        bVar.height = -2;
                        bVar.gravity = 8388691;
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
            }
        }
    }

    private void C() {
        if (this.d == null) {
            this.d = new x(b(), null, a.actionDropDownStyle);
            this.d.setLayoutParams(new b(-2, -2, 8388627));
        }
    }

    public void a(SpinnerAdapter spinnerAdapter, OnItemSelectedListener onItemSelectedListener) {
        C();
        this.d.setAdapter(spinnerAdapter);
        this.d.setOnItemSelectedListener(onItemSelectedListener);
    }

    public void e(int i) {
        if (this.d == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        this.d.setSelection(i);
    }

    public int u() {
        return this.d != null ? this.d.getSelectedItemPosition() : 0;
    }

    public int v() {
        return this.d != null ? this.d.getCount() : 0;
    }

    public void a(View view) {
        if (!(this.e == null || (this.b & 16) == 0)) {
            this.a.removeView(this.e);
        }
        this.e = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(this.e);
        }
    }

    public View w() {
        return this.e;
    }

    public az a(final int i, long j) {
        return ah.r(this.a).a(i == 0 ? TextTrackStyle.DEFAULT_FONT_SCALE : 0.0f).a(j).a(new be(this) {
            final /* synthetic */ ba b;
            private boolean c = false;

            public void onAnimationStart(View view) {
                this.b.a.setVisibility(0);
            }

            public void onAnimationEnd(View view) {
                if (!this.c) {
                    this.b.a.setVisibility(i);
                }
            }

            public void onAnimationCancel(View view) {
                this.c = true;
            }
        });
    }

    public void c(Drawable drawable) {
        this.h = drawable;
        E();
    }

    public void f(int i) {
        c(i != 0 ? l.a().a(b(), i) : null);
    }

    public void d(CharSequence charSequence) {
        this.l = charSequence;
        D();
    }

    public void g(int i) {
        d(i == 0 ? null : b().getString(i));
    }

    private void D() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.l)) {
            this.a.setNavigationContentDescription(this.r);
        } else {
            this.a.setNavigationContentDescription(this.l);
        }
    }

    private void E() {
        if ((this.b & 4) != 0) {
            this.a.setNavigationIcon(this.h != null ? this.h : this.s);
        }
    }

    public void d(Drawable drawable) {
        this.a.setBackgroundDrawable(drawable);
    }

    public int x() {
        return this.a.getHeight();
    }

    public void h(int i) {
        this.a.setVisibility(i);
    }

    public int y() {
        return this.a.getVisibility();
    }

    public void a(l.a aVar, android.support.v7.view.menu.f.a aVar2) {
        this.a.a(aVar, aVar2);
    }

    public Menu z() {
        return this.a.getMenu();
    }
}
