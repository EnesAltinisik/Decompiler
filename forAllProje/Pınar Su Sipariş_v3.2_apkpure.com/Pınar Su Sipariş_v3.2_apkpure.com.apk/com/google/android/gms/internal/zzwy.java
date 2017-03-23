package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.List;

public class zzwy extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        List arrayList = new ArrayList();
        for (zzabl com_google_android_gms_internal_zzabl : com_google_android_gms_internal_zzabh_Arr) {
            boolean z = !(com_google_android_gms_internal_zzabl instanceof zzabl) || com_google_android_gms_internal_zzabl == zzabl.zzbvN || com_google_android_gms_internal_zzabl == zzabl.zzbvM;
            zzaa.zzaj(z);
            arrayList.add(com_google_android_gms_internal_zzabl);
        }
        return new zzabm(arrayList);
    }
}
