package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ViewPropertyAnimatorCompatJB */
class bb {
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
