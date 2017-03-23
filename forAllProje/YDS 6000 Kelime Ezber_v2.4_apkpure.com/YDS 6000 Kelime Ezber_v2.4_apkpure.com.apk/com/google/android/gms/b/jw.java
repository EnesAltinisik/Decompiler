package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class jw {
    static final /* synthetic */ boolean a = (!jw.class.desiredAssertionStatus());
    private final gx b;
    private final gx c;
    private final jr d;

    public jw(gh ghVar) {
        gx gxVar = null;
        List a = ghVar.a();
        this.b = a != null ? new gx(a) : null;
        List b = ghVar.b();
        if (b != null) {
            gxVar = new gx(b);
        }
        this.c = gxVar;
        this.d = js.a(ghVar.c());
    }

    private jr a(gx gxVar, jr jrVar, jr jrVar2) {
        Object obj = 1;
        int c = this.b == null ? 1 : gxVar.c(this.b);
        int c2 = this.c == null ? -1 : gxVar.c(this.c);
        Object obj2 = (this.b == null || !gxVar.b(this.b)) ? null : 1;
        if (this.c == null || !gxVar.b(this.c)) {
            obj = null;
        }
        if (c > 0 && c2 < 0 && r1 == null) {
            return jrVar2;
        }
        if (c > 0 && r1 != null && jrVar2.d()) {
            return jrVar2;
        }
        if (c <= 0 || c2 != 0) {
            if (obj2 != null || r1 != null) {
                Collection hashSet = new HashSet();
                for (jq a : jrVar) {
                    hashSet.add(a.a());
                }
                for (jq a2 : jrVar2) {
                    hashSet.add(a2.a());
                }
                List<je> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!(jrVar2.e().b() && jrVar.e().b())) {
                    arrayList.add(je.c());
                }
                jr jrVar3 = jrVar;
                for (je jeVar : arrayList) {
                    jr c3 = jrVar.c(jeVar);
                    jr a3 = a(gxVar.a(jeVar), jrVar.c(jeVar), jrVar2.c(jeVar));
                    jrVar3 = a3 != c3 ? jrVar3.a(jeVar, a3) : jrVar3;
                }
                return jrVar3;
            } else if (a || c2 > 0 || c <= 0) {
                return jrVar;
            } else {
                throw new AssertionError();
            }
        } else if (!a && r1 == null) {
            throw new AssertionError();
        } else if (a || !jrVar2.d()) {
            return jrVar.d() ? jj.f() : jrVar;
        } else {
            throw new AssertionError();
        }
    }

    public jr a(jr jrVar) {
        return a(gx.a(), jrVar, this.d);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return new StringBuilder(((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("RangeMerge{optExclusiveStart=").append(valueOf).append(", optInclusiveEnd=").append(valueOf2).append(", snap=").append(valueOf3).append("}").toString();
    }
}
