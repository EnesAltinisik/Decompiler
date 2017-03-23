package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement.d;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class db extends cy {
    protected a a;
    private volatile f b;
    private f c;
    private long d;
    private final Map<Activity, a> e = new android.support.v4.i.a();
    private final CopyOnWriteArrayList<d> f = new CopyOnWriteArrayList();
    private boolean g;
    private f h;
    private String i;

    static class a extends f {
        public boolean a;

        public a(a aVar) {
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.a = aVar.a;
        }

        public a(String str, String str2, long j) {
            this.b = str;
            this.c = str2;
            this.d = j;
            this.a = false;
        }
    }

    public db(cv cvVar) {
        super(cvVar);
    }

    private void a(Activity activity, a aVar, final boolean z) {
        int i = 1;
        f fVar = this.b != null ? this.b : (this.c == null || Math.abs(m().b() - this.d) >= 1000) ? null : this.c;
        fVar = fVar != null ? new f(fVar) : null;
        this.g = true;
        try {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                int a;
                try {
                    a = ((d) it.next()).a(fVar, aVar) & i;
                } catch (Exception e) {
                    u().x().a("onScreenChangeCallback threw exception", e);
                    a = i;
                }
                i = a;
            }
        } catch (Exception e2) {
            u().x().a("onScreenChangeCallback loop threw exception", e2);
        } finally {
            this.g = false;
        }
        if (i != 0) {
            if (aVar.c == null) {
                aVar.c = b(activity.getClass().getCanonicalName());
            }
            final f aVar2 = new a(aVar);
            this.c = this.b;
            this.d = m().b();
            this.b = aVar2;
            t().a(new Runnable(this) {
                final /* synthetic */ db c;

                public void run() {
                    if (z && this.c.a != null) {
                        this.c.a(this.c.a);
                    }
                    this.c.a = aVar2;
                    this.c.k().a(aVar2);
                }
            });
        }
    }

    private void a(a aVar) {
        f().a(m().b());
        if (s().a(aVar.a)) {
            aVar.a = false;
        }
    }

    public static void a(f fVar, Bundle bundle) {
        if (bundle != null && fVar != null && !bundle.containsKey("_sc")) {
            if (fVar.b != null) {
                bundle.putString("_sn", fVar.b);
            }
            bundle.putString("_sc", fVar.c);
            bundle.putLong("_si", fVar.d);
        }
    }

    static String b(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return str.substring(0, 36);
        }
        String str2 = split[split.length - 1];
        return str2.length() > 36 ? str2.substring(0, 36) : str2;
    }

    a a(Activity activity) {
        c.a((Object) activity);
        a aVar = (a) this.e.get(activity);
        if (aVar != null) {
            return aVar;
        }
        aVar = new a(null, b(activity.getClass().getCanonicalName()), q().x());
        this.e.put(activity, aVar);
        return aVar;
    }

    public f a(String str) {
        f fVar;
        synchronized (this) {
            if (this.h == null || this.i == null || !this.i.equals(str)) {
                fVar = null;
            } else {
                fVar = this.h;
            }
        }
        return fVar;
    }

    protected void a() {
    }

    public void a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service");
            if (bundle2 != null) {
                a a = a(activity);
                a.d = bundle2.getLong("id");
                a.b = bundle2.getString("name");
                a.c = bundle2.getString("referrer_name");
            }
        }
    }

    public void a(Activity activity, String str, String str2) {
        if (VERSION.SDK_INT < 14) {
            u().A().a("Screen engagement recording is only available at API level 14+");
        } else if (activity == null) {
            u().z().a("setCurrentScreen must be called with a non-null activity");
        } else if (!t().x()) {
            u().z().a("setCurrentScreen must be called from the main thread");
        } else if (this.g) {
            u().z().a("Cannot call setCurrentScreen from onScreenChangeCallback");
        } else if (this.b == null) {
            u().z().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.e.get(activity) == null) {
            u().z().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = b(activity.getClass().getCanonicalName());
            }
            boolean equals = this.b.c.equals(str2);
            boolean z = (this.b.b == null && str == null) || (this.b.b != null && this.b.b.equals(str));
            if (equals && z) {
                u().A().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() < 1 || str.length() > w().B())) {
                u().z().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() >= 1 && str2.length() <= w().B())) {
                Object obj;
                com.google.android.gms.b.co.a D = u().D();
                String str3 = "Setting current screen to name, class";
                if (str == null) {
                    obj = "null";
                } else {
                    String str4 = str;
                }
                D.a(str3, obj, str2);
                a aVar = new a(str, str2, q().x());
                this.e.put(activity, aVar);
                a(activity, aVar, true);
            } else {
                u().z().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public void a(d dVar) {
        c();
        if (dVar == null) {
            u().z().a("Attempting to register null OnScreenChangeCallback");
            return;
        }
        this.f.remove(dVar);
        this.f.add(dVar);
    }

    public void a(String str, f fVar) {
        e();
        synchronized (this) {
            if (this.i == null || this.i.equals(str) || fVar != null) {
                this.i = str;
                this.h = fVar;
            }
        }
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public void b(Activity activity) {
        a(activity, a(activity), false);
        f().a();
    }

    public void b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            a aVar = (a) this.e.get(activity);
            if (aVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", aVar.d);
                bundle2.putString("name", aVar.b);
                bundle2.putString("referrer_name", aVar.c);
                bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
            }
        }
    }

    public void b(d dVar) {
        c();
        this.f.remove(dVar);
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public void c(Activity activity) {
        final a a = a(activity);
        this.c = this.b;
        this.d = m().b();
        this.b = null;
        t().a(new Runnable(this) {
            final /* synthetic */ db b;

            public void run() {
                this.b.a(a);
                this.b.a = null;
                this.b.k().a(null);
            }
        });
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public void d(Activity activity) {
        this.e.remove(activity);
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

    public a x() {
        Q();
        e();
        return this.a;
    }

    public f y() {
        c();
        f fVar = this.b;
        return fVar == null ? null : new f(fVar);
    }
}
