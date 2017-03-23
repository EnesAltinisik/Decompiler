package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzxi implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 0;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        List arrayList = new ArrayList(com_google_android_gms_internal_zzabh_Arr.length);
        int length = com_google_android_gms_internal_zzabh_Arr.length;
        while (i < length) {
            arrayList.add(com_google_android_gms_internal_zzabh_Arr[i]);
            i++;
        }
        return new zzabm(arrayList);
    }
}
