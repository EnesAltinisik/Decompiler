package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public class zzw extends b {
    private static final AtomicLong zzbeq = new AtomicLong(Long.MIN_VALUE);
    private d zzbeh;
    private d zzbei;
    private final PriorityBlockingQueue<FutureTask<?>> zzbej = new PriorityBlockingQueue();
    private final BlockingQueue<FutureTask<?>> zzbek = new LinkedBlockingQueue();
    private final UncaughtExceptionHandler zzbel = new b(this, "Thread death: Uncaught exception on worker thread");
    private final UncaughtExceptionHandler zzbem = new b(this, "Thread death: Uncaught exception on network thread");
    private final Object zzben = new Object();
    private final Semaphore zzbeo = new Semaphore(2);
    private volatile boolean zzbep;

    static class a extends RuntimeException {
    }

    private final class b implements UncaughtExceptionHandler {
        final /* synthetic */ zzw a;
        private final String b;

        public b(zzw com_google_android_gms_measurement_internal_zzw, String str) {
            this.a = com_google_android_gms_measurement_internal_zzw;
            zzaa.zzz(str);
            this.b = str;
        }

        public synchronized void uncaughtException(Thread thread, Throwable th) {
            this.a.zzFm().zzFE().zzj(this.b, th);
        }
    }

    private final class c<V> extends FutureTask<V> implements Comparable<c> {
        final /* synthetic */ zzw a;
        private final long b = zzw.zzbeq.getAndIncrement();
        private final boolean c;
        private final String d;

        c(zzw com_google_android_gms_measurement_internal_zzw, Runnable runnable, boolean z, String str) {
            this.a = com_google_android_gms_measurement_internal_zzw;
            super(runnable, null);
            zzaa.zzz(str);
            this.d = str;
            this.c = z;
            if (this.b == Long.MAX_VALUE) {
                com_google_android_gms_measurement_internal_zzw.zzFm().zzFE().log("Tasks index overflow");
            }
        }

        c(zzw com_google_android_gms_measurement_internal_zzw, Callable<V> callable, boolean z, String str) {
            this.a = com_google_android_gms_measurement_internal_zzw;
            super(callable);
            zzaa.zzz(str);
            this.d = str;
            this.c = z;
            if (this.b == Long.MAX_VALUE) {
                com_google_android_gms_measurement_internal_zzw.zzFm().zzFE().log("Tasks index overflow");
            }
        }

        public int a(c cVar) {
            if (this.c != cVar.c) {
                return this.c ? -1 : 1;
            } else {
                if (this.b < cVar.b) {
                    return -1;
                }
                if (this.b > cVar.b) {
                    return 1;
                }
                this.a.zzFm().zzFF().zzj("Two tasks share the same index. index", Long.valueOf(this.b));
                return 0;
            }
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((c) obj);
        }

        protected void setException(Throwable th) {
            this.a.zzFm().zzFE().zzj(this.d, th);
            if (th instanceof a) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            super.setException(th);
        }
    }

    private final class d extends Thread {
        final /* synthetic */ zzw a;
        private final Object b = new Object();
        private final BlockingQueue<FutureTask<?>> c;

        public d(zzw com_google_android_gms_measurement_internal_zzw, String str, BlockingQueue<FutureTask<?>> blockingQueue) {
            this.a = com_google_android_gms_measurement_internal_zzw;
            zzaa.zzz(str);
            zzaa.zzz(blockingQueue);
            this.c = blockingQueue;
            setName(str);
        }

        private void a(InterruptedException interruptedException) {
            this.a.zzFm().zzFG().zzj(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
        }

        public void a() {
            synchronized (this.b) {
                this.b.notifyAll();
            }
        }

        public void run() {
            Object obj = null;
            while (obj == null) {
                try {
                    this.a.zzbeo.acquire();
                    obj = 1;
                } catch (InterruptedException e) {
                    a(e);
                }
            }
            while (true) {
                try {
                    FutureTask futureTask = (FutureTask) this.c.poll();
                    if (futureTask != null) {
                        futureTask.run();
                    } else {
                        synchronized (this.b) {
                            if (this.c.peek() == null && !this.a.zzbep) {
                                try {
                                    this.b.wait(30000);
                                } catch (InterruptedException e2) {
                                    a(e2);
                                }
                            }
                        }
                        synchronized (this.a.zzben) {
                            if (this.c.peek() == null) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.a.zzben) {
                        this.a.zzbeo.release();
                        this.a.zzben.notifyAll();
                        if (this == this.a.zzbeh) {
                            this.a.zzbeh = null;
                        } else if (this == this.a.zzbei) {
                            this.a.zzbei = null;
                        } else {
                            this.a.zzFm().zzFE().log("Current scheduler thread is neither worker nor network");
                        }
                    }
                }
            }
            synchronized (this.a.zzben) {
                this.a.zzbeo.release();
                this.a.zzben.notifyAll();
                if (this == this.a.zzbeh) {
                    this.a.zzbeh = null;
                } else if (this == this.a.zzbei) {
                    this.a.zzbei = null;
                } else {
                    this.a.zzFm().zzFE().log("Current scheduler thread is neither worker nor network");
                }
            }
        }
    }

    zzw(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private void zza(c<?> cVar) {
        synchronized (this.zzben) {
            this.zzbej.add(cVar);
            if (this.zzbeh == null) {
                this.zzbeh = new d(this, "Measurement Worker", this.zzbej);
                this.zzbeh.setUncaughtExceptionHandler(this.zzbel);
                this.zzbeh.start();
            } else {
                this.zzbeh.a();
            }
        }
    }

    private void zza(FutureTask<?> futureTask) {
        synchronized (this.zzben) {
            this.zzbek.add(futureTask);
            if (this.zzbei == null) {
                this.zzbei = new d(this, "Measurement Network", this.zzbek);
                this.zzbei.setUncaughtExceptionHandler(this.zzbem);
                this.zzbei.start();
            } else {
                this.zzbei.a();
            }
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public void zzFb() {
        if (Thread.currentThread() != this.zzbei) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    public <V> Future<V> zzd(Callable<V> callable) throws IllegalStateException {
        zzma();
        zzaa.zzz(callable);
        c cVar = new c(this, (Callable) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzbeh) {
            cVar.run();
        } else {
            zza(cVar);
        }
        return cVar;
    }

    public <V> Future<V> zze(Callable<V> callable) throws IllegalStateException {
        zzma();
        zzaa.zzz(callable);
        c cVar = new c(this, (Callable) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzbeh) {
            cVar.run();
        } else {
            zza(cVar);
        }
        return cVar;
    }

    public void zzg(Runnable runnable) throws IllegalStateException {
        zzma();
        zzaa.zzz(runnable);
        zza(new c(this, runnable, false, "Task exception on worker thread"));
    }

    public void zzh(Runnable runnable) throws IllegalStateException {
        zzma();
        zzaa.zzz(runnable);
        zza(new c(this, runnable, false, "Task exception on network thread"));
    }

    public void zzkN() {
        if (Thread.currentThread() != this.zzbeh) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }
}
