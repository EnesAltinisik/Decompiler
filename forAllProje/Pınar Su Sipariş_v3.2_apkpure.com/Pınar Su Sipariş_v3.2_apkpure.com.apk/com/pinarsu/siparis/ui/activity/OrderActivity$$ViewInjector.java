package com.pinarsu.siparis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class OrderActivity$$ViewInjector<T extends OrderActivity> extends BaseActivity$$ViewInjector<T> {
    public void inject(Finder finder, T t, Object obj) {
        super.inject(finder, (BaseActivity) t, obj);
        t.tvStep1 = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvStep1, "field 'tvStep1'"), R.id.tvStep1, "field 'tvStep1'");
        t.tvStep2 = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvStep2, "field 'tvStep2'"), R.id.tvStep2, "field 'tvStep2'");
        t.tvStep3 = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvStep3, "field 'tvStep3'"), R.id.tvStep3, "field 'tvStep3'");
    }

    public void reset(T t) {
        super.reset((BaseActivity) t);
        t.tvStep1 = null;
        t.tvStep2 = null;
        t.tvStep3 = null;
    }
}
