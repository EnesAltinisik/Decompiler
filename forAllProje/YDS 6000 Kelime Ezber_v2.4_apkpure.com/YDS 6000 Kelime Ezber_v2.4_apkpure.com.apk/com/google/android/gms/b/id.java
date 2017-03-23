package com.google.android.gms.b;

import com.google.android.gms.b.ig.a;

public class id {
    private static final ih<Boolean> b = new ih<Boolean>() {
        public boolean a(Boolean bool) {
            return !bool.booleanValue();
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((Boolean) obj);
        }
    };
    private static final ih<Boolean> c = new ih<Boolean>() {
        public boolean a(Boolean bool) {
            return bool.booleanValue();
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((Boolean) obj);
        }
    };
    private static final ig<Boolean> d = new ig(Boolean.valueOf(true));
    private static final ig<Boolean> e = new ig(Boolean.valueOf(false));
    private final ig<Boolean> a;

    public id() {
        this.a = ig.a();
    }

    private id(ig<Boolean> igVar) {
        this.a = igVar;
    }

    public id a(je jeVar) {
        ig a = this.a.a(jeVar);
        ig igVar = a == null ? new ig((Boolean) this.a.b()) : (a.b() != null || this.a.b() == null) ? a : a.a(gx.a(), (Boolean) this.a.b());
        return new id(igVar);
    }

    public <T> T a(T t, final a<Void, T> aVar) {
        return this.a.a((Object) t, new a<Boolean, T>(this) {
            public T a(gx gxVar, Boolean bool, T t) {
                return !bool.booleanValue() ? aVar.a(gxVar, null, t) : t;
            }
        });
    }

    public boolean a() {
        return this.a.a(c);
    }

    public boolean a(gx gxVar) {
        Boolean bool = (Boolean) this.a.b(gxVar);
        return bool != null && bool.booleanValue();
    }

    public boolean b(gx gxVar) {
        Boolean bool = (Boolean) this.a.b(gxVar);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public id c(gx gxVar) {
        if (this.a.b(gxVar, b) == null) {
            return this.a.b(gxVar, c) != null ? this : new id(this.a.a(gxVar, d));
        } else {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
    }

    public id d(gx gxVar) {
        return this.a.b(gxVar, b) != null ? this : new id(this.a.a(gxVar, e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id)) {
            return false;
        }
        return this.a.equals(((id) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 14).append("{PruneForest:").append(valueOf).append("}").toString();
    }
}
