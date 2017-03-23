package com.google.android.gms.internal;

public class zzahx extends zzaho {
    private static final zzahx zzbRn = new zzahx();

    private zzahx() {
    }

    public static zzahx zzTL() {
        return zzbRn;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzaht) obj, (zzaht) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof zzahx;
    }

    public int hashCode() {
        return 3155577;
    }

    public String toString() {
        return "PriorityIndex";
    }

    public zzaht zzTC() {
        return zzg(zzahi.zzTi(), zzahu.zzbRi);
    }

    public String zzTD() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    public int zza(zzaht com_google_android_gms_internal_zzaht, zzaht com_google_android_gms_internal_zzaht2) {
        return zzahv.zza(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj().zzTp(), com_google_android_gms_internal_zzaht2.zzTK(), com_google_android_gms_internal_zzaht2.zzPj().zzTp());
    }

    public zzaht zzg(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return new zzaht(com_google_android_gms_internal_zzahi, new zzaia("[PRIORITY-POST]", com_google_android_gms_internal_zzahu));
    }

    public boolean zzl(zzahu com_google_android_gms_internal_zzahu) {
        return !com_google_android_gms_internal_zzahu.zzTp().isEmpty();
    }
}
