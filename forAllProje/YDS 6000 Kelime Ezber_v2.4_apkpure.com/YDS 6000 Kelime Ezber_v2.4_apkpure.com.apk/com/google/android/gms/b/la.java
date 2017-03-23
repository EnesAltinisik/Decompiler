package com.google.android.gms.b;

import com.google.android.gms.b.aw.a;
import java.util.List;

public class la extends ly {
    private List<Long> i = null;

    public la(eq eqVar, String str, String str2, a aVar, int i, int i2) {
        super(eqVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        this.e.y = Long.valueOf(-1);
        this.e.z = Long.valueOf(-1);
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, new Object[]{this.b.a()});
        }
        if (this.i != null && this.i.size() == 2) {
            synchronized (this.e) {
                this.e.y = Long.valueOf(((Long) this.i.get(0)).longValue());
                this.e.z = Long.valueOf(((Long) this.i.get(1)).longValue());
            }
        }
    }
}
