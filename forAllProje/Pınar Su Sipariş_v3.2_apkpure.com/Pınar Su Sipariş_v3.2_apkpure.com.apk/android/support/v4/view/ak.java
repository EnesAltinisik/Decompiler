package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.cast.TextTrackStyle;

/* compiled from: ViewCompatHC */
class ak {
    static long a() {
        return ValueAnimator.getFrameDelay();
    }

    public static float a(View view) {
        return view.getAlpha();
    }

    public static void a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static int b(View view) {
        return view.getLayerType();
    }

    public static int a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int c(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int d(View view) {
        return view.getMeasuredState();
    }

    public static float e(View view) {
        return view.getTranslationX();
    }

    public static float f(View view) {
        return view.getTranslationY();
    }

    public static void a(View view, float f) {
        view.setTranslationX(f);
    }

    public static void b(View view, float f) {
        view.setTranslationY(f);
    }

    public static void c(View view, float f) {
        view.setAlpha(f);
    }

    public static void g(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static void b(View view, boolean z) {
        view.setActivated(z);
    }

    public static int a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    static void a(View view, int i) {
        view.offsetTopAndBottom(i);
        h(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            h((View) parent);
        }
    }

    static void b(View view, int i) {
        view.offsetLeftAndRight(i);
        h(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            h((View) parent);
        }
    }

    private static void h(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(TextTrackStyle.DEFAULT_FONT_SCALE + translationY);
        view.setTranslationY(translationY);
    }
}
