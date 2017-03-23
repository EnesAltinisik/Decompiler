package android.support.v4.g;

import android.os.Build.VERSION;
import java.util.Locale;

/* compiled from: ICUCompat */
public final class a {
    private static final a a;

    /* compiled from: ICUCompat */
    interface a {
        String a(Locale locale);
    }

    /* compiled from: ICUCompat */
    static class b implements a {
        b() {
        }

        public String a(Locale locale) {
            return null;
        }
    }

    /* compiled from: ICUCompat */
    static class c implements a {
        c() {
        }

        public String a(Locale locale) {
            return c.a(locale);
        }
    }

    /* compiled from: ICUCompat */
    static class d implements a {
        d() {
        }

        public String a(Locale locale) {
            return b.a(locale);
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
