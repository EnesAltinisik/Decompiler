package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.Map;

@vz
public abstract class px {
    @vz
    public static final px a = new px() {
        public String a(String str, String str2) {
            return str2;
        }
    };
    @vz
    public static final px b = new px() {
        public String a(String str, String str2) {
            return str != null ? str : str2;
        }
    };
    @vz
    public static final px c = new px() {
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

        public String a(String str, String str2) {
            String a = a(str);
            String a2 = a(str2);
            return TextUtils.isEmpty(a) ? a2 : TextUtils.isEmpty(a2) ? a : new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(a2).length()).append(a).append(",").append(a2).toString();
        }
    };

    public abstract String a(String str, String str2);

    public final void a(Map<String, String> map, String str, String str2) {
        map.put(str, a((String) map.get(str), str2));
    }
}
