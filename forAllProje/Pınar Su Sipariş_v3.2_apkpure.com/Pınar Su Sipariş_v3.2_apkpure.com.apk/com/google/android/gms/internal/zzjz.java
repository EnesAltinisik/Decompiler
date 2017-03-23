package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@zzig
public final class zzjz {
    private static final ExecutorService zzQm = Executors.newFixedThreadPool(10, zzaM("Default"));
    private static final ExecutorService zzQn = Executors.newFixedThreadPool(5, zzaM("Loader"));

    class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ Runnable a;

        AnonymousClass1(Runnable runnable) {
            this.a = runnable;
        }

        public Void a() {
            this.a.run();
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
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

        public /* synthetic */ Object call() throws Exception {
            return a();
        }
    }

    class AnonymousClass3 implements Runnable {
        final /* synthetic */ zzko a;
        final /* synthetic */ Callable b;

        AnonymousClass3(zzko com_google_android_gms_internal_zzko, Callable callable) {
            this.a = com_google_android_gms_internal_zzko;
            this.b = callable;
        }

        public void run() {
            try {
                Process.setThreadPriority(10);
                this.a.zzh(this.b.call());
            } catch (Throwable e) {
                zzu.zzcn().zzb(e, true);
                this.a.cancel(true);
            }
        }
    }

    class AnonymousClass4 implements Runnable {
        final /* synthetic */ zzko a;
        final /* synthetic */ Future b;

        AnonymousClass4(zzko com_google_android_gms_internal_zzko, Future future) {
            this.a = com_google_android_gms_internal_zzko;
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

    public static zzkr<Void> zza(int i, Runnable runnable) {
        return i == 1 ? zza(zzQn, new AnonymousClass1(runnable)) : zza(zzQm, new AnonymousClass2(runnable));
    }

    public static zzkr<Void> zza(Runnable runnable) {
        return zza(0, runnable);
    }

    public static <T> zzkr<T> zza(Callable<T> callable) {
        return zza(zzQm, (Callable) callable);
    }

    public static <T> zzkr<T> zza(ExecutorService executorService, Callable<T> callable) {
        Object com_google_android_gms_internal_zzko = new zzko();
        try {
            com_google_android_gms_internal_zzko.zzc(new AnonymousClass4(com_google_android_gms_internal_zzko, executorService.submit(new AnonymousClass3(com_google_android_gms_internal_zzko, callable))));
        } catch (Throwable e) {
            zzb.zzd("Thread execution is rejected.", e);
            com_google_android_gms_internal_zzko.cancel(true);
        }
        return com_google_android_gms_internal_zzko;
    }

    private static ThreadFactory zzaM(String str) {
        return new AnonymousClass5(str);
    }
}
