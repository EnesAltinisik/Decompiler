package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.b.vk.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@vz
public class vp extends zd {
    private final a a;
    private final wi b;
    private final yu.a c;
    private final vr d;
    private final Object e;
    private Future<yu> f;

    public vp(Context context, r rVar, yu.a aVar, dp dpVar, a aVar2, qa qaVar) {
        this(aVar, aVar2, new vr(context, rVar, new zp(context), dpVar, aVar, qaVar));
    }

    vp(yu.a aVar, a aVar2, vr vrVar) {
        this.e = new Object();
        this.c = aVar;
        this.b = aVar.b;
        this.a = aVar2;
        this.d = vrVar;
    }

    private yu a(int i) {
        return new yu(this.c.a.c, null, null, i, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null, this.b.N);
    }

    public void a() {
        yu yuVar;
        int i;
        try {
            synchronized (this.e) {
                this.f = zh.a(this.d);
            }
            yuVar = (yu) this.f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException e) {
            zy.e("Timed out waiting for native ad.");
            this.f.cancel(true);
            i = 2;
            yuVar = null;
        } catch (ExecutionException e2) {
            yuVar = null;
            i = 0;
        } catch (InterruptedException e3) {
            yuVar = null;
            i = 0;
        } catch (CancellationException e4) {
            yuVar = null;
            i = 0;
        }
        if (yuVar == null) {
            yuVar = a(i);
        }
        zi.a.post(new Runnable(this) {
            final /* synthetic */ vp b;

            public void run() {
                this.b.a.b(yuVar);
            }
        });
    }

    public void b() {
        synchronized (this.e) {
            if (this.f != null) {
                this.f.cancel(true);
            }
        }
    }
}
