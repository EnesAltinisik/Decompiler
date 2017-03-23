package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;

public class lc extends ly {
    public lc(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        synchronized (this.e) {
            ep epVar = new ep((String) this.f.invoke(null, new Object[0]));
            this.e.Q = epVar.a;
            this.e.R = epVar.b;
        }
    }
}
