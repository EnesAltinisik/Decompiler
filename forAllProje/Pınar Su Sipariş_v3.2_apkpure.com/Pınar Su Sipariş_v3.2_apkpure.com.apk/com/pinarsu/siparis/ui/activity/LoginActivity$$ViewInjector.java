package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.EditText;

public class LoginActivity$$ViewInjector<T extends LoginActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.imLeftMenu = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLeftMenu, "field 'imLeftMenu'"), R.id.imLeftMenu, "field 'imLeftMenu'");
        t.edPhoneNumber = (EditText) finder.castView((View) finder.findRequiredView(obj, R.id.edPhoneNumber, "field 'edPhoneNumber'"), R.id.edPhoneNumber, "field 'edPhoneNumber'");
        View view = (View) finder.findRequiredView(obj, R.id.imHome, "field 'imHome' and method 'clickHome'");
        t.imHome = (ImageView) finder.castView(view, R.id.imHome, "field 'imHome'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickHome();
            }
        });
        ((View) finder.findRequiredView(obj, R.id.linearLogin, "method 'clickLogin'")).setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickLogin();
            }
        });
    }

    public void reset(T t) {
        t.imLeftMenu = null;
        t.edPhoneNumber = null;
        t.imHome = null;
    }
}
