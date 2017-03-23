package android.support.v4.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

public class a extends android.support.v4.c.a {
    public static void a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            c.a(activity);
        } else {
            activity.finish();
        }
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            c.a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
