package com.google.android.gms.b;

public class ie {
    public final long a;
    public final it b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public ie(long j, it itVar, long j2, boolean z, boolean z2) {
        this.a = j;
        if (!itVar.d() || itVar.c()) {
            this.b = itVar;
            this.c = j2;
            this.d = z;
            this.e = z2;
            return;
        }
        throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }

    public ie a() {
        return new ie(this.a, this.b, this.c, true, this.e);
    }

    public ie a(long j) {
        return new ie(this.a, this.b, j, this.d, this.e);
    }

    public ie a(boolean z) {
        return new ie(this.a, this.b, this.c, this.d, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ie ieVar = (ie) obj;
        return this.a == ieVar.a && this.b.equals(ieVar.b) && this.c == ieVar.c && this.d == ieVar.d && this.e == ieVar.e;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.a).hashCode() * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode()) * 31) + Boolean.valueOf(this.d).hashCode()) * 31) + Boolean.valueOf(this.e).hashCode();
    }

    public String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        long j2 = this.c;
        boolean z = this.d;
        return new StringBuilder(String.valueOf(valueOf).length() + 109).append("TrackedQuery{id=").append(j).append(", querySpec=").append(valueOf).append(", lastUse=").append(j2).append(", complete=").append(z).append(", active=").append(this.e).append("}").toString();
    }
}
