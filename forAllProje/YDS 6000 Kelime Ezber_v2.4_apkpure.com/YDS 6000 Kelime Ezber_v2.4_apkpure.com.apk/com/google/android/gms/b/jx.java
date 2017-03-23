package com.google.android.gms.b;

import com.google.android.gms.b.jr.a;

public class jx extends jo<jx> {
    private final String a;

    public jx(String str, jr jrVar) {
        super(jrVar);
        this.a = str;
    }

    protected int a(jx jxVar) {
        return this.a.compareTo(jxVar.a);
    }

    public jx a(jr jrVar) {
        return new jx(this.a, jrVar);
    }

    public Object a() {
        return this.a;
    }

    public String a(a aVar) {
        String valueOf;
        String str;
        switch (aVar) {
            case V1:
                valueOf = String.valueOf(b(aVar));
                str = this.a;
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            case V2:
                valueOf = String.valueOf(b(aVar));
                str = String.valueOf(kt.c(this.a));
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            default:
                str = String.valueOf(aVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 38).append("Invalid hash version for string node: ").append(str).toString());
        }
    }

    public /* synthetic */ jr b(jr jrVar) {
        return a(jrVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        return this.a.equals(jxVar.a) && this.b.equals(jxVar.b);
    }

    protected a f_() {
        return a.String;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }
}
