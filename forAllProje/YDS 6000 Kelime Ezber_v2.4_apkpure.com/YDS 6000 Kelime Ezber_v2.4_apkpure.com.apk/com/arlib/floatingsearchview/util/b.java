package com.arlib.floatingsearchview.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.c.a.d;
import android.support.v4.d.a.a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

public class b {
    public static int a(int i) {
        return (int) (Resources.getSystem().getDisplayMetrics().density * ((float) i));
    }

    public static Drawable a(Context context, int i) {
        return a.f(d.a(context.getResources(), i, null));
    }

    public static void a(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static void a(final Context context, final EditText editText) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 1);
            }
        }, 100);
    }

    public static void a(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (VERSION.SDK_INT < 16) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void a(ImageView imageView, int i) {
        Drawable f = a.f(imageView.getDrawable());
        a.a(f, i);
        imageView.setImageDrawable(f);
        imageView.invalidate();
    }

    public static int b(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    public static int b(Context context, int i) {
        return android.support.v4.c.a.c(context, i);
    }
}
