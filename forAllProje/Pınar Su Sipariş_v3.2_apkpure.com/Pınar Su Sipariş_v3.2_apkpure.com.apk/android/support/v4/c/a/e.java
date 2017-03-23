package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCompatHoneycomb */
class e {
    public static void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable b(Drawable drawable) {
        if (drawable instanceof o) {
            return drawable;
        }
        return new l(drawable);
    }
}
