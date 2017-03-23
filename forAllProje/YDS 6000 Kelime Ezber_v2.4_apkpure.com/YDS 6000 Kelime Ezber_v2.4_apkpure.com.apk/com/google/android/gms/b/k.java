package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.b.ace.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.g;
import java.util.Collections;

public class k implements m {
    private final n a;

    public k(n nVar) {
        this.a = nVar;
    }

    public <A extends c, T extends a<? extends g, A>> T a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void a() {
        this.a.g();
        this.a.g.d = Collections.emptySet();
    }

    public void a(int i) {
    }

    public void a(Bundle bundle) {
    }

    public void a(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, int i) {
    }

    public boolean b() {
        return true;
    }

    public void c() {
        this.a.e();
    }
}
