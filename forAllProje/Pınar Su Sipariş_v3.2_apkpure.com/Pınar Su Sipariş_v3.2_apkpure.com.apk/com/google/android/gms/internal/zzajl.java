package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class zzajl {
    public static String zziH(String str) throws UnsupportedEncodingException {
        return TextUtils.isEmpty(str) ? "" : zziI(URLEncoder.encode(str, "UTF8"));
    }

    public static String zziI(String str) {
        zzaa.zzz(str);
        return str.replace("%2F", "/");
    }

    public static String zziJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : str.split("/")) {
            if (!TextUtils.isEmpty(str2)) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("/").append(str2);
                } else {
                    stringBuilder.append(str2);
                }
            }
        }
        return stringBuilder.toString();
    }
}
