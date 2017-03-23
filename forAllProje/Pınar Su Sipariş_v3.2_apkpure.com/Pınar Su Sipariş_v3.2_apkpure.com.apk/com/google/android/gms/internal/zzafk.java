package com.google.android.gms.internal;

public class zzafk {
    private final long zzbNL;

    public zzafk(long j) {
        this.zzbNL = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzbNL == ((zzafk) obj).zzbNL;
    }

    public int hashCode() {
        return (int) (this.zzbNL ^ (this.zzbNL >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.zzbNL + "}";
    }

    public long zzRM() {
        return this.zzbNL;
    }
}
