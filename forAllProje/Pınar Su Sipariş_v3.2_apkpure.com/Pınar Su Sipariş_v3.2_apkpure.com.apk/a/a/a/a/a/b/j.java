package a.a.a.a.a.b;

/* compiled from: Crash */
public abstract class j {
    private final String a;

    /* compiled from: Crash */
    public static class a extends j {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Crash */
    public static class b extends j {
        public b(String str) {
            super(str);
        }
    }

    public j(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
