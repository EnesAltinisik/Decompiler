package android.support.v4.g;

import android.os.Build.VERSION;
import java.util.Locale;

/* compiled from: TextUtilsCompat */
public final class d {
    public static final Locale a = new Locale("", "");
    private static final a b;
    private static String c = "Arab";
    private static String d = "Hebr";

    /* compiled from: TextUtilsCompat */
    private static class a {
        private a() {
        }

        public int a(Locale locale) {
            if (!(locale == null || locale.equals(d.a))) {
                String a = a.a(locale);
                if (a == null) {
                    return b(locale);
                }
                if (a.equalsIgnoreCase(d.c) || a.equalsIgnoreCase(d.d)) {
                    return 1;
                }
            }
            return 0;
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
    }

    /* compiled from: TextUtilsCompat */
    private static class b extends a {
        private b() {
            super();
        }

        public int a(Locale locale) {
            return e.a(locale);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            b = new b();
        } else {
            b = new a();
        }
    }

    public static int a(Locale locale) {
        return b.a(locale);
    }
}
