package com.google.android.gms.b;

public class kr<T, U> {
    private final T a;
    private final U b;

    public kr(T t, U u) {
        this.a = t;
        this.b = u;
    }

    public T a() {
        return this.a;
    }

    public U b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kr krVar = (kr) obj;
        if (this.a == null ? krVar.a != null : !this.a.equals(krVar.a)) {
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(krVar.b)) {
                return true;
            }
        } else if (krVar.b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.a != null ? this.a.hashCode() : 0) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(valueOf2).length()).append("Pair(").append(valueOf).append(",").append(valueOf2).append(")").toString();
    }
}
