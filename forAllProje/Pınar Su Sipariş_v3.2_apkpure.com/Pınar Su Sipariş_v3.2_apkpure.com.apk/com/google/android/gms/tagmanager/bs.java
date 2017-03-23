package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class bs extends zzch {
    public bs(String str) {
        super(str);
    }

    protected boolean zza(zza com_google_android_gms_internal_zzag_zza, zza com_google_android_gms_internal_zzag_zza2, Map<String, zza> map) {
        String zzg = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        String zzg2 = zzdl.zzg(com_google_android_gms_internal_zzag_zza2);
        return (zzg == zzdl.zzKS() || zzg2 == zzdl.zzKS()) ? false : zza(zzg, zzg2, (Map) map);
    }

    protected abstract boolean zza(String str, String str2, Map<String, zza> map);
}
