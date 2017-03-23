package android.support.v4.view;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

@TargetApi(16)
class an {
    public static void a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static boolean a(View view) {
        return view.hasTransientState();
    }

    public static void b(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int c(View view) {
        return view.getImportantForAccessibility();
    }

    public static ViewParent d(View view) {
        return view.getParentForAccessibility();
    }

    public static int e(View view) {
        return view.getMinimumWidth();
    }

    public static int f(View view) {
        return view.getMinimumHeight();
    }

    public static void g(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean h(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean i(View view) {
        return view.hasOverlappingRendering();
    }
}
