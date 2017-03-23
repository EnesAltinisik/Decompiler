package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public class ao {
    public static uw a(Context context) {
        return a(context, null);
    }

    public static uw a(Context context, abm com_google_android_gms_b_abm) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = new StringBuilder(String.valueOf(packageName).length() + 12).append(packageName).append("/").append(context.getPackageManager().getPackageInfo(packageName, 0).versionCode).toString();
        } catch (NameNotFoundException e) {
        }
        if (com_google_android_gms_b_abm == null) {
            com_google_android_gms_b_abm = VERSION.SDK_INT >= 9 ? new abn() : new abk(AndroidHttpClient.newInstance(str));
        }
        uw uwVar = new uw(new abj(file), new abh(com_google_android_gms_b_abm));
        uwVar.a();
        return uwVar;
    }
}
