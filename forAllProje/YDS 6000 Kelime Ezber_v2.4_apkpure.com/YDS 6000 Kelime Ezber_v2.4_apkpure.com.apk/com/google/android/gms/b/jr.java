package com.google.android.gms.b;

public interface jr extends Comparable<jr>, Iterable<jq> {
    public static final jf d = new jf() {
        public int a(jr jrVar) {
            return jrVar == this ? 0 : 1;
        }

        public boolean a(je jeVar) {
            return false;
        }

        public boolean b() {
            return false;
        }

        public jr c(je jeVar) {
            return jeVar.e() ? e() : jj.f();
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((jr) obj);
        }

        public jr e() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public String toString() {
            return "<Max Node>";
        }
    };

    public enum a {
        V1,
        V2
    }

    jr a(gx gxVar);

    jr a(gx gxVar, jr jrVar);

    jr a(je jeVar, jr jrVar);

    Object a();

    Object a(boolean z);

    String a(a aVar);

    boolean a(je jeVar);

    je b(je jeVar);

    jr b(jr jrVar);

    boolean b();

    jr c(je jeVar);

    String c();

    boolean d();

    jr e();
}
