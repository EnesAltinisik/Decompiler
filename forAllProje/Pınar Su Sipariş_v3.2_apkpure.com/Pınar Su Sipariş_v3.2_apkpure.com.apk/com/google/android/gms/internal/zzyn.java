package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.io.UnsupportedEncodingException;

public class zzyn extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        try {
            return new zzabp(zzym.encode(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr.length > 0 ? (zzabh) zzaa.zzz(com_google_android_gms_internal_zzabh_Arr[0]) : zzabl.zzbvN), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()"));
        } catch (UnsupportedEncodingException e) {
            return zzabl.zzbvN;
        }
    }
}
