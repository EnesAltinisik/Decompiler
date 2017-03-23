package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.List;
import java.util.Map;

class cm extends bu {
    private static final String a = zzad.DATA_LAYER_WRITE.toString();
    private static final String b = zzae.VALUE.toString();
    private static final String c = zzae.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final DataLayer d;

    public cm(DataLayer dataLayer) {
        super(a, b);
        this.d = dataLayer;
    }

    private void a(zza com_google_android_gms_internal_zzag_zza) {
        if (com_google_android_gms_internal_zzag_zza != null && com_google_android_gms_internal_zzag_zza != zzdl.zzKN()) {
            String zzg = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
            if (zzg != zzdl.zzKS()) {
                this.d.zzgr(zzg);
            }
        }
    }

    private void b(zza com_google_android_gms_internal_zzag_zza) {
        if (com_google_android_gms_internal_zzag_zza != null && com_google_android_gms_internal_zzag_zza != zzdl.zzKN()) {
            Object zzl = zzdl.zzl(com_google_android_gms_internal_zzag_zza);
            if (zzl instanceof List) {
                for (Object zzl2 : (List) zzl2) {
                    if (zzl2 instanceof Map) {
                        this.d.push((Map) zzl2);
                    }
                }
            }
        }
    }

    public void zzX(Map<String, zza> map) {
        b((zza) map.get(b));
        a((zza) map.get(c));
    }
}
