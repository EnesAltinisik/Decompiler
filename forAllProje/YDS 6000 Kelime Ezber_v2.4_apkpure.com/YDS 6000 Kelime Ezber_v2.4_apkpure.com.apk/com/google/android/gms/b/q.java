package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;

public class q<O extends a> extends h {
    private final n<O> a;

    public q(n<O> nVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.a = nVar;
    }

    public Looper a() {
        return this.a.d();
    }

    public <A extends c, T extends ace.a<? extends g, A>> T a(T t) {
        return this.a.a(t);
    }

    public void a(al alVar) {
    }

    public void b(al alVar) {
    }
}
