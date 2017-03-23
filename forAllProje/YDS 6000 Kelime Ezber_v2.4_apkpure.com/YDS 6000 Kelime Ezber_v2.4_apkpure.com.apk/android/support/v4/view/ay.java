package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ay {
    static final g d;
    Runnable a = null;
    Runnable b = null;
    int c = -1;
    private WeakReference<View> e;

    interface g {
        long a(ay ayVar, View view);

        void a(ay ayVar, View view, float f);

        void a(ay ayVar, View view, long j);

        void a(ay ayVar, View view, bc bcVar);

        void a(ay ayVar, View view, be beVar);

        void a(ay ayVar, View view, Interpolator interpolator);

        void b(ay ayVar, View view);

        void b(ay ayVar, View view, float f);

        void b(ay ayVar, View view, long j);

        void c(ay ayVar, View view);

        void c(ay ayVar, View view, float f);
    }

    static class a implements g {
        WeakHashMap<View, Runnable> a = null;

        class a implements Runnable {
            WeakReference<View> a;
            ay b;
            final /* synthetic */ a c;

            a(a aVar, ay ayVar, View view) {
                this.c = aVar;
                this.a = new WeakReference(view);
                this.b = ayVar;
            }

            public void run() {
                View view = (View) this.a.get();
                if (view != null) {
                    this.c.d(this.b, view);
                }
            }
        }

        a() {
        }

        private void a(View view) {
            if (this.a != null) {
                Runnable runnable = (Runnable) this.a.get(view);
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
            }
        }

        private void e(ay ayVar, View view) {
            Runnable runnable = null;
            if (this.a != null) {
                runnable = (Runnable) this.a.get(view);
            }
            if (runnable == null) {
                runnable = new a(this, ayVar, view);
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                this.a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }

        public long a(ay ayVar, View view) {
            return 0;
        }

        public void a(ay ayVar, View view, float f) {
            e(ayVar, view);
        }

        public void a(ay ayVar, View view, long j) {
        }

        public void a(ay ayVar, View view, bc bcVar) {
            view.setTag(2113929216, bcVar);
        }

        public void a(ay ayVar, View view, be beVar) {
        }

        public void a(ay ayVar, View view, Interpolator interpolator) {
        }

        public void b(ay ayVar, View view) {
            e(ayVar, view);
        }

        public void b(ay ayVar, View view, float f) {
            e(ayVar, view);
        }

        public void b(ay ayVar, View view, long j) {
        }

        public void c(ay ayVar, View view) {
            a(view);
            d(ayVar, view);
        }

        public void c(ay ayVar, View view, float f) {
            e(ayVar, view);
        }

        void d(ay ayVar, View view) {
            Object tag = view.getTag(2113929216);
            bc bcVar = tag instanceof bc ? (bc) tag : null;
            Runnable runnable = ayVar.a;
            Runnable runnable2 = ayVar.b;
            ayVar.a = null;
            ayVar.b = null;
            if (runnable != null) {
                runnable.run();
            }
            if (bcVar != null) {
                bcVar.a(view);
                bcVar.b(view);
            }
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.a != null) {
                this.a.remove(view);
            }
        }
    }

    static class b extends a {
        WeakHashMap<View, Integer> b = null;

        static class a implements bc {
            ay a;
            boolean b;

            a(ay ayVar) {
                this.a = ayVar;
            }

            public void a(View view) {
                this.b = false;
                if (this.a.c >= 0) {
                    ah.a(view, 2, null);
                }
                if (this.a.a != null) {
                    Runnable runnable = this.a.a;
                    this.a.a = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                bc bcVar = tag instanceof bc ? (bc) tag : null;
                if (bcVar != null) {
                    bcVar.a(view);
                }
            }

            public void b(View view) {
                if (this.a.c >= 0) {
                    ah.a(view, this.a.c, null);
                    this.a.c = -1;
                }
                if (VERSION.SDK_INT >= 16 || !this.b) {
                    if (this.a.b != null) {
                        Runnable runnable = this.a.b;
                        this.a.b = null;
                        runnable.run();
                    }
                    Object tag = view.getTag(2113929216);
                    bc bcVar = tag instanceof bc ? (bc) tag : null;
                    if (bcVar != null) {
                        bcVar.b(view);
                    }
                    this.b = true;
                }
            }

            public void c(View view) {
                Object tag = view.getTag(2113929216);
                bc bcVar = tag instanceof bc ? (bc) tag : null;
                if (bcVar != null) {
                    bcVar.c(view);
                }
            }
        }

        b() {
        }

        public long a(ay ayVar, View view) {
            return az.a(view);
        }

        public void a(ay ayVar, View view, float f) {
            az.a(view, f);
        }

        public void a(ay ayVar, View view, long j) {
            az.a(view, j);
        }

        public void a(ay ayVar, View view, bc bcVar) {
            view.setTag(2113929216, bcVar);
            az.a(view, new a(ayVar));
        }

        public void a(ay ayVar, View view, Interpolator interpolator) {
            az.a(view, interpolator);
        }

        public void b(ay ayVar, View view) {
            az.b(view);
        }

        public void b(ay ayVar, View view, float f) {
            az.b(view, f);
        }

        public void b(ay ayVar, View view, long j) {
            az.b(view, j);
        }

        public void c(ay ayVar, View view) {
            az.c(view);
        }

        public void c(ay ayVar, View view, float f) {
            az.c(view, f);
        }
    }

    static class d extends b {
        d() {
        }

        public void a(ay ayVar, View view, bc bcVar) {
            ba.a(view, bcVar);
        }
    }

    static class c extends d {
        c() {
        }
    }

    static class e extends c {
        e() {
        }

        public void a(ay ayVar, View view, be beVar) {
            bb.a(view, beVar);
        }
    }

    static class f extends e {
        f() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            d = new f();
        } else if (i >= 19) {
            d = new e();
        } else if (i >= 18) {
            d = new c();
        } else if (i >= 16) {
            d = new d();
        } else if (i >= 14) {
            d = new b();
        } else {
            d = new a();
        }
    }

    ay(View view) {
        this.e = new WeakReference(view);
    }

    public long a() {
        View view = (View) this.e.get();
        return view != null ? d.a(this, view) : 0;
    }

    public ay a(float f) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, f);
        }
        return this;
    }

    public ay a(long j) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, j);
        }
        return this;
    }

    public ay a(bc bcVar) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, bcVar);
        }
        return this;
    }

    public ay a(be beVar) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, beVar);
        }
        return this;
    }

    public ay a(Interpolator interpolator) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, interpolator);
        }
        return this;
    }

    public ay b(float f) {
        View view = (View) this.e.get();
        if (view != null) {
            d.b(this, view, f);
        }
        return this;
    }

    public ay b(long j) {
        View view = (View) this.e.get();
        if (view != null) {
            d.b(this, view, j);
        }
        return this;
    }

    public void b() {
        View view = (View) this.e.get();
        if (view != null) {
            d.b(this, view);
        }
    }

    public ay c(float f) {
        View view = (View) this.e.get();
        if (view != null) {
            d.c(this, view, f);
        }
        return this;
    }

    public void c() {
        View view = (View) this.e.get();
        if (view != null) {
            d.c(this, view);
        }
    }
}
