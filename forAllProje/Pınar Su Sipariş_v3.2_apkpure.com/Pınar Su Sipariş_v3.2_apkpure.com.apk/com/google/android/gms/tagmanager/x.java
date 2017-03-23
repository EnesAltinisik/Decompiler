package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.plus.PlusShare;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class x extends k {
    private static final String a = zzad.JOINER.toString();
    private static final String b = zzae.ARG0.toString();
    private static final String c = zzae.ITEM_SEPARATOR.toString();
    private static final String d = zzae.KEY_VALUE_SEPARATOR.toString();
    private static final String e = zzae.ESCAPE.toString();

    private enum a {
        NONE,
        URL,
        BACKSLASH
    }

    public x() {
        super(a, b);
    }

    private String a(String str, a aVar, Set<Character> set) {
        switch (aVar) {
            case URL:
                try {
                    return by.a(str);
                } catch (Throwable e) {
                    zzbn.zzb("Joiner: unsupported encoding", e);
                    return str;
                }
            case BACKSLASH:
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

    private void a(StringBuilder stringBuilder, String str, a aVar, Set<Character> set) {
        stringBuilder.append(a(str, aVar, set));
    }

    private void a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(b);
        if (com_google_android_gms_internal_zzag_zza == null) {
            return zzdl.zzKT();
        }
        a aVar;
        Set set;
        zza com_google_android_gms_internal_zzag_zza2 = (zza) map.get(c);
        String zzg = com_google_android_gms_internal_zzag_zza2 != null ? zzdl.zzg(com_google_android_gms_internal_zzag_zza2) : "";
        com_google_android_gms_internal_zzag_zza2 = (zza) map.get(d);
        String zzg2 = com_google_android_gms_internal_zzag_zza2 != null ? zzdl.zzg(com_google_android_gms_internal_zzag_zza2) : "=";
        a aVar2 = a.NONE;
        com_google_android_gms_internal_zzag_zza2 = (zza) map.get(e);
        if (com_google_android_gms_internal_zzag_zza2 != null) {
            String zzg3 = zzdl.zzg(com_google_android_gms_internal_zzag_zza2);
            if (PlusShare.KEY_CALL_TO_ACTION_URL.equals(zzg3)) {
                aVar = a.URL;
                set = null;
            } else if ("backslash".equals(zzg3)) {
                aVar = a.BACKSLASH;
                set = new HashSet();
                a(set, zzg);
                a(set, zzg2);
                set.remove(Character.valueOf('\\'));
            } else {
                zzg = "Joiner: unsupported escape type: ";
                String valueOf = String.valueOf(zzg3);
                zzbn.e(valueOf.length() != 0 ? zzg.concat(valueOf) : new String(zzg));
                return zzdl.zzKT();
            }
        }
        set = null;
        aVar = aVar2;
        StringBuilder stringBuilder = new StringBuilder();
        switch (com_google_android_gms_internal_zzag_zza.type) {
            case 2:
                Object obj = 1;
                zza[] com_google_android_gms_internal_zzag_zzaArr = com_google_android_gms_internal_zzag_zza.zzjK;
                int length = com_google_android_gms_internal_zzag_zzaArr.length;
                int i = 0;
                while (i < length) {
                    zza com_google_android_gms_internal_zzag_zza3 = com_google_android_gms_internal_zzag_zzaArr[i];
                    if (obj == null) {
                        stringBuilder.append(zzg);
                    }
                    a(stringBuilder, zzdl.zzg(com_google_android_gms_internal_zzag_zza3), aVar, set);
                    i++;
                    obj = null;
                }
                break;
            case 3:
                for (int i2 = 0; i2 < com_google_android_gms_internal_zzag_zza.zzjL.length; i2++) {
                    if (i2 > 0) {
                        stringBuilder.append(zzg);
                    }
                    String zzg4 = zzdl.zzg(com_google_android_gms_internal_zzag_zza.zzjL[i2]);
                    String zzg5 = zzdl.zzg(com_google_android_gms_internal_zzag_zza.zzjM[i2]);
                    a(stringBuilder, zzg4, aVar, set);
                    stringBuilder.append(zzg2);
                    a(stringBuilder, zzg5, aVar, set);
                }
                break;
            default:
                a(stringBuilder, zzdl.zzg(com_google_android_gms_internal_zzag_zza), aVar, set);
                break;
        }
        return zzdl.zzQ(stringBuilder.toString());
    }
}
