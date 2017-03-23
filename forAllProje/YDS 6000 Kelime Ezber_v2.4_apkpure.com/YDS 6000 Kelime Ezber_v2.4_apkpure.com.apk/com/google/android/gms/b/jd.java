package com.google.android.gms.b;

import com.google.android.gms.b.jr.a;

public class jd extends jo<jd> {
    private final boolean a;

    public jd(Boolean bool, jr jrVar) {
        super(jrVar);
        this.a = bool.booleanValue();
    }

    protected int a(jd jdVar) {
        return this.a == jdVar.a ? 0 : this.a ? 1 : -1;
    }

    public jd a(jr jrVar) {
        return new jd(Boolean.valueOf(this.a), jrVar);
    }

    public Object a() {
        return Boolean.valueOf(this.a);
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(b(aVar));
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append("boolean:").append(this.a).toString();
    }

    public /* synthetic */ jr b(jr jrVar) {
        return a(jrVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        return this.a == jdVar.a && this.b.equals(jdVar.b);
    }

    protected a f_() {
        return a.Boolean;
    }

    public int hashCode() {
        return (this.a ? 1 : 0) + this.b.hashCode();
    }
}
