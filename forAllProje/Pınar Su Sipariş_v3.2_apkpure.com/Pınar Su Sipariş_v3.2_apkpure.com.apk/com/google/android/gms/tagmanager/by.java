package com.google.android.gms.tagmanager;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.zzag.zza;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class by {
    private static as<zza> a(as<zza> asVar) {
        try {
            return new as(zzdl.zzQ(a(zzdl.zzg((zza) asVar.a()))), asVar.b());
        } catch (Throwable e) {
            zzbn.zzb("Escape URI: unsupported encoding", e);
            return asVar;
        }
    }

    private static as<zza> a(as<zza> asVar, int i) {
        if (a((zza) asVar.a())) {
            switch (i) {
                case 12:
                    return a((as) asVar);
                default:
                    zzbn.e("Unsupported Value Escaping: " + i);
                    return asVar;
            }
        }
        zzbn.e("Escaping can only be applied to strings.");
        return asVar;
    }

    static as<zza> a(as<zza> asVar, int... iArr) {
        as a;
        for (int a2 : iArr) {
            a = a(a, a2);
        }
        return a;
    }

    static String a(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
    }

    private static boolean a(zza com_google_android_gms_internal_zzag_zza) {
        return zzdl.zzl(com_google_android_gms_internal_zzag_zza) instanceof String;
    }
}
