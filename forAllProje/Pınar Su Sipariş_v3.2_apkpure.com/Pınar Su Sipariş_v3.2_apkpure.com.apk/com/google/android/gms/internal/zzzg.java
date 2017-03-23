package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.zzk;

public class zzzg extends zzvj {
    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 1;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]);
        Object obj = "text";
        if (com_google_android_gms_internal_zzabh_Arr.length > 1) {
            obj = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
        }
        Object obj2 = "base16";
        if (com_google_android_gms_internal_zzabh_Arr.length > 2) {
            obj2 = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[2]);
        }
        if (com_google_android_gms_internal_zzabh_Arr.length <= 3 || !zzvi.zza(com_google_android_gms_internal_zzabh_Arr[3])) {
            i = 0;
        }
        i = i != 0 ? 3 : 2;
        String zzk;
        String str;
        try {
            byte[] bytes;
            if ("text".equals(obj)) {
                bytes = zzd.getBytes();
            } else if ("base16".equals(obj)) {
                bytes = zzk.zzgi(zzd);
            } else if ("base64".equals(obj)) {
                bytes = Base64.decode(zzd, i);
            } else if ("base64url".equals(obj)) {
                bytes = Base64.decode(zzd, i | 8);
            } else {
                String str2 = "Encode: unknown input format: ";
                String valueOf = String.valueOf(obj);
                throw new UnsupportedOperationException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            if ("base16".equals(obj2)) {
                zzk = zzk.zzk(bytes);
            } else if ("base64".equals(obj2)) {
                zzk = Base64.encodeToString(bytes, i);
            } else if ("base64url".equals(obj2)) {
                zzk = Base64.encodeToString(bytes, i | 8);
            } else {
                str = "Encode: unknown output format: ";
                zzk = String.valueOf(obj2);
                throw new RuntimeException(zzk.length() != 0 ? str.concat(zzk) : new String(str));
            }
            return new zzabp(zzk);
        } catch (IllegalArgumentException e) {
            str = "Encode: invalid input:";
            zzk = String.valueOf(obj);
            throw new RuntimeException(zzk.length() != 0 ? str.concat(zzk) : new String(str));
        }
    }
}
