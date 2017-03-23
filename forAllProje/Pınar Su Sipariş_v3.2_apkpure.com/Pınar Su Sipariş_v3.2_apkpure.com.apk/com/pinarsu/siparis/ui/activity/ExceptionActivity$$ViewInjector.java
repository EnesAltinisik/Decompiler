package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class ExceptionActivity$$ViewInjector<T extends ExceptionActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvError = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvError, "field 'tvError'"), R.id.tvError, "field 'tvError'");
        View view = (View) finder.findRequiredView(obj, R.id.linear, "field 'linear' and method 'restart'");
        t.linear = (LinearLayout) finder.castView(view, R.id.linear, "field 'linear'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.restart();
            }
        });
    }

    public void reset(T t) {
        t.tvError = null;
        t.linear = null;
    }
}
