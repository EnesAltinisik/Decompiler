package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;

public class zzqo {
    private static int zzaGp = -1;

    public static boolean zzaL(Context context) {
        return zzaO(context) == 3;
    }

    private static int zzaM(Context context) {
        return ((zzaN(context) % 1000) / 100) + 5;
    }

    private static int zzaN(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("Fitness", "Could not find package info for Google Play Services");
            return -1;
        }
    }

    public static int zzaO(Context context) {
        if (zzaGp == -1) {
            switch (zzaM(context)) {
                case 8:
                case 13:
                    zzaGp = 0;
                    break;
                case 10:
                    zzaGp = 3;
                    break;
                default:
                    zzaGp = zzaP(context) ? 1 : 2;
                    break;
            }
        }
        return zzaGp;
    }

    private static boolean zzaP(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (Throwable e) {
            Log.wtf("Fitness", "Unable to determine type of device, assuming phone.  Version: " + zzaN(context), e);
            return true;
        }
    }
}
