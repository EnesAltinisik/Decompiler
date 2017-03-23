package com.google.android.gms.c;

import java.util.concurrent.Executor;

class h<TResult> implements i<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private b<? super TResult> c;

    public h(Executor executor, b<? super TResult> bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public void a(final d<TResult> dVar) {
        if (dVar.a()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new Runnable(this) {
                    final /* synthetic */ h b;

                    public void run() {
                        synchronized (this.b.b) {
                            if (this.b.c != null) {
                                this.b.c.a(dVar.b());
                            }
                        }
                    }
                });
            }
        }
    }
}
