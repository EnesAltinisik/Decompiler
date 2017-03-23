package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagq.zza;
import com.google.firebase.database.DatabaseError;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class zzaew {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaew.class.desiredAssertionStatus());
    private zzaex zzbLA;
    private boolean zzbLB = false;
    private AtomicBoolean zzbLz = new AtomicBoolean(false);

    public abstract zzagu zzQM();

    public void zzRl() {
        if (this.zzbLz.compareAndSet(false, true) && this.zzbLA != null) {
            this.zzbLA.zzd(this);
            this.zzbLA = null;
        }
    }

    public boolean zzRm() {
        return this.zzbLz.get();
    }

    public boolean zzRn() {
        return this.zzbLB;
    }

    public abstract zzaew zza(zzagu com_google_android_gms_internal_zzagu);

    public abstract zzagp zza(zzago com_google_android_gms_internal_zzago, zzagu com_google_android_gms_internal_zzagu);

    public void zza(zzaex com_google_android_gms_internal_zzaex) {
        if (!$assertionsDisabled && zzRm()) {
            throw new AssertionError();
        } else if ($assertionsDisabled || this.zzbLA == null) {
            this.zzbLA = com_google_android_gms_internal_zzaex;
        } else {
            throw new AssertionError();
        }
    }

    public abstract void zza(zzagp com_google_android_gms_internal_zzagp);

    public abstract void zza(DatabaseError databaseError);

    public abstract boolean zza(zza com_google_android_gms_internal_zzagq_zza);

    public void zzaR(boolean z) {
        this.zzbLB = z;
    }

    public abstract boolean zzc(zzaew com_google_android_gms_internal_zzaew);
}
