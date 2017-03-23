package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.common.internal.c;

class bu {
    private final cv a;
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
    private long u;
    private String v;
    private boolean w;
    private long x;
    private long y;

    bu(cv cvVar, String str) {
        c.a((Object) cvVar);
        c.a(str);
        this.a = cvVar;
        this.b = str;
        this.a.C();
    }

    public void a() {
        this.a.C();
        this.w = false;
    }

    public void a(long j) {
        this.a.C();
        this.w = (this.h != j ? 1 : 0) | this.w;
        this.h = j;
    }

    public void a(String str) {
        this.a.C();
        this.w = (!dl.c(this.c, str) ? 1 : 0) | this.w;
        this.c = str;
    }

    public void a(boolean z) {
        this.a.C();
        this.w = (this.o != z ? 1 : 0) | this.w;
        this.o = z;
    }

    public String b() {
        this.a.C();
        return this.b;
    }

    public void b(long j) {
        this.a.C();
        this.w = (this.i != j ? 1 : 0) | this.w;
        this.i = j;
    }

    public void b(String str) {
        this.a.C();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.w = (!dl.c(this.d, str) ? 1 : 0) | this.w;
        this.d = str;
    }

    public String c() {
        this.a.C();
        return this.c;
    }

    public void c(long j) {
        this.a.C();
        this.w = (this.k != j ? 1 : 0) | this.w;
        this.k = j;
    }

    public void c(String str) {
        this.a.C();
        this.w = (!dl.c(this.e, str) ? 1 : 0) | this.w;
        this.e = str;
    }

    public String d() {
        this.a.C();
        return this.d;
    }

    public void d(long j) {
        this.a.C();
        this.w = (this.m != j ? 1 : 0) | this.w;
        this.m = j;
    }

    public void d(String str) {
        this.a.C();
        this.w = (!dl.c(this.f, str) ? 1 : 0) | this.w;
        this.f = str;
    }

    public String e() {
        this.a.C();
        return this.e;
    }

    public void e(long j) {
        this.a.C();
        this.w = (this.n != j ? 1 : 0) | this.w;
        this.n = j;
    }

    public void e(String str) {
        this.a.C();
        this.w = (!dl.c(this.j, str) ? 1 : 0) | this.w;
        this.j = str;
    }

    public String f() {
        this.a.C();
        return this.f;
    }

    public void f(long j) {
        int i = 1;
        c.b(j >= 0);
        this.a.C();
        boolean z = this.w;
        if (this.g == j) {
            i = 0;
        }
        this.w = z | i;
        this.g = j;
    }

    public void f(String str) {
        this.a.C();
        this.w = (!dl.c(this.l, str) ? 1 : 0) | this.w;
        this.l = str;
    }

    public long g() {
        this.a.C();
        return this.h;
    }

    public void g(long j) {
        this.a.C();
        this.w = (this.x != j ? 1 : 0) | this.w;
        this.x = j;
    }

    public void g(String str) {
        this.a.C();
        this.w = (!dl.c(this.v, str) ? 1 : 0) | this.w;
        this.v = str;
    }

    public long h() {
        this.a.C();
        return this.i;
    }

    public void h(long j) {
        this.a.C();
        this.w = (this.y != j ? 1 : 0) | this.w;
        this.y = j;
    }

    public String i() {
        this.a.C();
        return this.j;
    }

    public void i(long j) {
        this.a.C();
        this.w = (this.p != j ? 1 : 0) | this.w;
        this.p = j;
    }

    public long j() {
        this.a.C();
        return this.k;
    }

    public void j(long j) {
        this.a.C();
        this.w = (this.q != j ? 1 : 0) | this.w;
        this.q = j;
    }

    public String k() {
        this.a.C();
        return this.l;
    }

    public void k(long j) {
        this.a.C();
        this.w = (this.r != j ? 1 : 0) | this.w;
        this.r = j;
    }

    public long l() {
        this.a.C();
        return this.m;
    }

    public void l(long j) {
        this.a.C();
        this.w = (this.s != j ? 1 : 0) | this.w;
        this.s = j;
    }

    public long m() {
        this.a.C();
        return this.n;
    }

    public void m(long j) {
        this.a.C();
        this.w = (this.u != j ? 1 : 0) | this.w;
        this.u = j;
    }

    public void n(long j) {
        this.a.C();
        this.w = (this.t != j ? 1 : 0) | this.w;
        this.t = j;
    }

    public boolean n() {
        this.a.C();
        return this.o;
    }

    public long o() {
        this.a.C();
        return this.g;
    }

    public long p() {
        this.a.C();
        return this.x;
    }

    public long q() {
        this.a.C();
        return this.y;
    }

    public void r() {
        this.a.C();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.f().z().a("Bundle index overflow. appId", co.a(this.b));
            j = 0;
        }
        this.w = true;
        this.g = j;
    }

    public long s() {
        this.a.C();
        return this.p;
    }

    public long t() {
        this.a.C();
        return this.q;
    }

    public long u() {
        this.a.C();
        return this.r;
    }

    public long v() {
        this.a.C();
        return this.s;
    }

    public long w() {
        this.a.C();
        return this.u;
    }

    public long x() {
        this.a.C();
        return this.t;
    }

    public String y() {
        this.a.C();
        return this.v;
    }

    public String z() {
        this.a.C();
        String str = this.v;
        g(null);
        return str;
    }
}
