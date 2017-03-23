package com.google.android.gms.b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class tv<T> implements Comparable<tv<T>> {
    private final a a;
    private final int b;
    private final String c;
    private final int d;
    private final com.google.android.gms.b.vx.a e;
    private Integer f;
    private uw g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private xy l;
    private com.google.android.gms.b.en.a m;

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public tv(int i, String str, com.google.android.gms.b.vx.a aVar) {
        this.a = a.a ? new a() : null;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.m = null;
        this.b = i;
        this.c = str;
        this.e = aVar;
        a(new mt());
        this.d = a(str);
    }

    private static int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    return host.hashCode();
                }
            }
        }
        return 0;
    }

    public int a() {
        return this.b;
    }

    public int a(tv<T> tvVar) {
        a m = m();
        a m2 = tvVar.m();
        return m == m2 ? this.f.intValue() - tvVar.f.intValue() : m2.ordinal() - m.ordinal();
    }

    protected abb a(abb com_google_android_gms_b_abb) {
        return com_google_android_gms_b_abb;
    }

    public final tv<?> a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public tv<?> a(com.google.android.gms.b.en.a aVar) {
        this.m = aVar;
        return this;
    }

    public tv<?> a(uw uwVar) {
        this.g = uwVar;
        return this;
    }

    public tv<?> a(xy xyVar) {
        this.l = xyVar;
        return this;
    }

    protected abstract vx<T> a(rt rtVar);

    protected abstract void a(T t);

    public int b() {
        return this.d;
    }

    public void b(abb com_google_android_gms_b_abb) {
        if (this.e != null) {
            this.e.a(com_google_android_gms_b_abb);
        }
    }

    public void b(String str) {
        if (a.a) {
            this.a.a(str, Thread.currentThread().getId());
        } else if (this.k == 0) {
            this.k = SystemClock.elapsedRealtime();
        }
    }

    public String c() {
        return this.c;
    }

    void c(final String str) {
        if (this.g != null) {
            this.g.b(this);
        }
        if (a.a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ tv c;

                    public void run() {
                        this.c.a.a(str, id);
                        this.c.a.a(toString());
                    }
                });
                return;
            }
            this.a.a(str, id);
            this.a.a(toString());
            return;
        }
        if (SystemClock.elapsedRealtime() - this.k >= 3000) {
            abg.b("%d ms: %s", Long.valueOf(SystemClock.elapsedRealtime() - this.k), toString());
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((tv) obj);
    }

    public String d() {
        return c();
    }

    public com.google.android.gms.b.en.a e() {
        return this.m;
    }

    public Map<String, String> f() {
        return Collections.emptyMap();
    }

    @Deprecated
    public String g() {
        return j();
    }

    @Deprecated
    public byte[] h() {
        return null;
    }

    protected String i() {
        return "UTF-8";
    }

    public String j() {
        String str = "application/x-www-form-urlencoded; charset=";
        String valueOf = String.valueOf(i());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public byte[] k() {
        return null;
    }

    public final boolean l() {
        return this.h;
    }

    public a m() {
        return a.NORMAL;
    }

    public final int n() {
        return this.l.a();
    }

    public xy o() {
        return this.l;
    }

    public void p() {
        this.j = true;
    }

    public boolean q() {
        return this.j;
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(b()));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = "[ ] ";
        String valueOf2 = String.valueOf(c());
        String valueOf3 = String.valueOf(m());
        String valueOf4 = String.valueOf(this.f);
        return new StringBuilder(((((String.valueOf(str).length() + 3) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(str).append(valueOf2).append(" ").append(valueOf).append(" ").append(valueOf3).append(" ").append(valueOf4).toString();
    }
}
