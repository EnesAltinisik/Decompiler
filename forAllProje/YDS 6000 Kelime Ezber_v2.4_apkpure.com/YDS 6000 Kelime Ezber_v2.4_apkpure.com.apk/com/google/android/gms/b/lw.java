package com.google.android.gms.b;

import android.view.View;
import com.google.android.gms.b.aw.a;
import com.google.android.gms.b.aw.a.b;

public class lw extends ly {
    private final View i;

    public lw(eq eqVar, String str, String str2, a aVar, int i, int i2, View view) {
        super(eqVar, str, str2, aVar, i, i2);
        this.i = view;
    }

    protected void a() {
        if (this.i != null) {
            et etVar = new et((String) this.f.invoke(null, new Object[]{this.i}));
            synchronized (this.e) {
                this.e.Y = new b();
                this.e.Y.c = etVar.a;
            }
        }
    }
}
