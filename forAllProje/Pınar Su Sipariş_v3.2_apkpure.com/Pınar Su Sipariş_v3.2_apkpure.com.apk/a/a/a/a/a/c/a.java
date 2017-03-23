package a.a.a.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AsyncTask */
public abstract class a<Params, Progress, Result> {
    private static final int a = Runtime.getRuntime().availableProcessors();
    public static final Executor b = new ThreadPoolExecutor(d, e, 1, TimeUnit.SECONDS, g, f);
    public static final Executor c = new c();
    private static final int d = (a + 1);
    private static final int e = ((a * 2) + 1);
    private static final ThreadFactory f = new ThreadFactory() {
        private final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> g = new LinkedBlockingQueue(128);
    private static final b h = new b();
    private static volatile Executor i = c;
    private final e<Params, Result> j = new e<Params, Result>(this) {
        final /* synthetic */ a a;

        {
            this.a = r2;
        }

        public Result call() throws Exception {
            this.a.n.set(true);
            Process.setThreadPriority(10);
            return this.a.d(this.a.a(this.b));
        }
    };
    private final FutureTask<Result> k = new FutureTask<Result>(this, this.j) {
        final /* synthetic */ a a;

        protected void done() {
            try {
                this.a.c(get());
            } catch (Throwable e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException e3) {
                this.a.c(null);
            }
        }
    };
    private volatile d l = d.PENDING;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    /* compiled from: AsyncTask */
    private static abstract class e<Params, Result> implements Callable<Result> {
        Params[] b;

        private e() {
        }
    }

    /* compiled from: AsyncTask */
    private static class a<Data> {
        final a a;
        final Data[] b;

        a(a aVar, Data... dataArr) {
            this.a = aVar;
            this.b = dataArr;
        }
    }

    /* compiled from: AsyncTask */
    private static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.a.e(aVar.b[0]);
                    return;
                case 2:
                    aVar.a.b(aVar.b);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: AsyncTask */
    private static class c implements Executor {
        final LinkedList<Runnable> a;
        Runnable b;

        private c() {
            this.a = new LinkedList();
        }

        public synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        this.b.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }

        protected synchronized void a() {
            Runnable runnable = (Runnable) this.a.poll();
            this.b = runnable;
            if (runnable != null) {
                a.b.execute(this.b);
            }
        }
    }

    /* compiled from: AsyncTask */
    public enum d {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result a(Params... paramsArr);

    private void c(Result result) {
        if (!this.n.get()) {
            d(result);
        }
    }

    private Result d(Result result) {
        h.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    public final d b() {
        return this.l;
    }

    protected void a() {
    }

    protected void a(Result result) {
    }

    protected void b(Progress... progressArr) {
    }

    protected void b(Result result) {
        c();
    }

    protected void c() {
    }

    public final boolean d() {
        return this.m.get();
    }

    public final boolean a(boolean z) {
        this.m.set(true);
        return this.k.cancel(z);
    }

    public final a<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.l != d.PENDING) {
            switch (this.l) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.l = d.RUNNING;
        a();
        this.j.b = paramsArr;
        executor.execute(this.k);
        return this;
    }

    private void e(Result result) {
        if (d()) {
            b((Object) result);
        } else {
            a((Object) result);
        }
        this.l = d.FINISHED;
    }
}
