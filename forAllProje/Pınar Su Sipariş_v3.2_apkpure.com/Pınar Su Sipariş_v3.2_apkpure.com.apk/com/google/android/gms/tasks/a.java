package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

class a<TResult, TContinuationResult> implements f<TResult> {
    private final Executor a;
    private final Continuation<TResult, TContinuationResult> b;
    private final h<TContinuationResult> c;

    public a(Executor executor, Continuation<TResult, TContinuationResult> continuation, h<TContinuationResult> hVar) {
        this.a = executor;
        this.b = continuation;
        this.c = hVar;
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void a(final Task<TResult> task) {
        this.a.execute(new Runnable(this) {
            final /* synthetic */ a b;

            public void run() {
                try {
                    this.b.c.a(this.b.b.then(task));
                } catch (Exception e) {
                    if (e.getCause() instanceof Exception) {
                        this.b.c.a((Exception) e.getCause());
                    } else {
                        this.b.c.a(e);
                    }
                } catch (Exception e2) {
                    this.b.c.a(e2);
                }
            }
        });
    }
}
