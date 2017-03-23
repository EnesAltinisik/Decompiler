package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class ap implements Executor {
    private final Handler a;

    public ap(Looper looper) {
        this.a = new Handler(looper);
    }

    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
