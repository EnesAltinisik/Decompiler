package android.support.v4.b;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* compiled from: ContextCompatHoneycomb */
class f {
    static void a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }

    public static File a(Context context) {
        return context.getObbDir();
    }
}
