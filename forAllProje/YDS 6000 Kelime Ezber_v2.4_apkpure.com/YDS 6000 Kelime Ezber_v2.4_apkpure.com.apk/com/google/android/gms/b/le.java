package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;

public class le extends ly {
    private static volatile Long i = null;
    private static final Object j = new Object();

    public le(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.A = i;
        }
    }
}
