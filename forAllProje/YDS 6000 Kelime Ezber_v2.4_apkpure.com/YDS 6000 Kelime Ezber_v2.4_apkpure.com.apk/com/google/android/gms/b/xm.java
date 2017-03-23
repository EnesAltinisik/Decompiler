package com.google.android.gms.b;

import com.google.android.gms.b.xp.a;
import com.google.android.gms.common.internal.b;

@vz
public class xm extends a {
    private final String a;
    private final int b;

    public xm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof xm)) {
            return false;
        }
        xm xmVar = (xm) obj;
        return b.a(a(), xmVar.a()) && b.a(Integer.valueOf(b()), Integer.valueOf(xmVar.b()));
    }
}
