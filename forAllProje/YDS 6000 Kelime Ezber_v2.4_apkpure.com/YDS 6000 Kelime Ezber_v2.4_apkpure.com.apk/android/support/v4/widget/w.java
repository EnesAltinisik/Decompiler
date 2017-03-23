package android.support.v4.widget;

import android.annotation.TargetApi;
import android.widget.OverScroller;

@TargetApi(14)
class w {
    public static float a(Object obj) {
        return ((OverScroller) obj).getCurrVelocity();
    }
}
