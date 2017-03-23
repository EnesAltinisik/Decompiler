package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

@TargetApi(16)
class c {
    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }
}
