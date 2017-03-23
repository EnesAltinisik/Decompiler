package com.google.android.gms.b;

public class hv {
    public static final hv a = new hv(a.User, null, false);
    public static final hv b = new hv(a.Server, null, false);
    static final /* synthetic */ boolean c = (!hv.class.desiredAssertionStatus());
    private final a d;
    private final is e;
    private final boolean f;

    private enum a {
        User,
        Server
    }

    public hv(a aVar, is isVar, boolean z) {
        this.d = aVar;
        this.e = isVar;
        this.f = z;
        if (!c && z && !b()) {
            throw new AssertionError();
        }
    }

    public static hv a(is isVar) {
        return new hv(a.Server, isVar, true);
    }

    public boolean a() {
        return this.d == a.User;
    }

    public boolean b() {
        return this.d == a.Server;
    }

    public boolean c() {
        return this.f;
    }

    public is d() {
        return this.e;
    }

    public String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("OperationSource{source=").append(valueOf).append(", queryParams=").append(valueOf2).append(", tagged=").append(this.f).append("}").toString();
    }
}
