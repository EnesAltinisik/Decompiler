package com.google.android.gms.internal;

public final class zzun {
    static int zzbpK;
    static zzuo zzbsM = new zzua();

    public static void e(String str) {
        zzbsM.e(str);
    }

    public static int getLogLevel() {
        return zzbpK;
    }

    public static void setLogLevel(int i) {
        zzbpK = i;
        zzbsM.setLogLevel(i);
    }

    public static void v(String str) {
        zzbsM.v(str);
    }

    public static void zzLc() {
        setLogLevel(5);
    }

    public static void zzLd() {
        setLogLevel(2);
    }

    public static void zzaV(String str) {
        zzbsM.zzaV(str);
    }

    public static void zzaW(String str) {
        zzbsM.zzaW(str);
    }

    public static void zzb(String str, Throwable th) {
        zzbsM.zzb(str, th);
    }

    public static void zzd(String str, Throwable th) {
        zzbsM.zzd(str, th);
    }
}
