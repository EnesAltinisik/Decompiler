package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.c;

public class cl extends cy {
    private String a;
    private String b;
    private int c;
    private String d;
    private String e;
    private long f;
    private String g;

    cl(cv cvVar) {
        super(cvVar);
    }

    int A() {
        Q();
        return this.c;
    }

    String B() {
        Q();
        return this.d;
    }

    long C() {
        return w().Q();
    }

    long D() {
        Q();
        e();
        if (this.f == 0) {
            this.f = this.n.o().b(n(), n().getPackageName());
        }
        return this.f;
    }

    bv a(String str) {
        e();
        return new bv(x(), y(), z(), (long) A(), B(), C(), D(), str, this.n.G(), !v().m, v().y());
    }

    protected void a() {
        String str = "unknown";
        String str2 = "Unknown";
        int i = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String packageName = n().getPackageName();
        PackageManager packageManager = n().getPackageManager();
        if (packageManager == null) {
            u().x().a("PackageManager is null, app identity information might be inaccurate. appId", co.a(packageName));
        } else {
            try {
                str = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException e) {
                u().x().a("Error retrieving app installer package name. appId", co.a(packageName));
            }
            if (str == null) {
                str = "manual_install";
            } else if ("com.android.vending".equals(str)) {
                str = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(n().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        str3 = applicationLabel.toString();
                    }
                    str2 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
            } catch (NameNotFoundException e2) {
                u().x().a("Error retrieving package info. appId, appName", co.a(packageName), str3);
            }
        }
        this.a = packageName;
        this.d = str;
        this.b = str2;
        this.c = i;
        this.e = str3;
        w().R();
        Status a = s.a(n());
        Object obj = (a == null || !a.d()) ? null : 1;
        if (obj == null) {
            a(a);
        }
        if (obj != null) {
            Boolean U = w().U();
            if (w().T()) {
                u().B().a("Collection disabled with firebase_analytics_collection_deactivated=1");
                obj = null;
            } else if (U != null && !U.booleanValue()) {
                u().B().a("Collection disabled with firebase_analytics_collection_enabled=0");
                obj = null;
            } else if (U == null && w().V()) {
                u().B().a("Collection disabled with google_app_measurement_enable=0");
                obj = null;
            } else {
                u().D().a("Collection enabled");
                int i2 = 1;
            }
        } else {
            obj = null;
        }
        this.g = "";
        w().R();
        try {
            String a2 = s.a();
            if (TextUtils.isEmpty(a2)) {
                a2 = "";
            }
            this.g = a2;
            if (obj != null) {
                u().D().a("App package, google app id", this.a, this.g);
            }
        } catch (IllegalStateException e3) {
            u().x().a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", co.a(packageName), e3);
        }
    }

    protected void a(Status status) {
        if (status == null) {
            u().x().a("GoogleService failed to initialize (no status)");
        } else {
            u().x().a("GoogleService failed to initialize, status", Integer.valueOf(status.e()), status.c());
        }
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }

    String x() {
        Q();
        return this.a;
    }

    String y() {
        Q();
        return this.g;
    }

    String z() {
        Q();
        return this.b;
    }
}
