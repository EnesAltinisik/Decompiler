package com.fodlam.yds.utility;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.lang.reflect.Field;

public class OxfordViewPager extends ViewPager {

    public class a extends Scroller {
        final /* synthetic */ OxfordViewPager a;

        public a(OxfordViewPager oxfordViewPager, Context context) {
            this.a = oxfordViewPager;
            super(context, new DecelerateInterpolator());
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, 600);
        }
    }

    public OxfordViewPager(Context context) {
        super(context);
    }

    public OxfordViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new a(this, getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
