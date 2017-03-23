package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzaa;

class h {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;

    h(String str, String str2, long j, long j2, long j3) {
        boolean z = true;
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        zzaa.zzaj(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        zzaa.zzaj(z);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    h a() {
        return new h(this.a, this.b, this.c + 1, this.d + 1, this.e);
    }

    h a(long j) {
        return new h(this.a, this.b, this.c, this.d, j);
    }
}
