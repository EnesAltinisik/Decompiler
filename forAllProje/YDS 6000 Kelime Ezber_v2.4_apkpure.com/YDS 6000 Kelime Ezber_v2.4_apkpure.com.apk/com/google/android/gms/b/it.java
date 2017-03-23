package com.google.android.gms.b;

import java.util.Map;

public class it {
    private final gx a;
    private final is b;

    public it(gx gxVar, is isVar) {
        this.a = gxVar;
        this.b = isVar;
    }

    public static it a(gx gxVar) {
        return new it(gxVar, is.a);
    }

    public static it a(gx gxVar, Map<String, Object> map) {
        return new it(gxVar, is.a((Map) map));
    }

    public gx a() {
        return this.a;
    }

    public is b() {
        return this.b;
    }

    public boolean c() {
        return this.b.g();
    }

    public boolean d() {
        return this.b.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        it itVar = (it) obj;
        return !this.a.equals(itVar.a) ? false : this.b.equals(itVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }
}
