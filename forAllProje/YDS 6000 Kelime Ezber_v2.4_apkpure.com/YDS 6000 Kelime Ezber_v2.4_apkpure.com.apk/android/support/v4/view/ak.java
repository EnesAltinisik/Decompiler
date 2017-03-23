package android.support.v4.view;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;

@TargetApi(11)
class ak {
    public static float a(View view) {
        return view.getAlpha();
    }

    public static int a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    public static int a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    static long a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void a(View view, float f) {
        view.setTranslationX(f);
    }

    static void a(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            i(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                i((View) parent);
            }
        }
    }

    public static void a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static void a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static int b(View view) {
        return view.getLayerType();
    }

    public static void b(View view, float f) {
        view.setTranslationY(f);
    }

    static void b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            i(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                i((View) parent);
            }
        }
    }

    public static void b(View view, boolean z) {
        view.setActivated(z);
    }

    public static int c(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static void c(View view, float f) {
        view.setAlpha(f);
    }

    public static int d(View view) {
        return view.getMeasuredState();
    }

    public static void d(View view, float f) {
        view.setScaleX(f);
    }

    public static float e(View view) {
        return view.getTranslationX();
    }

    public static void e(View view, float f) {
        view.setScaleY(f);
    }

    public static float f(View view) {
        return view.getTranslationY();
    }

    public static Matrix g(View view) {
        return view.getMatrix();
    }

    public static void h(View view) {
        view.jumpDrawablesToCurrentState();
    }

    private static void i(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
