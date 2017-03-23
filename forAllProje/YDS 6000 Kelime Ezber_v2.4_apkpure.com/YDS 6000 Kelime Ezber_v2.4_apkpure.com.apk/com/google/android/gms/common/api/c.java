package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.b.acc;
import com.google.android.gms.b.ach;
import com.google.android.gms.b.al;
import com.google.android.gms.b.du;
import com.google.android.gms.b.dv;
import com.google.android.gms.b.dw;
import com.google.android.gms.b.l;
import com.google.android.gms.b.u;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public abstract class c {
    private static final Set<c> a = Collections.newSetFromMap(new WeakHashMap());

    public interface c {
        void a(com.google.android.gms.common.a aVar);
    }

    public interface b {
        void a(int i);

        void a(Bundle bundle);
    }

    public static final class a {
        private Account a;
        private final Set<Scope> b = new HashSet();
        private final Set<Scope> c = new HashSet();
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map<a<?>, com.google.android.gms.common.internal.p.a> h = new android.support.v4.i.a();
        private final Context i;
        private final Map<a<?>, com.google.android.gms.common.api.a.a> j = new android.support.v4.i.a();
        private u k;
        private int l = -1;
        private c m;
        private Looper n;
        private com.google.android.gms.common.c o = com.google.android.gms.common.c.a();
        private com.google.android.gms.common.api.a.b<? extends dv, dw> p = du.c;
        private final ArrayList<b> q = new ArrayList();
        private final ArrayList<c> r = new ArrayList();
        private boolean s = false;

        public a(Context context) {
            this.i = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        private static <C extends f, O> C a(com.google.android.gms.common.api.a.b<C, O> bVar, Object obj, Context context, Looper looper, p pVar, b bVar2, c cVar) {
            return bVar.a(context, looper, pVar, obj, bVar2, cVar);
        }

        private void a(c cVar) {
            acc.b(this.k).a(this.l, cVar, this.m);
        }

        private c c() {
            p a = a();
            a aVar = null;
            Map e = a.e();
            Map aVar2 = new android.support.v4.i.a();
            Map aVar3 = new android.support.v4.i.a();
            ArrayList arrayList = new ArrayList();
            a aVar4 = null;
            for (a aVar5 : this.j.keySet()) {
                a aVar52;
                Object obj = this.j.get(aVar52);
                int i = 0;
                if (e.get(aVar52) != null) {
                    i = ((com.google.android.gms.common.internal.p.a) e.get(aVar52)).b ? 1 : 2;
                }
                aVar2.put(aVar52, Integer.valueOf(i));
                b com_google_android_gms_b_ach = new ach(aVar52, i);
                arrayList.add(com_google_android_gms_b_ach);
                com.google.android.gms.common.api.a.b b = aVar52.b();
                a aVar6 = b.a() == 1 ? aVar52 : aVar4;
                f a2 = a(b, obj, this.i, this.n, a, com_google_android_gms_b_ach, com_google_android_gms_b_ach);
                aVar3.put(aVar52.c(), a2);
                if (!a2.f()) {
                    aVar52 = aVar;
                } else if (aVar != null) {
                    String valueOf = String.valueOf(aVar52.d());
                    String valueOf2 = String.valueOf(aVar.d());
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                aVar4 = aVar6;
                aVar = aVar52;
            }
            if (aVar != null) {
                if (aVar4 != null) {
                    valueOf = String.valueOf(aVar.d());
                    valueOf2 = String.valueOf(aVar4.d());
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                com.google.android.gms.common.internal.c.a(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.d());
                com.google.android.gms.common.internal.c.a(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.d());
            }
            return new l(this.i, new ReentrantLock(), this.n, a, this.o, this.p, aVar2, this.q, this.r, aVar3, this.l, l.a(aVar3.values(), true), arrayList, false);
        }

        public a a(a<? extends com.google.android.gms.common.api.a.a.c> aVar) {
            com.google.android.gms.common.internal.c.a((Object) aVar, (Object) "Api must not be null");
            this.j.put(aVar, null);
            Collection a = aVar.a().a(null);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public p a() {
            dw dwVar = dw.a;
            if (this.j.containsKey(du.g)) {
                dwVar = (dw) this.j.get(du.g);
            }
            return new p(this.a, this.b, this.h, this.d, this.e, this.f, this.g, dwVar);
        }

        public c b() {
            com.google.android.gms.common.internal.c.b(!this.j.isEmpty(), "must call addApi() to add at least one API");
            c c = c();
            synchronized (c.a) {
                c.a.add(c);
            }
            if (this.l >= 0) {
                a(c);
            }
            return c;
        }
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public <A extends com.google.android.gms.common.api.a.c, T extends com.google.android.gms.b.ace.a<? extends g, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public void a(al alVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(c cVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b();

    public void b(al alVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void b(c cVar);

    public abstract void c();
}
