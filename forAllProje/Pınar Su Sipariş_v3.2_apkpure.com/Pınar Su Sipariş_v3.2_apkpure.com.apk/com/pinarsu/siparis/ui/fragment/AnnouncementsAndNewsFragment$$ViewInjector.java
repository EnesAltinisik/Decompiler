package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;

public class AnnouncementsAndNewsFragment$$ViewInjector<T extends AnnouncementsAndNewsFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.lv, "field 'lv' and method 'onItemClickLV'");
        t.lv = (ListView) finder.castView(view, R.id.lv, "field 'lv'");
        ((AdapterView) view).setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                t.onItemClickLV(i);
            }
        });
        t.tvNoRecord = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvNoRecord, "field 'tvNoRecord'"), R.id.tvNoRecord, "field 'tvNoRecord'");
    }

    public void reset(T t) {
        t.lv = null;
        t.tvNoRecord = null;
    }
}
