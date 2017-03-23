package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@zzig
class ac extends FrameLayout implements zzla {
    private final zzla a;
    private final zzkz b;

    public ac(zzla com_google_android_gms_internal_zzla) {
        super(com_google_android_gms_internal_zzla.getContext());
        this.a = com_google_android_gms_internal_zzla;
        this.b = new zzkz(com_google_android_gms_internal_zzla.zzjz(), this, this);
        zzlb zzjD = this.a.zzjD();
        if (zzjD != null) {
            zzjD.zzl(this);
        }
        addView(this.a.getView());
    }

    public void destroy() {
        this.a.destroy();
    }

    public String getRequestId() {
        return this.a.getRequestId();
    }

    public int getRequestedOrientation() {
        return this.a.getRequestedOrientation();
    }

    public View getView() {
        return this;
    }

    public WebView getWebView() {
        return this.a.getWebView();
    }

    public boolean isDestroyed() {
        return this.a.isDestroyed();
    }

    public void loadData(String str, String str2, String str3) {
        this.a.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        this.a.loadUrl(str);
    }

    public void onPause() {
        this.b.onPause();
        this.a.onPause();
    }

    public void onResume() {
        this.a.onResume();
    }

    public void setBackgroundColor(int i) {
        this.a.setBackgroundColor(i);
    }

    public void setContext(Context context) {
        this.a.setContext(context);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }

    public void setRequestedOrientation(int i) {
        this.a.setRequestedOrientation(i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.a.setWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.a.setWebViewClient(webViewClient);
    }

    public void stopLoading() {
        this.a.stopLoading();
    }

    public void zzD(int i) {
        this.a.zzD(i);
    }

    public void zzG(boolean z) {
        this.a.zzG(z);
    }

    public void zzH(boolean z) {
        this.a.zzH(z);
    }

    public void zzI(boolean z) {
        this.a.zzI(z);
    }

    public void zza(Context context, AdSizeParcel adSizeParcel, zzdc com_google_android_gms_internal_zzdc) {
        this.b.onDestroy();
        this.a.zza(context, adSizeParcel, com_google_android_gms_internal_zzdc);
    }

    public void zza(AdSizeParcel adSizeParcel) {
        this.a.zza(adSizeParcel);
    }

    public void zza(zzbv com_google_android_gms_internal_zzbv, boolean z) {
        this.a.zza(com_google_android_gms_internal_zzbv, z);
    }

    public void zza(zzlf com_google_android_gms_internal_zzlf) {
        this.a.zza(com_google_android_gms_internal_zzlf);
    }

    public void zza(String str, zzeh com_google_android_gms_internal_zzeh) {
        this.a.zza(str, com_google_android_gms_internal_zzeh);
    }

    public void zza(String str, Map<String, ?> map) {
        this.a.zza(str, (Map) map);
    }

    public void zza(String str, JSONObject jSONObject) {
        this.a.zza(str, jSONObject);
    }

    public void zzaX(String str) {
        this.a.zzaX(str);
    }

    public void zzaY(String str) {
        this.a.zzaY(str);
    }

    public void zzb(zzd com_google_android_gms_ads_internal_overlay_zzd) {
        this.a.zzb(com_google_android_gms_ads_internal_overlay_zzd);
    }

    public void zzb(String str, zzeh com_google_android_gms_internal_zzeh) {
        this.a.zzb(str, com_google_android_gms_internal_zzeh);
    }

    public void zzb(String str, JSONObject jSONObject) {
        this.a.zzb(str, jSONObject);
    }

    public void zzbA() {
        this.a.zzbA();
    }

    public void zzbB() {
        this.a.zzbB();
    }

    public AdSizeParcel zzbi() {
        return this.a.zzbi();
    }

    public void zzc(zzd com_google_android_gms_ads_internal_overlay_zzd) {
        this.a.zzc(com_google_android_gms_ads_internal_overlay_zzd);
    }

    public boolean zzgO() {
        return this.a.zzgO();
    }

    public void zzgu() {
        this.a.zzgu();
    }

    public void zzh(String str, String str2) {
        this.a.zzh(str, str2);
    }

    public com.google.android.gms.ads.internal.zzd zzjA() {
        return this.a.zzjA();
    }

    public zzd zzjB() {
        return this.a.zzjB();
    }

    public zzd zzjC() {
        return this.a.zzjC();
    }

    public zzlb zzjD() {
        return this.a.zzjD();
    }

    public boolean zzjE() {
        return this.a.zzjE();
    }

    public zzaq zzjF() {
        return this.a.zzjF();
    }

    public VersionInfoParcel zzjG() {
        return this.a.zzjG();
    }

    public boolean zzjH() {
        return this.a.zzjH();
    }

    public void zzjI() {
        this.b.onDestroy();
        this.a.zzjI();
    }

    public boolean zzjJ() {
        return this.a.zzjJ();
    }

    public zzkz zzjK() {
        return this.b;
    }

    public zzda zzjL() {
        return this.a.zzjL();
    }

    public zzdb zzjM() {
        return this.a.zzjM();
    }

    public zzlf zzjN() {
        return this.a.zzjN();
    }

    public void zzjO() {
        this.a.zzjO();
    }

    public void zzjP() {
        this.a.zzjP();
    }

    public OnClickListener zzjQ() {
        return this.a.zzjQ();
    }

    public void zzjw() {
        this.a.zzjw();
    }

    public void zzjx() {
        this.a.zzjx();
    }

    public Activity zzjy() {
        return this.a.zzjy();
    }

    public Context zzjz() {
        return this.a.zzjz();
    }
}
