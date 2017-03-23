package a.a.a.a;

import a.a.a.a.a.b.t;
import a.a.a.a.a.c.e;
import a.a.a.a.a.c.f;
import a.a.a.a.a.c.m;

/* compiled from: InitializationTask */
class h<Result> extends f<Void, Void, Result> {
    final i<Result> a;

    public h(i<Result> iVar) {
        this.a = iVar;
    }

    protected void a() {
        super.a();
        t a = a("onPreExecute");
        try {
            boolean onPreExecute = this.a.onPreExecute();
            a.b();
            if (!onPreExecute) {
                a(true);
            }
        } catch (m e) {
            throw e;
        } catch (Throwable e2) {
            c.h().e("Fabric", "Failure onPreExecute()", e2);
            a.b();
            a(true);
        } catch (Throwable th) {
            a.b();
            a(true);
        }
    }

    protected Result a(Void... voidArr) {
        t a = a("doInBackground");
        Result result = null;
        if (!d()) {
            result = this.a.doInBackground();
        }
        a.b();
        return result;
    }

    protected void a(Result result) {
        this.a.onPostExecute(result);
        this.a.initializationCallback.a((Object) result);
    }

    protected void b(Result result) {
        this.a.onCancelled(result);
        this.a.initializationCallback.a(new g(this.a.getIdentifier() + " Initialization was cancelled"));
    }

    public e getPriority() {
        return e.HIGH;
    }

    private t a(String str) {
        t tVar = new t(this.a.getIdentifier() + "." + str, "KitInitialization");
        tVar.a();
        return tVar;
    }
}
