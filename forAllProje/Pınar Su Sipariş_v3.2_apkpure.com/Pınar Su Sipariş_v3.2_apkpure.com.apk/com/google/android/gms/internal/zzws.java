package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzws extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length == 1);
        zzaa.zzaj(!(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabo));
        if (zzabq.zzo(com_google_android_gms_internal_zzabh_Arr[0])) {
            z = false;
        }
        zzaa.zzaj(z);
        zzabh<?> com_google_android_gms_internal_zzabh_ = com_google_android_gms_internal_zzabh_Arr[0];
        String str = "object";
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvN) {
            str = "undefined";
        } else if (com_google_android_gms_internal_zzabh_ instanceof zzabi) {
            str = "boolean";
        } else if (com_google_android_gms_internal_zzabh_ instanceof zzabj) {
            str = "number";
        } else if (com_google_android_gms_internal_zzabh_ instanceof zzabp) {
            str = "string";
        } else if (com_google_android_gms_internal_zzabh_ instanceof zzabk) {
            str = "function";
        }
        return new zzabp(str);
    }
}
