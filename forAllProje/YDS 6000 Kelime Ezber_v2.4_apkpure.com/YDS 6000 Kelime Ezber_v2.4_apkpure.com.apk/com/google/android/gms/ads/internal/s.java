package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import java.lang.ref.WeakReference;

@vz
public class s {
    private final a a;
    private final Runnable b;
    private ns c;
    private boolean d;
    private boolean e;
    private long f;

    public static class a {
        private final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        public void a(Runnable runnable) {
            this.a.removeCallbacks(runnable);
        }

        public boolean a(Runnable runnable, long j) {
            return this.a.postDelayed(runnable, j);
        }
    }

    public s(a aVar) {
        this(aVar, new a(zi.a));
    }

    s(a aVar, a aVar2) {
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a = aVar2;
        final WeakReference weakReference = new WeakReference(aVar);
        this.b = new Runnable(this) {
            final /* synthetic */ s b;

            public void run() {
                this.b.d = false;
                a aVar = (a) weakReference.get();
                if (aVar != null) {
                    aVar.c(this.b.c);
                }
            }
        };
    }

    public void a() {
        this.d = false;
        this.a.a(this.b);
    }

    public void a(ns nsVar) {
        this.c = nsVar;
    }

    public void a(ns nsVar, long j) {
        if (this.d) {
            zy.e("An ad refresh is already scheduled.");
            return;
        }
        this.c = nsVar;
        this.d = true;
        this.f = j;
        if (!this.e) {
            zy.d("Scheduling ad refresh " + j + " milliseconds from now.");
            this.a.a(this.b, j);
        }
    }

    public void b() {
        this.e = true;
        if (this.d) {
            this.a.a(this.b);
        }
    }

    public void b(ns nsVar) {
        a(nsVar, 60000);
    }

    public void c() {
        this.e = false;
        if (this.d) {
            this.d = false;
            a(this.c, this.f);
        }
    }

    public boolean d() {
        return this.d;
    }
}
