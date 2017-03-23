package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zi;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@vz
public class y {
    private final long a = TimeUnit.MILLISECONDS.toNanos(((Long) pr.C.c()).longValue());
    private long b;
    private boolean c = true;

    y() {
    }

    public void a() {
        this.c = true;
    }

    public void a(SurfaceTexture surfaceTexture, final k kVar) {
        if (kVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.c || Math.abs(timestamp - this.b) >= this.a) {
                this.c = false;
                this.b = timestamp;
                zi.a.post(new Runnable(this) {
                    public void run() {
                        kVar.g();
                    }
                });
            }
        }
    }
}
