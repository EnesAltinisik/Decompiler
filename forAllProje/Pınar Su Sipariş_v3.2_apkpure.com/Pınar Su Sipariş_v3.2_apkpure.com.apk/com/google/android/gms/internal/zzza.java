package com.google.android.gms.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.zzaa;

public class zzza implements zzvh {
    private final Context mContext;

    public zzza(Context context) {
        this.mContext = (Context) zzaa.zzz(context);
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        zzabh com_google_android_gms_internal_zzabh = zzabl.zzbvN;
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null) {
                return new zzabp(networkOperatorName);
            }
        }
        return com_google_android_gms_internal_zzabh;
    }
}
