package com.google.android.gms.b;

import android.os.Process;
import com.google.android.gms.ads.internal.v;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@vz
public final class zh {
    private static final ThreadPoolExecutor a = new ThreadPoolExecutor(10, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Default"));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Loader"));

    class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ Runnable a;

        AnonymousClass1(Runnable runnable) {
            this.a = runnable;
        }

        public Void a() {
            this.a.run();
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    class AnonymousClass2 implements Callable<Void> {
        final /* synthetic */ Runnable a;

        AnonymousClass2(Runnable runnable) {
            this.a = runnable;
        }

        public Void a() {
            this.a.run();
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    class AnonymousClass3 implements Runnable {
        final /* synthetic */ aad a;
        final /* synthetic */ Callable b;

        AnonymousClass3(aad com_google_android_gms_b_aad, Callable callable) {
            this.a = com_google_android_gms_b_aad;
            this.b = callable;
        }

        public void run() {
            try {
                Process.setThreadPriority(10);
                this.a.b(this.b.call());
            } catch (Throwable e) {
                v.i().a(e, "AdThreadPool.submit");
                this.a.a(e);
            }
        }
    }

    class AnonymousClass4 implements Runnable {
        final /* synthetic */ aad a;
        final /* synthetic */ Future b;

        AnonymousClass4(aad com_google_android_gms_b_aad, Future future) {
            this.a = com_google_android_gms_b_aad;
            this.b = future;
        }

        public void run() {
            if (this.a.isCancelled()) {
                this.b.cancel(true);
            }
        }
    }

    class AnonymousClass5 implements ThreadFactory {
        final /* synthetic */ String a;
        private final AtomicInteger b = new AtomicInteger(1);

        AnonymousClass5(String str) {
            this.a = str;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.a;
            return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.b.getAndIncrement()).toString());
        }
    }

    static {
        a.allowCoreThreadTimeOut(true);
        b.allowCoreThreadTimeOut(true);
    }

    public static aag<Void> a(int i, Runnable runnable) {
        return i == 1 ? a(b, new AnonymousClass1(runnable)) : a(a, new AnonymousClass2(runnable));
    }

    public static aag<Void> a(Runnable runnable) {
        return a(0, runnable);
    }

    public static <T> aag<T> a(Callable<T> callable) {
        return a(a, (Callable) callable);
    }

    public static <T> aag<T> a(ExecutorService executorService, Callable<T> callable) {
        Object com_google_android_gms_b_aad = new aad();
        try {
            com_google_android_gms_b_aad.b(new AnonymousClass4(com_google_android_gms_b_aad, executorService.submit(new AnonymousClass3(com_google_android_gms_b_aad, callable))));
        } catch (Throwable e) {
            zy.c("Thread execution is rejected.", e);
            com_google_android_gms_b_aad.cancel(true);
        }
        return com_google_android_gms_b_aad;
    }

    private static ThreadFactory a(String str) {
        return new AnonymousClass5(str);
    }
}
