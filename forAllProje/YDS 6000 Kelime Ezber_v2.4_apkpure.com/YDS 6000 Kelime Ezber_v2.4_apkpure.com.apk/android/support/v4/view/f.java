package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class f {
    static final a a;

    interface a {
        int a(int i, int i2);

        void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4);
    }

    static class b implements a {
        b() {
        }

        public int a(int i, int i2) {
            return -8388609 & i;
        }

        public void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    static class c implements a {
        c() {
        }

        public int a(int i, int i2) {
            return g.a(i, i2);
        }

        public void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            g.a(i, i2, i3, rect, rect2, i4);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        a.a(i, i2, i3, rect, rect2, i4);
    }
}
