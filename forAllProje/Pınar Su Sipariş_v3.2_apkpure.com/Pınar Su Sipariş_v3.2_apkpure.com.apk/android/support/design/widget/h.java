package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
/* compiled from: FloatingActionButtonLollipop */
class h extends f {
    private final Interpolator m;
    private InsetDrawable n;

    h(y yVar, m mVar) {
        super(yVar, mVar);
        this.m = yVar.isInEditMode() ? null : AnimationUtils.loadInterpolator(this.k.getContext(), 17563661);
    }

    void a(int i) {
        if (this.c instanceof RippleDrawable) {
            ((RippleDrawable) this.c).setColor(ColorStateList.valueOf(i));
        } else {
            super.a(i);
        }
    }

    public void a(float f) {
        this.k.setElevation(f);
        if (this.l.b()) {
            g();
        }
    }

    public float a() {
        return this.k.getElevation();
    }

    void c() {
        g();
    }

    void b(Rect rect) {
        if (this.l.b()) {
            this.n = new InsetDrawable(this.c, rect.left, rect.top, rect.right, rect.bottom);
            this.l.a(this.n);
            return;
        }
        this.l.a(this.c);
    }

    void a(int[] iArr) {
    }

    void b() {
    }

    boolean d() {
        return false;
    }

    void a(Rect rect) {
        if (this.l.b()) {
            float a = this.l.a();
            float a2 = a() + this.g;
            int ceil = (int) Math.ceil((double) l.b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) l.a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
