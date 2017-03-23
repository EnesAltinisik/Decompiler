package android.support.v4.h;

import android.os.Build.VERSION;
import java.util.Locale;

public final class g {
    public static final Locale a = new Locale("", "");
    static String b = "Arab";
    static String c = "Hebr";
    private static final a d;

    private static class a {
        a() {
        }

        private static int b(Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case (byte) 1:
                case (byte) 2:
                    return 1;
                default:
                    return 0;
            }
        }

        public int a(Locale locale) {
            if (!(locale == null || locale.equals(g.a))) {
                String a = b.a(locale);
                if (a == null) {
                    return b(locale);
                }
                if (a.equalsIgnoreCase(g.b) || a.equalsIgnoreCase(g.c)) {
                    return 1;
                }
            }
            return 0;
        }
    }

    private static class b extends a {
        b() {
        }

        public int a(Locale locale) {
            return h.a(locale);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            d = new b();
        } else {
            d = new a();
        }
    }

    public static int a(Locale locale) {
        return d.a(locale);
    }
}
