package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class YesOrNoFragment$$ViewInjector<T extends YesOrNoFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvTitle = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle, "field 'tvTitle'"), R.id.tvTitle, "field 'tvTitle'");
        t.tvDetail = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvDetail, "field 'tvDetail'"), R.id.tvDetail, "field 'tvDetail'");
        View view = (View) finder.findRequiredView(obj, R.id.btnYes, "field 'btnYes' and method 'clickEdit'");
        t.btnYes = (Button) finder.castView(view, R.id.btnYes, "field 'btnYes'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickEdit();
            }
        });
        view = (View) finder.findRequiredView(obj, R.id.btnNo, "field 'btnNo' and method 'clickDelete'");
        t.btnNo = (Button) finder.castView(view, R.id.btnNo, "field 'btnNo'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickDelete();
            }
        });
    }

    public void reset(T t) {
        t.tvTitle = null;
        t.tvDetail = null;
        t.btnYes = null;
        t.btnNo = null;
    }
}
