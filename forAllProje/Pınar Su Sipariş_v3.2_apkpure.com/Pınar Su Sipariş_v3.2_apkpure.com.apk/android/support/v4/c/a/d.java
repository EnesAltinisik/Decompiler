package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCompatEclair */
class d {
    public static Drawable a(Drawable drawable) {
        if (drawable instanceof o) {
            return drawable;
        }
        return new k(drawable);
    }
}
