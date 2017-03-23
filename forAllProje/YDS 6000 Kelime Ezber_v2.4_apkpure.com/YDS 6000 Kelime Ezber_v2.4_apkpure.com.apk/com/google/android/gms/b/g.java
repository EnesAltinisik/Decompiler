package com.google.android.gms.b;

import com.google.android.gms.common.util.a;

public class g extends acf {
    private final a<acb<?>> e;
    private p f;

    public void a() {
        super.a();
        if (!this.e.isEmpty()) {
            this.f.a(this);
        }
    }

    protected void a(com.google.android.gms.common.a aVar, int i) {
        this.f.b(aVar, i);
    }

    public void b() {
        super.b();
        this.f.b(this);
    }

    protected void c() {
        this.f.c();
    }

    a<acb<?>> d() {
        return this.e;
    }
}
