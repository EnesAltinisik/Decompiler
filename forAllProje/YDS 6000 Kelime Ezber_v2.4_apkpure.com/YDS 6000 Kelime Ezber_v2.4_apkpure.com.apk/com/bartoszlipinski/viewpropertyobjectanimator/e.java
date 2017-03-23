package com.bartoszlipinski.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class e extends a implements AnimatorUpdateListener {
    private a b;
    private a c;

    private int b() {
        return a() ? ((View) this.a.get()).getScrollX() : 0;
    }

    private int c() {
        return a() ? ((View) this.a.get()).getScrollY() : 0;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (a()) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int b = b();
            int c = c();
            int a = this.b != null ? (int) a((float) this.b.a, (float) this.b.b, animatedFraction) : b;
            if (this.c != null) {
                c = (int) a((float) this.c.a, (float) this.c.b, animatedFraction);
            }
            ((View) this.a.get()).scrollTo(a, c);
        }
    }
}
