package com.google.android.gms.b;

import android.support.v4.i.a;
import com.google.android.gms.c.d;
import com.google.android.gms.c.e;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import java.util.Set;

public final class acd {
    private final a<acb<?>, com.google.android.gms.common.a> a = new a();
    private final e<Void> b = new e();
    private int c;
    private boolean d = false;

    public acd(Iterable<n<? extends com.google.android.gms.common.api.a.a>> iterable) {
        for (n a : iterable) {
            this.a.put(a.a(), null);
        }
        this.c = this.a.keySet().size();
    }

    public Set<acb<?>> a() {
        return this.a.keySet();
    }

    public void a(acb<?> com_google_android_gms_b_acb_, com.google.android.gms.common.a aVar) {
        this.a.put(com_google_android_gms_b_acb_, aVar);
        this.c--;
        if (!aVar.b()) {
            this.d = true;
        }
        if (this.c != 0) {
            return;
        }
        if (this.d) {
            this.b.a(new m(this.a));
            return;
        }
        this.b.a(null);
    }

    public d<Void> b() {
        return this.b.a();
    }

    public void c() {
        this.b.a(null);
    }
}
