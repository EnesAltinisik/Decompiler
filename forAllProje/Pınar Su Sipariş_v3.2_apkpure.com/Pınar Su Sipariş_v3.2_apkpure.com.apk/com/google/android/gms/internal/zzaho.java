package com.google.android.gms.internal;

import java.util.Comparator;

public abstract class zzaho implements Comparator<zzaht> {
    public static zzaho zzih(String str) {
        if (str.equals(".value")) {
            return zzaib.zzTN();
        }
        if (str.equals(".key")) {
            return zzahq.zzTH();
        }
        if (!str.equals(".priority")) {
            return new zzahw(new zzafa(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public zzaht zzTB() {
        return zzaht.zzTI();
    }

    public abstract zzaht zzTC();

    public abstract String zzTD();

    public int zza(zzaht com_google_android_gms_internal_zzaht, zzaht com_google_android_gms_internal_zzaht2, boolean z) {
        return z ? compare(com_google_android_gms_internal_zzaht2, com_google_android_gms_internal_zzaht) : compare(com_google_android_gms_internal_zzaht, com_google_android_gms_internal_zzaht2);
    }

    public boolean zza(zzahu com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu2) {
        return compare(new zzaht(zzahi.zzTh(), com_google_android_gms_internal_zzahu), new zzaht(zzahi.zzTh(), com_google_android_gms_internal_zzahu2)) != 0;
    }

    public abstract zzaht zzg(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu);

    public abstract boolean zzl(zzahu com_google_android_gms_internal_zzahu);
}
