package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxk extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 3);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr[1];
        zzabh<?> com_google_android_gms_internal_zzabh_ = com_google_android_gms_internal_zzabh_Arr[2];
        zzaa.zzaj(com_google_android_gms_internal_zzabh != zzabl.zzbvM);
        zzaa.zzaj(com_google_android_gms_internal_zzabh != zzabl.zzbvN);
        zzaa.zzaj(!zzabq.zzo(com_google_android_gms_internal_zzabh));
        zzaa.zzaj(!zzabq.zzo(com_google_android_gms_internal_zzabh2));
        zzaa.zzaj(!zzabq.zzo(com_google_android_gms_internal_zzabh_));
        if (zzabq.zzn(com_google_android_gms_internal_zzabh)) {
            return com_google_android_gms_internal_zzabh_;
        }
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh2);
        if (com_google_android_gms_internal_zzabh instanceof zzabn) {
            zzabn com_google_android_gms_internal_zzabn = (zzabn) com_google_android_gms_internal_zzabh;
            if (!com_google_android_gms_internal_zzabn.zzMv()) {
                com_google_android_gms_internal_zzabn.zzc(zzd, com_google_android_gms_internal_zzabh_);
            }
            return com_google_android_gms_internal_zzabh_;
        }
        if (com_google_android_gms_internal_zzabh instanceof zzabm) {
            zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh;
            if ("length".equals(zzd)) {
                double zzb = zzvi.zzb(com_google_android_gms_internal_zzabh_);
                if (Double.isInfinite(zzb) || zzb != Math.floor(zzb)) {
                    z = false;
                }
                zzaa.zzaj(z);
                com_google_android_gms_internal_zzabm.setSize((int) zzb);
                return com_google_android_gms_internal_zzabh_;
            }
            double zzb2 = zzvi.zzb(com_google_android_gms_internal_zzabh2);
            if (!Double.isInfinite(zzb2) && zzb2 >= 0.0d && zzd.equals(Integer.toString((int) zzb2))) {
                com_google_android_gms_internal_zzabm.zza((int) zzb2, com_google_android_gms_internal_zzabh_);
                return com_google_android_gms_internal_zzabh_;
            }
        }
        com_google_android_gms_internal_zzabh.zzc(zzd, com_google_android_gms_internal_zzabh_);
        return com_google_android_gms_internal_zzabh_;
    }
}
