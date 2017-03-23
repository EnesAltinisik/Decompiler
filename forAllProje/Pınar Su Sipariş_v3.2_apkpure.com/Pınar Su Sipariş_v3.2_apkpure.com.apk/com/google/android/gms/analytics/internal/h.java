package com.google.android.gms.analytics.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzaa;

abstract class h {
    private static volatile Handler b;
    private final zzf a;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ h a;

        {
            this.a = r1;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a.zzlT().zzf(this);
                return;
            }
            boolean c = this.a.c();
            this.a.d = 0;
            if (c && !false) {
                this.a.a();
            }
        }
    };
    private volatile long d;

    h(zzf com_google_android_gms_analytics_internal_zzf) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzf);
        this.a = com_google_android_gms_analytics_internal_zzf;
    }

    private Handler e() {
        if (b != null) {
            return b;
        }
        Handler handler;
        synchronized (h.class) {
            if (b == null) {
                b = new Handler(this.a.getContext().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public void a(long j) {
        d();
        if (j >= 0) {
            this.d = this.a.zzlQ().currentTimeMillis();
            if (!e().postDelayed(this.c, j)) {
                this.a.zzlR().zze("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public long b() {
        return this.d == 0 ? 0 : Math.abs(this.a.zzlQ().currentTimeMillis() - this.d);
    }

    public void b(long j) {
        long j2 = 0;
        if (!c()) {
            return;
        }
        if (j < 0) {
            d();
            return;
        }
        long abs = j - Math.abs(this.a.zzlQ().currentTimeMillis() - this.d);
        if (abs >= 0) {
            j2 = abs;
        }
        e().removeCallbacks(this.c);
        if (!e().postDelayed(this.c, j2)) {
            this.a.zzlR().zze("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    public boolean c() {
        return this.d != 0;
    }

    public void d() {
        this.d = 0;
        e().removeCallbacks(this.c);
    }
}
