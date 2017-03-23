package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
@vz
public class aay extends aba {
    public aay(aaq com_google_android_gms_b_aaq, boolean z) {
        super(com_google_android_gms_b_aaq, z);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, null);
    }
}
