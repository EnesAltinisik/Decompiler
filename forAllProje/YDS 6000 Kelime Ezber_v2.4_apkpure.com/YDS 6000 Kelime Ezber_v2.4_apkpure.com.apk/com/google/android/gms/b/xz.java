package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.yu.a;

@vz
public class xz extends zd implements yb, ye {
    private final a a;
    private final Context b;
    private final yg c;
    private final ye d;
    private final Object e;
    private final String f;
    private final String g;
    private final td h;
    private final long i;
    private int j = 0;
    private int k = 3;
    private ya l;

    public xz(Context context, String str, String str2, td tdVar, a aVar, yg ygVar, ye yeVar, long j) {
        this.b = context;
        this.f = str;
        this.g = str2;
        this.h = tdVar;
        this.a = aVar;
        this.c = ygVar;
        this.e = new Object();
        this.d = yeVar;
        this.i = j;
    }

    private void a(ns nsVar, to toVar) {
        this.c.b().a((ye) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f)) {
                toVar.a(nsVar, this.g, this.h.a);
            } else {
                toVar.a(nsVar, this.g);
            }
        } catch (Throwable e) {
            zy.c("Fail to load ad from adapter.", e);
            a(this.f, 0);
        }
    }

    private void b(long j) {
        while (true) {
            synchronized (this.e) {
                if (this.j != 0) {
                    break;
                } else if (!a(j)) {
                    this.l = new ya.a().a(this.k).a(v.k().b() - j).a(this.f).b(this.h.d).a();
                    return;
                }
            }
        }
        this.l = new ya.a().a(v.k().b() - j).a(1 == this.j ? 6 : this.k).a(this.f).b(this.h.d).a();
    }

    public void a() {
        if (this.c != null && this.c.b() != null && this.c.a() != null) {
            final yd b = this.c.b();
            b.a(null);
            b.a((yb) this);
            final ns nsVar = this.a.a.c;
            final to a = this.c.a();
            try {
                if (a.g()) {
                    zx.a.post(new Runnable(this) {
                        final /* synthetic */ xz c;

                        public void run() {
                            this.c.a(nsVar, a);
                        }
                    });
                } else {
                    zx.a.post(new Runnable(this) {
                        final /* synthetic */ xz d;

                        public void run() {
                            try {
                                a.a(b.a(this.d.b), nsVar, null, b, this.d.g);
                            } catch (Throwable e) {
                                Throwable th = e;
                                String str = "Fail to initialize adapter ";
                                String valueOf = String.valueOf(this.d.f);
                                zy.c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
                                this.d.a(this.d.f, 0);
                            }
                        }
                    });
                }
            } catch (Throwable e) {
                zy.c("Fail to check if adapter is initialized.", e);
                a(this.f, 0);
            }
            b(v.k().b());
            b.a(null);
            b.a(null);
            if (this.j == 1) {
                this.d.a(this.f);
            } else {
                this.d.a(this.f, this.k);
            }
        }
    }

    public void a(int i) {
        a(this.f, 0);
    }

    public void a(String str) {
        synchronized (this.e) {
            this.j = 1;
            this.e.notify();
        }
    }

    public void a(String str, int i) {
        synchronized (this.e) {
            this.j = 2;
            this.k = i;
            this.e.notify();
        }
    }

    protected boolean a(long j) {
        long b = this.i - (v.k().b() - j);
        if (b <= 0) {
            this.k = 4;
            return false;
        }
        try {
            this.e.wait(b);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.k = 5;
            return false;
        }
    }

    public void b() {
    }

    public ya c() {
        ya yaVar;
        synchronized (this.e) {
            yaVar = this.l;
        }
        return yaVar;
    }

    public td f() {
        return this.h;
    }

    public void g() {
        a(this.a.a.c, this.c.a());
    }
}
