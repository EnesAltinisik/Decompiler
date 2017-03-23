package android.support.v4.g;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
class i {
    public static void a() {
        Trace.endSection();
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }
}
