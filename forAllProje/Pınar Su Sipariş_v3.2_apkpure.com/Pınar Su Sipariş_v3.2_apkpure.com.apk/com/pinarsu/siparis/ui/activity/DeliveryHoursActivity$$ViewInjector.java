package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.AnimatedExpandableListView;
import com.pinarsu.siparis.view.TextView;

public class DeliveryHoursActivity$$ViewInjector<T extends DeliveryHoursActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
        t.lv = (AnimatedExpandableListView) finder.castView((View) finder.findRequiredView(obj, R.id.lv, "field 'lv'"), R.id.lv, "field 'lv'");
        View view = (View) finder.findRequiredView(obj, R.id.imBack, "field 'imBack' and method 'clickBack'");
        t.imBack = (ImageView) finder.castView(view, R.id.imBack, "field 'imBack'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.clickBack();
            }
        });
        t.imLeftMenu = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLeftMenu, "field 'imLeftMenu'"), R.id.imLeftMenu, "field 'imLeftMenu'");
        t.imLogo = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.imLogo, "field 'imLogo'"), R.id.imLogo, "field 'imLogo'");
        t.tvTitle = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle, "field 'tvTitle'"), R.id.tvTitle, "field 'tvTitle'");
    }

    public void reset(T t) {
        t.lv = null;
        t.imBack = null;
        t.imLeftMenu = null;
        t.imLogo = null;
        t.tvTitle = null;
    }
}
