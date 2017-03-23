package com.pinarsu.siparis.ui.activity;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.ViewPagerIndicator;

public class SurveyActivity$$ViewInjector<T extends SurveyActivity> extends BaseActivity$$ViewInjector<T> {
    public void inject(Finder finder, T t, Object obj) {
        super.inject(finder, (BaseActivity) t, obj);
        t.viewPager = (ViewPager) finder.castView((View) finder.findRequiredView(obj, R.id.viewPager, "field 'viewPager'"), R.id.viewPager, "field 'viewPager'");
        t.indicator = (ViewPagerIndicator) finder.castView((View) finder.findRequiredView(obj, R.id.indicator, "field 'indicator'"), R.id.indicator, "field 'indicator'");
        t.tvProgress = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvProgress, "field 'tvProgress'"), R.id.tvProgress, "field 'tvProgress'");
        t.tvTotalSize = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTotalSize, "field 'tvTotalSize'"), R.id.tvTotalSize, "field 'tvTotalSize'");
    }

    public void reset(T t) {
        super.reset((BaseActivity) t);
        t.viewPager = null;
        t.indicator = null;
        t.tvProgress = null;
        t.tvTotalSize = null;
    }
}
