package android.support.v4.b;

import android.content.Context;
import java.io.File;

/* compiled from: ContextCompatKitKat */
class h {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] a(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File[] b(Context context) {
        return context.getObbDirs();
    }
}
