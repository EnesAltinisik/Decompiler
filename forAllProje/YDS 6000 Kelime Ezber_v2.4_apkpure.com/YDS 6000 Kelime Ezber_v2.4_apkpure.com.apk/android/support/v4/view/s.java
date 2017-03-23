package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.MenuItem;

@TargetApi(14)
class s {
    public static boolean a(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static boolean b(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }
}
