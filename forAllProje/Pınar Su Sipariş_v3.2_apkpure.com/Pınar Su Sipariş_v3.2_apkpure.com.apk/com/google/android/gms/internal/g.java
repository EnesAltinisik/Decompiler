package com.google.android.gms.internal;

import com.google.firebase.database.EventTarget;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class g implements EventTarget {
    private final ThreadPoolExecutor a;

    public g(final ThreadFactory threadFactory, final zzafl com_google_android_gms_internal_zzafl) {
        int i = 1;
        this.a = new ThreadPoolExecutor(1, i, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) {
            final /* synthetic */ g c;

            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory.newThread(runnable);
                com_google_android_gms_internal_zzafl.zza(newThread, "FirebaseDatabaseEventTarget");
                com_google_android_gms_internal_zzafl.zza(newThread, true);
                return newThread;
            }
        });
    }

    public void postEvent(Runnable runnable) {
        this.a.execute(runnable);
    }

    public void restart() {
        this.a.setCorePoolSize(1);
    }

    public void shutdown() {
        this.a.setCorePoolSize(0);
    }
}
