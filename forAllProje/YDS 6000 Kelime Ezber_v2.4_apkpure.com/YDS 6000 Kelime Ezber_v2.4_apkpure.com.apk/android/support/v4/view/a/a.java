package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a {
    private static final e a;

    interface e {
        int a(AccessibilityEvent accessibilityEvent);

        void a(AccessibilityEvent accessibilityEvent, int i);
    }

    static class d implements e {
        d() {
        }

        public int a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public void a(AccessibilityEvent accessibilityEvent, int i) {
        }
    }

    static class a extends d {
        a() {
        }
    }

    static class b extends a {
        b() {
        }
    }

    static class c extends b {
        c() {
        }

        public int a(AccessibilityEvent accessibilityEvent) {
            return b.a(accessibilityEvent);
        }

        public void a(AccessibilityEvent accessibilityEvent, int i) {
            b.a(accessibilityEvent, i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new c();
        } else if (VERSION.SDK_INT >= 16) {
            a = new b();
        } else if (VERSION.SDK_INT >= 14) {
            a = new a();
        } else {
            a = new d();
        }
    }

    public static n a(AccessibilityEvent accessibilityEvent) {
        return new n(accessibilityEvent);
    }

    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        a.a(accessibilityEvent, i);
    }

    public static int b(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }
}
