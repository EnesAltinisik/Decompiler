package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzxl extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 3);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabm);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[2] instanceof zzabm);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        List list = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[1]).zzMk();
        List list2 = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[2]).zzMk();
        zzaa.zzaj(list2.size() <= list.size() + 1);
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            int i4;
            if (i3 != 0 || zzvi.zzd(com_google_android_gms_internal_zzabh, zzabq.zza(com_google_android_gms_internal_zzuw, (zzabh) list.get(i2)))) {
                zzabh<?> zza = zzabq.zza(com_google_android_gms_internal_zzuw, (zzabh) list2.get(i2));
                if (!(zza instanceof zzabl)) {
                    i4 = 1;
                    i2++;
                    i3 = i4;
                } else if (zza == zzabl.zzbvL || ((zzabl) zza).zzMr()) {
                    return zza;
                } else {
                    if (zza == zzabl.zzbvK) {
                        return zzabl.zzbvN;
                    }
                }
            }
            i4 = i3;
            i2++;
            i3 = i4;
        }
        if (list.size() >= list2.size()) {
            i = 0;
        }
        if (i != 0) {
            zzabh<?> zza2 = zzabq.zza(com_google_android_gms_internal_zzuw, (zzabh) list2.get(list2.size() - 1));
            if ((zza2 instanceof zzabl) && (zza2 == zzabl.zzbvL || ((zzabl) zza2).zzMr())) {
                return zza2;
            }
        }
        return zzabl.zzbvN;
    }
}
