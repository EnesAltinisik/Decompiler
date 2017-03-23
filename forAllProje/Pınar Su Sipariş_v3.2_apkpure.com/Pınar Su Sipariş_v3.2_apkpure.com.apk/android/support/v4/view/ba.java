package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: ViewPropertyAnimatorCompatICS */
class ba {
    public static void a(View view, long j) {
        view.animate().setDuration(j);
    }

    public static void a(View view, float f) {
        view.animate().alpha(f);
    }

    public static void b(View view, float f) {
        view.animate().translationX(f);
    }

    public static void c(View view, float f) {
        view.animate().translationY(f);
    }

    public static long a(View view) {
        return view.animate().getDuration();
    }

    public static void a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    public static void b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    public static void b(View view) {
        view.animate().cancel();
    }

    public static void c(View view) {
        view.animate().start();
    }

    public static void a(final View view, final bd bdVar) {
        if (bdVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    bdVar.onAnimationCancel(view);
                }

                public void onAnimationEnd(Animator animator) {
                    bdVar.onAnimationEnd(view);
                }

                public void onAnimationStart(Animator animator) {
                    bdVar.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
