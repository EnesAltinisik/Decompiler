package com.google.android.gms.b;

import android.view.View;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.b.qd.a;

@vz
public final class qb extends a {
    private final h a;
    private final String b;
    private final String c;

    public qb(h hVar, String str, String str2) {
        this.a = hVar;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public void a(com.google.android.gms.a.a aVar) {
        if (aVar != null) {
            this.a.b((View) b.a(aVar));
        }
    }

    public String b() {
        return this.c;
    }

    public void c() {
        this.a.J();
    }

    public void d() {
        this.a.K();
    }
}
