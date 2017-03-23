package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.zzbe;

public class zzzl implements zzvh {
    private Context mContext;

    public zzzl(Context context) {
        this.mContext = (Context) zzaa.zzz(context);
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        String str = null;
        if (com_google_android_gms_internal_zzabh_Arr.length > 0 && com_google_android_gms_internal_zzabh_Arr[0] != zzabl.zzbvN) {
            str = zzvi.zzd(zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[0]));
        }
        String zzs = zzbe.zzs(this.mContext, str);
        return zzs != null ? new zzabp(zzs) : zzabl.zzbvN;
    }
}
