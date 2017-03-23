package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class HomeFragment$$ViewInjector<T extends HomeFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.lv, "field 'lv' and method 'itemClick'");
        t.lv = (ListView) finder.castView(view, R.id.lv, "field 'lv'");
        ((AdapterView) view).setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                t.itemClick(i);
            }
        });
        view = (View) finder.findRequiredView(obj, R.id.frameCampaigns, "field 'frameCampaigns' and method 'clickCampaigns'");
        t.frameCampaigns = (FrameLayout) finder.castView(view, R.id.frameCampaigns, "field 'frameCampaigns'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickCampaigns();
            }
        });
    }

    public void reset(T t) {
        t.lv = null;
        t.frameCampaigns = null;
    }
}
