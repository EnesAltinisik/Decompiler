package a.a.a.a;

import a.a.a.a.a.b.o;
import a.a.a.a.a.c.d;
import a.a.a.a.a.c.l;
import android.content.Context;
import java.io.File;
import java.util.Collection;

/* compiled from: Kit */
public abstract class i<Result> implements Comparable<i> {
    Context context;
    c fabric;
    o idManager;
    f<Result> initializationCallback;
    h<Result> initializationTask = new h(this);

    protected abstract Result doInBackground();

    public abstract String getIdentifier();

    public abstract String getVersion();

    void injectParameters(Context context, c cVar, f<Result> fVar, o oVar) {
        this.fabric = cVar;
        this.context = new d(context, getIdentifier(), getPath());
        this.initializationCallback = fVar;
        this.idManager = oVar;
    }

    final void initialize() {
        this.initializationTask.a(this.fabric.f(), (Void) null);
    }

    protected boolean onPreExecute() {
        return true;
    }

    protected void onPostExecute(Result result) {
    }

    protected void onCancelled(Result result) {
    }

    protected o getIdManager() {
        return this.idManager;
    }

    public Context getContext() {
        return this.context;
    }

    public c getFabric() {
        return this.fabric;
    }

    public String getPath() {
        return ".Fabric" + File.separator + getIdentifier();
    }

    public int compareTo(i iVar) {
        if (containsAnnotatedDependency(iVar)) {
            return 1;
        }
        if (iVar.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !iVar.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || !iVar.hasAnnotatedDependency()) {
            return 0;
        }
        return -1;
    }

    boolean containsAnnotatedDependency(i iVar) {
        d dVar = (d) getClass().getAnnotation(d.class);
        if (dVar != null) {
            for (Object equals : dVar.a()) {
                if (equals.equals(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean hasAnnotatedDependency() {
        return ((d) getClass().getAnnotation(d.class)) != null;
    }

    protected Collection<l> getDependencies() {
        return this.initializationTask.getDependencies();
    }
}
