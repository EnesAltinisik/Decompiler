package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzcn;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzei;
import com.google.android.gms.internal.zzem;
import com.google.android.gms.internal.zzfg;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzij;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzla;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public class zzn extends zzjv {
    private static zzfj zzKn = null;
    private static zzeh zzMA = null;
    static final long zzMw = TimeUnit.SECONDS.toMillis(10);
    static boolean zzMx = false;
    private static zzei zzMy = null;
    private static zzem zzMz = null;
    private static final Object zzrs = new Object();
    private final Context mContext;
    private final Object zzJM = new Object();
    private final com.google.android.gms.ads.internal.request.zza.zza zzKV;
    private final com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zzKW;
    private com.google.android.gms.internal.zzfj.zzc zzMB;

    public static class zza implements zzke<zzfg> {
        public void zza(zzfg com_google_android_gms_internal_zzfg) {
            zzn.zzc(com_google_android_gms_internal_zzfg);
        }

        public /* synthetic */ void zzc(Object obj) {
            zza((zzfg) obj);
        }
    }

    public static class zzb implements zzke<zzfg> {
        public void zza(zzfg com_google_android_gms_internal_zzfg) {
            zzn.zzb(com_google_android_gms_internal_zzfg);
        }

        public /* synthetic */ void zzc(Object obj) {
            zza((zzfg) obj);
        }
    }

    public static class zzc implements zzeh {
        public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
            String str = (String) map.get("request_id");
            String str2 = "Invalid request: ";
            String valueOf = String.valueOf((String) map.get("errors"));
            com.google.android.gms.ads.internal.util.client.zzb.zzaW(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            zzn.zzMz.zzX(str);
        }
    }

    public zzn(Context context, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza, com.google.android.gms.ads.internal.request.zza.zza com_google_android_gms_ads_internal_request_zza_zza) {
        super(true);
        this.zzKV = com_google_android_gms_ads_internal_request_zza_zza;
        this.mContext = context;
        this.zzKW = com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza;
        synchronized (zzrs) {
            if (!zzMx) {
                zzMz = new zzem();
                zzMy = new zzei(context.getApplicationContext(), com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsx);
                zzMA = new zzc();
                zzKn = new zzfj(this.mContext.getApplicationContext(), this.zzKW.zzsx, (String) zzcu.zzwZ.get(), new zzb(), new zza());
                zzMx = true;
            }
        }
    }

    private JSONObject zza(AdRequestInfoParcel adRequestInfoParcel, String str) {
        Info advertisingIdInfo;
        Throwable e;
        Object obj;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = adRequestInfoParcel.zzLi.extras.getBundle("sdk_less_server_data");
        String string = adRequestInfoParcel.zzLi.extras.getString("sdk_less_network_id");
        if (bundle != null) {
            JSONObject zza = zzij.zza(this.mContext, adRequestInfoParcel, zzu.zzcq().zzx(this.mContext), jSONObject, jSONObject, new zzcn((String) zzcu.zzwZ.get()), jSONObject, jSONObject, new ArrayList(), jSONObject, jSONObject);
            if (zza != null) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
                } catch (IOException e2) {
                    e = e2;
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzu.zzck().zzM(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e3) {
                    e = e3;
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzu.zzck().zzM(hashMap);
                    return jSONObject;
                } catch (GooglePlayServicesNotAvailableException e4) {
                    e = e4;
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzu.zzck().zzM(hashMap);
                    return jSONObject;
                } catch (GooglePlayServicesRepairableException e5) {
                    e = e5;
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzu.zzck().zzM(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("network_id", string);
                hashMap.put("request_param", zza);
                hashMap.put("data", bundle);
                if (advertisingIdInfo != null) {
                    hashMap.put("adid", advertisingIdInfo.getId());
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                    }
                    hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                }
                try {
                    jSONObject = zzu.zzck().zzM(hashMap);
                } catch (JSONException e6) {
                }
            }
        }
        return jSONObject;
    }

    protected static void zzb(zzfg com_google_android_gms_internal_zzfg) {
        com_google_android_gms_internal_zzfg.zza("/loadAd", zzMz);
        com_google_android_gms_internal_zzfg.zza("/fetchHttpRequest", zzMy);
        com_google_android_gms_internal_zzfg.zza("/invalidRequest", zzMA);
    }

    protected static void zzc(zzfg com_google_android_gms_internal_zzfg) {
        com_google_android_gms_internal_zzfg.zzb("/loadAd", zzMz);
        com_google_android_gms_internal_zzfg.zzb("/fetchHttpRequest", zzMy);
        com_google_android_gms_internal_zzfg.zzb("/invalidRequest", zzMA);
    }

    private AdResponseParcel zze(AdRequestInfoParcel adRequestInfoParcel) {
        final String zziZ = zzu.zzck().zziZ();
        final JSONObject zza = zza(adRequestInfoParcel, zziZ);
        if (zza == null) {
            return new AdResponseParcel(0);
        }
        long elapsedRealtime = zzu.zzco().elapsedRealtime();
        Future zzW = zzMz.zzW(zziZ);
        com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzn c;

            public void run() {
                this.c.zzMB = zzn.zzKn.zzfu();
                this.c.zzMB.zza(new com.google.android.gms.internal.zzkt.zzc<zzfk>(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void a(zzfk com_google_android_gms_internal_zzfk) {
                        try {
                            com_google_android_gms_internal_zzfk.zza("AFMA_getAdapterLessMediationAd", zza);
                        } catch (Throwable e) {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", e);
                            zzn.zzMz.zzX(zziZ);
                        }
                    }

                    public /* synthetic */ void zzc(Object obj) {
                        a((zzfk) obj);
                    }
                }, new com.google.android.gms.internal.zzkt.zza(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        zzn.zzMz.zzX(zziZ);
                    }
                });
            }
        });
        try {
            JSONObject jSONObject = (JSONObject) zzW.get(zzMw - (zzu.zzco().elapsedRealtime() - elapsedRealtime), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new AdResponseParcel(-1);
            }
            AdResponseParcel zza2 = zzij.zza(this.mContext, adRequestInfoParcel, jSONObject.toString());
            return (zza2.errorCode == -3 || !TextUtils.isEmpty(zza2.body)) ? zza2 : new AdResponseParcel(3);
        } catch (CancellationException e) {
            return new AdResponseParcel(-1);
        } catch (InterruptedException e2) {
            return new AdResponseParcel(-1);
        } catch (TimeoutException e3) {
            return new AdResponseParcel(2);
        } catch (ExecutionException e4) {
            return new AdResponseParcel(0);
        }
    }

    public void onStop() {
        synchronized (this.zzJM) {
            com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
                final /* synthetic */ zzn a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.zzMB != null) {
                        this.a.zzMB.release();
                        this.a.zzMB = null;
                    }
                }
            });
        }
    }

    public void zzbQ() {
        com.google.android.gms.ads.internal.util.client.zzb.zzaU("SdkLessAdLoaderBackgroundTask started.");
        AdRequestInfoParcel adRequestInfoParcel = new AdRequestInfoParcel(this.zzKW, null, -1);
        AdResponseParcel zze = zze(adRequestInfoParcel);
        AdSizeParcel adSizeParcel = null;
        final com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza = new com.google.android.gms.internal.zzjn.zza(adRequestInfoParcel, zze, null, adSizeParcel, zze.errorCode, zzu.zzco().elapsedRealtime(), zze.zzLT, null);
        com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzn b;

            public void run() {
                this.b.zzKV.zza(com_google_android_gms_internal_zzjn_zza);
                if (this.b.zzMB != null) {
                    this.b.zzMB.release();
                    this.b.zzMB = null;
                }
            }
        });
    }
}
