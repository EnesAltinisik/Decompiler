package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.b.aca;
import com.google.android.gms.b.acb;
import com.google.android.gms.b.ace;
import com.google.android.gms.b.ah;
import com.google.android.gms.b.ai;
import com.google.android.gms.b.p;
import com.google.android.gms.b.q;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.c;

public abstract class n<O extends a> {
    protected final p a;
    private final Context b;
    private final a<O> c;
    private final O d;
    private final acb<O> e;
    private final Looper f;
    private final int g;
    private final c h;
    private final ai i;

    protected n(Context context, a<O> aVar, Looper looper) {
        c.a((Object) context, (Object) "Null context is not permitted.");
        c.a((Object) aVar, (Object) "Api must not be null.");
        c.a((Object) looper, (Object) "Looper must not be null.");
        this.b = context.getApplicationContext();
        this.c = aVar;
        this.d = null;
        this.f = looper;
        this.e = acb.a(aVar);
        this.h = new q(this);
        this.a = p.a(this.b);
        this.g = this.a.b();
        this.i = new aca();
    }

    public n(Context context, a<O> aVar, O o, Looper looper, ai aiVar) {
        c.a((Object) context, (Object) "Null context is not permitted.");
        c.a((Object) aVar, (Object) "Api must not be null.");
        c.a((Object) looper, (Object) "Looper must not be null.");
        this.b = context.getApplicationContext();
        this.c = aVar;
        this.d = o;
        this.f = looper;
        this.e = acb.a(this.c, this.d);
        this.h = new q(this);
        this.a = p.a(this.b);
        this.g = this.a.b();
        this.i = aiVar;
        this.a.a(this);
    }

    public n(Context context, a<O> aVar, O o, ai aiVar) {
        this(context, aVar, o, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper(), aiVar);
    }

    private <A extends a.c, T extends ace.a<? extends g, A>> T a(int i, T t) {
        t.i();
        this.a.a(this, i, t);
        return t;
    }

    public acb<O> a() {
        return this.e;
    }

    public <A extends a.c, T extends ace.a<? extends g, A>> T a(T t) {
        return a(1, (ace.a) t);
    }

    public ah a(Context context, Handler handler) {
        return new ah(context, handler);
    }

    public f a(Looper looper, p.a<O> aVar) {
        return this.c.b().a(this.b, looper, com.google.android.gms.common.internal.p.a(this.b), this.d, aVar, aVar);
    }

    public int b() {
        return this.g;
    }

    public <A extends a.c, T extends ace.a<? extends g, A>> T b(T t) {
        return a(2, (ace.a) t);
    }

    public c c() {
        return this.h;
    }

    public Looper d() {
        return this.f;
    }
}
