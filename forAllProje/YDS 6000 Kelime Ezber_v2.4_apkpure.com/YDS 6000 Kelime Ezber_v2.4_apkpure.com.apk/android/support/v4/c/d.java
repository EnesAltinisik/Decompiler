package android.support.v4.c;

import android.annotation.TargetApi;
import android.content.Context;

@TargetApi(24)
class d {
    public static boolean a(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
