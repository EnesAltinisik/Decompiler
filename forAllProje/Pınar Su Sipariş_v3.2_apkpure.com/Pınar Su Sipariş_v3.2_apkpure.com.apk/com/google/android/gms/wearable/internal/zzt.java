package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.internal.zzau.zza;

public final class zzt extends zza {
    private f zzbCR;
    private g zzbCV;
    private final Object zzpp = new Object();

    public void zza(g gVar) {
        synchronized (this.zzpp) {
            this.zzbCV = (g) zzaa.zzz(gVar);
            f fVar = this.zzbCR;
        }
        if (fVar != null) {
            gVar.a(fVar);
        }
    }

    public void zzz(int i, int i2) {
        synchronized (this.zzpp) {
            g gVar = this.zzbCV;
            f fVar = new f(i, i2);
            this.zzbCR = fVar;
        }
        if (gVar != null) {
            gVar.a(fVar);
        }
    }
}
