package com.google.android.gms.internal;

import java.util.Random;

public class zzaiu {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaiu.class.desiredAssertionStatus());
    private static final Random zzbSl = new Random();
    private static long zzbSm = 0;
    private static final int[] zzbSn = new int[12];

    private static void zzUk() {
        int i = 11;
        while (i >= 0) {
            if (zzbSn[i] != 63) {
                zzbSn[i] = zzbSn[i] + 1;
                return;
            } else {
                zzbSn[i] = 0;
                i--;
            }
        }
    }

    public static synchronized String zzaJ(long j) {
        String stringBuilder;
        int i = 0;
        synchronized (zzaiu.class) {
            int i2;
            int i3 = j == zzbSm ? 1 : 0;
            zzbSm = j;
            char[] cArr = new char[8];
            StringBuilder stringBuilder2 = new StringBuilder(20);
            for (i2 = 7; i2 >= 0; i2--) {
                cArr[i2] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            if ($assertionsDisabled || j == 0) {
                stringBuilder2.append(cArr);
                if (i3 == 0) {
                    for (i2 = 0; i2 < 12; i2++) {
                        zzbSn[i2] = zzbSl.nextInt(64);
                    }
                } else {
                    zzUk();
                }
                while (i < 12) {
                    stringBuilder2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(zzbSn[i]));
                    i++;
                }
                if ($assertionsDisabled || stringBuilder2.length() == 20) {
                    stringBuilder = stringBuilder2.toString();
                } else {
                    throw new AssertionError();
                }
            }
            throw new AssertionError();
        }
        return stringBuilder;
    }
}
