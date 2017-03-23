package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzig
public class zzko<T> implements zzkr<T> {
    private boolean zzFq = false;
    private T zzRF = null;
    private boolean zzRG = false;
    private final y zzRH = new y();
    private final Object zzpp = new Object();

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.zzpp) {
            if (this.zzRG) {
                return false;
            }
            this.zzFq = true;
            this.zzRG = true;
            this.zzpp.notifyAll();
            this.zzRH.a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.zzpp) {
            if (!this.zzRG) {
                try {
                    this.zzpp.wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.zzFq) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.zzRF;
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws TimeoutException {
        T t;
        synchronized (this.zzpp) {
            if (!this.zzRG) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.zzpp.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                }
            }
            if (!this.zzRG) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.zzFq) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.zzRF;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzFq;
        }
        return z;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzRG;
        }
        return z;
    }

    public void zzb(Runnable runnable) {
        this.zzRH.a(runnable);
    }

    public void zzc(Runnable runnable) {
        this.zzRH.b(runnable);
    }

    public void zzh(T t) {
        synchronized (this.zzpp) {
            if (this.zzFq) {
            } else if (this.zzRG) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            } else {
                this.zzRG = true;
                this.zzRF = t;
                this.zzpp.notifyAll();
                this.zzRH.a();
            }
        }
    }
}
