package com.google.android.gms.b;

public class hl {
    private final long a;
    private final gx b;
    private final jr c;
    private final go d;
    private final boolean e;

    public hl(long j, gx gxVar, go goVar) {
        this.a = j;
        this.b = gxVar;
        this.c = null;
        this.d = goVar;
        this.e = true;
    }

    public hl(long j, gx gxVar, jr jrVar, boolean z) {
        this.a = j;
        this.b = gxVar;
        this.c = jrVar;
        this.d = null;
        this.e = z;
    }

    public long a() {
        return this.a;
    }

    public gx b() {
        return this.b;
    }

    public jr c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public go d() {
        if (this.d != null) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public boolean e() {
        return this.c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hl hlVar = (hl) obj;
        if (this.a != hlVar.a) {
            return false;
        }
        if (!this.b.equals(hlVar.b)) {
            return false;
        }
        if (this.e != hlVar.e) {
            return false;
        }
        if (!this.c == null ? this.c.equals(hlVar.c) : hlVar.c == null) {
            return false;
        }
        if (this.d != null) {
            if (this.d.equals(hlVar.d)) {
                return true;
            }
        } else if (hlVar.d == null) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.c != null ? this.c.hashCode() : 0) + (((((Long.valueOf(this.a).hashCode() * 31) + Boolean.valueOf(this.e).hashCode()) * 31) + this.b.hashCode()) * 31)) * 31;
        if (this.d != null) {
            i = this.d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.e;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return new StringBuilder(((String.valueOf(valueOf).length() + 78) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("UserWriteRecord{id=").append(j).append(" path=").append(valueOf).append(" visible=").append(z).append(" overwrite=").append(valueOf2).append(" merge=").append(valueOf3).append("}").toString();
    }
}
