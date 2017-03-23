package android.support.v4.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;

@TargetApi(23)
class c {
    public static ColorStateList a(Context context, int i) {
        return context.getColorStateList(i);
    }

    public static int b(Context context, int i) {
        return context.getColor(i);
    }
}
