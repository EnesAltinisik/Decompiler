package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class zzym extends zzvj {
    static String encode(String str, String str2) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        Charset forName = Charset.forName(Constants.ENCODING);
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (str2.indexOf(charAt) != -1) {
                stringBuilder.append((char) charAt);
                i++;
            } else {
                int i2 = 1;
                if (Character.isHighSurrogate((char) charAt)) {
                    if (i + 1 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    } else if (Character.isLowSurrogate(str.charAt(i + 1))) {
                        i2 = 2;
                    } else {
                        throw new UnsupportedEncodingException();
                    }
                }
                byte[] bytes = str.substring(i, i + i2).getBytes(forName);
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    stringBuilder.append("%");
                    stringBuilder.append(Character.toUpperCase(Character.forDigit((bytes[i3] >> 4) & 15, 16)));
                    stringBuilder.append(Character.toUpperCase(Character.forDigit(bytes[i3] & 15, 16)));
                }
                i += i2;
            }
        }
        return stringBuilder.toString().replaceAll(" ", "%20");
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        try {
            return new zzabp(encode(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr.length > 0 ? (zzabh) zzaa.zzz(com_google_android_gms_internal_zzabh_Arr[0]) : zzabl.zzbvN), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException e) {
            return zzabl.zzbvN;
        }
    }
}
