package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class AllAddressActivity$$ViewInjector<T extends AllAddressActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.lv, "field 'lv' and method 'onItemClick'");
        t.lv = (ListView) finder.castView(view, R.id.lv, "field 'lv'");
        ((AdapterView) view).setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                t.onItemClick(i);
            }
        });
        view = (View) finder.findRequiredView(obj, R.id.frameAdd, "field 'frameAdd' and method 'clickFrameAdd'");
        t.frameAdd = (FrameLayout) finder.castView(view, R.id.frameAdd, "field 'frameAdd'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickFrameAdd();
            }
        });
    }

    public void reset(T t) {
        t.lv = null;
        t.frameAdd = null;
    }
}
