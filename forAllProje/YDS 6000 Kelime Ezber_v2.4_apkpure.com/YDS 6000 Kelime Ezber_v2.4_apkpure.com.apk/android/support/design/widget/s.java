package android.support.design.widget;

import android.view.animation.Interpolator;

class s {
    private final e a;

    interface c {
        void a(s sVar);
    }

    interface a {
        void b(s sVar);

        void c(s sVar);

        void d(s sVar);
    }

    static class b implements a {
        b() {
        }

        public void b(s sVar) {
        }

        public void c(s sVar) {
        }

        public void d(s sVar) {
        }
    }

    interface d {
        s a();
    }

    static abstract class e {

        interface b {
            void a();
        }

        interface a {
            void a();

            void b();

            void c();
        }

        e() {
        }

        abstract void a();

        abstract void a(float f, float f2);

        abstract void a(int i, int i2);

        abstract void a(long j);

        abstract void a(a aVar);

        abstract void a(b bVar);

        abstract void a(Interpolator interpolator);

        abstract boolean b();

        abstract int c();

        abstract void d();

        abstract float e();

        abstract void f();

        abstract long g();
    }

    s(e eVar) {
        this.a = eVar;
    }

    public void a() {
        this.a.a();
    }

    public void a(float f, float f2) {
        this.a.a(f, f2);
    }

    public void a(int i, int i2) {
        this.a.a(i, i2);
    }

    public void a(long j) {
        this.a.a(j);
    }

    public void a(final a aVar) {
        if (aVar != null) {
            this.a.a(new a(this) {
                final /* synthetic */ s b;

                public void a() {
                    aVar.c(this.b);
                }

                public void b() {
                    aVar.b(this.b);
                }

                public void c() {
                    aVar.d(this.b);
                }
            });
        } else {
            this.a.a(null);
        }
    }

    public void a(final c cVar) {
        if (cVar != null) {
            this.a.a(new b(this) {
                final /* synthetic */ s b;

                public void a() {
                    cVar.a(this.b);
                }
            });
        } else {
            this.a.a(null);
        }
    }

    public void a(Interpolator interpolator) {
        this.a.a(interpolator);
    }

    public boolean b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public void d() {
        this.a.d();
    }

    public float e() {
        return this.a.e();
    }

    public void f() {
        this.a.f();
    }

    public long g() {
        return this.a.g();
    }
}
