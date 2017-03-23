package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.d.a.a;
import android.support.v7.d.a.e;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

final class MediaRouterThemeHelper {
    private MediaRouterThemeHelper() {
    }

    public static Context createThemedContext(Context context) {
        return new ContextThemeWrapper(context, isLightTheme(context) ? e.Theme_MediaRouter_Light : e.Theme_MediaRouter);
    }

    public static int getThemeResource(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.resourceId : 0;
    }

    public static Drawable getThemeDrawable(Context context, int i) {
        int themeResource = getThemeResource(context, i);
        return themeResource != 0 ? context.getResources().getDrawable(themeResource) : null;
    }

    private static boolean isLightTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.isLightTheme, typedValue, true) || typedValue.data == 0) {
            return false;
        }
        return true;
    }
}
