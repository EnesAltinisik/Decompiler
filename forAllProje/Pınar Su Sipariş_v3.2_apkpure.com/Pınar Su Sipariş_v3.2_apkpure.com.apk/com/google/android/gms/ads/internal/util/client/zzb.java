package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.internal.zzig;

@zzig
public class zzb {
    public static void e(String str) {
        if (zzX(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    public static boolean zzX(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }

    public static void zza(String str, Throwable th) {
        if (zzX(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzaU(String str) {
        if (zzX(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    public static void zzaV(String str) {
        if (zzX(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    public static void zzaW(String str) {
        if (zzX(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzX(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzc(String str, Throwable th) {
        if (zzX(4)) {
            Log.i(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzd(String str, Throwable th) {
        if (zzX(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }
}
