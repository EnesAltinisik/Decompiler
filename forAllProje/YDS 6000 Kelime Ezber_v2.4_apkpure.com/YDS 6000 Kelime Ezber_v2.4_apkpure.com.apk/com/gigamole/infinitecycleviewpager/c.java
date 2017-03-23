package com.gigamole.infinitecycleviewpager;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

class c extends Scroller {
    private int a;

    public c(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public void a(int i) {
        this.a = i;
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.a);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.a);
    }
}
