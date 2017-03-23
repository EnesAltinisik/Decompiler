package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.plus.PlusShare;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzzm extends zzvj {
    private String zza(String str, int i, Set<Character> set) {
        switch (i) {
            case 1:
                try {
                    return URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
                } catch (UnsupportedEncodingException e) {
                    return str;
                }
            case 2:
                String replace = str.replace("\\", "\\\\");
                String str2 = replace;
                for (Character ch : set) {
                    CharSequence ch2 = ch.toString();
                    String str3 = "\\";
                    replace = String.valueOf(ch2);
                    str2 = str2.replace(ch2, replace.length() != 0 ? str3.concat(replace) : new String(str3));
                }
                return str2;
            default:
                return str;
        }
    }

    private void zza(StringBuilder stringBuilder, String str, int i, Set<Character> set) {
        stringBuilder.append(zza(str, i, set));
    }

    private void zza(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        int i = 2;
        int i2 = 1;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr.length >= 1);
        zzabh com_google_android_gms_internal_zzabh = com_google_android_gms_internal_zzabh_Arr[0];
        zzabh com_google_android_gms_internal_zzabh2 = com_google_android_gms_internal_zzabh_Arr.length > 1 ? com_google_android_gms_internal_zzabh_Arr[1] : zzabl.zzbvN;
        String str = "";
        if (com_google_android_gms_internal_zzabh_Arr.length > 2) {
            str = com_google_android_gms_internal_zzabh_Arr[2] == zzabl.zzbvN ? "" : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[2]);
        }
        String str2 = "=";
        if (com_google_android_gms_internal_zzabh_Arr.length > 3) {
            str2 = com_google_android_gms_internal_zzabh_Arr[3] == zzabl.zzbvN ? "=" : zzvi.zzd(com_google_android_gms_internal_zzabh_Arr[3]);
        }
        Set set = null;
        if (com_google_android_gms_internal_zzabh2 != zzabl.zzbvN) {
            zzaa.zzaj(com_google_android_gms_internal_zzabh2 instanceof zzabp);
            if (PlusShare.KEY_CALL_TO_ACTION_URL.equals(com_google_android_gms_internal_zzabh2.zzMk())) {
                i = 1;
            } else if (!"backslash".equals(com_google_android_gms_internal_zzabh2.zzMk())) {
                return new zzabp("");
            } else {
                Set hashSet = new HashSet();
                zza(hashSet, str);
                zza(hashSet, str2);
                hashSet.remove(Character.valueOf('\\'));
                set = hashSet;
            }
        } else {
            i = 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (com_google_android_gms_internal_zzabh instanceof zzabm) {
            for (zzabh com_google_android_gms_internal_zzabh3 : (List) ((zzabm) com_google_android_gms_internal_zzabh3).zzMk()) {
                if (i2 == 0) {
                    stringBuilder.append(str);
                }
                zza(stringBuilder, zzvi.zzd(com_google_android_gms_internal_zzabh3), i, set);
                i2 = 0;
            }
        } else if (com_google_android_gms_internal_zzabh3 instanceof zzabn) {
            Map map = (Map) ((zzabn) com_google_android_gms_internal_zzabh3).zzMk();
            int i3 = 1;
            for (String str3 : map.keySet()) {
                if (i3 == 0) {
                    stringBuilder.append(str);
                }
                String zzd = zzvi.zzd((zzabh) map.get(str3));
                zza(stringBuilder, str3, i, set);
                stringBuilder.append(str2);
                zza(stringBuilder, zzd, i, set);
                i3 = 0;
            }
        } else {
            zza(stringBuilder, zzvi.zzd(com_google_android_gms_internal_zzabh3), i, set);
        }
        return new zzabp(stringBuilder.toString());
    }
}
