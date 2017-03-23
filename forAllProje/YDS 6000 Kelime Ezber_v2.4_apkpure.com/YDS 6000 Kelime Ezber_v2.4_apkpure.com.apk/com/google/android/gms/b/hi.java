package com.google.android.gms.b;

public class hi {
    private final long a;

    public hi(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a == ((hi) obj).a;
    }

    public int hashCode() {
        return (int) (this.a ^ (this.a >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.a + "}";
    }
}
