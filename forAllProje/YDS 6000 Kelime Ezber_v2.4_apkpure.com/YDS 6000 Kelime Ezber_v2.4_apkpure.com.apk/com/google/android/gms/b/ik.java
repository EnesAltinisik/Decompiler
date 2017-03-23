package com.google.android.gms.b;

public class ik {
    private final jl a;
    private final boolean b;
    private final boolean c;

    public ik(jl jlVar, boolean z, boolean z2) {
        this.a = jlVar;
        this.b = z;
        this.c = z2;
    }

    public boolean a() {
        return this.b;
    }

    public boolean a(gx gxVar) {
        return gxVar.h() ? a() && !this.c : a(gxVar.d());
    }

    public boolean a(je jeVar) {
        return (a() && !this.c) || this.a.a().a(jeVar);
    }

    public boolean b() {
        return this.c;
    }

    public jr c() {
        return this.a.a();
    }

    public jl d() {
        return this.a;
    }
}
