package com.google.android.gms.c;

import java.util.ArrayDeque;
import java.util.Queue;

class j<TResult> {
    private final Object a = new Object();
    private Queue<i<TResult>> b;
    private boolean c;

    j() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.android.gms.c.d<TResult> r3) {
        /*
        r2 = this;
        r1 = r2.a;
        monitor-enter(r1);
        r0 = r2.b;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.c;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.c = r0;	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0011:
        r1 = r2.a;
        monitor-enter(r1);
        r0 = r2.b;	 Catch:{ all -> 0x0023 }
        r0 = r0.poll();	 Catch:{ all -> 0x0023 }
        r0 = (com.google.android.gms.c.i) r0;	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0029;
    L_0x001e:
        r0 = 0;
        r2.c = r0;	 Catch:{ all -> 0x0023 }
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x000c;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        throw r0;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        r0.a(r3);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.j.a(com.google.android.gms.c.d):void");
    }

    public void a(i<TResult> iVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(iVar);
        }
    }
}
