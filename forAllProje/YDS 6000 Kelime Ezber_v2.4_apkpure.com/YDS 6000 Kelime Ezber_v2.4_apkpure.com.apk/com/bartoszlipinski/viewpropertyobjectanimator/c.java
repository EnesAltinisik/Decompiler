package com.bartoszlipinski.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

class c extends a implements AnimatorUpdateListener {
    private final MarginLayoutParams b;
    private a c;
    private a d;
    private a e;
    private a f;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (a()) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (this.c != null) {
                this.b.leftMargin = (int) a((float) this.c.a, (float) this.c.b, animatedFraction);
            }
            if (this.d != null) {
                this.b.topMargin = (int) a((float) this.d.a, (float) this.d.b, animatedFraction);
            }
            if (this.e != null) {
                this.b.rightMargin = (int) a((float) this.e.a, (float) this.e.b, animatedFraction);
            }
            if (this.f != null) {
                this.b.bottomMargin = (int) a((float) this.f.a, (float) this.f.b, animatedFraction);
            }
            ((View) this.a.get()).requestLayout();
        }
    }
}
