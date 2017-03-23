package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class az extends k {
    private static final String a = zzad.REGEX_GROUP.toString();
    private static final String b = zzae.ARG0.toString();
    private static final String c = zzae.ARG1.toString();
    private static final String d = zzae.IGNORE_CASE.toString();
    private static final String e = zzae.GROUP.toString();

    public az() {
        super(a, b, c);
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzag_zza = (zza) map.get(b);
        zza com_google_android_gms_internal_zzag_zza2 = (zza) map.get(c);
        if (com_google_android_gms_internal_zzag_zza == null || com_google_android_gms_internal_zzag_zza == zzdl.zzKT() || com_google_android_gms_internal_zzag_zza2 == null || com_google_android_gms_internal_zzag_zza2 == zzdl.zzKT()) {
            return zzdl.zzKT();
        }
        int i = 64;
        if (zzdl.zzk((zza) map.get(d)).booleanValue()) {
            i = 66;
        }
        zza com_google_android_gms_internal_zzag_zza3 = (zza) map.get(e);
        int intValue;
        if (com_google_android_gms_internal_zzag_zza3 != null) {
            Long zzi = zzdl.zzi(com_google_android_gms_internal_zzag_zza3);
            if (zzi == zzdl.zzKO()) {
                return zzdl.zzKT();
            }
            intValue = zzi.intValue();
            if (intValue < 0) {
                return zzdl.zzKT();
            }
        }
        intValue = 1;
        try {
            CharSequence zzg = zzdl.zzg(com_google_android_gms_internal_zzag_zza);
            Object obj = null;
            Matcher matcher = Pattern.compile(zzdl.zzg(com_google_android_gms_internal_zzag_zza2), i).matcher(zzg);
            if (matcher.find() && matcher.groupCount() >= intValue) {
                obj = matcher.group(intValue);
            }
            return obj == null ? zzdl.zzKT() : zzdl.zzQ(obj);
        } catch (PatternSyntaxException e) {
            return zzdl.zzKT();
        }
    }
}
