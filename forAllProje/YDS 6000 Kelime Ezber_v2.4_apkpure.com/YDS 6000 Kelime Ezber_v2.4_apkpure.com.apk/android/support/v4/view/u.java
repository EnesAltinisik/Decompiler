package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.MotionEvent;

@TargetApi(12)
class u {
    static float a(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }
}
