package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class InfoCallAlertDialogFragment$$ViewInjector<T extends InfoCallAlertDialogFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.btnOk, "field 'btnOk' and method 'clickYes'");
        t.btnOk = (Button) finder.castView(view, R.id.btnOk, "field 'btnOk'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickYes();
            }
        });
        view = (View) finder.findRequiredView(obj, R.id.btnCall, "field 'btnCall' and method 'clickNo'");
        t.btnCall = (Button) finder.castView(view, R.id.btnCall, "field 'btnCall'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickNo();
            }
        });
        t.tvDetail = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvDetail, "field 'tvDetail'"), R.id.tvDetail, "field 'tvDetail'");
        t.viewGap = (View) finder.findRequiredView(obj, R.id.viewGap, "field 'viewGap'");
    }

    public void reset(T t) {
        t.btnOk = null;
        t.btnCall = null;
        t.tvDetail = null;
        t.viewGap = null;
    }
}
