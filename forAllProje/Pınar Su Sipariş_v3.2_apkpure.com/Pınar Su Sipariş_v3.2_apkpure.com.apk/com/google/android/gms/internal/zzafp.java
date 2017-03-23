package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagq.zza;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class zzafp extends zzaew {
    private final zzafc zzbHo;
    private final zzagu zzbLd;
    private final ValueEventListener zzbNX;

    public zzafp(zzafc com_google_android_gms_internal_zzafc, ValueEventListener valueEventListener, zzagu com_google_android_gms_internal_zzagu) {
        this.zzbHo = com_google_android_gms_internal_zzafc;
        this.zzbNX = valueEventListener;
        this.zzbLd = com_google_android_gms_internal_zzagu;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzafp) && ((zzafp) obj).zzbNX.equals(this.zzbNX) && ((zzafp) obj).zzbHo.equals(this.zzbHo) && ((zzafp) obj).zzbLd.equals(this.zzbLd);
    }

    public int hashCode() {
        return (((this.zzbNX.hashCode() * 31) + this.zzbHo.hashCode()) * 31) + this.zzbLd.hashCode();
    }

    public String toString() {
        return "ValueEventRegistration";
    }

    public zzagu zzQM() {
        return this.zzbLd;
    }

    public zzaew zza(zzagu com_google_android_gms_internal_zzagu) {
        return new zzafp(this.zzbHo, this.zzbNX, com_google_android_gms_internal_zzagu);
    }

    public zzagp zza(zzago com_google_android_gms_internal_zzago, zzagu com_google_android_gms_internal_zzagu) {
        return new zzagp(zza.VALUE, this, com.google.firebase.database.zza.zza(com.google.firebase.database.zza.zza(this.zzbHo, com_google_android_gms_internal_zzagu.zzPn()), com_google_android_gms_internal_zzago.zzSt()), null);
    }

    public void zza(zzagp com_google_android_gms_internal_zzagp) {
        if (!zzRm()) {
            this.zzbNX.onDataChange(com_google_android_gms_internal_zzagp.zzSz());
        }
    }

    public void zza(DatabaseError databaseError) {
        this.zzbNX.onCancelled(databaseError);
    }

    public boolean zza(zza com_google_android_gms_internal_zzagq_zza) {
        return com_google_android_gms_internal_zzagq_zza == zza.VALUE;
    }

    public boolean zzc(zzaew com_google_android_gms_internal_zzaew) {
        return (com_google_android_gms_internal_zzaew instanceof zzafp) && ((zzafp) com_google_android_gms_internal_zzaew).zzbNX.equals(this.zzbNX);
    }
}
