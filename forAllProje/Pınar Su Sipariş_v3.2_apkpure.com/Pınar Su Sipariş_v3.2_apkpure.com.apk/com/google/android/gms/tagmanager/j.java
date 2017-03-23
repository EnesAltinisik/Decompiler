package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzaf.zzc;
import com.google.android.gms.internal.zzaf.zzd;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class j {
    private static Map<String, Object> a(zza com_google_android_gms_internal_zzag_zza) {
        Object zzl = zzdl.zzl(com_google_android_gms_internal_zzag_zza);
        if (zzl instanceof Map) {
            return (Map) zzl;
        }
        String valueOf = String.valueOf(zzl);
        zzbn.zzaW(new StringBuilder(String.valueOf(valueOf).length() + 36).append("value: ").append(valueOf).append(" is not a map value, ignored.").toString());
        return null;
    }

    private static void a(DataLayer dataLayer, zzd com_google_android_gms_internal_zzaf_zzd) {
        for (zza zzg : com_google_android_gms_internal_zzaf_zzd.zziP) {
            dataLayer.zzgr(zzdl.zzg(zzg));
        }
    }

    public static void a(DataLayer dataLayer, zzi com_google_android_gms_internal_zzaf_zzi) {
        if (com_google_android_gms_internal_zzaf_zzi.zzjE == null) {
            zzbn.zzaW("supplemental missing experimentSupplemental");
            return;
        }
        a(dataLayer, com_google_android_gms_internal_zzaf_zzi.zzjE);
        b(dataLayer, com_google_android_gms_internal_zzaf_zzi.zzjE);
        c(dataLayer, com_google_android_gms_internal_zzaf_zzi.zzjE);
    }

    private static void b(DataLayer dataLayer, zzd com_google_android_gms_internal_zzaf_zzd) {
        for (zza a : com_google_android_gms_internal_zzaf_zzd.zziO) {
            Map a2 = a(a);
            if (a2 != null) {
                dataLayer.push(a2);
            }
        }
    }

    private static void c(DataLayer dataLayer, zzd com_google_android_gms_internal_zzaf_zzd) {
        for (zzc com_google_android_gms_internal_zzaf_zzc : com_google_android_gms_internal_zzaf_zzd.zziQ) {
            if (com_google_android_gms_internal_zzaf_zzc.zzaB == null) {
                zzbn.zzaW("GaExperimentRandom: No key");
            } else {
                Object obj = dataLayer.get(com_google_android_gms_internal_zzaf_zzc.zzaB);
                Long valueOf = !(obj instanceof Number) ? null : Long.valueOf(((Number) obj).longValue());
                long j = com_google_android_gms_internal_zzaf_zzc.zziK;
                long j2 = com_google_android_gms_internal_zzaf_zzc.zziL;
                if (!com_google_android_gms_internal_zzaf_zzc.zziM || valueOf == null || valueOf.longValue() < j || valueOf.longValue() > j2) {
                    if (j <= j2) {
                        obj = Long.valueOf(Math.round((Math.random() * ((double) (j2 - j))) + ((double) j)));
                    } else {
                        zzbn.zzaW("GaExperimentRandom: random range invalid");
                    }
                }
                dataLayer.zzgr(com_google_android_gms_internal_zzaf_zzc.zzaB);
                Map zzo = dataLayer.zzo(com_google_android_gms_internal_zzaf_zzc.zzaB, obj);
                if (com_google_android_gms_internal_zzaf_zzc.zziN > 0) {
                    if (zzo.containsKey("gtm")) {
                        Object obj2 = zzo.get("gtm");
                        if (obj2 instanceof Map) {
                            ((Map) obj2).put("lifetime", Long.valueOf(com_google_android_gms_internal_zzaf_zzc.zziN));
                        } else {
                            zzbn.zzaW("GaExperimentRandom: gtm not a map");
                        }
                    } else {
                        zzo.put("gtm", DataLayer.mapOf("lifetime", Long.valueOf(com_google_android_gms_internal_zzaf_zzc.zziN)));
                    }
                }
                dataLayer.push(zzo);
            }
        }
    }
}
