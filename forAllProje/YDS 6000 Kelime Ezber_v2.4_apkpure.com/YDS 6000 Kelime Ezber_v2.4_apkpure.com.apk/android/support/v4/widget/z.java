package android.support.v4.widget;

import android.annotation.TargetApi;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

@TargetApi(9)
class z {
    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    static int a(TextView textView) {
        if (!d) {
            c = a("mMaxMode");
            d = true;
        }
        if (c != null && a(c, textView) == 1) {
            if (!b) {
                a = a("mMaximum");
                b = true;
            }
            if (a != null) {
                return a(a, textView);
            }
        }
        return -1;
    }

    private static int a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e) {
            Log.d("TextViewCompatGingerbread", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    private static Field a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            Log.e("TextViewCompatGingerbread", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    static void a(TextView textView, int i) {
        textView.setTextAppearance(textView.getContext(), i);
    }
}
