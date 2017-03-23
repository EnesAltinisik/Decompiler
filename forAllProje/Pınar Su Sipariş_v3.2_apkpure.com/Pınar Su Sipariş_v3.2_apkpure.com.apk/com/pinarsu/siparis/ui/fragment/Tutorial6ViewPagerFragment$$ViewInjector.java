package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class Tutorial6ViewPagerFragment$$ViewInjector<T extends Tutorial6ViewPagerFragment> implements Injector<T> {
    public void inject(Finder finder, T t, Object obj) {
        t.linearParent = (LinearLayout) finder.castView((View) finder.findRequiredView(obj, R.id.linearParent, "field 'linearParent'"), R.id.linearParent, "field 'linearParent'");
        t.tvTryApp = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTryApp, "field 'tvTryApp'"), R.id.tvTryApp, "field 'tvTryApp'");
        t.tvLogin = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvLogin, "field 'tvLogin'"), R.id.tvLogin, "field 'tvLogin'");
    }

    public void reset(T t) {
        t.linearParent = null;
        t.tvTryApp = null;
        t.tvLogin = null;
    }
}
