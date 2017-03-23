package com.pinarsu.siparis.ui.activity;

import android.view.View;
import android.webkit.WebView;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;
import com.pinarsu.siparis.R;

public class PrivacyAgreementActivity$$ViewInjector<T extends PrivacyAgreementActivity> implements Injector<T> {
    public void inject(Finder finder, T t, Object obj) {
        t.webView = (WebView) finder.castView((View) finder.findRequiredView(obj, R.id.webView, "field 'webView'"), R.id.webView, "field 'webView'");
    }

    public void reset(T t) {
        t.webView = null;
    }
}
