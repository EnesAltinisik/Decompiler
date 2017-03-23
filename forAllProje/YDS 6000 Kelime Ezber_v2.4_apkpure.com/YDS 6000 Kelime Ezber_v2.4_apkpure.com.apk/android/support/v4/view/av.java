package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.ViewGroup;

@TargetApi(11)
class av {
    public static void a(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }
}
