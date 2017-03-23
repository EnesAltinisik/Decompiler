package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.d.b;
import com.google.android.gms.b.nn;
import com.google.android.gms.b.ow;

public final class g {
    private final ow a;

    public g(Context context) {
        this.a = new ow(context);
    }

    public void a(a aVar) {
        this.a.a(aVar);
        if (aVar != null && (aVar instanceof nn)) {
            this.a.a((nn) aVar);
        } else if (aVar == null) {
            this.a.a(null);
        }
    }

    public void a(c cVar) {
        this.a.a(cVar.a());
    }

    public void a(b bVar) {
        this.a.a(bVar);
    }

    public void a(String str) {
        this.a.a(str);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public boolean a() {
        return this.a.a();
    }

    public void b() {
        this.a.b();
    }
}
