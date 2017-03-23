package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;

@TargetApi(12)
class u extends e {
    private final ValueAnimator a = new ValueAnimator();

    u() {
    }

    public void a() {
        this.a.start();
    }

    public void a(float f, float f2) {
        this.a.setFloatValues(new float[]{f, f2});
    }

    public void a(int i, int i2) {
        this.a.setIntValues(new int[]{i, i2});
    }

    public void a(long j) {
        this.a.setDuration(j);
    }

    public void a(final a aVar) {
        this.a.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ u b;

            public void onAnimationCancel(Animator animator) {
                aVar.c();
            }

            public void onAnimationEnd(Animator animator) {
                aVar.b();
            }

            public void onAnimationStart(Animator animator) {
                aVar.a();
            }
        });
    }

    public void a(final b bVar) {
        this.a.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ u b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bVar.a();
            }
        });
    }

    public void a(Interpolator interpolator) {
        this.a.setInterpolator(interpolator);
    }

    public boolean b() {
        return this.a.isRunning();
    }

    public int c() {
        return ((Integer) this.a.getAnimatedValue()).intValue();
    }

    public void d() {
        this.a.cancel();
    }

    public float e() {
        return this.a.getAnimatedFraction();
    }

    public void f() {
        this.a.end();
    }

    public long g() {
        return this.a.getDuration();
    }
}
