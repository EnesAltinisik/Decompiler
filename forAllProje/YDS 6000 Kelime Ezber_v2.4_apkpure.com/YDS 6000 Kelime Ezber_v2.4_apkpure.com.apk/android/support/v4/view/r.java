package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.MenuItem;
import android.view.View;

@TargetApi(11)
class r {
    public static MenuItem a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static View a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static void a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public static MenuItem b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }
}
