package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.R;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

class f extends h {
    m a;
    private final p q = new p();

    private abstract class d extends b implements c {
        private boolean a;
        final /* synthetic */ f b;
        private float c;
        private float d;

        private d(f fVar) {
            this.b = fVar;
        }

        protected abstract float a();

        public void a(s sVar) {
            if (!this.a) {
                this.c = this.b.a.a();
                this.d = a();
                this.a = true;
            }
            this.b.a.b(this.c + ((this.d - this.c) * sVar.e()));
        }

        public void b(s sVar) {
            this.b.a.b(this.d);
            this.a = false;
        }
    }

    private class a extends d {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
            super();
        }

        protected float a() {
            return 0.0f;
        }
    }

    private class b extends d {
        final /* synthetic */ f a;

        b(f fVar) {
            this.a = fVar;
            super();
        }

        protected float a() {
            return this.a.h + this.a.i;
        }
    }

    private class c extends d {
        final /* synthetic */ f a;

        c(f fVar) {
            this.a = fVar;
            super();
        }

        protected float a() {
            return this.a.h;
        }
    }

    f(ab abVar, n nVar, d dVar) {
        super(abVar, nVar, dVar);
        this.q.a(j, a(new b(this)));
        this.q.a(k, a(new b(this)));
        this.q.a(l, a(new c(this)));
        this.q.a(m, a(new a(this)));
    }

    private s a(d dVar) {
        s a = this.p.a();
        a.a(b);
        a.a(100);
        a.a((a) dVar);
        a.a((c) dVar);
        a.a(0.0f, 1.0f);
        return a;
    }

    private static ColorStateList b(int i) {
        r0 = new int[3][];
        int[] iArr = new int[]{k, i, j};
        iArr[1] = i;
        r0[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r0, iArr);
    }

    float a() {
        return this.h;
    }

    void a(float f, float f2) {
        if (this.a != null) {
            this.a.a(f, this.i + f);
            g();
        }
    }

    void a(int i) {
        if (this.e != null) {
            android.support.v4.d.a.a.a(this.e, b(i));
        }
    }

    void a(ColorStateList colorStateList) {
        if (this.d != null) {
            android.support.v4.d.a.a.a(this.d, colorStateList);
        }
        if (this.f != null) {
            this.f.a(colorStateList);
        }
    }

    void a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.d = android.support.v4.d.a.a.f(k());
        android.support.v4.d.a.a.a(this.d, colorStateList);
        if (mode != null) {
            android.support.v4.d.a.a.a(this.d, mode);
        }
        this.e = android.support.v4.d.a.a.f(k());
        android.support.v4.d.a.a.a(this.e, b(i));
        if (i2 > 0) {
            this.f = a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f, this.d, this.e};
        } else {
            this.f = null;
            drawableArr = new Drawable[]{this.d, this.e};
        }
        this.g = new LayerDrawable(drawableArr);
        this.a = new m(this.n.getContext(), this.g, this.o.a(), this.h, this.h + this.i);
        this.a.a(false);
        this.o.a(this.a);
    }

    void a(Mode mode) {
        if (this.d != null) {
            android.support.v4.d.a.a.a(this.d, mode);
        }
    }

    void a(Rect rect) {
        this.a.getPadding(rect);
    }

    void a(final a aVar, final boolean z) {
        if (!n()) {
            this.c = 1;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.n.getContext(), R.anim.design_fab_out);
            loadAnimation.setInterpolator(a.c);
            loadAnimation.setDuration(200);
            loadAnimation.setAnimationListener(new a(this) {
                final /* synthetic */ f c;

                public void onAnimationEnd(Animation animation) {
                    this.c.c = 0;
                    this.c.n.a(z ? 8 : 4, z);
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
            this.n.startAnimation(loadAnimation);
        }
    }

    void a(int[] iArr) {
        this.q.a(iArr);
    }

    void b() {
        this.q.a();
    }

    void b(final a aVar, boolean z) {
        if (!m()) {
            this.c = 2;
            this.n.a(0, z);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.n.getContext(), R.anim.design_fab_in);
            loadAnimation.setDuration(200);
            loadAnimation.setInterpolator(a.d);
            loadAnimation.setAnimationListener(new a(this) {
                final /* synthetic */ f b;

                public void onAnimationEnd(Animation animation) {
                    this.b.c = 0;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            });
            this.n.startAnimation(loadAnimation);
        }
    }

    void c() {
    }
}
