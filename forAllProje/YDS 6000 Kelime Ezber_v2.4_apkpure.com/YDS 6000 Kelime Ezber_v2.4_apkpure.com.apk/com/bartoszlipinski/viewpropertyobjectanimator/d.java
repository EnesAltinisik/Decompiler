package com.bartoszlipinski.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class d extends a implements AnimatorUpdateListener {
    private a b;
    private a c;
    private a d;
    private a e;

    private int b() {
        return a() ? ((View) this.a.get()).getPaddingLeft() : 0;
    }

    private int c() {
        return a() ? ((View) this.a.get()).getPaddingTop() : 0;
    }

    private int d() {
        return a() ? ((View) this.a.get()).getPaddingRight() : 0;
    }

    private int e() {
        return a() ? ((View) this.a.get()).getPaddingBottom() : 0;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (a()) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int b = b();
            int c = c();
            int d = d();
            int e = e();
            int a = this.b != null ? (int) a((float) this.b.a, (float) this.b.b, animatedFraction) : b;
            if (this.c != null) {
                c = (int) a((float) this.c.a, (float) this.c.b, animatedFraction);
            }
            if (this.d != null) {
                d = (int) a((float) this.d.a, (float) this.d.b, animatedFraction);
            }
            if (this.e != null) {
                e = (int) a((float) this.e.a, (float) this.e.b, animatedFraction);
            }
            ((View) this.a.get()).setPadding(a, c, d, e);
        }
    }
}
