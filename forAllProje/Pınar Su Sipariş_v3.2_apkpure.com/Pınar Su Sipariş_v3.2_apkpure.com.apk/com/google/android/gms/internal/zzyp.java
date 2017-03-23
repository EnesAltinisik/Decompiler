package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class zzyp extends zzvj {
    private final zza zzbut;

    public interface zza {
        Object zzd(String str, Map<String, Object> map);
    }

    public zzyp(zza com_google_android_gms_internal_zzyp_zza) {
        this.zzbut = com_google_android_gms_internal_zzyp_zza;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        Map hashMap = new HashMap();
        if (com_google_android_gms_internal_zzabh_Arr.length >= 2 && com_google_android_gms_internal_zzabh_Arr[1] != zzabl.zzbvN) {
            zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabn);
            for (Entry entry : ((Map) ((zzabn) com_google_android_gms_internal_zzabh_Arr[1]).zzMk()).entrySet()) {
                zzaa.zzai(!(entry.getValue() instanceof zzabo));
                zzaa.zzai(!zzabq.zzo((zzabh) entry.getValue()));
                hashMap.put((String) entry.getKey(), ((zzabh) entry.getValue()).zzMk());
            }
        }
        return zzabq.zzY(this.zzbut.zzd(str, hashMap));
    }
}
