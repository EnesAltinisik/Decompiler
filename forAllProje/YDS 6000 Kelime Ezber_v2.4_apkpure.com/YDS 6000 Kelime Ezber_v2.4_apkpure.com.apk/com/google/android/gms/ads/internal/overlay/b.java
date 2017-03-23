package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.b.vz;
import com.google.android.gms.b.zi;

@vz
class b implements Runnable {
    private n a;
    private boolean b = false;

    b(n nVar) {
        this.a = nVar;
    }

    public void a() {
        this.b = true;
        zi.a.removeCallbacks(this);
    }

    public void b() {
        zi.a.postDelayed(this, 250);
    }

    public void run() {
        if (!this.b) {
            this.a.o();
            b();
        }
    }
}
