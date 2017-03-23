package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class Order4Activity$$ViewInjector<T extends Order4Activity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvAmount = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAmount, "field 'tvAmount'"), R.id.tvAmount, "field 'tvAmount'");
        t.tvMessage = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvMessage, "field 'tvMessage'"), R.id.tvMessage, "field 'tvMessage'");
        ((View) finder.findRequiredView(obj, R.id.btnOk, "method 'clickOk'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickOk();
            }
        });
    }

    public void reset(T t) {
        t.tvAmount = null;
        t.tvMessage = null;
    }
}
