package a.a.a.a.a.c;

import a.a.a.a.a.c.a.d;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PriorityAsyncTask */
public abstract class f<Params, Progress, Result> extends a<Params, Progress, Result> implements b<l>, i, l {
    private final j a = new j();

    /* compiled from: PriorityAsyncTask */
    private static class a<Result> implements Executor {
        private final Executor a;
        private final f b;

        public a(Executor executor, f fVar) {
            this.a = executor;
            this.b = fVar;
        }

        public void execute(Runnable runnable) {
            this.a.execute(new h<Result>(this, runnable, null) {
                final /* synthetic */ a a;

                public <T extends b<l> & i & l> T a() {
                    return this.a.b;
                }
            });
        }
    }

    public /* synthetic */ void addDependency(Object obj) {
        a((l) obj);
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a(new a(executorService, this), (Object[]) paramsArr);
    }

    public int compareTo(Object obj) {
        return e.a(this, obj);
    }

    public void a(l lVar) {
        if (b() != d.PENDING) {
            throw new IllegalStateException("Must not add Dependency after task is running");
        }
        ((b) ((i) e())).addDependency(lVar);
    }

    public Collection<l> getDependencies() {
        return ((b) ((i) e())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((b) ((i) e())).areDependenciesMet();
    }

    public e getPriority() {
        return ((i) e()).getPriority();
    }

    public void setFinished(boolean z) {
        ((l) ((i) e())).setFinished(z);
    }

    public boolean isFinished() {
        return ((l) ((i) e())).isFinished();
    }

    public void setError(Throwable th) {
        ((l) ((i) e())).setError(th);
    }

    public <T extends b<l> & i & l> T e() {
        return this.a;
    }
}
