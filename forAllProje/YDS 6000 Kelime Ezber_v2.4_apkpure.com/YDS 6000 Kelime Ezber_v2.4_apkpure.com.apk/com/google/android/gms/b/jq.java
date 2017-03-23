package com.google.android.gms.b;

public class jq {
    private static final jq c = new jq(je.a(), jj.f());
    private static final jq d = new jq(je.b(), jr.d);
    private final je a;
    private final jr b;

    public jq(je jeVar, jr jrVar) {
        this.a = jeVar;
        this.b = jrVar;
    }

    public je a() {
        return this.a;
    }

    public jr b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jq jqVar = (jq) obj;
        return !this.a.equals(jqVar.a) ? false : this.b.equals(jqVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("NamedNode{name=").append(valueOf).append(", node=").append(valueOf2).append("}").toString();
    }
}
