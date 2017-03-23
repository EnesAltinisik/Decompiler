package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.drive.DriveFile;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
class zzle extends WebView implements OnGlobalLayoutListener, DownloadListener, zzla {
    private zzkn A;
    private int B = -1;
    private int C = -1;
    private int D = -1;
    private int E = -1;
    private Map<String, zzeu> F;
    private final WindowManager G;
    boolean a = false;
    private final zza b;
    private final Object c = new Object();
    private final zzaq d;
    private final VersionInfoParcel e;
    private final zzs f;
    private final zzd g;
    private zzlb h;
    private com.google.android.gms.ads.internal.overlay.zzd i;
    private AdSizeParcel j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Boolean o;
    private int p;
    private boolean q = true;
    private String r = "";
    private zzlf s;
    private boolean t;
    private zzda u;
    private zzda v;
    private zzda w;
    private zzdb x;
    private WeakReference<OnClickListener> y;
    private com.google.android.gms.ads.internal.overlay.zzd z;

    @zzig
    public static class zza extends MutableContextWrapper {
        private Activity zzRn;
        private Context zzSO;
        private Context zztm;

        public zza(Context context) {
            super(context);
            setBaseContext(context);
        }

        public Object getSystemService(String str) {
            return this.zzSO.getSystemService(str);
        }

        public void setBaseContext(Context context) {
            this.zztm = context.getApplicationContext();
            this.zzRn = context instanceof Activity ? (Activity) context : null;
            this.zzSO = context;
            super.setBaseContext(this.zztm);
        }

        public void startActivity(Intent intent) {
            if (this.zzRn != null) {
                this.zzRn.startActivity(intent);
                return;
            }
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            this.zztm.startActivity(intent);
        }

        public Activity zzjy() {
            return this.zzRn;
        }

        public Context zzjz() {
            return this.zzSO;
        }
    }

    protected zzle(zza com_google_android_gms_internal_zzle_zza, AdSizeParcel adSizeParcel, boolean z, boolean z2, zzaq com_google_android_gms_internal_zzaq, VersionInfoParcel versionInfoParcel, zzdc com_google_android_gms_internal_zzdc, zzs com_google_android_gms_ads_internal_zzs, zzd com_google_android_gms_ads_internal_zzd) {
        super(com_google_android_gms_internal_zzle_zza);
        this.b = com_google_android_gms_internal_zzle_zza;
        this.j = adSizeParcel;
        this.m = z;
        this.p = -1;
        this.d = com_google_android_gms_internal_zzaq;
        this.e = versionInfoParcel;
        this.f = com_google_android_gms_ads_internal_zzs;
        this.g = com_google_android_gms_ads_internal_zzd;
        this.G = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        zzu.zzck().zza((Context) com_google_android_gms_internal_zzle_zza, versionInfoParcel.afmaVersion, settings);
        zzu.zzcm().zza(getContext(), settings);
        setDownloadListener(this);
        e();
        if (com.google.android.gms.common.util.zzs.zzvc()) {
            addJavascriptInterface(new zzlg(this), "googleAdsJsInterface");
        }
        if (com.google.android.gms.common.util.zzs.zzuX()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.A = new zzkn(this.b.zzjy(), this, this, null);
        a(com_google_android_gms_internal_zzdc);
    }

    static zzle a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, zzaq com_google_android_gms_internal_zzaq, VersionInfoParcel versionInfoParcel, zzdc com_google_android_gms_internal_zzdc, zzs com_google_android_gms_ads_internal_zzs, zzd com_google_android_gms_ads_internal_zzd) {
        return new zzle(new zza(context), adSizeParcel, z, z2, com_google_android_gms_internal_zzaq, versionInfoParcel, com_google_android_gms_internal_zzdc, com_google_android_gms_ads_internal_zzs, com_google_android_gms_ads_internal_zzd);
    }

    private void a(zzdc com_google_android_gms_internal_zzdc) {
        i();
        this.x = new zzdb(new zzdc(true, "make_wv", this.j.zzvs));
        this.x.zzez().zzc(com_google_android_gms_internal_zzdc);
        this.v = zzcy.zzb(this.x.zzez());
        this.x.zza("native:view_create", this.v);
        this.w = null;
        this.u = null;
    }

    private void a(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    private void c() {
        synchronized (this.c) {
            this.o = zzu.zzcn().zziL();
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

    private void d() {
        zzcy.zza(this.x.zzez(), this.u, "aeh");
    }

    private void e() {
        synchronized (this.c) {
            if (this.m || this.j.zzvt) {
                if (VERSION.SDK_INT < 14) {
                    zzb.zzaU("Disabling hardware acceleration on an overlay.");
                    f();
                } else {
                    zzb.zzaU("Enabling hardware acceleration on an overlay.");
                    g();
                }
            } else if (VERSION.SDK_INT < 18) {
                zzb.zzaU("Disabling hardware acceleration on an AdView.");
                f();
            } else {
                zzb.zzaU("Enabling hardware acceleration on an AdView.");
                g();
            }
        }
    }

    private void f() {
        synchronized (this.c) {
            if (!this.n) {
                zzu.zzcm().zzq(this);
            }
            this.n = true;
        }
    }

    private void g() {
        synchronized (this.c) {
            if (this.n) {
                zzu.zzcm().zzp(this);
            }
            this.n = false;
        }
    }

    private void h() {
        synchronized (this.c) {
            this.F = null;
        }
    }

    private void i() {
        if (this.x != null) {
            zzdc zzez = this.x.zzez();
            if (zzez != null && zzu.zzcn().zziG() != null) {
                zzu.zzcn().zziG().zza(zzez);
            }
        }
    }

    void a(Boolean bool) {
        synchronized (this.c) {
            this.o = bool;
        }
        zzu.zzcn().zzb(bool);
    }

    protected void a(String str) {
        synchronized (this.c) {
            if (isDestroyed()) {
                zzb.zzaW("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    @TargetApi(19)
    protected void a(String str, ValueCallback<String> valueCallback) {
        synchronized (this.c) {
            if (isDestroyed()) {
                zzb.zzaW("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                evaluateJavascript(str, valueCallback);
            }
        }
    }

    public boolean a() {
        if (!zzjD().zzdi()) {
            return false;
        }
        int i;
        int i2;
        DisplayMetrics zza = zzu.zzck().zza(this.G);
        int zzb = zzm.zzdQ().zzb(zza, zza.widthPixels);
        int zzb2 = zzm.zzdQ().zzb(zza, zza.heightPixels);
        Activity zzjy = zzjy();
        if (zzjy == null || zzjy.getWindow() == null) {
            i = zzb2;
            i2 = zzb;
        } else {
            int[] zzh = zzu.zzck().zzh(zzjy);
            i2 = zzm.zzdQ().zzb(zza, zzh[0]);
            i = zzm.zzdQ().zzb(zza, zzh[1]);
        }
        if (this.C == zzb && this.B == zzb2 && this.D == i2 && this.E == i) {
            return false;
        }
        boolean z = (this.C == zzb && this.B == zzb2) ? false : true;
        this.C = zzb;
        this.B = zzb2;
        this.D = i2;
        this.E = i;
        new zzgw(this).zza(zzb, zzb2, i2, i, zza.density, this.G.getDefaultDisplay().getRotation());
        return z;
    }

    Boolean b() {
        Boolean bool;
        synchronized (this.c) {
            bool = this.o;
        }
        return bool;
    }

    protected void b(String str) {
        if (com.google.android.gms.common.util.zzs.zzve()) {
            if (b() == null) {
                c();
            }
            if (b().booleanValue()) {
                a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        str2 = "javascript:";
        valueOf = String.valueOf(str);
        a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public void destroy() {
        synchronized (this.c) {
            i();
            this.A.zzjo();
            if (this.i != null) {
                this.i.close();
                this.i.onDestroy();
                this.i = null;
            }
            this.h.reset();
            if (this.l) {
                return;
            }
            zzu.zzcD().zzd(this);
            h();
            this.l = true;
            zzjw.v("Initiating WebView self destruct sequence in 3...");
            this.h.zzjT();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r1 = r2.c;
        monitor-enter(r1);
        r0 = r2.isDestroyed();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaW(r0);	 Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzle.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    protected void finalize() throws Throwable {
        synchronized (this.c) {
            if (!this.l) {
                this.h.reset();
                zzu.zzcD().zzd(this);
                h();
            }
        }
        super.finalize();
    }

    public String getRequestId() {
        String str;
        synchronized (this.c) {
            str = this.r;
        }
        return str;
    }

    public int getRequestedOrientation() {
        int i;
        synchronized (this.c) {
            i = this.p;
        }
        return i;
    }

    public View getView() {
        return this;
    }

    public WebView getWebView() {
        return this;
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.c) {
            z = this.l;
        }
        return z;
    }

    public void loadData(String str, String str2, String str3) {
        synchronized (this.c) {
            if (isDestroyed()) {
                zzb.zzaW("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.c) {
            if (isDestroyed()) {
                zzb.zzaW("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public void loadUrl(String str) {
        synchronized (this.c) {
            if (isDestroyed()) {
                zzb.zzaW("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable th) {
                    String valueOf = String.valueOf(th);
                    zzb.zzaW(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Could not call loadUrl. ").append(valueOf).toString());
                }
            }
        }
    }

    protected void onAttachedToWindow() {
        synchronized (this.c) {
            super.onAttachedToWindow();
            if (!isDestroyed()) {
                this.A.onAttachedToWindow();
            }
            a(this.t);
        }
    }

    protected void onDetachedFromWindow() {
        synchronized (this.c) {
            if (!isDestroyed()) {
                this.A.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
        }
        a(false);
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzu.zzck().zzb(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zzb.zzaU(new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public void onGlobalLayout() {
        boolean a = a();
        com.google.android.gms.ads.internal.overlay.zzd zzjB = zzjB();
        if (zzjB != null && a) {
            zzjB.zzgt();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.c;
        monitor-enter(r4);
        r1 = r9.isDestroyed();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
    L_0x0018:
        return;
    L_0x0019:
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x0034 }
        if (r1 != 0) goto L_0x002f;
    L_0x001f:
        r1 = r9.m;	 Catch:{ all -> 0x0034 }
        if (r1 != 0) goto L_0x002f;
    L_0x0023:
        r1 = r9.j;	 Catch:{ all -> 0x0034 }
        r1 = r1.zzvv;	 Catch:{ all -> 0x0034 }
        if (r1 != 0) goto L_0x002f;
    L_0x0029:
        r1 = r9.j;	 Catch:{ all -> 0x0034 }
        r1 = r1.zzvw;	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0037;
    L_0x002f:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        goto L_0x0018;
    L_0x0034:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        throw r0;
    L_0x0037:
        r1 = r9.j;	 Catch:{ all -> 0x0034 }
        r1 = r1.zzvt;	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0054;
    L_0x003d:
        r0 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x0034 }
        r0.<init>();	 Catch:{ all -> 0x0034 }
        r1 = r9.G;	 Catch:{ all -> 0x0034 }
        r1 = r1.getDefaultDisplay();	 Catch:{ all -> 0x0034 }
        r1.getMetrics(r0);	 Catch:{ all -> 0x0034 }
        r1 = r0.widthPixels;	 Catch:{ all -> 0x0034 }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x0034 }
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        goto L_0x0018;
    L_0x0054:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x0034 }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x0034 }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x0034 }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x0034 }
        if (r2 == r6) goto L_0x0068;
    L_0x0066:
        if (r2 != r8) goto L_0x00ff;
    L_0x0068:
        r2 = r3;
    L_0x0069:
        if (r5 == r6) goto L_0x006d;
    L_0x006b:
        if (r5 != r8) goto L_0x006e;
    L_0x006d:
        r0 = r1;
    L_0x006e:
        r5 = r9.j;	 Catch:{ all -> 0x0034 }
        r5 = r5.widthPixels;	 Catch:{ all -> 0x0034 }
        if (r5 > r2) goto L_0x007a;
    L_0x0074:
        r2 = r9.j;	 Catch:{ all -> 0x0034 }
        r2 = r2.heightPixels;	 Catch:{ all -> 0x0034 }
        if (r2 <= r0) goto L_0x00e9;
    L_0x007a:
        r0 = r9.b;	 Catch:{ all -> 0x0034 }
        r0 = r0.getResources();	 Catch:{ all -> 0x0034 }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x0034 }
        r0 = r0.density;	 Catch:{ all -> 0x0034 }
        r2 = r9.j;	 Catch:{ all -> 0x0034 }
        r2 = r2.widthPixels;	 Catch:{ all -> 0x0034 }
        r2 = (float) r2;	 Catch:{ all -> 0x0034 }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x0034 }
        r5 = r9.j;	 Catch:{ all -> 0x0034 }
        r5 = r5.heightPixels;	 Catch:{ all -> 0x0034 }
        r5 = (float) r5;	 Catch:{ all -> 0x0034 }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x0034 }
        r3 = (float) r3;	 Catch:{ all -> 0x0034 }
        r3 = r3 / r0;
        r3 = (int) r3;	 Catch:{ all -> 0x0034 }
        r1 = (float) r1;	 Catch:{ all -> 0x0034 }
        r0 = r1 / r0;
        r0 = (int) r0;	 Catch:{ all -> 0x0034 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r6 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1.<init>(r6);	 Catch:{ all -> 0x0034 }
        r6 = "Not enough space to show ad. Needs ";
        r1 = r1.append(r6);	 Catch:{ all -> 0x0034 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0034 }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0034 }
        r1 = r1.append(r5);	 Catch:{ all -> 0x0034 }
        r2 = " dp, but only has ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0034 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0034 }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0034 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x0034 }
        r1 = " dp.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x0034 }
        r0 = r0.toString();	 Catch:{ all -> 0x0034 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaW(r0);	 Catch:{ all -> 0x0034 }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x0034 }
        if (r0 == r7) goto L_0x00e1;
    L_0x00dd:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x0034 }
    L_0x00e1:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x0034 }
    L_0x00e6:
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        goto L_0x0018;
    L_0x00e9:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x0034 }
        if (r0 == r7) goto L_0x00f3;
    L_0x00ef:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x0034 }
    L_0x00f3:
        r0 = r9.j;	 Catch:{ all -> 0x0034 }
        r0 = r0.widthPixels;	 Catch:{ all -> 0x0034 }
        r1 = r9.j;	 Catch:{ all -> 0x0034 }
        r1 = r1.heightPixels;	 Catch:{ all -> 0x0034 }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x0034 }
        goto L_0x00e6;
    L_0x00ff:
        r2 = r0;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzle.onMeasure(int, int):void");
    }

    public void onPause() {
        if (!isDestroyed()) {
            try {
                if (com.google.android.gms.common.util.zzs.zzuX()) {
                    super.onPause();
                }
            } catch (Throwable e) {
                zzb.zzb("Could not pause webview.", e);
            }
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            try {
                if (com.google.android.gms.common.util.zzs.zzuX()) {
                    super.onResume();
                }
            } catch (Throwable e) {
                zzb.zzb("Could not resume webview.", e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.zza(motionEvent);
        }
        return isDestroyed() ? false : super.onTouchEvent(motionEvent);
    }

    public void setContext(Context context) {
        this.b.setBaseContext(context);
        this.A.zzl(this.b.zzjy());
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.y = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public void setRequestedOrientation(int i) {
        synchronized (this.c) {
            this.p = i;
            if (this.i != null) {
                this.i.setRequestedOrientation(this.p);
            }
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzlb) {
            this.h = (zzlb) webViewClient;
        }
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                zzb.zzb("Could not stop loading webview.", e);
            }
        }
    }

    public void zzD(int i) {
        d();
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.e.afmaVersion);
        zza("onhide", hashMap);
    }

    public void zzG(boolean z) {
        synchronized (this.c) {
            this.m = z;
            e();
        }
    }

    public void zzH(boolean z) {
        synchronized (this.c) {
            if (this.i != null) {
                this.i.zza(this.h.zzdi(), z);
            } else {
                this.k = z;
            }
        }
    }

    public void zzI(boolean z) {
        synchronized (this.c) {
            this.q = z;
        }
    }

    public void zza(Context context, AdSizeParcel adSizeParcel, zzdc com_google_android_gms_internal_zzdc) {
        synchronized (this.c) {
            this.A.zzjo();
            setContext(context);
            this.i = null;
            this.j = adSizeParcel;
            this.m = false;
            this.k = false;
            this.r = "";
            this.p = -1;
            zzu.zzcm().zzj(this);
            loadUrl("about:blank");
            this.h.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.q = true;
            this.a = false;
            this.s = null;
            a(com_google_android_gms_internal_zzdc);
            this.t = false;
            zzu.zzcD().zzd(this);
            h();
        }
    }

    public void zza(AdSizeParcel adSizeParcel) {
        synchronized (this.c) {
            this.j = adSizeParcel;
            requestLayout();
        }
    }

    public void zza(zzbv com_google_android_gms_internal_zzbv, boolean z) {
        synchronized (this.c) {
            this.t = z;
        }
        a(z);
    }

    public void zza(zzlf com_google_android_gms_internal_zzlf) {
        synchronized (this.c) {
            if (this.s != null) {
                zzb.e("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.s = com_google_android_gms_internal_zzlf;
        }
    }

    public void zza(String str, zzeh com_google_android_gms_internal_zzeh) {
        if (this.h != null) {
            this.h.zza(str, com_google_android_gms_internal_zzeh);
        }
    }

    public void zza(String str, Map<String, ?> map) {
        try {
            zzb(str, zzu.zzck().zzM((Map) map));
        } catch (JSONException e) {
            zzb.zzaW("Could not convert parameters to JSON.");
        }
    }

    public void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzh(str, jSONObject.toString());
    }

    public void zzaX(String str) {
        synchronized (this.c) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                String valueOf = String.valueOf(th);
                zzb.zzaW(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Could not call loadUrl. ").append(valueOf).toString());
            }
        }
    }

    public void zzaY(String str) {
        synchronized (this.c) {
            if (str == null) {
                str = "";
            }
            this.r = str;
        }
    }

    public void zzb(com.google.android.gms.ads.internal.overlay.zzd com_google_android_gms_ads_internal_overlay_zzd) {
        synchronized (this.c) {
            this.i = com_google_android_gms_ads_internal_overlay_zzd;
        }
    }

    public void zzb(String str, zzeh com_google_android_gms_internal_zzeh) {
        if (this.h != null) {
            this.h.zzb(str, com_google_android_gms_internal_zzeh);
        }
    }

    public void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AFMA_ReceiveMessage('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        String str2 = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        zzjw.v(jSONObject2.length() != 0 ? str2.concat(jSONObject2) : new String(str2));
        b(stringBuilder.toString());
    }

    public void zzbA() {
        synchronized (this.c) {
            this.a = true;
            if (this.f != null) {
                this.f.zzbA();
            }
        }
    }

    public void zzbB() {
        synchronized (this.c) {
            this.a = false;
            if (this.f != null) {
                this.f.zzbB();
            }
        }
    }

    public AdSizeParcel zzbi() {
        AdSizeParcel adSizeParcel;
        synchronized (this.c) {
            adSizeParcel = this.j;
        }
        return adSizeParcel;
    }

    public void zzc(com.google.android.gms.ads.internal.overlay.zzd com_google_android_gms_ads_internal_overlay_zzd) {
        synchronized (this.c) {
            this.z = com_google_android_gms_ads_internal_overlay_zzd;
        }
    }

    public boolean zzgO() {
        boolean z;
        synchronized (this.c) {
            zzcy.zza(this.x.zzez(), this.u, "aebb");
            z = this.q;
        }
        return z;
    }

    public void zzgu() {
        if (this.u == null) {
            zzcy.zza(this.x.zzez(), this.w, "aes");
            this.u = zzcy.zzb(this.x.zzez());
            this.x.zza("native:view_show", this.u);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.e.afmaVersion);
        zza("onshow", hashMap);
    }

    public void zzh(String str, String str2) {
        b(new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length()).append(str).append("(").append(str2).append(");").toString());
    }

    public zzd zzjA() {
        return this.g;
    }

    public com.google.android.gms.ads.internal.overlay.zzd zzjB() {
        com.google.android.gms.ads.internal.overlay.zzd com_google_android_gms_ads_internal_overlay_zzd;
        synchronized (this.c) {
            com_google_android_gms_ads_internal_overlay_zzd = this.i;
        }
        return com_google_android_gms_ads_internal_overlay_zzd;
    }

    public com.google.android.gms.ads.internal.overlay.zzd zzjC() {
        com.google.android.gms.ads.internal.overlay.zzd com_google_android_gms_ads_internal_overlay_zzd;
        synchronized (this.c) {
            com_google_android_gms_ads_internal_overlay_zzd = this.z;
        }
        return com_google_android_gms_ads_internal_overlay_zzd;
    }

    public zzlb zzjD() {
        return this.h;
    }

    public boolean zzjE() {
        boolean z;
        synchronized (this.c) {
            z = this.k;
        }
        return z;
    }

    public zzaq zzjF() {
        return this.d;
    }

    public VersionInfoParcel zzjG() {
        return this.e;
    }

    public boolean zzjH() {
        boolean z;
        synchronized (this.c) {
            z = this.m;
        }
        return z;
    }

    public void zzjI() {
        synchronized (this.c) {
            zzjw.v("Destroying WebView!");
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzle a;

                {
                    this.a = r1;
                }

                public void run() {
                    super.destroy();
                }
            });
        }
    }

    public boolean zzjJ() {
        boolean z;
        synchronized (this.c) {
            z = this.a;
        }
        return z;
    }

    public zzkz zzjK() {
        return null;
    }

    public zzda zzjL() {
        return this.w;
    }

    public zzdb zzjM() {
        return this.x;
    }

    public zzlf zzjN() {
        zzlf com_google_android_gms_internal_zzlf;
        synchronized (this.c) {
            com_google_android_gms_internal_zzlf = this.s;
        }
        return com_google_android_gms_internal_zzlf;
    }

    public void zzjO() {
        this.A.zzjn();
    }

    public void zzjP() {
        if (this.w == null) {
            this.w = zzcy.zzb(this.x.zzez());
            this.x.zza("native:view_load", this.w);
        }
    }

    public OnClickListener zzjQ() {
        return (OnClickListener) this.y.get();
    }

    public void zzjw() {
        d();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.e.afmaVersion);
        zza("onhide", hashMap);
    }

    public void zzjx() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzu.zzck().zzbU()));
        hashMap.put("app_volume", String.valueOf(zzu.zzck().zzbS()));
        hashMap.put("device_volume", String.valueOf(zzu.zzck().zzK(getContext())));
        zza("volume", hashMap);
    }

    public Activity zzjy() {
        return this.b.zzjy();
    }

    public Context zzjz() {
        return this.b.zzjz();
    }
}
