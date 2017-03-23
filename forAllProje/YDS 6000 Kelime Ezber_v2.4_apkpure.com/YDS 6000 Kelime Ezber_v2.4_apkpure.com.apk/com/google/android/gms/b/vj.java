package com.google.android.gms.b;

import android.content.Context;
import android.os.SystemClock;

@vz
public abstract class vj extends zd {
    protected final com.google.android.gms.b.vk.a a;
    protected final Context b;
    protected final Object c = new Object();
    protected final Object d = new Object();
    protected final com.google.android.gms.b.yu.a e;
    protected wi f;

    protected static final class a extends Exception {
        private final int a;

        public a(String str, int i) {
            super(str);
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    protected vj(Context context, com.google.android.gms.b.yu.a aVar, com.google.android.gms.b.vk.a aVar2) {
        super(true);
        this.b = context;
        this.e = aVar;
        this.f = aVar.b;
        this.a = aVar2;
    }

    protected abstract yu a(int i);

    public void a() {
        int a;
        synchronized (this.c) {
            zy.b("AdRendererBackgroundTask started.");
            int i = this.e.e;
            try {
                a(SystemClock.elapsedRealtime());
            } catch (a e) {
                a = e.a();
                if (a == 3 || a == -1) {
                    zy.d(e.getMessage());
                } else {
                    zy.e(e.getMessage());
                }
                if (this.f == null) {
                    this.f = new wi(a);
                } else {
                    this.f = new wi(a, this.f.k);
                }
                zi.a.post(new Runnable(this) {
                    final /* synthetic */ vj a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.b();
                    }
                });
                i = a;
            }
            final yu a2 = a(i);
            zi.a.post(new Runnable(this) {
                final /* synthetic */ vj b;

                public void run() {
                    synchronized (this.b.c) {
                        this.b.a(a2);
                    }
                }
            });
        }
    }

    protected abstract void a(long j);

    protected void a(yu yuVar) {
        this.a.b(yuVar);
    }

    public void b() {
    }
}
