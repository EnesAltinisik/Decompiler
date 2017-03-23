package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.List;

public class zzvp extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 1 || com_google_android_gms_internal_zzabh_Arr.length == 2;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabm);
        List<zzabh> list = (List) ((zzabm) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr.length < 2 ? zzabl.zzbvN : com_google_android_gms_internal_zzabh_Arr[1];
        String zzd = com_google_android_gms_internal_zzabh == zzabl.zzbvN ? "," : zzvi.zzd(com_google_android_gms_internal_zzabh);
        Iterable arrayList = new ArrayList();
        for (zzabh com_google_android_gms_internal_zzabh2 : list) {
            if (com_google_android_gms_internal_zzabh2 == zzabl.zzbvM || com_google_android_gms_internal_zzabh2 == zzabl.zzbvN) {
                arrayList.add("");
            } else {
                arrayList.add(zzvi.zzd(com_google_android_gms_internal_zzabh2));
            }
        }
        return new zzabp(zzx.zzdk(zzd).zza(arrayList));
    }
}
