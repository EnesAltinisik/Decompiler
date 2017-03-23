package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.zzaa;

public class zzze implements zzvh {
    private final Context mContext;

    public zzze(Context context) {
        this.mContext = context;
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        String zzbi = zzbi(this.mContext);
        if (zzbi == null) {
            zzbi = "";
        }
        return new zzabp(zzbi);
    }

    protected String zzbi(Context context) {
        return Secure.getString(this.mContext.getContentResolver(), "android_id");
    }
}
