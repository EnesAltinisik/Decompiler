package com.google.android.gms.internal;

import android.content.Context;

public final class zzte {
    public static void zza(Context context, String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < stackTrace.length && i < 2) {
            stringBuilder.append(stackTrace[i].toString());
            stringBuilder.append("\n");
            i++;
        }
        zztc com_google_android_gms_internal_zztc = new zztc(context, 10);
        com_google_android_gms_internal_zztc.zza(str, null, str, stringBuilder.toString());
        com_google_android_gms_internal_zztc.send();
    }

    public static void zza(Context context, Throwable th) {
        zza(context, "GMS_WTF", th);
    }
}
