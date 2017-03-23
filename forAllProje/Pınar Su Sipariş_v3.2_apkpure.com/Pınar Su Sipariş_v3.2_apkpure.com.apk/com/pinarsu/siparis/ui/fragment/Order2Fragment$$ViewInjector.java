package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class Order2Fragment$$ViewInjector<T extends Order2Fragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.lv = (ListView) finder.castView((View) finder.findRequiredView(obj, R.id.lv, "field 'lv'"), R.id.lv, "field 'lv'");
        ((View) finder.findRequiredView(obj, R.id.tvContinue, "method 'clickContinue'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickContinue();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.imAddAnotherProduct, "method 'clickAddAnotherProduct'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickAddAnotherProduct();
            }
        });
    }

    public void reset(T t) {
        t.lv = null;
    }
}
