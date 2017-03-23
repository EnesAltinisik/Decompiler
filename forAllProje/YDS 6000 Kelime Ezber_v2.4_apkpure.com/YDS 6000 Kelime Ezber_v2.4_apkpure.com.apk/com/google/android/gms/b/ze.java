package com.google.android.gms.b;

import android.util.Log;

@vz
public final class ze extends zy {
    public static void a(String str) {
        if (b()) {
            Log.v("Ads", str);
        }
    }

    public static boolean a() {
        return ((Boolean) pr.aV.c()).booleanValue();
    }

    public static boolean b() {
        return zy.a(2) && a();
    }
}
