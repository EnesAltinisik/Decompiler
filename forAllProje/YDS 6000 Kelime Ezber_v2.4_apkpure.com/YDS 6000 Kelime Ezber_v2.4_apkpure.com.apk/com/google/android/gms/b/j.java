package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class j implements m {
    private final n a;
    private final Lock b;
    private final Context c;
    private final k d;
    private com.google.android.gms.common.a e;
    private int f;
    private int g = 0;
    private int h;
    private final Bundle i = new Bundle();
    private final Set<com.google.android.gms.common.api.a.d> j = new HashSet();
    private dv k;
    private int l;
    private boolean m;
    private boolean n;
    private z o;
    private boolean p;
    private boolean q;
    private final p r;
    private final Map<com.google.android.gms.common.api.a<?>, Integer> s;
    private final com.google.android.gms.common.api.a.b<? extends dv, dw> t;
    private ArrayList<Future<?>> u = new ArrayList();

    private static class a implements com.google.android.gms.common.internal.o.f {
        private final WeakReference<j> a;
        private final com.google.android.gms.common.api.a<?> b;
        private final int c;

        public a(j jVar, com.google.android.gms.common.api.a<?> aVar, int i) {
            this.a = new WeakReference(jVar);
            this.b = aVar;
            this.c = i;
        }

        public void a(com.google.android.gms.common.a aVar) {
            boolean z = false;
            j jVar = (j) this.a.get();
            if (jVar != null) {
                if (Looper.myLooper() == jVar.a.g.a()) {
                    z = true;
                }
                com.google.android.gms.common.internal.c.a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                jVar.b.lock();
                try {
                    if (jVar.b(0)) {
                        if (!aVar.b()) {
                            jVar.b(aVar, this.b, this.c);
                        }
                        if (jVar.d()) {
                            jVar.e();
                        }
                        jVar.b.unlock();
                    }
                } finally {
                    jVar.b.unlock();
                }
            }
        }
    }

    private abstract class f implements Runnable {
        final /* synthetic */ j b;

        private f(j jVar) {
            this.b = jVar;
        }

        protected abstract void a();

        public void run() {
            this.b.b.lock();
            try {
                if (!Thread.interrupted()) {
                    a();
                    this.b.b.unlock();
                }
            } catch (RuntimeException e) {
                this.b.a.a(e);
            } finally {
                this.b.b.unlock();
            }
        }
    }

    private class b extends f {
        final /* synthetic */ j a;
        private final Map<com.google.android.gms.common.api.a.f, a> c;

        public b(j jVar, Map<com.google.android.gms.common.api.a.f, a> map) {
            this.a = jVar;
            super();
            this.c = map;
        }

        public void a() {
            int i;
            int i2 = 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            for (com.google.android.gms.common.api.a.f fVar : this.c.keySet()) {
                if (!fVar.e()) {
                    i = 0;
                    i4 = i5;
                } else if (((a) this.c.get(fVar)).c == 0) {
                    i = 1;
                    break;
                } else {
                    i = i4;
                    i4 = 1;
                }
                i5 = i4;
                i4 = i;
            }
            i2 = i5;
            i = 0;
            if (i2 != 0) {
                i3 = this.a.d.a(this.a.c);
            }
            if (i3 == 0 || (r0 == 0 && i4 == 0)) {
                if (this.a.m) {
                    this.a.k.l();
                }
                for (com.google.android.gms.common.api.a.f fVar2 : this.c.keySet()) {
                    final com.google.android.gms.common.internal.o.f fVar3 = (com.google.android.gms.common.internal.o.f) this.c.get(fVar2);
                    if (!fVar2.e() || i3 == 0) {
                        fVar2.a(fVar3);
                    } else {
                        this.a.a.a(new a(this, this.a) {
                            public void a() {
                                fVar3.a(new com.google.android.gms.common.a(16, null));
                            }
                        });
                    }
                }
                return;
            }
            final com.google.android.gms.common.a aVar = new com.google.android.gms.common.a(i3, null);
            this.a.a.a(new a(this, this.a) {
                final /* synthetic */ b b;

                public void a() {
                    this.b.a.c(aVar);
                }
            });
        }
    }

    private class c extends f {
        final /* synthetic */ j a;
        private final ArrayList<com.google.android.gms.common.api.a.f> c;

        public c(j jVar, ArrayList<com.google.android.gms.common.api.a.f> arrayList) {
            this.a = jVar;
            super();
            this.c = arrayList;
        }

        public void a() {
            this.a.a.g.d = this.a.j();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.common.api.a.f) it.next()).a(this.a.o, this.a.a.g.d);
            }
        }
    }

    private static class d extends dz {
        private final WeakReference<j> a;

        d(j jVar) {
            this.a = new WeakReference(jVar);
        }

        public void a(final ek ekVar) {
            final j jVar = (j) this.a.get();
            if (jVar != null) {
                jVar.a.a(new a(this, jVar) {
                    public void a() {
                        jVar.a(ekVar);
                    }
                });
            }
        }
    }

    private class e implements com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c {
        final /* synthetic */ j a;

        private e(j jVar) {
            this.a = jVar;
        }

        public void a(int i) {
        }

        public void a(Bundle bundle) {
            this.a.k.a(new d(this.a));
        }

        public void a(com.google.android.gms.common.a aVar) {
            this.a.b.lock();
            try {
                if (this.a.b(aVar)) {
                    this.a.h();
                    this.a.e();
                } else {
                    this.a.c(aVar);
                }
                this.a.b.unlock();
            } catch (Throwable th) {
                this.a.b.unlock();
            }
        }
    }

    public j(n nVar, p pVar, Map<com.google.android.gms.common.api.a<?>, Integer> map, k kVar, com.google.android.gms.common.api.a.b<? extends dv, dw> bVar, Lock lock, Context context) {
        this.a = nVar;
        this.r = pVar;
        this.s = map;
        this.d = kVar;
        this.t = bVar;
        this.b = lock;
        this.c = context;
    }

    private void a(ek ekVar) {
        if (b(0)) {
            com.google.android.gms.common.a a = ekVar.a();
            if (a.b()) {
                com.google.android.gms.common.internal.f b = ekVar.b();
                com.google.android.gms.common.a b2 = b.b();
                if (b2.b()) {
                    this.n = true;
                    this.o = b.a();
                    this.p = b.c();
                    this.q = b.d();
                    e();
                    return;
                }
                String valueOf = String.valueOf(b2);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                c(b2);
            } else if (b(a)) {
                h();
                e();
            } else {
                c(a);
            }
        }
    }

    private void a(boolean z) {
        if (this.k != null) {
            if (this.k.b() && z) {
                this.k.k();
            }
            this.k.a();
            this.o = null;
        }
    }

    private boolean a(int i, int i2, com.google.android.gms.common.a aVar) {
        return (i2 != 1 || a(aVar)) ? this.e == null || i < this.f : false;
    }

    private boolean a(com.google.android.gms.common.a aVar) {
        return aVar.a() || this.d.b(aVar.c()) != null;
    }

    private void b(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, int i) {
        if (i != 2) {
            int a = aVar2.a().a();
            if (a(a, i, aVar)) {
                this.e = aVar;
                this.f = a;
            }
        }
        this.a.b.put(aVar2.c(), aVar);
    }

    private boolean b(int i) {
        if (this.g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.a.g.j());
        String valueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
        Log.w("GoogleApiClientConnecting", "mRemainingConnections=" + this.h);
        valueOf = String.valueOf(c(this.g));
        String valueOf2 = String.valueOf(c(i));
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(valueOf2).toString(), new Exception());
        c(new com.google.android.gms.common.a(8, null));
        return false;
    }

    private boolean b(com.google.android.gms.common.a aVar) {
        return this.l != 2 ? this.l == 1 && !aVar.a() : true;
    }

    private String c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private void c(com.google.android.gms.common.a aVar) {
        i();
        a(!aVar.a());
        this.a.a(aVar);
        this.a.h.a(aVar);
    }

    private boolean d() {
        this.h--;
        if (this.h > 0) {
            return false;
        }
        if (this.h < 0) {
            Log.w("GoogleApiClientConnecting", this.a.g.j());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            c(new com.google.android.gms.common.a(8, null));
            return false;
        } else if (this.e == null) {
            return true;
        } else {
            this.a.f = this.f;
            c(this.e);
            return false;
        }
    }

    private void e() {
        if (this.h == 0) {
            if (!this.m || this.n) {
                f();
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        this.g = 1;
        this.h = this.a.a.size();
        for (com.google.android.gms.common.api.a.d dVar : this.a.a.keySet()) {
            if (!this.a.b.containsKey(dVar)) {
                arrayList.add((com.google.android.gms.common.api.a.f) this.a.a.get(dVar));
            } else if (d()) {
                g();
            }
        }
        if (!arrayList.isEmpty()) {
            this.u.add(o.a().submit(new c(this, arrayList)));
        }
    }

    private void g() {
        this.a.f();
        o.a().execute(new Runnable(this) {
            final /* synthetic */ j a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.d.d(this.a.c);
            }
        });
        if (this.k != null) {
            if (this.p) {
                this.k.a(this.o, this.q);
            }
            a(false);
        }
        for (com.google.android.gms.common.api.a.d dVar : this.a.b.keySet()) {
            ((com.google.android.gms.common.api.a.f) this.a.a.get(dVar)).a();
        }
        this.a.h.a(this.i.isEmpty() ? null : this.i);
    }

    private void h() {
        this.m = false;
        this.a.g.d = Collections.emptySet();
        for (com.google.android.gms.common.api.a.d dVar : this.j) {
            if (!this.a.b.containsKey(dVar)) {
                this.a.b.put(dVar, new com.google.android.gms.common.a(17, null));
            }
        }
    }

    private void i() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.u.clear();
    }

    private Set<Scope> j() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        Set<Scope> hashSet = new HashSet(this.r.c());
        Map e = this.r.e();
        for (com.google.android.gms.common.api.a aVar : e.keySet()) {
            if (!this.a.b.containsKey(aVar.c())) {
                hashSet.addAll(((com.google.android.gms.common.internal.p.a) e.get(aVar)).a);
            }
        }
        return hashSet;
    }

    public <A extends com.google.android.gms.common.api.a.c, T extends com.google.android.gms.b.ace.a<? extends g, A>> T a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void a() {
        this.a.b.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = 2;
        this.n = false;
        this.p = false;
        Map hashMap = new HashMap();
        int i = 0;
        for (com.google.android.gms.common.api.a aVar : this.s.keySet()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) this.a.a.get(aVar.c());
            int intValue = ((Integer) this.s.get(aVar)).intValue();
            int i2 = (aVar.a().a() == 1 ? 1 : 0) | i;
            if (fVar.d()) {
                this.m = true;
                if (intValue < this.l) {
                    this.l = intValue;
                }
                if (intValue != 0) {
                    this.j.add(aVar.c());
                }
            }
            hashMap.put(fVar, new a(this, aVar, intValue));
            i = i2;
        }
        if (i != 0) {
            this.m = false;
        }
        if (this.m) {
            this.r.a(Integer.valueOf(this.a.g.k()));
            com.google.android.gms.common.api.c.b eVar = new e();
            this.k = (dv) this.t.a(this.c, this.a.g.a(), this.r, this.r.h(), eVar, eVar);
        }
        this.h = this.a.a.size();
        this.u.add(o.a().submit(new b(this, hashMap)));
    }

    public void a(int i) {
        c(new com.google.android.gms.common.a(8, null));
    }

    public void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public void a(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, int i) {
        if (b(1)) {
            b(aVar, aVar2, i);
            if (d()) {
                g();
            }
        }
    }

    public boolean b() {
        i();
        a(true);
        this.a.a(null);
        return true;
    }

    public void c() {
    }
}
