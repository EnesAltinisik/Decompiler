package android.support.v4.b.a;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* compiled from: ResourcesCompat */
public final class a {
    public static Drawable a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return b.a(resources, i, theme);
        }
        return resources.getDrawable(i);
    }
}
