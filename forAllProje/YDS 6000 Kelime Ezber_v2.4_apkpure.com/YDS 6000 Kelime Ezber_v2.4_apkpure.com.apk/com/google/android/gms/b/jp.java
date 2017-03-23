package com.google.android.gms.b;

import com.google.android.gms.b.jr.a;

public class jp extends jo<jp> {
    private final long a;

    public jp(Long l, jr jrVar) {
        super(jrVar);
        this.a = l.longValue();
    }

    protected int a(jp jpVar) {
        return kt.a(this.a, jpVar.a);
    }

    public jp a(jr jrVar) {
        return new jp(Long.valueOf(this.a), jrVar);
    }

    public Object a() {
        return Long.valueOf(this.a);
    }

    public String a(a aVar) {
        String valueOf = String.valueOf(String.valueOf(b(aVar)).concat("number:"));
        String valueOf2 = String.valueOf(kt.a((double) this.a));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public /* synthetic */ jr b(jr jrVar) {
        return a(jrVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return this.a == jpVar.a && this.b.equals(jpVar.b);
    }

    protected a f_() {
        return a.Number;
    }

    public int hashCode() {
        return ((int) (this.a ^ (this.a >>> 32))) + this.b.hashCode();
    }
}
