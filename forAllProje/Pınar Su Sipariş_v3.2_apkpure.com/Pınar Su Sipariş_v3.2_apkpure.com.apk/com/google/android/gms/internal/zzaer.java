package com.google.android.gms.internal;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.zza;

public class zzaer extends zzaew {
    private final zzafc zzbHo;
    private final ChildEventListener zzbLc;
    private final zzagu zzbLd;

    public zzaer(zzafc com_google_android_gms_internal_zzafc, ChildEventListener childEventListener, zzagu com_google_android_gms_internal_zzagu) {
        this.zzbHo = com_google_android_gms_internal_zzafc;
        this.zzbLc = childEventListener;
        this.zzbLd = com_google_android_gms_internal_zzagu;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzaer) && ((zzaer) obj).zzbLc.equals(this.zzbLc) && ((zzaer) obj).zzbHo.equals(this.zzbHo) && ((zzaer) obj).zzbLd.equals(this.zzbLd);
    }

    public int hashCode() {
        return (((this.zzbLc.hashCode() * 31) + this.zzbHo.hashCode()) * 31) + this.zzbLd.hashCode();
    }

    public String toString() {
        return "ChildEventRegistration";
    }

    public zzagu zzQM() {
        return this.zzbLd;
    }

    public zzaew zza(zzagu com_google_android_gms_internal_zzagu) {
        return new zzaer(this.zzbHo, this.zzbLc, com_google_android_gms_internal_zzagu);
    }

    public zzagp zza(zzago com_google_android_gms_internal_zzago, zzagu com_google_android_gms_internal_zzagu) {
        return new zzagp(com_google_android_gms_internal_zzago.zzSw(), this, zza.zza(zza.zza(this.zzbHo, com_google_android_gms_internal_zzagu.zzPn().zza(com_google_android_gms_internal_zzago.zzSv())), com_google_android_gms_internal_zzago.zzSt()), com_google_android_gms_internal_zzago.zzSx() != null ? com_google_android_gms_internal_zzago.zzSx().asString() : null);
    }

    public void zza(zzagp com_google_android_gms_internal_zzagp) {
        if (!zzRm()) {
            switch (com_google_android_gms_internal_zzagp.zzSw()) {
                case CHILD_ADDED:
                    this.zzbLc.onChildAdded(com_google_android_gms_internal_zzagp.zzSz(), com_google_android_gms_internal_zzagp.zzSA());
                    return;
                case CHILD_CHANGED:
                    this.zzbLc.onChildChanged(com_google_android_gms_internal_zzagp.zzSz(), com_google_android_gms_internal_zzagp.zzSA());
                    return;
                case CHILD_MOVED:
                    this.zzbLc.onChildMoved(com_google_android_gms_internal_zzagp.zzSz(), com_google_android_gms_internal_zzagp.zzSA());
                    return;
                case CHILD_REMOVED:
                    this.zzbLc.onChildRemoved(com_google_android_gms_internal_zzagp.zzSz());
                    return;
                default:
                    return;
            }
        }
    }

    public void zza(DatabaseError databaseError) {
        this.zzbLc.onCancelled(databaseError);
    }

    public boolean zza(zzagq.zza com_google_android_gms_internal_zzagq_zza) {
        return com_google_android_gms_internal_zzagq_zza != zzagq.zza.VALUE;
    }

    public boolean zzc(zzaew com_google_android_gms_internal_zzaew) {
        return (com_google_android_gms_internal_zzaew instanceof zzaer) && ((zzaer) com_google_android_gms_internal_zzaew).zzbLc.equals(this.zzbLc);
    }
}
