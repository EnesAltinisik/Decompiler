package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

class v {
    private static final a a;

    private interface a {
        void a(ViewGroup viewGroup, View view, Rect rect);
    }

    private static class b implements a {
        b() {
        }

        public void a(ViewGroup viewGroup, View view, Rect rect) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(view.getScrollX(), view.getScrollY());
        }
    }

    private static class c implements a {
        c() {
        }

        public void a(ViewGroup viewGroup, View view, Rect rect) {
            w.a(viewGroup, view, rect);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new c();
        } else {
            a = new b();
        }
    }

    static void a(ViewGroup viewGroup, View view, Rect rect) {
        a.a(viewGroup, view, rect);
    }

    static void b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        a(viewGroup, view, rect);
    }
}
