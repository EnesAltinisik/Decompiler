package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class ProfileFragment$$ViewInjector<T extends ProfileFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.linearMyRegisteredAddress, "field 'linearMyRegisteredAddress' and method 'clickMyRegisteredAddress'");
        t.linearMyRegisteredAddress = (LinearLayout) finder.castView(view, R.id.linearMyRegisteredAddress, "field 'linearMyRegisteredAddress'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickMyRegisteredAddress();
            }
        });
        t.toggleButton = (ToggleButton) finder.castView((View) finder.findRequiredView(obj, R.id.toggleButton, "field 'toggleButton'"), R.id.toggleButton, "field 'toggleButton'");
        t.tvFirstLastName = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvFirstLastName, "field 'tvFirstLastName'"), R.id.tvFirstLastName, "field 'tvFirstLastName'");
        ((View) finder.findRequiredView(obj, R.id.linearSSS, "method 'clickSSS'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickSSS();
            }
        });
    }

    public void reset(T t) {
        t.linearMyRegisteredAddress = null;
        t.toggleButton = null;
        t.tvFirstLastName = null;
    }
}
