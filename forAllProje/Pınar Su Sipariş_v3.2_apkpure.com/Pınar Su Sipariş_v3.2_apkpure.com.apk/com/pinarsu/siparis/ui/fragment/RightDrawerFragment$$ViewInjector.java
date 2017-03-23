package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class RightDrawerFragment$$ViewInjector<T extends RightDrawerFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvAddress = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvAddress, "field 'tvAddress'"), R.id.tvAddress, "field 'tvAddress'");
        t.tvLastOrder = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvLastOrder, "field 'tvLastOrder'"), R.id.tvLastOrder, "field 'tvLastOrder'");
        View view = (View) finder.findRequiredView(obj, R.id.imPopup, "field 'imPopup' and method 'clickPopup'");
        t.imPopup = (ImageView) finder.castView(view, R.id.imPopup, "field 'imPopup'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickPopup();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.frameLastOrderRepeat, "method 'clickFrameLastOrderRepeat'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickFrameLastOrderRepeat();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.imBlob, "method 'clickBlob'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickBlob();
            }
        });
    }

    public void reset(T t) {
        t.tvAddress = null;
        t.tvLastOrder = null;
        t.imPopup = null;
    }
}
