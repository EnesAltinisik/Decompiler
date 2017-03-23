package android.support.v4.view.a;

import android.os.Build.VERSION;

public class n {
    private static final c a;
    private final Object b;

    interface c {
        void a(Object obj, int i);

        void a(Object obj, boolean z);

        void b(Object obj, int i);

        void c(Object obj, int i);

        void d(Object obj, int i);

        void e(Object obj, int i);

        void f(Object obj, int i);

        void g(Object obj, int i);
    }

    static class e implements c {
        e() {
        }

        public void a(Object obj, int i) {
        }

        public void a(Object obj, boolean z) {
        }

        public void b(Object obj, int i) {
        }

        public void c(Object obj, int i) {
        }

        public void d(Object obj, int i) {
        }

        public void e(Object obj, int i) {
        }

        public void f(Object obj, int i) {
        }

        public void g(Object obj, int i) {
        }
    }

    static class a extends e {
        a() {
        }

        public void a(Object obj, int i) {
            o.a(obj, i);
        }

        public void a(Object obj, boolean z) {
            o.a(obj, z);
        }

        public void b(Object obj, int i) {
            o.b(obj, i);
        }

        public void c(Object obj, int i) {
            o.c(obj, i);
        }

        public void d(Object obj, int i) {
            o.d(obj, i);
        }

        public void e(Object obj, int i) {
            o.e(obj, i);
        }
    }

    static class b extends a {
        b() {
        }

        public void f(Object obj, int i) {
            p.a(obj, i);
        }

        public void g(Object obj, int i) {
            p.b(obj, i);
        }
    }

    static class d extends b {
        d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new d();
        } else if (VERSION.SDK_INT >= 15) {
            a = new b();
        } else if (VERSION.SDK_INT >= 14) {
            a = new a();
        } else {
            a = new e();
        }
    }

    @Deprecated
    public n(Object obj) {
        this.b = obj;
    }

    public void a(int i) {
        a.b(this.b, i);
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    public void b(int i) {
        a.a(this.b, i);
    }

    public void c(int i) {
        a.e(this.b, i);
    }

    public void d(int i) {
        a.c(this.b, i);
    }

    public void e(int i) {
        a.d(this.b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.b == null ? nVar.b == null : this.b.equals(nVar.b);
    }

    public void f(int i) {
        a.f(this.b, i);
    }

    public void g(int i) {
        a.g(this.b, i);
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }
}
