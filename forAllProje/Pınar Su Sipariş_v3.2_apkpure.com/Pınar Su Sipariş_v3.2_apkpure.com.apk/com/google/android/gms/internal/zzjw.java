package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzig
public final class zzjw extends zzb {
    public static void v(String str) {
        if (zziW()) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static boolean zziV() {
        return ((Boolean) zzcu.zzyq.get()).booleanValue();
    }

    private static boolean zziW() {
        return zzb.zzX(2) && zziV();
    }
}
