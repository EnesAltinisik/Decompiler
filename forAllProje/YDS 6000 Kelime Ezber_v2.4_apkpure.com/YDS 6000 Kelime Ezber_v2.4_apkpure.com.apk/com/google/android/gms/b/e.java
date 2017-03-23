package com.google.android.gms.b;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.c.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class e implements t {
    private final Map<d<?>, n<?>> a = new HashMap();
    private final Map<com.google.android.gms.common.api.a<?>, Integer> b;
    private final p c;
    private final l d;
    private final Lock e;
    private final Looper f;
    private final k g;
    private final Condition h;
    private final p i;
    private boolean j;
    private Map<acb<?>, com.google.android.gms.common.a> k;
    private com.google.android.gms.common.a l;

    private class a implements com.google.android.gms.c.a, b<Void> {
        final /* synthetic */ e a;

        private a(e eVar) {
            this.a = eVar;
        }

        private com.google.android.gms.common.a a() {
            com.google.android.gms.common.a aVar = null;
            int i = 0;
            for (com.google.android.gms.common.api.a aVar2 : this.a.b.keySet()) {
                com.google.android.gms.common.a aVar3 = (com.google.android.gms.common.a) this.a.k.get(((n) this.a.a.get(aVar2.c())).a());
                if (!aVar3.b()) {
                    int intValue = ((Integer) this.a.b.get(aVar2)).intValue();
                    if (intValue != 2 && (intValue != 1 || aVar3.a() || this.a.g.a(aVar3.c()))) {
                        int a = aVar2.a().a();
                        if (aVar != null && i <= a) {
                            a = i;
                            aVar3 = aVar;
                        }
                        i = a;
                        aVar = aVar3;
                    }
                }
            }
            return aVar;
        }

        private void b() {
            if (this.a.i == null) {
                this.a.d.d = Collections.emptySet();
                return;
            }
            Set hashSet = new HashSet(this.a.i.c());
            Map e = this.a.i.e();
            for (com.google.android.gms.common.api.a aVar : e.keySet()) {
                com.google.android.gms.common.a aVar2 = (com.google.android.gms.common.a) this.a.k.get(((n) this.a.a.get(aVar.c())).a());
                if (aVar2 != null && aVar2.b()) {
                    hashSet.addAll(((com.google.android.gms.common.internal.p.a) e.get(aVar)).a);
                }
            }
            this.a.d.d = hashSet;
        }

        public void a(Exception exception) {
            m mVar = (m) exception;
            this.a.e.lock();
            try {
                this.a.k = mVar.a();
                this.a.l = a();
                if (this.a.l == null) {
                    b();
                    this.a.d.a(null);
                } else {
                    this.a.j = false;
                    this.a.d.a(this.a.l);
                }
                this.a.h.signalAll();
            } finally {
                this.a.e.unlock();
            }
        }

        public /* synthetic */ void a(Object obj) {
            a((Void) obj);
        }

        public void a(Void voidR) {
            this.a.e.lock();
            try {
                this.a.k = new android.support.v4.i.a(this.a.a.size());
                for (d dVar : this.a.a.keySet()) {
                    this.a.k.put(((n) this.a.a.get(dVar)).a(), com.google.android.gms.common.a.a);
                }
                b();
                this.a.d.a(null);
                this.a.h.signalAll();
            } finally {
                this.a.e.unlock();
            }
        }
    }

    public e(Context context, Lock lock, Looper looper, k kVar, Map<d<?>, f> map, p pVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.a.b<? extends dv, dw> bVar, ArrayList<ach> arrayList, l lVar) {
        this.e = lock;
        this.f = looper;
        this.h = lock.newCondition();
        this.g = kVar;
        this.d = lVar;
        this.b = map2;
        this.i = pVar;
        Map hashMap = new HashMap();
        for (com.google.android.gms.common.api.a aVar : map2.keySet()) {
            hashMap.put(aVar.c(), aVar);
        }
        Map hashMap2 = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ach com_google_android_gms_b_ach = (ach) it.next();
            hashMap2.put(com_google_android_gms_b_ach.a, com_google_android_gms_b_ach);
        }
        for (Entry entry : map.entrySet()) {
            com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) hashMap.get(entry.getKey());
            this.a.put((d) entry.getKey(), new d(context, aVar2, looper, (f) entry.getValue(), (ach) hashMap2.get(aVar2), pVar, bVar));
        }
        this.c = p.a();
    }

    public <A extends c, T extends com.google.android.gms.b.ace.a<? extends g, A>> T a(T t) {
        this.d.i.a((acg) t);
        return ((n) this.a.get(t.b())).a(t);
    }

    public void a() {
        this.e.lock();
        try {
            if (!this.j) {
                this.j = true;
                this.k = null;
                this.l = null;
                com.google.android.gms.c.a aVar = new a();
                Executor apVar = new ap(this.f);
                this.c.a(this.a.values()).a(apVar, (b) aVar).a(apVar, aVar);
                this.e.unlock();
            }
        } finally {
            this.e.unlock();
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
        this.e.lock();
        try {
            this.j = false;
            this.k = null;
            this.l = null;
            this.h.signalAll();
        } finally {
            this.e.unlock();
        }
    }

    public boolean c() {
        this.e.lock();
        try {
            boolean z = this.k != null && this.l == null;
            this.e.unlock();
            return z;
        } catch (Throwable th) {
            this.e.unlock();
        }
    }

    public void d() {
    }
}
