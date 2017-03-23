package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: ValueAnimatorCompatImplEclairMr1 */
class r extends c {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private long b;
    private boolean c;
    private final int[] d = new int[2];
    private final float[] e = new float[2];
    private int f = 200;
    private Interpolator g;
    private a h;
    private b i;
    private float j;
    private final Runnable k = new Runnable(this) {
        final /* synthetic */ r a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.g();
        }
    };

    r() {
    }

    public void a() {
        if (!this.c) {
            if (this.g == null) {
                this.g = new AccelerateDecelerateInterpolator();
            }
            this.b = SystemClock.uptimeMillis();
            this.c = true;
            if (this.h != null) {
                this.h.a();
            }
            a.postDelayed(this.k, 10);
        }
    }

    public boolean b() {
        return this.c;
    }

    public void a(Interpolator interpolator) {
        this.g = interpolator;
    }

    public void a(b bVar) {
        this.i = bVar;
    }

    public void a(int i, int i2) {
        this.d[0] = i;
        this.d[1] = i2;
    }

    public int c() {
        return a.a(this.d[0], this.d[1], f());
    }

    public void a(float f, float f2) {
        this.e[0] = f;
        this.e[1] = f2;
    }

    public float d() {
        return a.a(this.e[0], this.e[1], f());
    }

    public void a(int i) {
        this.f = i;
    }

    public void e() {
        this.c = false;
        a.removeCallbacks(this.k);
        if (this.h != null) {
            this.h.c();
        }
    }

    public float f() {
        return this.j;
    }

    private void g() {
        if (this.c) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / ((float) this.f);
            if (this.g != null) {
                uptimeMillis = this.g.getInterpolation(uptimeMillis);
            }
            this.j = uptimeMillis;
            if (this.i != null) {
                this.i.a();
            }
            if (SystemClock.uptimeMillis() >= this.b + ((long) this.f)) {
                this.c = false;
                if (this.h != null) {
                    this.h.b();
                }
            }
        }
        if (this.c) {
            a.postDelayed(this.k, 10);
        }
    }
}
