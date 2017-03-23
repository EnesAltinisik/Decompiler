package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class c implements t {
    private final Context a;
    private final l b;
    private final Looper c;
    private final n d;
    private final n e;
    private final Map<d<?>, n> f;
    private final Set<ag> g = Collections.newSetFromMap(new WeakHashMap());
    private final f h;
    private Bundle i;
    private com.google.android.gms.common.a j = null;
    private com.google.android.gms.common.a k = null;
    private boolean l = false;
    private final Lock m;
    private int n = 0;

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ c a;

        public void run() {
            this.a.m.lock();
            try {
                this.a.g();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private class a implements com.google.android.gms.b.t.a {
        final /* synthetic */ c a;

        private a(c cVar) {
            this.a = cVar;
        }

        public void a(int i, boolean z) {
            this.a.m.lock();
            try {
                if (this.a.l || this.a.k == null || !this.a.k.b()) {
                    this.a.l = false;
                    this.a.a(i, z);
                    return;
                }
                this.a.l = true;
                this.a.e.a(i);
                this.a.m.unlock();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(Bundle bundle) {
            this.a.m.lock();
            try {
                this.a.a(bundle);
                this.a.j = com.google.android.gms.common.a.a;
                this.a.g();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(com.google.android.gms.common.a aVar) {
            this.a.m.lock();
            try {
                this.a.j = aVar;
                this.a.g();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private class b implements com.google.android.gms.b.t.a {
        final /* synthetic */ c a;

        private b(c cVar) {
            this.a = cVar;
        }

        public void a(int i, boolean z) {
            this.a.m.lock();
            try {
                if (this.a.l) {
                    this.a.l = false;
                    this.a.a(i, z);
                    return;
                }
                this.a.l = true;
                this.a.d.a(i);
                this.a.m.unlock();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(Bundle bundle) {
            this.a.m.lock();
            try {
                this.a.k = com.google.android.gms.common.a.a;
                this.a.g();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(com.google.android.gms.common.a aVar) {
            this.a.m.lock();
            try {
                this.a.k = aVar;
                this.a.g();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private c(Context context, l lVar, Lock lock, Looper looper, k kVar, Map<d<?>, f> map, Map<d<?>, f> map2, p pVar, com.google.android.gms.common.api.a.b<? extends dv, dw> bVar, f fVar, ArrayList<ach> arrayList, ArrayList<ach> arrayList2, Map<com.google.android.gms.common.api.a<?>, Integer> map3, Map<com.google.android.gms.common.api.a<?>, Integer> map4) {
        this.a = context;
        this.b = lVar;
        this.m = lock;
        this.c = looper;
        this.h = fVar;
        this.d = new n(context, this.b, lock, looper, kVar, map2, null, map4, null, arrayList2, new a());
        this.e = new n(context, this.b, lock, looper, kVar, map, pVar, map3, bVar, arrayList, new b());
        Map aVar = new android.support.v4.i.a();
        for (d put : map2.keySet()) {
            aVar.put(put, this.d);
        }
        for (d put2 : map.keySet()) {
            aVar.put(put2, this.e);
        }
        this.f = Collections.unmodifiableMap(aVar);
    }

    public static c a(Context context, l lVar, Lock lock, Looper looper, k kVar, Map<d<?>, f> map, p pVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.a.b<? extends dv, dw> bVar, ArrayList<ach> arrayList) {
        f fVar = null;
        Map aVar = new android.support.v4.i.a();
        Map aVar2 = new android.support.v4.i.a();
        for (Entry entry : map.entrySet()) {
            f fVar2 = (f) entry.getValue();
            if (fVar2.f()) {
                fVar = fVar2;
            }
            if (fVar2.d()) {
                aVar.put((d) entry.getKey(), fVar2);
            } else {
                aVar2.put((d) entry.getKey(), fVar2);
            }
        }
        com.google.android.gms.common.internal.c.a(!aVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map aVar3 = new android.support.v4.i.a();
        Map aVar4 = new android.support.v4.i.a();
        for (com.google.android.gms.common.api.a aVar5 : map2.keySet()) {
            d c = aVar5.c();
            if (aVar.containsKey(c)) {
                aVar3.put(aVar5, (Integer) map2.get(aVar5));
            } else if (aVar2.containsKey(c)) {
                aVar4.put(aVar5, (Integer) map2.get(aVar5));
            } else {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ach com_google_android_gms_b_ach = (ach) it.next();
            if (aVar3.containsKey(com_google_android_gms_b_ach.a)) {
                arrayList2.add(com_google_android_gms_b_ach);
            } else if (aVar4.containsKey(com_google_android_gms_b_ach.a)) {
                arrayList3.add(com_google_android_gms_b_ach);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        return new c(context, lVar, lock, looper, kVar, aVar, aVar2, pVar, bVar, fVar, arrayList2, arrayList3, aVar3, aVar4);
    }

    private void a(int i, boolean z) {
        this.b.a(i, z);
        this.k = null;
        this.j = null;
    }

    private void a(Bundle bundle) {
        if (this.i == null) {
            this.i = bundle;
        } else if (bundle != null) {
            this.i.putAll(bundle);
        }
    }

    private void a(com.google.android.gms.common.a aVar) {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.b.a(aVar);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        i();
        this.n = 0;
    }

    private boolean b(com.google.android.gms.b.ace.a<? extends g, ? extends com.google.android.gms.common.api.a.c> aVar) {
        d b = aVar.b();
        com.google.android.gms.common.internal.c.b(this.f.containsKey(b), "GoogleApiClient is not configured to use the API required for this call.");
        return ((n) this.f.get(b)).equals(this.e);
    }

    private static boolean b(com.google.android.gms.common.a aVar) {
        return aVar != null && aVar.b();
    }

    private void f() {
        this.k = null;
        this.j = null;
        this.d.a();
        this.e.a();
    }

    private void g() {
        if (b(this.j)) {
            if (b(this.k) || j()) {
                h();
            } else if (this.k == null) {
            } else {
                if (this.n == 1) {
                    i();
                    return;
                }
                a(this.k);
                this.d.b();
            }
        } else if (this.j != null && b(this.k)) {
            this.e.b();
            a(this.j);
        } else if (this.j != null && this.k != null) {
            com.google.android.gms.common.a aVar = this.j;
            if (this.e.f < this.d.f) {
                aVar = this.k;
            }
            a(aVar);
        }
    }

    private void h() {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.b.a(this.i);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                break;
        }
        i();
        this.n = 0;
    }

    private void i() {
        for (ag a : this.g) {
            a.a();
        }
        this.g.clear();
    }

    private boolean j() {
        return this.k != null && this.k.c() == 4;
    }

    private PendingIntent k() {
        return this.h == null ? null : PendingIntent.getActivity(this.a, this.b.k(), this.h.g(), 134217728);
    }

    public <A extends com.google.android.gms.common.api.a.c, T extends com.google.android.gms.b.ace.a<? extends g, A>> T a(T t) {
        if (!b((com.google.android.gms.b.ace.a) t)) {
            return this.d.a((com.google.android.gms.b.ace.a) t);
        }
        if (!j()) {
            return this.e.a((com.google.android.gms.b.ace.a) t);
        }
        t.c(new Status(4, null, k()));
        return t;
    }

    public void a() {
        this.n = 2;
        this.l = false;
        f();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.e.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.d.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public void b() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.b();
        this.e.b();
        i();
    }

    public boolean c() {
        boolean z = true;
        this.m.lock();
        try {
            if (!(this.d.c() && (e() || j() || this.n == 1))) {
                z = false;
            }
            this.m.unlock();
            return z;
        } catch (Throwable th) {
            this.m.unlock();
        }
    }

    public void d() {
        this.d.d();
        this.e.d();
    }

    public boolean e() {
        return this.e.c();
    }
}
