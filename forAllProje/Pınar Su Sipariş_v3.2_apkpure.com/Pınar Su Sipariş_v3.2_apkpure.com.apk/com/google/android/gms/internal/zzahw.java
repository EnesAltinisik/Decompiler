package com.google.android.gms.internal;

public class zzahw extends zzaho {
    private final zzafa zzbRm;

    public zzahw(zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafa.size() == 1 && com_google_android_gms_internal_zzafa.zzRt().zzTl()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.zzbRm = com_google_android_gms_internal_zzafa;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzaht) obj, (zzaht) obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzbRm.equals(((zzahw) obj).zzbRm);
    }

    public int hashCode() {
        return this.zzbRm.hashCode();
    }

    public zzaht zzTC() {
        return new zzaht(zzahi.zzTi(), zzahn.zzTA().zzl(this.zzbRm, zzahu.zzbRi));
    }

    public String zzTD() {
        return this.zzbRm.zzRr();
    }

    public int zza(zzaht com_google_android_gms_internal_zzaht, zzaht com_google_android_gms_internal_zzaht2) {
        int compareTo = com_google_android_gms_internal_zzaht.zzPj().zzO(this.zzbRm).compareTo(com_google_android_gms_internal_zzaht2.zzPj().zzO(this.zzbRm));
        return compareTo == 0 ? com_google_android_gms_internal_zzaht.zzTK().zzi(com_google_android_gms_internal_zzaht2.zzTK()) : compareTo;
    }

    public zzaht zzg(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return new zzaht(com_google_android_gms_internal_zzahi, zzahn.zzTA().zzl(this.zzbRm, com_google_android_gms_internal_zzahu));
    }

    public boolean zzl(zzahu com_google_android_gms_internal_zzahu) {
        return !com_google_android_gms_internal_zzahu.zzO(this.zzbRm).isEmpty();
    }
}
