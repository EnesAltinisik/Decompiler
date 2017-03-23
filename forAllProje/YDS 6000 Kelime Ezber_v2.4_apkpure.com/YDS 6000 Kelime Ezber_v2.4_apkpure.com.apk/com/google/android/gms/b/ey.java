package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;

public class ey extends ly {
    public ey(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        this.e.e = Long.valueOf(-1);
        this.e.f = Long.valueOf(-1);
        int[] iArr = (int[]) this.f.invoke(null, new Object[]{this.b.a()});
        synchronized (this.e) {
            this.e.e = Long.valueOf((long) iArr[0]);
            this.e.f = Long.valueOf((long) iArr[1]);
        }
    }
}
