package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.i.k;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh.a;
import com.google.android.gms.b.oo;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.re;
import com.google.android.gms.b.rf;
import com.google.android.gms.b.rg;
import com.google.android.gms.b.rh;
import com.google.android.gms.b.tn;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@vz
public class j extends a {
    private final Context a;
    private final og b;
    private final tn c;
    private final re d;
    private final rf e;
    private final k<String, rh> f;
    private final k<String, rg> g;
    private final qr h;
    private final List<String> i;
    private final oo j;
    private final String k;
    private final aab l;
    private WeakReference<r> m;
    private final d n;
    private final Object o = new Object();

    j(Context context, String str, tn tnVar, aab com_google_android_gms_b_aab, og ogVar, re reVar, rf rfVar, k<String, rh> kVar, k<String, rg> kVar2, qr qrVar, oo ooVar, d dVar) {
        this.a = context;
        this.k = str;
        this.c = tnVar;
        this.l = com_google_android_gms_b_aab;
        this.b = ogVar;
        this.e = rfVar;
        this.d = reVar;
        this.f = kVar;
        this.g = kVar2;
        this.h = qrVar;
        this.i = d();
        this.j = ooVar;
        this.n = dVar;
    }

    private List<String> d() {
        List<String> arrayList = new ArrayList();
        if (this.e != null) {
            arrayList.add("1");
        }
        if (this.d != null) {
            arrayList.add("2");
        }
        if (this.f.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.o;
        monitor-enter(r2);
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.r) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.F();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.j.a():java.lang.String");
    }

    public void a(final ns nsVar) {
        a(new Runnable(this) {
            final /* synthetic */ j b;

            public void run() {
                synchronized (this.b.o) {
                    r c = this.b.c();
                    this.b.m = new WeakReference(c);
                    c.a(this.b.d);
                    c.a(this.b.e);
                    c.a(this.b.f);
                    c.a(this.b.b);
                    c.b(this.b.g);
                    c.a(this.b.d());
                    c.a(this.b.h);
                    c.a(this.b.j);
                    c.a(nsVar);
                }
            }
        });
    }

    protected void a(Runnable runnable) {
        zi.a.post(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.o;
        monitor-enter(r2);
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.r) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.q();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.j.b():boolean");
    }

    protected r c() {
        return new r(this.a, this.n, nx.a(this.a), this.k, this.c, this.l);
    }
}
