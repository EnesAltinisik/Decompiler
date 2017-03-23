package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.v;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(11)
@vz
public class aba extends aar {
    public aba(aaq com_google_android_gms_b_aaq, boolean z) {
        super(com_google_android_gms_b_aaq, z);
    }

    protected WebResourceResponse a(Context context, String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", v.e().a(context, str));
        hashMap.put("Cache-Control", "max-stale=3600");
        String str3 = (String) new zp(context).a(str2, hashMap).get(60, TimeUnit.SECONDS);
        return str3 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
    }

    protected WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        Exception e;
        String valueOf;
        if (webView instanceof aaq) {
            aaq com_google_android_gms_b_aaq = (aaq) webView;
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (com_google_android_gms_b_aaq.l() != null) {
                com_google_android_gms_b_aaq.l().o();
            }
            String str2 = com_google_android_gms_b_aaq.k().e ? (String) pr.T.c() : com_google_android_gms_b_aaq.p() ? (String) pr.S.c() : (String) pr.R.c();
            try {
                return a(com_google_android_gms_b_aaq.getContext(), com_google_android_gms_b_aaq.o().b, str2);
            } catch (IOException e2) {
                e = e2;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                zy.e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (ExecutionException e3) {
                e = e3;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                zy.e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (InterruptedException e4) {
                e = e4;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                zy.e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            } catch (TimeoutException e5) {
                e = e5;
                str2 = "Could not fetch MRAID JS. ";
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                zy.e(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
        }
        zy.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
