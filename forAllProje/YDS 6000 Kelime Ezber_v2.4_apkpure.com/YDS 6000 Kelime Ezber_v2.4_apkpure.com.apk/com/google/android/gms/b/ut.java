package com.google.android.gms.b;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@vz
public class ut implements ur {
    final Set<WebView> a = Collections.synchronizedSet(new HashSet());
    private final Context b;

    public ut(Context context) {
        this.b = context;
    }

    public WebView a() {
        WebView webView = new WebView(this.b);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }

    public void a(String str, final String str2, final String str3) {
        zy.b("Fetching assets for the given html");
        zi.a.post(new Runnable(this) {
            final /* synthetic */ ut c;

            public void run() {
                final WebView a = this.c.a();
                a.setWebViewClient(new WebViewClient(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void onPageFinished(WebView webView, String str) {
                        zy.b("Loading assets have finished");
                        this.b.c.a.remove(a);
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        zy.e("Loading assets have failed.");
                        this.b.c.a.remove(a);
                    }
                });
                this.c.a.add(a);
                a.loadDataWithBaseURL(str2, str3, "text/html", "UTF-8", null);
                zy.b("Fetching assets finished.");
            }
        });
    }
}
