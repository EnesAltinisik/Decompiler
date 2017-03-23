package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class bz extends k {
    private static final String a = zzad.ADWORDS_CLICK_REFERRER.toString();
    private static final String b = zzae.COMPONENT.toString();
    private static final String c = zzae.CONVERSION_ID.toString();
    private final Context d;

    public bz(Context context) {
        super(a, c);
        this.d = context;
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(c);
        if (com_google_android_gms_internal_zzag_zza == null) {
            return zzdl.zzKT();
        }
        String zzg = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        com_google_android_gms_internal_zzag_zza = (zza) map.get(b);
        String zzf = zzbe.zzf(this.d, zzg, com_google_android_gms_internal_zzag_zza != null ? zzdl.zzg(com_google_android_gms_internal_zzag_zza) : null);
        return zzf != null ? zzdl.zzQ(zzf) : zzdl.zzKT();
    }
}
