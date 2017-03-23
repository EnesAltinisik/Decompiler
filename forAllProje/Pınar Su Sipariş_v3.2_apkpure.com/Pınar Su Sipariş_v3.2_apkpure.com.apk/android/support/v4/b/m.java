package android.support.v4.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
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

/* compiled from: ModernAsyncTask */
abstract class m<Params, Progress, Result> {
    private static final ThreadFactory a = new ThreadFactory() {
        private final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
    public static final Executor c = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, b, a);
    private static b d;
    private static volatile Executor e = c;
    private final d<Params, Result> f = new d<Params, Result>(this) {
        final /* synthetic */ m a;

        {
            this.a = r2;
        }

        public Result call() throws Exception {
            this.a.i.set(true);
            Process.setThreadPriority(10);
            return this.a.d(this.a.a(this.b));
        }
    };
    private final FutureTask<Result> g = new FutureTask<Result>(this, this.f) {
        final /* synthetic */ m a;

        protected void done() {
            try {
                this.a.c(get());
            } catch (Throwable e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException e3) {
                this.a.c(null);
            } catch (Throwable e4) {
                RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", e4);
            }
        }
    };
    private volatile c h = c.PENDING;
    private final AtomicBoolean i = new AtomicBoolean();

    /* compiled from: ModernAsyncTask */
    private static abstract class d<Params, Result> implements Callable<Result> {
        Params[] b;

        private d() {
        }
    }

    /* compiled from: ModernAsyncTask */
    private static class a<Data> {
        final m a;
        final Data[] b;

        a(m mVar, Data... dataArr) {
            this.a = mVar;
            this.b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask */
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

    /* compiled from: ModernAsyncTask */
    public enum c {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result a(Params... paramsArr);

    private static Handler a() {
        Handler handler;
        synchronized (m.class) {
            if (d == null) {
                d = new b();
            }
            handler = d;
        }
        return handler;
    }

    private void c(Result result) {
        if (!this.i.get()) {
            d(result);
        }
    }

    private Result d(Result result) {
        a().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    protected void b() {
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
        return this.g.isCancelled();
    }

    public final boolean a(boolean z) {
        return this.g.cancel(z);
    }

    public final m<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.h != c.PENDING) {
            switch (this.h) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.h = c.RUNNING;
        b();
        this.f.b = paramsArr;
        executor.execute(this.g);
        return this;
    }

    private void e(Result result) {
        if (d()) {
            b((Object) result);
        } else {
            a((Object) result);
        }
        this.h = c.FINISHED;
    }
}
