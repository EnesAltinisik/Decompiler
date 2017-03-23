package com.google.android.gms.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class jo<T extends jo> implements jr {
    static final /* synthetic */ boolean c = (!jo.class.desiredAssertionStatus());
    private String a;
    protected final jr b;

    protected enum a {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    jo(jr jrVar) {
        this.b = jrVar;
    }

    private static int a(jp jpVar, ji jiVar) {
        return Double.valueOf((double) ((Long) jpVar.a()).longValue()).compareTo((Double) jiVar.a());
    }

    protected abstract int a(T t);

    public jr a(gx gxVar) {
        return gxVar.h() ? this : gxVar.d().e() ? this.b : jj.f();
    }

    public jr a(gx gxVar, jr jrVar) {
        je d = gxVar.d();
        if (d == null) {
            return jrVar;
        }
        if (jrVar.b() && !d.e()) {
            return this;
        }
        if (c || !gxVar.d().e() || gxVar.i() == 1) {
            return a(d, jj.f().a(gxVar.e(), jrVar));
        }
        throw new AssertionError();
    }

    public jr a(je jeVar, jr jrVar) {
        return jeVar.e() ? b(jrVar) : !jrVar.b() ? jj.f().a(jeVar, jrVar).b(this.b) : this;
    }

    public Object a(boolean z) {
        if (!z || this.b.b()) {
            return a();
        }
        Map hashMap = new HashMap();
        hashMap.put(".value", a());
        hashMap.put(".priority", this.b.a());
        return hashMap;
    }

    public boolean a(je jeVar) {
        return false;
    }

    protected int b(jo<?> joVar) {
        a f_ = f_();
        Enum f_2 = joVar.f_();
        return f_.equals(f_2) ? a((jo) joVar) : f_.compareTo(f_2);
    }

    public je b(je jeVar) {
        return null;
    }

    protected String b(com.google.android.gms.b.jr.a aVar) {
        switch (aVar) {
            case V1:
            case V2:
                if (this.b.b()) {
                    return "";
                }
                String valueOf = String.valueOf(this.b.a(aVar));
                return new StringBuilder(String.valueOf(valueOf).length() + 10).append("priority:").append(valueOf).append(":").toString();
            default:
                String valueOf2 = String.valueOf(aVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 22).append("Unknown hash version: ").append(valueOf2).toString());
        }
    }

    public boolean b() {
        return false;
    }

    public int c(jr jrVar) {
        if (jrVar.b()) {
            return 1;
        }
        if (jrVar instanceof jf) {
            return -1;
        }
        if (c || jrVar.d()) {
            return ((this instanceof jp) && (jrVar instanceof ji)) ? a((jp) this, (ji) jrVar) : ((this instanceof ji) && (jrVar instanceof jp)) ? a((jp) jrVar, (ji) this) * -1 : b((jo) jrVar);
        } else {
            throw new AssertionError("Node is not leaf node!");
        }
    }

    public jr c(je jeVar) {
        return jeVar.e() ? this.b : jj.f();
    }

    public String c() {
        if (this.a == null) {
            this.a = kt.b(a(com.google.android.gms.b.jr.a.V1));
        }
        return this.a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return c((jr) obj);
    }

    public boolean d() {
        return true;
    }

    public jr e() {
        return this.b;
    }

    protected abstract a f_();

    public Iterator<jq> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = a(true).toString();
        return obj.length() <= 100 ? obj : String.valueOf(obj.substring(0, 100)).concat("...");
    }
}
