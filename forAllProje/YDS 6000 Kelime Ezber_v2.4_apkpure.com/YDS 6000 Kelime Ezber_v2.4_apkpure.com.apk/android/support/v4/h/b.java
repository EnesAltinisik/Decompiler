package android.support.v4.h;

import android.os.Build.VERSION;
import java.util.Locale;

public final class b {
    private static final a a;

    interface a {
        String a(Locale locale);
    }

    static class b implements a {
        b() {
        }

        public String a(Locale locale) {
            return null;
        }
    }

    static class c implements a {
        c() {
        }

        public String a(Locale locale) {
            return d.a(locale);
        }
    }

    static class d implements a {
        d() {
        }

        public String a(Locale locale) {
            return c.a(locale);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new d();
        } else if (i >= 14) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static String a(Locale locale) {
        return a.a(locale);
    }
}
