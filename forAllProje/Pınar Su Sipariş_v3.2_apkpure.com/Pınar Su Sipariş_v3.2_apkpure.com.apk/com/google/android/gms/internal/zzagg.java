package com.google.android.gms.internal;

public class zzagg {
    public final long id;
    public final zzagu zzbOQ;
    public final long zzbOR;
    public final boolean zzbOS;
    public final boolean zzbOT;

    public zzagg(long j, zzagu com_google_android_gms_internal_zzagu, long j2, boolean z, boolean z2) {
        this.id = j;
        if (!com_google_android_gms_internal_zzagu.zzSO() || com_google_android_gms_internal_zzagu.isDefault()) {
            this.zzbOQ = com_google_android_gms_internal_zzagu;
            this.zzbOR = j2;
            this.zzbOS = z;
            this.zzbOT = z2;
            return;
        }
        throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        zzagg com_google_android_gms_internal_zzagg = (zzagg) obj;
        return this.id == com_google_android_gms_internal_zzagg.id && this.zzbOQ.equals(com_google_android_gms_internal_zzagg.zzbOQ) && this.zzbOR == com_google_android_gms_internal_zzagg.zzbOR && this.zzbOS == com_google_android_gms_internal_zzagg.zzbOS && this.zzbOT == com_google_android_gms_internal_zzagg.zzbOT;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.id).hashCode() * 31) + this.zzbOQ.hashCode()) * 31) + Long.valueOf(this.zzbOR).hashCode()) * 31) + Boolean.valueOf(this.zzbOS).hashCode()) * 31) + Boolean.valueOf(this.zzbOT).hashCode();
    }

    public String toString() {
        long j = this.id;
        String valueOf = String.valueOf(this.zzbOQ);
        long j2 = this.zzbOR;
        boolean z = this.zzbOS;
        return new StringBuilder(String.valueOf(valueOf).length() + 109).append("TrackedQuery{id=").append(j).append(", querySpec=").append(valueOf).append(", lastUse=").append(j2).append(", complete=").append(z).append(", active=").append(this.zzbOT).append("}").toString();
    }

    public zzagg zzSk() {
        return new zzagg(this.id, this.zzbOQ, this.zzbOR, true, this.zzbOT);
    }

    public zzagg zzaH(long j) {
        return new zzagg(this.id, this.zzbOQ, j, this.zzbOS, this.zzbOT);
    }

    public zzagg zzaS(boolean z) {
        return new zzagg(this.id, this.zzbOQ, this.zzbOR, this.zzbOS, z);
    }
}
