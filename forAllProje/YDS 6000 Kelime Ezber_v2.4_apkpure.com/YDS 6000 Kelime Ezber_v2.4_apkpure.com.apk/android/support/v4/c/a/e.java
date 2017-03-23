package android.support.v4.c.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

@TargetApi(21)
class e {
    public static Drawable a(Resources resources, int i, Theme theme) {
        return resources.getDrawable(i, theme);
    }
}
