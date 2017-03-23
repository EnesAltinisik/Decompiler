package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.analytics.zze;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzln;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzlw;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class e extends zzd {
    private boolean a;
    private final d b;
    private final b c;
    private final a d;
    private final zzi e;
    private long f = Long.MIN_VALUE;
    private final h g;
    private final h h;
    private final c i;
    private long j;
    private boolean k;

    protected e(zzf com_google_android_gms_analytics_internal_zzf, zzg com_google_android_gms_analytics_internal_zzg) {
        super(com_google_android_gms_analytics_internal_zzf);
        zzaa.zzz(com_google_android_gms_analytics_internal_zzg);
        this.d = com_google_android_gms_analytics_internal_zzg.zzk(com_google_android_gms_analytics_internal_zzf);
        this.b = com_google_android_gms_analytics_internal_zzg.zzm(com_google_android_gms_analytics_internal_zzf);
        this.c = com_google_android_gms_analytics_internal_zzg.zzn(com_google_android_gms_analytics_internal_zzf);
        this.e = com_google_android_gms_analytics_internal_zzg.zzo(com_google_android_gms_analytics_internal_zzf);
        this.i = new c(zzlQ());
        this.g = new h(this, com_google_android_gms_analytics_internal_zzf) {
            final /* synthetic */ e a;

            public void a() {
                this.a.p();
            }
        };
        this.h = new h(this, com_google_android_gms_analytics_internal_zzf) {
            final /* synthetic */ e a;

            public void a() {
                this.a.q();
            }
        };
    }

    private void a(zzh com_google_android_gms_analytics_internal_zzh, zzlo com_google_android_gms_internal_zzlo) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzh);
        zzaa.zzz(com_google_android_gms_internal_zzlo);
        zza com_google_android_gms_analytics_zza = new zza(zzlO());
        com_google_android_gms_analytics_zza.zzbf(com_google_android_gms_analytics_internal_zzh.zzmj());
        com_google_android_gms_analytics_zza.enableAdvertisingIdCollection(com_google_android_gms_analytics_internal_zzh.zzmk());
        zze zzkk = com_google_android_gms_analytics_zza.zzkk();
        zzlw com_google_android_gms_internal_zzlw = (zzlw) zzkk.zzb(zzlw.class);
        com_google_android_gms_internal_zzlw.zzbv("data");
        com_google_android_gms_internal_zzlw.zzO(true);
        zzkk.zza((zzg) com_google_android_gms_internal_zzlo);
        zzlr com_google_android_gms_internal_zzlr = (zzlr) zzkk.zzb(zzlr.class);
        zzln com_google_android_gms_internal_zzln = (zzln) zzkk.zzb(zzln.class);
        for (Entry entry : com_google_android_gms_analytics_internal_zzh.zzm().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                com_google_android_gms_internal_zzln.setAppName(str2);
            } else if ("av".equals(str)) {
                com_google_android_gms_internal_zzln.setAppVersion(str2);
            } else if ("aid".equals(str)) {
                com_google_android_gms_internal_zzln.setAppId(str2);
            } else if ("aiid".equals(str)) {
                com_google_android_gms_internal_zzln.setAppInstallerId(str2);
            } else if ("uid".equals(str)) {
                com_google_android_gms_internal_zzlw.setUserId(str2);
            } else {
                com_google_android_gms_internal_zzlr.set(str, str2);
            }
        }
        zzb("Sending installation campaign to", com_google_android_gms_analytics_internal_zzh.zzmj(), com_google_android_gms_internal_zzlo);
        zzkk.zzn(zzlV().zzoh());
        zzkk.zzkC();
    }

    private boolean b(String str) {
        return getContext().checkCallingOrSelfPermission(str) == 0;
    }

    private void o() {
        zzkN();
        Context context = zzlO().getContext();
        if (!zzaj.zzU(context)) {
            zzbJ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzak.zzV(context)) {
            zzbK("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzU(context)) {
            zzbJ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!CampaignTrackingService.zzV(context)) {
            zzbJ("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
    }

    private void p() {
        a(new zzw(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void zzd(Throwable th) {
                this.a.l();
            }
        });
    }

    private void q() {
        try {
            this.b.h();
            l();
        } catch (SQLiteException e) {
            zzd("Failed to delete stale hits", e);
        }
        this.h.a(zzlS().zzny());
    }

    private boolean r() {
        return this.k ? false : (!zzlS().zzmW() || zzlS().zzmX()) && m() > 0;
    }

    private void s() {
        zzv zzlU = zzlU();
        if (zzlU.zznG() && !zzlU.zzbW()) {
            long k = k();
            if (k != 0 && Math.abs(zzlQ().currentTimeMillis() - k) <= zzlS().zzng()) {
                zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzlS().zznf()));
                zzlU.schedule();
            }
        }
    }

    private void t() {
        s();
        long m = m();
        long zzoj = zzlV().zzoj();
        if (zzoj != 0) {
            zzoj = m - Math.abs(zzlQ().currentTimeMillis() - zzoj);
            if (zzoj <= 0) {
                zzoj = Math.min(zzlS().zznd(), m);
            }
        } else {
            zzoj = Math.min(zzlS().zznd(), m);
        }
        zza("Dispatch scheduled (ms)", Long.valueOf(zzoj));
        if (this.g.c()) {
            this.g.b(Math.max(1, zzoj + this.g.b()));
            return;
        }
        this.g.a(zzoj);
    }

    private void u() {
        v();
        w();
    }

    private void v() {
        if (this.g.c()) {
            zzbG("All hits dispatched or no network/service. Going to power save mode");
        }
        this.g.d();
    }

    private void w() {
        zzv zzlU = zzlU();
        if (zzlU.zzbW()) {
            zzlU.cancel();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(com.google.android.gms.analytics.internal.zzh r6, boolean r7) {
        /*
        r5 = this;
        com.google.android.gms.common.internal.zzaa.zzz(r6);
        r5.zzma();
        r5.zzkN();
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r0.a();	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r6.zzmi();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.zzku();	 Catch:{ SQLiteException -> 0x0049 }
        r0.a(r2, r1);	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r6.zzmi();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.zzku();	 Catch:{ SQLiteException -> 0x0049 }
        r4 = r6.zzmj();	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r0.a(r2, r1, r4);	 Catch:{ SQLiteException -> 0x0049 }
        if (r7 != 0) goto L_0x0042;
    L_0x002f:
        r6.zzp(r0);	 Catch:{ SQLiteException -> 0x0049 }
    L_0x0032:
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2.a(r6);	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0049 }
        r2.b();	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0057 }
        r2.c();	 Catch:{ SQLiteException -> 0x0057 }
    L_0x0041:
        return r0;
    L_0x0042:
        r2 = 1;
        r2 = r2 + r0;
        r6.zzp(r2);	 Catch:{ SQLiteException -> 0x0049 }
        goto L_0x0032;
    L_0x0049:
        r0 = move-exception;
        r1 = "Failed to update Analytics property";
        r5.zze(r1, r0);	 Catch:{ all -> 0x0065 }
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x005e }
        r0.c();	 Catch:{ SQLiteException -> 0x005e }
    L_0x0054:
        r0 = -1;
        goto L_0x0041;
    L_0x0057:
        r2 = move-exception;
        r3 = "Failed to end transaction";
        r5.zze(r3, r2);
        goto L_0x0041;
    L_0x005e:
        r0 = move-exception;
        r1 = "Failed to end transaction";
        r5.zze(r1, r0);
        goto L_0x0054;
    L_0x0065:
        r0 = move-exception;
        r1 = r5.b;	 Catch:{ SQLiteException -> 0x006c }
        r1.c();	 Catch:{ SQLiteException -> 0x006c }
    L_0x006b:
        throw r0;
    L_0x006c:
        r1 = move-exception;
        r2 = "Failed to end transaction";
        r5.zze(r2, r1);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.e.a(com.google.android.gms.analytics.internal.zzh, boolean):long");
    }

    void a() {
        zzma();
        zzaa.zza(!this.a, (Object) "Analytics backend already started");
        this.a = true;
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.b();
            }
        });
    }

    public void a(long j) {
        zzi.zzkN();
        zzma();
        if (j < 0) {
            j = 0;
        }
        this.f = j;
        l();
    }

    public void a(zzab com_google_android_gms_analytics_internal_zzab) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzab);
        zzi.zzkN();
        zzma();
        if (this.k) {
            zzbH("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zza("Delivering hit", com_google_android_gms_analytics_internal_zzab);
        }
        zzab b = b(com_google_android_gms_analytics_internal_zzab);
        f();
        if (this.e.zzb(b)) {
            zzbH("Hit sent to the device AnalyticsService for delivery");
        } else if (zzlS().zzmW()) {
            zzlR().zza(b, "Service unavailable on package side");
        } else {
            try {
                this.b.a(b);
                l();
            } catch (SQLiteException e) {
                zze("Delivery failed to save hit to a database", e);
                zzlR().zza(b, "deliver: failed to insert hit to database");
            }
        }
    }

    protected void a(zzh com_google_android_gms_analytics_internal_zzh) {
        zzkN();
        zzb("Sending first hit to property", com_google_android_gms_analytics_internal_zzh.zzmj());
        if (!zzlV().zzoi().a(zzlS().zznB())) {
            String zzol = zzlV().zzol();
            if (!TextUtils.isEmpty(zzol)) {
                zzlo zza = zzao.zza(zzlR(), zzol);
                zzb("Found relevant installation campaign", zza);
                a(com_google_android_gms_analytics_internal_zzh, zza);
            }
        }
    }

    public void a(zzw com_google_android_gms_analytics_internal_zzw) {
        a(com_google_android_gms_analytics_internal_zzw, this.j);
    }

    public void a(final zzw com_google_android_gms_analytics_internal_zzw, final long j) {
        zzi.zzkN();
        zzma();
        long j2 = -1;
        long zzoj = zzlV().zzoj();
        if (zzoj != 0) {
            j2 = Math.abs(zzlQ().currentTimeMillis() - zzoj);
        }
        zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        if (!zzlS().zzmW()) {
            f();
        }
        try {
            if (i()) {
                zzlT().zzf(new Runnable(this) {
                    final /* synthetic */ e c;

                    public void run() {
                        this.c.a(com_google_android_gms_analytics_internal_zzw, j);
                    }
                });
                return;
            }
            zzlV().zzok();
            l();
            if (com_google_android_gms_analytics_internal_zzw != null) {
                com_google_android_gms_analytics_internal_zzw.zzd(null);
            }
            if (this.j != j) {
                this.d.c();
            }
        } catch (Throwable th) {
            zze("Local dispatch failed", th);
            zzlV().zzok();
            l();
            if (com_google_android_gms_analytics_internal_zzw != null) {
                com_google_android_gms_analytics_internal_zzw.zzd(th);
            }
        }
    }

    public void a(String str) {
        zzaa.zzdl(str);
        zzkN();
        zzlP();
        zzlo zza = zzao.zza(zzlR(), str);
        if (zza == null) {
            zzd("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        CharSequence zzol = zzlV().zzol();
        if (str.equals(zzol)) {
            zzbJ("Ignoring duplicate install campaign");
        } else if (TextUtils.isEmpty(zzol)) {
            zzlV().zzbT(str);
            if (zzlV().zzoi().a(zzlS().zznB())) {
                zzd("Campaign received too late, ignoring", zza);
                return;
            }
            zzb("Received installation campaign", zza);
            for (zzh a : this.b.d(0)) {
                a(a, zza);
            }
        } else {
            zzd("Ignoring multiple install campaigns. original, new", zzol, str);
        }
    }

    public void a(boolean z) {
        l();
    }

    zzab b(zzab com_google_android_gms_analytics_internal_zzab) {
        if (!TextUtils.isEmpty(com_google_android_gms_analytics_internal_zzab.zznX())) {
            return com_google_android_gms_analytics_internal_zzab;
        }
        Pair zzop = zzlV().zzom().zzop();
        if (zzop == null) {
            return com_google_android_gms_analytics_internal_zzab;
        }
        Long l = (Long) zzop.second;
        String str = (String) zzop.first;
        String valueOf = String.valueOf(l);
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
        Map hashMap = new HashMap(com_google_android_gms_analytics_internal_zzab.zzm());
        hashMap.put("_m", valueOf);
        return zzab.zza(this, com_google_android_gms_analytics_internal_zzab, hashMap);
    }

    protected void b() {
        zzma();
        if (!zzlS().zzmW()) {
            o();
        }
        zzlV().zzoh();
        if (!b("android.permission.ACCESS_NETWORK_STATE")) {
            zzbK("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            n();
        }
        if (!b("android.permission.INTERNET")) {
            zzbK("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            n();
        }
        if (zzak.zzV(getContext())) {
            zzbG("AnalyticsService registered in the app manifest and enabled");
        } else if (zzlS().zzmW()) {
            zzbK("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        } else {
            zzbJ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(this.k || zzlS().zzmW() || this.b.g())) {
            f();
        }
        l();
    }

    void c() {
        zzkN();
        this.j = zzlQ().currentTimeMillis();
    }

    protected void d() {
        zzkN();
        if (!zzlS().zzmW()) {
            h();
        }
    }

    public void e() {
        zzi.zzkN();
        zzma();
        zzbG("Service disconnected");
    }

    protected void f() {
        if (!this.k && zzlS().zzmY() && !this.e.isConnected()) {
            if (this.i.a(zzlS().zznt())) {
                this.i.a();
                zzbG("Connecting to service");
                if (this.e.connect()) {
                    zzbG("Connected to service");
                    this.i.b();
                    d();
                }
            }
        }
    }

    public void g() {
        zzi.zzkN();
        zzma();
        if (!zzlS().zzmW()) {
            zzbG("Delete all hits from local store");
            try {
                this.b.d();
                this.b.e();
                l();
            } catch (SQLiteException e) {
                zzd("Failed to delete hits from store", e);
            }
        }
        f();
        if (this.e.zzmm()) {
            zzbG("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    public void h() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        com.google.android.gms.analytics.zzi.zzkN();
        r6.zzma();
        r6.zzlP();
        r0 = r6.zzlS();
        r0 = r0.zzmY();
        if (r0 != 0) goto L_0x0018;
    L_0x0013:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r6.zzbJ(r0);
    L_0x0018:
        r0 = r6.e;
        r0 = r0.isConnected();
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        r0 = "Service not connected";
        r6.zzbG(r0);
    L_0x0025:
        return;
    L_0x0026:
        r0 = r6.b;
        r0 = r0.g();
        if (r0 != 0) goto L_0x0025;
    L_0x002e:
        r0 = "Dispatching local hits to device AnalyticsService";
        r6.zzbG(r0);
    L_0x0033:
        r0 = r6.b;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r6.zzlS();	 Catch:{ SQLiteException -> 0x004c }
        r1 = r1.zznh();	 Catch:{ SQLiteException -> 0x004c }
        r2 = (long) r1;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r0.b(r2);	 Catch:{ SQLiteException -> 0x004c }
        r0 = r1.isEmpty();	 Catch:{ SQLiteException -> 0x004c }
        if (r0 == 0) goto L_0x0062;	 Catch:{ SQLiteException -> 0x004c }
    L_0x0048:
        r6.l();	 Catch:{ SQLiteException -> 0x004c }
        goto L_0x0025;
    L_0x004c:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r6.zze(r1, r0);
        r6.u();
        goto L_0x0025;
    L_0x0056:
        r1.remove(r0);
        r2 = r6.b;	 Catch:{ SQLiteException -> 0x007b }
        r4 = r0.zznS();	 Catch:{ SQLiteException -> 0x007b }
        r2.c(r4);	 Catch:{ SQLiteException -> 0x007b }
    L_0x0062:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x0033;
    L_0x0068:
        r0 = 0;
        r0 = r1.get(r0);
        r0 = (com.google.android.gms.analytics.internal.zzab) r0;
        r2 = r6.e;
        r2 = r2.zzb(r0);
        if (r2 != 0) goto L_0x0056;
    L_0x0077:
        r6.l();
        goto L_0x0025;
    L_0x007b:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r6.zze(r1, r0);
        r6.u();
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.e.h():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean i() {
        /*
        r12 = this;
        r1 = 1;
        r2 = 0;
        com.google.android.gms.analytics.zzi.zzkN();
        r12.zzma();
        r0 = "Dispatching a batch of local hits";
        r12.zzbG(r0);
        r0 = r12.e;
        r0 = r0.isConnected();
        if (r0 != 0) goto L_0x0032;
    L_0x0015:
        r0 = r12.zzlS();
        r0 = r0.zzmW();
        if (r0 != 0) goto L_0x0032;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        r3 = r12.c;
        r3 = r3.a();
        if (r3 != 0) goto L_0x0034;
    L_0x0028:
        if (r0 == 0) goto L_0x0036;
    L_0x002a:
        if (r1 == 0) goto L_0x0036;
    L_0x002c:
        r0 = "No network or service available. Will retry later";
        r12.zzbG(r0);
    L_0x0031:
        return r2;
    L_0x0032:
        r0 = r2;
        goto L_0x0020;
    L_0x0034:
        r1 = r2;
        goto L_0x0028;
    L_0x0036:
        r0 = r12.zzlS();
        r0 = r0.zznh();
        r1 = r12.zzlS();
        r1 = r1.zzni();
        r0 = java.lang.Math.max(r0, r1);
        r6 = (long) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = 0;
    L_0x0052:
        r0 = r12.b;	 Catch:{ all -> 0x01eb }
        r0.a();	 Catch:{ all -> 0x01eb }
        r3.clear();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00d3 }
        r8 = r0.b(r6);	 Catch:{ SQLiteException -> 0x00d3 }
        r0 = r8.isEmpty();	 Catch:{ SQLiteException -> 0x00d3 }
        if (r0 == 0) goto L_0x0083;
    L_0x0066:
        r0 = "Store is empty, nothing to dispatch";
        r12.zzbG(r0);	 Catch:{ SQLiteException -> 0x00d3 }
        r12.u();	 Catch:{ SQLiteException -> 0x00d3 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0079 }
        r0.b();	 Catch:{ SQLiteException -> 0x0079 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0079 }
        r0.c();	 Catch:{ SQLiteException -> 0x0079 }
        goto L_0x0031;
    L_0x0079:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x0083:
        r0 = "Hits loaded from store. count";
        r1 = r8.size();	 Catch:{ SQLiteException -> 0x00d3 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x00d3 }
        r12.zza(r0, r1);	 Catch:{ SQLiteException -> 0x00d3 }
        r1 = r8.iterator();	 Catch:{ all -> 0x01eb }
    L_0x0094:
        r0 = r1.hasNext();	 Catch:{ all -> 0x01eb }
        if (r0 == 0) goto L_0x00f3;
    L_0x009a:
        r0 = r1.next();	 Catch:{ all -> 0x01eb }
        r0 = (com.google.android.gms.analytics.internal.zzab) r0;	 Catch:{ all -> 0x01eb }
        r10 = r0.zznS();	 Catch:{ all -> 0x01eb }
        r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0094;
    L_0x00a8:
        r0 = "Database contains successfully uploaded hit";
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01eb }
        r3 = r8.size();	 Catch:{ all -> 0x01eb }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x01eb }
        r12.zzd(r0, r1, r3);	 Catch:{ all -> 0x01eb }
        r12.u();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00c8 }
        r0.b();	 Catch:{ SQLiteException -> 0x00c8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00c8 }
        r0.c();	 Catch:{ SQLiteException -> 0x00c8 }
        goto L_0x0031;
    L_0x00c8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x00d3:
        r0 = move-exception;
        r1 = "Failed to read hits from persisted store";
        r12.zzd(r1, r0);	 Catch:{ all -> 0x01eb }
        r12.u();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00e8 }
        r0.b();	 Catch:{ SQLiteException -> 0x00e8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x00e8 }
        r0.c();	 Catch:{ SQLiteException -> 0x00e8 }
        goto L_0x0031;
    L_0x00e8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x00f3:
        r0 = r12.e;	 Catch:{ all -> 0x01eb }
        r0 = r0.isConnected();	 Catch:{ all -> 0x01eb }
        if (r0 == 0) goto L_0x0202;
    L_0x00fb:
        r0 = r12.zzlS();	 Catch:{ all -> 0x01eb }
        r0 = r0.zzmW();	 Catch:{ all -> 0x01eb }
        if (r0 != 0) goto L_0x0202;
    L_0x0105:
        r0 = "Service connected, sending hits to the service";
        r12.zzbG(r0);	 Catch:{ all -> 0x01eb }
    L_0x010a:
        r0 = r8.isEmpty();	 Catch:{ all -> 0x01eb }
        if (r0 != 0) goto L_0x0202;
    L_0x0110:
        r0 = 0;
        r0 = r8.get(r0);	 Catch:{ all -> 0x01eb }
        r0 = (com.google.android.gms.analytics.internal.zzab) r0;	 Catch:{ all -> 0x01eb }
        r1 = r12.e;	 Catch:{ all -> 0x01eb }
        r1 = r1.zzb(r0);	 Catch:{ all -> 0x01eb }
        if (r1 != 0) goto L_0x0148;
    L_0x011f:
        r0 = r4;
    L_0x0120:
        r4 = r12.c;	 Catch:{ all -> 0x01eb }
        r4 = r4.a();	 Catch:{ all -> 0x01eb }
        if (r4 == 0) goto L_0x0196;
    L_0x0128:
        r4 = r12.c;	 Catch:{ all -> 0x01eb }
        r8 = r4.a(r8);	 Catch:{ all -> 0x01eb }
        r9 = r8.iterator();	 Catch:{ all -> 0x01eb }
        r4 = r0;
    L_0x0133:
        r0 = r9.hasNext();	 Catch:{ all -> 0x01eb }
        if (r0 == 0) goto L_0x018d;
    L_0x0139:
        r0 = r9.next();	 Catch:{ all -> 0x01eb }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x01eb }
        r0 = r0.longValue();	 Catch:{ all -> 0x01eb }
        r4 = java.lang.Math.max(r4, r0);	 Catch:{ all -> 0x01eb }
        goto L_0x0133;
    L_0x0148:
        r10 = r0.zznS();	 Catch:{ all -> 0x01eb }
        r4 = java.lang.Math.max(r4, r10);	 Catch:{ all -> 0x01eb }
        r8.remove(r0);	 Catch:{ all -> 0x01eb }
        r1 = "Hit sent do device AnalyticsService for delivery";
        r12.zzb(r1, r0);	 Catch:{ all -> 0x01eb }
        r1 = r12.b;	 Catch:{ SQLiteException -> 0x016d }
        r10 = r0.zznS();	 Catch:{ SQLiteException -> 0x016d }
        r1.c(r10);	 Catch:{ SQLiteException -> 0x016d }
        r0 = r0.zznS();	 Catch:{ SQLiteException -> 0x016d }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ SQLiteException -> 0x016d }
        r3.add(r0);	 Catch:{ SQLiteException -> 0x016d }
        goto L_0x010a;
    L_0x016d:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r12.zze(r1, r0);	 Catch:{ all -> 0x01eb }
        r12.u();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0182 }
        r0.b();	 Catch:{ SQLiteException -> 0x0182 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x0182 }
        r0.c();	 Catch:{ SQLiteException -> 0x0182 }
        goto L_0x0031;
    L_0x0182:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x018d:
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01b3 }
        r0.a(r8);	 Catch:{ SQLiteException -> 0x01b3 }
        r3.addAll(r8);	 Catch:{ SQLiteException -> 0x01b3 }
        r0 = r4;
    L_0x0196:
        r4 = r3.isEmpty();	 Catch:{ all -> 0x01eb }
        if (r4 == 0) goto L_0x01d3;
    L_0x019c:
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01a8 }
        r0.b();	 Catch:{ SQLiteException -> 0x01a8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01a8 }
        r0.c();	 Catch:{ SQLiteException -> 0x01a8 }
        goto L_0x0031;
    L_0x01a8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x01b3:
        r0 = move-exception;
        r1 = "Failed to remove successfully uploaded hits";
        r12.zze(r1, r0);	 Catch:{ all -> 0x01eb }
        r12.u();	 Catch:{ all -> 0x01eb }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01c8 }
        r0.b();	 Catch:{ SQLiteException -> 0x01c8 }
        r0 = r12.b;	 Catch:{ SQLiteException -> 0x01c8 }
        r0.c();	 Catch:{ SQLiteException -> 0x01c8 }
        goto L_0x0031;
    L_0x01c8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x01d3:
        r4 = r12.b;	 Catch:{ SQLiteException -> 0x01e0 }
        r4.b();	 Catch:{ SQLiteException -> 0x01e0 }
        r4 = r12.b;	 Catch:{ SQLiteException -> 0x01e0 }
        r4.c();	 Catch:{ SQLiteException -> 0x01e0 }
        r4 = r0;
        goto L_0x0052;
    L_0x01e0:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x01eb:
        r0 = move-exception;
        r1 = r12.b;	 Catch:{ SQLiteException -> 0x01f7 }
        r1.b();	 Catch:{ SQLiteException -> 0x01f7 }
        r1 = r12.b;	 Catch:{ SQLiteException -> 0x01f7 }
        r1.c();	 Catch:{ SQLiteException -> 0x01f7 }
        throw r0;
    L_0x01f7:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.zze(r1, r0);
        r12.u();
        goto L_0x0031;
    L_0x0202:
        r0 = r4;
        goto L_0x0120;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.e.i():boolean");
    }

    public void j() {
        zzi.zzkN();
        zzma();
        zzbH("Sync dispatching local hits");
        long j = this.j;
        if (!zzlS().zzmW()) {
            f();
        }
        do {
            try {
            } catch (Throwable th) {
                zze("Sync local dispatch failed", th);
                l();
                return;
            }
        } while (i());
        zzlV().zzok();
        l();
        if (this.j != j) {
            this.d.c();
        }
    }

    public long k() {
        zzi.zzkN();
        zzma();
        try {
            return this.b.i();
        } catch (SQLiteException e) {
            zze("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    public void l() {
        zzlO().zzkN();
        zzma();
        if (!r()) {
            this.d.b();
            u();
        } else if (this.b.g()) {
            this.d.b();
            u();
        } else {
            boolean z;
            if (((Boolean) zzy.zzYm.get()).booleanValue()) {
                z = true;
            } else {
                this.d.a();
                z = this.d.e();
            }
            if (z) {
                t();
                return;
            }
            u();
            s();
        }
    }

    public long m() {
        if (this.f != Long.MIN_VALUE) {
            return this.f;
        }
        return zzkx().zznN() ? ((long) zzkx().zzoE()) * 1000 : zzlS().zzne();
    }

    public void n() {
        zzma();
        zzkN();
        this.k = true;
        this.e.disconnect();
        l();
    }

    protected void zzkO() {
        this.b.initialize();
        this.c.initialize();
        this.e.initialize();
    }
}
