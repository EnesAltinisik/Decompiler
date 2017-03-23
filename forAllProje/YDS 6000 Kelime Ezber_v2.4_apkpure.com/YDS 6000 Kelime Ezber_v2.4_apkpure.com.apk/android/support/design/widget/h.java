package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.design.R;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

abstract class h {
    static final Interpolator b = a.c;
    static final int[] j = new int[]{16842919, 16842910};
    static final int[] k = new int[]{16842908, 16842910};
    static final int[] l = new int[]{16842910};
    static final int[] m = new int[0];
    private final Rect a = new Rect();
    int c = 0;
    Drawable d;
    Drawable e;
    c f;
    Drawable g;
    float h;
    float i;
    final ab n;
    final n o;
    final d p;
    private OnPreDrawListener q;

    interface a {
        void a();

        void b();
    }

    h(ab abVar, n nVar, d dVar) {
        this.n = abVar;
        this.o = nVar;
        this.p = dVar;
    }

    private void o() {
        if (this.q == null) {
            this.q = new OnPreDrawListener(this) {
                final /* synthetic */ h a;

                {
                    this.a = r1;
                }

                public boolean onPreDraw() {
                    this.a.e();
                    return true;
                }
            };
        }
    }

    abstract float a();

    c a(int i, ColorStateList colorStateList) {
        Context context = this.n.getContext();
        c j = j();
        j.a(android.support.v4.c.a.c(context, R.color.design_fab_stroke_top_outer_color), android.support.v4.c.a.c(context, R.color.design_fab_stroke_top_inner_color), android.support.v4.c.a.c(context, R.color.design_fab_stroke_end_inner_color), android.support.v4.c.a.c(context, R.color.design_fab_stroke_end_outer_color));
        j.a((float) i);
        j.a(colorStateList);
        return j;
    }

    final void a(float f) {
        if (this.h != f) {
            this.h = f;
            a(f, this.i);
        }
    }

    abstract void a(float f, float f2);

    abstract void a(int i);

    abstract void a(ColorStateList colorStateList);

    abstract void a(ColorStateList colorStateList, Mode mode, int i, int i2);

    abstract void a(Mode mode);

    abstract void a(Rect rect);

    abstract void a(a aVar, boolean z);

    abstract void a(int[] iArr);

    abstract void b();

    final void b(float f) {
        if (this.i != f) {
            this.i = f;
            a(this.h, f);
        }
    }

    void b(Rect rect) {
    }

    abstract void b(a aVar, boolean z);

    abstract void c();

    boolean d() {
        return false;
    }

    void e() {
    }

    final Drawable f() {
        return this.g;
    }

    final void g() {
        Rect rect = this.a;
        a(rect);
        b(rect);
        this.o.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void h() {
        if (d()) {
            o();
            this.n.getViewTreeObserver().addOnPreDrawListener(this.q);
        }
    }

    void i() {
        if (this.q != null) {
            this.n.getViewTreeObserver().removeOnPreDrawListener(this.q);
            this.q = null;
        }
    }

    c j() {
        return new c();
    }

    GradientDrawable k() {
        GradientDrawable l = l();
        l.setShape(1);
        l.setColor(-1);
        return l;
    }

    GradientDrawable l() {
        return new GradientDrawable();
    }

    boolean m() {
        return this.n.getVisibility() != 0 ? this.c == 2 : this.c != 1;
    }

    boolean n() {
        return this.n.getVisibility() == 0 ? this.c == 1 : this.c != 2;
    }
}
