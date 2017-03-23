package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.c;

abstract class ca {
    private static volatile Handler b;
    private final cv a;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ ca a;

        {
            this.a = r1;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a.h().a((Runnable) this);
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

    ca(cv cvVar) {
        c.a((Object) cvVar);
        this.a = cvVar;
    }

    private Handler d() {
        if (b != null) {
            return b;
        }
        Handler handler;
        synchronized (ca.class) {
            if (b == null) {
                b = new Handler(this.a.s().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public void a(long j) {
        c();
        if (j >= 0) {
            this.d = this.a.t().a();
            if (!d().postDelayed(this.c, j)) {
                this.a.f().x().a("Failed to schedule delayed post. time", Long.valueOf(j));
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
