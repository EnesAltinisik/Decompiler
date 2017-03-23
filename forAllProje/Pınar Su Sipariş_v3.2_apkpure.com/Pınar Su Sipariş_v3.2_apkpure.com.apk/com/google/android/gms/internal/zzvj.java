package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public abstract class zzvj implements zzvh {
    protected abstract zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr);

    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzuw != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzabh[] com_google_android_gms_internal_zzabhArr = new zzabh[com_google_android_gms_internal_zzabh_Arr.length];
        for (int i = 0; i < com_google_android_gms_internal_zzabh_Arr.length; i++) {
            zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[i] != null);
            zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[i] != zzabl.zzbvK);
            zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[i] != zzabl.zzbvL);
            com_google_android_gms_internal_zzabhArr[i] = zzabq.zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabh_Arr[i]);
            zzaa.zzaj(com_google_android_gms_internal_zzabhArr[i] != null);
            zzaa.zzaj(com_google_android_gms_internal_zzabhArr[i] != zzabl.zzbvK);
            zzaa.zzaj(com_google_android_gms_internal_zzabhArr[i] != zzabl.zzbvL);
        }
        zzabh<?> zza = zza(com_google_android_gms_internal_zzuw, com_google_android_gms_internal_zzabhArr);
        if (zza == null) {
            z = false;
        }
        zzaa.zzai(z);
        return zza;
    }
}
