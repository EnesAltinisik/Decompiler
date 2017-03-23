package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(18)
class i {
    public static String a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getViewIdResourceName();
    }
}
