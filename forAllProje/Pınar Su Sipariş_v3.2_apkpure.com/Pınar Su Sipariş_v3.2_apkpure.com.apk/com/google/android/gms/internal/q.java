package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

final class q {
    final int a;
    final byte[] b;

    q(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    int a() {
        return (zzamc.zzoh(this.a) + 0) + this.b.length;
    }

    void a(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        com_google_android_gms_internal_zzamc.zzog(this.a);
        com_google_android_gms_internal_zzamc.zzR(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && Arrays.equals(this.b, qVar.b);
    }

    public int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
