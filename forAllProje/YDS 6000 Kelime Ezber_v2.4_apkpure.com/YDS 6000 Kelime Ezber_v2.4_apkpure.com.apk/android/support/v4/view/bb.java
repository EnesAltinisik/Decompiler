package android.support.v4.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(19)
class bb {
    public static void a(final View view, final be beVar) {
        AnimatorUpdateListener animatorUpdateListener = null;
        if (beVar != null) {
            animatorUpdateListener = new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    beVar.a(view);
                }
            };
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }
}
