package com.google.android.gms.internal;

public class zzail {
    private static final boolean zzbSf = zzUg();

    private static boolean zzUg() {
        try {
            Class.forName("android.app.Activity");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean zzUh() {
        return zzbSf;
    }
}
