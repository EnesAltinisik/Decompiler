package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.v;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

@TargetApi(8)
@vz
public class zj {

    @TargetApi(9)
    public static class a extends zj {
        public a() {
            super();
        }

        public int a() {
            return 6;
        }

        public boolean a(Request request) {
            request.setShowRunningNotification(true);
            return true;
        }

        public int b() {
            return 7;
        }
    }

    @TargetApi(11)
    public static class b extends a {
        public aar a(aaq com_google_android_gms_b_aaq, boolean z) {
            return new aay(com_google_android_gms_b_aaq, z);
        }

        public Set<String> a(Uri uri) {
            return uri.getQueryParameterNames();
        }

        public boolean a(Request request) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        public boolean a(final Context context, final WebSettings webSettings) {
            super.a(context, webSettings);
            return ((Boolean) zv.a(new Callable<Boolean>(this) {
                public Boolean a() {
                    if (context.getCacheDir() != null) {
                        webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                        webSettings.setAppCacheMaxSize(0);
                        webSettings.setAppCacheEnabled(true);
                    }
                    webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                    webSettings.setDatabaseEnabled(true);
                    webSettings.setDomStorageEnabled(true);
                    webSettings.setDisplayZoomControls(false);
                    webSettings.setBuiltInZoomControls(true);
                    webSettings.setSupportZoom(true);
                    webSettings.setAllowContentAccess(false);
                    return Boolean.valueOf(true);
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            })).booleanValue();
        }

        public boolean a(Window window) {
            window.setFlags(16777216, 16777216);
            return true;
        }

        public boolean b(View view) {
            view.setLayerType(0, null);
            return true;
        }

        public WebChromeClient c(aaq com_google_android_gms_b_aaq) {
            return new aax(com_google_android_gms_b_aaq);
        }

        public boolean c(View view) {
            view.setLayerType(1, null);
            return true;
        }
    }

    @TargetApi(14)
    public static class c extends b {
        public String a(SslError sslError) {
            return sslError.getUrl();
        }

        public WebChromeClient c(aaq com_google_android_gms_b_aaq) {
            return new aaz(com_google_android_gms_b_aaq);
        }
    }

    @TargetApi(16)
    public static class f extends c {
        public void a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
                a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
            }
        }

        public void a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public void a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public boolean a(Context context, WebSettings webSettings) {
            super.a(context, webSettings);
            webSettings.setAllowFileAccessFromFileURLs(false);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
            return true;
        }
    }

    @TargetApi(17)
    public static class d extends f {
        public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
            if (!z || f <= 0.0f || f > 25.0f) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                RenderScript create = RenderScript.create(context);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                create2.setRadius(f);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                return new BitmapDrawable(context.getResources(), createBitmap);
            } catch (RuntimeException e) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
        }

        public String a(Context context) {
            return WebSettings.getDefaultUserAgent(context);
        }

        public boolean a(Context context, WebSettings webSettings) {
            super.a(context, webSettings);
            webSettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }
    }

    @TargetApi(18)
    public static class e extends d {
        public boolean a(View view) {
            return super.a(view) || view.getWindowId() != null;
        }

        public int c() {
            return 14;
        }
    }

    @TargetApi(19)
    public static class g extends e {
        public boolean a(View view) {
            return view.isAttachedToWindow();
        }

        public LayoutParams d() {
            return new LayoutParams(-1, -1);
        }
    }

    @TargetApi(21)
    public static class h extends g {
        public aar a(aaq com_google_android_gms_b_aaq, boolean z) {
            return new abd(com_google_android_gms_b_aaq, z);
        }

        public CookieManager b(Context context) {
            return CookieManager.getInstance();
        }
    }

    private zj() {
    }

    public static zj a(int i) {
        return i >= 21 ? new h() : i >= 19 ? new g() : i >= 18 ? new e() : i >= 17 ? new d() : i >= 16 ? new f() : i >= 14 ? new c() : i >= 11 ? new b() : i >= 9 ? new a() : new zj();
    }

    public int a() {
        return 0;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public aar a(aaq com_google_android_gms_b_aaq, boolean z) {
        return new aar(com_google_android_gms_b_aaq, z);
    }

    public String a(Context context) {
        return "";
    }

    public String a(SslError sslError) {
        return "";
    }

    public Set<String> a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean a(Request request) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean a(Window window) {
        return false;
    }

    public boolean a(aaq com_google_android_gms_b_aaq) {
        if (com_google_android_gms_b_aaq == null) {
            return false;
        }
        com_google_android_gms_b_aaq.onPause();
        return true;
    }

    public int b() {
        return 1;
    }

    public CookieManager b(Context context) {
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable e) {
            zy.b("Failed to obtain CookieManager.", e);
            v.i().a(e, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public boolean b(View view) {
        return false;
    }

    public boolean b(aaq com_google_android_gms_b_aaq) {
        if (com_google_android_gms_b_aaq == null) {
            return false;
        }
        com_google_android_gms_b_aaq.onResume();
        return true;
    }

    public int c() {
        return 5;
    }

    public WebChromeClient c(aaq com_google_android_gms_b_aaq) {
        return null;
    }

    public boolean c(View view) {
        return false;
    }

    public LayoutParams d() {
        return new LayoutParams(-2, -2);
    }
}
