package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.zzc.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzaq;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzfr;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzjz;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkt;
import com.google.android.gms.internal.zzku;
import org.json.JSONObject;

@zzig
public class zzb extends zzjv implements zza {
    private final Context mContext;
    private final zzaq zzAZ;
    zzfr zzEX;
    private AdRequestInfoParcel zzFm;
    AdResponseParcel zzJK;
    private Runnable zzJL;
    private final Object zzJM = new Object();
    private final zza.zza zzKV;
    private final AdRequestInfoParcel.zza zzKW;
    zzkc zzKX;

    @zzig
    static final class a extends Exception {
        private final int a;

        public a(String str, int i) {
            super(str);
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public zzb(Context context, AdRequestInfoParcel.zza com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza, zzaq com_google_android_gms_internal_zzaq, zza.zza com_google_android_gms_ads_internal_request_zza_zza) {
        this.zzKV = com_google_android_gms_ads_internal_request_zza_zza;
        this.mContext = context;
        this.zzKW = com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza;
        this.zzAZ = com_google_android_gms_internal_zzaq;
    }

    private void zzd(int i, String str) {
        if (i == 3 || i == -1) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaV(str);
        } else {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW(str);
        }
        if (this.zzJK == null) {
            this.zzJK = new AdResponseParcel(i);
        } else {
            this.zzJK = new AdResponseParcel(i, this.zzJK.zzEL);
        }
        this.zzKV.zza(new zzjn.zza(this.zzFm != null ? this.zzFm : new AdRequestInfoParcel(this.zzKW, null, -1), this.zzJK, this.zzEX, null, i, -1, this.zzJK.zzLT, null));
    }

    public void onStop() {
        synchronized (this.zzJM) {
            if (this.zzKX != null) {
                this.zzKX.cancel();
            }
        }
    }

    zzkc zza(VersionInfoParcel versionInfoParcel, zzkt<AdRequestInfoParcel> com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel) {
        return zzc.zza(this.mContext, versionInfoParcel, com_google_android_gms_internal_zzkt_com_google_android_gms_ads_internal_request_AdRequestInfoParcel, this);
    }

    protected AdSizeParcel zzb(AdRequestInfoParcel adRequestInfoParcel) throws a {
        if (this.zzJK.zzLS == null) {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.zzJK.zzLS.split("x");
        if (split.length != 2) {
            String str = "Invalid ad size format from the ad response: ";
            String valueOf = String.valueOf(this.zzJK.zzLS);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (AdSizeParcel adSizeParcel : adRequestInfoParcel.zzsB.zzvu) {
                float f = this.mContext.getResources().getDisplayMetrics().density;
                int i = adSizeParcel.width == -1 ? (int) (((float) adSizeParcel.widthPixels) / f) : adSizeParcel.width;
                int i2 = adSizeParcel.height == -2 ? (int) (((float) adSizeParcel.heightPixels) / f) : adSizeParcel.height;
                if (parseInt == i && parseInt2 == i2) {
                    return new AdSizeParcel(adSizeParcel, adRequestInfoParcel.zzsB.zzvu);
                }
            }
            str = "The ad size from the ad response was not one of the requested sizes: ";
            valueOf = String.valueOf(this.zzJK.zzLS);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (NumberFormatException e) {
            str = "Invalid ad size number from the ad response: ";
            valueOf = String.valueOf(this.zzJK.zzLS);
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
    }

    public void zzb(AdResponseParcel adResponseParcel) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaU("Received ad response.");
        this.zzJK = adResponseParcel;
        long elapsedRealtime = zzu.zzco().elapsedRealtime();
        synchronized (this.zzJM) {
            this.zzKX = null;
        }
        zzu.zzcn().zzd(this.mContext, this.zzJK.zzLH);
        try {
            if (this.zzJK.errorCode == -2 || this.zzJK.errorCode == -3) {
                JSONObject jSONObject;
                zzhP();
                AdSizeParcel zzb = this.zzFm.zzsB.zzvu != null ? zzb(this.zzFm) : null;
                zzu.zzcn().zzD(this.zzJK.zzLZ);
                if (!TextUtils.isEmpty(this.zzJK.zzLX)) {
                    try {
                        jSONObject = new JSONObject(this.zzJK.zzLX);
                    } catch (Throwable e) {
                        com.google.android.gms.ads.internal.util.client.zzb.zzb("Error parsing the JSON for Active View.", e);
                    }
                    this.zzKV.zza(new zzjn.zza(this.zzFm, this.zzJK, this.zzEX, zzb, -2, elapsedRealtime, this.zzJK.zzLT, jSONObject));
                    zzka.zzQu.removeCallbacks(this.zzJL);
                    return;
                }
                jSONObject = null;
                this.zzKV.zza(new zzjn.zza(this.zzFm, this.zzJK, this.zzEX, zzb, -2, elapsedRealtime, this.zzJK.zzLT, jSONObject));
                zzka.zzQu.removeCallbacks(this.zzJL);
                return;
            }
            throw new a("There was a problem getting an ad response. ErrorCode: " + this.zzJK.errorCode, this.zzJK.errorCode);
        } catch (a e2) {
            zzd(e2.a(), e2.getMessage());
            zzka.zzQu.removeCallbacks(this.zzJL);
        }
    }

    public void zzbQ() {
        com.google.android.gms.ads.internal.util.client.zzb.zzaU("AdLoaderBackgroundTask started.");
        this.zzJL = new Runnable(this) {
            final /* synthetic */ zzb a;

            {
                this.a = r1;
            }

            public void run() {
                synchronized (this.a.zzJM) {
                    if (this.a.zzKX == null) {
                        return;
                    }
                    this.a.onStop();
                    this.a.zzd(2, "Timed out waiting for ad response.");
                }
            }
        };
        zzka.zzQu.postDelayed(this.zzJL, ((Long) zzcu.zzyH.get()).longValue());
        final zzkt com_google_android_gms_internal_zzku = new zzku();
        long elapsedRealtime = zzu.zzco().elapsedRealtime();
        zzjz.zza(new Runnable(this) {
            final /* synthetic */ zzb b;

            public void run() {
                synchronized (this.b.zzJM) {
                    this.b.zzKX = this.b.zza(this.b.zzKW.zzsx, com_google_android_gms_internal_zzku);
                    if (this.b.zzKX == null) {
                        this.b.zzd(0, "Could not start the ad request service.");
                        zzka.zzQu.removeCallbacks(this.b.zzJL);
                    }
                }
            }
        });
        this.zzFm = new AdRequestInfoParcel(this.zzKW, this.zzAZ.zzW().zzb(this.mContext), elapsedRealtime);
        com_google_android_gms_internal_zzku.zzf(this.zzFm);
    }

    protected void zzhP() throws a {
        if (this.zzJK.errorCode != -3) {
            if (TextUtils.isEmpty(this.zzJK.body)) {
                throw new a("No fill from ad server.", 3);
            }
            zzu.zzcn().zzc(this.mContext, this.zzJK.zzLq);
            if (this.zzJK.zzLP) {
                try {
                    this.zzEX = new zzfr(this.zzJK.body);
                    zzu.zzcn().zzE(this.zzEX.zzEJ);
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not parse mediation config.", e);
                    String str = "Could not parse mediation config: ";
                    String valueOf = String.valueOf(this.zzJK.body);
                    throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
                }
            }
            zzu.zzcn().zzE(this.zzJK.zzEJ);
            if (!TextUtils.isEmpty(this.zzJK.zzLI) && ((Boolean) zzcu.zzzK.get()).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaU("Received cookie from server. Setting webview cookie in CookieManager.");
                CookieManager zzN = zzu.zzcm().zzN(this.mContext);
                if (zzN != null) {
                    zzN.setCookie("googleads.g.doubleclick.net", this.zzJK.zzLI);
                }
            }
        }
    }
}
