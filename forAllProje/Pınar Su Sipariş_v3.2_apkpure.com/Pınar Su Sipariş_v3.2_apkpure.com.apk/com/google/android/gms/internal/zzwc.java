package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class zzwc extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        Collection arrayList = new ArrayList();
        while (i < com_google_android_gms_internal_zzabh_Arr.length) {
            arrayList.add(com_google_android_gms_internal_zzabh_Arr[i]);
            i++;
        }
        ((List) com_google_android_gms_internal_zzabm.zzMk()).addAll(0, arrayList);
        return new zzabj(Double.valueOf((double) ((List) com_google_android_gms_internal_zzabm.zzMk()).size()));
    }
}
