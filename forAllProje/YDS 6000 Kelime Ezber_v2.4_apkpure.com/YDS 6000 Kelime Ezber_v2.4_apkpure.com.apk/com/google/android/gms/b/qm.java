package com.google.android.gms.b;

import android.support.v4.i.k;
import com.google.android.gms.b.rd.a;
import java.util.Arrays;
import java.util.List;

@vz
public class qm extends a implements qp.a {
    private final qh a;
    private final String b;
    private final k<String, qj> c;
    private final k<String, String> d;
    private final Object e = new Object();
    private qp f;

    public qm(String str, k<String, qj> kVar, k<String, String> kVar2, qh qhVar) {
        this.b = str;
        this.c = kVar;
        this.d = kVar2;
        this.a = qhVar;
    }

    public String a(String str) {
        return (String) this.d.get(str);
    }

    public List<String> a() {
        int i = 0;
        String[] strArr = new String[(this.c.size() + this.d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            strArr[i2] = (String) this.c.b(i3);
            i2++;
        }
        while (i < this.d.size()) {
            strArr[i2] = (String) this.d.b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public void a(qp qpVar) {
        synchronized (this.e) {
            this.f = qpVar;
        }
    }

    public qu b(String str) {
        return (qu) this.c.get(str);
    }

    public void b() {
        synchronized (this.e) {
            if (this.f == null) {
                zy.c("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.f.a(null, null);
        }
    }

    public void c(String str) {
        synchronized (this.e) {
            if (this.f == null) {
                zy.c("Attempt to call performClick before ad initialized.");
                return;
            }
            this.f.a(null, str, null, null, null);
        }
    }

    public String k() {
        return "3";
    }

    public String l() {
        return this.b;
    }

    public qh m() {
        return this.a;
    }
}
