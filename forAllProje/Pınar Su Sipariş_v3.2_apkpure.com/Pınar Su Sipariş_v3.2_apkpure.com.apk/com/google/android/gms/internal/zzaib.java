package com.google.android.gms.internal;

public class zzaib extends zzaho {
    private static final zzaib zzbRr = new zzaib();

    private zzaib() {
    }

    public static zzaib zzTN() {
        return zzbRr;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzaht) obj, (zzaht) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof zzaib;
    }

    public int hashCode() {
        return 4;
    }

    public String toString() {
        return "ValueIndex";
    }

    public zzaht zzTC() {
        return new zzaht(zzahi.zzTi(), zzahu.zzbRi);
    }

    public String zzTD() {
        return ".value";
    }

    public int zza(zzaht com_google_android_gms_internal_zzaht, zzaht com_google_android_gms_internal_zzaht2) {
        int compareTo = com_google_android_gms_internal_zzaht.zzPj().compareTo(com_google_android_gms_internal_zzaht2.zzPj());
        return compareTo == 0 ? com_google_android_gms_internal_zzaht.zzTK().zzi(com_google_android_gms_internal_zzaht2.zzTK()) : compareTo;
    }

    public zzaht zzg(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return new zzaht(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
    }

    public boolean zzl(zzahu com_google_android_gms_internal_zzahu) {
        return true;
    }
}
