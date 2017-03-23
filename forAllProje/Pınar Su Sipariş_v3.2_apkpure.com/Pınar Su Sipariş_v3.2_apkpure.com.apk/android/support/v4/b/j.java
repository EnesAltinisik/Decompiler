package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

/* compiled from: IntentCompat */
public final class j {
    private static final a a;

    /* compiled from: IntentCompat */
    interface a {
        Intent a(ComponentName componentName);
    }

    /* compiled from: IntentCompat */
    static class b implements a {
        b() {
        }

        public Intent a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }
    }

    /* compiled from: IntentCompat */
    static class c extends b {
        c() {
        }

        public Intent a(ComponentName componentName) {
            return k.a(componentName);
        }
    }

    /* compiled from: IntentCompat */
    static class d extends c {
        d() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            a = new d();
        } else if (i >= 11) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static Intent a(ComponentName componentName) {
        return a.a(componentName);
    }
}
