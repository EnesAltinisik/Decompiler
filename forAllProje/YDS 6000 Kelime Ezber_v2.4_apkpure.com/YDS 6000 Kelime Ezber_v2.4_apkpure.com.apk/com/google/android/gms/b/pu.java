package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class pu extends Thread {
    private final BlockingQueue<tv<?>> a;
    private final ov b;
    private final en c;
    private final wy d;
    private volatile boolean e = false;

    public pu(BlockingQueue<tv<?>> blockingQueue, ov ovVar, en enVar, wy wyVar) {
        super("VolleyNetworkDispatcher");
        this.a = blockingQueue;
        this.b = ovVar;
        this.c = enVar;
        this.d = wyVar;
    }

    @TargetApi(14)
    private void a(tv<?> tvVar) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(tvVar.b());
        }
    }

    private void a(tv<?> tvVar, abb com_google_android_gms_b_abb) {
        this.d.a((tv) tvVar, tvVar.a(com_google_android_gms_b_abb));
    }

    public void a() {
        this.e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                tv tvVar = (tv) this.a.take();
                try {
                    tvVar.b("network-queue-take");
                    a(tvVar);
                    rt a = this.b.a(tvVar);
                    tvVar.b("network-http-complete");
                    if (a.d && tvVar.q()) {
                        tvVar.c("not-modified");
                    } else {
                        vx a2 = tvVar.a(a);
                        tvVar.b("network-parse-complete");
                        if (tvVar.l() && a2.b != null) {
                            this.c.a(tvVar.d(), a2.b);
                            tvVar.b("network-cache-written");
                        }
                        tvVar.p();
                        this.d.a(tvVar, a2);
                    }
                } catch (abb e) {
                    e.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    a(tvVar, e);
                } catch (Throwable e2) {
                    abg.a(e2, "Unhandled exception %s", e2.toString());
                    abb com_google_android_gms_b_abb = new abb(e2);
                    com_google_android_gms_b_abb.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(tvVar, com_google_android_gms_b_abb);
                }
            } catch (InterruptedException e3) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
