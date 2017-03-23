package com.google.android.gms.b;

public class jt extends jk {
    private final gx a;

    public jt(gx gxVar) {
        if (gxVar.i() == 1 && gxVar.d().e()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.a = gxVar;
    }

    public int a(jq jqVar, jq jqVar2) {
        int compareTo = jqVar.b().a(this.a).compareTo(jqVar2.b().a(this.a));
        return compareTo == 0 ? jqVar.a().a(jqVar2.a()) : compareTo;
    }

    public String a() {
        return this.a.b();
    }

    public boolean a(jr jrVar) {
        return !jrVar.a(this.a).b();
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((jq) obj, (jq) obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jt) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
