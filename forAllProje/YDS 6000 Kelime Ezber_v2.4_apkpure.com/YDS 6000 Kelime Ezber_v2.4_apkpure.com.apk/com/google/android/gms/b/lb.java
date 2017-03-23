package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;

public class lb extends ly {
    private final StackTraceElement[] i;

    public lb(eq eqVar, String str, String str2, a aVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(eqVar, str, str2, aVar, i, i2);
        this.i = stackTraceElementArr;
    }

    protected void a() {
        if (this.i != null) {
            eo eoVar = new eo((String) this.f.invoke(null, new Object[]{this.i}));
            synchronized (this.e) {
                this.e.L = eoVar.a;
                if (eoVar.b.booleanValue()) {
                    this.e.V = Integer.valueOf(eoVar.c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
