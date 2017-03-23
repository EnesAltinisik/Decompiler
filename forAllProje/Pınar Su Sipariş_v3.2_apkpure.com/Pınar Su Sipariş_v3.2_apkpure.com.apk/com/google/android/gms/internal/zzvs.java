package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzvs extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        List list = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        return !list.isEmpty() ? (zzabh) list.remove(list.size() - 1) : zzabl.zzbvN;
    }
}
