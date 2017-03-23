package com.pinarsu.siparis.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class MainLastOrderDialogFragment$$ViewInjector<T extends MainLastOrderDialogFragment> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        ((View) finder.findRequiredView(obj, R.id.imHomePopup, "method 'clickOk'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickOk();
            }
        });
    }

    public void reset(T t) {
    }
}
