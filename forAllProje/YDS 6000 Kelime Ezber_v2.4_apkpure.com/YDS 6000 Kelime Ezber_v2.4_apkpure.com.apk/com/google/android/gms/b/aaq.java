package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.b.mo.b;
import java.util.Map;
import org.json.JSONObject;

@vz
public interface aaq extends t, b, sw {
    boolean A();

    void B();

    void C();

    OnClickListener D();

    qn E();

    void F();

    WebView a();

    void a(int i);

    void a(Context context);

    void a(Context context, nx nxVar, qa qaVar);

    void a(g gVar);

    void a(aav com_google_android_gms_b_aav);

    void a(nx nxVar);

    void a(qn qnVar);

    void a(String str);

    void a(String str, String str2);

    void a(String str, Map<String, ?> map);

    void a(String str, JSONObject jSONObject);

    void a(boolean z);

    View b();

    void b(int i);

    void b(g gVar);

    void b(String str);

    void b(boolean z);

    void c();

    void c(boolean z);

    void d();

    void d(boolean z);

    void destroy();

    void e();

    Activity f();

    Context g();

    Context getContext();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    d h();

    g i();

    g j();

    nx k();

    aar l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    boolean m();

    void measure(int i, int i2);

    dp n();

    aab o();

    void onPause();

    void onResume();

    boolean p();

    int q();

    boolean r();

    void s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    boolean t();

    boolean u();

    String v();

    aap w();

    py x();

    pz y();

    aav z();
}
