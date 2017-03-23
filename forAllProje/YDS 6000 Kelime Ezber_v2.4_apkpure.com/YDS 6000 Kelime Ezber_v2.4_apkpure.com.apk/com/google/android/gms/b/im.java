package com.google.android.gms.b;

import com.google.android.gms.b.ip.a;

public class im {
    private final a a;
    private final jl b;
    private final jl c;
    private final je d;
    private final je e;

    private im(a aVar, jl jlVar, je jeVar, je jeVar2, jl jlVar2) {
        this.a = aVar;
        this.b = jlVar;
        this.d = jeVar;
        this.e = jeVar2;
        this.c = jlVar2;
    }

    public static im a(je jeVar, jl jlVar) {
        return new im(a.CHILD_MOVED, jlVar, jeVar, null, null);
    }

    public static im a(jl jlVar) {
        return new im(a.VALUE, jlVar, null, null, null);
    }

    public im a(je jeVar) {
        return new im(this.a, this.b, this.d, jeVar, this.c);
    }

    public je a() {
        return this.d;
    }

    public a b() {
        return this.a;
    }

    public jl c() {
        return this.b;
    }

    public jl d() {
        return this.c;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("Change: ").append(valueOf).append(" ").append(valueOf2).toString();
    }
}
