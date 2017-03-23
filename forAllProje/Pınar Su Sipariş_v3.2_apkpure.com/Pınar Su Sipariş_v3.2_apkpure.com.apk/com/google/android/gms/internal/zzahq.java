package com.google.android.gms.internal;

public class zzahq extends zzaho {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahq.class.desiredAssertionStatus());
    private static final zzahq zzbQZ = new zzahq();

    private zzahq() {
    }

    public static zzahq zzTH() {
        return zzbQZ;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzaht) obj, (zzaht) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof zzahq;
    }

    public int hashCode() {
        return 37;
    }

    public String toString() {
        return "KeyIndex";
    }

    public zzaht zzTC() {
        return zzaht.zzTJ();
    }

    public String zzTD() {
        return ".key";
    }

    public int zza(zzaht com_google_android_gms_internal_zzaht, zzaht com_google_android_gms_internal_zzaht2) {
        return com_google_android_gms_internal_zzaht.zzTK().zzi(com_google_android_gms_internal_zzaht2.zzTK());
    }

    public zzaht zzg(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        if ($assertionsDisabled || (com_google_android_gms_internal_zzahu instanceof zzaia)) {
            return new zzaht(zzahi.zzig((String) com_google_android_gms_internal_zzahu.getValue()), zzahn.zzTA());
        }
        throw new AssertionError();
    }

    public boolean zzl(zzahu com_google_android_gms_internal_zzahu) {
        return true;
    }
}
