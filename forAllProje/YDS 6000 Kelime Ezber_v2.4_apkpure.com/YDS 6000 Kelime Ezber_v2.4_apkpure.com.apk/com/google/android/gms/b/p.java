package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.c.d;
import com.google.android.gms.c.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class p implements Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status b = new Status(4, "The user must be signed in to make this API call.");
    private static final Object f = new Object();
    private static p g;
    private long c = 5000;
    private long d = 120000;
    private long e = 10000;
    private final Context h;
    private final c i;
    private int j = -1;
    private final AtomicInteger k = new AtomicInteger(1);
    private final AtomicInteger l = new AtomicInteger(0);
    private final Map<acb<?>, a<?>> m = new ConcurrentHashMap(5, 0.75f, 1);
    private g n = null;
    private final Set<acb<?>> o = new com.google.android.gms.common.util.a();
    private final Set<acb<?>> p = new com.google.android.gms.common.util.a();
    private final Handler q;

    public class a<O extends com.google.android.gms.common.api.a.a> implements aci, com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c {
        final /* synthetic */ p a;
        private final Queue<abz> b = new LinkedList();
        private final f c;
        private final com.google.android.gms.common.api.a.c d;
        private final acb<O> e;
        private final f f;
        private final Set<acd> g = new HashSet();
        private final Map<com.google.android.gms.b.y.a<?>, ad> h = new HashMap();
        private final int i;
        private final ah j;
        private boolean k;
        private com.google.android.gms.common.a l = null;

        public a(p pVar, n<O> nVar) {
            this.a = pVar;
            this.c = nVar.a(pVar.q.getLooper(), this);
            if (this.c instanceof h) {
                this.d = ((h) this.c).k();
            } else {
                this.d = this.c;
            }
            this.e = nVar.a();
            this.f = new f();
            this.i = nVar.b();
            if (this.c.d()) {
                this.j = nVar.a(pVar.h, pVar.q);
            } else {
                this.j = null;
            }
        }

        private void b(abz com_google_android_gms_b_abz) {
            com_google_android_gms_b_abz.a(this.f, k());
            try {
                com_google_android_gms_b_abz.a(this);
            } catch (DeadObjectException e) {
                a(1);
                this.c.a();
            }
        }

        private void c(com.google.android.gms.common.a aVar) {
            for (acd a : this.g) {
                a.a(this.e, aVar);
            }
            this.g.clear();
        }

        private void m() {
            d();
            c(com.google.android.gms.common.a.a);
            p();
            Iterator it = this.h.values().iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    e eVar = new e();
                } catch (DeadObjectException e) {
                    a(1);
                    this.c.a();
                } catch (RemoteException e2) {
                }
            }
            o();
            q();
        }

        private void n() {
            d();
            this.k = true;
            this.f.c();
            this.a.q.sendMessageDelayed(Message.obtain(this.a.q, 7, this.e), this.a.c);
            this.a.q.sendMessageDelayed(Message.obtain(this.a.q, 9, this.e), this.a.d);
            this.a.j = -1;
        }

        private void o() {
            while (this.c.b() && !this.b.isEmpty()) {
                b((abz) this.b.remove());
            }
        }

        private void p() {
            if (this.k) {
                this.a.q.removeMessages(9, this.e);
                this.a.q.removeMessages(7, this.e);
                this.k = false;
            }
        }

        private void q() {
            this.a.q.removeMessages(10, this.e);
            this.a.q.sendMessageDelayed(this.a.q.obtainMessage(10, this.e), this.a.e);
        }

        public void a() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            a(p.a);
            this.f.b();
            for (com.google.android.gms.b.y.a cVar : this.h.keySet()) {
                a(new abz.c(cVar, new e()));
            }
            this.c.a();
        }

        public void a(int i) {
            if (Looper.myLooper() == this.a.q.getLooper()) {
                n();
            } else {
                this.a.q.post(new Runnable(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.n();
                    }
                });
            }
        }

        public void a(Bundle bundle) {
            if (Looper.myLooper() == this.a.q.getLooper()) {
                m();
            } else {
                this.a.q.post(new Runnable(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.m();
                    }
                });
            }
        }

        public void a(abz com_google_android_gms_b_abz) {
            com.google.android.gms.common.internal.c.a(this.a.q);
            if (this.c.b()) {
                b(com_google_android_gms_b_abz);
                q();
                return;
            }
            this.b.add(com_google_android_gms_b_abz);
            if (this.l == null || !this.l.a()) {
                i();
            } else {
                a(this.l);
            }
        }

        public void a(acd com_google_android_gms_b_acd) {
            com.google.android.gms.common.internal.c.a(this.a.q);
            this.g.add(com_google_android_gms_b_acd);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.gms.common.a r6) {
            /*
            r5 = this;
            r0 = r5.a;
            r0 = r0.q;
            com.google.android.gms.common.internal.c.a(r0);
            r0 = r5.j;
            if (r0 == 0) goto L_0x0012;
        L_0x000d:
            r0 = r5.j;
            r0.a();
        L_0x0012:
            r5.d();
            r0 = r5.a;
            r1 = -1;
            r0.j = r1;
            r5.c(r6);
            r0 = r6.c();
            r1 = 4;
            if (r0 != r1) goto L_0x002d;
        L_0x0025:
            r0 = com.google.android.gms.b.p.b;
            r5.a(r0);
        L_0x002c:
            return;
        L_0x002d:
            r0 = r5.b;
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x0038;
        L_0x0035:
            r5.l = r6;
            goto L_0x002c;
        L_0x0038:
            r1 = com.google.android.gms.b.p.f;
            monitor-enter(r1);
            r0 = r5.a;	 Catch:{ all -> 0x0060 }
            r0 = r0.n;	 Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0063;
        L_0x0045:
            r0 = r5.a;	 Catch:{ all -> 0x0060 }
            r0 = r0.o;	 Catch:{ all -> 0x0060 }
            r2 = r5.e;	 Catch:{ all -> 0x0060 }
            r0 = r0.contains(r2);	 Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0063;
        L_0x0053:
            r0 = r5.a;	 Catch:{ all -> 0x0060 }
            r0 = r0.n;	 Catch:{ all -> 0x0060 }
            r2 = r5.i;	 Catch:{ all -> 0x0060 }
            r0.b(r6, r2);	 Catch:{ all -> 0x0060 }
            monitor-exit(r1);	 Catch:{ all -> 0x0060 }
            goto L_0x002c;
        L_0x0060:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0060 }
            throw r0;
        L_0x0063:
            monitor-exit(r1);	 Catch:{ all -> 0x0060 }
            r0 = r5.a;
            r1 = r5.i;
            r0 = r0.a(r6, r1);
            if (r0 != 0) goto L_0x002c;
        L_0x006e:
            r0 = r6.c();
            r1 = 18;
            if (r0 != r1) goto L_0x0079;
        L_0x0076:
            r0 = 1;
            r5.k = r0;
        L_0x0079:
            r0 = r5.k;
            if (r0 == 0) goto L_0x009a;
        L_0x007d:
            r0 = r5.a;
            r0 = r0.q;
            r1 = r5.a;
            r1 = r1.q;
            r2 = 7;
            r3 = r5.e;
            r1 = android.os.Message.obtain(r1, r2, r3);
            r2 = r5.a;
            r2 = r2.c;
            r0.sendMessageDelayed(r1, r2);
            goto L_0x002c;
        L_0x009a:
            r0 = new com.google.android.gms.common.api.Status;
            r1 = 17;
            r2 = r5.e;
            r2 = r2.a();
            r2 = java.lang.String.valueOf(r2);
            r3 = new java.lang.StringBuilder;
            r4 = java.lang.String.valueOf(r2);
            r4 = r4.length();
            r4 = r4 + 38;
            r3.<init>(r4);
            r4 = "API: ";
            r3 = r3.append(r4);
            r2 = r3.append(r2);
            r3 = " is not available on this device.";
            r2 = r2.append(r3);
            r2 = r2.toString();
            r0.<init>(r1, r2);
            r5.a(r0);
            goto L_0x002c;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.p.a.a(com.google.android.gms.common.a):void");
        }

        public void a(final com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, int i) {
            if (Looper.myLooper() == this.a.q.getLooper()) {
                a(aVar);
            } else {
                this.a.q.post(new Runnable(this) {
                    final /* synthetic */ a b;

                    public void run() {
                        this.b.a(aVar);
                    }
                });
            }
        }

        public void a(Status status) {
            com.google.android.gms.common.internal.c.a(this.a.q);
            for (abz a : this.b) {
                a.a(status);
            }
            this.b.clear();
        }

        public f b() {
            return this.c;
        }

        public void b(com.google.android.gms.common.a aVar) {
            com.google.android.gms.common.internal.c.a(this.a.q);
            this.c.a();
            a(aVar);
        }

        public Map<com.google.android.gms.b.y.a<?>, ad> c() {
            return this.h;
        }

        public void d() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            this.l = null;
        }

        public com.google.android.gms.common.a e() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            return this.l;
        }

        public void f() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            if (this.k) {
                i();
            }
        }

        public void g() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            if (this.k) {
                p();
                a(this.a.i.a(this.a.h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.c.a();
            }
        }

        public void h() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            if (!this.c.b() || this.h.size() != 0) {
                return;
            }
            if (this.f.a()) {
                q();
            } else {
                this.c.a();
            }
        }

        public void i() {
            com.google.android.gms.common.internal.c.a(this.a.q);
            if (!this.c.b() && !this.c.c()) {
                if (this.c.e() && this.a.j != 0) {
                    this.a.j = this.a.i.a(this.a.h);
                    if (this.a.j != 0) {
                        a(new com.google.android.gms.common.a(this.a.j, null));
                        return;
                    }
                }
                com.google.android.gms.b.ah.a bVar = new b(this.a, this.c, this.e);
                if (this.c.d()) {
                    this.j.a(bVar);
                }
                this.c.a(bVar);
            }
        }

        boolean j() {
            return this.c.b();
        }

        public boolean k() {
            return this.c.d();
        }

        public int l() {
            return this.i;
        }
    }

    private class b implements com.google.android.gms.b.ah.a, o.f {
        final /* synthetic */ p a;
        private final f b;
        private final acb<?> c;
        private z d = null;
        private Set<Scope> e = null;
        private boolean f = false;

        public b(p pVar, f fVar, acb<?> com_google_android_gms_b_acb_) {
            this.a = pVar;
            this.b = fVar;
            this.c = com_google_android_gms_b_acb_;
        }

        private void a() {
            if (this.f && this.d != null) {
                this.b.a(this.d, this.e);
            }
        }

        public void a(final com.google.android.gms.common.a aVar) {
            this.a.q.post(new Runnable(this) {
                final /* synthetic */ b b;

                public void run() {
                    if (aVar.b()) {
                        this.b.f = true;
                        if (this.b.b.d()) {
                            this.b.a();
                            return;
                        } else {
                            this.b.b.a(null, Collections.emptySet());
                            return;
                        }
                    }
                    ((a) this.b.a.m.get(this.b.c)).a(aVar);
                }
            });
        }

        public void a(z zVar, Set<Scope> set) {
            if (zVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new com.google.android.gms.common.a(4));
                return;
            }
            this.d = zVar;
            this.e = set;
            a();
        }

        public void b(com.google.android.gms.common.a aVar) {
            ((a) this.a.m.get(this.c)).b(aVar);
        }
    }

    private p(Context context, Looper looper, c cVar) {
        this.h = context;
        this.q = new Handler(looper, this);
        this.i = cVar;
    }

    public static p a() {
        p pVar;
        synchronized (f) {
            com.google.android.gms.common.internal.c.a(g, (Object) "Must guarantee manager is non-null before using getInstance");
            pVar = g;
        }
        return pVar;
    }

    public static p a(Context context) {
        p pVar;
        synchronized (f) {
            if (g == null) {
                g = new p(context.getApplicationContext(), f(), c.a());
            }
            pVar = g;
        }
        return pVar;
    }

    private void a(int i, com.google.android.gms.common.a aVar) {
        for (a aVar2 : this.m.values()) {
            if (aVar2.l() == i) {
                break;
            }
        }
        a aVar22 = null;
        if (aVar22 != null) {
            String valueOf = String.valueOf(this.i.c(aVar.c()));
            String valueOf2 = String.valueOf(aVar.e());
            aVar22.a(new Status(17, new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(valueOf2).length()).append("Error resolution was canceled by the user, original error message: ").append(valueOf).append(": ").append(valueOf2).toString()));
            return;
        }
        Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
    }

    private void a(ab abVar) {
        a aVar = (a) this.m.get(abVar.c.a());
        if (aVar == null) {
            b(abVar.c);
            aVar = (a) this.m.get(abVar.c.a());
        }
        if (!aVar.k() || this.l.get() == abVar.b) {
            aVar.a(abVar.a);
            return;
        }
        abVar.a.a(a);
        aVar.a();
    }

    private void a(acd com_google_android_gms_b_acd) {
        for (acb com_google_android_gms_b_acb : com_google_android_gms_b_acd.a()) {
            a aVar = (a) this.m.get(com_google_android_gms_b_acb);
            if (aVar == null) {
                com_google_android_gms_b_acd.a(com_google_android_gms_b_acb, new com.google.android.gms.common.a(13));
                return;
            } else if (aVar.j()) {
                com_google_android_gms_b_acd.a(com_google_android_gms_b_acb, com.google.android.gms.common.a.a);
            } else if (aVar.e() != null) {
                com_google_android_gms_b_acd.a(com_google_android_gms_b_acb, aVar.e());
            } else {
                aVar.a(com_google_android_gms_b_acd);
            }
        }
    }

    private void b(n<?> nVar) {
        acb a = nVar.a();
        if (!this.m.containsKey(a)) {
            this.m.put(a, new a(this, nVar));
        }
        a aVar = (a) this.m.get(a);
        if (aVar.k()) {
            this.p.add(a);
        }
        aVar.i();
    }

    private static Looper f() {
        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    private void g() {
        for (a aVar : this.m.values()) {
            aVar.d();
            aVar.i();
        }
    }

    private void h() {
        for (acb remove : this.p) {
            ((a) this.m.remove(remove)).a();
        }
        this.p.clear();
    }

    public d<Void> a(Iterable<n<?>> iterable) {
        acd com_google_android_gms_b_acd = new acd(iterable);
        for (n a : iterable) {
            a aVar = (a) this.m.get(a.a());
            if (aVar != null) {
                if (!aVar.j()) {
                }
            }
            this.q.sendMessage(this.q.obtainMessage(1, com_google_android_gms_b_acd));
            return com_google_android_gms_b_acd.b();
        }
        com_google_android_gms_b_acd.c();
        return com_google_android_gms_b_acd.b();
    }

    public void a(g gVar) {
        synchronized (f) {
            if (this.n != gVar) {
                this.n = gVar;
                this.o.clear();
                this.o.addAll(gVar.d());
            }
        }
    }

    public void a(n<?> nVar) {
        this.q.sendMessage(this.q.obtainMessage(5, nVar));
    }

    public <O extends com.google.android.gms.common.api.a.a> void a(n<O> nVar, int i, com.google.android.gms.b.ace.a<? extends g, com.google.android.gms.common.api.a.c> aVar) {
        this.q.sendMessage(this.q.obtainMessage(3, new ab(new com.google.android.gms.b.abz.b(i, aVar), this.l.get(), nVar)));
    }

    boolean a(com.google.android.gms.common.a aVar, int i) {
        if (!aVar.a() && !this.i.a(aVar.c())) {
            return false;
        }
        this.i.a(this.h, aVar, i);
        return true;
    }

    public int b() {
        return this.k.getAndIncrement();
    }

    void b(g gVar) {
        synchronized (f) {
            if (this.n == gVar) {
                this.n = null;
                this.o.clear();
            }
        }
    }

    public void b(com.google.android.gms.common.a aVar, int i) {
        if (!a(aVar, i)) {
            this.q.sendMessage(this.q.obtainMessage(4, i, 0, aVar));
        }
    }

    public void c() {
        this.q.sendMessage(this.q.obtainMessage(2));
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                a((acd) message.obj);
                break;
            case 2:
                g();
                break;
            case 3:
            case 6:
            case 11:
                a((ab) message.obj);
                break;
            case 4:
                a(message.arg1, (com.google.android.gms.common.a) message.obj);
                break;
            case 5:
                b((n) message.obj);
                break;
            case 7:
                if (this.m.containsKey(message.obj)) {
                    ((a) this.m.get(message.obj)).f();
                    break;
                }
                break;
            case 8:
                h();
                break;
            case 9:
                if (this.m.containsKey(message.obj)) {
                    ((a) this.m.get(message.obj)).g();
                    break;
                }
                break;
            case 10:
                if (this.m.containsKey(message.obj)) {
                    ((a) this.m.get(message.obj)).h();
                    break;
                }
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
        return true;
    }
}
