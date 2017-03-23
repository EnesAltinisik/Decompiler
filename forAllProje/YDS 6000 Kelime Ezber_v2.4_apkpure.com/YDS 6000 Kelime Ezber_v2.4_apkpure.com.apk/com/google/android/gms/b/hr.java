package com.google.android.gms.b;

import com.google.android.gms.b.hu.a;

public class hr extends hu {
    private final boolean a;
    private final ig<Boolean> e;

    public hr(gx gxVar, ig<Boolean> igVar, boolean z) {
        super(a.AckUserWrite, hv.a, gxVar);
        this.e = igVar;
        this.a = z;
    }

    public hu a(je jeVar) {
        if (!this.d.h()) {
            kt.a(this.d.d().equals(jeVar), "operationForChild called for unrelated child.");
            return new hr(this.d.e(), this.e, this.a);
        } else if (this.e.b() != null) {
            kt.a(this.e.c().b(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new hr(gx.a(), this.e.c(new gx(jeVar)), this.a);
        }
    }

    public ig<Boolean> a() {
        return this.e;
    }

    public boolean b() {
        return this.a;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[]{c(), Boolean.valueOf(this.a), this.e});
    }
}
