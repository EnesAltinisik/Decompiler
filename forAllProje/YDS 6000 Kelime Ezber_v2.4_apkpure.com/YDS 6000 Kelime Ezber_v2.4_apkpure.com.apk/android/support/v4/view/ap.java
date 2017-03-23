package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(19)
class ap {
    public static boolean a(View view) {
        return view.isLaidOut();
    }

    public static boolean b(View view) {
        return view.isAttachedToWindow();
    }
}
