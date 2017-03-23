package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzvk extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        List arrayList = new ArrayList();
        for (zzabh add : (List) com_google_android_gms_internal_zzabm.zzMk()) {
            arrayList.add(add);
        }
        while (i < com_google_android_gms_internal_zzabh_Arr.length) {
            if (com_google_android_gms_internal_zzabh_Arr[i] instanceof zzabm) {
                for (zzabh add2 : (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[i]).zzMk()) {
                    arrayList.add(add2);
                }
            } else {
                arrayList.add(com_google_android_gms_internal_zzabh_Arr[i]);
            }
            i++;
        }
        return new zzabm(arrayList);
    }
}
