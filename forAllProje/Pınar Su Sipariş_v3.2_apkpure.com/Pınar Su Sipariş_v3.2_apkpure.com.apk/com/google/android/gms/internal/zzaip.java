package com.google.android.gms.internal;

import com.google.firebase.database.RunLoop;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class zzaip implements RunLoop {
    private ScheduledThreadPoolExecutor zzbSg = new ScheduledThreadPoolExecutor(this, 1, new a()) {
        final /* synthetic */ zzaip a;

        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (CancellationException e) {
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                }
            }
            if (th != null) {
                this.a.zzh(th);
            }
        }
    };

    private class a implements ThreadFactory {
        final /* synthetic */ zzaip a;

        private a(zzaip com_google_android_gms_internal_zzaip) {
            this.a = com_google_android_gms_internal_zzaip;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.getThreadFactory().newThread(runnable);
            zzafl zzRp = this.a.zzRp();
            zzRp.zza(newThread, "FirebaseDatabaseWorker");
            zzRp.zza(newThread, true);
            zzRp.zza(newThread, new UncaughtExceptionHandler(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    this.a.a.zzh(th);
                }
            });
            return newThread;
        }
    }

    public zzaip() {
        this.zzbSg.setKeepAliveTime(3, TimeUnit.SECONDS);
    }

    protected ThreadFactory getThreadFactory() {
        return Executors.defaultThreadFactory();
    }

    public void restart() {
        this.zzbSg.setCorePoolSize(1);
    }

    public ScheduledFuture schedule(Runnable runnable, long j) {
        return this.zzbSg.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public void scheduleNow(Runnable runnable) {
        this.zzbSg.execute(runnable);
    }

    public void shutdown() {
        this.zzbSg.setCorePoolSize(0);
    }

    public ScheduledExecutorService zzPV() {
        return this.zzbSg;
    }

    protected zzafl zzRp() {
        return zzafl.zzbNM;
    }

    public abstract void zzh(Throwable th);
}
