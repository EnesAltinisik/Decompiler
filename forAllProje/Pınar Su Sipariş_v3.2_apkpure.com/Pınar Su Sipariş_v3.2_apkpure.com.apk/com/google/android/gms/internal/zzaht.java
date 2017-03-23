package com.google.android.gms.internal;

public class zzaht {
    private static final zzaht zzbRg = new zzaht(zzahi.zzTh(), zzahn.zzTA());
    private static final zzaht zzbRh = new zzaht(zzahi.zzTi(), zzahu.zzbRi);
    private final zzahi zzbPi;
    private final zzahu zzbQX;

    public zzaht(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        this.zzbPi = com_google_android_gms_internal_zzahi;
        this.zzbQX = com_google_android_gms_internal_zzahu;
    }

    public static zzaht zzTI() {
        return zzbRg;
    }

    public static zzaht zzTJ() {
        return zzbRh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzaht com_google_android_gms_internal_zzaht = (zzaht) obj;
        return !this.zzbPi.equals(com_google_android_gms_internal_zzaht.zzbPi) ? false : this.zzbQX.equals(com_google_android_gms_internal_zzaht.zzbQX);
    }

    public int hashCode() {
        return (this.zzbPi.hashCode() * 31) + this.zzbQX.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbPi);
        String valueOf2 = String.valueOf(this.zzbQX);
        return new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("NamedNode{name=").append(valueOf).append(", node=").append(valueOf2).append("}").toString();
    }

    public zzahu zzPj() {
        return this.zzbQX;
    }

    public zzahi zzTK() {
        return this.zzbPi;
    }
}
