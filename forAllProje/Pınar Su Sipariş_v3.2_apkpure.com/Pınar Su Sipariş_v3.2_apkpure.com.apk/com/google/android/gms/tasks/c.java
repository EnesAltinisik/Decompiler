package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

class c<TResult> implements f<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private OnCompleteListener<TResult> c;

    public c(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.a = executor;
        this.c = onCompleteListener;
    }

    public void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public void a(final Task<TResult> task) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    synchronized (this.b.b) {
                        if (this.b.c != null) {
                            this.b.c.onComplete(task);
                        }
                    }
                }
            });
        }
    }
}
