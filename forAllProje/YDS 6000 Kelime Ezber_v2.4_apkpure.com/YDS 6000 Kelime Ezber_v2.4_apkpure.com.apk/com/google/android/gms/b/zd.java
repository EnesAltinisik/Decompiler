package com.google.android.gms.b;

import java.util.concurrent.Future;

@vz
public abstract class zd implements zk<Future> {
    private final Runnable a;
    private volatile Thread b;
    private boolean c;

    public zd() {
        this.a = new Runnable(this) {
            final /* synthetic */ zd a;

            {
                this.a = r1;
            }

            public final void run() {
                this.a.b = Thread.currentThread();
                this.a.a();
            }
        };
        this.c = false;
    }

    public zd(boolean z) {
        this.a = /* anonymous class already generated */;
        this.c = z;
    }

    public abstract void a();

    public abstract void b();

    public final void d() {
        b();
        if (this.b != null) {
            this.b.interrupt();
        }
    }

    public /* synthetic */ Object e() {
        return h();
    }

    public final Future h() {
        return this.c ? zh.a(1, this.a) : zh.a(this.a);
    }
}
