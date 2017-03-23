package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class SurveyViewPagerFragment$$ViewInjector<T extends SurveyViewPagerFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.lv, "field 'lv' and method 'onItemClickLv'");
        t.lv = (ListView) finder.castView(view, R.id.lv, "field 'lv'");
        ((AdapterView) view).setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                t.onItemClickLv(i);
            }
        });
        t.tvTitle = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle, "field 'tvTitle'"), R.id.tvTitle, "field 'tvTitle'");
        view = (View) finder.findRequiredView(obj, R.id.tvContinue, "field 'tvContinue' and method 'clickContinue'");
        t.tvContinue = (TextView) finder.castView(view, R.id.tvContinue, "field 'tvContinue'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickContinue();
            }
        });
        t.edDesc = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edDesc, "field 'edDesc'"), R.id.edDesc, "field 'edDesc'");
    }

    public void reset(T t) {
        t.lv = null;
        t.tvTitle = null;
        t.tvContinue = null;
        t.edDesc = null;
    }
}
