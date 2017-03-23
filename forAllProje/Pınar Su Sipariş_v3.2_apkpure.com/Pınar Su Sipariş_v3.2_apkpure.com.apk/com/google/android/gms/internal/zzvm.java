package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzvm extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabk);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        zzabk com_google_android_gms_internal_zzabk = (zzabk) com_google_android_gms_internal_zzabh_Arr[1];
        List list = (List) com_google_android_gms_internal_zzabm.zzMk();
        int size = list.size();
        List arrayList = new ArrayList();
        int i = 0;
        while (i < size && i < ((List) com_google_android_gms_internal_zzabm.zzMk()).size()) {
            if (com_google_android_gms_internal_zzabm.zzla(i)) {
                if (zzvi.zza(((zzvh) com_google_android_gms_internal_zzabk.zzMk()).zzb(com_google_android_gms_internal_zzuw, (zzabh) list.get(i), new zzabj(Double.valueOf((double) i)), com_google_android_gms_internal_zzabm))) {
                    arrayList.add((zzabh) list.get(i));
                }
            }
            i++;
        }
        return new zzabm(arrayList);
    }
}
