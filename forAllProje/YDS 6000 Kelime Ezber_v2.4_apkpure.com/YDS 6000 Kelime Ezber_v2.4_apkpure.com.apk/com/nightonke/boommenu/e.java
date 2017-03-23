package com.nightonke.boommenu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Random;

public class e {
    private static final int[] a = new int[]{Color.parseColor("#F44336"), Color.parseColor("#E91E63"), Color.parseColor("#9C27B0"), Color.parseColor("#673AB7"), Color.parseColor("#3F51B5"), Color.parseColor("#2196F3"), Color.parseColor("#03A9F4"), Color.parseColor("#00BCD4"), Color.parseColor("#009688"), Color.parseColor("#4CAF50"), Color.parseColor("#009688"), Color.parseColor("#CDDC39"), Color.parseColor("#FFEB3B"), Color.parseColor("#FF9800"), Color.parseColor("#FF5722"), Color.parseColor("#795548"), Color.parseColor("#9E9E9E"), Color.parseColor("#607D8B")};
    private static final ArrayList<Integer> b = new ArrayList();
    private static e c = new e();

    private e() {
    }

    public static float a(Point point, Point point2) {
        return (float) Math.sqrt((double) (((point.x - point2.x) * (point.x - point2.x)) + ((point.y - point2.y) * (point.y - point2.y))));
    }

    public static int a() {
        int nextInt;
        Random random = new Random();
        do {
            nextInt = random.nextInt(a.length);
        } while (b.contains(Integer.valueOf(nextInt)));
        b.add(Integer.valueOf(nextInt));
        while (b.size() > 6) {
            b.remove(0);
        }
        return a[nextInt];
    }

    public static int a(float f) {
        return Math.round((((float) Resources.getSystem().getDisplayMetrics().densityDpi) / 160.0f) * f);
    }

    public static int a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.9f;
        return Color.HSVToColor(fArr);
    }

    public static int a(Context context, Integer num, int i) {
        return num == null ? i : b(context, num.intValue());
    }

    public static int a(TypedArray typedArray, int i) {
        return a(typedArray, i, null);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getResources().getInteger(i2));
    }

    public static int a(TypedArray typedArray, int i, Theme theme) {
        return VERSION.SDK_INT >= 23 ? typedArray.getResources().getColor(i, theme) : typedArray.getResources().getColor(i);
    }

    static Activity a(Context context) {
        if (context == null) {
            Log.w("BoomMenuButton", "scanForActivity: context is null!");
            return null;
        } else if (context instanceof Activity) {
            return (Activity) context;
        } else {
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
            Log.w("BoomMenuButton", "scanForActivity: context is null!");
            return null;
        }
    }

    public static BitmapDrawable a(View view, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i * 2, i * 2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i2);
        canvas.drawCircle((float) i, (float) i, (float) i, paint);
        return new BitmapDrawable(view.getResources(), createBitmap);
    }

    public static BitmapDrawable a(View view, int i, int i2, int i3, int i4) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i4);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) i, (float) i2), (float) i3, (float) i3, paint);
        return new BitmapDrawable(view.getResources(), createBitmap);
    }

    public static Drawable a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static Drawable a(View view, int i) {
        return VERSION.SDK_INT >= 21 ? view.getResources().getDrawable(i, null) : view.getResources().getDrawable(i);
    }

    public static Drawable a(View view, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? view.getResources().getDrawable(i, theme) : view.getResources().getDrawable(i);
    }

    public static StateListDrawable a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, a(view, i, i2, i3, i5));
        stateListDrawable.addState(new int[]{-16842910}, a(view, i, i2, i3, i6));
        stateListDrawable.addState(StateSet.WILD_CARD, a(view, i, i2, i3, i4));
        return stateListDrawable;
    }

    static void a(int i, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    public static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static boolean a(PointF pointF, View view) {
        return ((float) view.getLeft()) <= pointF.x && pointF.x <= ((float) view.getRight()) && ((float) view.getTop()) <= pointF.y && pointF.y <= ((float) view.getBottom());
    }

    public static int b(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 1.1f;
        return Color.HSVToColor(fArr);
    }

    public static int b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getResources().getColor(i, null) : context.getResources().getColor(i);
    }

    public static GradientDrawable b(View view, int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) a(view, R.drawable.shape_oval_normal);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static GradientDrawable b(View view, int i, int i2) {
        GradientDrawable gradientDrawable = (GradientDrawable) a(view, R.drawable.shape_rectangle_normal);
        gradientDrawable.setCornerRadius((float) i);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    public static StateListDrawable b(View view, int i, int i2, int i3, int i4) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, a(view, i, i3));
        stateListDrawable.addState(new int[]{-16842910}, a(view, i, i4));
        stateListDrawable.addState(StateSet.WILD_CARD, a(view, i, i2));
        return stateListDrawable;
    }

    public static boolean b(TypedArray typedArray, int i, int i2) {
        return typedArray.getBoolean(i, typedArray.getResources().getBoolean(i2));
    }

    public static int c(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelSize(i, typedArray.getResources().getDimensionPixelSize(i2));
    }

    public static int d(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, typedArray.getResources().getDimensionPixelOffset(i2));
    }

    public static int e(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, a(typedArray, i2));
    }
}
