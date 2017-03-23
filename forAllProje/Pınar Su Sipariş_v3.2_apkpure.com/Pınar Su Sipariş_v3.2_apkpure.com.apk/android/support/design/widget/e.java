package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* compiled from: FloatingActionButtonEclairMr1 */
class e extends g {
    l a;
    private int m;
    private o n = new o();
    private boolean o;

    /* compiled from: FloatingActionButtonEclairMr1 */
    private abstract class a extends Animation {
        final /* synthetic */ e a;
        private float b;
        private float c;

        protected abstract float a();

        private a(e eVar) {
            this.a = eVar;
        }

        public void reset() {
            super.reset();
            this.b = this.a.a.a();
            this.c = a() - this.b;
        }

        protected void applyTransformation(float f, Transformation transformation) {
            this.a.a.b(this.b + (this.c * f));
        }
    }

    /* compiled from: FloatingActionButtonEclairMr1 */
    private class b extends a {
        final /* synthetic */ e b;

        private b(e eVar) {
            this.b = eVar;
            super();
        }

        protected float a() {
            return this.b.f + this.b.g;
        }
    }

    /* compiled from: FloatingActionButtonEclairMr1 */
    private class c extends a {
        final /* synthetic */ e b;

        private c(e eVar) {
            this.b = eVar;
            super();
        }

        protected float a() {
            return this.b.f;
        }
    }

    e(y yVar, m mVar) {
        super(yVar, mVar);
        this.m = yVar.getResources().getInteger(17694720);
        this.n.a((View) yVar);
        this.n.a(h, a(new b()));
        this.n.a(i, a(new b()));
        this.n.a(j, a(new c()));
    }

    void a(ColorStateList colorStateList) {
        if (this.b != null) {
            android.support.v4.c.a.a.a(this.b, colorStateList);
        }
        if (this.d != null) {
            this.d.a(colorStateList);
        }
    }

    void a(Mode mode) {
        if (this.b != null) {
            android.support.v4.c.a.a.a(this.b, mode);
        }
    }

    void a(int i) {
        if (this.c != null) {
            android.support.v4.c.a.a.a(this.c, b(i));
        }
    }

    float a() {
        return this.f;
    }

    void a(float f) {
        if (this.a != null) {
            this.a.a(f, this.g + f);
            g();
        }
    }

    void a(int[] iArr) {
        this.n.a(iArr);
    }

    void b() {
        this.n.b();
    }

    void a(final a aVar, final boolean z) {
        if (!this.o && this.k.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.k.getContext(), android.support.design.a.a.design_fab_out);
            loadAnimation.setInterpolator(a.c);
            loadAnimation.setDuration(200);
            loadAnimation.setAnimationListener(new a(this) {
                final /* synthetic */ e c;

                public void onAnimationStart(Animation animation) {
                    this.c.o = true;
                }

                public void onAnimationEnd(Animation animation) {
                    this.c.o = false;
                    this.c.k.a(8, z);
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
            this.k.startAnimation(loadAnimation);
        } else if (aVar != null) {
            aVar.b();
        }
    }

    void b(final a aVar, boolean z) {
        if (this.k.getVisibility() != 0 || this.o) {
            this.k.clearAnimation();
            this.k.a(0, z);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.k.getContext(), android.support.design.a.a.design_fab_in);
            loadAnimation.setDuration(200);
            loadAnimation.setInterpolator(a.d);
            loadAnimation.setAnimationListener(new a(this) {
                final /* synthetic */ e b;

                public void onAnimationEnd(Animation animation) {
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            });
            this.k.startAnimation(loadAnimation);
        } else if (aVar != null) {
            aVar.a();
        }
    }

    void c() {
    }

    void a(Rect rect) {
        this.a.getPadding(rect);
    }

    private Animation a(Animation animation) {
        animation.setInterpolator(a.b);
        animation.setDuration((long) this.m);
        return animation;
    }

    private static ColorStateList b(int i) {
        r0 = new int[3][];
        int[] iArr = new int[]{i, i, h};
        iArr[1] = i;
        r0[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r0, iArr);
    }
}
