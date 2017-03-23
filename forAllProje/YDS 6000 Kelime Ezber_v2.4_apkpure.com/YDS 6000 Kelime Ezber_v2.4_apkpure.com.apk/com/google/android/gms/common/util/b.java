package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.b.at;

public class b {
    @TargetApi(12)
    public static boolean a(Context context, String str) {
        if (!k.b()) {
            return false;
        }
        "com.google.android.gms".equals(str);
        try {
            return (at.b(context).a(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
