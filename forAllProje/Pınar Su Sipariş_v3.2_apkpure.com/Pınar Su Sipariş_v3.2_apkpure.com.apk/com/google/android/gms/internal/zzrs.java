package com.google.android.gms.internal;

import com.google.android.gms.common.util.zzr;

public class zzrs {
    private static final ThreadLocal<String> zzaGy = new ThreadLocal();

    public static String zzJ(String str, String str2) {
        if (str == null || str2 == null) {
            return str;
        }
        Object obj = new byte[(str.length() + str2.length())];
        System.arraycopy(str.getBytes(), 0, obj, 0, str.length());
        System.arraycopy(str2.getBytes(), 0, obj, str.length(), str2.length());
        return Integer.toHexString(zzr.zza(obj, 0, obj.length, 0));
    }

    public static String zzeg(String str) {
        return zzxR() ? str : zzJ(str, (String) zzaGy.get());
    }

    public static boolean zzxR() {
        String str = (String) zzaGy.get();
        return str == null || str.startsWith("com.google");
    }
}
