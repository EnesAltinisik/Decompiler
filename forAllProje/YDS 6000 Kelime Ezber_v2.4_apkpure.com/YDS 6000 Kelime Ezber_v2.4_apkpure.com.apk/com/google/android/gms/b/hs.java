package com.google.android.gms.b;

import com.google.android.gms.b.hu.a;

public class hs extends hu {
    static final /* synthetic */ boolean a = (!hs.class.desiredAssertionStatus());

    public hs(hv hvVar, gx gxVar) {
        super(a.ListenComplete, hvVar, gxVar);
        if (!a && hvVar.a()) {
            throw new AssertionError("Can't have a listen complete from a user source");
        }
    }

    public hu a(je jeVar) {
        return this.d.h() ? new hs(this.c, gx.a()) : new hs(this.c, this.d.e());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", new Object[]{c(), d()});
    }
}
