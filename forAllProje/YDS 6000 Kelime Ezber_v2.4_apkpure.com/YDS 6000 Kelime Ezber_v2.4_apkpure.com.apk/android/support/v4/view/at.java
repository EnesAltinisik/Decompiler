package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.ViewConfiguration;

@TargetApi(14)
class at {
    static boolean a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }
}
