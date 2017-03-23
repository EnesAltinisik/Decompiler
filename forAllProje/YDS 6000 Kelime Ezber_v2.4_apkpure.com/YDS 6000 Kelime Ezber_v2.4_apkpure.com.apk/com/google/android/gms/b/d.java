package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;

public final class d<O extends a> extends n<O> {
    private final f b;
    private final ach c;
    private final p d;
    private final b<? extends dv, dw> e;

    public d(Context context, com.google.android.gms.common.api.a<O> aVar, Looper looper, f fVar, ach com_google_android_gms_b_ach, p pVar, b<? extends dv, dw> bVar) {
        super(context, aVar, looper);
        this.b = fVar;
        this.c = com_google_android_gms_b_ach;
        this.d = pVar;
        this.e = bVar;
        this.a.a((n) this);
    }

    public ah a(Context context, Handler handler) {
        return new ah(context, handler, this.d, this.e);
    }

    public f a(Looper looper, p.a<O> aVar) {
        this.c.a((aci) aVar);
        return this.b;
    }
}
