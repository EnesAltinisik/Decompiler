package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class n implements aci, t {
    final Map<d<?>, f> a;
    final Map<d<?>, com.google.android.gms.common.a> b = new HashMap();
    final p c;
    final Map<com.google.android.gms.common.api.a<?>, Integer> d;
    final com.google.android.gms.common.api.a.b<? extends dv, dw> e;
    int f;
    final l g;
    final com.google.android.gms.b.t.a h;
    private final Lock i;
    private final Condition j;
    private final Context k;
    private final k l;
    private final b m;
    private volatile m n;
    private com.google.android.gms.common.a o = null;

    static abstract class a {
        private final m a;

        protected a(m mVar) {
            this.a = mVar;
        }

        protected abstract void a();

        public final void a(n nVar) {
            nVar.i.lock();
            try {
                if (nVar.n == this.a) {
                    a();
                    nVar.i.unlock();
                }
            } finally {
                nVar.i.unlock();
            }
        }
    }

    final class b extends Handler {
        final /* synthetic */ n a;

        b(n nVar, Looper looper) {
            this.a = nVar;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ((a) message.obj).a(this.a);
                    return;
                case 2:
                    throw ((RuntimeException) message.obj);
                default:
                    Log.w("GACStateManager", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    public n(Context context, l lVar, Lock lock, Looper looper, k kVar, Map<d<?>, f> map, p pVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.a.b<? extends dv, dw> bVar, ArrayList<ach> arrayList, com.google.android.gms.b.t.a aVar) {
        this.k = context;
        this.i = lock;
        this.l = kVar;
        this.a = map;
        this.c = pVar;
        this.d = map2;
        this.e = bVar;
        this.g = lVar;
        this.h = aVar;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ach) it.next()).a((aci) this);
        }
        this.m = new b(this, looper);
        this.j = lock.newCondition();
        this.n = new k(this);
    }

    public <A extends c, T extends com.google.android.gms.b.ace.a<? extends g, A>> T a(T t) {
        t.i();
        return this.n.a((com.google.android.gms.b.ace.a) t);
    }

    public void a() {
        this.n.c();
    }

    public void a(int i) {
        this.i.lock();
        try {
            this.n.a(i);
        } finally {
            this.i.unlock();
        }
    }

    public void a(Bundle bundle) {
        this.i.lock();
        try {
            this.n.a(bundle);
        } finally {
            this.i.unlock();
        }
    }

    void a(a aVar) {
        this.m.sendMessage(this.m.obtainMessage(1, aVar));
    }

    void a(com.google.android.gms.common.a aVar) {
        this.i.lock();
        try {
            this.o = aVar;
            this.n = new k(this);
            this.n.a();
            this.j.signalAll();
        } finally {
            this.i.unlock();
        }
    }

    public void a(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, int i) {
        this.i.lock();
        try {
            this.n.a(aVar, aVar2, i);
        } finally {
            this.i.unlock();
        }
    }

    void a(RuntimeException runtimeException) {
        this.m.sendMessage(this.m.obtainMessage(2, runtimeException));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.n);
        for (com.google.android.gms.common.api.a aVar : this.d.keySet()) {
            printWriter.append(str).append(aVar.d()).println(":");
            ((f) this.a.get(aVar.c())).a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    public void b() {
        if (this.n.b()) {
            this.b.clear();
        }
    }

    public boolean c() {
        return this.n instanceof i;
    }

    public void d() {
        if (c()) {
            ((i) this.n).d();
        }
    }

    void e() {
        this.i.lock();
        try {
            this.n = new j(this, this.c, this.d, this.l, this.e, this.i, this.k);
            this.n.a();
            this.j.signalAll();
        } finally {
            this.i.unlock();
        }
    }

    void f() {
        this.i.lock();
        try {
            this.g.h();
            this.n = new i(this);
            this.n.a();
            this.j.signalAll();
        } finally {
            this.i.unlock();
        }
    }

    void g() {
        for (f a : this.a.values()) {
            a.a();
        }
    }
}
