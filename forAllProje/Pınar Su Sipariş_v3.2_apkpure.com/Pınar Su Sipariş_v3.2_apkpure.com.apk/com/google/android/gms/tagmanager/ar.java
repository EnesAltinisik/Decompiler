package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class ar extends zzch {
    public ar(String str) {
        super(str);
    }

    protected abstract boolean a(bv bvVar, bv bvVar2, Map<String, zza> map);

    protected boolean zza(zza com_google_android_gms_internal_zzag_zza, zza com_google_android_gms_internal_zzag_zza2, Map<String, zza> map) {
        bv zzh = zzdl.zzh(com_google_android_gms_internal_zzag_zza);
        bv zzh2 = zzdl.zzh(com_google_android_gms_internal_zzag_zza2);
        return (zzh == zzdl.zzKR() || zzh2 == zzdl.zzKR()) ? false : a(zzh, zzh2, map);
    }
}
