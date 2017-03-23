package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

class d<TResult> implements f<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private OnFailureListener c;

    public d(Executor executor, OnFailureListener onFailureListener) {
        this.a = executor;
        this.c = onFailureListener;
    }

    public void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public void a(final Task<TResult> task) {
        if (!task.isSuccessful()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new Runnable(this) {
                    final /* synthetic */ d b;

                    public void run() {
                        synchronized (this.b.b) {
                            if (this.b.c != null) {
                                this.b.c.onFailure(task.getException());
                            }
                        }
                    }
                });
            }
        }
    }
}
