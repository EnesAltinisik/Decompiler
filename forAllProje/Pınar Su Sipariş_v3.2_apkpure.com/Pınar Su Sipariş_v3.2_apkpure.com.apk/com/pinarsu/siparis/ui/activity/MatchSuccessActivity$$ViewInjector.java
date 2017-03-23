package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;

public class MatchSuccessActivity$$ViewInjector<T extends MatchSuccessActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.imMatchSuccess, "field 'imMatchSuccess' and method 'clickImMatchSuccess'");
        t.imMatchSuccess = (ImageView) finder.castView(view, R.id.imMatchSuccess, "field 'imMatchSuccess'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickImMatchSuccess();
            }
        });
        t.imLeftMenu = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLeftMenu, "field 'imLeftMenu'"), R.id.imLeftMenu, "field 'imLeftMenu'");
    }

    public void reset(T t) {
        t.imMatchSuccess = null;
        t.imLeftMenu = null;
    }
}
