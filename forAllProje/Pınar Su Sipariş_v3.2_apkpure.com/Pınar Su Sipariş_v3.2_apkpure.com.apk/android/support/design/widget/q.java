package android.support.design.widget;

import android.view.animation.Interpolator;

/* compiled from: ValueAnimatorCompat */
class q {
    private final c a;

    /* compiled from: ValueAnimatorCompat */
    interface a {
        void a(q qVar);
    }

    /* compiled from: ValueAnimatorCompat */
    interface b {
        q a();
    }

    /* compiled from: ValueAnimatorCompat */
    static abstract class c {

        /* compiled from: ValueAnimatorCompat */
        interface b {
            void a();
        }

        /* compiled from: ValueAnimatorCompat */
        interface a {
            void a();

            void b();

            void c();
        }

        abstract void a();

        abstract void a(float f, float f2);

        abstract void a(int i);

        abstract void a(int i, int i2);

        abstract void a(b bVar);

        abstract void a(Interpolator interpolator);

        abstract boolean b();

        abstract int c();

        abstract float d();

        abstract void e();

        c() {
        }
    }

    q(c cVar) {
        this.a = cVar;
    }

    public void a() {
        this.a.a();
    }

    public boolean b() {
        return this.a.b();
    }

    public void a(Interpolator interpolator) {
        this.a.a(interpolator);
    }

    public void a(final a aVar) {
        if (aVar != null) {
            this.a.a(new b(this) {
                final /* synthetic */ q b;

                public void a() {
                    aVar.a(this.b);
                }
            });
        } else {
            this.a.a(null);
        }
    }

    public void a(int i, int i2) {
        this.a.a(i, i2);
    }

    public int c() {
        return this.a.c();
    }

    public void a(float f, float f2) {
        this.a.a(f, f2);
    }

    public float d() {
        return this.a.d();
    }

    public void a(int i) {
        this.a.a(i);
    }

    public void e() {
        this.a.e();
    }
}
