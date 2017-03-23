package com.google.android.gms.b;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.sv.b;
import com.google.android.gms.b.sv.c;
import com.google.android.gms.b.wo.a;
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

@vz
public final class wx extends a {
    private static final Object a = new Object();
    private static wx b;
    private final Context c;
    private final ww d;
    private final pk e;
    private final sv f;

    class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ ww a;
        final /* synthetic */ Context b;
        final /* synthetic */ wf c;
        final /* synthetic */ Bundle d;

        AnonymousClass1(ww wwVar, Context context, wf wfVar, Bundle bundle) {
            this.a = wwVar;
            this.b = context;
            this.c = wfVar;
            this.d = bundle;
        }

        public Void a() {
            String str = this.c.g.packageName;
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    class AnonymousClass2 implements Runnable {
        final /* synthetic */ sv a;
        final /* synthetic */ xa b;
        final /* synthetic */ qa c;
        final /* synthetic */ py d;
        final /* synthetic */ String e;

        AnonymousClass2(sv svVar, xa xaVar, qa qaVar, py pyVar, String str) {
            this.a = svVar;
            this.b = xaVar;
            this.c = qaVar;
            this.d = pyVar;
            this.e = str;
        }

        public void run() {
            c a = this.a.a();
            this.b.a(a);
            this.c.a(this.d, "rwc");
            final py a2 = this.c.a();
            a.a(new aaj.c<sw>(this) {
                final /* synthetic */ AnonymousClass2 b;

                public void a(sw swVar) {
                    this.b.c.a(a2, "jsf");
                    this.b.c.b();
                    swVar.a("/invalidRequest", this.b.b.b);
                    swVar.a("/loadAdURL", this.b.b.c);
                    swVar.a("/loadAd", this.b.b.d);
                    try {
                        swVar.a("AFMA_getAd", this.b.e);
                    } catch (Throwable e) {
                        zy.b("Error requesting an ad url", e);
                    }
                }

                public /* synthetic */ void a(Object obj) {
                    a((sw) obj);
                }
            }, new aaj.a(this) {
                public void a() {
                }
            });
        }
    }

    class AnonymousClass3 implements Runnable {
        final /* synthetic */ ww a;
        final /* synthetic */ Context b;
        final /* synthetic */ xa c;
        final /* synthetic */ wf d;

        AnonymousClass3(ww wwVar, Context context, xa xaVar, wf wfVar) {
            this.a = wwVar;
            this.b = context;
            this.c = xaVar;
            this.d = wfVar;
        }

        public void run() {
            this.a.e.a(this.b, this.c, this.d.k);
        }
    }

    wx(Context context, pk pkVar, ww wwVar) {
        this.c = context;
        this.d = wwVar;
        this.e = pkVar;
        this.f = new sv(context.getApplicationContext() != null ? context.getApplicationContext() : context, aab.a(), pkVar.a(), new zn<sr>(this) {
            public void a(sr srVar) {
                srVar.a("/log", rp.i);
            }

            public /* synthetic */ void a(Object obj) {
                a((sr) obj);
            }
        }, new b());
    }

    private static Location a(aag<Location> com_google_android_gms_b_aag_android_location_Location) {
        try {
            return (Location) com_google_android_gms_b_aag_android_location_Location.get(((Long) pr.cv.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            zy.c("Exception caught while getting location", e);
            return null;
        }
    }

    private static wi a(Context context, sv svVar, pk pkVar, ww wwVar, wf wfVar) {
        Bundle bundle;
        Future future;
        Throwable e;
        zy.b("Starting ad request from service using: AFMA_getAd");
        pr.a(context);
        aag a = wwVar.i.a();
        qa qaVar = new qa(((Boolean) pr.U.c()).booleanValue(), "load_ad", wfVar.d.b);
        if (wfVar.a > 10 && wfVar.B != -1) {
            qaVar.a(qaVar.a(wfVar.B), "cts");
        }
        py a2 = qaVar.a();
        Bundle bundle2 = (wfVar.a < 4 || wfVar.o == null) ? null : wfVar.o;
        if (!((Boolean) pr.al.c()).booleanValue() || wwVar.a == null) {
            bundle = bundle2;
            future = null;
        } else {
            if (bundle2 == null && ((Boolean) pr.am.c()).booleanValue()) {
                ze.a("contentInfo is not present, but we'll still launch the app index task");
                bundle2 = new Bundle();
            }
            if (bundle2 != null) {
                bundle = bundle2;
                future = zh.a(new AnonymousClass1(wwVar, context, wfVar, bundle2));
            } else {
                bundle = bundle2;
                future = null;
            }
        }
        aae com_google_android_gms_b_aae = new aae(null);
        Bundle bundle3 = wfVar.c.c;
        Object obj = (bundle3 == null || bundle3.getString("_ad") == null) ? null : 1;
        if (wfVar.I && obj == null) {
            aag a3 = wwVar.f.a(wfVar.f);
        } else {
            Object obj2 = com_google_android_gms_b_aae;
        }
        xe a4 = v.n().a(context);
        if (a4.m == -1) {
            zy.b("Device is offline.");
            return new wi(2);
        }
        String string;
        String uuid = wfVar.a >= 7 ? wfVar.w : UUID.randomUUID().toString();
        xa xaVar = new xa(uuid, wfVar.f.packageName);
        if (wfVar.c.c != null) {
            string = wfVar.c.c.getString("_ad");
            if (string != null) {
                return wz.a(context, wfVar, string);
            }
        }
        List a5 = wwVar.d.a(wfVar);
        String a6 = wwVar.j.a(wfVar);
        if (future != null) {
            try {
                ze.a("Waiting for app index fetching task.");
                future.get(((Long) pr.an.c()).longValue(), TimeUnit.MILLISECONDS);
                ze.a("App index fetching task completed.");
            } catch (ExecutionException e2) {
                e = e2;
                zy.c("Failed to fetch app index signal", e);
            } catch (InterruptedException e3) {
                e = e3;
                zy.c("Failed to fetch app index signal", e);
            } catch (TimeoutException e4) {
                zy.b("Timed out waiting for app index fetching task");
            }
        }
        string = wfVar.g.packageName;
        b(a);
        JSONObject a7 = wz.a(context, new wv().a(wfVar).a(a4).a(null).a(a(a3)).a(b(a)).a(a6).a(a5).b(bundle).b(null).a(wwVar.b.a(context)));
        if (a7 == null) {
            return new wi(0);
        }
        if (wfVar.a < 7) {
            try {
                a7.put("request_id", uuid);
            } catch (JSONException e5) {
            }
        }
        try {
            a7.put("prefetch_mode", "url");
        } catch (Throwable e6) {
            zy.c("Failed putting prefetch parameters to ad request.", e6);
        }
        String jSONObject = a7.toString();
        qaVar.a(a2, "arc");
        zi.a.post(new AnonymousClass2(svVar, xaVar, qaVar, qaVar.a(), jSONObject));
        wi wiVar;
        try {
            xd xdVar = (xd) xaVar.b().get(10, TimeUnit.SECONDS);
            if (xdVar == null) {
                wiVar = new wi(0);
                return wiVar;
            } else if (xdVar.a() != -2) {
                wiVar = new wi(xdVar.a());
                zi.a.post(new AnonymousClass3(wwVar, context, xaVar, wfVar));
                return wiVar;
            } else {
                if (qaVar.e() != null) {
                    qaVar.a(qaVar.e(), "rur");
                }
                wiVar = null;
                if (!TextUtils.isEmpty(xdVar.i())) {
                    wiVar = wz.a(context, wfVar, xdVar.i());
                }
                if (wiVar == null && !TextUtils.isEmpty(xdVar.e())) {
                    wiVar = a(wfVar, context, wfVar.k.b, xdVar.e(), null, xdVar, qaVar, wwVar);
                }
                if (wiVar == null) {
                    wiVar = new wi(0);
                }
                qaVar.a(a2, "tts");
                wiVar.y = qaVar.c();
                zi.a.post(new AnonymousClass3(wwVar, context, xaVar, wfVar));
                return wiVar;
            }
        } catch (Exception e7) {
            wiVar = new wi(0);
            return wiVar;
        } finally {
            zi.a.post(new AnonymousClass3(wwVar, context, xaVar, wfVar));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.b.wi a(com.google.android.gms.b.wf r13, android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.google.android.gms.b.xd r18, com.google.android.gms.b.qa r19, com.google.android.gms.b.ww r20) {
        /*
        if (r19 == 0) goto L_0x00db;
    L_0x0002:
        r2 = r19.a();
        r3 = r2;
    L_0x0007:
        r8 = new com.google.android.gms.b.xb;	 Catch:{ IOException -> 0x00e6 }
        r2 = r18.c();	 Catch:{ IOException -> 0x00e6 }
        r8.<init>(r13, r2);	 Catch:{ IOException -> 0x00e6 }
        r4 = "AdRequestServiceImpl: Sending request: ";
        r2 = java.lang.String.valueOf(r16);	 Catch:{ IOException -> 0x00e6 }
        r5 = r2.length();	 Catch:{ IOException -> 0x00e6 }
        if (r5 == 0) goto L_0x00df;
    L_0x001c:
        r2 = r4.concat(r2);	 Catch:{ IOException -> 0x00e6 }
    L_0x0020:
        com.google.android.gms.b.zy.b(r2);	 Catch:{ IOException -> 0x00e6 }
        r4 = new java.net.URL;	 Catch:{ IOException -> 0x00e6 }
        r0 = r16;
        r4.<init>(r0);	 Catch:{ IOException -> 0x00e6 }
        r2 = 0;
        r5 = com.google.android.gms.ads.internal.v.k();	 Catch:{ IOException -> 0x00e6 }
        r10 = r5.b();	 Catch:{ IOException -> 0x00e6 }
        r6 = r2;
        r7 = r4;
    L_0x0035:
        r2 = r7.openConnection();	 Catch:{ IOException -> 0x00e6 }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x00e6 }
        r4 = com.google.android.gms.ads.internal.v.e();	 Catch:{ all -> 0x010b }
        r5 = 0;
        r4.a(r14, r15, r5, r2);	 Catch:{ all -> 0x010b }
        r4 = android.text.TextUtils.isEmpty(r17);	 Catch:{ all -> 0x010b }
        if (r4 != 0) goto L_0x0056;
    L_0x0049:
        r4 = r18.g();	 Catch:{ all -> 0x010b }
        if (r4 == 0) goto L_0x0056;
    L_0x004f:
        r4 = "x-afma-drt-cookie";
        r0 = r17;
        r2.addRequestProperty(r4, r0);	 Catch:{ all -> 0x010b }
    L_0x0056:
        r4 = r13.J;	 Catch:{ all -> 0x010b }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x010b }
        if (r5 != 0) goto L_0x0068;
    L_0x005e:
        r5 = "Sending webview cookie in ad request header.";
        com.google.android.gms.b.zy.b(r5);	 Catch:{ all -> 0x010b }
        r5 = "Cookie";
        r2.addRequestProperty(r5, r4);	 Catch:{ all -> 0x010b }
    L_0x0068:
        if (r18 == 0) goto L_0x0094;
    L_0x006a:
        r4 = r18.d();	 Catch:{ all -> 0x010b }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x010b }
        if (r4 != 0) goto L_0x0094;
    L_0x0074:
        r4 = 1;
        r2.setDoOutput(r4);	 Catch:{ all -> 0x010b }
        r4 = r18.d();	 Catch:{ all -> 0x010b }
        r9 = r4.getBytes();	 Catch:{ all -> 0x010b }
        r4 = r9.length;	 Catch:{ all -> 0x010b }
        r2.setFixedLengthStreamingMode(r4);	 Catch:{ all -> 0x010b }
        r5 = 0;
        r4 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0105 }
        r12 = r2.getOutputStream();	 Catch:{ all -> 0x0105 }
        r4.<init>(r12);	 Catch:{ all -> 0x0105 }
        r4.write(r9);	 Catch:{ all -> 0x0197 }
        com.google.android.gms.common.util.i.a(r4);	 Catch:{ all -> 0x010b }
    L_0x0094:
        r9 = r2.getResponseCode();	 Catch:{ all -> 0x010b }
        r12 = r2.getHeaderFields();	 Catch:{ all -> 0x010b }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 < r4) goto L_0x0116;
    L_0x00a0:
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 >= r4) goto L_0x0116;
    L_0x00a4:
        r6 = r7.toString();	 Catch:{ all -> 0x010b }
        r5 = 0;
        r4 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0110 }
        r7 = r2.getInputStream();	 Catch:{ all -> 0x0110 }
        r4.<init>(r7);	 Catch:{ all -> 0x0110 }
        r5 = com.google.android.gms.ads.internal.v.e();	 Catch:{ all -> 0x0194 }
        r5 = r5.a(r4);	 Catch:{ all -> 0x0194 }
        com.google.android.gms.common.util.i.a(r4);	 Catch:{ all -> 0x010b }
        a(r6, r12, r5, r9);	 Catch:{ all -> 0x010b }
        r8.a(r6, r12, r5);	 Catch:{ all -> 0x010b }
        if (r19 == 0) goto L_0x00d2;
    L_0x00c5:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x010b }
        r5 = 0;
        r6 = "ufe";
        r4[r5] = r6;	 Catch:{ all -> 0x010b }
        r0 = r19;
        r0.a(r3, r4);	 Catch:{ all -> 0x010b }
    L_0x00d2:
        r3 = r8.a(r10);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
    L_0x00da:
        return r2;
    L_0x00db:
        r2 = 0;
        r3 = r2;
        goto L_0x0007;
    L_0x00df:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x00e6 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x00e6 }
        goto L_0x0020;
    L_0x00e6:
        r2 = move-exception;
        r3 = "Error while connecting to ad server: ";
        r2 = r2.getMessage();
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x018d;
    L_0x00f7:
        r2 = r3.concat(r2);
    L_0x00fb:
        com.google.android.gms.b.zy.e(r2);
        r2 = new com.google.android.gms.b.wi;
        r3 = 2;
        r2.<init>(r3);
        goto L_0x00da;
    L_0x0105:
        r3 = move-exception;
        r4 = r5;
    L_0x0107:
        com.google.android.gms.common.util.i.a(r4);	 Catch:{ all -> 0x010b }
        throw r3;	 Catch:{ all -> 0x010b }
    L_0x010b:
        r3 = move-exception;
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        throw r3;	 Catch:{ IOException -> 0x00e6 }
    L_0x0110:
        r3 = move-exception;
        r4 = r5;
    L_0x0112:
        com.google.android.gms.common.util.i.a(r4);	 Catch:{ all -> 0x010b }
        throw r3;	 Catch:{ all -> 0x010b }
    L_0x0116:
        r4 = r7.toString();	 Catch:{ all -> 0x010b }
        r5 = 0;
        a(r4, r12, r5, r9);	 Catch:{ all -> 0x010b }
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 < r4) goto L_0x015d;
    L_0x0122:
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r9 >= r4) goto L_0x015d;
    L_0x0126:
        r4 = "Location";
        r4 = r2.getHeaderField(r4);	 Catch:{ all -> 0x010b }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x010b }
        if (r5 == 0) goto L_0x0142;
    L_0x0132:
        r3 = "No location header to follow redirect.";
        com.google.android.gms.b.zy.e(r3);	 Catch:{ all -> 0x010b }
        r3 = new com.google.android.gms.b.wi;	 Catch:{ all -> 0x010b }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
        goto L_0x00da;
    L_0x0142:
        r5 = new java.net.URL;	 Catch:{ all -> 0x010b }
        r5.<init>(r4);	 Catch:{ all -> 0x010b }
        r4 = r6 + 1;
        r6 = 5;
        if (r4 <= r6) goto L_0x0181;
    L_0x014c:
        r3 = "Too many redirects.";
        com.google.android.gms.b.zy.e(r3);	 Catch:{ all -> 0x010b }
        r3 = new com.google.android.gms.b.wi;	 Catch:{ all -> 0x010b }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
        goto L_0x00da;
    L_0x015d:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010b }
        r4 = 46;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r4 = "Received error HTTP response code: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x010b }
        r3 = r3.append(r9);	 Catch:{ all -> 0x010b }
        r3 = r3.toString();	 Catch:{ all -> 0x010b }
        com.google.android.gms.b.zy.e(r3);	 Catch:{ all -> 0x010b }
        r3 = new com.google.android.gms.b.wi;	 Catch:{ all -> 0x010b }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
        goto L_0x00da;
    L_0x0181:
        r8.a(r12);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        if (r20 == 0) goto L_0x0189;
    L_0x0189:
        r6 = r4;
        r7 = r5;
        goto L_0x0035;
    L_0x018d:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x00fb;
    L_0x0194:
        r3 = move-exception;
        goto L_0x0112;
    L_0x0197:
        r3 = move-exception;
        goto L_0x0107;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.wx.a(com.google.android.gms.b.wf, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.b.xd, com.google.android.gms.b.qa, com.google.android.gms.b.ww):com.google.android.gms.b.wi");
    }

    public static wx a(Context context, pk pkVar, ww wwVar) {
        wx wxVar;
        synchronized (a) {
            if (b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                b = new wx(context, pkVar, wwVar);
            }
            wxVar = b;
        }
        return wxVar;
    }

    private static void a(String str, Map<String, List<String>> map, String str2, int i) {
        if (zy.a(2)) {
            ze.a(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    String str32;
                    ze.a(new StringBuilder(String.valueOf(str32).length() + 5).append("    ").append(str32).append(":").toString());
                    for (String str322 : (List) map.get(str322)) {
                        String str4 = "      ";
                        str322 = String.valueOf(str322);
                        ze.a(str322.length() != 0 ? str4.concat(str322) : new String(str4));
                    }
                }
            }
            ze.a("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    ze.a(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                ze.a("    null");
            }
            ze.a("  Response Code:\n    " + i + "\n}");
        }
    }

    private static Bundle b(aag<Bundle> com_google_android_gms_b_aag_android_os_Bundle) {
        Bundle bundle = new Bundle();
        try {
            return (Bundle) com_google_android_gms_b_aag_android_os_Bundle.get(((Long) pr.cN.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            zy.c("Exception caught while getting parental controls.", e);
            return bundle;
        }
    }

    public wi a(wf wfVar) {
        return a(this.c, this.f, this.e, this.d, wfVar);
    }

    public void a(final wf wfVar, final wp wpVar) {
        v.i().a(this.c, wfVar.k);
        zh.a(new Runnable(this) {
            final /* synthetic */ wx c;

            public void run() {
                wi a;
                try {
                    a = this.c.a(wfVar);
                } catch (Throwable e) {
                    v.i().a(e, "AdRequestServiceImpl.loadAdAsync");
                    zy.c("Could not fetch ad response due to an Exception.", e);
                    a = null;
                }
                if (a == null) {
                    a = new wi(0);
                }
                try {
                    wpVar.a(a);
                } catch (Throwable e2) {
                    zy.c("Fail to forward ad response.", e2);
                }
            }
        });
    }
}
