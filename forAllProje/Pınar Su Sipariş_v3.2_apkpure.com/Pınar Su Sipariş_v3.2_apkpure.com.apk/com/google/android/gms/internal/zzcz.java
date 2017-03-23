package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;

@zzig
public abstract class zzcz {
    @zzig
    public static final zzcz zzzV = new zzcz() {
        public String zze(String str, String str2) {
            return str2;
        }
    };
    @zzig
    public static final zzcz zzzW = new zzcz() {
        public String zze(String str, String str2) {
            return str != null ? str : str2;
        }
    };
    @zzig
    public static final zzcz zzzX = new zzcz() {
        private String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            int i = 0;
            int length = str.length();
            while (i < str.length() && str.charAt(i) == ',') {
                i++;
            }
            while (length > 0 && str.charAt(length - 1) == ',') {
                length--;
            }
            return (i == 0 && length == str.length()) ? str : str.substring(i, length);
        }

        public String zze(String str, String str2) {
            String a = a(str);
            String a2 = a(str2);
            return TextUtils.isEmpty(a) ? a2 : TextUtils.isEmpty(a2) ? a : new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(a2).length()).append(a).append(",").append(a2).toString();
        }
    };

    public final void zza(Map<String, String> map, String str, String str2) {
        map.put(str, zze((String) map.get(str), str2));
    }

    public abstract String zze(String str, String str2);
}
