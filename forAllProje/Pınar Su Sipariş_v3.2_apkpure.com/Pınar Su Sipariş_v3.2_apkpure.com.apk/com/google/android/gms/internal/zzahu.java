package com.google.android.gms.internal;

import java.util.Iterator;

public interface zzahu extends Comparable<zzahu>, Iterable<zzaht> {
    public static final zzahj zzbRi = new zzahj() {
        public /* synthetic */ int compareTo(Object obj) {
            return zzg((zzahu) obj);
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public boolean isEmpty() {
            return false;
        }

        public String toString() {
            return "<Max Node>";
        }

        public zzahu zzTp() {
            return this;
        }

        public int zzg(zzahu com_google_android_gms_internal_zzahu) {
            return com_google_android_gms_internal_zzahu == this ? 0 : 1;
        }

        public boolean zzk(zzahi com_google_android_gms_internal_zzahi) {
            return false;
        }

        public zzahu zzm(zzahi com_google_android_gms_internal_zzahi) {
            return com_google_android_gms_internal_zzahi.zzTl() ? zzTp() : zzahn.zzTA();
        }
    };

    public enum zza {
        V1,
        V2
    }

    int getChildCount();

    Object getValue();

    Object getValue(boolean z);

    boolean isEmpty();

    zzahu zzO(zzafa com_google_android_gms_internal_zzafa);

    Iterator<zzaht> zzPw();

    String zzTn();

    boolean zzTo();

    zzahu zzTp();

    String zza(zza com_google_android_gms_internal_zzahu_zza);

    zzahu zze(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu);

    zzahu zzf(zzahu com_google_android_gms_internal_zzahu);

    boolean zzk(zzahi com_google_android_gms_internal_zzahi);

    zzahi zzl(zzahi com_google_android_gms_internal_zzahi);

    zzahu zzl(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu);

    zzahu zzm(zzahi com_google_android_gms_internal_zzahi);
}
