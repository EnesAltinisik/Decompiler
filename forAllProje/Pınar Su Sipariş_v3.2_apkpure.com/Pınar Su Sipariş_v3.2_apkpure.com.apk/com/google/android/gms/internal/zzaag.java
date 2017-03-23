package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class zzaag extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z = com_google_android_gms_internal_zzabh_Arr.length == 2 || com_google_android_gms_internal_zzabh_Arr.length == 3;
        zzaa.zzaj(z);
        try {
            return new zzabi(Boolean.valueOf(Pattern.compile(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]), com_google_android_gms_internal_zzabh_Arr.length < 3 ? false : "true".equalsIgnoreCase(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[2])) ? 66 : 64).matcher(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0])).find()));
        } catch (PatternSyntaxException e) {
            return new zzabi(Boolean.valueOf(false));
        }
    }
}
