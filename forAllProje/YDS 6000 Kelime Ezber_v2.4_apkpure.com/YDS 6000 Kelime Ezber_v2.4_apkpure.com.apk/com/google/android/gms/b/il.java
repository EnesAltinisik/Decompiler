package com.google.android.gms.b;

import com.google.firebase.database.b;

public class il implements ip {
    private final gx a;
    private final gs b;
    private final b c;

    public il(gs gsVar, b bVar, gx gxVar) {
        this.b = gsVar;
        this.a = gxVar;
        this.c = bVar;
    }

    public gx a() {
        return this.a;
    }

    public void b() {
        this.b.a(this.c);
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append(valueOf).append(":CANCEL").toString();
    }
}
