package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

class t extends e {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private long b;
    private boolean c;
    private float d;
    private final int[] e = new int[2];
    private final float[] f = new float[2];
    private long g = 200;
    private Interpolator h;
    private ArrayList<a> i;
    private ArrayList<b> j;
    private final Runnable k = new Runnable(this) {
        final /* synthetic */ t a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.i();
        }
    };

    t() {
    }

    private void j() {
        if (this.j != null) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                ((b) this.j.get(i)).a();
            }
        }
    }

    private void k() {
        if (this.i != null) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                ((a) this.i.get(i)).a();
            }
        }
    }

    private void l() {
        if (this.i != null) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                ((a) this.i.get(i)).c();
            }
        }
    }

    private void m() {
        if (this.i != null) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                ((a) this.i.get(i)).b();
            }
        }
    }

    public void a() {
        if (!this.c) {
            if (this.h == null) {
                this.h = new AccelerateDecelerateInterpolator();
            }
            this.c = true;
            this.d = 0.0f;
            h();
        }
    }

    public void a(float f, float f2) {
        this.f[0] = f;
        this.f[1] = f2;
    }

    public void a(int i, int i2) {
        this.e[0] = i;
        this.e[1] = i2;
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(a aVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(aVar);
    }

    public void a(b bVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(bVar);
    }

    public void a(Interpolator interpolator) {
        this.h = interpolator;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return a.a(this.e[0], this.e[1], e());
    }

    public void d() {
        this.c = false;
        a.removeCallbacks(this.k);
        l();
        m();
    }

    public float e() {
        return this.d;
    }

    public void f() {
        if (this.c) {
            this.c = false;
            a.removeCallbacks(this.k);
            this.d = 1.0f;
            j();
            m();
        }
    }

    public long g() {
        return this.g;
    }

    final void h() {
        this.b = SystemClock.uptimeMillis();
        j();
        k();
        a.postDelayed(this.k, 10);
    }

    final void i() {
        if (this.c) {
            float a = l.a(((float) (SystemClock.uptimeMillis() - this.b)) / ((float) this.g), 0.0f, 1.0f);
            if (this.h != null) {
                a = this.h.getInterpolation(a);
            }
            this.d = a;
            j();
            if (SystemClock.uptimeMillis() >= this.b + this.g) {
                this.c = false;
                m();
            }
        }
        if (this.c) {
            a.postDelayed(this.k, 10);
        }
    }
}
