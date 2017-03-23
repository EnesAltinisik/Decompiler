package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;

public class jm extends ly {
    private long i = -1;

    public jm(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        this.e.l = Long.valueOf(-1);
        if (this.i == -1) {
            this.i = (long) ((Integer) this.f.invoke(null, new Object[]{this.b.a()})).intValue();
        }
        synchronized (this.e) {
            this.e.l = Long.valueOf(this.i);
        }
    }
}
