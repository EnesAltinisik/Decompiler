package com.google.android.gms.b;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class hk implements gu {
    private final ThreadPoolExecutor a;

    public hk(final ThreadFactory threadFactory, final hj hjVar) {
        int i = 1;
        this.a = new ThreadPoolExecutor(1, i, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) {
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory.newThread(runnable);
                hjVar.a(newThread, "FirebaseDatabaseEventTarget");
                hjVar.a(newThread, true);
                return newThread;
            }
        });
    }

    public void a() {
        this.a.setCorePoolSize(1);
    }

    public void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
