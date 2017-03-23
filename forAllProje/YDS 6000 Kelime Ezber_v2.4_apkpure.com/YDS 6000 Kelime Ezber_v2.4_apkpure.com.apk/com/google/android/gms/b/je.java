package com.google.android.gms.b;

public class je implements Comparable<je> {
    static final /* synthetic */ boolean a = (!je.class.desiredAssertionStatus());
    private static final je c = new je("[MIN_KEY]");
    private static final je d = new je("[MAX_KEY]");
    private static final je e = new je(".priority");
    private static final je f = new je(".info");
    private final String b;

    private static class a extends je {
        private final int b;

        a(String str, int i) {
            super(str);
            this.b = i;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return super.a((je) obj);
        }

        protected boolean f() {
            return true;
        }

        protected int g() {
            return this.b;
        }

        public String toString() {
            String b = this.b;
            return new StringBuilder(String.valueOf(b).length() + 20).append("IntegerChildName(\"").append(b).append("\")").toString();
        }
    }

    private je(String str) {
        this.b = str;
    }

    public static je a() {
        return c;
    }

    public static je a(String str) {
        Integer d = kt.d(str);
        if (d != null) {
            return new a(str, d.intValue());
        }
        if (str.equals(".priority")) {
            return e;
        }
        if (a || !str.contains("/")) {
            return new je(str);
        }
        throw new AssertionError();
    }

    public static je b() {
        return d;
    }

    public static je c() {
        return e;
    }

    public int a(je jeVar) {
        if (this == jeVar) {
            return 0;
        }
        if (this == c || jeVar == d) {
            return -1;
        }
        if (jeVar == c || this == d) {
            return 1;
        }
        if (!f()) {
            return jeVar.f() ? 1 : this.b.compareTo(jeVar.b);
        } else {
            if (!jeVar.f()) {
                return -1;
            }
            int a = kt.a(g(), jeVar.g());
            return a == 0 ? kt.a(this.b.length(), jeVar.b.length()) : a;
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((je) obj);
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return this == e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof je)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.b.equals(((je) obj).b);
    }

    protected boolean f() {
        return false;
    }

    protected int g() {
        return 0;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str = this.b;
        return new StringBuilder(String.valueOf(str).length() + 12).append("ChildKey(\"").append(str).append("\")").toString();
    }
}
