package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzaa;

abstract class g {
    private static volatile Handler b;
    private final zzx a;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ g a;

        {
            this.a = r1;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a.zzFl().zzg(this);
                return;
            }
            boolean b = this.a.b();
            this.a.d = 0;
            if (b && this.a.e) {
                this.a.a();
            }
        }
    };
    private volatile long d;
    private boolean e = true;

    g(zzx com_google_android_gms_measurement_internal_zzx) {
        zzaa.zzz(com_google_android_gms_measurement_internal_zzx);
        this.a = com_google_android_gms_measurement_internal_zzx;
    }

    private Handler d() {
        if (b != null) {
            return b;
        }
        Handler handler;
        synchronized (g.class) {
            if (b == null) {
                b = new Handler(this.a.getContext().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public void a(long j) {
        c();
        if (j >= 0) {
            this.d = this.a.zzlQ().currentTimeMillis();
            if (!d().postDelayed(this.c, j)) {
                this.a.zzFm().zzFE().zzj("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public boolean b() {
        return this.d != 0;
    }

    public void c() {
        this.d = 0;
        d().removeCallbacks(this.c);
    }
}
