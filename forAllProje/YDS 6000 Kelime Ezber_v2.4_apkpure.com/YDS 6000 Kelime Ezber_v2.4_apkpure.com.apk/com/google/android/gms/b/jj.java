package com.google.android.gms.b;

import com.google.android.gms.b.jr.a;
import java.util.Collections;
import java.util.Iterator;

public class jj extends jf implements jr {
    private static final jj c = new jj();

    private jj() {
    }

    public static jj f() {
        return c;
    }

    public int a(jr jrVar) {
        return jrVar.b() ? 0 : -1;
    }

    public jr a(gx gxVar) {
        return this;
    }

    public jr a(gx gxVar, jr jrVar) {
        if (gxVar.h()) {
            return jrVar;
        }
        je d = gxVar.d();
        return a(d, c(d).a(gxVar.e(), jrVar));
    }

    public jr a(je jeVar, jr jrVar) {
        return (jrVar.b() || jeVar.e()) ? this : new jf().a(jeVar, jrVar);
    }

    public Object a() {
        return null;
    }

    public Object a(boolean z) {
        return null;
    }

    public String a(a aVar) {
        return "";
    }

    public boolean a(je jeVar) {
        return false;
    }

    public je b(je jeVar) {
        return null;
    }

    public /* synthetic */ jr b(jr jrVar) {
        return c(jrVar);
    }

    public boolean b() {
        return true;
    }

    public jj c(jr jrVar) {
        return this;
    }

    public jr c(je jeVar) {
        return this;
    }

    public String c() {
        return "";
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((jr) obj);
    }

    public boolean d() {
        return false;
    }

    public jr e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof jj) {
            return true;
        }
        boolean z = (obj instanceof jr) && ((jr) obj).b() && e().equals(((jr) obj).e());
        return z;
    }

    public int hashCode() {
        return 0;
    }

    public Iterator<jq> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        return "<Empty Node>";
    }
}
