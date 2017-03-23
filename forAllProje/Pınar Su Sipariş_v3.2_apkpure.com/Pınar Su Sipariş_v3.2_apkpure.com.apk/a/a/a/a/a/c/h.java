package a.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: PriorityFutureTask */
public class h<V> extends FutureTask<V> implements b<l>, i, l {
    final Object b;

    public /* synthetic */ void addDependency(Object obj) {
        a((l) obj);
    }

    public h(Callable<V> callable) {
        super(callable);
        this.b = a((Object) callable);
    }

    public h(Runnable runnable, V v) {
        super(runnable, v);
        this.b = a((Object) runnable);
    }

    public int compareTo(Object obj) {
        return ((i) a()).compareTo(obj);
    }

    public void a(l lVar) {
        ((b) ((i) a())).addDependency(lVar);
    }

    public Collection<l> getDependencies() {
        return ((b) ((i) a())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((b) ((i) a())).areDependenciesMet();
    }

    public e getPriority() {
        return ((i) a()).getPriority();
    }

    public void setFinished(boolean z) {
        ((l) ((i) a())).setFinished(z);
    }

    public boolean isFinished() {
        return ((l) ((i) a())).isFinished();
    }

    public void setError(Throwable th) {
        ((l) ((i) a())).setError(th);
    }

    public <T extends b<l> & i & l> T a() {
        return (b) this.b;
    }

    protected <T extends b<l> & i & l> T a(Object obj) {
        if (j.isProperDelegate(obj)) {
            return (b) obj;
        }
        return new j();
    }
}
