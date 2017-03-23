package com.google.android.gms.b;

public abstract class hu {
    protected final a b;
    protected final hv c;
    protected final gx d;

    public enum a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    protected hu(a aVar, hv hvVar, gx gxVar) {
        this.b = aVar;
        this.c = hvVar;
        this.d = gxVar;
    }

    public abstract hu a(je jeVar);

    public gx c() {
        return this.d;
    }

    public hv d() {
        return this.c;
    }

    public a e() {
        return this.b;
    }
}
