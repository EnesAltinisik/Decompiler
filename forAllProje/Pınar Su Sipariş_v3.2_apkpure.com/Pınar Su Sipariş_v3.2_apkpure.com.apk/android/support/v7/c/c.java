package android.support.v7.c;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* compiled from: MediaRouteProvider */
public abstract class c {
    private final Context a;
    private final c b;
    private final b c = new b();
    private a d;
    private b e;
    private boolean f;
    private d g;
    private boolean h;

    /* compiled from: MediaRouteProvider */
    public static abstract class a {
        public void a(c cVar, d dVar) {
        }
    }

    /* compiled from: MediaRouteProvider */
    private final class b extends Handler {
        final /* synthetic */ c a;

        private b(c cVar) {
            this.a = cVar;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.g();
                    return;
                case 2:
                    this.a.f();
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: MediaRouteProvider */
    public static final class c {
        private final ComponentName a;

        c(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.a = componentName;
        }

        public String a() {
            return this.a.getPackageName();
        }

        public ComponentName b() {
            return this.a;
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
        }
    }

    /* compiled from: MediaRouteProvider */
    public static abstract class d {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void a(int i) {
            c();
        }

        public void b(int i) {
        }

        public void c(int i) {
        }
    }

    c(Context context, c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.a = context;
        if (cVar == null) {
            this.b = new c(new ComponentName(context, getClass()));
        } else {
            this.b = cVar;
        }
    }

    public final Context a() {
        return this.a;
    }

    public final Handler b() {
        return this.c;
    }

    public final c c() {
        return this.b;
    }

    public final void a(a aVar) {
        g.e();
        this.d = aVar;
    }

    public final b d() {
        return this.e;
    }

    public final void a(b bVar) {
        g.e();
        if (this.e == bVar) {
            return;
        }
        if (this.e == null || !this.e.equals(bVar)) {
            this.e = bVar;
            if (!this.f) {
                this.f = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }

    private void f() {
        this.f = false;
        b(this.e);
    }

    public void b(b bVar) {
    }

    public final d e() {
        return this.g;
    }

    public final void a(d dVar) {
        g.e();
        if (this.g != dVar) {
            this.g = dVar;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    private void g() {
        this.h = false;
        if (this.d != null) {
            this.d.a(this, this.g);
        }
    }

    public d a(String str) {
        return null;
    }
}
