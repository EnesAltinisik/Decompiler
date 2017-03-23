package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class AddressCheckActivity$$ViewInjector<T extends AddressCheckActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvFoundRecord = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvFoundRecord, "field 'tvFoundRecord'"), R.id.tvFoundRecord, "field 'tvFoundRecord'");
        t.tvTitle = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle, "field 'tvTitle'"), R.id.tvTitle, "field 'tvTitle'");
        t.tvAddress = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAddress, "field 'tvAddress'"), R.id.tvAddress, "field 'tvAddress'");
        ((View) finder.findRequiredView(obj, R.id.linearAddressFalse, "method 'clickFalse'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickFalse();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.linearAddressTrue, "method 'clickTrue'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickTrue();
            }
        });
    }

    public void reset(T t) {
        t.tvFoundRecord = null;
        t.tvTitle = null;
        t.tvAddress = null;
    }
}
