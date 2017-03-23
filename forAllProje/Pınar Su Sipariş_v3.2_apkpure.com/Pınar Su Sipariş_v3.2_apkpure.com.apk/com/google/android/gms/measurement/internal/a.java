package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;

class a {
    private final zzx a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private boolean u;
    private long v;
    private long w;

    a(zzx com_google_android_gms_measurement_internal_zzx, String str) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzx);
        zzaa.zzdl(str);
        this.a = com_google_android_gms_measurement_internal_zzx;
        this.b = str;
        this.a.zzkN();
    }

    public void a() {
        this.a.zzkN();
        this.u = false;
    }

    public void a(long j) {
        this.a.zzkN();
        this.u = (this.h != j ? 1 : 0) | this.u;
        this.h = j;
    }

    public void a(String str) {
        this.a.zzkN();
        this.u = (!zzal.zzZ(this.c, str) ? 1 : 0) | this.u;
        this.c = str;
    }

    public void a(boolean z) {
        this.a.zzkN();
        this.u = (this.o != z ? 1 : 0) | this.u;
        this.o = z;
    }

    public String b() {
        this.a.zzkN();
        return this.b;
    }

    public void b(long j) {
        this.a.zzkN();
        this.u = (this.i != j ? 1 : 0) | this.u;
        this.i = j;
    }

    public void b(String str) {
        this.a.zzkN();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.u = (!zzal.zzZ(this.d, str) ? 1 : 0) | this.u;
        this.d = str;
    }

    public String c() {
        this.a.zzkN();
        return this.c;
    }

    public void c(long j) {
        this.a.zzkN();
        this.u = (this.k != j ? 1 : 0) | this.u;
        this.k = j;
    }

    public void c(String str) {
        this.a.zzkN();
        this.u = (!zzal.zzZ(this.e, str) ? 1 : 0) | this.u;
        this.e = str;
    }

    public String d() {
        this.a.zzkN();
        return this.d;
    }

    public void d(long j) {
        this.a.zzkN();
        this.u = (this.m != j ? 1 : 0) | this.u;
        this.m = j;
    }

    public void d(String str) {
        this.a.zzkN();
        this.u = (!zzal.zzZ(this.f, str) ? 1 : 0) | this.u;
        this.f = str;
    }

    public String e() {
        this.a.zzkN();
        return this.e;
    }

    public void e(long j) {
        this.a.zzkN();
        this.u = (this.n != j ? 1 : 0) | this.u;
        this.n = j;
    }

    public void e(String str) {
        this.a.zzkN();
        this.u = (!zzal.zzZ(this.j, str) ? 1 : 0) | this.u;
        this.j = str;
    }

    public String f() {
        this.a.zzkN();
        return this.f;
    }

    public void f(long j) {
        int i = 1;
        zzaa.zzaj(j >= 0);
        this.a.zzkN();
        boolean z = this.u;
        if (this.g == j) {
            i = 0;
        }
        this.u = z | i;
        this.g = j;
    }

    public void f(String str) {
        this.a.zzkN();
        this.u = (!zzal.zzZ(this.l, str) ? 1 : 0) | this.u;
        this.l = str;
    }

    public long g() {
        this.a.zzkN();
        return this.h;
    }

    public void g(long j) {
        this.a.zzkN();
        this.u = (this.v != j ? 1 : 0) | this.u;
        this.v = j;
    }

    public long h() {
        this.a.zzkN();
        return this.i;
    }

    public void h(long j) {
        this.a.zzkN();
        this.u = (this.w != j ? 1 : 0) | this.u;
        this.w = j;
    }

    public String i() {
        this.a.zzkN();
        return this.j;
    }

    public void i(long j) {
        this.a.zzkN();
        this.u = (this.p != j ? 1 : 0) | this.u;
        this.p = j;
    }

    public long j() {
        this.a.zzkN();
        return this.k;
    }

    public void j(long j) {
        this.a.zzkN();
        this.u = (this.q != j ? 1 : 0) | this.u;
        this.q = j;
    }

    public String k() {
        this.a.zzkN();
        return this.l;
    }

    public void k(long j) {
        this.a.zzkN();
        this.u = (this.r != j ? 1 : 0) | this.u;
        this.r = j;
    }

    public long l() {
        this.a.zzkN();
        return this.m;
    }

    public void l(long j) {
        this.a.zzkN();
        this.u = (this.s != j ? 1 : 0) | this.u;
        this.s = j;
    }

    public long m() {
        this.a.zzkN();
        return this.n;
    }

    public void m(long j) {
        this.a.zzkN();
        this.u = (this.t != j ? 1 : 0) | this.u;
        this.t = j;
    }

    public boolean n() {
        this.a.zzkN();
        return this.o;
    }

    public long o() {
        this.a.zzkN();
        return this.g;
    }

    public long p() {
        this.a.zzkN();
        return this.v;
    }

    public long q() {
        this.a.zzkN();
        return this.w;
    }

    public void r() {
        this.a.zzkN();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.zzFm().zzFG().log("Bundle index overflow");
            j = 0;
        }
        this.u = true;
        this.g = j;
    }

    public long s() {
        this.a.zzkN();
        return this.p;
    }

    public long t() {
        this.a.zzkN();
        return this.q;
    }

    public long u() {
        this.a.zzkN();
        return this.r;
    }

    public long v() {
        this.a.zzkN();
        return this.s;
    }

    public long w() {
        this.a.zzkN();
        return this.t;
    }
}
