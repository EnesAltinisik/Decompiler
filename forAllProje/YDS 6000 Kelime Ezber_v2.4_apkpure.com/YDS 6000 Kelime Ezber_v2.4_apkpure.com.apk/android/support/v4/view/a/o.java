package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityRecord;

@TargetApi(14)
class o {
    public static void a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public static void a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public static void b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public static void c(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    public static void d(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    public static void e(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
