package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;

@vz
public class qg implements lv {
    private CustomTabsSession a;
    private CustomTabsClient b;
    private CustomTabsServiceConnection c;
    private a d;

    public interface a {
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || resolveActivity == null) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                return resolveActivity.activityInfo.packageName.equals(ls.a(context));
            }
        }
        return false;
    }

    public CustomTabsSession a() {
        if (this.b == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = this.b.newSession(null);
        }
        return this.a;
    }

    public void a(Activity activity) {
        if (this.c != null) {
            activity.unbindService(this.c);
            this.b = null;
            this.a = null;
            this.c = null;
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void b(Activity activity) {
        if (this.b == null) {
            String a = ls.a(activity);
            if (a != null) {
                this.c = new lu(this);
                CustomTabsClient.bindCustomTabsService(activity, a, this.c);
            }
        }
    }
}
