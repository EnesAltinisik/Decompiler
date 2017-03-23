package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Locale;

public class zzzn implements zzvh {
    public zzabh<?> zzb(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 0) {
            z = false;
        }
        zzaa.zzaj(z);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return new zzabp("");
        }
        String language = locale.getLanguage();
        return language == null ? new zzabp("") : new zzabp(language.toLowerCase());
    }
}
