package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult> {
    private final h<TResult> zzbwx = new h();

    public Task<TResult> getTask() {
        return this.zzbwx;
    }

    public void setException(Exception exception) {
        this.zzbwx.a(exception);
    }

    public void setResult(TResult tResult) {
        this.zzbwx.a((Object) tResult);
    }
}
