package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzwt extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 3);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabp);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[2] instanceof zzabm);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[1]).zzMk();
        List list = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[2]).zzMk();
        if (com_google_android_gms_internal_zzabh.zzht(str)) {
            zzabh zzhu = com_google_android_gms_internal_zzabh.zzhu(str);
            if (zzhu instanceof zzabk) {
                return ((zzvh) ((zzabk) zzhu).zzMk()).zzb(com_google_android_gms_internal_zzuw, (zzabh[]) list.toArray(new zzabh[list.size()]));
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 35).append("Apply TypeError: ").append(str).append(" is not a function").toString());
        } else if (com_google_android_gms_internal_zzabh.zzhv(str)) {
            zzvh zzhw = com_google_android_gms_internal_zzabh.zzhw(str);
            list.add(0, com_google_android_gms_internal_zzabh);
            return zzhw.zzb(com_google_android_gms_internal_zzuw, (zzabh[]) list.toArray(new zzabh[list.size()]));
        } else {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append("Apply TypeError: object has no ").append(str).append(" property").toString());
        }
    }
}
