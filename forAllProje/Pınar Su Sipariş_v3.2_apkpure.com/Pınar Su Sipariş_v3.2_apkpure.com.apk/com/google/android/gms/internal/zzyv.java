package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzuu.zzc;
import com.google.android.gms.tagmanager.zzbe;

public class zzyv extends zzvj {
    private final Context mContext;
    private final zzc zzbuu;

    public zzyv(Context context, zzc com_google_android_gms_internal_zzuu_zzc) {
        this.mContext = (Context) zzaa.zzz(context);
        this.zzbuu = com_google_android_gms_internal_zzuu_zzc;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length == 0 || com_google_android_gms_internal_zzabh_Arr[0] == zzabl.zzbvN) {
            return new zzabp("");
        }
        Object obj = this.zzbuu.zzLr().zzJJ().get("_ldl");
        if (obj == null) {
            return new zzabp("");
        }
        zzabh zzY = zzabq.zzY(obj);
        if (!(zzY instanceof zzabp)) {
            return new zzabp("");
        }
        String str = (String) ((zzabp) zzY).zzMk();
        if (!zzbe.zzad(str, "conv").equals(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]))) {
            return new zzabp("");
        }
        String zzd = com_google_android_gms_internal_zzabh_Arr.length > 1 ? com_google_android_gms_internal_zzabh_Arr[1] == zzabl.zzbvN ? null : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]) : null;
        zzd = zzbe.zzad(str, zzd);
        return zzd != null ? new zzabp(zzd) : new zzabp("");
    }
}
