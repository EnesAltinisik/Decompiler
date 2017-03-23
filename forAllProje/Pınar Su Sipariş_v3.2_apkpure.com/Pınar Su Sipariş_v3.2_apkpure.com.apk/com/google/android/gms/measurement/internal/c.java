package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsn.zzf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

class c {
    final int a;
    final boolean b;
    final String c;
    final List<String> d;
    final String e;
    final boolean f;

    public c(zzf com_google_android_gms_internal_zzsn_zzf) {
        boolean z;
        boolean z2 = false;
        zzaa.zzz(com_google_android_gms_internal_zzsn_zzf);
        if (com_google_android_gms_internal_zzsn_zzf.zzbgE == null || com_google_android_gms_internal_zzsn_zzf.zzbgE.intValue() == 0) {
            z = false;
        } else {
            if (com_google_android_gms_internal_zzsn_zzf.zzbgE.intValue() == 6) {
                if (com_google_android_gms_internal_zzsn_zzf.zzbgH == null || com_google_android_gms_internal_zzsn_zzf.zzbgH.length == 0) {
                    z = false;
                }
            } else if (com_google_android_gms_internal_zzsn_zzf.zzbgF == null) {
                z = false;
            }
            z = true;
        }
        if (z) {
            this.a = com_google_android_gms_internal_zzsn_zzf.zzbgE.intValue();
            if (com_google_android_gms_internal_zzsn_zzf.zzbgG != null && com_google_android_gms_internal_zzsn_zzf.zzbgG.booleanValue()) {
                z2 = true;
            }
            this.b = z2;
            if (this.b || this.a == 1 || this.a == 6) {
                this.c = com_google_android_gms_internal_zzsn_zzf.zzbgF;
            } else {
                this.c = com_google_android_gms_internal_zzsn_zzf.zzbgF.toUpperCase(Locale.ENGLISH);
            }
            this.d = com_google_android_gms_internal_zzsn_zzf.zzbgH == null ? null : a(com_google_android_gms_internal_zzsn_zzf.zzbgH, this.b);
            if (this.a == 1) {
                this.e = this.c;
            } else {
                this.e = null;
            }
        } else {
            this.a = 0;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.f = z;
    }

    private List<String> a(String[] strArr, boolean z) {
        if (z) {
            return Arrays.asList(strArr);
        }
        List<String> arrayList = new ArrayList();
        for (String toUpperCase : strArr) {
            arrayList.add(toUpperCase.toUpperCase(Locale.ENGLISH));
        }
        return arrayList;
    }

    public Boolean a(String str) {
        if (!this.f || str == null) {
            return null;
        }
        if (!(this.b || this.a == 1)) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (this.a) {
            case 1:
                return Boolean.valueOf(Pattern.compile(this.e, this.b ? 0 : 66).matcher(str).matches());
            case 2:
                return Boolean.valueOf(str.startsWith(this.c));
            case 3:
                return Boolean.valueOf(str.endsWith(this.c));
            case 4:
                return Boolean.valueOf(str.contains(this.c));
            case 5:
                return Boolean.valueOf(str.equals(this.c));
            case 6:
                return Boolean.valueOf(this.d.contains(str));
            default:
                return null;
        }
    }
}
