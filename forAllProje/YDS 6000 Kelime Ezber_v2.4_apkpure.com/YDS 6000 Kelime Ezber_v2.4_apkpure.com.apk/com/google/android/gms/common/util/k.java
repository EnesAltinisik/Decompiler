package com.google.android.gms.common.util;

import android.os.Build.VERSION;

public final class k {
    public static boolean a() {
        return VERSION.SDK_INT >= 11;
    }

    public static boolean b() {
        return VERSION.SDK_INT >= 12;
    }

    public static boolean c() {
        return VERSION.SDK_INT >= 14;
    }

    public static boolean d() {
        return VERSION.SDK_INT >= 15;
    }

    public static boolean e() {
        return VERSION.SDK_INT >= 17;
    }

    public static boolean f() {
        return VERSION.SDK_INT >= 18;
    }

    public static boolean g() {
        return VERSION.SDK_INT >= 19;
    }

    public static boolean h() {
        return VERSION.SDK_INT >= 20;
    }

    @Deprecated
    public static boolean i() {
        return j();
    }

    public static boolean j() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean k() {
        return VERSION.SDK_INT >= 23;
    }

    public static boolean l() {
        return VERSION.SDK_INT >= 24;
    }
}
