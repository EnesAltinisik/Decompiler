package com.google.android.gms.b;

public class ju extends jk {
    private static final ju a = new ju();

    private ju() {
    }

    public static ju b() {
        return a;
    }

    public int a(jq jqVar, jq jqVar2) {
        return js.a(jqVar.a(), jqVar.b().e(), jqVar2.a(), jqVar2.b().e());
    }

    public String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    public boolean a(jr jrVar) {
        return !jrVar.e().b();
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((jq) obj, (jq) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof ju;
    }

    public int hashCode() {
        return 3155577;
    }

    public String toString() {
        return "PriorityIndex";
    }
}
