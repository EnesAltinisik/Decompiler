package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.Set;

public abstract class zzch extends k {
    private static final String zzbpZ = zzae.ARG1.toString();
    private static final String zzbpb = zzae.ARG0.toString();

    public zzch(String str) {
        super(str, zzbpb, zzbpZ);
    }

    public /* bridge */ /* synthetic */ String zzJO() {
        return super.zzJO();
    }

    public /* bridge */ /* synthetic */ Set zzJP() {
        return super.zzJP();
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        for (zza com_google_android_gms_internal_zzag_zza : map.values()) {
            if (com_google_android_gms_internal_zzag_zza == zzdl.zzKT()) {
                return zzdl.zzQ(Boolean.valueOf(false));
            }
        }
        zza com_google_android_gms_internal_zzag_zza2 = (zza) map.get(zzbpb);
        zza com_google_android_gms_internal_zzag_zza3 = (zza) map.get(zzbpZ);
        boolean zza = (com_google_android_gms_internal_zzag_zza2 == null || com_google_android_gms_internal_zzag_zza3 == null) ? false : zza(com_google_android_gms_internal_zzag_zza2, com_google_android_gms_internal_zzag_zza3, map);
        return zzdl.zzQ(Boolean.valueOf(zza));
    }

    protected abstract boolean zza(zza com_google_android_gms_internal_zzag_zza, zza com_google_android_gms_internal_zzag_zza2, Map<String, zza> map);
}
