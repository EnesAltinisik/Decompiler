package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;

public class TutorialViewPagerFragment$$ViewInjector<T extends TutorialViewPagerFragment> implements Injector<T> {
    public void inject(Finder finder, T t, Object obj) {
        t.im = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.im, "field 'im'"), R.id.im, "field 'im'");
    }

    public void reset(T t) {
        t.im = null;
    }
}
