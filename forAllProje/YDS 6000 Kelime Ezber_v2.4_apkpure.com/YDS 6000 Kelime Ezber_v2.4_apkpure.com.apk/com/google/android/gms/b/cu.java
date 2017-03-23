package com.google.android.gms.b;

import android.content.Context;
import android.os.Looper;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public class cu extends cy {
    private static final AtomicLong j = new AtomicLong(Long.MIN_VALUE);
    private d a;
    private d b;
    private final PriorityBlockingQueue<FutureTask<?>> c = new PriorityBlockingQueue();
    private final BlockingQueue<FutureTask<?>> d = new LinkedBlockingQueue();
    private final UncaughtExceptionHandler e = new b(this, "Thread death: Uncaught exception on worker thread");
    private final UncaughtExceptionHandler f = new b(this, "Thread death: Uncaught exception on network thread");
    private final Object g = new Object();
    private final Semaphore h = new Semaphore(2);
    private volatile boolean i;

    static class a extends RuntimeException {
    }

    private final class b implements UncaughtExceptionHandler {
        final /* synthetic */ cu a;
        private final String b;

        public b(cu cuVar, String str) {
            this.a = cuVar;
            com.google.android.gms.common.internal.c.a((Object) str);
            this.b = str;
        }

        public synchronized void uncaughtException(Thread thread, Throwable th) {
            this.a.u().x().a(this.b, th);
        }
    }

    private final class c<V> extends FutureTask<V> implements Comparable<c> {
        final /* synthetic */ cu a;
        private final long b = cu.j.getAndIncrement();
        private final boolean c;
        private final String d;

        c(cu cuVar, Runnable runnable, boolean z, String str) {
            this.a = cuVar;
            super(runnable, null);
            com.google.android.gms.common.internal.c.a((Object) str);
            this.d = str;
            this.c = z;
            if (this.b == Long.MAX_VALUE) {
                cuVar.u().x().a("Tasks index overflow");
            }
        }

        c(cu cuVar, Callable<V> callable, boolean z, String str) {
            this.a = cuVar;
            super(callable);
            com.google.android.gms.common.internal.c.a((Object) str);
            this.d = str;
            this.c = z;
            if (this.b == Long.MAX_VALUE) {
                cuVar.u().x().a("Tasks index overflow");
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
                this.a.u().y().a("Two tasks share the same index. index", Long.valueOf(this.b));
                return 0;
            }
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((c) obj);
        }

        protected void setException(Throwable th) {
            this.a.u().x().a(this.d, th);
            if (th instanceof a) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            super.setException(th);
        }
    }

    private final class d extends Thread {
        final /* synthetic */ cu a;
        private final Object b = new Object();
        private final BlockingQueue<FutureTask<?>> c;

        public d(cu cuVar, String str, BlockingQueue<FutureTask<?>> blockingQueue) {
            this.a = cuVar;
            com.google.android.gms.common.internal.c.a((Object) str);
            com.google.android.gms.common.internal.c.a((Object) blockingQueue);
            this.c = blockingQueue;
            setName(str);
        }

        private void a(InterruptedException interruptedException) {
            this.a.u().z().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
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
                    this.a.h.acquire();
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
                            if (this.c.peek() == null && !this.a.i) {
                                try {
                                    this.b.wait(30000);
                                } catch (InterruptedException e2) {
                                    a(e2);
                                }
                            }
                        }
                        synchronized (this.a.g) {
                            if (this.c.peek() == null) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.a.g) {
                        this.a.h.release();
                        this.a.g.notifyAll();
                        if (this == this.a.a) {
                            this.a.a = null;
                        } else if (this == this.a.b) {
                            this.a.b = null;
                        } else {
                            this.a.u().x().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                }
            }
            synchronized (this.a.g) {
                this.a.h.release();
                this.a.g.notifyAll();
                if (this == this.a.a) {
                    this.a.a = null;
                } else if (this == this.a.b) {
                    this.a.b = null;
                } else {
                    this.a.u().x().a("Current scheduler thread is neither worker nor network");
                }
            }
        }
    }

    cu(cv cvVar) {
        super(cvVar);
    }

    private void a(c<?> cVar) {
        synchronized (this.g) {
            this.c.add(cVar);
            if (this.a == null) {
                this.a = new d(this, "Measurement Worker", this.c);
                this.a.setUncaughtExceptionHandler(this.e);
                this.a.start();
            } else {
                this.a.a();
            }
        }
    }

    private void a(FutureTask<?> futureTask) {
        synchronized (this.g) {
            this.d.add(futureTask);
            if (this.b == null) {
                this.b = new d(this, "Measurement Network", this.d);
                this.b.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                this.b.a();
            }
        }
    }

    public <V> Future<V> a(Callable<V> callable) {
        Q();
        com.google.android.gms.common.internal.c.a((Object) callable);
        c cVar = new c(this, (Callable) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            cVar.run();
        } else {
            a(cVar);
        }
        return cVar;
    }

    protected void a() {
    }

    public void a(Runnable runnable) {
        Q();
        com.google.android.gms.common.internal.c.a((Object) runnable);
        a(new c(this, runnable, false, "Task exception on worker thread"));
    }

    public <V> Future<V> b(Callable<V> callable) {
        Q();
        com.google.android.gms.common.internal.c.a((Object) callable);
        c cVar = new c(this, (Callable) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            cVar.run();
        } else {
            a(cVar);
        }
        return cVar;
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public void b(Runnable runnable) {
        Q();
        com.google.android.gms.common.internal.c.a((Object) runnable);
        a(new c(this, runnable, false, "Task exception on network thread"));
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public void d() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public void e() {
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }

    public boolean x() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public boolean y() {
        return Thread.currentThread() == this.a;
    }
}
