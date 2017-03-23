package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzvy extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 2 || com_google_android_gms_internal_zzabh_Arr.length == 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_Arr[0];
        int zzc = (int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[1]);
        zzc = zzc < 0 ? Math.max(((List) com_google_android_gms_internal_zzabm.zzMk()).size() + zzc, 0) : Math.min(zzc, ((List) com_google_android_gms_internal_zzabm.zzMk()).size());
        int size = ((List) com_google_android_gms_internal_zzabm.zzMk()).size();
        if (com_google_android_gms_internal_zzabh_Arr.length == 3) {
            int zzc2 = (int) zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[2]);
            size = zzc2 < 0 ? Math.max(((List) com_google_android_gms_internal_zzabm.zzMk()).size() + zzc2, 0) : Math.min(zzc2, ((List) com_google_android_gms_internal_zzabm.zzMk()).size());
        }
        return new zzabm(new ArrayList(((List) com_google_android_gms_internal_zzabm.zzMk()).subList(zzc, Math.max(zzc, size))));
    }
}
