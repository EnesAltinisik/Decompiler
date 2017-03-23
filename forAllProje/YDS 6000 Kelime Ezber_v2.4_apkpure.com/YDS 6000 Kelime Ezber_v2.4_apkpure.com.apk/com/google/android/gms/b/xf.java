package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.v;
import java.util.WeakHashMap;

@vz
public final class xf {
    private WeakHashMap<Context, a> a = new WeakHashMap();

    private class a {
        public final long a = v.k().a();
        public final xe b;

        public a(xf xfVar, xe xeVar) {
            this.b = xeVar;
        }

        public boolean a() {
            return ((Long) pr.ba.c()).longValue() + this.a < v.k().a();
        }
    }

    public xe a(Context context) {
        a aVar = (a) this.a.get(context);
        xe a = (aVar == null || aVar.a() || !((Boolean) pr.aZ.c()).booleanValue()) ? new com.google.android.gms.b.xe.a(context).a() : new com.google.android.gms.b.xe.a(context, aVar.b).a();
        this.a.put(context, new a(this, a));
        return a;
    }
}
