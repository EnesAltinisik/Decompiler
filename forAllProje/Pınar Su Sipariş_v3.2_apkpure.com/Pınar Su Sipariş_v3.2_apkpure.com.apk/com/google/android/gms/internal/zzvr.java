package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzvr extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 2);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabk);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        zzabk com_google_android_gms_internal_zzabk = (zzabk) com_google_android_gms_internal_zzabh_Arr[1];
        int size = ((List) com_google_android_gms_internal_zzabm.zzMk()).size();
        List arrayList = new ArrayList();
        int i = 0;
        while (i < size && i < ((List) com_google_android_gms_internal_zzabm.zzMk()).size()) {
            Object obj = null;
            if (com_google_android_gms_internal_zzabm.zzla(i)) {
                zzabh zzb = ((zzvh) com_google_android_gms_internal_zzabk.zzMk()).zzb(com_google_android_gms_internal_zzuw, (zzabh) r2.get(i), new zzabj(Double.valueOf((double) i)), com_google_android_gms_internal_zzabm);
                zzaa.zzai(!zzabq.zzo(zzb));
                obj = zzb;
            }
            arrayList.add(obj);
            i++;
        }
        return new zzabm(arrayList);
    }
}
