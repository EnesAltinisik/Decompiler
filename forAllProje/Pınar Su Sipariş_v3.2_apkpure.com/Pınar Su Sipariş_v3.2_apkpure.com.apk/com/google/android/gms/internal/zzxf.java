package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzxf extends zzvj {
    public static final zzxf zzbus = new zzxf();

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr[1];
        zzaa.zzaj(!zzabq.zzo(com_google_android_gms_internal_zzabh));
        zzaa.zzaj(!zzabq.zzo(com_google_android_gms_internal_zzabh2));
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh2);
        double zzb;
        if (com_google_android_gms_internal_zzabh instanceof zzabm) {
            if ("length".equals(zzd)) {
                return new zzabi(Boolean.valueOf(true));
            }
            zzb = zzvi.zzb(com_google_android_gms_internal_zzabh2);
            if (zzb == Math.floor(zzb) && zzd.equals(Integer.toString((int) zzb))) {
                int i = (int) zzb;
                if (i >= 0 && i < ((List) ((zzabm) com_google_android_gms_internal_zzabh).zzMk()).size()) {
                    return new zzabi(Boolean.valueOf(true));
                }
            }
        } else if (com_google_android_gms_internal_zzabh instanceof zzabp) {
            if ("length".equals(zzd)) {
                return new zzabi(Boolean.valueOf(true));
            }
            zzb = zzvi.zzb(com_google_android_gms_internal_zzabh2);
            if (zzb == Math.floor(zzb) && zzd.equals(Integer.toString((int) zzb))) {
                int i2 = (int) zzb;
                if (i2 >= 0 && i2 < ((String) ((zzabp) com_google_android_gms_internal_zzabh).zzMk()).length()) {
                    return new zzabi(Boolean.valueOf(true));
                }
            }
            return new zzabi(Boolean.valueOf(false));
        }
        return new zzabi(Boolean.valueOf(com_google_android_gms_internal_zzabh.zzht(zzd)));
    }
}
