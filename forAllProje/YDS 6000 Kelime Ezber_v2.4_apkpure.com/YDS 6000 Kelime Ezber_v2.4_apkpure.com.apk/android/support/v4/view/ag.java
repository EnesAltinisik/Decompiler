package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.VelocityTracker;

@TargetApi(11)
class ag {
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
