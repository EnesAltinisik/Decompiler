package com.google.android.gms.b;

public class jy extends jk {
    private static final jy a = new jy();

    private jy() {
    }

    public static jy b() {
        return a;
    }

    public int a(jq jqVar, jq jqVar2) {
        int compareTo = jqVar.b().compareTo(jqVar2.b());
        return compareTo == 0 ? jqVar.a().a(jqVar2.a()) : compareTo;
    }

    public String a() {
        return ".value";
    }

    public boolean a(jr jrVar) {
        return true;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((jq) obj, (jq) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof jy;
    }

    public int hashCode() {
        return 4;
    }

    public String toString() {
        return "ValueIndex";
    }
}
