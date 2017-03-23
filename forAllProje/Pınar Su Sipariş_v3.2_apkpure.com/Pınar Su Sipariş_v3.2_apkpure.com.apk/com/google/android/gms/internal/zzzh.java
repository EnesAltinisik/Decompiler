package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.tagmanager.zzk;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class zzzh extends zzvj {
    private static final Pattern zzbuy = Pattern.compile("(.+)/(.+)/(.+)");

    private static String zza(Cipher cipher, String str, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Encrypt: empty input string");
        }
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return zzk.zzk(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            String str2 = "Encrypt: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        String valueOf;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 3);
        String zzd = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[0]);
        String zzd2 = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[1]);
        String zzd3 = zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[2]);
        Object zzd4 = com_google_android_gms_internal_zzabh_Arr.length < 4 ? "AES/CBC/NoPadding" : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[3]);
        Matcher matcher = zzbuy.matcher(zzd4);
        if (matcher.matches()) {
            try {
                return new zzabp(zza(Cipher.getInstance(zzd4), zzd, new SecretKeySpec(zzd2.getBytes(), matcher.group(1)), new IvParameterSpec(zzd3.getBytes())));
            } catch (NoSuchAlgorithmException e) {
                zzd = "Encrypt: invalid transformation:";
                valueOf = String.valueOf(zzd4);
                throw new RuntimeException(valueOf.length() == 0 ? zzd.concat(valueOf) : new String(zzd));
            } catch (NoSuchPaddingException e2) {
                zzd = "Encrypt: invalid transformation:";
                valueOf = String.valueOf(zzd4);
                if (valueOf.length() == 0) {
                }
                throw new RuntimeException(valueOf.length() == 0 ? zzd.concat(valueOf) : new String(zzd));
            }
        }
        zzd = "Encrypt: invalid transformation:";
        valueOf = String.valueOf(zzd4);
        throw new RuntimeException(valueOf.length() != 0 ? zzd.concat(valueOf) : new String(zzd));
    }
}
