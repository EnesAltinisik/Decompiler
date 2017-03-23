package com.google.android.gms.b;

import com.google.android.gms.b.vk.a;

@vz
public class vm extends zd {
    private final a a;
    private final wi b = this.c.b;
    private final yu.a c;

    public vm(yu.a aVar, a aVar2) {
        this.c = aVar;
        this.a = aVar2;
    }

    private yu a(int i) {
        return new yu(this.c.a.c, null, null, i, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null, null);
    }

    public void a() {
        final yu a = a(0);
        zi.a.post(new Runnable(this) {
            final /* synthetic */ vm b;

            public void run() {
                this.b.a.b(a);
            }
        });
    }

    public void b() {
    }
}
