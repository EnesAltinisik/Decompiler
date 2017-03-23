package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class e extends k {
    private static final String a = zzad.ENCODE.toString();
    private static final String b = zzae.ARG0.toString();
    private static final String c = zzae.NO_PADDING.toString();
    private static final String d = zzae.INPUT_FORMAT.toString();
    private static final String e = zzae.OUTPUT_FORMAT.toString();

    public e() {
        super(a, b);
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(b);
        if (com_google_android_gms_internal_zzag_zza == null || com_google_android_gms_internal_zzag_zza == zzdl.zzKT()) {
            return zzdl.zzKT();
        }
        String zzg = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        com_google_android_gms_internal_zzag_zza = (zza) map.get(d);
        if (com_google_android_gms_internal_zzag_zza == null) {
            Object obj = "text";
        } else {
            String zzg2 = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        }
        com_google_android_gms_internal_zzag_zza = (zza) map.get(e);
        if (com_google_android_gms_internal_zzag_zza == null) {
            Object obj2 = "base16";
        } else {
            String zzg3 = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        }
        com_google_android_gms_internal_zzag_zza = (zza) map.get(c);
        int i = (com_google_android_gms_internal_zzag_zza == null || !zzdl.zzk(com_google_android_gms_internal_zzag_zza).booleanValue()) ? 2 : 3;
        try {
            byte[] bytes;
            String valueOf;
            Object zzk;
            if ("text".equals(obj)) {
                bytes = zzg.getBytes();
            } else if ("base16".equals(obj)) {
                bytes = zzk.zzgi(zzg);
            } else if ("base64".equals(obj)) {
                bytes = Base64.decode(zzg, i);
            } else if ("base64url".equals(obj)) {
                bytes = Base64.decode(zzg, i | 8);
            } else {
                zzg3 = "Encode: unknown input format: ";
                valueOf = String.valueOf(obj);
                zzbn.e(valueOf.length() != 0 ? zzg3.concat(valueOf) : new String(zzg3));
                return zzdl.zzKT();
            }
            if ("base16".equals(obj2)) {
                zzk = zzk.zzk(bytes);
            } else if ("base64".equals(obj2)) {
                zzk = Base64.encodeToString(bytes, i);
            } else if ("base64url".equals(obj2)) {
                zzk = Base64.encodeToString(bytes, i | 8);
            } else {
                zzg2 = "Encode: unknown output format: ";
                valueOf = String.valueOf(obj2);
                zzbn.e(valueOf.length() != 0 ? zzg2.concat(valueOf) : new String(zzg2));
                return zzdl.zzKT();
            }
            return zzdl.zzQ(zzk);
        } catch (IllegalArgumentException e) {
            zzbn.e("Encode: invalid input:");
            return zzdl.zzKT();
        }
    }
}
