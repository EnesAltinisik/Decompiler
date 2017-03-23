package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.ViewGroup.MarginLayoutParams;

@TargetApi(17)
class p {
    public static int a(MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static int b(MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }
}
