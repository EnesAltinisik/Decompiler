package com.google.android.gms.b;

@vz
public class oc {
    private static final Object a = new Object();
    private static oc b;
    private final zx c = new zx();
    private final ob d = new ob(new nr(), new nq(), new oz(), new ri(), new xu(), new vc(), new um());

    static {
        a(new oc());
    }

    protected oc() {
    }

    public static zx a() {
        return c().c;
    }

    protected static void a(oc ocVar) {
        synchronized (a) {
            b = ocVar;
        }
    }

    public static ob b() {
        return c().d;
    }

    private static oc c() {
        oc ocVar;
        synchronized (a) {
            ocVar = b;
        }
        return ocVar;
    }
}
