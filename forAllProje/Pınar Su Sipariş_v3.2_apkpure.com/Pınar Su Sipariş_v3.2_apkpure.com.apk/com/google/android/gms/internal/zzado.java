package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.database.EventTarget;

public class zzado implements EventTarget {
    private final Handler handler = new Handler(Looper.getMainLooper());

    public void postEvent(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void restart() {
    }

    public void shutdown() {
    }
}
