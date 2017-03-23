package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.m;

public final class f {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a() {
        boolean z = m.c;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean a(Context context) {
        if (a == null) {
            boolean z = k.h() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @TargetApi(24)
    public static boolean b(Context context) {
        return !k.l() && a(context);
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        if (b == null) {
            boolean z = k.j() && context.getPackageManager().hasSystemFeature("cn.google");
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean d(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return c.booleanValue();
    }
}
