package android.support.v4.b;

import android.content.Context;
import java.io.File;

/* compiled from: ContextCompatFroyo */
class e {
    public static File a(Context context) {
        return context.getExternalCacheDir();
    }

    public static File a(Context context, String str) {
        return context.getExternalFilesDir(str);
    }
}
