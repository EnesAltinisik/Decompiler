package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;

public class zzyw implements zzvh {
    private final Context mContext;

    public zzyw(Context context) {
        this.mContext = context;
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        return new zzabp(this.mContext.getPackageName());
    }
}
