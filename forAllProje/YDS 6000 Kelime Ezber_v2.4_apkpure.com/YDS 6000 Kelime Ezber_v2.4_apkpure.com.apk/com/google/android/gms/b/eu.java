package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;

public class eu extends ly {
    public eu(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        synchronized (this.e) {
            this.e.c = Long.valueOf(-1);
            this.e.c = (Long) this.f.invoke(null, new Object[]{this.b.a()});
        }
    }
}
