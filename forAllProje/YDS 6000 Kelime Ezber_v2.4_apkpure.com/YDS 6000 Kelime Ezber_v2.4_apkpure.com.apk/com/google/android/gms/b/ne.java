package com.google.android.gms.b;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

@vz
public class ne {
    private final Runnable a = new Runnable(this) {
        final /* synthetic */ ne a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.c();
        }
    };
    private final Object b = new Object();
    private nh c;
    private Context d;
    private nl e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r3 = this;
        r1 = r3.b;
        monitor-enter(r1);
        r0 = r3.d;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.c;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = new com.google.android.gms.b.ne$3;	 Catch:{ all -> 0x0024 }
        r0.<init>(r3);	 Catch:{ all -> 0x0024 }
        r2 = new com.google.android.gms.b.ne$4;	 Catch:{ all -> 0x0024 }
        r2.<init>(r3);	 Catch:{ all -> 0x0024 }
        r0 = r3.a(r0, r2);	 Catch:{ all -> 0x0024 }
        r3.c = r0;	 Catch:{ all -> 0x0024 }
        r0 = r3.c;	 Catch:{ all -> 0x0024 }
        r0.n();	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        goto L_0x000c;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.ne.b():void");
    }

    private void c() {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            if (this.c.b() || this.c.c()) {
                this.c.a();
            }
            this.c = null;
            this.e = null;
            Binder.flushPendingCommands();
            v.u().b();
        }
    }

    public nf a(ni niVar) {
        nf nfVar;
        synchronized (this.b) {
            if (this.e == null) {
                nfVar = new nf();
            } else {
                try {
                    nfVar = this.e.a(niVar);
                } catch (Throwable e) {
                    zy.b("Unable to call into cache service.", e);
                    nfVar = new nf();
                }
            }
        }
        return nfVar;
    }

    protected nh a(b bVar, c cVar) {
        return new nh(this.d, v.u().a(), bVar, cVar);
    }

    public void a() {
        if (((Boolean) pr.cW.c()).booleanValue()) {
            synchronized (this.b) {
                b();
                v.e();
                zi.a.removeCallbacks(this.a);
                v.e();
                zi.a.postDelayed(this.a, ((Long) pr.cX.c()).longValue());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = r2.b;
        monitor-enter(r1);
        r0 = r2.d;	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x000c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        throw r0;
    L_0x000f:
        r0 = r3.getApplicationContext();	 Catch:{ all -> 0x000c }
        r2.d = r0;	 Catch:{ all -> 0x000c }
        r0 = com.google.android.gms.b.pr.cV;	 Catch:{ all -> 0x000c }
        r0 = r0.c();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r2.b();	 Catch:{ all -> 0x000c }
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x0028:
        r0 = com.google.android.gms.b.pr.cU;	 Catch:{ all -> 0x000c }
        r0 = r0.c();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0026;
    L_0x0036:
        r0 = new com.google.android.gms.b.ne$2;	 Catch:{ all -> 0x000c }
        r0.<init>(r2);	 Catch:{ all -> 0x000c }
        r2.a(r0);	 Catch:{ all -> 0x000c }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.ne.a(android.content.Context):void");
    }

    protected void a(mu.b bVar) {
        v.h().a(bVar);
    }
}
