package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk.zza;
import com.google.android.gms.ads.internal.request.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzfj.zzc;
import com.google.android.gms.plus.PlusShare;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzig
public final class zzii extends zza {
    private static zzii zzMP;
    private static final Object zzrs = new Object();
    private final Context mContext;
    private final zzih zzMQ;
    private final zzcn zzMR;
    private final zzfj zzMS;

    class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ zzih a;
        final /* synthetic */ Context b;
        final /* synthetic */ AdRequestInfoParcel c;
        final /* synthetic */ Bundle d;

        AnonymousClass1(zzih com_google_android_gms_internal_zzih, Context context, AdRequestInfoParcel adRequestInfoParcel, Bundle bundle) {
            this.a = com_google_android_gms_internal_zzih;
            this.b = context;
            this.c = adRequestInfoParcel;
            this.d = bundle;
        }

        public Void a() throws Exception {
            this.a.zzMO.zza(this.b, this.c.zzLj.packageName, this.d);
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return a();
        }
    }

    class AnonymousClass2 implements Runnable {
        final /* synthetic */ zzfj a;
        final /* synthetic */ zzik b;
        final /* synthetic */ zzdc c;
        final /* synthetic */ zzda d;
        final /* synthetic */ String e;

        AnonymousClass2(zzfj com_google_android_gms_internal_zzfj, zzik com_google_android_gms_internal_zzik, zzdc com_google_android_gms_internal_zzdc, zzda com_google_android_gms_internal_zzda, String str) {
            this.a = com_google_android_gms_internal_zzfj;
            this.b = com_google_android_gms_internal_zzik;
            this.c = com_google_android_gms_internal_zzdc;
            this.d = com_google_android_gms_internal_zzda;
            this.e = str;
        }

        public void run() {
            zzc zzfu = this.a.zzfu();
            this.b.zzb(zzfu);
            this.c.zza(this.d, "rwc");
            final zzda zzeA = this.c.zzeA();
            zzfu.zza(new zzkt.zzc<zzfk>(this) {
                final /* synthetic */ AnonymousClass2 b;

                public void a(zzfk com_google_android_gms_internal_zzfk) {
                    this.b.c.zza(zzeA, "jsf");
                    this.b.c.zzeB();
                    com_google_android_gms_internal_zzfk.zza("/invalidRequest", this.b.b.zzNh);
                    com_google_android_gms_internal_zzfk.zza("/loadAdURL", this.b.b.zzNi);
                    com_google_android_gms_internal_zzfk.zza("/loadAd", this.b.b.zzNj);
                    try {
                        com_google_android_gms_internal_zzfk.zzh("AFMA_getAd", this.b.e);
                    } catch (Throwable e) {
                        zzb.zzb("Error requesting an ad url", e);
                    }
                }

                public /* synthetic */ void zzc(Object obj) {
                    a((zzfk) obj);
                }
            }, new zzkt.zza(this) {
                final /* synthetic */ AnonymousClass2 a;

                {
                    this.a = r1;
                }

                public void run() {
                }
            });
        }
    }

    class AnonymousClass3 implements Runnable {
        final /* synthetic */ zzih a;
        final /* synthetic */ Context b;
        final /* synthetic */ zzik c;
        final /* synthetic */ AdRequestInfoParcel d;

        AnonymousClass3(zzih com_google_android_gms_internal_zzih, Context context, zzik com_google_android_gms_internal_zzik, AdRequestInfoParcel adRequestInfoParcel) {
            this.a = com_google_android_gms_internal_zzih;
            this.b = context;
            this.c = com_google_android_gms_internal_zzik;
            this.d = adRequestInfoParcel;
        }

        public void run() {
            this.a.zzMI.zza(this.b, this.c, this.d.zzsx);
        }
    }

    zzii(Context context, zzcn com_google_android_gms_internal_zzcn, zzih com_google_android_gms_internal_zzih) {
        this.mContext = context;
        this.zzMQ = com_google_android_gms_internal_zzih;
        this.zzMR = com_google_android_gms_internal_zzcn;
        this.zzMS = new zzfj(context.getApplicationContext() != null ? context.getApplicationContext() : context, new VersionInfoParcel(9080278, 9080278, true), com_google_android_gms_internal_zzcn.zzep(), new zzke<zzfg>(this) {
            final /* synthetic */ zzii a;

            {
                this.a = r1;
            }

            public void a(zzfg com_google_android_gms_internal_zzfg) {
                com_google_android_gms_internal_zzfg.zza("/log", zzeg.zzBQ);
            }

            public /* synthetic */ void zzc(Object obj) {
                a((zzfg) obj);
            }
        }, new zzfj.zzb());
    }

    private static AdResponseParcel zza(Context context, zzfj com_google_android_gms_internal_zzfj, zzcn com_google_android_gms_internal_zzcn, zzih com_google_android_gms_internal_zzih, AdRequestInfoParcel adRequestInfoParcel) {
        Bundle bundle;
        Future future;
        Throwable e;
        zzb.zzaU("Starting ad request from service using: AFMA_getAd");
        zzcu.initialize(context);
        zzdc com_google_android_gms_internal_zzdc = new zzdc(((Boolean) zzcu.zzxF.get()).booleanValue(), "load_ad", adRequestInfoParcel.zzsB.zzvs);
        if (adRequestInfoParcel.versionCode > 10 && adRequestInfoParcel.zzLA != -1) {
            com_google_android_gms_internal_zzdc.zza(com_google_android_gms_internal_zzdc.zzc(adRequestInfoParcel.zzLA), "cts");
        }
        zzda zzeA = com_google_android_gms_internal_zzdc.zzeA();
        Bundle bundle2 = (adRequestInfoParcel.versionCode < 4 || adRequestInfoParcel.zzLp == null) ? null : adRequestInfoParcel.zzLp;
        if (!((Boolean) zzcu.zzxO.get()).booleanValue() || com_google_android_gms_internal_zzih.zzMO == null) {
            bundle = bundle2;
            future = null;
        } else {
            if (bundle2 == null && ((Boolean) zzcu.zzxP.get()).booleanValue()) {
                zzjw.v("contentInfo is not present, but we'll still launch the app index task");
                bundle2 = new Bundle();
            }
            if (bundle2 != null) {
                bundle = bundle2;
                future = zzjz.zza(new AnonymousClass1(com_google_android_gms_internal_zzih, context, adRequestInfoParcel, bundle2));
            } else {
                bundle = bundle2;
                future = null;
            }
        }
        zzkp com_google_android_gms_internal_zzkp = new zzkp(null);
        Bundle bundle3 = adRequestInfoParcel.zzLi.extras;
        Object obj = (bundle3 == null || bundle3.getString("_ad") == null) ? null : 1;
        if (adRequestInfoParcel.zzLH && obj == null) {
            zzkr zza = com_google_android_gms_internal_zzih.zzMJ.zza(adRequestInfoParcel.applicationInfo);
        } else {
            Object obj2 = com_google_android_gms_internal_zzkp;
        }
        zzio zzx = zzu.zzcq().zzx(context);
        if (zzx.zzOh == -1) {
            zzb.zzaU("Device is offline.");
            return new AdResponseParcel(2);
        }
        String uuid = adRequestInfoParcel.versionCode >= 7 ? adRequestInfoParcel.zzLx : UUID.randomUUID().toString();
        zzik com_google_android_gms_internal_zzik = new zzik(uuid, adRequestInfoParcel.applicationInfo.packageName);
        if (adRequestInfoParcel.zzLi.extras != null) {
            String string = adRequestInfoParcel.zzLi.extras.getString("_ad");
            if (string != null) {
                return zzij.zza(context, adRequestInfoParcel, string);
            }
        }
        String token = com_google_android_gms_internal_zzih.zzMK.getToken(context, adRequestInfoParcel.zzsv, adRequestInfoParcel.zzLj.packageName);
        List zza2 = com_google_android_gms_internal_zzih.zzMH.zza(adRequestInfoParcel);
        String zzf = com_google_android_gms_internal_zzih.zzML.zzf(adRequestInfoParcel);
        zzis.zza zzy = com_google_android_gms_internal_zzih.zzMM.zzy(context);
        if (future != null) {
            try {
                zzjw.v("Waiting for app index fetching task.");
                future.get(((Long) zzcu.zzxQ.get()).longValue(), TimeUnit.MILLISECONDS);
                zzjw.v("App index fetching task completed.");
            } catch (ExecutionException e2) {
                e = e2;
                zzb.zzd("Failed to fetch app index signal", e);
            } catch (InterruptedException e3) {
                e = e3;
                zzb.zzd("Failed to fetch app index signal", e);
            } catch (TimeoutException e4) {
                zzb.zzaU("Timed out waiting for app index fetching task");
            }
        }
        String zzaJ = com_google_android_gms_internal_zzih.zzMG.zzaJ(adRequestInfoParcel.zzLj.packageName);
        JSONObject zza3 = zzij.zza(context, adRequestInfoParcel, zzx, zzy, zzb(zza), com_google_android_gms_internal_zzcn, token, zzf, zza2, bundle, zzaJ);
        if (adRequestInfoParcel.versionCode < 7) {
            try {
                zza3.put("request_id", uuid);
            } catch (JSONException e5) {
            }
        }
        if (zza3 != null) {
            try {
                zza3.put("prefetch_mode", PlusShare.KEY_CALL_TO_ACTION_URL);
            } catch (Throwable e6) {
                zzb.zzd("Failed putting prefetch parameters to ad request.", e6);
            }
        }
        if (zza3 == null) {
            return new AdResponseParcel(0);
        }
        String jSONObject = zza3.toString();
        com_google_android_gms_internal_zzdc.zza(zzeA, "arc");
        zzka.zzQu.post(new AnonymousClass2(com_google_android_gms_internal_zzfj, com_google_android_gms_internal_zzik, com_google_android_gms_internal_zzdc, com_google_android_gms_internal_zzdc.zzeA(), jSONObject));
        AdResponseParcel adResponseParcel;
        try {
            x xVar = (x) com_google_android_gms_internal_zzik.zzib().get(10, TimeUnit.SECONDS);
            if (xVar == null) {
                adResponseParcel = new AdResponseParcel(0);
                return adResponseParcel;
            } else if (xVar.a() != -2) {
                adResponseParcel = new AdResponseParcel(xVar.a());
                zzka.zzQu.post(new AnonymousClass3(com_google_android_gms_internal_zzih, context, com_google_android_gms_internal_zzik, adRequestInfoParcel));
                return adResponseParcel;
            } else {
                if (com_google_android_gms_internal_zzdc.zzeD() != null) {
                    com_google_android_gms_internal_zzdc.zza(com_google_android_gms_internal_zzdc.zzeD(), "rur");
                }
                adResponseParcel = null;
                if (!TextUtils.isEmpty(xVar.i())) {
                    adResponseParcel = zzij.zza(context, adRequestInfoParcel, xVar.i());
                }
                if (adResponseParcel == null && !TextUtils.isEmpty(xVar.d())) {
                    adResponseParcel = zza(adRequestInfoParcel, context, adRequestInfoParcel.zzsx.afmaVersion, xVar.d(), zzaJ, xVar.h() ? token : null, xVar, com_google_android_gms_internal_zzdc, com_google_android_gms_internal_zzih);
                }
                if (adResponseParcel == null) {
                    adResponseParcel = new AdResponseParcel(0);
                }
                if (adResponseParcel.zzMb == 1) {
                    com_google_android_gms_internal_zzih.zzMK.clearToken(context, adRequestInfoParcel.zzLj.packageName);
                }
                com_google_android_gms_internal_zzdc.zza(zzeA, "tts");
                adResponseParcel.zzMd = com_google_android_gms_internal_zzdc.zzeC();
                zzka.zzQu.post(new AnonymousClass3(com_google_android_gms_internal_zzih, context, com_google_android_gms_internal_zzik, adRequestInfoParcel));
                return adResponseParcel;
            }
        } catch (Exception e7) {
            adResponseParcel = new AdResponseParcel(0);
            return adResponseParcel;
        } finally {
            zzka.zzQu.post(new AnonymousClass3(com_google_android_gms_internal_zzih, context, com_google_android_gms_internal_zzik, adRequestInfoParcel));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.internal.request.AdResponseParcel zza(com.google.android.gms.ads.internal.request.AdRequestInfoParcel r13, android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.internal.x r19, com.google.android.gms.internal.zzdc r20, com.google.android.gms.internal.zzih r21) {
        /*
        if (r20 == 0) goto L_0x0108;
    L_0x0002:
        r2 = r20.zzeA();
        r3 = r2;
    L_0x0007:
        r8 = new com.google.android.gms.internal.zzil;	 Catch:{ IOException -> 0x0113 }
        r8.<init>(r13);	 Catch:{ IOException -> 0x0113 }
        r4 = "AdRequestServiceImpl: Sending request: ";
        r2 = java.lang.String.valueOf(r16);	 Catch:{ IOException -> 0x0113 }
        r5 = r2.length();	 Catch:{ IOException -> 0x0113 }
        if (r5 == 0) goto L_0x010c;
    L_0x0018:
        r2 = r4.concat(r2);	 Catch:{ IOException -> 0x0113 }
    L_0x001c:
        com.google.android.gms.ads.internal.util.client.zzb.zzaU(r2);	 Catch:{ IOException -> 0x0113 }
        r4 = new java.net.URL;	 Catch:{ IOException -> 0x0113 }
        r0 = r16;
        r4.<init>(r0);	 Catch:{ IOException -> 0x0113 }
        r2 = 0;
        r5 = com.google.android.gms.ads.internal.zzu.zzco();	 Catch:{ IOException -> 0x0113 }
        r10 = r5.elapsedRealtime();	 Catch:{ IOException -> 0x0113 }
        r6 = r2;
        r7 = r4;
    L_0x0031:
        if (r21 == 0) goto L_0x003a;
    L_0x0033:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzij();	 Catch:{ IOException -> 0x0113 }
    L_0x003a:
        r2 = r7.openConnection();	 Catch:{ IOException -> 0x0113 }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x0113 }
        r4 = com.google.android.gms.ads.internal.zzu.zzck();	 Catch:{ all -> 0x0139 }
        r5 = 0;
        r4.zza(r14, r15, r5, r2);	 Catch:{ all -> 0x0139 }
        r4 = android.text.TextUtils.isEmpty(r17);	 Catch:{ all -> 0x0139 }
        if (r4 != 0) goto L_0x005b;
    L_0x004e:
        r4 = r19.f();	 Catch:{ all -> 0x0139 }
        if (r4 == 0) goto L_0x005b;
    L_0x0054:
        r4 = "x-afma-drt-cookie";
        r0 = r17;
        r2.addRequestProperty(r4, r0);	 Catch:{ all -> 0x0139 }
    L_0x005b:
        r4 = android.text.TextUtils.isEmpty(r18);	 Catch:{ all -> 0x0139 }
        if (r4 != 0) goto L_0x007a;
    L_0x0061:
        r4 = "Bearer ";
        r5 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0139 }
        r4 = java.lang.String.valueOf(r18);	 Catch:{ all -> 0x0139 }
        r9 = r4.length();	 Catch:{ all -> 0x0139 }
        if (r9 == 0) goto L_0x0132;
    L_0x0071:
        r4 = r5.concat(r4);	 Catch:{ all -> 0x0139 }
    L_0x0075:
        r5 = "Authorization";
        r2.addRequestProperty(r5, r4);	 Catch:{ all -> 0x0139 }
    L_0x007a:
        r4 = r13.zzLI;	 Catch:{ all -> 0x0139 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0139 }
        if (r5 != 0) goto L_0x008c;
    L_0x0082:
        r5 = "Sending webview cookie in ad request header.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaU(r5);	 Catch:{ all -> 0x0139 }
        r5 = "Cookie";
        r2.addRequestProperty(r5, r4);	 Catch:{ all -> 0x0139 }
    L_0x008c:
        if (r19 == 0) goto L_0x00b8;
    L_0x008e:
        r4 = r19.c();	 Catch:{ all -> 0x0139 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0139 }
        if (r4 != 0) goto L_0x00b8;
    L_0x0098:
        r4 = 1;
        r2.setDoOutput(r4);	 Catch:{ all -> 0x0139 }
        r4 = r19.c();	 Catch:{ all -> 0x0139 }
        r9 = r4.getBytes();	 Catch:{ all -> 0x0139 }
        r4 = r9.length;	 Catch:{ all -> 0x0139 }
        r2.setFixedLengthStreamingMode(r4);	 Catch:{ all -> 0x0139 }
        r5 = 0;
        r4 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0147 }
        r12 = r2.getOutputStream();	 Catch:{ all -> 0x0147 }
        r4.<init>(r12);	 Catch:{ all -> 0x0147 }
        r4.write(r9);	 Catch:{ all -> 0x01f6 }
        com.google.android.gms.common.util.zzo.zzb(r4);	 Catch:{ all -> 0x0139 }
    L_0x00b8:
        r9 = r2.getResponseCode();	 Catch:{ all -> 0x0139 }
        r12 = r2.getHeaderFields();	 Catch:{ all -> 0x0139 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 < r4) goto L_0x0153;
    L_0x00c4:
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 >= r4) goto L_0x0153;
    L_0x00c8:
        r6 = r7.toString();	 Catch:{ all -> 0x0139 }
        r5 = 0;
        r4 = new java.io.InputStreamReader;	 Catch:{ all -> 0x014d }
        r7 = r2.getInputStream();	 Catch:{ all -> 0x014d }
        r4.<init>(r7);	 Catch:{ all -> 0x014d }
        r5 = com.google.android.gms.ads.internal.zzu.zzck();	 Catch:{ all -> 0x01f3 }
        r5 = r5.zza(r4);	 Catch:{ all -> 0x01f3 }
        com.google.android.gms.common.util.zzo.zzb(r4);	 Catch:{ all -> 0x0139 }
        zza(r6, r12, r5, r9);	 Catch:{ all -> 0x0139 }
        r8.zzb(r6, r12, r5);	 Catch:{ all -> 0x0139 }
        if (r20 == 0) goto L_0x00f6;
    L_0x00e9:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0139 }
        r5 = 0;
        r6 = "ufe";
        r4[r5] = r6;	 Catch:{ all -> 0x0139 }
        r0 = r20;
        r0.zza(r3, r4);	 Catch:{ all -> 0x0139 }
    L_0x00f6:
        r3 = r8.zzj(r10);	 Catch:{ all -> 0x0139 }
        r2.disconnect();	 Catch:{ IOException -> 0x0113 }
        if (r21 == 0) goto L_0x0106;
    L_0x00ff:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzik();	 Catch:{ IOException -> 0x0113 }
    L_0x0106:
        r2 = r3;
    L_0x0107:
        return r2;
    L_0x0108:
        r2 = 0;
        r3 = r2;
        goto L_0x0007;
    L_0x010c:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x0113 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x0113 }
        goto L_0x001c;
    L_0x0113:
        r2 = move-exception;
        r3 = "Error while connecting to ad server: ";
        r2 = r2.getMessage();
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x01ec;
    L_0x0124:
        r2 = r3.concat(r2);
    L_0x0128:
        com.google.android.gms.ads.internal.util.client.zzb.zzaW(r2);
        r2 = new com.google.android.gms.ads.internal.request.AdResponseParcel;
        r3 = 2;
        r2.<init>(r3);
        goto L_0x0107;
    L_0x0132:
        r4 = new java.lang.String;	 Catch:{ all -> 0x0139 }
        r4.<init>(r5);	 Catch:{ all -> 0x0139 }
        goto L_0x0075;
    L_0x0139:
        r3 = move-exception;
        r2.disconnect();	 Catch:{ IOException -> 0x0113 }
        if (r21 == 0) goto L_0x0146;
    L_0x013f:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzik();	 Catch:{ IOException -> 0x0113 }
    L_0x0146:
        throw r3;	 Catch:{ IOException -> 0x0113 }
    L_0x0147:
        r3 = move-exception;
        r4 = r5;
    L_0x0149:
        com.google.android.gms.common.util.zzo.zzb(r4);	 Catch:{ all -> 0x0139 }
        throw r3;	 Catch:{ all -> 0x0139 }
    L_0x014d:
        r3 = move-exception;
        r4 = r5;
    L_0x014f:
        com.google.android.gms.common.util.zzo.zzb(r4);	 Catch:{ all -> 0x0139 }
        throw r3;	 Catch:{ all -> 0x0139 }
    L_0x0153:
        r4 = r7.toString();	 Catch:{ all -> 0x0139 }
        r5 = 0;
        zza(r4, r12, r5, r9);	 Catch:{ all -> 0x0139 }
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 < r4) goto L_0x01ac;
    L_0x015f:
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r9 >= r4) goto L_0x01ac;
    L_0x0163:
        r4 = "Location";
        r4 = r2.getHeaderField(r4);	 Catch:{ all -> 0x0139 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0139 }
        if (r5 == 0) goto L_0x0188;
    L_0x016f:
        r3 = "No location header to follow redirect.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaW(r3);	 Catch:{ all -> 0x0139 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0139 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0139 }
        r2.disconnect();	 Catch:{ IOException -> 0x0113 }
        if (r21 == 0) goto L_0x0186;
    L_0x017f:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzik();	 Catch:{ IOException -> 0x0113 }
    L_0x0186:
        r2 = r3;
        goto L_0x0107;
    L_0x0188:
        r5 = new java.net.URL;	 Catch:{ all -> 0x0139 }
        r5.<init>(r4);	 Catch:{ all -> 0x0139 }
        r4 = r6 + 1;
        r6 = 5;
        if (r4 <= r6) goto L_0x01d9;
    L_0x0192:
        r3 = "Too many redirects.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaW(r3);	 Catch:{ all -> 0x0139 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0139 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0139 }
        r2.disconnect();	 Catch:{ IOException -> 0x0113 }
        if (r21 == 0) goto L_0x01a9;
    L_0x01a2:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzik();	 Catch:{ IOException -> 0x0113 }
    L_0x01a9:
        r2 = r3;
        goto L_0x0107;
    L_0x01ac:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0139 }
        r4 = 46;
        r3.<init>(r4);	 Catch:{ all -> 0x0139 }
        r4 = "Received error HTTP response code: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0139 }
        r3 = r3.append(r9);	 Catch:{ all -> 0x0139 }
        r3 = r3.toString();	 Catch:{ all -> 0x0139 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaW(r3);	 Catch:{ all -> 0x0139 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0139 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0139 }
        r2.disconnect();	 Catch:{ IOException -> 0x0113 }
        if (r21 == 0) goto L_0x01d6;
    L_0x01cf:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzik();	 Catch:{ IOException -> 0x0113 }
    L_0x01d6:
        r2 = r3;
        goto L_0x0107;
    L_0x01d9:
        r8.zzj(r12);	 Catch:{ all -> 0x0139 }
        r2.disconnect();	 Catch:{ IOException -> 0x0113 }
        if (r21 == 0) goto L_0x01e8;
    L_0x01e1:
        r0 = r21;
        r2 = r0.zzMN;	 Catch:{ IOException -> 0x0113 }
        r2.zzik();	 Catch:{ IOException -> 0x0113 }
    L_0x01e8:
        r6 = r4;
        r7 = r5;
        goto L_0x0031;
    L_0x01ec:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0128;
    L_0x01f3:
        r3 = move-exception;
        goto L_0x014f;
    L_0x01f6:
        r3 = move-exception;
        goto L_0x0149;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzii.zza(com.google.android.gms.ads.internal.request.AdRequestInfoParcel, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.x, com.google.android.gms.internal.zzdc, com.google.android.gms.internal.zzih):com.google.android.gms.ads.internal.request.AdResponseParcel");
    }

    public static zzii zza(Context context, zzcn com_google_android_gms_internal_zzcn, zzih com_google_android_gms_internal_zzih) {
        zzii com_google_android_gms_internal_zzii;
        synchronized (zzrs) {
            if (zzMP == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zzMP = new zzii(context, com_google_android_gms_internal_zzcn, com_google_android_gms_internal_zzih);
            }
            com_google_android_gms_internal_zzii = zzMP;
        }
        return com_google_android_gms_internal_zzii;
    }

    private static void zza(String str, Map<String, List<String>> map, String str2, int i) {
        if (zzb.zzX(2)) {
            zzjw.v(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    String str32;
                    zzjw.v(new StringBuilder(String.valueOf(str32).length() + 5).append("    ").append(str32).append(":").toString());
                    for (String str322 : (List) map.get(str322)) {
                        String str4 = "      ";
                        str322 = String.valueOf(str322);
                        zzjw.v(str322.length() != 0 ? str4.concat(str322) : new String(str4));
                    }
                }
            }
            zzjw.v("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    zzjw.v(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                zzjw.v("    null");
            }
            zzjw.v("  Response Code:\n    " + i + "\n}");
        }
    }

    private static Location zzb(zzkr<Location> com_google_android_gms_internal_zzkr_android_location_Location) {
        try {
            return (Location) com_google_android_gms_internal_zzkr_android_location_Location.get(((Long) zzcu.zzzm.get()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            zzb.zzd("Exception caught while getting location", e);
            return null;
        }
    }

    public void zza(final AdRequestInfoParcel adRequestInfoParcel, final zzl com_google_android_gms_ads_internal_request_zzl) {
        zzu.zzcn().zzb(this.mContext, adRequestInfoParcel.zzsx);
        zzjz.zza(new Runnable(this) {
            final /* synthetic */ zzii c;

            public void run() {
                AdResponseParcel zzd;
                try {
                    zzd = this.c.zzd(adRequestInfoParcel);
                } catch (Throwable e) {
                    zzu.zzcn().zzb(e, true);
                    zzb.zzd("Could not fetch ad response due to an Exception.", e);
                    zzd = null;
                }
                if (zzd == null) {
                    zzd = new AdResponseParcel(0);
                }
                try {
                    com_google_android_gms_ads_internal_request_zzl.zzb(zzd);
                } catch (Throwable e2) {
                    zzb.zzd("Fail to forward ad response.", e2);
                }
            }
        });
    }

    public AdResponseParcel zzd(AdRequestInfoParcel adRequestInfoParcel) {
        return zza(this.mContext, this.zzMS, this.zzMR, this.zzMQ, adRequestInfoParcel);
    }
}
