package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.b.a.a;
import java.util.List;

public abstract class j extends i {
    private String d;
    private List<a> e;
    private String f;
    private a g;
    private String h;
    private double i;
    private String j;
    private String k;
    private com.google.android.gms.ads.j l;

    public final void a(double d) {
        this.i = d;
    }

    public final void a(a aVar) {
        this.g = aVar;
    }

    public final void a(com.google.android.gms.ads.j jVar) {
        this.l = jVar;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(List<a> list) {
        this.e = list;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final String e() {
        return this.d;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final List<a> f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final a h() {
        return this.g;
    }

    public final String i() {
        return this.h;
    }

    public final double j() {
        return this.i;
    }

    public final String k() {
        return this.j;
    }

    public final String l() {
        return this.k;
    }

    public final com.google.android.gms.ads.j m() {
        return this.l;
    }
}
