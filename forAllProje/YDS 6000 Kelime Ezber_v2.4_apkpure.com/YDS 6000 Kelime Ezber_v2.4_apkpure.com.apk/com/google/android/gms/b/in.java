package com.google.android.gms.b;

import com.google.android.gms.b.ip.a;

public class in implements ip {
    private final a a;
    private final gs b;
    private final com.google.firebase.database.a c;
    private final String d;

    public in(a aVar, gs gsVar, com.google.firebase.database.a aVar2, String str) {
        this.a = aVar;
        this.b = gsVar;
        this.c = aVar2;
        this.d = str;
    }

    public gx a() {
        gx c = this.c.a().c();
        return this.a == a.VALUE ? c : c.f();
    }

    public void b() {
        this.b.a(this);
    }

    public com.google.firebase.database.a c() {
        return this.c;
    }

    public String toString() {
        if (this.a == a.VALUE) {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(this.a);
            String valueOf3 = String.valueOf(this.c.a(true));
            return new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(": ").append(valueOf2).append(": ").append(valueOf3).toString();
        }
        valueOf = String.valueOf(a());
        valueOf2 = String.valueOf(this.a);
        valueOf3 = String.valueOf(this.c.b());
        String valueOf4 = String.valueOf(this.c.a(true));
        return new StringBuilder((((String.valueOf(valueOf).length() + 10) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(": ").append(valueOf2).append(": { ").append(valueOf3).append(": ").append(valueOf4).append(" }").toString();
    }
}
