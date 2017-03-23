package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;

public class fj implements gu {
    private final Handler a = new Handler(Looper.getMainLooper());

    public void a() {
    }

    public void a(Runnable runnable) {
        this.a.post(runnable);
    }
}
