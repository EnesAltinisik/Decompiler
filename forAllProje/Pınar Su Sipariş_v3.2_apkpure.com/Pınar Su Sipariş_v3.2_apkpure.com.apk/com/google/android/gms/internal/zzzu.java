package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class zzzu extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 2);
        if (com_google_android_gms_internal_zzabh_Arr[0] == zzabl.zzbvN || com_google_android_gms_internal_zzabh_Arr[1] == zzabl.zzbvN) {
            return zzabl.zzbvN;
        }
        int i;
        CharSequence zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]);
        String zzd2 = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
        int i2 = 64;
        if (com_google_android_gms_internal_zzabh_Arr.length > 2 && com_google_android_gms_internal_zzabh_Arr[2] != zzabl.zzbvN && zzvi.zza(com_google_android_gms_internal_zzabh_Arr[2])) {
            i2 = 66;
        }
        if (com_google_android_gms_internal_zzabh_Arr.length <= 3 || com_google_android_gms_internal_zzabh_Arr[3] == zzabl.zzbvN) {
            i = 1;
        } else if (!(com_google_android_gms_internal_zzabh_Arr[3] instanceof zzabj)) {
            return zzabl.zzbvN;
        } else {
            double zzc = zzvi.zzc(com_google_android_gms_internal_zzabh_Arr[3]);
            if (Double.isInfinite(zzc) || zzc < 0.0d) {
                return zzabl.zzbvN;
            }
            i = (int) zzc;
        }
        String str = null;
        try {
            Matcher matcher = Pattern.compile(zzd2, i2).matcher(zzd);
            if (matcher.find() && matcher.groupCount() >= i) {
                str = matcher.group(i);
            }
            return str == null ? zzabl.zzbvN : new zzabp(str);
        } catch (PatternSyntaxException e) {
            return zzabl.zzbvN;
        }
    }
}
