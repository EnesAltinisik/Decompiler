package com.google.android.gms.b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.b;
import com.google.android.gms.b.qz.a;
import java.util.List;

@vz
public class qk extends a implements qp.a {
    private String a;
    private List<qj> b;
    private String c;
    private qu d;
    private String e;
    private double f;
    private String g;
    private String h;
    private qh i;
    private Bundle j;
    private or k;
    private View l;
    private Object m = new Object();
    private qp n;

    public qk(String str, List list, String str2, qu quVar, String str3, double d, String str4, String str5, qh qhVar, Bundle bundle, or orVar, View view) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = quVar;
        this.e = str3;
        this.f = d;
        this.g = str4;
        this.h = str5;
        this.i = qhVar;
        this.j = bundle;
        this.k = orVar;
        this.l = view;
    }

    public String a() {
        return this.a;
    }

    public void a(qp qpVar) {
        synchronized (this.m) {
            this.n = qpVar;
        }
    }

    public List b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public qu d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public double f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public or i() {
        return this.k;
    }

    public com.google.android.gms.a.a j() {
        return b.a(this.n);
    }

    public String k() {
        return "2";
    }

    public String l() {
        return "";
    }

    public qh m() {
        return this.i;
    }

    public Bundle n() {
        return this.j;
    }

    public View o() {
        return this.l;
    }

    public void p() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0.0d;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.m = null;
        this.n = null;
        this.k = null;
        this.l = null;
    }
}
