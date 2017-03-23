package com.google.firebase.database;

import com.google.android.gms.b.gx;
import com.google.android.gms.b.he;
import com.google.android.gms.b.hm;
import com.google.android.gms.b.je;
import com.google.android.gms.b.jr;

public class h {
    private final he a;
    private final gx b;

    private h(he heVar, gx gxVar) {
        this.a = heVar;
        this.b = gxVar;
        hm.a(this.b, b());
    }

    h(jr jrVar) {
        this(new he(jrVar), new gx(""));
    }

    jr a() {
        return this.a.a(this.b);
    }

    public Object b() {
        return a().a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.a.equals(((h) obj).a) && this.b.equals(((h) obj).b);
    }

    public String toString() {
        je d = this.b.d();
        String d2 = d != null ? d.d() : "<none>";
        String valueOf = String.valueOf(this.a.a().a(true));
        return new StringBuilder((String.valueOf(d2).length() + 32) + String.valueOf(valueOf).length()).append("MutableData { key = ").append(d2).append(", value = ").append(valueOf).append(" }").toString();
    }
}
