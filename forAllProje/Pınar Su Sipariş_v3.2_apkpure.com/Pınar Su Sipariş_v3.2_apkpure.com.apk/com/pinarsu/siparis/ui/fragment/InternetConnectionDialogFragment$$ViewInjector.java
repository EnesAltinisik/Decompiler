package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class InternetConnectionDialogFragment$$ViewInjector<T extends InternetConnectionDialogFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.tvMessage = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvMessage, "field 'tvMessage'"), R.id.tvMessage, "field 'tvMessage'");
        ((View) finder.findRequiredView(obj, R.id.btnOk, "method 'clickOk'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickOk();
            }
        });
    }

    public void reset(T t) {
        t.tvMessage = null;
    }
}
