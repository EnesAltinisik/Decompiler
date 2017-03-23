package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement;

public class co extends cy {
    private final String a = w().a();
    private final char b;
    private final long c = w().Q();
    private final a d;
    private final a e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final a j;
    private final a k;
    private final a l;

    public class a {
        final /* synthetic */ co a;
        private final int b;
        private final boolean c;
        private final boolean d;

        a(co coVar, int i, boolean z, boolean z2) {
            this.a = coVar;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public void a(String str) {
            this.a.a(this.b, this.c, this.d, str, null, null, null);
        }

        public void a(String str, Object obj) {
            this.a.a(this.b, this.c, this.d, str, obj, null, null);
        }

        public void a(String str, Object obj, Object obj2) {
            this.a.a(this.b, this.c, this.d, str, obj, obj2, null);
        }

        public void a(String str, Object obj, Object obj2, Object obj3) {
            this.a.a(this.b, this.c, this.d, str, obj, obj2, obj3);
        }
    }

    private static class b {
        private final String a;

        public b(String str) {
            this.a = str;
        }
    }

    co(cv cvVar) {
        super(cvVar);
        if (w().S()) {
            w().R();
            this.b = 'C';
        } else {
            w().R();
            this.b = 'c';
        }
        this.d = new a(this, 6, false, false);
        this.e = new a(this, 6, true, false);
        this.f = new a(this, 6, false, true);
        this.g = new a(this, 5, false, false);
        this.h = new a(this, 5, true, false);
        this.i = new a(this, 5, false, true);
        this.j = new a(this, 4, false, false);
        this.k = new a(this, 3, false, false);
        this.l = new a(this, 2, false, false);
    }

    protected static Object a(String str) {
        return str == null ? null : new b(str);
    }

    static String a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        Object valueOf = obj instanceof Integer ? Long.valueOf((long) ((Integer) obj).intValue()) : obj;
        if (valueOf instanceof Long) {
            if (!z) {
                return String.valueOf(valueOf);
            }
            if (Math.abs(((Long) valueOf).longValue()) < 100) {
                return String.valueOf(valueOf);
            }
            String str = String.valueOf(valueOf).charAt(0) == '-' ? "-" : "";
            String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
            return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf2.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf2.length()) - 1.0d)).toString();
        } else if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        } else {
            if (!(valueOf instanceof Throwable)) {
                return valueOf instanceof b ? ((b) valueOf).a : z ? "-" : String.valueOf(valueOf);
            } else {
                Throwable th = (Throwable) valueOf;
                StringBuilder stringBuilder = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = b(AppMeasurement.class.getCanonicalName());
                String b2 = b(cv.class.getCanonicalName());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            className = b(className);
                            if (className.equals(b) || className.equals(b2)) {
                                stringBuilder.append(": ");
                                stringBuilder.append(stackTraceElement);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return stringBuilder.toString();
            }
        }
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object a = a(z, obj);
        Object a2 = a(z, obj2);
        Object a3 = a(z, obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str2);
            stringBuilder.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            stringBuilder.append(str2);
            stringBuilder.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            stringBuilder.append(str2);
            stringBuilder.append(a3);
        }
        return stringBuilder.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public a A() {
        return this.i;
    }

    public a B() {
        return this.j;
    }

    public a C() {
        return this.k;
    }

    public a D() {
        return this.l;
    }

    public String E() {
        Pair a = v().b.a();
        if (a == null || a == cr.a) {
            return null;
        }
        String valueOf = String.valueOf(String.valueOf(a.second));
        String str = (String) a.first;
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    protected void a() {
    }

    protected void a(int i, String str) {
        Log.println(i, this.a, str);
    }

    public void a(int i, String str, Object obj, Object obj2, Object obj3) {
        c.a((Object) str);
        cu k = this.n.k();
        if (k == null) {
            a(6, "Scheduler not set. Not logging error/warn");
        } else if (k.P()) {
            if (i < 0) {
                i = 0;
            }
            if (i >= "01VDIWEA?".length()) {
                i = "01VDIWEA?".length() - 1;
            }
            String valueOf = String.valueOf("2");
            char charAt = "01VDIWEA?".charAt(i);
            char c = this.b;
            long j = this.c;
            String valueOf2 = String.valueOf(a(true, str, obj, obj2, obj3));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append(valueOf).append(charAt).append(c).append(j).append(":").append(valueOf2).toString();
            if (valueOf.length() > 1024) {
                valueOf = str.substring(0, 1024);
            }
            k.a(new Runnable(this) {
                final /* synthetic */ co b;

                public void run() {
                    cr e = this.b.n.e();
                    if (e.P()) {
                        e.b.a(valueOf);
                    } else {
                        this.b.a(6, "Persisted config not initialized. Not logging error/warn");
                    }
                }
            });
        } else {
            a(6, "Scheduler not initialized. Not logging error/warn");
        }
    }

    protected void a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i)) {
            a(i, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            a(i, str, obj, obj2, obj3);
        }
    }

    protected boolean a(int i) {
        return Log.isLoggable(this.a, i);
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
        return this.d;
    }

    public a y() {
        return this.e;
    }

    public a z() {
        return this.g;
    }
}
