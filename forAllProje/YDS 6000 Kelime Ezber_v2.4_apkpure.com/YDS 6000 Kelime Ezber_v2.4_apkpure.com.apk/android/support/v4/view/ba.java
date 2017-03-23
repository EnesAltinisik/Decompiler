package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(16)
class ba {
    public static void a(final View view, final bc bcVar) {
        if (bcVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    bcVar.c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    bcVar.b(view);
                }

                public void onAnimationStart(Animator animator) {
                    bcVar.a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
