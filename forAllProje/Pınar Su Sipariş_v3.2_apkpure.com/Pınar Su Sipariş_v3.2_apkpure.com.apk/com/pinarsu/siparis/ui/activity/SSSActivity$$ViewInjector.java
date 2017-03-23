package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import butterknife.internal.DebouncingOnClickListener;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class SSSActivity$$ViewInjector<T extends SSSActivity> implements Injector<T> {
    public void inject(Finder finder, final T t, Object obj) {
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
        t.webView1 = (WebView) finder.castView((View) finder.findRequiredView(obj, R.id.webView1, "field 'webView1'"), R.id.webView1, "field 'webView1'");
        t.webView2 = (WebView) finder.castView((View) finder.findRequiredView(obj, R.id.webView2, "field 'webView2'"), R.id.webView2, "field 'webView2'");
        view = (View) finder.findRequiredView(obj, R.id.linearParent1, "field 'linearParent1' and method 'onClick1'");
        t.linearParent1 = (LinearLayout) finder.castView(view, R.id.linearParent1, "field 'linearParent1'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.onClick1(view);
            }
        });
        view = (View) finder.findRequiredView(obj, R.id.linearParent2, "field 'linearParent2' and method 'onClick2'");
        t.linearParent2 = (LinearLayout) finder.castView(view, R.id.linearParent2, "field 'linearParent2'");
        view.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.onClick2(view);
            }
        });
        t.im1 = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.im1, "field 'im1'"), R.id.im1, "field 'im1'");
        t.im2 = (ImageView) finder.castView((View) finder.findRequiredView(obj, R.id.im2, "field 'im2'"), R.id.im2, "field 'im2'");
        t.tvTitle1 = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle1, "field 'tvTitle1'"), R.id.tvTitle1, "field 'tvTitle1'");
        t.tvTitle2 = (TextView) finder.castView((View) finder.findRequiredView(obj, R.id.tvTitle2, "field 'tvTitle2'"), R.id.tvTitle2, "field 'tvTitle2'");
    }

    public void reset(T t) {
        t.imBack = null;
        t.imLeftMenu = null;
        t.imLogo = null;
        t.tvTitle = null;
        t.webView1 = null;
        t.webView2 = null;
        t.linearParent1 = null;
        t.linearParent2 = null;
        t.im1 = null;
        t.im2 = null;
        t.tvTitle1 = null;
        t.tvTitle2 = null;
    }
}
