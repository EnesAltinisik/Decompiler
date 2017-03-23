package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: FloatingActionButtonImpl */
abstract class g {
    static final int[] h = new int[]{16842919, 16842910};
    static final int[] i = new int[]{16842908, 16842910};
    static final int[] j = new int[0];
    private final Rect a = new Rect();
    Drawable b;
    Drawable c;
    b d;
    Drawable e;
    float f;
    float g;
    final y k;
    final m l;
    private OnPreDrawListener m;

    /* compiled from: FloatingActionButtonImpl */
    interface a {
        void a();

        void b();
    }

    abstract float a();

    abstract void a(float f);

    abstract void a(int i);

    abstract void a(ColorStateList colorStateList);

    abstract void a(Mode mode);

    abstract void a(Rect rect);

    abstract void a(a aVar, boolean z);

    abstract void a(int[] iArr);

    abstract void b();

    abstract void b(a aVar, boolean z);

    abstract void c();

    g(y yVar, m mVar) {
        this.k = yVar;
        this.l = mVar;
    }

    final void b(float f) {
        if (this.f != f) {
            this.f = f;
            a(f);
        }
    }

    final Drawable f() {
        return this.e;
    }

    final void g() {
        Rect rect = this.a;
        a(rect);
        b(rect);
        this.l.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void b(Rect rect) {
    }

    void h() {
        if (d()) {
            j();
            this.k.getViewTreeObserver().addOnPreDrawListener(this.m);
        }
    }

    void i() {
        if (this.m != null) {
            this.k.getViewTreeObserver().removeOnPreDrawListener(this.m);
            this.m = null;
        }
    }

    boolean d() {
        return false;
    }

    void e() {
    }

    private void j() {
        if (this.m == null) {
            this.m = new OnPreDrawListener(this) {
                final /* synthetic */ g a;

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
}
