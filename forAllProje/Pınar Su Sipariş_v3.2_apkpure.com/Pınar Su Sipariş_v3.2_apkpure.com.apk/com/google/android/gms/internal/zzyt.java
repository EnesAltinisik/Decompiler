package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.zza;

public class zzyt implements zzvh {
    private final zza zzbnH;

    public zzyt(Context context) {
        this(zza.zzbg(context));
    }

    zzyt(zza com_google_android_gms_tagmanager_zza) {
        this.zzbnH = com_google_android_gms_tagmanager_zza;
    }

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        String zzIZ = this.zzbnH.zzIZ();
        return zzIZ == null ? zzabl.zzbvN : new zzabp(zzIZ);
    }
}
