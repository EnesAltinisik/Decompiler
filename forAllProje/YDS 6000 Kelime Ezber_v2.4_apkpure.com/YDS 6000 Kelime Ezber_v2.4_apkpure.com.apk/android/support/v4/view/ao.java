package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.Display;
import android.view.View;

@TargetApi(17)
class ao {
    public static int a(View view) {
        return view.getLayoutDirection();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static int b(View view) {
        return view.getPaddingStart();
    }

    public static int c(View view) {
        return view.getPaddingEnd();
    }

    public static int d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean e(View view) {
        return view.isPaddingRelative();
    }

    public static Display f(View view) {
        return view.getDisplay();
    }
}
