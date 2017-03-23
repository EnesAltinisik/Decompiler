package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class Order1Fragment$$ViewInjector<T extends Order1Fragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvAddressLabel = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAddressLabel, "field 'tvAddressLabel'"), R.id.tvAddressLabel, "field 'tvAddressLabel'");
        t.tvAddressDetail = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAddressDetail, "field 'tvAddressDetail'"), R.id.tvAddressDetail, "field 'tvAddressDetail'");
        ((View) finder.findRequiredView(obj, R.id.tvContinue, "method 'clickContinue'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickContinue();
            }
        });
    }

    public void reset(T t) {
        t.tvAddressLabel = null;
        t.tvAddressDetail = null;
    }
}
