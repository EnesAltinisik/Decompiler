package com.pinarsu.siparis.ui.activity;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.ViewPagerIndicator;

public class TutorialActivity$$ViewInjector<T extends TutorialActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.viewPager = (ViewPager) finder.castView((View) finder.findRequiredView(obj, R.id.viewPager, "field 'viewPager'"), R.id.viewPager, "field 'viewPager'");
        t.indicator = (ViewPagerIndicator) finder.castView((View) finder.findRequiredView(obj, R.id.indicator, "field 'indicator'"), R.id.indicator, "field 'indicator'");
        View view = (View) finder.findRequiredView(obj, R.id.imSkip, "field 'imSkip' and method 'clickSkip'");
        t.imSkip = (ImageView) finder.castView(view, R.id.imSkip, "field 'imSkip'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickSkip();
            }
        });
    }

    public void reset(T t) {
        t.viewPager = null;
        t.indicator = null;
        t.imSkip = null;
    }
}
