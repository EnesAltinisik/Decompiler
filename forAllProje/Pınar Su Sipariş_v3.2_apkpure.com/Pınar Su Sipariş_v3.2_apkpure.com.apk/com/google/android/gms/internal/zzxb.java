package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Iterator;
import java.util.List;

public class zzxb extends zzvj {
    public zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_Arr);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 3);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        zzaa.zzaj(com_google_android_gms_internal_zzuw.has(str));
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[1];
        zzaa.zzz(com_google_android_gms_internal_zzabh);
        zzabh<?> com_google_android_gms_internal_zzabh_ = com_google_android_gms_internal_zzabh_Arr[2];
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ instanceof zzabm);
        List list = (List) ((zzabm) com_google_android_gms_internal_zzabh_).zzMk();
        Iterator zzMj = com_google_android_gms_internal_zzabh.zzMj();
        while (zzMj.hasNext()) {
            com_google_android_gms_internal_zzuw.zzb(str, (zzabh) zzMj.next());
            com_google_android_gms_internal_zzabh = zzabq.zza(com_google_android_gms_internal_zzuw, list);
            if (com_google_android_gms_internal_zzabh == zzabl.zzbvK) {
                return zzabl.zzbvN;
            }
            if (com_google_android_gms_internal_zzabh.zzMr()) {
                return com_google_android_gms_internal_zzabh;
            }
        }
        return zzabl.zzbvN;
    }
}
