package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzxz extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length > 0 && com_google_android_gms_internal_zzabh_Arr.length <= 3;
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        if (com_google_android_gms_internal_zzabh_Arr.length == 1) {
            return new zzabp(str);
        }
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr.length < 3 ? zzabl.zzbvN : com_google_android_gms_internal_zzabh_Arr[2];
        int indexOf = str.indexOf(zzd);
        if (indexOf == -1) {
            return new zzabp(str);
        }
        if (com_google_android_gms_internal_zzabh instanceof zzabk) {
            com_google_android_gms_internal_zzabh = ((zzvh) ((zzabk) com_google_android_gms_internal_zzabh).zzMk()).zzb(com_google_android_gms_internal_zzuw, new zzabp(zzd), new zzabj(Double.valueOf((double) indexOf)), new zzabp(str));
        }
        String zzd2 = zzvi.zzd(com_google_android_gms_internal_zzabh);
        String valueOf = String.valueOf(str.substring(0, indexOf));
        str = String.valueOf(str.substring(zzd.length() + indexOf));
        return new zzabp(new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(zzd2).length()) + String.valueOf(str).length()).append(valueOf).append(zzd2).append(str).toString());
    }
}
