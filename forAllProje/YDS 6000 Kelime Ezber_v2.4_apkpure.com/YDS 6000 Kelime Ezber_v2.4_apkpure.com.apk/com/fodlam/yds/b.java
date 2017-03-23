package com.fodlam.yds;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.afollestad.materialdialogs.f;

public class b implements ActivityLifecycleCallbacks {
    static int a = 0;
    static int b = 0;
    static int c = 0;
    static int d = 0;
    f e = null;

    public static boolean a() {
        return a > c;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        OxfordApplication.a(activity.getApplicationContext());
        b++;
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        c++;
    }

    public void onActivityResumed(Activity activity) {
        a++;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
        d++;
    }
}
