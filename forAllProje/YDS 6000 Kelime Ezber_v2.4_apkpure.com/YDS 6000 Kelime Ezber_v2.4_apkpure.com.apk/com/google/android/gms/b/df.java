package com.google.android.gms.b;

import com.google.android.gms.common.util.c;

class df {
    private final c a;
    private long b;

    public df(c cVar) {
        com.google.android.gms.common.internal.c.a((Object) cVar);
        this.a = cVar;
    }

    public void a() {
        this.b = this.a.b();
    }

    public boolean a(long j) {
        return this.b == 0 || this.a.b() - this.b >= j;
    }

    public void b() {
        this.b = 0;
    }
}
