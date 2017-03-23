package com.pinarsu.siparis.ui.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class MainActivity$$ViewInjector<T extends MainActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        View view = (View) finder.findRequiredView(obj, R.id.imLeftMenu, "field 'imLeftMenu' and method 'clickImLeftMenu'");
        t.imLeftMenu = (ImageView) finder.castView(view, R.id.imLeftMenu, "field 'imLeftMenu'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickImLeftMenu();
            }
        });
        view = (View) finder.findRequiredView(obj, R.id.imRightMenu, "field 'imRightMenu' and method 'clickImRightMenu'");
        t.imRightMenu = (ImageView) finder.castView(view, R.id.imRightMenu, "field 'imRightMenu'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickImRightMenu();
            }
        });
        t.toolbar = (Toolbar) finder.castView((View) finder.findRequiredView(obj, R.id.toolbar, "field 'toolbar'"), R.id.toolbar, "field 'toolbar'");
        t.imLogo = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLogo, "field 'imLogo'"), R.id.imLogo, "field 'imLogo'");
        t.tvTitle = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle, "field 'tvTitle'"), R.id.tvTitle, "field 'tvTitle'");
        t.imBack = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imBack, "field 'imBack'"), R.id.imBack, "field 'imBack'");
        view = (View) finder.findRequiredView(obj, R.id.tvLogin, "field 'tvLogin' and method 'login'");
        t.tvLogin = (TextView) finder.castView(view, R.id.tvLogin, "field 'tvLogin'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.login();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.linearExit, "method 'onClick'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.onClick(view);
            }
        });
    }

    public void reset(T t) {
        t.imLeftMenu = null;
        t.imRightMenu = null;
        t.toolbar = null;
        t.imLogo = null;
        t.tvTitle = null;
        t.imBack = null;
        t.tvLogin = null;
    }
}
