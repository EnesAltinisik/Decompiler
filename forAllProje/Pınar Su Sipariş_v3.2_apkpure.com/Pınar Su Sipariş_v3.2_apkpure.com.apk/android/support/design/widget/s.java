package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.Interpolator;

/* compiled from: ValueAnimatorCompatImplHoneycombMr1 */
class s extends c {
    final ValueAnimator a = new ValueAnimator();

    s() {
    }

    public void a() {
        this.a.start();
    }

    public boolean b() {
        return this.a.isRunning();
    }

    public void a(Interpolator interpolator) {
        this.a.setInterpolator(interpolator);
    }

    public void a(final b bVar) {
        this.a.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ s b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bVar.a();
            }
        });
    }

    public void a(int i, int i2) {
        this.a.setIntValues(new int[]{i, i2});
    }

    public int c() {
        return ((Integer) this.a.getAnimatedValue()).intValue();
    }

    public void a(float f, float f2) {
        this.a.setFloatValues(new float[]{f, f2});
    }

    public float d() {
        return ((Float) this.a.getAnimatedValue()).floatValue();
    }

    public void a(int i) {
        this.a.setDuration((long) i);
    }

    public void e() {
        this.a.cancel();
    }
}
