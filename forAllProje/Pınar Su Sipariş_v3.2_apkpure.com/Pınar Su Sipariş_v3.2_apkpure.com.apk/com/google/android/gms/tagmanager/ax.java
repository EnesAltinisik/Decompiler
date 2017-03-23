package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class ax extends k {
    private static final String a = zzad.RANDOM.toString();
    private static final String b = zzae.MIN.toString();
    private static final String c = zzae.MAX.toString();

    public ax() {
        super(a, new String[0]);
    }

    public boolean zzJf() {
        return false;
    }

    public zza zzV(Map<String, zza> map) {
        double doubleValue;
        double d;
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(b);
        zza com_google_android_gms_internal_zzag_zza2 = (zza) map.get(c);
        if (!(com_google_android_gms_internal_zzag_zza == null || com_google_android_gms_internal_zzag_zza == zzdl.zzKT() || com_google_android_gms_internal_zzag_zza2 == null || com_google_android_gms_internal_zzag_zza2 == zzdl.zzKT())) {
            bv zzh = zzdl.zzh(com_google_android_gms_internal_zzag_zza);
            bv zzh2 = zzdl.zzh(com_google_android_gms_internal_zzag_zza2);
            if (!(zzh == zzdl.zzKR() || zzh2 == zzdl.zzKR())) {
                double doubleValue2 = zzh.doubleValue();
                doubleValue = zzh2.doubleValue();
                if (doubleValue2 <= doubleValue) {
                    d = doubleValue2;
                    return zzdl.zzQ(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
                }
            }
        }
        doubleValue = 2.147483647E9d;
        d = 0.0d;
        return zzdl.zzQ(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
    }
}
