package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: ViewPropertyAnimatorCompat */
public final class az {
    static final g a;
    private WeakReference<View> b;
    private Runnable c = null;
    private Runnable d = null;
    private int e = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    interface g {
        long a(az azVar, View view);

        void a(az azVar, View view, float f);

        void a(az azVar, View view, long j);

        void a(az azVar, View view, bd bdVar);

        void a(az azVar, View view, bf bfVar);

        void a(az azVar, View view, Interpolator interpolator);

        void b(az azVar, View view);

        void b(az azVar, View view, float f);

        void b(az azVar, View view, long j);

        void c(az azVar, View view);

        void c(az azVar, View view, float f);
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class a implements g {
        WeakHashMap<View, Runnable> a = null;

        /* compiled from: ViewPropertyAnimatorCompat */
        class a implements Runnable {
            WeakReference<View> a;
            az b;
            final /* synthetic */ a c;

            private a(a aVar, az azVar, View view) {
                this.c = aVar;
                this.a = new WeakReference(view);
                this.b = azVar;
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

        public void a(az azVar, View view, long j) {
        }

        public void a(az azVar, View view, float f) {
            e(azVar, view);
        }

        public void b(az azVar, View view, float f) {
            e(azVar, view);
        }

        public void c(az azVar, View view, float f) {
            e(azVar, view);
        }

        public long a(az azVar, View view) {
            return 0;
        }

        public void a(az azVar, View view, Interpolator interpolator) {
        }

        public void b(az azVar, View view, long j) {
        }

        public void b(az azVar, View view) {
            e(azVar, view);
        }

        public void c(az azVar, View view) {
            a(view);
            d(azVar, view);
        }

        public void a(az azVar, View view, bd bdVar) {
            view.setTag(2113929216, bdVar);
        }

        public void a(az azVar, View view, bf bfVar) {
        }

        private void d(az azVar, View view) {
            bd bdVar;
            Object tag = view.getTag(2113929216);
            if (tag instanceof bd) {
                bdVar = (bd) tag;
            } else {
                bdVar = null;
            }
            Runnable a = azVar.c;
            Runnable b = azVar.d;
            azVar.c = null;
            azVar.d = null;
            if (a != null) {
                a.run();
            }
            if (bdVar != null) {
                bdVar.onAnimationStart(view);
                bdVar.onAnimationEnd(view);
            }
            if (b != null) {
                b.run();
            }
            if (this.a != null) {
                this.a.remove(view);
            }
        }

        private void a(View view) {
            if (this.a != null) {
                Runnable runnable = (Runnable) this.a.get(view);
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
            }
        }

        private void e(az azVar, View view) {
            Runnable runnable;
            if (this.a != null) {
                runnable = (Runnable) this.a.get(view);
            } else {
                runnable = null;
            }
            if (runnable == null) {
                runnable = new a(azVar, view);
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                this.a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class b extends a {
        WeakHashMap<View, Integer> b = null;

        /* compiled from: ViewPropertyAnimatorCompat */
        static class a implements bd {
            az a;
            boolean b;

            a(az azVar) {
                this.a = azVar;
            }

            public void onAnimationStart(View view) {
                bd bdVar;
                this.b = false;
                if (this.a.e >= 0) {
                    ah.a(view, 2, null);
                }
                if (this.a.c != null) {
                    Runnable a = this.a.c;
                    this.a.c = null;
                    a.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof bd) {
                    bdVar = (bd) tag;
                } else {
                    bdVar = null;
                }
                if (bdVar != null) {
                    bdVar.onAnimationStart(view);
                }
            }

            public void onAnimationEnd(View view) {
                if (this.a.e >= 0) {
                    ah.a(view, this.a.e, null);
                    this.a.e = -1;
                }
                if (VERSION.SDK_INT >= 16 || !this.b) {
                    bd bdVar;
                    if (this.a.d != null) {
                        Runnable b = this.a.d;
                        this.a.d = null;
                        b.run();
                    }
                    Object tag = view.getTag(2113929216);
                    if (tag instanceof bd) {
                        bdVar = (bd) tag;
                    } else {
                        bdVar = null;
                    }
                    if (bdVar != null) {
                        bdVar.onAnimationEnd(view);
                    }
                    this.b = true;
                }
            }

            public void onAnimationCancel(View view) {
                bd bdVar;
                Object tag = view.getTag(2113929216);
                if (tag instanceof bd) {
                    bdVar = (bd) tag;
                } else {
                    bdVar = null;
                }
                if (bdVar != null) {
                    bdVar.onAnimationCancel(view);
                }
            }
        }

        b() {
        }

        public void a(az azVar, View view, long j) {
            ba.a(view, j);
        }

        public void a(az azVar, View view, float f) {
            ba.a(view, f);
        }

        public void b(az azVar, View view, float f) {
            ba.b(view, f);
        }

        public void c(az azVar, View view, float f) {
            ba.c(view, f);
        }

        public long a(az azVar, View view) {
            return ba.a(view);
        }

        public void a(az azVar, View view, Interpolator interpolator) {
            ba.a(view, interpolator);
        }

        public void b(az azVar, View view, long j) {
            ba.b(view, j);
        }

        public void b(az azVar, View view) {
            ba.b(view);
        }

        public void c(az azVar, View view) {
            ba.c(view);
        }

        public void a(az azVar, View view, bd bdVar) {
            view.setTag(2113929216, bdVar);
            ba.a(view, new a(azVar));
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class d extends b {
        d() {
        }

        public void a(az azVar, View view, bd bdVar) {
            bb.a(view, bdVar);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class c extends d {
        c() {
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class e extends c {
        e() {
        }

        public void a(az azVar, View view, bf bfVar) {
            bc.a(view, bfVar);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class f extends e {
        f() {
        }
    }

    az(View view) {
        this.b = new WeakReference(view);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new f();
        } else if (i >= 19) {
            a = new e();
        } else if (i >= 18) {
            a = new c();
        } else if (i >= 16) {
            a = new d();
        } else if (i >= 14) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public az a(long j) {
        View view = (View) this.b.get();
        if (view != null) {
            a.a(this, view, j);
        }
        return this;
    }

    public az a(float f) {
        View view = (View) this.b.get();
        if (view != null) {
            a.a(this, view, f);
        }
        return this;
    }

    public az b(float f) {
        View view = (View) this.b.get();
        if (view != null) {
            a.b(this, view, f);
        }
        return this;
    }

    public az c(float f) {
        View view = (View) this.b.get();
        if (view != null) {
            a.c(this, view, f);
        }
        return this;
    }

    public long a() {
        View view = (View) this.b.get();
        if (view != null) {
            return a.a(this, view);
        }
        return 0;
    }

    public az a(Interpolator interpolator) {
        View view = (View) this.b.get();
        if (view != null) {
            a.a(this, view, interpolator);
        }
        return this;
    }

    public az b(long j) {
        View view = (View) this.b.get();
        if (view != null) {
            a.b(this, view, j);
        }
        return this;
    }

    public void b() {
        View view = (View) this.b.get();
        if (view != null) {
            a.b(this, view);
        }
    }

    public void c() {
        View view = (View) this.b.get();
        if (view != null) {
            a.c(this, view);
        }
    }

    public az a(bd bdVar) {
        View view = (View) this.b.get();
        if (view != null) {
            a.a(this, view, bdVar);
        }
        return this;
    }

    public az a(bf bfVar) {
        View view = (View) this.b.get();
        if (view != null) {
            a.a(this, view, bfVar);
        }
        return this;
    }
}
