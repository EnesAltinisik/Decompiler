package com.google.android.gms.drive.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.internal.zzte;

public final class zzz {
    private static final zzp zzaxU = new zzp("GmsDrive");

    public static void zzC(String str, String str2) {
        zzaxU.zzC(str, str2);
    }

    public static void zzD(String str, String str2) {
        zzaxU.zzD(str, str2);
    }

    public static void zzE(String str, String str2) {
        zzaxU.zzE(str, str2);
    }

    public static void zza(Context context, String str, String str2, Throwable th) {
        zzte.zza(context, th);
        zzaxU.zzd(str, str2, th);
    }

    public static void zza(String str, Throwable th, String str2) {
        zzaxU.zzc(str, str2, th);
    }

    public static void zze(Context context, String str, String str2) {
        zza(context, str, str2, new Throwable());
    }
}
