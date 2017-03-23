package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.storage.zzd;
import java.util.concurrent.Executor;

public class zzajo {
    private final Handler mHandler;
    private final Executor zzboH;

    public zzajo(Executor executor) {
        this.zzboH = executor;
        if (this.zzboH != null) {
            this.mHandler = null;
        } else if (Looper.myLooper() != null) {
            this.mHandler = new Handler();
        } else {
            this.mHandler = null;
        }
    }

    public void zzp(Runnable runnable) {
        zzaa.zzz(runnable);
        if (this.mHandler != null) {
            this.mHandler.post(runnable);
        } else if (this.zzboH != null) {
            this.zzboH.execute(runnable);
        } else {
            zzd.zzVc().zzo(runnable);
        }
    }
}
