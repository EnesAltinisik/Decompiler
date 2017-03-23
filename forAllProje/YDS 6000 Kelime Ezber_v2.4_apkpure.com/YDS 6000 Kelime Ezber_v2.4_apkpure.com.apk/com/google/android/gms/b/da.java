package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement.b;
import com.google.android.gms.measurement.AppMeasurement.c;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public class da extends cy {
    protected a a;
    private b b;
    private final Set<c> c = new CopyOnWriteArraySet();
    private boolean d;
    private String e = null;
    private String f = null;

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ da b;

        public void run() {
            this.b.a(this.a);
        }
    }

    @TargetApi(14)
    private class a implements ActivityLifecycleCallbacks {
        final /* synthetic */ da a;

        private a(da daVar) {
            this.a = daVar;
        }

        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.a.a("auto", "_ldl", (Object) str);
            return true;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                this.a.u().D().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        if (bundle == null) {
                            Bundle a = this.a.q().a(data);
                            String str = this.a.q().a(intent) ? "gs" : "auto";
                            if (a != null) {
                                this.a.a(str, "_cmp", a);
                            }
                        }
                        String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            Object obj = (queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content"))) ? 1 : null;
                            if (obj == null) {
                                this.a.u().C().a("Activity created with data 'referrer' param without gclid and at least one utm field");
                                return;
                            } else {
                                this.a.u().C().a("Activity created with referrer", queryParameter);
                                a(queryParameter);
                            }
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                this.a.u().x().a("Throwable caught in onActivityCreated", th);
            }
            this.a.l().a(activity, bundle);
        }

        public void onActivityDestroyed(Activity activity) {
            this.a.l().d(activity);
        }

        public void onActivityPaused(Activity activity) {
            this.a.l().c(activity);
            this.a.s().y();
        }

        public void onActivityResumed(Activity activity) {
            this.a.l().b(activity);
            this.a.s().x();
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.a.l().b(activity, bundle);
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    protected da(cv cvVar) {
        super(cvVar);
    }

    private String A() {
        return "com.google.android.gms.tagmanager.TagManagerService";
    }

    private void a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        a(str, str2, m().a(), bundle, z, z2, z3, str3);
    }

    private void a(String str, String str2, Object obj, long j) {
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        e();
        c();
        Q();
        if (!this.n.G()) {
            u().C().a("User property not set since app measurement is disabled");
        } else if (this.n.b()) {
            u().C().a("Setting user property (FE)", str2, obj);
            k().a(new di(str2, j, obj, str));
        }
    }

    private void a(boolean z) {
        e();
        c();
        Q();
        u().C().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        v().b(z);
        k().y();
    }

    private void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        com.google.android.gms.common.internal.c.a((Object) bundle);
        e();
        Q();
        if (this.n.G()) {
            if (!this.d) {
                this.d = true;
                z();
            }
            boolean equals = "am".equals(str);
            boolean j2 = dl.j(str2);
            if (z && this.b != null && !j2 && !equals) {
                u().C().a("Passing event to registered event handler (FE)", str2, bundle);
                this.b.a(str, str2, bundle, j);
                return;
            } else if (this.n.b()) {
                int b = q().b(str2);
                if (b != 0) {
                    this.n.o().a(b, "_ev", q().a(str2, w().y(), true), str2 != null ? str2.length() : 0);
                    return;
                }
                bundle.putString("_o", str);
                Bundle a = q().a(str2, bundle, d.a((Object) "_o"), z3);
                if (!bundle.containsKey("_sc")) {
                    w().R();
                    f x = l().x();
                    if (x != null) {
                        x.a = true;
                    }
                    db.a(x, a);
                }
                Bundle a2 = z2 ? a(a) : a;
                u().C().a("Logging event (FE)", str2, a2);
                k().a(new ch(str2, new ce(a2), str, j), str3);
                if (!equals) {
                    for (c a3 : this.c) {
                        a3.a(str, str2, new Bundle(a2), j);
                    }
                    return;
                }
                return;
            } else {
                return;
            }
        }
        u().C().a("Event not sent since app measurement is disabled");
    }

    private void z() {
        try {
            a(Class.forName(A()));
        } catch (ClassNotFoundException e) {
            u().B().a("Tag Manager is not found and thus will not be used");
        }
    }

    Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object b = q().b(str, bundle.get(str));
                if (b == null) {
                    u().z().a("Param value can't be null", str);
                } else {
                    q().a(bundle2, str, b);
                }
            }
        }
        return bundle2;
    }

    public synchronized String a(String str) {
        String str2 = null;
        synchronized (this) {
            Q();
            c();
            if (t().y()) {
                u().x().a("Cannot retrieve app instance id from analytics worker thread");
            } else if (t().x()) {
                u().x().a("Cannot retrieve app instance id from main thread");
            } else {
                if (str != null) {
                    if (str.equals(this.f)) {
                        str2 = this.e;
                    }
                }
                final AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.n.h().a(new Runnable(this) {
                        final /* synthetic */ da b;

                        public void run() {
                            this.b.k().a(atomicReference);
                        }
                    });
                    try {
                        atomicReference.wait(30000);
                    } catch (InterruptedException e) {
                        u().z().a("Interrupted waiting for app instance id");
                    }
                }
                this.f = str;
                this.e = (String) atomicReference.get();
                str2 = this.e;
            }
        }
        return str2;
    }

    protected void a() {
    }

    public void a(c cVar) {
        c();
        Q();
        com.google.android.gms.common.internal.c.a((Object) cVar);
        if (!this.c.add(cVar)) {
            u().z().a("OnEventListener already registered");
        }
    }

    public void a(Class<?> cls) {
        try {
            cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{n()});
        } catch (Exception e) {
            u().z().a("Failed to invoke Tag Manager's initialize() method", e);
        }
    }

    protected void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        final Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        final String str4 = str;
        final String str5 = str2;
        final long j2 = j;
        final boolean z4 = z;
        final boolean z5 = z2;
        final boolean z6 = z3;
        final String str6 = str3;
        t().a(new Runnable(this) {
            final /* synthetic */ da i;

            public void run() {
                this.i.b(str4, str5, j2, bundle2, z4, z5, z6, str6);
            }
        });
    }

    void a(String str, String str2, long j, Object obj) {
        final String str3 = str;
        final String str4 = str2;
        final Object obj2 = obj;
        final long j2 = j;
        t().a(new Runnable(this) {
            final /* synthetic */ da e;

            public void run() {
                this.e.a(str3, str4, obj2, j2);
            }
        });
    }

    public void a(String str, String str2, Bundle bundle) {
        c();
        boolean z = this.b == null || dl.j(str2);
        a(str, str2, bundle, true, z, false, null);
    }

    public void a(String str, String str2, Object obj) {
        int i = 0;
        com.google.android.gms.common.internal.c.a(str);
        long a = m().a();
        int c = q().c(str2);
        String a2;
        if (c != 0) {
            a2 = q().a(str2, w().z(), true);
            if (str2 != null) {
                i = str2.length();
            }
            this.n.o().a(c, "_ev", a2, i);
        } else if (obj != null) {
            c = q().c(str2, obj);
            if (c != 0) {
                a2 = q().a(str2, w().z(), true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.n.o().a(c, "_ev", a2, i);
                return;
            }
            Object d = q().d(str2, obj);
            if (d != null) {
                a(str, str2, a, d);
            }
        } else {
            a(str, str2, a, null);
        }
    }

    public String b(String str) {
        b();
        return this.n.a(str);
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public String c(String str) {
        b();
        return this.n.b(str);
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

    @TargetApi(14)
    public void x() {
        if (n().getApplicationContext() instanceof Application) {
            Application application = (Application) n().getApplicationContext();
            if (this.a == null) {
                this.a = new a();
            }
            application.unregisterActivityLifecycleCallbacks(this.a);
            application.registerActivityLifecycleCallbacks(this.a);
            u().D().a("Registered activity lifecycle callback");
        }
    }

    public void y() {
        e();
        c();
        Q();
        if (this.n.b()) {
            k().z();
            String D = v().D();
            if (!TextUtils.isEmpty(D) && !D.equals(j().y())) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", D);
                a("auto", "_ou", bundle);
            }
        }
    }
}
