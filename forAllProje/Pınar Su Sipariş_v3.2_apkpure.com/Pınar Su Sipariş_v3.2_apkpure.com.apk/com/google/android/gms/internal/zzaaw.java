package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class zzaaw {
    private String zzbot = "https://www.google-analytics.com";

    private String zzgU(String str) {
        try {
            return URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            String str2 = "Cannot encode the string: ";
            String valueOf = String.valueOf(str);
            zzun.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return "";
        }
    }

    public String zzb(zzaam com_google_android_gms_internal_zzaam) {
        String str = this.zzbot;
        String valueOf = String.valueOf("/gtm/android?");
        String zzLK = com_google_android_gms_internal_zzaam.zzLJ() ? com_google_android_gms_internal_zzaam.zzLK() : zzc(com_google_android_gms_internal_zzaam);
        return new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(zzLK).length()).append(str).append(valueOf).append(zzLK).toString();
    }

    String zzc(zzaam com_google_android_gms_internal_zzaam) {
        if (com_google_android_gms_internal_zzaam == null) {
            return "";
        }
        String trim = !com_google_android_gms_internal_zzaam.zzLL().trim().equals("") ? com_google_android_gms_internal_zzaam.zzLL().trim() : "-1";
        StringBuilder stringBuilder = new StringBuilder();
        if (com_google_android_gms_internal_zzaam.zzLH() != null) {
            stringBuilder.append(com_google_android_gms_internal_zzaam.zzLH());
        } else {
            stringBuilder.append("id");
        }
        stringBuilder.append("=").append(zzgU(com_google_android_gms_internal_zzaam.getContainerId())).append("&").append("pv").append("=").append(zzgU(trim)).append("&").append("rv=5.0");
        if (com_google_android_gms_internal_zzaam.zzLJ()) {
            stringBuilder.append("&gtm_debug=x");
        }
        return stringBuilder.toString();
    }

    public void zzhn(String str) {
        this.zzbot = str;
        String str2 = "The Ctfe server endpoint was changed to: ";
        String valueOf = String.valueOf(str);
        zzun.zzaV(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
