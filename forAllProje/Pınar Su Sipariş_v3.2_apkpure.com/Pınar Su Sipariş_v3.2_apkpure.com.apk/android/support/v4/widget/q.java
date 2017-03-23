package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PopupWindowCompat */
public final class q {
    static final f a;

    /* compiled from: PopupWindowCompat */
    interface f {
        void a(PopupWindow popupWindow, int i);

        void a(PopupWindow popupWindow, View view, int i, int i2, int i3);

        void a(PopupWindow popupWindow, boolean z);
    }

    /* compiled from: PopupWindowCompat */
    static class c implements f {
        c() {
        }

        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2);
        }

        public void a(PopupWindow popupWindow, boolean z) {
        }

        public void a(PopupWindow popupWindow, int i) {
        }
    }

    /* compiled from: PopupWindowCompat */
    static class d extends c {
        d() {
        }

        public void a(PopupWindow popupWindow, int i) {
            t.a(popupWindow, i);
        }
    }

    /* compiled from: PopupWindowCompat */
    static class e extends d {
        e() {
        }

        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            u.a(popupWindow, view, i, i2, i3);
        }
    }

    /* compiled from: PopupWindowCompat */
    static class a extends e {
        a() {
        }

        public void a(PopupWindow popupWindow, boolean z) {
            r.a(popupWindow, z);
        }
    }

    /* compiled from: PopupWindowCompat */
    static class b extends a {
        b() {
        }

        public void a(PopupWindow popupWindow, boolean z) {
            s.a(popupWindow, z);
        }

        public void a(PopupWindow popupWindow, int i) {
            s.a(popupWindow, i);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new b();
        } else if (i >= 21) {
            a = new a();
        } else if (i >= 19) {
            a = new e();
        } else if (i >= 9) {
            a = new d();
        } else {
            a = new c();
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        a.a(popupWindow, view, i, i2, i3);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        a.a(popupWindow, z);
    }

    public static void a(PopupWindow popupWindow, int i) {
        a.a(popupWindow, i);
    }
}
