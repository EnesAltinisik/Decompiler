package com.pinarsu.siparis.ui.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class BaseActivity$$ViewInjector<T extends BaseActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.toolbar = (Toolbar) finder.castView((View) finder.findRequiredView(obj, R.id.toolbar, "field 'toolbar'"), R.id.toolbar, "field 'toolbar'");
        t.imLogo = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLogo, "field 'imLogo'"), R.id.imLogo, "field 'imLogo'");
        t.tvTitle = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle, "field 'tvTitle'"), R.id.tvTitle, "field 'tvTitle'");
        t.imLeftMenu = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLeftMenu, "field 'imLeftMenu'"), R.id.imLeftMenu, "field 'imLeftMenu'");
        t.imRightMenu = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imRightMenu, "field 'imRightMenu'"), R.id.imRightMenu, "field 'imRightMenu'");
        View view = (View) finder.findRequiredView(obj, R.id.imBack, "field 'imBack' and method 'clickBack'");
        t.imBack = (ImageView) finder.castView(view, R.id.imBack, "field 'imBack'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickBack();
            }
        });
    }

    public void reset(T t) {
        t.toolbar = null;
        t.imLogo = null;
        t.tvTitle = null;
        t.imLeftMenu = null;
        t.imRightMenu = null;
        t.imBack = null;
    }
}
