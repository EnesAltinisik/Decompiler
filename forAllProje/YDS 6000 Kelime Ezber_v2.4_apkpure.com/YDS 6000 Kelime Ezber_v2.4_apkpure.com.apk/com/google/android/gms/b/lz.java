package com.google.android.gms.b;

import android.os.Process;
import com.google.android.gms.b.en.a;
import java.util.concurrent.BlockingQueue;

public class lz extends Thread {
    private static final boolean a = abg.b;
    private final BlockingQueue<tv<?>> b;
    private final BlockingQueue<tv<?>> c;
    private final en d;
    private final wy e;
    private volatile boolean f = false;

    public lz(BlockingQueue<tv<?>> blockingQueue, BlockingQueue<tv<?>> blockingQueue2, en enVar, wy wyVar) {
        super("VolleyCacheDispatcher");
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = enVar;
        this.e = wyVar;
    }

    public void a() {
        this.f = true;
        interrupt();
    }

    public void run() {
        if (a) {
            abg.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                final tv tvVar = (tv) this.b.take();
                tvVar.b("cache-queue-take");
                a a = this.d.a(tvVar.d());
                if (a == null) {
                    tvVar.b("cache-miss");
                    this.c.put(tvVar);
                } else if (a.a()) {
                    tvVar.b("cache-hit-expired");
                    tvVar.a(a);
                    this.c.put(tvVar);
                } else {
                    tvVar.b("cache-hit");
                    vx a2 = tvVar.a(new rt(a.a, a.g));
                    tvVar.b("cache-hit-parsed");
                    if (a.b()) {
                        tvVar.b("cache-hit-refresh-needed");
                        tvVar.a(a);
                        a2.d = true;
                        this.e.a(tvVar, a2, new Runnable(this) {
                            final /* synthetic */ lz b;

                            public void run() {
                                try {
                                    this.b.c.put(tvVar);
                                } catch (InterruptedException e) {
                                }
                            }
                        });
                    } else {
                        this.e.a(tvVar, a2);
                    }
                }
            } catch (InterruptedException e) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
