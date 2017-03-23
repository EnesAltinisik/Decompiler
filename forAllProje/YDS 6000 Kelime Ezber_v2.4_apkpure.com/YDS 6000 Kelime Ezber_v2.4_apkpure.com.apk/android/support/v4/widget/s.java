package android.support.v4.widget;

import android.annotation.TargetApi;
import android.widget.PopupWindow;

@TargetApi(23)
class s {
    static void a(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }
}
