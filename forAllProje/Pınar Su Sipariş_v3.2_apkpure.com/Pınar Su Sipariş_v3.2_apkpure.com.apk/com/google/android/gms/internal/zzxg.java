package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzxg extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 2 || com_google_android_gms_internal_zzabh_Arr.length == 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[1] instanceof zzabm);
        if (com_google_android_gms_internal_zzabh_Arr.length == 3) {
            zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[2] instanceof zzabm);
        }
        List arrayList = new ArrayList();
        if (zzvi.zza(com_google_android_gms_internal_zzabh_Arr[0])) {
            arrayList = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[1]).zzMk();
        } else if (com_google_android_gms_internal_zzabh_Arr.length > 2) {
            arrayList = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[2]).zzMk();
        }
        zzabh<?> zza = zzabq.zza(com_google_android_gms_internal_zzuw, arrayList);
        return ((zza instanceof zzabl) && zzabq.zzo(zza)) ? zza : zzabl.zzbvN;
    }
}
