package com.google.android.gms.common.util;

import android.os.SystemClock;

public class e implements c {
    private static e a = new e();

    private e() {
    }

    public static c d() {
        return a;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return System.nanoTime();
    }
}
