package com.google.android.gms.b;

public class iv {
    private final ik a;
    private final ik b;

    public iv(ik ikVar, ik ikVar2) {
        this.a = ikVar;
        this.b = ikVar2;
    }

    public ik a() {
        return this.a;
    }

    public iv a(jl jlVar, boolean z, boolean z2) {
        return new iv(new ik(jlVar, z, z2), this.b);
    }

    public iv b(jl jlVar, boolean z, boolean z2) {
        return new iv(this.a, new ik(jlVar, z, z2));
    }

    public jr b() {
        return this.a.a() ? this.a.c() : null;
    }

    public ik c() {
        return this.b;
    }

    public jr d() {
        return this.b.a() ? this.b.c() : null;
    }
}
