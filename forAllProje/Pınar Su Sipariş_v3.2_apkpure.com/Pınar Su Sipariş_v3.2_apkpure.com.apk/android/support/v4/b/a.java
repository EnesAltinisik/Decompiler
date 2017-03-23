package android.support.v4.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.f.c;
import android.support.v4.h.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader */
public abstract class a<D> extends l<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a mTask;
    long mUpdateThrottle;

    /* compiled from: AsyncTaskLoader */
    final class a extends m<Void, Void, D> implements Runnable {
        boolean a;
        final /* synthetic */ a b;
        private final CountDownLatch d = new CountDownLatch(1);

        a(a aVar) {
            this.b = aVar;
        }

        protected D a(Void... voidArr) {
            try {
                return this.b.onLoadInBackground();
            } catch (c e) {
                if (d()) {
                    return null;
                }
                throw e;
            }
        }

        protected void a(D d) {
            try {
                this.b.dispatchOnLoadComplete(this, d);
            } finally {
                this.d.countDown();
            }
        }

        protected void b(D d) {
            try {
                this.b.dispatchOnCancelled(this, d);
            } finally {
                this.d.countDown();
            }
        }

        public void run() {
            this.a = false;
            this.b.executePendingTask();
        }

        public void a() {
            try {
                this.d.await();
            } catch (InterruptedException e) {
            }
        }
    }

    public abstract D loadInBackground();

    public a(Context context) {
        this(context, m.c);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new a(this);
        executePendingTask();
    }

    protected boolean onCancelLoad() {
        boolean z = false;
        if (this.mTask != null) {
            if (this.mCancellingTask != null) {
                if (this.mTask.a) {
                    this.mTask.a = false;
                    this.mHandler.removeCallbacks(this.mTask);
                }
                this.mTask = null;
            } else if (this.mTask.a) {
                this.mTask.a = false;
                this.mHandler.removeCallbacks(this.mTask);
                this.mTask = null;
            } else {
                z = this.mTask.a(false);
                if (z) {
                    this.mCancellingTask = this.mTask;
                    cancelLoadInBackground();
                }
                this.mTask = null;
            }
        }
        return z;
    }

    public void onCanceled(D d) {
    }

    void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.a) {
                this.mTask.a = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.a(this.mExecutor, (Object[]) (Void[]) null);
                return;
            }
            this.mTask.a = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    void dispatchOnCancelled(a aVar, D d) {
        onCanceled(d);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(a aVar, D d) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public void cancelLoadInBackground() {
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public void waitForLoader() {
        a aVar = this.mTask;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.a);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.a);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            l.a(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            l.a(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
