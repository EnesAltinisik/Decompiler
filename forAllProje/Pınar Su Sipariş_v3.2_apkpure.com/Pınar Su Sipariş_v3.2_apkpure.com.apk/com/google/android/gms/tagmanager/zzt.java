package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class zzt extends k {
    private static final String a = zzad.FUNCTION_CALL.toString();
    private static final String b = zzae.FUNCTION_CALL_NAME.toString();
    private static final String c = zzae.ADDITIONAL_PARAMS.toString();
    private final zza d;

    public interface zza {
        Object zzd(String str, Map<String, Object> map);
    }

    public zzt(zza com_google_android_gms_tagmanager_zzt_zza) {
        super(a, b);
        this.d = com_google_android_gms_tagmanager_zzt_zza;
    }

    public boolean zzJf() {
        return false;
    }

    public com.google.android.gms.internal.zzag.zza zzV(Map<String, com.google.android.gms.internal.zzag.zza> map) {
        String zzg = zzdl.zzg((com.google.android.gms.internal.zzag.zza) map.get(b));
        Map hashMap = new HashMap();
        com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza = (com.google.android.gms.internal.zzag.zza) map.get(c);
        if (com_google_android_gms_internal_zzag_zza != null) {
            Object zzl = zzdl.zzl(com_google_android_gms_internal_zzag_zza);
            if (zzl instanceof Map) {
                for (Entry entry : ((Map) zzl).entrySet()) {
                    hashMap.put(entry.getKey().toString(), entry.getValue());
                }
            } else {
                zzbn.zzaW("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzdl.zzKT();
            }
        }
        try {
            return zzdl.zzQ(this.d.zzd(zzg, hashMap));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbn.zzaW(new StringBuilder((String.valueOf(zzg).length() + 34) + String.valueOf(valueOf).length()).append("Custom macro/tag ").append(zzg).append(" threw exception ").append(valueOf).toString());
            return zzdl.zzKT();
        }
    }
}
