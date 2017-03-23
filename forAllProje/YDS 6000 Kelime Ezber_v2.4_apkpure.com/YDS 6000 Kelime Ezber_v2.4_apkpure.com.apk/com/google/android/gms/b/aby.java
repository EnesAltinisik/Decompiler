package com.google.android.gms.b;

public class aby {
    public static long a(long j, long j2) {
        return j >= 0 ? j % j2 : (((Long.MAX_VALUE % j2) + 1) + ((j & Long.MAX_VALUE) % j2)) % j2;
    }
}
