package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(23)
class ar {
    static void a(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    static void b(View view, int i) {
        view.offsetLeftAndRight(i);
    }
}
