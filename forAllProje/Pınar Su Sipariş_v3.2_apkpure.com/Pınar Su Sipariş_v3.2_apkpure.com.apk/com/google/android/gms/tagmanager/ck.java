package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class ck extends k {
    private static final String a = zzad.CUSTOM_VAR.toString();
    private static final String b = zzae.NAME.toString();
    private static final String c = zzae.DEFAULT_VALUE.toString();
    private final DataLayer d;

    public ck(DataLayer dataLayer) {
        super(a, b);
        this.d = dataLayer;
    }

    public boolean zzJf() {
        return false;
    }

    public zza zzV(Map<String, zza> map) {
        Object obj = this.d.get(zzdl.zzg((zza) map.get(b)));
        if (obj != null) {
            return zzdl.zzQ(obj);
        }
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(c);
        return com_google_android_gms_internal_zzag_zza != null ? com_google_android_gms_internal_zzag_zza : zzdl.zzKT();
    }
}
