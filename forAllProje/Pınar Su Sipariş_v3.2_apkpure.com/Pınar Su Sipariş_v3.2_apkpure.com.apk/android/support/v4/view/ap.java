package android.support.v4.view;

import android.view.View;

/* compiled from: ViewCompatKitKat */
class ap {
    public static void a(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static boolean a(View view) {
        return view.isLaidOut();
    }

    public static boolean b(View view) {
        return view.isAttachedToWindow();
    }
}
