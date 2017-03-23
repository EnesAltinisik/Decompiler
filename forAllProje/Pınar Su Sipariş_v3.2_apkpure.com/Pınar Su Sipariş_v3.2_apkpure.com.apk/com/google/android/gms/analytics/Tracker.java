package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzao;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzln;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Tracker extends zzd {
    private final Map<String, String> zzAd = new HashMap();
    private boolean zzUK;
    private final Map<String, String> zzUL = new HashMap();
    private final zzad zzUM;
    private final a zzUN;
    private ExceptionReporter zzUO;
    private zzan zzUP;

    private class a extends zzd implements a {
        final /* synthetic */ Tracker a;
        private boolean b;
        private int c;
        private long d = -1;
        private boolean e;
        private long f;

        protected a(Tracker tracker, zzf com_google_android_gms_analytics_internal_zzf) {
            this.a = tracker;
            super(com_google_android_gms_analytics_internal_zzf);
        }

        private void c() {
            if (this.d >= 0 || this.b) {
                zzkq().zza(this.a.zzUN);
            } else {
                zzkq().zzb(this.a.zzUN);
            }
        }

        public void a(long j) {
            this.d = j;
            c();
        }

        public void a(Activity activity) {
            if (this.c == 0 && b()) {
                this.e = true;
            }
            this.c++;
            if (this.b) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    this.a.setCampaignParamsOnNextHit(intent.getData());
                }
                Map hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                this.a.set("&cd", this.a.zzUP != null ? this.a.zzUP.zzr(activity) : activity.getClass().getCanonicalName());
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    CharSequence zzq = Tracker.zzq(activity);
                    if (!TextUtils.isEmpty(zzq)) {
                        hashMap.put("&dr", zzq);
                    }
                }
                this.a.send(hashMap);
            }
        }

        public void a(boolean z) {
            this.b = z;
            c();
        }

        public synchronized boolean a() {
            boolean z;
            z = this.e;
            this.e = false;
            return z;
        }

        public void b(Activity activity) {
            this.c--;
            this.c = Math.max(0, this.c);
            if (this.c == 0) {
                this.f = zzlQ().elapsedRealtime();
            }
        }

        boolean b() {
            return zzlQ().elapsedRealtime() >= this.f + Math.max(1000, this.d);
        }

        protected void zzkO() {
        }
    }

    Tracker(zzf com_google_android_gms_analytics_internal_zzf, String str, zzad com_google_android_gms_analytics_internal_zzad) {
        super(com_google_android_gms_analytics_internal_zzf);
        if (str != null) {
            this.zzAd.put("&tid", str);
        }
        this.zzAd.put("useSecure", "1");
        this.zzAd.put("&a", Integer.toString(new Random().nextInt(Strategy.TTL_SECONDS_INFINITE) + 1));
        if (com_google_android_gms_analytics_internal_zzad == null) {
            this.zzUM = new zzad("tracking", zzlQ());
        } else {
            this.zzUM = com_google_android_gms_analytics_internal_zzad;
        }
        this.zzUN = new a(this, com_google_android_gms_analytics_internal_zzf);
    }

    private static boolean zza(Entry<String, String> entry) {
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        return str.startsWith("&") && str.length() >= 2;
    }

    private static String zzb(Entry<String, String> entry) {
        return !zza((Entry) entry) ? null : ((String) entry.getKey()).substring(1);
    }

    private static void zzb(Map<String, String> map, Map<String, String> map2) {
        zzaa.zzz(map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String zzb = zzb(entry);
                if (zzb != null) {
                    map2.put(zzb, (String) entry.getValue());
                }
            }
        }
    }

    private static void zzc(Map<String, String> map, Map<String, String> map2) {
        zzaa.zzz(map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String zzb = zzb(entry);
                if (!(zzb == null || map2.containsKey(zzb))) {
                    map2.put(zzb, (String) entry.getValue());
                }
            }
        }
    }

    private boolean zzkP() {
        return this.zzUO != null;
    }

    static String zzq(Activity activity) {
        zzaa.zzz(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        CharSequence stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return !TextUtils.isEmpty(stringExtra) ? stringExtra : null;
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.zzUK = z;
    }

    public void enableAutoActivityTracking(boolean z) {
        this.zzUN.a(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enableExceptionReporting(boolean r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.zzkP();	 Catch:{ all -> 0x0026 }
        if (r0 != r4) goto L_0x0009;
    L_0x0007:
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
    L_0x0008:
        return;
    L_0x0009:
        if (r4 == 0) goto L_0x0029;
    L_0x000b:
        r0 = r3.getContext();	 Catch:{ all -> 0x0026 }
        r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler();	 Catch:{ all -> 0x0026 }
        r2 = new com.google.android.gms.analytics.ExceptionReporter;	 Catch:{ all -> 0x0026 }
        r2.<init>(r3, r1, r0);	 Catch:{ all -> 0x0026 }
        r3.zzUO = r2;	 Catch:{ all -> 0x0026 }
        r0 = r3.zzUO;	 Catch:{ all -> 0x0026 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);	 Catch:{ all -> 0x0026 }
        r0 = "Uncaught exceptions will be reported to Google Analytics";
        r3.zzbG(r0);	 Catch:{ all -> 0x0026 }
    L_0x0024:
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
        goto L_0x0008;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        r0 = r3.zzUO;	 Catch:{ all -> 0x0026 }
        r0 = r0.zzkr();	 Catch:{ all -> 0x0026 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);	 Catch:{ all -> 0x0026 }
        r0 = "Uncaught exceptions will not be reported to Google Analytics";
        r3.zzbG(r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.Tracker.enableExceptionReporting(boolean):void");
    }

    public String get(String str) {
        zzma();
        return TextUtils.isEmpty(str) ? null : this.zzAd.containsKey(str) ? (String) this.zzAd.get(str) : str.equals("&ul") ? zzao.zza(Locale.getDefault()) : str.equals("&cid") ? zzlW().zzmP() : str.equals("&sr") ? zzlZ().zznF() : str.equals("&aid") ? zzlY().zzmx().zziC() : str.equals("&an") ? zzlY().zzmx().zzkU() : str.equals("&av") ? zzlY().zzmx().zzkV() : str.equals("&aiid") ? zzlY().zzmx().zzkW() : null;
    }

    public void send(Map<String, String> map) {
        final long currentTimeMillis = zzlQ().currentTimeMillis();
        if (zzkq().getAppOptOut()) {
            zzbH("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        final boolean isDryRunEnabled = zzkq().isDryRunEnabled();
        final Map hashMap = new HashMap();
        zzb(this.zzAd, hashMap);
        zzb(map, hashMap);
        final boolean zzi = zzao.zzi((String) this.zzAd.get("useSecure"), true);
        zzc(this.zzUL, hashMap);
        this.zzUL.clear();
        final String str = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            zzlR().zzh(hashMap, "Missing hit type parameter");
            return;
        }
        final String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            zzlR().zzh(hashMap, "Missing tracking id parameter");
            return;
        }
        final boolean zzkQ = zzkQ();
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt((String) this.zzAd.get("&a")) + 1;
                if (parseInt >= Strategy.TTL_SECONDS_INFINITE) {
                    parseInt = 1;
                }
                this.zzAd.put("&a", Integer.toString(parseInt));
            }
        }
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ Tracker h;

            public void run() {
                boolean z = true;
                if (this.h.zzUN.a()) {
                    hashMap.put("sc", "start");
                }
                zzao.zzd(hashMap, "cid", this.h.zzkq().zzku());
                String str = (String) hashMap.get("sf");
                if (str != null) {
                    double zza = zzao.zza(str, 100.0d);
                    if (zzao.zza(zza, (String) hashMap.get("cid"))) {
                        this.h.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(zza));
                        return;
                    }
                }
                zza zzb = this.h.zzlX();
                if (zzkQ) {
                    zzao.zzb(hashMap, "ate", zzb.zzlt());
                    zzao.zzc(hashMap, "adid", zzb.zzlE());
                } else {
                    hashMap.remove("ate");
                    hashMap.remove("adid");
                }
                zzln zzmx = this.h.zzlY().zzmx();
                zzao.zzc(hashMap, "an", zzmx.zzkU());
                zzao.zzc(hashMap, "av", zzmx.zzkV());
                zzao.zzc(hashMap, "aid", zzmx.zziC());
                zzao.zzc(hashMap, "aiid", zzmx.zzkW());
                hashMap.put("v", "1");
                hashMap.put("_v", zze.zzWi);
                zzao.zzc(hashMap, "ul", this.h.zzlZ().zznE().getLanguage());
                zzao.zzc(hashMap, "sr", this.h.zzlZ().zznF());
                boolean z2 = str.equals("transaction") || str.equals("item");
                if (z2 || this.h.zzUM.zznY()) {
                    long zzbX = zzao.zzbX((String) hashMap.get("ht"));
                    if (zzbX == 0) {
                        zzbX = currentTimeMillis;
                    }
                    if (isDryRunEnabled) {
                        this.h.zzlR().zzc("Dry run enabled. Would have sent hit", new zzab(this.h, hashMap, zzbX, zzi));
                        return;
                    }
                    String str2 = (String) hashMap.get("cid");
                    Map hashMap = new HashMap();
                    zzao.zza(hashMap, "uid", hashMap);
                    zzao.zza(hashMap, "an", hashMap);
                    zzao.zza(hashMap, "aid", hashMap);
                    zzao.zza(hashMap, "av", hashMap);
                    zzao.zza(hashMap, "aiid", hashMap);
                    String str3 = str2;
                    if (TextUtils.isEmpty((CharSequence) hashMap.get("adid"))) {
                        z = false;
                    }
                    hashMap.put("_s", String.valueOf(this.h.zzkw().zza(new zzh(0, str2, str3, z, 0, hashMap))));
                    this.h.zzkw().zza(new zzab(this.h, hashMap, zzbX, zzi));
                    return;
                }
                this.h.zzlR().zzh(hashMap, "Too many hits sent too quickly, rate limiting invoked");
            }
        });
    }

    public void set(String str, String str2) {
        zzaa.zzb((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.zzAd.put(str, str2);
        }
    }

    public void setAnonymizeIp(boolean z) {
        set("&aip", zzao.zzS(z));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        if (uri != null && !uri.isOpaque()) {
            CharSequence queryParameter = uri.getQueryParameter(Constants.REFERRER);
            if (!TextUtils.isEmpty(queryParameter)) {
                String str = "http://hostname/?";
                String valueOf = String.valueOf(queryParameter);
                Uri parse = Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                str = parse.getQueryParameter("utm_id");
                if (str != null) {
                    this.zzUL.put("&ci", str);
                }
                str = parse.getQueryParameter("anid");
                if (str != null) {
                    this.zzUL.put("&anid", str);
                }
                str = parse.getQueryParameter("utm_campaign");
                if (str != null) {
                    this.zzUL.put("&cn", str);
                }
                str = parse.getQueryParameter("utm_content");
                if (str != null) {
                    this.zzUL.put("&cc", str);
                }
                str = parse.getQueryParameter("utm_medium");
                if (str != null) {
                    this.zzUL.put("&cm", str);
                }
                str = parse.getQueryParameter("utm_source");
                if (str != null) {
                    this.zzUL.put("&cs", str);
                }
                str = parse.getQueryParameter("utm_term");
                if (str != null) {
                    this.zzUL.put("&ck", str);
                }
                str = parse.getQueryParameter("dclid");
                if (str != null) {
                    this.zzUL.put("&dclid", str);
                }
                str = parse.getQueryParameter("gclid");
                if (str != null) {
                    this.zzUL.put("&gclid", str);
                }
                valueOf = parse.getQueryParameter("aclid");
                if (valueOf != null) {
                    this.zzUL.put("&aclid", valueOf);
                }
            }
        }
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d) {
        set("&sf", Double.toString(d));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            set("&sr", i + "x" + i2);
        } else {
            zzbJ("Invalid width or height. The values should be non-negative.");
        }
    }

    public void setSessionTimeout(long j) {
        this.zzUN.a(1000 * j);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z) {
        set("useSecure", zzao.zzS(z));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }

    void zza(zzan com_google_android_gms_analytics_internal_zzan) {
        zzbG("Loading Tracker config values");
        this.zzUP = com_google_android_gms_analytics_internal_zzan;
        if (this.zzUP.zzov()) {
            String trackingId = this.zzUP.getTrackingId();
            set("&tid", trackingId);
            zza("trackingId loaded", trackingId);
        }
        if (this.zzUP.zzow()) {
            trackingId = Double.toString(this.zzUP.zzox());
            set("&sf", trackingId);
            zza("Sample frequency loaded", trackingId);
        }
        if (this.zzUP.zzoy()) {
            int sessionTimeout = this.zzUP.getSessionTimeout();
            setSessionTimeout((long) sessionTimeout);
            zza("Session timeout loaded", Integer.valueOf(sessionTimeout));
        }
        if (this.zzUP.zzoz()) {
            boolean zzoA = this.zzUP.zzoA();
            enableAutoActivityTracking(zzoA);
            zza("Auto activity tracking loaded", Boolean.valueOf(zzoA));
        }
        if (this.zzUP.zzoB()) {
            zzoA = this.zzUP.zzoC();
            if (zzoA) {
                set("&aip", "1");
            }
            zza("Anonymize ip loaded", Boolean.valueOf(zzoA));
        }
        enableExceptionReporting(this.zzUP.zzoD());
    }

    protected void zzkO() {
        this.zzUN.initialize();
        String zzkU = zzkx().zzkU();
        if (zzkU != null) {
            set("&an", zzkU);
        }
        zzkU = zzkx().zzkV();
        if (zzkU != null) {
            set("&av", zzkU);
        }
    }

    boolean zzkQ() {
        return this.zzUK;
    }
}
