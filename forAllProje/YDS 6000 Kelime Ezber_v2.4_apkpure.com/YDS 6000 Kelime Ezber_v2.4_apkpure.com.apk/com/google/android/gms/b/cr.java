package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;

class cr extends cy {
    static final Pair<String, Long> a = new Pair("", Long.valueOf(0));
    public final c b = new c("health_monitor", w().aa());
    public final b c = new b(this, "last_upload", 0);
    public final b d = new b(this, "last_upload_attempt", 0);
    public final b e = new b(this, "backoff", 0);
    public final b f = new b(this, "last_delete_stale", 0);
    public final b g = new b(this, "midnight_offset", 0);
    public final b h = new b(this, "time_before_start", 10000);
    public final b i = new b(this, "session_timeout", 1800000);
    public final a j = new a(this, "start_new_session", true);
    public final b k = new b(this, "last_pause_time", 0);
    public final b l = new b(this, "time_active", 0);
    public boolean m;
    private SharedPreferences o;
    private String p;
    private boolean q;
    private long r;
    private SecureRandom s;

    public final class a {
        final /* synthetic */ cr a;
        private final String b;
        private final boolean c;
        private boolean d;
        private boolean e;

        public a(cr crVar, String str, boolean z) {
            this.a = crVar;
            com.google.android.gms.common.internal.c.a(str);
            this.b = str;
            this.c = z;
        }

        private void b() {
            if (!this.d) {
                this.d = true;
                this.e = this.a.o.getBoolean(this.b, this.c);
            }
        }

        public void a(boolean z) {
            Editor edit = this.a.o.edit();
            edit.putBoolean(this.b, z);
            edit.apply();
            this.e = z;
        }

        public boolean a() {
            b();
            return this.e;
        }
    }

    public final class b {
        final /* synthetic */ cr a;
        private final String b;
        private final long c;
        private boolean d;
        private long e;

        public b(cr crVar, String str, long j) {
            this.a = crVar;
            com.google.android.gms.common.internal.c.a(str);
            this.b = str;
            this.c = j;
        }

        private void b() {
            if (!this.d) {
                this.d = true;
                this.e = this.a.o.getLong(this.b, this.c);
            }
        }

        public long a() {
            b();
            return this.e;
        }

        public void a(long j) {
            Editor edit = this.a.o.edit();
            edit.putLong(this.b, j);
            edit.apply();
            this.e = j;
        }
    }

    public final class c {
        final String a;
        final /* synthetic */ cr b;
        private final String c;
        private final String d;
        private final long e;

        private c(cr crVar, String str, long j) {
            this.b = crVar;
            com.google.android.gms.common.internal.c.a(str);
            com.google.android.gms.common.internal.c.b(j > 0);
            this.a = String.valueOf(str).concat(":start");
            this.c = String.valueOf(str).concat(":count");
            this.d = String.valueOf(str).concat(":value");
            this.e = j;
        }

        private void b() {
            this.b.e();
            long a = this.b.m().a();
            Editor edit = this.b.o.edit();
            edit.remove(this.c);
            edit.remove(this.d);
            edit.putLong(this.a, a);
            edit.apply();
        }

        private long c() {
            this.b.e();
            long d = d();
            if (d != 0) {
                return Math.abs(d - this.b.m().a());
            }
            b();
            return 0;
        }

        private long d() {
            return this.b.F().getLong(this.a, 0);
        }

        public Pair<String, Long> a() {
            this.b.e();
            long c = c();
            if (c < this.e) {
                return null;
            }
            if (c > this.e * 2) {
                b();
                return null;
            }
            String string = this.b.F().getString(this.d, null);
            c = this.b.F().getLong(this.c, 0);
            b();
            return (string == null || c <= 0) ? cr.a : new Pair(string, Long.valueOf(c));
        }

        public void a(String str) {
            a(str, 1);
        }

        public void a(String str, long j) {
            this.b.e();
            if (d() == 0) {
                b();
            }
            if (str == null) {
                str = "";
            }
            long j2 = this.b.o.getLong(this.c, 0);
            if (j2 <= 0) {
                Editor edit = this.b.o.edit();
                edit.putString(this.d, str);
                edit.putLong(this.c, j);
                edit.apply();
                return;
            }
            Object obj = (this.b.E().nextLong() & Long.MAX_VALUE) < (Long.MAX_VALUE / (j2 + j)) * j ? 1 : null;
            Editor edit2 = this.b.o.edit();
            if (obj != null) {
                edit2.putString(this.d, str);
            }
            edit2.putLong(this.c, j2 + j);
            edit2.apply();
        }
    }

    cr(cv cvVar) {
        super(cvVar);
    }

    private SecureRandom E() {
        e();
        if (this.s == null) {
            this.s = new SecureRandom();
        }
        return this.s;
    }

    private SharedPreferences F() {
        e();
        Q();
        return this.o;
    }

    String A() {
        e();
        return F().getString("gmp_app_id", null);
    }

    Boolean B() {
        e();
        return !F().contains("use_service") ? null : Boolean.valueOf(F().getBoolean("use_service", false));
    }

    void C() {
        boolean z = true;
        e();
        u().D().a("Clearing collection preferences.");
        boolean contains = F().contains("measurement_enabled");
        if (contains) {
            z = c(true);
        }
        Editor edit = F().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            b(z);
        }
    }

    protected String D() {
        e();
        String string = F().getString("previous_os_version", null);
        String y = j().y();
        if (!(TextUtils.isEmpty(y) || y.equals(string))) {
            Editor edit = F().edit();
            edit.putString("previous_os_version", y);
            edit.apply();
        }
        return string;
    }

    Pair<String, Boolean> a(String str) {
        e();
        long b = m().b();
        if (this.p != null && b < this.r) {
            return new Pair(this.p, Boolean.valueOf(this.q));
        }
        this.r = b + w().d(str);
        com.google.android.gms.ads.c.a.b(true);
        try {
            com.google.android.gms.ads.c.a.a b2 = com.google.android.gms.ads.c.a.b(n());
            this.p = b2.a();
            if (this.p == null) {
                this.p = "";
            }
            this.q = b2.b();
        } catch (Throwable th) {
            u().C().a("Unable to get advertising id", th);
            this.p = "";
        }
        com.google.android.gms.ads.c.a.b(false);
        return new Pair(this.p, Boolean.valueOf(this.q));
    }

    protected void a() {
        this.o = n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.m = this.o.getBoolean("has_been_opened", false);
        if (!this.m) {
            Editor edit = this.o.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }

    void a(boolean z) {
        e();
        u().D().a("Setting useService", Boolean.valueOf(z));
        Editor edit = F().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    String b(String str) {
        e();
        String str2 = (String) a(str).first;
        if (dl.h("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, dl.h("MD5").digest(str2.getBytes()))});
    }

    void b(boolean z) {
        e();
        u().D().a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = F().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    void c(String str) {
        e();
        Editor edit = F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    boolean c(boolean z) {
        e();
        return F().getBoolean("measurement_enabled", z);
    }

    String x() {
        E().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    String y() {
        e();
        try {
            return com.google.firebase.iid.c.a().b();
        } catch (IllegalStateException e) {
            u().z().a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    long z() {
        Q();
        e();
        long a = this.g.a();
        if (a != 0) {
            return a;
        }
        a = (long) (E().nextInt(86400000) + 1);
        this.g.a(a);
        return a;
    }
}
