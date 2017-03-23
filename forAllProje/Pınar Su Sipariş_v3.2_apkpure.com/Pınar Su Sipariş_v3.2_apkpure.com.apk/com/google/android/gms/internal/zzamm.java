package com.google.android.gms.internal;

import java.io.IOException;

public final class zzamm {
    public static final int[] zzcal = new int[0];
    public static final long[] zzcam = new long[0];
    public static final float[] zzcan = new float[0];
    public static final double[] zzcao = new double[0];
    public static final boolean[] zzcap = new boolean[0];
    public static final String[] zzcaq = new String[0];
    public static final byte[][] zzcar = new byte[0][];
    public static final byte[] zzcas = new byte[0];

    public static int zzJ(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean zzb(zzamb com_google_android_gms_internal_zzamb, int i) throws IOException {
        return com_google_android_gms_internal_zzamb.zznU(i);
    }

    public static final int zzc(zzamb com_google_android_gms_internal_zzamb, int i) throws IOException {
        int i2 = 1;
        int position = com_google_android_gms_internal_zzamb.getPosition();
        com_google_android_gms_internal_zzamb.zznU(i);
        while (com_google_android_gms_internal_zzamb.zzWC() == i) {
            com_google_android_gms_internal_zzamb.zznU(i);
            i2++;
        }
        com_google_android_gms_internal_zzamb.zznY(position);
        return i2;
    }

    static int zzon(int i) {
        return i & 7;
    }

    public static int zzoo(int i) {
        return i >>> 3;
    }
}
