package com.google.android.gms.internal;

import a.a.a.a.a.b.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(11)
@zzig
public class zzli extends zzlb {
    public zzli(zzla com_google_android_gms_internal_zzla, boolean z) {
        super(com_google_android_gms_internal_zzla, z);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2;
        Exception e;
        String valueOf;
        if (this.zzSk != null) {
            this.zzSk.zzaI(str);
        }
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (webView instanceof zzla) {
                zzla com_google_android_gms_internal_zzla = (zzla) webView;
                com_google_android_gms_internal_zzla.zzjD().zzgr();
                str2 = com_google_android_gms_internal_zzla.zzbi().zzvt ? (String) zzcu.zzxE.get() : com_google_android_gms_internal_zzla.zzjH() ? (String) zzcu.zzxD.get() : (String) zzcu.zzxC.get();
                zzjw.v(new StringBuilder(String.valueOf(str2).length() + 24).append("shouldInterceptRequest(").append(str2).append(")").toString());
                return zzd(com_google_android_gms_internal_zzla.getContext(), this.zzBb.zzjG().afmaVersion, str2);
            }
            zzb.zzaW("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webView, str);
        } catch (IOException e2) {
            e = e2;
            str2 = "Could not fetch MRAID JS. ";
            valueOf = String.valueOf(e.getMessage());
            zzb.zzaW(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
            return super.shouldInterceptRequest(webView, str);
        } catch (ExecutionException e3) {
            e = e3;
            str2 = "Could not fetch MRAID JS. ";
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
            }
            zzb.zzaW(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
            return super.shouldInterceptRequest(webView, str);
        } catch (InterruptedException e4) {
            e = e4;
            str2 = "Could not fetch MRAID JS. ";
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
            }
            zzb.zzaW(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
            return super.shouldInterceptRequest(webView, str);
        } catch (TimeoutException e5) {
            e = e5;
            str2 = "Could not fetch MRAID JS. ";
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
            }
            zzb.zzaW(valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
            return super.shouldInterceptRequest(webView, str);
        }
    }

    protected WebResourceResponse zzd(Context context, String str, String str2) throws IOException, ExecutionException, InterruptedException, TimeoutException {
        Map hashMap = new HashMap();
        hashMap.put(a.HEADER_USER_AGENT, zzu.zzck().zzg(context, str));
        hashMap.put("Cache-Control", "max-stale=3600");
        String str3 = (String) new zzkg(context).zzb(str2, hashMap).get(60, TimeUnit.SECONDS);
        return str3 == null ? null : new WebResourceResponse("application/javascript", Constants.ENCODING, new ByteArrayInputStream(str3.getBytes(Constants.ENCODING)));
    }
}
