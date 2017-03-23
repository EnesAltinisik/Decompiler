package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.b.aaj.c;
import com.google.android.gms.b.sv.b;
import com.google.android.gms.b.sv.e;
import java.util.concurrent.TimeUnit;

@vz
public class vq {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private static final Object b = new Object();
    private static boolean c = false;
    private static sv d = null;
    private final Context e;
    private final com.google.android.gms.b.yu.a f;
    private final r g;
    private final dp h;
    private ss i;
    private e j;
    private sr k;
    private boolean l = false;

    public static abstract class a {
        public void a() {
        }

        public abstract void a(sw swVar);
    }

    public vq(Context context, com.google.android.gms.b.yu.a aVar, r rVar, dp dpVar) {
        this.e = context;
        this.f = aVar;
        this.g = rVar;
        this.h = dpVar;
        this.l = ((Boolean) pr.cd.c()).booleanValue();
    }

    public static String a(com.google.android.gms.b.yu.a aVar, String str) {
        String valueOf = String.valueOf(aVar.b.b.indexOf("https") == 0 ? "https:" : "http:");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private void g() {
        synchronized (b) {
            if (!c) {
                d = new sv(this.e.getApplicationContext() != null ? this.e.getApplicationContext() : this.e, this.f.a.k, a(this.f, (String) pr.cb.c()), new zn<sr>(this) {
                    final /* synthetic */ vq a;

                    {
                        this.a = r1;
                    }

                    public void a(sr srVar) {
                        srVar.a(this.a.g, this.a.g, this.a.g, this.a.g, false, null, null, null, null);
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((sr) obj);
                    }
                }, new b());
                c = true;
            }
        }
    }

    private void h() {
        this.j = new e(e().b(this.h));
    }

    private void i() {
        this.i = new ss();
    }

    private void j() {
        this.k = (sr) c().a(this.e, this.f.a.k, a(this.f, (String) pr.cb.c()), this.h, this.g.g()).get(a, TimeUnit.MILLISECONDS);
        this.k.a(this.g, this.g, this.g, this.g, false, null, null, null, null);
    }

    public void a() {
        if (this.l) {
            g();
        } else {
            i();
        }
    }

    public void a(final a aVar) {
        if (this.l) {
            e f = f();
            if (f == null) {
                zy.e("SharedJavascriptEngine not initialized");
                return;
            } else {
                f.a(new c<sw>(this) {
                    public void a(sw swVar) {
                        aVar.a(swVar);
                    }

                    public /* synthetic */ void a(Object obj) {
                        a((sw) obj);
                    }
                }, new com.google.android.gms.b.aaj.a(this) {
                    public void a() {
                        aVar.a();
                    }
                });
                return;
            }
        }
        sw d = d();
        if (d == null) {
            zy.e("JavascriptEngine not initialized");
        } else {
            aVar.a(d);
        }
    }

    public void b() {
        if (this.l) {
            h();
        } else {
            j();
        }
    }

    protected ss c() {
        return this.i;
    }

    protected sr d() {
        return this.k;
    }

    protected sv e() {
        return d;
    }

    protected e f() {
        return this.j;
    }
}
