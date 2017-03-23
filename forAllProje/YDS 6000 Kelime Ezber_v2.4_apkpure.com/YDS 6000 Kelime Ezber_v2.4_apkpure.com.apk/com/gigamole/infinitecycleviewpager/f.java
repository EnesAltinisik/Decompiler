package com.gigamole.infinitecycleviewpager;

import android.support.v4.view.ViewPager.g;
import android.support.v4.view.aa;
import android.view.View;

interface f {
    void a(android.support.v4.view.ViewPager.f fVar);

    void a(boolean z, g gVar);

    void b(float f);

    boolean d();

    void e();

    boolean f();

    aa getAdapter();

    View getChildAt(int i);

    int getChildCount();

    int getCurrentItem();

    boolean hasWindowFocus();

    boolean post(Runnable runnable);

    void setClipChildren(boolean z);

    void setCurrentItem(int i);

    void setDrawingCacheEnabled(boolean z);

    void setOffscreenPageLimit(int i);

    void setOverScrollMode(int i);

    void setPageMargin(int i);

    void setWillNotCacheDrawing(boolean z);
}
