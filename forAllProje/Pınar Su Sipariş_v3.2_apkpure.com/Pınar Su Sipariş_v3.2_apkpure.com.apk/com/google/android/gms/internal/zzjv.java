package com.google.android.gms.internal;

import java.util.concurrent.Future;

@zzig
public abstract class zzjv implements zzkc<Future> {
    private volatile Thread zzQc;
    private boolean zzQd;
    private final Runnable zzw;

    public zzjv() {
        this.zzw = new Runnable(this) {
            final /* synthetic */ zzjv a;

            {
                this.a = r1;
            }

            public final void run() {
                this.a.zzQc = Thread.currentThread();
                this.a.zzbQ();
            }
        };
        this.zzQd = false;
    }

    public zzjv(boolean z) {
        this.zzw = /* anonymous class already generated */;
        this.zzQd = z;
    }

    public final void cancel() {
        onStop();
        if (this.zzQc != null) {
            this.zzQc.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzbQ();

    public /* synthetic */ Object zzhs() {
        return zziU();
    }

    public final Future zziU() {
        return this.zzQd ? zzjz.zza(1, this.zzw) : zzjz.zza(this.zzw);
    }
}
