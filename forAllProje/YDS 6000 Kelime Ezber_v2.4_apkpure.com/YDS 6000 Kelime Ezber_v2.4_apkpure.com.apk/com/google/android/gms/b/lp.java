package com.google.android.gms.b;

import java.util.Arrays;

final class lp {
    final int a;
    final byte[] b;

    lp(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    int a() {
        return (lg.f(this.a) + 0) + this.b.length;
    }

    void a(lg lgVar) {
        lgVar.e(this.a);
        lgVar.d(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        return this.a == lpVar.a && Arrays.equals(this.b, lpVar.b);
    }

    public int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
