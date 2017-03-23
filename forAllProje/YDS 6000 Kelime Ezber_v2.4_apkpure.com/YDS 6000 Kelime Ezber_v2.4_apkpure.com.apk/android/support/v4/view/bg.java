package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.WindowInsets;

@TargetApi(20)
class bg {
    public static Object a(Object obj) {
        return ((WindowInsets) obj).consumeSystemWindowInsets();
    }

    public static Object a(Object obj, int i, int i2, int i3, int i4) {
        return ((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4);
    }

    public static int b(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetBottom();
    }

    public static int c(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetLeft();
    }

    public static int d(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetRight();
    }

    public static int e(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetTop();
    }

    public static boolean f(Object obj) {
        return ((WindowInsets) obj).hasSystemWindowInsets();
    }
}
