package com.google.android.gms.c;

import com.google.android.gms.common.internal.c;
import java.util.concurrent.Executor;

final class k<TResult> extends d<TResult> {
    private final Object a = new Object();
    private final j<TResult> b = new j();
    private boolean c;
    private TResult d;
    private Exception e;

    k() {
    }

    private void d() {
        c.a(this.c, (Object) "Task is not yet complete");
    }

    private void e() {
        c.a(!this.c, (Object) "Task is already complete");
    }

    private void f() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((d) this);
                return;
            }
        }
    }

    public d<TResult> a(Executor executor, a aVar) {
        this.b.a(new g(executor, aVar));
        f();
        return this;
    }

    public d<TResult> a(Executor executor, b<? super TResult> bVar) {
        this.b.a(new h(executor, bVar));
        f();
        return this;
    }

    public void a(Exception exception) {
        c.a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.a) {
            e();
            this.c = true;
            this.e = exception;
        }
        this.b.a((d) this);
    }

    public void a(TResult tResult) {
        synchronized (this.a) {
            e();
            this.c = true;
            this.d = tResult;
        }
        this.b.a((d) this);
    }

    public boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }

    public TResult b() {
        TResult tResult;
        synchronized (this.a) {
            d();
            if (this.e != null) {
                throw new c(this.e);
            }
            tResult = this.d;
        }
        return tResult;
    }

    public boolean b(Exception exception) {
        boolean z = true;
        c.a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                this.e = exception;
                this.b.a((d) this);
            }
        }
        return z;
    }

    public Exception c() {
        Exception exception;
        synchronized (this.a) {
            exception = this.e;
        }
        return exception;
    }
}
