package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzuu.zzc;

public class zzzp extends zzvj {
    private final Context mContext;
    private final zzc zzbuu;

    public zzzp(Context context, zzc com_google_android_gms_internal_zzuu_zzc) {
        this.mContext = context;
        this.zzbuu = com_google_android_gms_internal_zzuu_zzc;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        Object obj = this.zzbuu.zzLr().zzJJ().get(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]));
        if (obj == null && com_google_android_gms_internal_zzabh_Arr.length > 1) {
            obj = com_google_android_gms_internal_zzabh_Arr[1];
        }
        return zzabq.zzY(obj);
    }
}
