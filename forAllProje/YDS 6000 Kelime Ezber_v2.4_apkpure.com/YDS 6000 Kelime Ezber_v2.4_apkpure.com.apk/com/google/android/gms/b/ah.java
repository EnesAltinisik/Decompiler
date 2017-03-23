package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import java.util.HashSet;
import java.util.Set;

public class ah extends dz implements b, c {
    private static com.google.android.gms.common.api.a.b<? extends dv, dw> a = du.c;
    private final Context b;
    private final Handler c;
    private final com.google.android.gms.common.api.a.b<? extends dv, dw> d;
    private final boolean e;
    private Set<Scope> f;
    private p g;
    private dv h;
    private a i;

    public interface a {
        void a(z zVar, Set<Scope> set);

        void b(com.google.android.gms.common.a aVar);
    }

    public ah(Context context, Handler handler) {
        this.b = context;
        this.c = handler;
        GoogleSignInOptions b = com.google.android.gms.auth.api.signin.a.b.a(this.b).b();
        this.f = b == null ? new HashSet() : new HashSet(b.a());
        this.g = new p(null, this.f, null, 0, null, null, null, dw.a);
        this.d = a;
        this.e = true;
    }

    public ah(Context context, Handler handler, p pVar, com.google.android.gms.common.api.a.b<? extends dv, dw> bVar) {
        this.b = context;
        this.c = handler;
        this.g = pVar;
        this.f = pVar.c();
        this.d = bVar;
        this.e = false;
    }

    private void b(ek ekVar) {
        com.google.android.gms.common.a a = ekVar.a();
        if (a.b()) {
            f b = ekVar.b();
            com.google.android.gms.common.a b2 = b.b();
            if (b2.b()) {
                this.i.a(b.a(), this.f);
            } else {
                String valueOf = String.valueOf(b2);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                this.i.b(b2);
                this.h.a();
                return;
            }
        }
        this.i.b(a);
        this.h.a();
    }

    public void a() {
        this.h.a();
    }

    public void a(int i) {
        this.h.a();
    }

    public void a(Bundle bundle) {
        this.h.a(this);
    }

    public void a(a aVar) {
        if (this.h != null) {
            this.h.a();
        }
        if (this.e) {
            GoogleSignInOptions b = com.google.android.gms.auth.api.signin.a.b.a(this.b).b();
            this.f = b == null ? new HashSet() : new HashSet(b.a());
            this.g = new p(null, this.f, null, 0, null, null, null, dw.a);
        }
        this.h = (dv) this.d.a(this.b, this.c.getLooper(), this.g, this.g.h(), this, this);
        this.i = aVar;
        this.h.l();
    }

    public void a(final ek ekVar) {
        this.c.post(new Runnable(this) {
            final /* synthetic */ ah b;

            public void run() {
                this.b.b(ekVar);
            }
        });
    }

    public void a(com.google.android.gms.common.a aVar) {
        this.i.b(aVar);
    }
}
