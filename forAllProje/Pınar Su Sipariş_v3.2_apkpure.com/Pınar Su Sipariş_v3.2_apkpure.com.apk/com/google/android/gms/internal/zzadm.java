package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class zzadm implements Executor {
    private static zzadm zzbGp = new zzadm();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    private zzadm() {
    }

    public static zzadm zzOV() {
        return zzbGp;
    }

    public void execute(Runnable runnable) {
        this.mHandler.post(runnable);
    }
}
