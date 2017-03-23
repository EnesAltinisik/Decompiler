package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class ReminderFragment$$ViewInjector<T extends ReminderFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.lv = (ListView) finder.castView((View) finder.findRequiredView(obj, R.id.lv, "field 'lv'"), R.id.lv, "field 'lv'");
        t.tvNoRecord = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvNoRecord, "field 'tvNoRecord'"), R.id.tvNoRecord, "field 'tvNoRecord'");
        ((View) finder.findRequiredView(obj, R.id.frameAdd, "method 'clickAdd'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickAdd();
            }
        });
    }

    public void reset(T t) {
        t.lv = null;
        t.tvNoRecord = null;
    }
}
