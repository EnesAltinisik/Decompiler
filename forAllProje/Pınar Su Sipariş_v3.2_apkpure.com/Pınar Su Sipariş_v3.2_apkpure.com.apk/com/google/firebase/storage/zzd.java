package com.google.firebase.storage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class zzd {
    public static zzd zzbUP = new zzd();
    private static BlockingQueue<Runnable> zzbUQ = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor zzbUR = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, zzbUQ, new a("Command-"));
    private static BlockingQueue<Runnable> zzbUS = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor zzbUT = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, zzbUS, new a("Upload-"));
    private static BlockingQueue<Runnable> zzbUU = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor zzbUV = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, zzbUU, new a("Download-"));
    private static BlockingQueue<Runnable> zzbUW = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor zzbUX = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, zzbUW, new a("Callbacks-"));

    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);
        private final String b;

        a(String str) {
            this.b = str;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.b;
            Thread thread = new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 27).append("FirebaseStorage-").append(str).append(this.a.getAndIncrement()).toString());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        zzbUR.allowCoreThreadTimeOut(true);
        zzbUT.allowCoreThreadTimeOut(true);
        zzbUV.allowCoreThreadTimeOut(true);
        zzbUX.allowCoreThreadTimeOut(true);
    }

    public static zzd zzVc() {
        return zzbUP;
    }

    public void zzl(Runnable runnable) {
        zzbUR.execute(runnable);
    }

    public void zzm(Runnable runnable) {
        zzbUT.execute(runnable);
    }

    public void zzn(Runnable runnable) {
        zzbUV.execute(runnable);
    }

    public void zzo(Runnable runnable) {
        zzbUX.execute(runnable);
    }
}
