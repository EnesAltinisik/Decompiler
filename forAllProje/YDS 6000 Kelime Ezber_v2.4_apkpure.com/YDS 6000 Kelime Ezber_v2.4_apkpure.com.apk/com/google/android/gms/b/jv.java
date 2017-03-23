package com.google.android.gms.b;

import com.google.firebase.database.c;

public class jv {
    public static jr a() {
        return jj.f();
    }

    public static jr a(Object obj) {
        jr a = js.a(obj);
        if (a instanceof jp) {
            a = new ji(Double.valueOf((double) ((Long) a.a()).longValue()), a());
        }
        if (a(a)) {
            return a;
        }
        throw new c("Invalid Firebase Database priority (must be a string, double, ServerValue, or null)");
    }

    public static boolean a(jr jrVar) {
        return jrVar.e().b() && (jrVar.b() || (jrVar instanceof ji) || (jrVar instanceof jx) || (jrVar instanceof jh));
    }
}
