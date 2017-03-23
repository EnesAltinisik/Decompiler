package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@vz
public class aar extends WebViewClient {
    private static final String[] c = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] d = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    protected aaq a;
    protected yo b;
    private final HashMap<String, List<rq>> e;
    private final Object f;
    private nn g;
    private j h;
    private a i;
    private b j;
    private rm k;
    private c l;
    private boolean m;
    private rs n;
    private rv o;
    private boolean p;
    private boolean q;
    private OnGlobalLayoutListener r;
    private OnScrollChangedListener s;
    private boolean t;
    private s u;
    private final uj v;
    private com.google.android.gms.ads.internal.e w;
    private uf x;
    private ul y;
    private e z;

    public interface e {
        void a();
    }

    public interface c {
        void a();
    }

    public interface a {
        void a(aaq com_google_android_gms_b_aaq, boolean z);
    }

    public interface b {
        void a(aaq com_google_android_gms_b_aaq);
    }

    private static class d implements j {
        private aaq a;
        private j b;

        public d(aaq com_google_android_gms_b_aaq, j jVar) {
            this.a = com_google_android_gms_b_aaq;
            this.b = jVar;
        }

        public void a() {
            this.b.a();
            this.a.c();
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
            this.b.d();
            this.a.d();
        }
    }

    public aar(aaq com_google_android_gms_b_aaq, boolean z) {
        this(com_google_android_gms_b_aaq, z, new uj(com_google_android_gms_b_aaq, com_google_android_gms_b_aaq.g(), new pj(com_google_android_gms_b_aaq.getContext())), null);
    }

    aar(aaq com_google_android_gms_b_aaq, boolean z, uj ujVar, uf ufVar) {
        this.e = new HashMap();
        this.f = new Object();
        this.m = false;
        this.a = com_google_android_gms_b_aaq;
        this.p = z;
        this.v = ujVar;
        this.x = ufVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    private void a(Context context, String str, String str2, String str3) {
        if (((Boolean) pr.bc.c()).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            bundle.putString("host", a(str3));
            v.e().a(context, this.a.o().b, "gmob-apps", bundle, true);
        }
    }

    private static boolean b(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    private void p() {
        if (this.j != null) {
            this.j.a(this.a);
            this.j = null;
        }
    }

    public com.google.android.gms.ads.internal.e a() {
        return this.w;
    }

    public void a(int i, int i2) {
        if (this.x != null) {
            this.x.c(i, i2);
        }
    }

    public void a(int i, int i2, boolean z) {
        this.v.a(i, i2);
        if (this.x != null) {
            this.x.a(i, i2, z);
        }
    }

    public void a(Uri uri) {
        String path = uri.getPath();
        List<rq> list = (List) this.e.get(path);
        if (list != null) {
            Map a = v.e().a(uri);
            if (zy.a(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                ze.a(path.length() != 0 ? str.concat(path) : new String(str));
                for (String path2 : a.keySet()) {
                    str = (String) a.get(path2);
                    ze.a(new StringBuilder((String.valueOf(path2).length() + 4) + String.valueOf(str).length()).append("  ").append(path2).append(": ").append(str).toString());
                }
            }
            for (rq a2 : list) {
                a2.a(this.a, a);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        ze.a(new StringBuilder(String.valueOf(valueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf).toString());
    }

    public final void a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f) {
            this.q = true;
            this.a.B();
            this.r = onGlobalLayoutListener;
            this.s = onScrollChangedListener;
        }
    }

    public void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.x != null ? this.x.b() : false;
        h c = v.c();
        Context context = this.a.getContext();
        if (!b) {
            z = true;
        }
        c.a(context, adOverlayInfoParcel, z);
        if (this.b != null && adOverlayInfoParcel.m == null && adOverlayInfoParcel.b != null) {
            String str = adOverlayInfoParcel.b.c;
        }
    }

    public final void a(com.google.android.gms.ads.internal.overlay.e eVar) {
        j jVar = null;
        boolean p = this.a.p();
        nn nnVar = (!p || this.a.k().e) ? this.g : null;
        if (!p) {
            jVar = this.h;
        }
        a(new AdOverlayInfoParcel(eVar, nnVar, jVar, this.u, this.a.o()));
    }

    public void a(aaq com_google_android_gms_b_aaq) {
        this.a = com_google_android_gms_b_aaq;
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    public void a(b bVar) {
        this.j = bVar;
    }

    public void a(c cVar) {
        this.l = cVar;
    }

    public void a(e eVar) {
        this.z = eVar;
    }

    public void a(nn nnVar, j jVar, rm rmVar, s sVar, boolean z, rs rsVar, rv rvVar, com.google.android.gms.ads.internal.e eVar, ul ulVar, yo yoVar) {
        if (eVar == null) {
            eVar = new com.google.android.gms.ads.internal.e(this.a.getContext());
        }
        this.x = new uf(this.a, ulVar);
        this.b = yoVar;
        a("/appEvent", new rl(rmVar));
        a("/backButton", rp.l);
        a("/refresh", rp.m);
        a("/canOpenURLs", rp.b);
        a("/canOpenIntents", rp.c);
        a("/click", rp.d);
        a("/close", rp.e);
        a("/customClose", rp.g);
        a("/instrument", rp.q);
        a("/delayPageLoaded", rp.s);
        a("/delayPageClosed", rp.t);
        a("/getLocationInfo", rp.u);
        a("/httpTrack", rp.h);
        a("/log", rp.i);
        a("/mraid", new rx(eVar, this.x));
        a("/mraidLoaded", this.v);
        a("/open", new ry(rsVar, eVar, this.x));
        a("/precache", rp.p);
        a("/touch", rp.k);
        a("/video", rp.n);
        a("/videoMeta", rp.o);
        a("/appStreaming", rp.f);
        if (rvVar != null) {
            a("/setInterstitialProperties", new ru(rvVar));
        }
        this.g = nnVar;
        this.h = jVar;
        this.k = rmVar;
        this.n = rsVar;
        this.u = sVar;
        this.w = eVar;
        this.y = ulVar;
        this.o = rvVar;
        a(z);
    }

    public void a(String str, rq rqVar) {
        synchronized (this.f) {
            List list = (List) this.e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.e.put(str, list);
            }
            list.add(rqVar);
        }
    }

    public void a(boolean z) {
        this.m = z;
    }

    public final void a(boolean z, int i) {
        nn nnVar = (!this.a.p() || this.a.k().e) ? this.g : null;
        a(new AdOverlayInfoParcel(nnVar, this.h, this.u, this.a, z, i, this.a.o()));
    }

    public final void a(boolean z, int i, String str) {
        j jVar = null;
        boolean p = this.a.p();
        nn nnVar = (!p || this.a.k().e) ? this.g : null;
        if (!p) {
            jVar = new d(this.a, this.h);
        }
        a(new AdOverlayInfoParcel(nnVar, jVar, this.k, this.u, this.a, z, i, str, this.a.o(), this.n));
    }

    public final void a(boolean z, int i, String str, String str2) {
        boolean p = this.a.p();
        nn nnVar = (!p || this.a.k().e) ? this.g : null;
        a(new AdOverlayInfoParcel(nnVar, p ? null : new d(this.a, this.h), this.k, this.u, this.a, z, i, str, str2, this.a.o(), this.n));
    }

    public void b(String str, rq rqVar) {
        synchronized (this.f) {
            List list = (List) this.e.get(str);
            if (list == null) {
                return;
            }
            list.remove(rqVar);
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.f) {
            z = this.p;
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f) {
            z = this.q;
        }
        return z;
    }

    public OnGlobalLayoutListener d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f) {
            onGlobalLayoutListener = this.r;
        }
        return onGlobalLayoutListener;
    }

    public OnScrollChangedListener e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f) {
            onScrollChangedListener = this.s;
        }
        return onScrollChangedListener;
    }

    public boolean f() {
        boolean z;
        synchronized (this.f) {
            z = this.t;
        }
        return z;
    }

    public void g() {
        synchronized (this.f) {
            ze.a("Loading blank page in WebView, 2...");
            this.A = true;
            this.a.a("about:blank");
        }
    }

    public void h() {
        if (this.b != null) {
            zi.a.post(new Runnable(this) {
                final /* synthetic */ aar a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.b != null) {
                        yo yoVar = this.a.b;
                        aaq com_google_android_gms_b_aaq = this.a.a;
                    }
                }
            });
        }
    }

    public void i() {
        synchronized (this.f) {
            this.t = true;
        }
        this.D++;
        l();
    }

    public void j() {
        this.D--;
        l();
    }

    public void k() {
        this.C = true;
        l();
    }

    public final void l() {
        if (this.i != null && ((this.B && this.D <= 0) || this.C)) {
            this.i.a(this.a, !this.C);
            this.i = null;
        }
        this.a.C();
    }

    public final void m() {
        if (this.b != null) {
            this.b = null;
        }
        synchronized (this.f) {
            this.e.clear();
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.m = false;
            this.p = false;
            this.q = false;
            this.t = false;
            this.n = null;
            this.u = null;
            this.l = null;
            if (this.x != null) {
                this.x.a(true);
                this.x = null;
            }
        }
    }

    public e n() {
        return this.z;
    }

    public final void o() {
        synchronized (this.f) {
            this.m = false;
            this.p = true;
            v.e().a(new Runnable(this) {
                final /* synthetic */ aar a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.B();
                    g i = this.a.a.i();
                    if (i != null) {
                        i.m();
                    }
                    if (this.a.l != null) {
                        this.a.l.a();
                        this.a.l = null;
                    }
                }
            });
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        ze.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f) {
            if (this.A) {
                ze.a("Blank page loaded, 1...");
                this.a.s();
                return;
            }
            this.B = true;
            p();
            l();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= c.length) ? String.valueOf(i) : c[(-i) - 1];
        a(this.a.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= d.length) ? String.valueOf(primaryError) : d[primaryError];
            a(this.a.getContext(), "ssl_err", valueOf, v.g().a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            ni a = ni.a(str);
            if (a == null) {
                return null;
            }
            nf a2 = v.j().a(a);
            return (a2 == null || !a2.a()) ? null : new WebResourceResponse("", "", a2.b());
        } catch (Throwable th) {
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        ze.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        } else if (this.m && webView == this.a.a() && b(parse)) {
            if (this.g != null && ((Boolean) pr.as.c()).booleanValue()) {
                this.g.e();
                this.g = null;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } else if (this.a.a().willNotDraw()) {
            str2 = "AdWebView unable to handle URL: ";
            valueOf = String.valueOf(str);
            zy.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            Uri uri;
            try {
                dp n = this.a.n();
                if (n != null && n.c(parse)) {
                    parse = n.a(parse, this.a.getContext(), this.a.b());
                }
                uri = parse;
            } catch (dq e) {
                String str3 = "Unable to append parameter to URL: ";
                str2 = String.valueOf(str);
                zy.e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                uri = parse;
            }
            if (this.w == null || this.w.b()) {
                a(new com.google.android.gms.ads.internal.overlay.e("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.w.a(str);
            }
        }
        return true;
    }
}
