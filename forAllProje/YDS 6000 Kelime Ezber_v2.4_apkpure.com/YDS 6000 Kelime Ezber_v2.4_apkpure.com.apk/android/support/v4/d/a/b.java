package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

@TargetApi(23)
class b {
    public static int a(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static boolean a(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }
}
