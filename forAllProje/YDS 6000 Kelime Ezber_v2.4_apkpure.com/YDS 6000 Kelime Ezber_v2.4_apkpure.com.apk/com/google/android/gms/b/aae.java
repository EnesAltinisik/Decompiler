package com.google.android.gms.b;

import java.util.concurrent.TimeUnit;

@vz
public class aae<T> implements aag<T> {
    private final T a;
    private final aah b = new aah();

    public aae(T t) {
        this.a = t;
        this.b.a();
    }

    public void a(Runnable runnable) {
        this.b.a(runnable);
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public T get() {
        return this.a;
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
