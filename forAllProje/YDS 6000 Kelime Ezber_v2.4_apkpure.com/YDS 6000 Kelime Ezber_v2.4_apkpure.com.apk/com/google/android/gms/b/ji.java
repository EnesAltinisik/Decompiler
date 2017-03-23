package com.google.android.gms.b;

import com.google.android.gms.b.jr.a;

public class ji extends jo<ji> {
    static final /* synthetic */ boolean a = (!ji.class.desiredAssertionStatus());
    private final Double e;

    public ji(Double d, jr jrVar) {
        super(jrVar);
        this.e = d;
    }

    protected int a(ji jiVar) {
        return this.e.compareTo(jiVar.e);
    }

    public ji a(jr jrVar) {
        if (a || jv.a(jrVar)) {
            return new ji(this.e, jrVar);
        }
        throw new AssertionError();
    }

    public Object a() {
        return this.e;
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(String.valueOf(b(aVar)).concat("number:"));
        String valueOf2 = String.valueOf(kt.a(this.e.doubleValue()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public /* synthetic */ jr b(jr jrVar) {
        return a(jrVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj;
        return this.e.equals(jiVar.e) && this.b.equals(jiVar.b);
    }

    protected a f_() {
        return a.Number;
    }

    public int hashCode() {
        return this.e.hashCode() + this.b.hashCode();
    }
}
