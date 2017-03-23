package com.google.android.gms.tagmanager;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class p extends k {
    private static final String a = zzad.HASH.toString();
    private static final String b = zzae.ARG0.toString();
    private static final String c = zzae.ALGORITHM.toString();
    private static final String d = zzae.INPUT_FORMAT.toString();

    public p() {
        super(a, b);
    }

    private byte[] a(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(b);
        if (com_google_android_gms_internal_zzag_zza == null || com_google_android_gms_internal_zzag_zza == zzdl.zzKT()) {
            return zzdl.zzKT();
        }
        byte[] bytes;
        String zzg = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        com_google_android_gms_internal_zzag_zza = (zza) map.get(c);
        String zzg2 = com_google_android_gms_internal_zzag_zza == null ? Constants.MD5 : zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        com_google_android_gms_internal_zzag_zza = (zza) map.get(d);
        Object zzg3 = com_google_android_gms_internal_zzag_zza == null ? "text" : zzdl.zzg(com_google_android_gms_internal_zzag_zza);
        if ("text".equals(zzg3)) {
            bytes = zzg.getBytes();
        } else if ("base16".equals(zzg3)) {
            bytes = zzk.zzgi(zzg);
        } else {
            zzg2 = "Hash: unknown input format: ";
            String valueOf = String.valueOf(zzg3);
            zzbn.e(valueOf.length() != 0 ? zzg2.concat(valueOf) : new String(zzg2));
            return zzdl.zzKT();
        }
        try {
            return zzdl.zzQ(zzk.zzk(a(zzg2, bytes)));
        } catch (NoSuchAlgorithmException e) {
            zzg = "Hash: unknown algorithm: ";
            valueOf = String.valueOf(zzg2);
            zzbn.e(valueOf.length() != 0 ? zzg.concat(valueOf) : new String(zzg));
            return zzdl.zzKT();
        }
    }
}
