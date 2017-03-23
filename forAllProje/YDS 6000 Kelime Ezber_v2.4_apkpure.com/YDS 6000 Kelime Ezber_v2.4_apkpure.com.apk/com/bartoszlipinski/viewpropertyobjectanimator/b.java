package com.bartoszlipinski.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

class b extends a implements AnimatorUpdateListener {
    private final LayoutParams b;
    private a c;
    private a d;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (a()) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (this.c != null) {
                this.b.width = (int) a((float) this.c.a, (float) this.c.b, animatedFraction);
            }
            if (this.d != null) {
                this.b.height = (int) a((float) this.d.a, (float) this.d.b, animatedFraction);
            }
            ((View) this.a.get()).requestLayout();
        }
    }
}
