package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.util.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

@vz
class aau extends WebView implements OnGlobalLayoutListener, DownloadListener, aaq {
    private py A;
    private pz B;
    private WeakReference<OnClickListener> C;
    private g D;
    private zw E;
    private int F = -1;
    private int G = -1;
    private int H = -1;
    private int I = -1;
    private Map<String, sf> J;
    private final WindowManager K;
    boolean a = false;
    private final a b;
    private final Object c = new Object();
    private final dp d;
    private final aab e;
    private final t f;
    private final d g;
    private aar h;
    private g i;
    private nx j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Boolean o;
    private int p;
    private boolean q = true;
    private String r = "";
    private aav s;
    private boolean t;
    private boolean u;
    private qn v;
    private int w;
    private int x;
    private py y;
    private py z;

    @vz
    public static class a extends MutableContextWrapper {
        private Activity a;
        private Context b;
        private Context c;

        public a(Context context) {
            super(context);
            setBaseContext(context);
        }

        public Activity a() {
            return this.a;
        }

        public Context b() {
            return this.c;
        }

        public Object getSystemService(String str) {
            return this.c.getSystemService(str);
        }

        public void setBaseContext(Context context) {
            this.b = context.getApplicationContext();
            this.a = context instanceof Activity ? (Activity) context : null;
            this.c = context;
            super.setBaseContext(this.b);
        }

        public void startActivity(Intent intent) {
            if (this.a != null) {
                this.a.startActivity(intent);
                return;
            }
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            this.b.startActivity(intent);
        }
    }

    protected aau(a aVar, nx nxVar, boolean z, boolean z2, dp dpVar, aab com_google_android_gms_b_aab, qa qaVar, t tVar, d dVar) {
        super(aVar);
        this.b = aVar;
        this.j = nxVar;
        this.m = z;
        this.p = -1;
        this.d = dpVar;
        this.e = com_google_android_gms_b_aab;
        this.f = tVar;
        this.g = dVar;
        this.K = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        v.e().a((Context) aVar, com_google_android_gms_b_aab.b, settings);
        v.g().a(getContext(), settings);
        setDownloadListener(this);
        O();
        if (k.e()) {
            addJavascriptInterface(new aaw(this), "googleAdsJsInterface");
        }
        if (k.a()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.E = new zw(this.b.a(), this, this, null);
        a(qaVar);
    }

    private void L() {
        synchronized (this.c) {
            this.o = v.i().l();
            if (this.o == null) {
                try {
                    evaluateJavascript("(function(){})()", null);
                    a(Boolean.valueOf(true));
                } catch (IllegalStateException e) {
                    a(Boolean.valueOf(false));
                }
            }
        }
    }

    private void M() {
        pw.a(this.B.a(), this.z, "aeh2");
    }

    private void N() {
        pw.a(this.B.a(), this.z, "aebb2");
    }

    private void O() {
        synchronized (this.c) {
            if (this.m || this.j.e) {
                if (VERSION.SDK_INT < 14) {
                    zy.b("Disabling hardware acceleration on an overlay.");
                    P();
                } else {
                    zy.b("Enabling hardware acceleration on an overlay.");
                    Q();
                }
            } else if (VERSION.SDK_INT < 18) {
                zy.b("Disabling hardware acceleration on an AdView.");
                P();
            } else {
                zy.b("Enabling hardware acceleration on an AdView.");
                Q();
            }
        }
    }

    private void P() {
        synchronized (this.c) {
            if (!this.n) {
                v.g().c((View) this);
            }
            this.n = true;
        }
    }

    private void Q() {
        synchronized (this.c) {
            if (this.n) {
                v.g().b((View) this);
            }
            this.n = false;
        }
    }

    private void R() {
        synchronized (this.c) {
            this.J = null;
        }
    }

    private void S() {
        if (this.B != null) {
            qa a = this.B.a();
            if (a != null && v.i().f() != null) {
                v.i().f().a(a);
            }
        }
    }

    static aau a(Context context, nx nxVar, boolean z, boolean z2, dp dpVar, aab com_google_android_gms_b_aab, qa qaVar, t tVar, d dVar) {
        return new aau(new a(context), nxVar, z, z2, dpVar, com_google_android_gms_b_aab, qaVar, tVar, dVar);
    }

    private void a(qa qaVar) {
        S();
        this.B = new pz(new qa(true, "make_wv", this.j.b));
        this.B.a().a(qaVar);
        this.z = pw.a(this.B.a());
        this.B.a("native:view_create", this.z);
        this.A = null;
        this.y = null;
    }

    private void e(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        a("onAdVisibilityChanged", hashMap);
    }

    public boolean A() {
        boolean z;
        synchronized (this.c) {
            z = this.w > 0;
        }
        return z;
    }

    public void B() {
        this.E.a();
    }

    public void C() {
        if (this.A == null) {
            this.A = pw.a(this.B.a());
            this.B.a("native:view_load", this.A);
        }
    }

    public OnClickListener D() {
        return (OnClickListener) this.C.get();
    }

    public qn E() {
        qn qnVar;
        synchronized (this.c) {
            qnVar = this.v;
        }
        return qnVar;
    }

    public void F() {
        setBackgroundColor(0);
    }

    public boolean G() {
        if (!l().b() && !l().c()) {
            return false;
        }
        int i;
        int i2;
        DisplayMetrics a = v.e().a(this.K);
        int b = oc.a().b(a, a.widthPixels);
        int b2 = oc.a().b(a, a.heightPixels);
        Activity f = f();
        if (f == null || f.getWindow() == null) {
            i = b2;
            i2 = b;
        } else {
            int[] a2 = v.e().a(f);
            i2 = oc.a().b(a, a2[0]);
            i = oc.a().b(a, a2[1]);
        }
        if (this.G == b && this.F == b2 && this.H == i2 && this.I == i) {
            return false;
        }
        boolean z = (this.G == b && this.F == b2) ? false : true;
        this.G = b;
        this.F = b2;
        this.H = i2;
        this.I = i;
        new uk(this).a(b, b2, i2, i, a.density, this.K.getDefaultDisplay().getRotation());
        return z;
    }

    public void H() {
        synchronized (this.c) {
            this.a = true;
            if (this.f != null) {
                this.f.H();
            }
        }
    }

    public void I() {
        synchronized (this.c) {
            this.a = false;
            if (this.f != null) {
                this.f.I();
            }
        }
    }

    Boolean J() {
        Boolean bool;
        synchronized (this.c) {
            bool = this.o;
        }
        return bool;
    }

    rq K() {
        return new rq(this) {
            final /* synthetic */ aau a;

            {
                this.a = r1;
            }

            public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
                if (map != null) {
                    String str = (String) map.get("height");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            int parseInt = Integer.parseInt(str);
                            synchronized (this.a.c) {
                                if (this.a.x != parseInt) {
                                    this.a.x = parseInt;
                                    this.a.requestLayout();
                                }
                            }
                        } catch (Throwable e) {
                            zy.c("Exception occurred while getting webview content height", e);
                        }
                    }
                }
            }
        };
    }

    public WebView a() {
        return this;
    }

    public void a(int i) {
        if (i == 0) {
            N();
        }
        M();
        if (this.B.a() != null) {
            this.B.a().a("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.e.b);
        a("onhide", hashMap);
    }

    public void a(Context context) {
        this.b.setBaseContext(context);
        this.E.a(this.b.a());
    }

    public void a(Context context, nx nxVar, qa qaVar) {
        synchronized (this.c) {
            this.E.b();
            a(context);
            this.i = null;
            this.j = nxVar;
            this.m = false;
            this.k = false;
            this.r = "";
            this.p = -1;
            v.g().b((aaq) this);
            loadUrl("about:blank");
            this.h.m();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.q = true;
            this.a = false;
            this.s = null;
            a(qaVar);
            this.t = false;
            this.w = 0;
            v.B().a((aaq) this);
            R();
        }
    }

    public void a(g gVar) {
        synchronized (this.c) {
            this.i = gVar;
        }
    }

    public void a(aav com_google_android_gms_b_aav) {
        synchronized (this.c) {
            if (this.s != null) {
                zy.c("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.s = com_google_android_gms_b_aav;
        }
    }

    public void a(com.google.android.gms.b.mo.a aVar) {
        synchronized (this.c) {
            this.t = aVar.m;
        }
        e(aVar.m);
    }

    public void a(nx nxVar) {
        synchronized (this.c) {
            this.j = nxVar;
            requestLayout();
        }
    }

    public void a(qn qnVar) {
        synchronized (this.c) {
            this.v = qnVar;
        }
    }

    void a(Boolean bool) {
        synchronized (this.c) {
            this.o = bool;
        }
        v.i().a(bool);
    }

    public void a(String str) {
        synchronized (this.c) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                String valueOf = String.valueOf(th);
                zy.e(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Could not call loadUrl. ").append(valueOf).toString());
            }
        }
    }

    @TargetApi(19)
    protected void a(String str, ValueCallback<String> valueCallback) {
        synchronized (this.c) {
            if (r()) {
                zy.e("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                evaluateJavascript(str, valueCallback);
            }
        }
    }

    public void a(String str, rq rqVar) {
        if (this.h != null) {
            this.h.a(str, rqVar);
        }
    }

    public void a(String str, String str2) {
        d(new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length()).append(str).append("(").append(str2).append(");").toString());
    }

    public void a(String str, Map<String, ?> map) {
        try {
            b(str, v.e().a((Map) map));
        } catch (JSONException e) {
            zy.e("Could not convert parameters to JSON.");
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        a(str, jSONObject.toString());
    }

    public void a(boolean z) {
        synchronized (this.c) {
            this.m = z;
            O();
        }
    }

    public View b() {
        return this;
    }

    public void b(int i) {
        synchronized (this.c) {
            this.p = i;
            if (this.i != null) {
                this.i.a(this.p);
            }
        }
    }

    public void b(g gVar) {
        synchronized (this.c) {
            this.D = gVar;
        }
    }

    public void b(String str) {
        synchronized (this.c) {
            if (str == null) {
                str = "";
            }
            this.r = str;
        }
    }

    public void b(String str, rq rqVar) {
        if (this.h != null) {
            this.h.b(str, rqVar);
        }
    }

    public void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        String str2 = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        zy.b(jSONObject2.length() != 0 ? str2.concat(jSONObject2) : new String(str2));
        d(stringBuilder.toString());
    }

    public void b(boolean z) {
        synchronized (this.c) {
            if (this.i != null) {
                this.i.a(this.h.b(), z);
            } else {
                this.k = z;
            }
        }
    }

    public void c() {
        M();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.e.b);
        a("onhide", hashMap);
    }

    protected void c(String str) {
        synchronized (this.c) {
            if (r()) {
                zy.e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    public void c(boolean z) {
        synchronized (this.c) {
            this.q = z;
        }
    }

    public void d() {
        if (this.y == null) {
            pw.a(this.B.a(), this.z, "aes2");
            this.y = pw.a(this.B.a());
            this.B.a("native:view_show", this.y);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.e.b);
        a("onshow", hashMap);
    }

    protected void d(String str) {
        if (k.g()) {
            if (J() == null) {
                L();
            }
            if (J().booleanValue()) {
                a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        str2 = "javascript:";
        valueOf = String.valueOf(str);
        c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public void d(boolean z) {
        synchronized (this.c) {
            this.w = (z ? 1 : -1) + this.w;
            if (this.w <= 0 && this.i != null) {
                this.i.s();
            }
        }
    }

    public void destroy() {
        synchronized (this.c) {
            S();
            this.E.b();
            if (this.i != null) {
                this.i.a();
                this.i.k();
                this.i = null;
            }
            this.h.m();
            if (this.l) {
                return;
            }
            v.B().a((aaq) this);
            R();
            this.l = true;
            ze.a("Initiating WebView self destruct sequence in 3...");
            this.h.g();
        }
    }

    public void e() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(v.e().h()));
        hashMap.put("app_volume", String.valueOf(v.e().g()));
        hashMap.put("device_volume", String.valueOf(v.e().j(getContext())));
        a("volume", hashMap);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r1 = r2.c;
        monitor-enter(r1);
        r0 = r2.r();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.b.zy.e(r0);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        r4.onReceiveValue(r0);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0015:
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0015;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.aau.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public Activity f() {
        return this.b.a();
    }

    protected void finalize() {
        synchronized (this.c) {
            if (!this.l) {
                this.h.m();
                v.B().a((aaq) this);
                R();
            }
        }
        super.finalize();
    }

    public Context g() {
        return this.b.b();
    }

    public d h() {
        return this.g;
    }

    public g i() {
        g gVar;
        synchronized (this.c) {
            gVar = this.i;
        }
        return gVar;
    }

    public g j() {
        g gVar;
        synchronized (this.c) {
            gVar = this.D;
        }
        return gVar;
    }

    public nx k() {
        nx nxVar;
        synchronized (this.c) {
            nxVar = this.j;
        }
        return nxVar;
    }

    public aar l() {
        return this.h;
    }

    public void loadData(String str, String str2, String str3) {
        synchronized (this.c) {
            if (r()) {
                zy.e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.c) {
            if (r()) {
                zy.e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public void loadUrl(String str) {
        synchronized (this.c) {
            if (r()) {
                zy.e("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable th) {
                    String valueOf = String.valueOf(th);
                    zy.e(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Could not call loadUrl. ").append(valueOf).toString());
                }
            }
        }
    }

    public boolean m() {
        boolean z;
        synchronized (this.c) {
            z = this.k;
        }
        return z;
    }

    public dp n() {
        return this.d;
    }

    public aab o() {
        return this.e;
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        synchronized (this.c) {
            super.onAttachedToWindow();
            if (!r()) {
                this.E.c();
            }
            boolean z2 = this.t;
            if (l() == null || !l().c()) {
                z = z2;
            } else if (!this.u) {
                OnGlobalLayoutListener d = l().d();
                if (d != null) {
                    v.C().a(b(), d);
                }
                OnScrollChangedListener e = l().e();
                if (e != null) {
                    v.C().a(b(), e);
                }
                this.u = true;
            }
            e(z);
        }
    }

    protected void onDetachedFromWindow() {
        synchronized (this.c) {
            if (!r()) {
                this.E.d();
            }
            super.onDetachedFromWindow();
            if (this.u && l() != null && l().c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = l().d();
                if (d != null) {
                    v.g().a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = l().e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.u = false;
            }
        }
        e(false);
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            v.e().a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zy.b(new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (!r()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (l() != null && l().n() != null) {
                    l().n().a();
                }
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) pr.az.c()).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if ((motionEvent.getActionMasked() == 8 ? 1 : 0) != 0 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void onGlobalLayout() {
        boolean G = G();
        g i = i();
        if (i != null && G) {
            i.p();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.c;
        monitor-enter(r4);
        r1 = r9.r();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
    L_0x0018:
        return;
    L_0x0019:
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x001f:
        r1 = r9.m;	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x0023:
        r1 = r9.j;	 Catch:{ all -> 0x002e }
        r1 = r1.i;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0031;
    L_0x0029:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r1 = r9.j;	 Catch:{ all -> 0x002e }
        r1 = r1.j;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0082;
    L_0x0037:
        r0 = com.google.android.gms.b.pr.co;	 Catch:{ all -> 0x002e }
        r0 = r0.c();	 Catch:{ all -> 0x002e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x002e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x004b;
    L_0x0045:
        r0 = com.google.android.gms.common.util.k.e();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x0050;
    L_0x004b:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0050:
        r0 = "/contentHeight";
        r1 = r9.K();	 Catch:{ all -> 0x002e }
        r9.a(r0, r1);	 Catch:{ all -> 0x002e }
        r0 = "(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();";
        r9.d(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.b;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r2 = r9.x;	 Catch:{ all -> 0x002e }
        switch(r2) {
            case -1: goto L_0x007d;
            default: goto L_0x0073;
        };	 Catch:{ all -> 0x002e }
    L_0x0073:
        r2 = r9.x;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r0 = r0 * r2;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
    L_0x0078:
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x007d:
        r0 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        goto L_0x0078;
    L_0x0082:
        r1 = r9.j;	 Catch:{ all -> 0x002e }
        r1 = r1.e;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x00a0;
    L_0x0088:
        r0 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x002e }
        r0.<init>();	 Catch:{ all -> 0x002e }
        r1 = r9.K;	 Catch:{ all -> 0x002e }
        r1 = r1.getDefaultDisplay();	 Catch:{ all -> 0x002e }
        r1.getMetrics(r0);	 Catch:{ all -> 0x002e }
        r1 = r0.widthPixels;	 Catch:{ all -> 0x002e }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x00a0:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x002e }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        if (r2 == r6) goto L_0x00b4;
    L_0x00b2:
        if (r2 != r8) goto L_0x014b;
    L_0x00b4:
        r2 = r3;
    L_0x00b5:
        if (r5 == r6) goto L_0x00b9;
    L_0x00b7:
        if (r5 != r8) goto L_0x00ba;
    L_0x00b9:
        r0 = r1;
    L_0x00ba:
        r5 = r9.j;	 Catch:{ all -> 0x002e }
        r5 = r5.g;	 Catch:{ all -> 0x002e }
        if (r5 > r2) goto L_0x00c6;
    L_0x00c0:
        r2 = r9.j;	 Catch:{ all -> 0x002e }
        r2 = r2.d;	 Catch:{ all -> 0x002e }
        if (r2 <= r0) goto L_0x0135;
    L_0x00c6:
        r0 = r9.b;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r2 = r9.j;	 Catch:{ all -> 0x002e }
        r2 = r2.g;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x002e }
        r5 = r9.j;	 Catch:{ all -> 0x002e }
        r5 = r5.d;	 Catch:{ all -> 0x002e }
        r5 = (float) r5;	 Catch:{ all -> 0x002e }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x002e }
        r3 = (float) r3;	 Catch:{ all -> 0x002e }
        r3 = r3 / r0;
        r3 = (int) r3;	 Catch:{ all -> 0x002e }
        r1 = (float) r1;	 Catch:{ all -> 0x002e }
        r0 = r1 / r0;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r6 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1.<init>(r6);	 Catch:{ all -> 0x002e }
        r6 = "Not enough space to show ad. Needs ";
        r1 = r1.append(r6);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x002e }
        r2 = " dp, but only has ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r3);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r0 = r1.append(r0);	 Catch:{ all -> 0x002e }
        r1 = " dp.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x002e }
        r0 = r0.toString();	 Catch:{ all -> 0x002e }
        com.google.android.gms.b.zy.e(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x012d;
    L_0x0129:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x012d:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
    L_0x0132:
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0135:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x013f;
    L_0x013b:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x013f:
        r0 = r9.j;	 Catch:{ all -> 0x002e }
        r0 = r0.g;	 Catch:{ all -> 0x002e }
        r1 = r9.j;	 Catch:{ all -> 0x002e }
        r1 = r1.d;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        goto L_0x0132;
    L_0x014b:
        r2 = r0;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.aau.onMeasure(int, int):void");
    }

    public void onPause() {
        if (!r()) {
            try {
                if (k.a()) {
                    super.onPause();
                }
            } catch (Throwable e) {
                zy.b("Could not pause webview.", e);
            }
        }
    }

    public void onResume() {
        if (!r()) {
            try {
                if (k.a()) {
                    super.onResume();
                }
            } catch (Throwable e) {
                zy.b("Could not resume webview.", e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (l().c()) {
            synchronized (this.c) {
                if (this.v != null) {
                    this.v.a(motionEvent);
                }
            }
        } else if (this.d != null) {
            this.d.a(motionEvent);
        }
        return r() ? false : super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        boolean z;
        synchronized (this.c) {
            z = this.m;
        }
        return z;
    }

    public int q() {
        int i;
        synchronized (this.c) {
            i = this.p;
        }
        return i;
    }

    public boolean r() {
        boolean z;
        synchronized (this.c) {
            z = this.l;
        }
        return z;
    }

    public void s() {
        synchronized (this.c) {
            ze.a("Destroying WebView!");
            zi.a.post(new Runnable(this) {
                final /* synthetic */ aau a;

                {
                    this.a = r1;
                }

                public void run() {
                    super.destroy();
                }
            });
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.C = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof aar) {
            this.h = (aar) webViewClient;
        }
    }

    public void stopLoading() {
        if (!r()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                zy.b("Could not stop loading webview.", e);
            }
        }
    }

    public boolean t() {
        boolean z;
        synchronized (this.c) {
            z = this.q;
        }
        return z;
    }

    public boolean u() {
        boolean z;
        synchronized (this.c) {
            z = this.a;
        }
        return z;
    }

    public String v() {
        String str;
        synchronized (this.c) {
            str = this.r;
        }
        return str;
    }

    public aap w() {
        return null;
    }

    public py x() {
        return this.z;
    }

    public pz y() {
        return this.B;
    }

    public aav z() {
        aav com_google_android_gms_b_aav;
        synchronized (this.c) {
            com_google_android_gms_b_aav = this.s;
        }
        return com_google_android_gms_b_aav;
    }
}
