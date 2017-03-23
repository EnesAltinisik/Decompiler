package com.google.firebase.database;

import com.google.android.gms.b.jl;

public class a {
    private final jl a;
    private final d b;

    a(d dVar, jl jlVar) {
        this.a = jlVar;
        this.b = dVar;
    }

    public d a() {
        return this.b;
    }

    public Object a(boolean z) {
        return this.a.a().a(z);
    }

    public String b() {
        return this.b.b();
    }

    public String toString() {
        String valueOf = String.valueOf(this.b.b());
        String valueOf2 = String.valueOf(this.a.a().a(true));
        return new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("DataSnapshot { key = ").append(valueOf).append(", value = ").append(valueOf2).append(" }").toString();
    }
}
