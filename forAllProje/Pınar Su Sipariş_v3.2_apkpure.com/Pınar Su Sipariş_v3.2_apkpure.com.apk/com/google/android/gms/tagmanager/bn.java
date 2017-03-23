package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;

class bn implements ay {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final zze f;

    public bn() {
        this(60, 2000);
    }

    public bn(int i, long j) {
        this.e = new Object();
        this.b = i;
        this.c = (double) this.b;
        this.a = j;
        this.f = zzh.zzuW();
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            long currentTimeMillis = this.f.currentTimeMillis();
            if (this.c < ((double) this.b)) {
                double d = ((double) (currentTimeMillis - this.d)) / ((double) this.a);
                if (d > 0.0d) {
                    this.c = Math.min((double) this.b, d + this.c);
                }
            }
            this.d = currentTimeMillis;
            if (this.c >= 1.0d) {
                this.c -= 1.0d;
                z = true;
            } else {
                zzbn.zzaW("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
