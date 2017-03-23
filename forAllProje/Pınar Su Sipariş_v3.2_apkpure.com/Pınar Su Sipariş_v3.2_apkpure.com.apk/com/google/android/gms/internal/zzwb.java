package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class zzwb extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 3);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        int zzc = (int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[1]);
        zzc = zzc < 0 ? Math.max(((List) com_google_android_gms_internal_zzabm.zzMk()).size() + zzc, 0) : Math.min(zzc, ((List) com_google_android_gms_internal_zzabm.zzMk()).size());
        int min = zzc + Math.min(Math.max((int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[2]), 0), ((List) com_google_android_gms_internal_zzabm.zzMk()).size() - zzc);
        List arrayList = new ArrayList(((List) com_google_android_gms_internal_zzabm.zzMk()).subList(zzc, min));
        ((List) com_google_android_gms_internal_zzabm.zzMk()).subList(zzc, min).clear();
        Collection arrayList2 = new ArrayList();
        for (int i = 3; i < com_google_android_gms_internal_zzabh_Arr.length; i++) {
            arrayList2.add(com_google_android_gms_internal_zzabh_Arr[i]);
        }
        ((List) com_google_android_gms_internal_zzabm.zzMk()).addAll(zzc, arrayList2);
        return new zzabm(arrayList);
    }
}
