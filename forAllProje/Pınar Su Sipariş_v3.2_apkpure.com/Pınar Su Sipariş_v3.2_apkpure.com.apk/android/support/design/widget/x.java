package android.support.design.widget;

import android.os.Build.VERSION;

/* compiled from: ViewUtils */
class x {
    static final b a = new b() {
        public q a() {
            return new q(VERSION.SDK_INT >= 12 ? new s() : new r());
        }
    };
    private static final a b;

    /* compiled from: ViewUtils */
    private interface a {
    }

    /* compiled from: ViewUtils */
    private static class b implements a {
        private b() {
        }
    }

    /* compiled from: ViewUtils */
    private static class c implements a {
        private c() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            b = new c();
        } else {
            b = new b();
        }
    }

    static q a() {
        return a.a();
    }
}
