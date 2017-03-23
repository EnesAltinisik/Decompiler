package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzyc extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 1 || com_google_android_gms_internal_zzabh_Arr.length == 2;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        List arrayList = new ArrayList();
        if (com_google_android_gms_internal_zzabh_Arr.length == 1) {
            arrayList.add(com_google_android_gms_internal_zzabh_Arr[0]);
        } else {
            String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
            String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
            boolean equals = zzd.equals("");
            String[] split = str.split(zzd, equals ? 0 : -1);
            if (!equals) {
                i = 0;
            }
            while (i < split.length) {
                arrayList.add(new zzabp(split[i]));
                i++;
            }
        }
        return new zzabm(arrayList);
    }
}
