package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzu;
import java.math.BigInteger;
import java.util.Locale;

@zzig
public final class zzju {
    private static String zzQb;
    private static final Object zzrs = new Object();

    public static String zza(Context context, String str, String str2) {
        String str3;
        synchronized (zzrs) {
            if (zzQb == null && !TextUtils.isEmpty(str)) {
                zzb(context, str, str2);
            }
            str3 = zzQb;
        }
        return str3;
    }

    private static void zzb(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (zzu.zzck().zza(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            zzQb = String.format(Locale.US, "%X", new Object[]{bigInteger2});
        } catch (Throwable th) {
            zzQb = "err";
        }
    }

    public static String zziT() {
        String str;
        synchronized (zzrs) {
            str = zzQb;
        }
        return str;
    }
}
