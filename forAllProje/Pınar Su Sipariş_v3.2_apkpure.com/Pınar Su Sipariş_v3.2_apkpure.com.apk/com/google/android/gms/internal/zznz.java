package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzou.zzb;

public abstract class zznz<L> implements zzb<L> {
    private final DataHolder zzamz;

    protected zznz(DataHolder dataHolder) {
        this.zzamz = dataHolder;
    }

    protected abstract void zza(L l, DataHolder dataHolder);

    public void zzrV() {
        if (this.zzamz != null) {
            this.zzamz.close();
        }
    }

    public final void zzt(L l) {
        zza(l, this.zzamz);
    }
}
