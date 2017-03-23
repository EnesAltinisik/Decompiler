package com.google.android.gms.internal;

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
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONObject;

@zzig
public interface zzla extends zzs, zzbw, zzfk {
    void destroy();

    Context getContext();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    String getRequestId();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setContext(Context context);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    void zzD(int i);

    void zzG(boolean z);

    void zzH(boolean z);

    void zzI(boolean z);

    void zza(Context context, AdSizeParcel adSizeParcel, zzdc com_google_android_gms_internal_zzdc);

    void zza(AdSizeParcel adSizeParcel);

    void zza(zzlf com_google_android_gms_internal_zzlf);

    void zza(String str, Map<String, ?> map);

    void zza(String str, JSONObject jSONObject);

    void zzaX(String str);

    void zzaY(String str);

    void zzb(zzd com_google_android_gms_ads_internal_overlay_zzd);

    AdSizeParcel zzbi();

    void zzc(zzd com_google_android_gms_ads_internal_overlay_zzd);

    boolean zzgO();

    void zzgu();

    void zzh(String str, String str2);

    com.google.android.gms.ads.internal.zzd zzjA();

    zzd zzjB();

    zzd zzjC();

    zzlb zzjD();

    boolean zzjE();

    zzaq zzjF();

    VersionInfoParcel zzjG();

    boolean zzjH();

    void zzjI();

    boolean zzjJ();

    zzkz zzjK();

    zzda zzjL();

    zzdb zzjM();

    zzlf zzjN();

    void zzjO();

    void zzjP();

    OnClickListener zzjQ();

    void zzjw();

    void zzjx();

    Activity zzjy();

    Context zzjz();
}
