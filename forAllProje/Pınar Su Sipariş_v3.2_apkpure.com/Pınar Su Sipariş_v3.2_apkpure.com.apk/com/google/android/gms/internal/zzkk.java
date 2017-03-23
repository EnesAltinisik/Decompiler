package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzu;

@zzig
public class zzkk {
    private long zzRk;
    private long zzRl = Long.MIN_VALUE;
    private Object zzpp = new Object();

    public zzkk(long j) {
        this.zzRk = j;
    }

    public boolean tryAcquire() {
        boolean z;
        synchronized (this.zzpp) {
            long elapsedRealtime = zzu.zzco().elapsedRealtime();
            if (this.zzRl + this.zzRk > elapsedRealtime) {
                z = false;
            } else {
                this.zzRl = elapsedRealtime;
                z = true;
            }
        }
        return z;
    }
}
