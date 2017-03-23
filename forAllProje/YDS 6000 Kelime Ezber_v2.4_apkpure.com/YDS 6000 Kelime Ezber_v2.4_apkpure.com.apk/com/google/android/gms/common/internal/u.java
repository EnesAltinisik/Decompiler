package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.v.a;
import java.util.Set;

public abstract class u<T extends IInterface> extends o<T> implements f, a {
    private final p e;
    private final Set<Scope> f;
    private final Account g;

    class AnonymousClass1 implements b {
        final /* synthetic */ c.b a;

        AnonymousClass1(c.b bVar) {
            this.a = bVar;
        }

        public void a(int i) {
            this.a.a(i);
        }

        public void a(Bundle bundle) {
            this.a.a(bundle);
        }
    }

    class AnonymousClass2 implements o.c {
        final /* synthetic */ c.c a;

        AnonymousClass2(c.c cVar) {
            this.a = cVar;
        }

        public void a(com.google.android.gms.common.a aVar) {
            this.a.a(aVar);
        }
    }

    protected u(Context context, Looper looper, int i, p pVar, c.b bVar, c.c cVar) {
        this(context, looper, w.a(context), com.google.android.gms.common.c.a(), i, pVar, (c.b) c.a((Object) bVar), (c.c) c.a((Object) cVar));
    }

    protected u(Context context, Looper looper, w wVar, com.google.android.gms.common.c cVar, int i, p pVar, c.b bVar, c.c cVar2) {
        super(context, looper, wVar, cVar, i, a(bVar), a(cVar2), pVar.g());
        this.e = pVar;
        this.g = pVar.a();
        this.f = b(pVar.d());
    }

    private static b a(c.b bVar) {
        return bVar == null ? null : new AnonymousClass1(bVar);
    }

    private static o.c a(c.c cVar) {
        return cVar == null ? null : new AnonymousClass2(cVar);
    }

    private Set<Scope> b(Set<Scope> set) {
        Set<Scope> a = a((Set) set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    protected Set<Scope> a(Set<Scope> set) {
        return set;
    }

    public final Account p() {
        return this.g;
    }

    protected final Set<Scope> w() {
        return this.f;
    }
}
