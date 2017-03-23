package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzig
public class zzhf implements zzhd {
    private final Context mContext;
    final Set<WebView> zzIZ = Collections.synchronizedSet(new HashSet());

    public zzhf(Context context) {
        this.mContext = context;
    }

    public void zza(String str, final String str2, final String str3) {
        zzb.zzaU("Fetching assets for the given html");
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzhf c;

            public void run() {
                final WebView zzhg = this.c.zzhg();
                zzhg.setWebViewClient(new WebViewClient(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void onPageFinished(WebView webView, String str) {
                        zzb.zzaU("Loading assets have finished");
                        this.b.c.zzIZ.remove(zzhg);
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        zzb.zzaW("Loading assets have failed.");
                        this.b.c.zzIZ.remove(zzhg);
                    }
                });
                this.c.zzIZ.add(zzhg);
                zzhg.loadDataWithBaseURL(str2, str3, "text/html", Constants.ENCODING, null);
                zzb.zzaU("Fetching assets finished.");
            }
        });
    }

    public WebView zzhg() {
        WebView webView = new WebView(this.mContext);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }
}
