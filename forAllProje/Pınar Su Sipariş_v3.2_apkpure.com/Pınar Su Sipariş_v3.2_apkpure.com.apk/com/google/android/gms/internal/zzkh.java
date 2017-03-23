package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.zzaa;

@zzig
public class zzkh {
    private Handler mHandler = null;
    private HandlerThread zzRe = null;
    private int zzRf = 0;
    private final Object zzpp = new Object();

    public Looper zzjl() {
        Looper looper;
        synchronized (this.zzpp) {
            if (this.zzRf != 0) {
                zzaa.zzb(this.zzRe, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.zzRe == null) {
                zzjw.v("Starting the looper thread.");
                this.zzRe = new HandlerThread("LooperProvider");
                this.zzRe.start();
                this.mHandler = new Handler(this.zzRe.getLooper());
                zzjw.v("Looper thread started.");
            } else {
                zzjw.v("Resuming the looper thread");
                this.zzpp.notifyAll();
            }
            this.zzRf++;
            looper = this.zzRe.getLooper();
        }
        return looper;
    }

    public void zzjm() {
        synchronized (this.zzpp) {
            zzaa.zzb(this.zzRf > 0, (Object) "Invalid state: release() called more times than expected.");
            int i = this.zzRf - 1;
            this.zzRf = i;
            if (i == 0) {
                this.mHandler.post(new Runnable(this) {
                    final /* synthetic */ zzkh a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        synchronized (this.a.zzpp) {
                            zzjw.v("Suspending the looper thread");
                            while (this.a.zzRf == 0) {
                                try {
                                    this.a.zzpp.wait();
                                    zzjw.v("Looper thread resumed");
                                } catch (InterruptedException e) {
                                    zzjw.v("Looper thread interrupted.");
                                }
                            }
                        }
                    }
                });
            }
        }
    }
}
