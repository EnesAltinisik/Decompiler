package com.google.android.gms.b;

public final class bh {
    private static bh a;
    private final be b = new be();
    private final bf c = new bf();

    static {
        a(new bh());
    }

    private bh() {
    }

    public static be a() {
        return c().b;
    }

    protected static void a(bh bhVar) {
        synchronized (bh.class) {
            a = bhVar;
        }
    }

    public static bf b() {
        return c().c;
    }

    private static bh c() {
        bh bhVar;
        synchronized (bh.class) {
            bhVar = a;
        }
        return bhVar;
    }
}
