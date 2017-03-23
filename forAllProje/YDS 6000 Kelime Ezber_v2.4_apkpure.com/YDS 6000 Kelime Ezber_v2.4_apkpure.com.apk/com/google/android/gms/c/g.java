package com.google.android.gms.c;

import java.util.concurrent.Executor;

class g<TResult> implements i<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private a c;

    public g(Executor executor, a aVar) {
        this.a = executor;
        this.c = aVar;
    }

    public void a(final d<TResult> dVar) {
        if (!dVar.a()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new Runnable(this) {
                    final /* synthetic */ g b;

                    public void run() {
                        synchronized (this.b.b) {
                            if (this.b.c != null) {
                                this.b.c.a(dVar.c());
                            }
                        }
                    }
                });
            }
        }
    }
}
