package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

/* compiled from: ViewConfigurationCompat */
public final class as {
    static final e a;

    /* compiled from: ViewConfigurationCompat */
    interface e {
        int a(ViewConfiguration viewConfiguration);

        boolean b(ViewConfiguration viewConfiguration);
    }

    /* compiled from: ViewConfigurationCompat */
    static class a implements e {
        a() {
        }

        public int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }

        public boolean b(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    /* compiled from: ViewConfigurationCompat */
    static class b extends a {
        b() {
        }

        public int a(ViewConfiguration viewConfiguration) {
            return at.a(viewConfiguration);
        }
    }

    /* compiled from: ViewConfigurationCompat */
    static class c extends b {
        c() {
        }

        public boolean b(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    /* compiled from: ViewConfigurationCompat */
    static class d extends c {
        d() {
        }

        public boolean b(ViewConfiguration viewConfiguration) {
            return au.a(viewConfiguration);
        }
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            a = new d();
        } else if (VERSION.SDK_INT >= 11) {
            a = new c();
        } else if (VERSION.SDK_INT >= 8) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return a.b(viewConfiguration);
    }
}
