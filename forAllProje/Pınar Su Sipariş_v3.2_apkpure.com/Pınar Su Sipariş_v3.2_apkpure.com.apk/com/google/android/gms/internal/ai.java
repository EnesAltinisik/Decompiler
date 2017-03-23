package com.google.android.gms.internal;

import android.os.Process;

class ai implements Runnable {
    private final Runnable a;
    private final int b;

    public ai(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    public void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
