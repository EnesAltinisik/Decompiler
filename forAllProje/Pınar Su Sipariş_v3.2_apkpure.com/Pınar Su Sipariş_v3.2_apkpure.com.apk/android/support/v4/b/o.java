package android.support.v4.b;

import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* compiled from: SharedPreferencesCompat */
public final class o {

    /* compiled from: SharedPreferencesCompat */
    public static final class a {
        private static a a;
        private final c b;

        /* compiled from: SharedPreferencesCompat */
        private interface c {
            void a(Editor editor);
        }

        /* compiled from: SharedPreferencesCompat */
        private static class a implements c {
            private a() {
            }

            public void a(Editor editor) {
                i.a(editor);
            }
        }

        /* compiled from: SharedPreferencesCompat */
        private static class b implements c {
            private b() {
            }

            public void a(Editor editor) {
                editor.commit();
            }
        }

        private a() {
            if (VERSION.SDK_INT >= 9) {
                this.b = new a();
            } else {
                this.b = new b();
            }
        }

        public static a a() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        public void a(Editor editor) {
            this.b.a(editor);
        }
    }
}
