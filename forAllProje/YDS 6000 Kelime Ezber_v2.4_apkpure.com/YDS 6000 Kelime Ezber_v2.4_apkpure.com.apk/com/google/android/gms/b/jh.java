package com.google.android.gms.b;

import com.google.android.gms.b.jr.a;
import java.util.Map;

public class jh extends jo<jh> {
    static final /* synthetic */ boolean a = (!jh.class.desiredAssertionStatus());
    private Map<Object, Object> e;

    public jh(Map<Object, Object> map, jr jrVar) {
        super(jrVar);
        this.e = map;
    }

    public jh a(jr jrVar) {
        if (a || jv.a(jrVar)) {
            return new jh(this.e, jrVar);
        }
        throw new AssertionError();
    }

    public Object a() {
        return this.e;
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(b(aVar));
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length()).append(valueOf).append("deferredValue:").append(valueOf2).toString();
    }

    public /* synthetic */ jr b(jr jrVar) {
        return a(jrVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return this.e.equals(jhVar.e) && this.b.equals(jhVar.b);
    }

    protected a f_() {
        return a.DeferredValue;
    }

    public int hashCode() {
        return this.e.hashCode() + this.b.hashCode();
    }
}
