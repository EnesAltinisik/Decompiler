package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class zzyk extends zzvj {
    static String decode(String str, String str2) throws UnsupportedEncodingException {
        Charset forName = Charset.forName(Constants.ENCODING);
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                stringBuilder.append((char) charAt);
                i++;
            } else {
                byte zzC = zzC(str, i);
                int i2 = i + 3;
                if ((zzC & 128) != 0) {
                    int i3 = 0;
                    while (((zzC << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = zzC;
                    int i4 = 1;
                    while (i4 < i3) {
                        byte zzC2 = zzC(str, i2);
                        int i5 = i2 + 3;
                        if ((zzC2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i4] = zzC2;
                        i4++;
                        i2 = i5;
                    }
                    CharSequence decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        stringBuilder.append(decode);
                        i = i2;
                    } else {
                        stringBuilder.append(str.substring(i, i2));
                        i = i2;
                    }
                } else if (str2.indexOf(zzC) == -1) {
                    stringBuilder.append((char) zzC);
                    i = i2;
                } else {
                    stringBuilder.append(str.substring(i2 - 3, i2));
                    i = i2;
                }
            }
        }
        return stringBuilder.toString();
    }

    private static byte zzC(String str, int i) throws UnsupportedEncodingException {
        if (i + 3 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i + 1, i + 3);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException e) {
            throw new UnsupportedEncodingException();
        }
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        try {
            return new zzabp(decode(zzvi.zzd(com_google_android_gms_internal_zzabh_Arr.length > 0 ? (zzabh) zzaa.zzz(com_google_android_gms_internal_zzabh_Arr[0]) : zzabl.zzbvN), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException e) {
            return zzabl.zzbvN;
        }
    }
}
