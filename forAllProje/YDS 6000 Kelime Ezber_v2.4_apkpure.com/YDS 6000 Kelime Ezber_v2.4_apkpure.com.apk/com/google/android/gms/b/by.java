package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.b.cj.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.k;
import com.google.android.gms.common.util.l;
import java.lang.reflect.InvocationTargetException;

public class by extends cx {
    static final String a = String.valueOf(k.b / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    private Boolean b;

    by(cv cvVar) {
        super(cvVar);
    }

    int A() {
        return 40;
    }

    int B() {
        return 100;
    }

    int C() {
        return 256;
    }

    public int D() {
        return 36;
    }

    public int E() {
        return 2048;
    }

    int F() {
        return 500;
    }

    public long G() {
        return (long) ((Integer) cj.n.b()).intValue();
    }

    public long H() {
        return (long) ((Integer) cj.p.b()).intValue();
    }

    int I() {
        return 25;
    }

    int J() {
        return 50;
    }

    long K() {
        return 3600000;
    }

    long L() {
        return 60000;
    }

    long M() {
        return 61000;
    }

    long N() {
        return ((Long) cj.I.b()).longValue();
    }

    public String O() {
        return "google_app_measurement.db";
    }

    String P() {
        return "google_app_measurement_local.db";
    }

    public long Q() {
        return 10084;
    }

    public boolean R() {
        return false;
    }

    public boolean S() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    ApplicationInfo applicationInfo = n().getApplicationInfo();
                    String a = l.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(a);
                        this.b = Boolean.valueOf(z);
                    }
                    if (this.b == null) {
                        this.b = Boolean.TRUE;
                        u().x().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.b.booleanValue();
    }

    public boolean T() {
        Boolean g = g("firebase_analytics_collection_deactivated");
        return g != null && g.booleanValue();
    }

    public Boolean U() {
        return g("firebase_analytics_collection_enabled");
    }

    public boolean V() {
        return s.b();
    }

    public long W() {
        return ((Long) cj.F.b()).longValue();
    }

    public long X() {
        return ((Long) cj.A.b()).longValue();
    }

    public long Y() {
        return ((Long) cj.B.b()).longValue();
    }

    public long Z() {
        return 1000;
    }

    public int a(String str) {
        return Math.max(0, Math.min(1000000, b(str, cj.o)));
    }

    public long a(String str, a<Long> aVar) {
        if (str == null) {
            return ((Long) aVar.b()).longValue();
        }
        Object a = r().a(str, aVar.a());
        if (TextUtils.isEmpty(a)) {
            return ((Long) aVar.b()).longValue();
        }
        try {
            return ((Long) aVar.a(Long.valueOf(Long.valueOf(a).longValue()))).longValue();
        } catch (NumberFormatException e) {
            return ((Long) aVar.b()).longValue();
        }
    }

    String a() {
        return (String) cj.d.b();
    }

    public String a(String str, String str2) {
        Builder builder = new Builder();
        Builder encodedAuthority = builder.scheme((String) cj.h.b()).encodedAuthority((String) cj.i.b());
        String str3 = "config/app/";
        String valueOf = String.valueOf(str);
        encodedAuthority.path(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).appendQueryParameter("app_instance_id", str2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(10084));
        return builder.build().toString();
    }

    public long aa() {
        return Math.max(0, ((Long) cj.f.b()).longValue());
    }

    public int ab() {
        return Math.max(0, ((Integer) cj.l.b()).intValue());
    }

    public int ac() {
        return Math.max(1, ((Integer) cj.m.b()).intValue());
    }

    public int ad() {
        return 100000;
    }

    public String ae() {
        return (String) cj.t.b();
    }

    public long af() {
        return ((Long) cj.g.b()).longValue();
    }

    public long ag() {
        return Math.max(0, ((Long) cj.u.b()).longValue());
    }

    public long ah() {
        return Math.max(0, ((Long) cj.w.b()).longValue());
    }

    public long ai() {
        return Math.max(0, ((Long) cj.x.b()).longValue());
    }

    public long aj() {
        return Math.max(0, ((Long) cj.y.b()).longValue());
    }

    public long ak() {
        return Math.max(0, ((Long) cj.z.b()).longValue());
    }

    public long al() {
        return ((Long) cj.v.b()).longValue();
    }

    public long am() {
        return Math.max(0, ((Long) cj.C.b()).longValue());
    }

    public long an() {
        return Math.max(0, ((Long) cj.D.b()).longValue());
    }

    public int ao() {
        return Math.min(20, Math.max(0, ((Integer) cj.E.b()).intValue()));
    }

    public String ap() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            u().x().a("Could not find SystemProperties class", e);
        } catch (NoSuchMethodException e2) {
            u().x().a("Could not find SystemProperties.get() method", e2);
        } catch (IllegalAccessException e3) {
            u().x().a("Could not access SystemProperties.get()", e3);
        } catch (InvocationTargetException e4) {
            u().x().a("SystemProperties.get() threw an exception", e4);
        }
        return "";
    }

    public int b(String str) {
        return b(str, cj.q);
    }

    public int b(String str, a<Integer> aVar) {
        if (str == null) {
            return ((Integer) aVar.b()).intValue();
        }
        Object a = r().a(str, aVar.a());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) aVar.b()).intValue();
        }
        try {
            return ((Integer) aVar.a(Integer.valueOf(Integer.valueOf(a).intValue()))).intValue();
        } catch (NumberFormatException e) {
            return ((Integer) aVar.b()).intValue();
        }
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public int c(String str) {
        return b(str, cj.r);
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    long d(String str) {
        return a(str, cj.e);
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    int e(String str) {
        return b(str, cj.G);
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    int f(String str) {
        return Math.max(0, Math.min(2000, b(str, cj.H)));
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    Boolean g(String str) {
        Boolean bool = null;
        c.a(str);
        try {
            if (n().getPackageManager() == null) {
                u().x().a("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo a = at.b(n()).a(n().getPackageName(), 128);
                if (a == null) {
                    u().x().a("Failed to load metadata: ApplicationInfo is null");
                } else if (a.metaData == null) {
                    u().x().a("Failed to load metadata: Metadata bundle is null");
                } else if (a.metaData.containsKey(str)) {
                    bool = Boolean.valueOf(a.metaData.getBoolean(str));
                }
            }
        } catch (NameNotFoundException e) {
            u().x().a("Failed to load metadata: Package name not found", e);
        }
        return bool;
    }

    public int h(String str) {
        return b(str, cj.j);
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public int i(String str) {
        return Math.max(0, b(str, cj.k));
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public int j(String str) {
        return Math.max(0, Math.min(1000000, b(str, cj.s)));
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

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
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

    public int x() {
        return 25;
    }

    public int y() {
        return 40;
    }

    public int z() {
        return 24;
    }
}
