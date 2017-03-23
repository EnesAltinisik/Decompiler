package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

class b<TResult, TContinuationResult> implements OnFailureListener, OnSuccessListener<TContinuationResult>, f<TResult> {
    private final Executor a;
    private final Continuation<TResult, Task<TContinuationResult>> b;
    private final h<TContinuationResult> c;

    public b(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, h<TContinuationResult> hVar) {
        this.a = executor;
        this.b = continuation;
        this.c = hVar;
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void a(final Task<TResult> task) {
        this.a.execute(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                try {
                    Task task = (Task) this.b.b.then(task);
                    if (task == null) {
                        this.b.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    task.addOnSuccessListener(TaskExecutors.zzbwy, this.b);
                    task.addOnFailureListener(TaskExecutors.zzbwy, this.b);
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

    public void onFailure(Exception exception) {
        this.c.a(exception);
    }

    public void onSuccess(TContinuationResult tContinuationResult) {
        this.c.a((Object) tContinuationResult);
    }
}
