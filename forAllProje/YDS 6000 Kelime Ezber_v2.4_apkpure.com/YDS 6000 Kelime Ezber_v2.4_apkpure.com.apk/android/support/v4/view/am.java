package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(15)
class am {
    public static boolean a(View view) {
        return view.hasOnClickListeners();
    }
}
