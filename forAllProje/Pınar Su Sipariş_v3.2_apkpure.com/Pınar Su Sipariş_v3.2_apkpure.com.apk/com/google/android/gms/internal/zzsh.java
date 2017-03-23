package com.google.android.gms.internal;

public final class zzsh {
    private static zzsh zzaIH;
    private final zzse zzaII = new zzse();
    private final zzsf zzaIJ = new zzsf();

    static {
        zza(new zzsh());
    }

    private zzsh() {
    }

    protected static void zza(zzsh com_google_android_gms_internal_zzsh) {
        synchronized (zzsh.class) {
            zzaIH = com_google_android_gms_internal_zzsh;
        }
    }

    private static zzsh zzyD() {
        zzsh com_google_android_gms_internal_zzsh;
        synchronized (zzsh.class) {
            com_google_android_gms_internal_zzsh = zzaIH;
        }
        return com_google_android_gms_internal_zzsh;
    }

    public static zzse zzyE() {
        return zzyD().zzaII;
    }

    public static zzsf zzyF() {
        return zzyD().zzaIJ;
    }
}
