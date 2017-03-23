package com.gigamole.infinitecycleviewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.g;
import android.support.v4.view.aa;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Interpolator;

public class HorizontalInfiniteCycleViewPager extends ViewPager implements f {
    private a d;

    public HorizontalInfiniteCycleViewPager(Context context) {
        super(context);
        a(context, null);
    }

    public HorizontalInfiniteCycleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.d = new a(context, this, attributeSet);
    }

    public void a(int i, boolean z) {
        if (this.d != null) {
            super.a(this.d.b(i), true);
        }
    }

    public void a(boolean z, g gVar) {
        if (this.d != null) {
            gVar = this.d.i();
        }
        super.a(false, gVar);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
    }

    protected boolean addViewInLayout(View view, int i, LayoutParams layoutParams) {
        return super.addViewInLayout(view, 0, layoutParams);
    }

    public aa getAdapter() {
        return this.d == null ? super.getAdapter() : this.d.j() == null ? super.getAdapter() : this.d.j().c();
    }

    public float getCenterPageScaleOffset() {
        return this.d == null ? 0.0f : this.d.b();
    }

    public Interpolator getInterpolator() {
        return this.d == null ? null : this.d.f();
    }

    public float getMaxPageScale() {
        return this.d == null ? 0.0f : this.d.d();
    }

    public float getMinPageScale() {
        return this.d == null ? 0.0f : this.d.c();
    }

    public float getMinPageScaleOffset() {
        return this.d == null ? 0.0f : this.d.a();
    }

    public d getOnInfiniteCyclePageTransformListener() {
        return this.d == null ? null : this.d.h();
    }

    public int getRealItem() {
        return this.d == null ? getCurrentItem() : this.d.k();
    }

    public int getScrollDuration() {
        return this.d == null ? 0 : this.d.e();
    }

    public int getState() {
        return this.d == null ? 0 : this.d.g();
    }

    protected void onDetachedFromWindow() {
        if (this.d != null) {
            this.d.o();
        }
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return this.d == null ? super.onInterceptTouchEvent(motionEvent) : this.d.b(motionEvent) && super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return this.d == null ? super.onTouchEvent(motionEvent) : this.d.a(motionEvent) && super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.d != null) {
            this.d.b(z);
        }
        super.onWindowFocusChanged(z);
    }

    public void setAdapter(aa aaVar) {
        if (this.d == null) {
            super.setAdapter(aaVar);
            return;
        }
        super.setAdapter(this.d.a(aaVar));
        this.d.n();
    }

    public void setCenterPageScaleOffset(float f) {
        if (this.d != null) {
            this.d.b(f);
        }
    }

    protected void setChildrenDrawingCacheEnabled(boolean z) {
        super.setChildrenDrawingCacheEnabled(false);
    }

    protected void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(false);
    }

    public void setClipChildren(boolean z) {
        super.setClipChildren(false);
    }

    public void setCurrentItem(int i) {
        a(i, true);
    }

    public void setDrawingCacheEnabled(boolean z) {
        super.setDrawingCacheEnabled(false);
    }

    public void setInterpolator(Interpolator interpolator) {
        if (this.d != null) {
            this.d.a(interpolator);
        }
    }

    public void setMaxPageScale(float f) {
        if (this.d != null) {
            this.d.d(f);
        }
    }

    public void setMediumScaled(boolean z) {
        if (this.d != null) {
            this.d.a(z);
        }
    }

    public void setMinPageScale(float f) {
        if (this.d != null) {
            this.d.c(f);
        }
    }

    public void setMinPageScaleOffset(float f) {
        if (this.d != null) {
            this.d.a(f);
        }
    }

    public void setOffscreenPageLimit(int i) {
        super.setOffscreenPageLimit(2);
    }

    public void setOnInfiniteCyclePageTransformListener(d dVar) {
        if (this.d != null) {
            this.d.a(dVar);
        }
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(2);
    }

    public void setPageMargin(int i) {
        super.setPageMargin(0);
    }

    public void setScrollDuration(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void setWillNotCacheDrawing(boolean z) {
        super.setWillNotCacheDrawing(true);
    }
}
