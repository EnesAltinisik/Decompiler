package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;

public class OrderSummaryFragment$$ViewInjector<T extends OrderSummaryFragment> implements Injector<T> {
    public void inject(Finder finder, T t, Object obj) {
        t.lv = (ListView) finder.castView((View) finder.findRequiredView(obj, R.id.lv, "field 'lv'"), R.id.lv, "field 'lv'");
        t.tvInfo = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvInfo, "field 'tvInfo'"), R.id.tvInfo, "field 'tvInfo'");
    }

    public void reset(T t) {
        t.lv = null;
        t.tvInfo = null;
    }
}
