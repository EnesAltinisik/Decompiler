package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.zzk;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class zzzk extends zzvj {
    private byte[] zzf(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        if (com_google_android_gms_internal_zzabh_Arr[0] == zzabl.zzbvN) {
            return zzabl.zzbvN;
        }
        byte[] bytes;
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]);
        String str = Constants.MD5;
        if (com_google_android_gms_internal_zzabh_Arr.length > 1) {
            str = com_google_android_gms_internal_zzabh_Arr[1] == zzabl.zzbvN ? Constants.MD5 : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
        }
        Object obj = "text";
        if (com_google_android_gms_internal_zzabh_Arr.length > 2) {
            obj = com_google_android_gms_internal_zzabh_Arr[2] == zzabl.zzbvN ? "text" : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[2]);
        }
        if ("text".equals(obj)) {
            bytes = zzd.getBytes();
        } else if ("base16".equals(obj)) {
            bytes = zzk.zzgi(zzd);
        } else {
            String str2 = "Hash: Unknown input format: ";
            str = String.valueOf(obj);
            throw new RuntimeException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
        try {
            return new zzabp(zzk.zzk(zzf(str, bytes)));
        } catch (Throwable e) {
            str2 = "Hash: Unknown algorithm: ";
            str = String.valueOf(str);
            throw new RuntimeException(str.length() != 0 ? str2.concat(str) : new String(str2), e);
        }
    }
}
