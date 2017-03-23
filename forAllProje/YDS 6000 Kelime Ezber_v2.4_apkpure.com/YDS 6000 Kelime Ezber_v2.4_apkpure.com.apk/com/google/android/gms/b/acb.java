package com.google.android.gms.b;

import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.internal.b;

public final class acb<O extends a> {
    private final boolean a = true;
    private final int b;
    private final com.google.android.gms.common.api.a<O> c;
    private final O d;

    private acb(com.google.android.gms.common.api.a<O> aVar) {
        this.c = aVar;
        this.d = null;
        this.b = System.identityHashCode(this);
    }

    private acb(com.google.android.gms.common.api.a<O> aVar, O o) {
        this.c = aVar;
        this.d = o;
        this.b = b.a(this.c, this.d);
    }

    public static <O extends a> acb<O> a(com.google.android.gms.common.api.a<O> aVar) {
        return new acb(aVar);
    }

    public static <O extends a> acb<O> a(com.google.android.gms.common.api.a<O> aVar, O o) {
        return new acb(aVar, o);
    }

    public String a() {
        return this.c.d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof acb)) {
            return false;
        }
        acb com_google_android_gms_b_acb = (acb) obj;
        return !this.a && !com_google_android_gms_b_acb.a && b.a(this.c, com_google_android_gms_b_acb.c) && b.a(this.d, com_google_android_gms_b_acb.d);
    }

    public int hashCode() {
        return this.b;
    }
}
