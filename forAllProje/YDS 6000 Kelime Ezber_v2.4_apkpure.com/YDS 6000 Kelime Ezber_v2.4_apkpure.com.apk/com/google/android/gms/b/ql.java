package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.a.b;
import com.google.android.gms.b.rb.a;
import java.util.List;

@vz
public class ql extends a implements qp.a {
    private String a;
    private List<qj> b;
    private String c;
    private qu d;
    private String e;
    private String f;
    private qh g;
    private Bundle h;
    private Object i = new Object();
    private qp j;

    public ql(String str, List list, String str2, qu quVar, String str3, String str4, qh qhVar, Bundle bundle) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = quVar;
        this.e = str3;
        this.f = str4;
        this.g = qhVar;
        this.h = bundle;
    }

    public String a() {
        return this.a;
    }

    public void a(qp qpVar) {
        synchronized (this.i) {
            this.j = qpVar;
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

    public String f() {
        return this.f;
    }

    public com.google.android.gms.a.a g() {
        return b.a(this.j);
    }

    public Bundle h() {
        return this.h;
    }

    public void i() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public String k() {
        return "1";
    }

    public String l() {
        return "";
    }

    public qh m() {
        return this.g;
    }
}
