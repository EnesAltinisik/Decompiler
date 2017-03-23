package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

@zzig
public class zzkp<T> implements zzkr<T> {
    private final T zzRF;
    private final y zzRH = new y();

    public zzkp(T t) {
        this.zzRF = t;
        this.zzRH.a();
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public T get() {
        return this.zzRF;
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.zzRF;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public void zzb(Runnable runnable) {
        this.zzRH.a(runnable);
    }
}
