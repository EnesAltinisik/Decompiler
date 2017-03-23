package com.pinarsu.siparis.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IIndicatorPageSelectionListener;
import java.lang.reflect.Field;

public class ViewPagerIndicator extends LinearLayout implements f {
    public static final int DEFAULT_INDICATOR_SPACING = 5;
    private int activePosition;
    private IIndicatorPageSelectionListener delegatePageSelectionListener;
    private int indicatorSpacing;
    private f userDefinedPageChangeListener;

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CirclePageIndicator, 0, 0);
        try {
            this.indicatorSpacing = obtainStyledAttributes.getDimensionPixelSize(0, 5);
            init();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setDelegatePageSelectionListener(IIndicatorPageSelectionListener iIndicatorPageSelectionListener) {
        this.delegatePageSelectionListener = iIndicatorPageSelectionListener;
    }

    private void init() {
        setOrientation(0);
        if (!(getLayoutParams() instanceof LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 8388691;
            setLayoutParams(layoutParams);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.userDefinedPageChangeListener = getOnPageChangeListener(viewPager);
        viewPager.setOnPageChangeListener(this);
        addIndicator(viewPager.getAdapter().getCount());
    }

    private void addIndicator(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            View imageView = new ImageView(getContext());
            int dimension = (int) getResources().getDimension(R.dimen.indicator_item_width);
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
            layoutParams.leftMargin = this.indicatorSpacing;
            layoutParams.rightMargin = this.indicatorSpacing;
            imageView.setImageResource(R.drawable.viewpager_indicator_stroke2);
            addView(imageView, layoutParams);
        }
        if (i > 0) {
            ((ImageView) getChildAt(0)).setImageResource(R.drawable.viewpager_indicator_solid22);
        }
    }

    private void updateIndicator(int i) {
        if (this.activePosition != i) {
            ((ImageView) getChildAt(this.activePosition)).setImageResource(R.drawable.viewpager_indicator_stroke2);
            ((ImageView) getChildAt(i)).setImageResource(R.drawable.viewpager_indicator_solid22);
            this.activePosition = i;
        }
    }

    private f getOnPageChangeListener(ViewPager viewPager) {
        try {
            Field declaredField = viewPager.getClass().getDeclaredField("mOnPageChangeListener");
            declaredField.setAccessible(true);
            return (f) declaredField.get(viewPager);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    private int dp2px(float f) {
        return (int) (getContext().getResources().getDisplayMetrics().density * f);
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.userDefinedPageChangeListener != null) {
            this.userDefinedPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        updateIndicator(i);
        if (this.userDefinedPageChangeListener != null) {
            this.userDefinedPageChangeListener.onPageSelected(i);
        }
        if (this.delegatePageSelectionListener != null) {
            this.delegatePageSelectionListener.onPageSelected(i);
        }
        Log.d("MNTTAG", "onPageSelected : " + i);
    }

    public void onPageScrollStateChanged(int i) {
        if (this.userDefinedPageChangeListener != null) {
            this.userDefinedPageChangeListener.onPageScrollStateChanged(i);
        }
    }
}
