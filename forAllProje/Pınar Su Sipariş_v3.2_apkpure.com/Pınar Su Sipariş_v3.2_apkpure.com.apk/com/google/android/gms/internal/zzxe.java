package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzxe extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr[1];
        boolean z2 = (com_google_android_gms_internal_zzabh instanceof zzabp) || !zzabq.zzn(com_google_android_gms_internal_zzabh);
        zzaa.zzaj(z2);
        zzaa.zzaj(!zzabq.zzo(com_google_android_gms_internal_zzabh));
        if (zzabq.zzo(com_google_android_gms_internal_zzabh2)) {
            z = false;
        }
        zzaa.zzaj(z);
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh2);
        double zzb;
        if (com_google_android_gms_internal_zzabh instanceof zzabm) {
            zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh;
            if ("length".equals(zzd)) {
                return new zzabj(Double.valueOf((double) ((List) com_google_android_gms_internal_zzabm.zzMk()).size()));
            }
            zzb = zzvi.zzb(com_google_android_gms_internal_zzabh2);
            if (zzb == Math.floor(zzb) && zzd.equals(Integer.toString((int) zzb))) {
                zzabh<?> zzkZ = com_google_android_gms_internal_zzabm.zzkZ((int) zzb);
                if (zzkZ != zzabl.zzbvN) {
                    return zzkZ;
                }
            }
        } else if (com_google_android_gms_internal_zzabh instanceof zzabp) {
            zzabp com_google_android_gms_internal_zzabp = (zzabp) com_google_android_gms_internal_zzabh;
            if ("length".equals(zzd)) {
                return new zzabj(Double.valueOf((double) ((String) com_google_android_gms_internal_zzabp.zzMk()).length()));
            }
            zzb = zzvi.zzb(com_google_android_gms_internal_zzabh2);
            return (zzb == Math.floor(zzb) && zzd.equals(Integer.toString((int) zzb))) ? com_google_android_gms_internal_zzabp.zzlb((int) zzb) : zzabl.zzbvN;
        }
        return com_google_android_gms_internal_zzabh.zzhu(zzd);
    }
}
