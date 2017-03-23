package com.google.android.gms.b;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.b.ace.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.h;

public class i implements m {
    private final n a;
    private boolean b = false;

    public i(n nVar) {
        this.a = nVar;
    }

    private <A extends c> void b(a<? extends g, A> aVar) {
        this.a.g.i.a((acg) aVar);
        c a = this.a.g.a(aVar.b());
        if (a.b() || !this.a.b.containsKey(aVar.b())) {
            if (a instanceof h) {
                a = ((h) a).k();
            }
            aVar.b(a);
            return;
        }
        aVar.c(new Status(17));
    }

    public <A extends c, T extends a<? extends g, A>> T a(T t) {
        try {
            b(t);
        } catch (DeadObjectException e) {
            this.a.a(new a(this, this) {
                final /* synthetic */ i a;

                public void a() {
                    this.a.a(1);
                }
            });
        }
        return t;
    }

    public void a() {
    }

    public void a(int i) {
        this.a.a(null);
        this.a.h.a(i, this.b);
    }

    public void a(Bundle bundle) {
    }

    public void a(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, int i) {
    }

    public boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.g.i()) {
            this.b = true;
            for (al a : this.a.g.h) {
                a.a();
            }
            return false;
        }
        this.a.a(null);
        return true;
    }

    public void c() {
        if (this.b) {
            this.b = false;
            this.a.a(new a(this, this) {
                final /* synthetic */ i a;

                public void a() {
                    this.a.a.h.a(null);
                }
            });
        }
    }

    void d() {
        if (this.b) {
            this.b = false;
            this.a.g.i.a();
            b();
        }
    }
}
