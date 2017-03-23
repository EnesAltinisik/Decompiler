package com.afollestad.materialdialogs.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.f;

public class a {
    public static int a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int a(Context context) {
        return a(a(a(context, 16842806)) ? -16777216 : -1, 0.3f);
    }

    public static int a(Context context, int i) {
        return a(context, i, 0);
    }

    public static int a(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int color = obtainStyledAttributes.getColor(0, i2);
            return color;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static int a(e eVar) {
        switch (eVar) {
            case CENTER:
                return 1;
            case END:
                return 2;
            default:
                return 0;
        }
    }

    public static ColorStateList a(Context context, int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            if (peekValue.type < 28 || peekValue.type > 31) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList2 != null) {
                    obtainStyledAttributes.recycle();
                    return colorStateList2;
                }
                obtainStyledAttributes.recycle();
                return colorStateList;
            }
            colorStateList = g(context, peekValue.data);
            obtainStyledAttributes.recycle();
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static Drawable a(Context context, int i, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            obtainStyledAttributes.recycle();
            return drawable;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.afollestad.materialdialogs.e a(android.content.Context r3, int r4, com.afollestad.materialdialogs.e r5) {
        /*
        r2 = 0;
        r0 = r3.getTheme();
        r1 = 1;
        r1 = new int[r1];
        r1[r2] = r4;
        r1 = r0.obtainStyledAttributes(r1);
        r0 = 0;
        r2 = a(r5);	 Catch:{ all -> 0x002c }
        r0 = r1.getInt(r0, r2);	 Catch:{ all -> 0x002c }
        switch(r0) {
            case 1: goto L_0x0020;
            case 2: goto L_0x0026;
            default: goto L_0x001a;
        };	 Catch:{ all -> 0x002c }
    L_0x001a:
        r0 = com.afollestad.materialdialogs.e.START;	 Catch:{ all -> 0x002c }
        r1.recycle();
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = com.afollestad.materialdialogs.e.CENTER;	 Catch:{ all -> 0x002c }
        r1.recycle();
        goto L_0x001f;
    L_0x0026:
        r0 = com.afollestad.materialdialogs.e.END;	 Catch:{ all -> 0x002c }
        r1.recycle();
        goto L_0x001f;
    L_0x002c:
        r0 = move-exception;
        r1.recycle();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.a.a.a(android.content.Context, int, com.afollestad.materialdialogs.e):com.afollestad.materialdialogs.e");
    }

    public static void a(DialogInterface dialogInterface, final com.afollestad.materialdialogs.f.a aVar) {
        final f fVar = (f) dialogInterface;
        if (fVar.g() != null) {
            fVar.g().post(new Runnable() {
                public void run() {
                    fVar.g().requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) aVar.a().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(fVar.g(), 1);
                    }
                }
            });
        }
    }

    public static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    public static boolean a(int i) {
        return 1.0d - ((((0.299d * ((double) Color.red(i))) + (0.587d * ((double) Color.green(i)))) + (0.114d * ((double) Color.blue(i)))) / 255.0d) >= 0.5d;
    }

    public static boolean a(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            boolean z2 = obtainStyledAttributes.getBoolean(0, z);
            return z2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static <T> boolean a(T t, T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return false;
        }
        for (Object equals : tArr) {
            if (equals.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public static int b(Context context, int i) {
        return android.support.v4.c.a.c(context, i);
    }

    private static int b(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            return dimensionPixelSize;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void b(DialogInterface dialogInterface, com.afollestad.materialdialogs.f.a aVar) {
        f fVar = (f) dialogInterface;
        if (fVar.g() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) aVar.a().getSystemService("input_method");
            if (inputMethodManager != null) {
                View currentFocus = fVar.getCurrentFocus();
                IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : fVar.f().getWindowToken();
                if (windowToken != null) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                }
            }
        }
    }

    public static String c(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    public static Drawable d(Context context, int i) {
        return a(context, i, null);
    }

    public static int e(Context context, int i) {
        return b(context, i, -1);
    }

    public static boolean f(Context context, int i) {
        return a(context, i, false);
    }

    public static ColorStateList g(Context context, int i) {
        int a = a(context, 16842806);
        if (i == 0) {
            i = a;
        }
        r0 = new int[2][];
        r0[0] = new int[]{-16842910};
        r0[1] = new int[0];
        return new ColorStateList(r0, new int[]{a(i, 0.4f), i});
    }
}
