package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.p;

public final class du {
    public static final g<eg> a = new g();
    public static final g<eg> b = new g();
    public static final b<eg, dw> c = new b<eg, dw>() {
        public eg a(Context context, Looper looper, p pVar, dw dwVar, c.b bVar, c.c cVar) {
            return new eg(context, looper, true, pVar, dwVar == null ? dw.a : dwVar, bVar, cVar);
        }
    };
    static final b<eg, a> d = new b<eg, a>() {
        public eg a(Context context, Looper looper, p pVar, a aVar, c.b bVar, c.c cVar) {
            return new eg(context, looper, false, pVar, aVar.a(), bVar, cVar);
        }
    };
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final com.google.android.gms.common.api.a<dw> g = new com.google.android.gms.common.api.a("SignIn.API", c, a);
    public static final com.google.android.gms.common.api.a<a> h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", d, b);

    public static class a implements com.google.android.gms.common.api.a.a.a {
        private final Bundle a;

        public Bundle a() {
            return this.a;
        }
    }
}
