package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;

class cd {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;

    cd(String str, String str2, long j, long j2, long j3) {
        boolean z = true;
        c.a(str);
        c.a(str2);
        c.b(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        c.b(z);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    cd a() {
        return new cd(this.a, this.b, this.c + 1, this.d + 1, this.e);
    }

    cd a(long j) {
        return new cd(this.a, this.b, this.c, this.d, j);
    }
}
