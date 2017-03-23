package com.google.android.gms.ads.b;

import com.google.android.gms.ads.k;
import com.google.android.gms.b.vz;

@vz
public final class b {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final int d;
    private final k e;

    public static final class a {
        private boolean a = false;
        private int b = 0;
        private boolean c = false;
        private k d;
        private int e = 1;

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a a(k kVar) {
            this.d = kVar;
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public b a() {
            return new b();
        }

        public a b(int i) {
            this.e = i;
            return this;
        }

        public a b(boolean z) {
            this.c = z;
            return this;
        }
    }

    private b(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.e;
        this.e = aVar.d;
    }

    public boolean a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public k e() {
        return this.e;
    }
}
