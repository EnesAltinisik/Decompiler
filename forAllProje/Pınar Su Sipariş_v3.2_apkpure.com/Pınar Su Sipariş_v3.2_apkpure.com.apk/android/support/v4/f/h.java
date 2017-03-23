package android.support.v4.f;

import android.os.Build.VERSION;

/* compiled from: TraceCompat */
public final class h {
    public static void a(String str) {
        if (VERSION.SDK_INT >= 18) {
            i.a(str);
        }
    }

    public static void a() {
        if (VERSION.SDK_INT >= 18) {
            i.a();
        }
    }
}
