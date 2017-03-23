package android.support.v4.widget;

import android.annotation.TargetApi;
import android.widget.EdgeEffect;

@TargetApi(21)
class l {
    public static boolean a(Object obj, float f, float f2) {
        ((EdgeEffect) obj).onPull(f, f2);
        return true;
    }
}
