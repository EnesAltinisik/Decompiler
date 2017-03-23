package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

class e<TResult> implements f<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private OnSuccessListener<? super TResult> c;

    public e(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.a = executor;
        this.c = onSuccessListener;
    }

    public void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public void a(final Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new Runnable(this) {
                    final /* synthetic */ e b;

                    public void run() {
                        synchronized (this.b.b) {
                            if (this.b.c != null) {
                                this.b.c.onSuccess(task.getResult());
                            }
                        }
                    }
                });
            }
        }
    }
}
