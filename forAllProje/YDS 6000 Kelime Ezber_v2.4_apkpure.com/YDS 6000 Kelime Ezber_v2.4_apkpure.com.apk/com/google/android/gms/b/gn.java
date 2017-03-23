package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;
import java.io.IOException;

public class gn extends ly {
    public gn(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    private void c() {
        synchronized (this.e) {
            this.e.aa = (String) this.f.invoke(null, new Object[]{this.b.b()});
        }
    }

    private void d() {
        com.google.android.gms.ads.c.a o = this.b.o();
        if (o != null) {
            try {
                com.google.android.gms.ads.c.a.a b = o.b();
                String a = es.a(b.a());
                if (a != null) {
                    synchronized (this.e) {
                        this.e.aa = a;
                        this.e.ac = Boolean.valueOf(b.b());
                        this.e.ab = Integer.valueOf(5);
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    protected void a() {
        if (this.b.h()) {
            d();
        } else {
            c();
        }
    }
}
