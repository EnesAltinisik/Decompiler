package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.List;

public class zzvw extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        Collections.reverse((List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[0]).zzMk());
        return com_google_android_gms_internal_zzabh_Arr[0];
    }
}
