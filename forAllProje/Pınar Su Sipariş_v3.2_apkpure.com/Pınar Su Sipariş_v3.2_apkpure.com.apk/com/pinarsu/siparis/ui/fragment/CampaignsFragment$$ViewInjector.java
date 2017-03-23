package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class CampaignsFragment$$ViewInjector<T extends CampaignsFragment> implements Injector<T> {
    public void inject(Finder finder, T t, Object obj) {
        t.lv = (ListView) finder.castView((View) finder.findRequiredView(obj, R.id.lv, "field 'lv'"), R.id.lv, "field 'lv'");
        t.tvNoRecord = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvNoRecord, "field 'tvNoRecord'"), R.id.tvNoRecord, "field 'tvNoRecord'");
    }

    public void reset(T t) {
        t.lv = null;
        t.tvNoRecord = null;
    }
}
