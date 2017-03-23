package com.google.android.gms.b;

import android.os.Handler;
import java.util.concurrent.Executor;

public class nu implements wy {
    private final Executor a;

    private class a implements Runnable {
        private final tv a;
        private final vx b;
        private final Runnable c;

        public a(nu nuVar, tv tvVar, vx vxVar, Runnable runnable) {
            this.a = tvVar;
            this.b = vxVar;
            this.c = runnable;
        }

        public void run() {
            if (this.b.a()) {
                this.a.a(this.b.a);
            } else {
                this.a.b(this.b.c);
            }
            if (this.b.d) {
                this.a.b("intermediate-response");
            } else {
                this.a.c("done");
            }
            if (this.c != null) {
                this.c.run();
            }
        }
    }

    public nu(final Handler handler) {
        this.a = new Executor(this) {
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public void a(tv<?> tvVar, abb com_google_android_gms_b_abb) {
        tvVar.b("post-error");
        this.a.execute(new a(this, tvVar, vx.a(com_google_android_gms_b_abb), null));
    }

    public void a(tv<?> tvVar, vx<?> vxVar) {
        a(tvVar, vxVar, null);
    }

    public void a(tv<?> tvVar, vx<?> vxVar, Runnable runnable) {
        tvVar.p();
        tvVar.b("post-response");
        this.a.execute(new a(this, tvVar, vxVar, runnable));
    }
}
