package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.zzaa;

public class zzzq implements zzvh {
    private final Context mContext;

    public zzzq(Context context) {
        this.mContext = (Context) zzaa.zzz(context);
    }

    public String zzLF() {
        return Secure.getString(this.mContext.getContentResolver(), "android_id");
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        String zzLF = zzLF();
        return zzLF != null ? new zzabp(zzLF) : zzabl.zzbvN;
    }
}
