package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.iid.InstanceID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzig
public class zzlb extends WebViewClient {
    private static final String[] zzSb = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", InstanceID.ERROR_TIMEOUT, "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] zzSc = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private zzed zzBH;
    protected zzla zzBb;
    private zzel zzCl;
    private zze zzCn;
    private zzgr zzCo;
    private zzej zzCq;
    private zzgx zzGg;
    private zza zzJS;
    private final HashMap<String, List<zzeh>> zzSd;
    private zzg zzSe;
    private zzb zzSf;
    private boolean zzSg;
    private boolean zzSh;
    private zzp zzSi;
    private final zzgv zzSj;
    protected zzjh zzSk;
    private boolean zzSl;
    private boolean zzSm;
    private boolean zzSn;
    private int zzSo;
    private final Object zzpp;
    private boolean zztL;
    private com.google.android.gms.ads.internal.client.zza zzuL;

    public interface zza {
        void zza(zzla com_google_android_gms_internal_zzla, boolean z);
    }

    public interface zzb {
        void zzbH();
    }

    private static class a implements zzg {
        private zzla a;
        private zzg b;

        public a(zzla com_google_android_gms_internal_zzla, zzg com_google_android_gms_ads_internal_overlay_zzg) {
            this.a = com_google_android_gms_internal_zzla;
            this.b = com_google_android_gms_ads_internal_overlay_zzg;
        }

        public void onPause() {
        }

        public void onResume() {
        }

        public void zzbs() {
            this.b.zzbs();
            this.a.zzjw();
        }

        public void zzbt() {
            this.b.zzbt();
            this.a.zzgu();
        }
    }

    private class b implements zzeh {
        final /* synthetic */ zzlb a;

        private b(zzlb com_google_android_gms_internal_zzlb) {
            this.a = com_google_android_gms_internal_zzlb;
        }

        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                this.a.zzjV();
            } else if (map.keySet().contains("stop")) {
                this.a.zzjW();
            } else if (map.keySet().contains("cancel")) {
                this.a.zzjX();
            }
        }
    }

    public zzlb(zzla com_google_android_gms_internal_zzla, boolean z) {
        this(com_google_android_gms_internal_zzla, z, new zzgv(com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzla.zzjz(), new zzcm(com_google_android_gms_internal_zzla.getContext())), null);
    }

    zzlb(zzla com_google_android_gms_internal_zzla, boolean z, zzgv com_google_android_gms_internal_zzgv, zzgr com_google_android_gms_internal_zzgr) {
        this.zzSd = new HashMap();
        this.zzpp = new Object();
        this.zzSg = false;
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zztL = z;
        this.zzSj = com_google_android_gms_internal_zzgv;
        this.zzCo = com_google_android_gms_internal_zzgr;
    }

    private void zza(Context context, String str, String str2, String str3) {
        if (((Boolean) zzcu.zzyw.get()).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            bundle.putString("host", zzaZ(str3));
            zzu.zzck().zza(context, this.zzBb.zzjG().afmaVersion, "gmob-apps", bundle, true);
        }
    }

    private String zzaZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    private static boolean zzh(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme);
    }

    private void zzjV() {
        synchronized (this.zzpp) {
            this.zzSh = true;
        }
        this.zzSo++;
        zzjY();
    }

    private void zzjW() {
        this.zzSo--;
        zzjY();
    }

    private void zzjX() {
        this.zzSn = true;
        zzjY();
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        zzjw.v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzpp) {
            if (this.zzSl) {
                zzjw.v("Blank page loaded, 1...");
                this.zzBb.zzjI();
                return;
            }
            this.zzSm = true;
            zzjY();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= zzSb.length) ? String.valueOf(i) : zzSb[(-i) - 1];
        zza(this.zzBb.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= zzSc.length) ? String.valueOf(primaryError) : zzSc[primaryError];
            zza(this.zzBb.getContext(), "ssl_err", valueOf, zzu.zzcm().zza(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final void reset() {
        if (this.zzSk != null) {
            this.zzSk.zzis();
            this.zzSk = null;
        }
        synchronized (this.zzpp) {
            this.zzSd.clear();
            this.zzuL = null;
            this.zzSe = null;
            this.zzJS = null;
            this.zzBH = null;
            this.zzSg = false;
            this.zztL = false;
            this.zzSh = false;
            this.zzCq = null;
            this.zzSi = null;
            this.zzSf = null;
            if (this.zzCo != null) {
                this.zzCo.zzr(true);
                this.zzCo = null;
            }
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
        zzjw.v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        } else if (this.zzSg && webView == this.zzBb.getWebView() && zzh(parse)) {
            if (this.zzuL != null && ((Boolean) zzcu.zzxV.get()).booleanValue()) {
                this.zzuL.onAdClicked();
                if (this.zzSk != null) {
                    this.zzSk.zzaH(str);
                }
                this.zzuL = null;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } else if (this.zzBb.getWebView().willNotDraw()) {
            str2 = "AdWebView unable to handle URL: ";
            valueOf = String.valueOf(str);
            com.google.android.gms.ads.internal.util.client.zzb.zzaW(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            Uri uri;
            try {
                zzaq zzjF = this.zzBb.zzjF();
                if (zzjF != null && zzjF.zzc(parse)) {
                    parse = zzjF.zzb(parse, this.zzBb.getContext());
                }
                uri = parse;
            } catch (zzar e) {
                String str3 = "Unable to append parameter to URL: ";
                str2 = String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.zzb.zzaW(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                uri = parse;
            }
            if (this.zzCn == null || this.zzCn.zzbG()) {
                zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.zzCn.zzt(str);
            }
        }
        return true;
    }

    public void zzJ(boolean z) {
        this.zzSg = z;
    }

    public void zza(int i, int i2, boolean z) {
        this.zzSj.zze(i, i2);
        if (this.zzCo != null) {
            this.zzCo.zza(i, i2, z);
        }
    }

    public void zza(com.google.android.gms.ads.internal.client.zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzed com_google_android_gms_internal_zzed, zzp com_google_android_gms_ads_internal_overlay_zzp, boolean z, zzej com_google_android_gms_internal_zzej, zzel com_google_android_gms_internal_zzel, zze com_google_android_gms_ads_internal_zze, zzgx com_google_android_gms_internal_zzgx, zzjh com_google_android_gms_internal_zzjh) {
        if (com_google_android_gms_ads_internal_zze == null) {
            com_google_android_gms_ads_internal_zze = new zze(this.zzBb.getContext());
        }
        this.zzCo = new zzgr(this.zzBb, com_google_android_gms_internal_zzgx);
        this.zzSk = com_google_android_gms_internal_zzjh;
        zza("/appEvent", new zzec(com_google_android_gms_internal_zzed));
        zza("/backButton", zzeg.zzBS);
        zza("/refresh", zzeg.zzBT);
        zza("/canOpenURLs", zzeg.zzBJ);
        zza("/canOpenIntents", zzeg.zzBK);
        zza("/click", zzeg.zzBL);
        zza("/close", zzeg.zzBM);
        zza("/customClose", zzeg.zzBO);
        zza("/instrument", zzeg.zzBX);
        zza("/delayPageLoaded", new b());
        zza("/httpTrack", zzeg.zzBP);
        zza("/log", zzeg.zzBQ);
        zza("/mraid", new zzen(com_google_android_gms_ads_internal_zze, this.zzCo));
        zza("/mraidLoaded", this.zzSj);
        zza("/open", new zzeo(com_google_android_gms_internal_zzej, com_google_android_gms_ads_internal_zze, this.zzCo));
        zza("/precache", zzeg.zzBW);
        zza("/touch", zzeg.zzBR);
        zza("/video", zzeg.zzBU);
        zza("/videoMeta", zzeg.zzBV);
        zza("/appStreaming", zzeg.zzBN);
        if (com_google_android_gms_internal_zzel != null) {
            zza("/setInterstitialProperties", new zzek(com_google_android_gms_internal_zzel));
        }
        this.zzuL = com_google_android_gms_ads_internal_client_zza;
        this.zzSe = com_google_android_gms_ads_internal_overlay_zzg;
        this.zzBH = com_google_android_gms_internal_zzed;
        this.zzCq = com_google_android_gms_internal_zzej;
        this.zzSi = com_google_android_gms_ads_internal_overlay_zzp;
        this.zzCn = com_google_android_gms_ads_internal_zze;
        this.zzGg = com_google_android_gms_internal_zzgx;
        this.zzCl = com_google_android_gms_internal_zzel;
        zzJ(z);
    }

    public final void zza(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel) {
        zzg com_google_android_gms_ads_internal_overlay_zzg = null;
        boolean zzjH = this.zzBb.zzjH();
        com.google.android.gms.ads.internal.client.zza com_google_android_gms_ads_internal_client_zza = (!zzjH || this.zzBb.zzbi().zzvt) ? this.zzuL : null;
        if (!zzjH) {
            com_google_android_gms_ads_internal_overlay_zzg = this.zzSe;
        }
        zza(new AdOverlayInfoParcel(adLauncherIntentInfoParcel, com_google_android_gms_ads_internal_client_zza, com_google_android_gms_ads_internal_overlay_zzg, this.zzSi, this.zzBb.zzjG()));
    }

    public void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean zzfQ = this.zzCo != null ? this.zzCo.zzfQ() : false;
        com.google.android.gms.ads.internal.overlay.zze zzci = zzu.zzci();
        Context context = this.zzBb.getContext();
        if (!zzfQ) {
            z = true;
        }
        zzci.zza(context, adOverlayInfoParcel, z);
        if (this.zzSk != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzHC != null) {
                str = adOverlayInfoParcel.zzHC.url;
            }
            this.zzSk.zzaH(str);
        }
    }

    public void zza(zza com_google_android_gms_internal_zzlb_zza) {
        this.zzJS = com_google_android_gms_internal_zzlb_zza;
    }

    public void zza(zzb com_google_android_gms_internal_zzlb_zzb) {
        this.zzSf = com_google_android_gms_internal_zzlb_zzb;
    }

    public void zza(String str, zzeh com_google_android_gms_internal_zzeh) {
        synchronized (this.zzpp) {
            List list = (List) this.zzSd.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zzSd.put(str, list);
            }
            list.add(com_google_android_gms_internal_zzeh);
        }
    }

    public final void zza(boolean z, int i) {
        com.google.android.gms.ads.internal.client.zza com_google_android_gms_ads_internal_client_zza = (!this.zzBb.zzjH() || this.zzBb.zzbi().zzvt) ? this.zzuL : null;
        zza(new AdOverlayInfoParcel(com_google_android_gms_ads_internal_client_zza, this.zzSe, this.zzSi, this.zzBb, z, i, this.zzBb.zzjG()));
    }

    public final void zza(boolean z, int i, String str) {
        zzg com_google_android_gms_ads_internal_overlay_zzg = null;
        boolean zzjH = this.zzBb.zzjH();
        com.google.android.gms.ads.internal.client.zza com_google_android_gms_ads_internal_client_zza = (!zzjH || this.zzBb.zzbi().zzvt) ? this.zzuL : null;
        if (!zzjH) {
            com_google_android_gms_ads_internal_overlay_zzg = new a(this.zzBb, this.zzSe);
        }
        zza(new AdOverlayInfoParcel(com_google_android_gms_ads_internal_client_zza, com_google_android_gms_ads_internal_overlay_zzg, this.zzBH, this.zzSi, this.zzBb, z, i, str, this.zzBb.zzjG(), this.zzCq));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzjH = this.zzBb.zzjH();
        com.google.android.gms.ads.internal.client.zza com_google_android_gms_ads_internal_client_zza = (!zzjH || this.zzBb.zzbi().zzvt) ? this.zzuL : null;
        zza(new AdOverlayInfoParcel(com_google_android_gms_ads_internal_client_zza, zzjH ? null : new a(this.zzBb, this.zzSe), this.zzBH, this.zzSi, this.zzBb, z, i, str, str2, this.zzBb.zzjG(), this.zzCq));
    }

    public void zzb(String str, zzeh com_google_android_gms_internal_zzeh) {
        synchronized (this.zzpp) {
            List list = (List) this.zzSd.get(str);
            if (list == null) {
                return;
            }
            list.remove(com_google_android_gms_internal_zzeh);
        }
    }

    public void zzd(int i, int i2) {
        if (this.zzCo != null) {
            this.zzCo.zzd(i, i2);
        }
    }

    public boolean zzdi() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zztL;
        }
        return z;
    }

    public final void zzgr() {
        synchronized (this.zzpp) {
            this.zzSg = false;
            this.zztL = true;
            zzu.zzck().runOnUiThread(new Runnable(this) {
                final /* synthetic */ zzlb a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.zzBb.zzjO();
                    zzd zzjB = this.a.zzBb.zzjB();
                    if (zzjB != null) {
                        zzjB.zzgr();
                    }
                    if (this.a.zzSf != null) {
                        this.a.zzSf.zzbH();
                        this.a.zzSf = null;
                    }
                }
            });
        }
    }

    public void zzi(Uri uri) {
        String path = uri.getPath();
        List<zzeh> list = (List) this.zzSd.get(path);
        if (list != null) {
            Map zzf = zzu.zzck().zzf(uri);
            if (com.google.android.gms.ads.internal.util.client.zzb.zzX(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                zzjw.v(path.length() != 0 ? str.concat(path) : new String(str));
                for (String path2 : zzf.keySet()) {
                    str = (String) zzf.get(path2);
                    zzjw.v(new StringBuilder((String.valueOf(path2).length() + 4) + String.valueOf(str).length()).append("  ").append(path2).append(": ").append(str).toString());
                }
            }
            for (zzeh zza : list) {
                zza.zza(this.zzBb, zzf);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        zzjw.v(new StringBuilder(String.valueOf(valueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf).toString());
    }

    public zze zzjR() {
        return this.zzCn;
    }

    public boolean zzjS() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzSh;
        }
        return z;
    }

    public void zzjT() {
        synchronized (this.zzpp) {
            zzjw.v("Loading blank page in WebView, 2...");
            this.zzSl = true;
            this.zzBb.zzaX("about:blank");
        }
    }

    public void zzjU() {
        if (this.zzSk != null) {
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzlb a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.zzSk != null) {
                        this.a.zzSk.zzk(this.a.zzBb.getView());
                    }
                }
            });
        }
    }

    public final void zzjY() {
        if (this.zzJS != null && ((this.zzSm && this.zzSo <= 0) || this.zzSn)) {
            this.zzJS.zza(this.zzBb, !this.zzSn);
            this.zzJS = null;
        }
        this.zzBb.zzjP();
    }

    public void zzl(zzla com_google_android_gms_internal_zzla) {
        this.zzBb = com_google_android_gms_internal_zzla;
    }
}
