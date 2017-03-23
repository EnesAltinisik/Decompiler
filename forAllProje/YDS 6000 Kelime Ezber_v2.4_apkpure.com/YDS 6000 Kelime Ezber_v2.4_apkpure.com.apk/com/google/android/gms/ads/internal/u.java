package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.ma;
import com.google.android.gms.b.mb;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.of;
import com.google.android.gms.b.og;
import com.google.android.gms.b.om;
import com.google.android.gms.b.oo;
import com.google.android.gms.b.or;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.qe;
import com.google.android.gms.b.uv;
import com.google.android.gms.b.va;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.xs;
import com.google.android.gms.b.zh;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@vz
public class u extends com.google.android.gms.b.ok.a {
    private final aab a;
    private final nx b;
    private final Future<ma> c = d();
    private final Context d;
    private final b e;
    private WebView f = new WebView(this.d);
    private og g;
    private ma h;
    private AsyncTask<Void, Void, String> i;

    private class a extends AsyncTask<Void, Void, String> {
        final /* synthetic */ u a;

        private a(u uVar) {
            this.a = uVar;
        }

        protected String a(Void... voidArr) {
            Throwable e;
            try {
                this.a.h = (ma) this.a.c.get(((Long) pr.cJ.c()).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                zy.c("Failed to load ad data", e);
            } catch (ExecutionException e3) {
                e = e3;
                zy.c("Failed to load ad data", e);
            } catch (TimeoutException e4) {
                zy.e("Timed out waiting for ad data");
            }
            return this.a.a();
        }

        protected void a(String str) {
            if (this.a.f != null && str != null) {
                this.a.f.loadUrl(str);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((String) obj);
        }
    }

    private static class b {
        private final String a;
        private final Map<String, String> b = new TreeMap();
        private String c;
        private String d;

        public b(String str) {
            this.a = str;
        }

        public String a() {
            return this.d;
        }

        public void a(ns nsVar) {
            this.c = nsVar.j.o;
            Bundle bundle = nsVar.m != null ? nsVar.m.getBundle(AdMobAdapter.class.getName()) : null;
            if (bundle != null) {
                String str = (String) pr.cI.c();
                for (String str2 : bundle.keySet()) {
                    if (str.equals(str2)) {
                        this.d = bundle.getString(str2);
                    } else if (str2.startsWith("csa_")) {
                        this.b.put(str2.substring("csa_".length()), bundle.getString(str2));
                    }
                }
            }
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public Map<String, String> d() {
            return this.b;
        }
    }

    public u(Context context, nx nxVar, String str, aab com_google_android_gms_b_aab) {
        this.d = context;
        this.a = com_google_android_gms_b_aab;
        this.b = nxVar;
        this.e = new b(str);
        c();
    }

    private String c(String str) {
        if (this.h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.h.b(parse, this.d);
        } catch (Throwable e) {
            zy.c("Unable to process ad data", e);
        } catch (Throwable e2) {
            zy.c("Unable to parse ad click url", e2);
        }
        return parse.toString();
    }

    private void c() {
        a(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ u a;

            {
                this.a = r1;
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (this.a.g != null) {
                    try {
                        this.a.g.a(0);
                    } catch (Throwable e) {
                        zy.c("Could not call AdListener.onAdFailedToLoad().", e);
                    }
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith(this.a.b())) {
                    return false;
                }
                if (str.startsWith((String) pr.cE.c())) {
                    if (this.a.g != null) {
                        try {
                            this.a.g.a(3);
                        } catch (Throwable e) {
                            zy.c("Could not call AdListener.onAdFailedToLoad().", e);
                        }
                    }
                    this.a.a(0);
                    return true;
                } else if (str.startsWith((String) pr.cF.c())) {
                    if (this.a.g != null) {
                        try {
                            this.a.g.a(0);
                        } catch (Throwable e2) {
                            zy.c("Could not call AdListener.onAdFailedToLoad().", e2);
                        }
                    }
                    this.a.a(0);
                    return true;
                } else if (str.startsWith((String) pr.cG.c())) {
                    if (this.a.g != null) {
                        try {
                            this.a.g.c();
                        } catch (Throwable e22) {
                            zy.c("Could not call AdListener.onAdLoaded().", e22);
                        }
                    }
                    this.a.a(this.a.b(str));
                    return true;
                } else if (str.startsWith("gmsg://")) {
                    return true;
                } else {
                    if (this.a.g != null) {
                        try {
                            this.a.g.b();
                        } catch (Throwable e222) {
                            zy.c("Could not call AdListener.onAdLeftApplication().", e222);
                        }
                    }
                    this.a.d(this.a.c(str));
                    return true;
                }
            }
        });
        this.f.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ u a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.a.h != null) {
                    try {
                        this.a.h.a(motionEvent);
                    } catch (Throwable e) {
                        zy.c("Unable to process ad data", e);
                    }
                }
                return false;
            }
        });
    }

    private Future<ma> d() {
        return zh.a(new Callable<ma>(this) {
            final /* synthetic */ u a;

            {
                this.a = r1;
            }

            public ma a() {
                return new ma(this.a.a.b, this.a.d, false);
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    private void d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.d.startActivity(intent);
    }

    public String F() {
        return null;
    }

    public void G() {
        throw new IllegalStateException("Unused method");
    }

    String a() {
        String valueOf;
        Uri a;
        Throwable e;
        String valueOf2;
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) pr.cH.c());
        builder.appendQueryParameter("query", this.e.b());
        builder.appendQueryParameter("pubId", this.e.c());
        Map d = this.e.d();
        for (String valueOf3 : d.keySet()) {
            builder.appendQueryParameter(valueOf3, (String) d.get(valueOf3));
        }
        Uri build = builder.build();
        if (this.h != null) {
            try {
                a = this.h.a(build, this.d);
            } catch (mb e2) {
                e = e2;
                zy.c("Unable to process ad data", e);
                a = build;
                valueOf2 = String.valueOf(b());
                valueOf3 = String.valueOf(a.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            } catch (RemoteException e3) {
                e = e3;
                zy.c("Unable to process ad data", e);
                a = build;
                valueOf2 = String.valueOf(b());
                valueOf3 = String.valueOf(a.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            }
            valueOf2 = String.valueOf(b());
            valueOf3 = String.valueOf(a.getEncodedQuery());
            return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
        }
        a = build;
        valueOf2 = String.valueOf(b());
        valueOf3 = String.valueOf(a.getEncodedQuery());
        return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
    }

    void a(int i) {
        if (this.f != null) {
            this.f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    public void a(nx nxVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public void a(of ofVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(og ogVar) {
        this.g = ogVar;
    }

    public void a(om omVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(oo ooVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(ph phVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(qe qeVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(uv uvVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(va vaVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    public void a(xs xsVar) {
        throw new IllegalStateException("Unused method");
    }

    public void a(String str) {
        throw new IllegalStateException("Unused method");
    }

    public void a(boolean z) {
    }

    public boolean a(ns nsVar) {
        c.a(this.f, (Object) "This Search Ad has already been torn down");
        this.e.a(nsVar);
        this.i = new a().execute(new Void[0]);
        return true;
    }

    int b(String str) {
        int i = 0;
        Object queryParameter = Uri.parse(str).getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                i = oc.a().a(this.d, Integer.parseInt(queryParameter));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    String b() {
        String str;
        CharSequence a = this.e.a();
        if (TextUtils.isEmpty(a)) {
            str = "www.google.com";
        } else {
            CharSequence charSequence = a;
        }
        String valueOf = String.valueOf("https://");
        String str2 = (String) pr.cH.c();
        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(str).append(str2).toString();
    }

    public void i() {
        c.b("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    public com.google.android.gms.a.a j() {
        c.b("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.a.b.a(this.f);
    }

    public nx k() {
        return this.b;
    }

    public boolean l() {
        return false;
    }

    public void m() {
        throw new IllegalStateException("Unused method");
    }

    public void n() {
        c.b("pause must be called on the main UI thread.");
    }

    public void o() {
        c.b("resume must be called on the main UI thread.");
    }

    public void p() {
    }

    public boolean q() {
        return false;
    }

    public or r() {
        return null;
    }
}
