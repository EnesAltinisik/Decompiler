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
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzbo;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjz;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzig
public class zzt extends zza {
    private final Context mContext;
    private zzq zzqG;
    private final VersionInfoParcel zzqP;
    private final AdSizeParcel zzrJ;
    private final Future<zzbo> zzrK = zzca();
    private final b zzrL;
    private WebView zzrM = new WebView(this.mContext);
    private zzbo zzrN;
    private AsyncTask<Void, Void, Void> zzrO;

    private class a extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ zzt a;

        private a(zzt com_google_android_gms_ads_internal_zzt) {
            this.a = com_google_android_gms_ads_internal_zzt;
        }

        protected Void a(Void... voidArr) {
            Throwable e;
            try {
                this.a.zzrN = (zzbo) this.a.zzrK.get(((Long) zzcu.zzzA.get()).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                zzb.zzd("Failed to load ad data", e);
            } catch (ExecutionException e3) {
                e = e3;
                zzb.zzd("Failed to load ad data", e);
            } catch (TimeoutException e4) {
                zzb.zzaW("Timed out waiting for ad data");
            }
            return null;
        }

        protected void a(Void voidR) {
            String zzbY = this.a.zzbY();
            if (this.a.zzrM != null) {
                this.a.zzrM.loadUrl(zzbY);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Void) obj);
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

        public void a(AdRequestParcel adRequestParcel) {
            this.c = adRequestParcel.zzuU.zzwM;
            Bundle bundle = adRequestParcel.zzuX != null ? adRequestParcel.zzuX.getBundle(AdMobAdapter.class.getName()) : null;
            if (bundle != null) {
                String str = (String) zzcu.zzzz.get();
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

    public zzt(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this.mContext = context;
        this.zzqP = versionInfoParcel;
        this.zzrJ = adSizeParcel;
        this.zzrL = new b(str);
        zzbX();
    }

    private void zzbX() {
        zzh(0);
        this.zzrM.setVerticalScrollBarEnabled(false);
        this.zzrM.getSettings().setJavaScriptEnabled(true);
        this.zzrM.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ zzt a;

            {
                this.a = r1;
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (this.a.zzqG != null) {
                    try {
                        this.a.zzqG.onAdFailedToLoad(0);
                    } catch (Throwable e) {
                        zzb.zzd("Could not call AdListener.onAdFailedToLoad().", e);
                    }
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith(this.a.zzbZ())) {
                    return false;
                }
                if (str.startsWith((String) zzcu.zzzv.get())) {
                    if (this.a.zzqG != null) {
                        try {
                            this.a.zzqG.onAdFailedToLoad(3);
                        } catch (Throwable e) {
                            zzb.zzd("Could not call AdListener.onAdFailedToLoad().", e);
                        }
                    }
                    this.a.zzh(0);
                    return true;
                } else if (str.startsWith((String) zzcu.zzzw.get())) {
                    if (this.a.zzqG != null) {
                        try {
                            this.a.zzqG.onAdFailedToLoad(0);
                        } catch (Throwable e2) {
                            zzb.zzd("Could not call AdListener.onAdFailedToLoad().", e2);
                        }
                    }
                    this.a.zzh(0);
                    return true;
                } else if (str.startsWith((String) zzcu.zzzx.get())) {
                    if (this.a.zzqG != null) {
                        try {
                            this.a.zzqG.onAdLoaded();
                        } catch (Throwable e22) {
                            zzb.zzd("Could not call AdListener.onAdLoaded().", e22);
                        }
                    }
                    this.a.zzh(this.a.zzw(str));
                    return true;
                } else if (str.startsWith("gmsg://")) {
                    return true;
                } else {
                    if (this.a.zzqG != null) {
                        try {
                            this.a.zzqG.onAdLeftApplication();
                        } catch (Throwable e222) {
                            zzb.zzd("Could not call AdListener.onAdLeftApplication().", e222);
                        }
                    }
                    this.a.zzy(this.a.zzx(str));
                    return true;
                }
            }
        });
        this.zzrM.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ zzt a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.a.zzrN != null) {
                    try {
                        this.a.zzrN.zza(motionEvent);
                    } catch (Throwable e) {
                        zzb.zzd("Unable to process ad data", e);
                    }
                }
                return false;
            }
        });
    }

    private Future<zzbo> zzca() {
        return zzjz.zza(new Callable<zzbo>(this) {
            final /* synthetic */ zzt a;

            {
                this.a = r1;
            }

            public zzbo a() throws Exception {
                return new zzbo(this.a.zzqP.afmaVersion, this.a.mContext, false);
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        });
    }

    private String zzx(String str) {
        if (this.zzrN == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzrN.zzd(parse, this.mContext);
        } catch (Throwable e) {
            zzb.zzd("Unable to process ad data", e);
        } catch (Throwable e2) {
            zzb.zzd("Unable to parse ad click url", e2);
        }
        return parse.toString();
    }

    private void zzy(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.mContext.startActivity(intent);
    }

    public void destroy() throws RemoteException {
        zzaa.zzdc("destroy must be called on the main UI thread.");
        this.zzrO.cancel(true);
        this.zzrK.cancel(true);
        this.zzrM.destroy();
        this.zzrM = null;
    }

    public String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public boolean isLoading() throws RemoteException {
        return false;
    }

    public boolean isReady() throws RemoteException {
        return false;
    }

    public void pause() throws RemoteException {
        zzaa.zzdc("pause must be called on the main UI thread.");
    }

    public void resume() throws RemoteException {
        zzaa.zzdc("resume must be called on the main UI thread.");
    }

    public void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    public void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void stopLoading() throws RemoteException {
    }

    public void zza(AdSizeParcel adSizeParcel) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public void zza(VideoOptionsParcel videoOptionsParcel) {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzp com_google_android_gms_ads_internal_client_zzp) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzq com_google_android_gms_ads_internal_client_zzq) throws RemoteException {
        this.zzqG = com_google_android_gms_ads_internal_client_zzq;
    }

    public void zza(zzw com_google_android_gms_ads_internal_client_zzw) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzy com_google_android_gms_ads_internal_client_zzy) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzd com_google_android_gms_ads_internal_reward_client_zzd) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzdg com_google_android_gms_internal_zzdg) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzhh com_google_android_gms_internal_zzhh) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzhl com_google_android_gms_internal_zzhl, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public boolean zzb(AdRequestParcel adRequestParcel) throws RemoteException {
        zzaa.zzb(this.zzrM, (Object) "This Search Ad has already been torn down");
        this.zzrL.a(adRequestParcel);
        this.zzrO = new a().execute(new Void[0]);
        return true;
    }

    String zzbY() {
        String valueOf;
        Uri zzc;
        Throwable e;
        String valueOf2;
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) zzcu.zzzy.get());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzrL.b());
        builder.appendQueryParameter("pubId", this.zzrL.c());
        Map d = this.zzrL.d();
        for (String valueOf3 : d.keySet()) {
            builder.appendQueryParameter(valueOf3, (String) d.get(valueOf3));
        }
        Uri build = builder.build();
        if (this.zzrN != null) {
            try {
                zzc = this.zzrN.zzc(build, this.mContext);
            } catch (zzbp e2) {
                e = e2;
                zzb.zzd("Unable to process ad data", e);
                zzc = build;
                valueOf2 = String.valueOf(zzbZ());
                valueOf3 = String.valueOf(zzc.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            } catch (RemoteException e3) {
                e = e3;
                zzb.zzd("Unable to process ad data", e);
                zzc = build;
                valueOf2 = String.valueOf(zzbZ());
                valueOf3 = String.valueOf(zzc.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            }
            valueOf2 = String.valueOf(zzbZ());
            valueOf3 = String.valueOf(zzc.getEncodedQuery());
            return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
        }
        zzc = build;
        valueOf2 = String.valueOf(zzbZ());
        valueOf3 = String.valueOf(zzc.getEncodedQuery());
        return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
    }

    String zzbZ() {
        String str;
        CharSequence a = this.zzrL.a();
        if (TextUtils.isEmpty(a)) {
            str = "www.google.com";
        } else {
            CharSequence charSequence = a;
        }
        String valueOf = String.valueOf("https://");
        String str2 = (String) zzcu.zzzy.get();
        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(str).append(str2).toString();
    }

    public com.google.android.gms.dynamic.zzd zzbh() throws RemoteException {
        zzaa.zzdc("getAdFrame must be called on the main UI thread.");
        return zze.zzD(this.zzrM);
    }

    public AdSizeParcel zzbi() throws RemoteException {
        return this.zzrJ;
    }

    public void zzbk() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public zzab zzbl() {
        return null;
    }

    void zzh(int i) {
        if (this.zzrM != null) {
            this.zzrM.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    int zzw(String str) {
        int i = 0;
        Object queryParameter = Uri.parse(str).getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                i = zzm.zzdQ().zza(this.mContext, Integer.parseInt(queryParameter));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }
}
