package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.aar.a;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.atomic.AtomicBoolean;

@vz
public abstract class vg implements a, zk<Void> {
    protected final vk.a a;
    protected final Context b;
    protected final aaq c;
    protected final yu.a d;
    protected wi e;
    protected final Object f = new Object();
    private Runnable g;
    private AtomicBoolean h = new AtomicBoolean(true);

    protected vg(Context context, yu.a aVar, aaq com_google_android_gms_b_aaq, vk.a aVar2) {
        this.b = context;
        this.d = aVar;
        this.e = this.d.b;
        this.c = com_google_android_gms_b_aaq;
        this.a = aVar2;
    }

    private yu b(int i) {
        wf wfVar = this.d.a;
        return new yu(wfVar.c, this.c, this.e.d, i, this.e.f, this.e.j, this.e.l, this.e.k, wfVar.i, this.e.h, null, null, null, null, null, this.e.i, this.d.d, this.e.g, this.d.f, this.e.n, this.e.o, this.d.h, null, this.e.C, this.e.D, this.e.E, this.e.F, this.e.G, null, this.e.J, this.e.N);
    }

    public final Void a() {
        c.b("Webview render task needs to be called on UI thread.");
        this.g = new Runnable(this) {
            final /* synthetic */ vg a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.h.get()) {
                    zy.c("Timed out waiting for WebView to finish loading.");
                    this.a.d();
                }
            }
        };
        zi.a.postDelayed(this.g, ((Long) pr.bo.c()).longValue());
        b();
        return null;
    }

    protected void a(int i) {
        if (i != -2) {
            this.e = new wi(i, this.e.k);
        }
        this.c.e();
        this.a.b(b(i));
    }

    public void a(aaq com_google_android_gms_b_aaq, boolean z) {
        int i = 0;
        zy.b("WebView finished loading.");
        if (this.h.getAndSet(false)) {
            if (z) {
                i = c();
            }
            a(i);
            zi.a.removeCallbacks(this.g);
        }
    }

    protected abstract void b();

    protected int c() {
        return -2;
    }

    public void d() {
        if (this.h.getAndSet(false)) {
            this.c.stopLoading();
            v.g().a(this.c);
            a(-1);
            zi.a.removeCallbacks(this.g);
        }
    }

    public /* synthetic */ Object e() {
        return a();
    }
}
