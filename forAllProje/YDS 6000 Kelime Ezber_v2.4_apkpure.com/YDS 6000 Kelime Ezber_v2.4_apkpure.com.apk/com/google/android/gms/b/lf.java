package com.google.android.gms.b;

public final class lf {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = Integer.MAX_VALUE;
    private int h;
    private int i = 64;
    private int j = 67108864;

    private lf(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
        this.e = i;
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static lf a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static lf a(byte[] bArr, int i, int i2) {
        return new lf(bArr, i, i2);
    }

    private void t() {
        this.c += this.d;
        int i = this.c;
        if (i > this.g) {
            this.d = i - this.g;
            this.c -= this.d;
            return;
        }
        this.d = 0;
    }

    public int a() {
        if (q()) {
            this.f = 0;
            return 0;
        }
        this.f = l();
        if (this.f != 0) {
            return this.f;
        }
        throw lm.d();
    }

    public void a(int i) {
        if (this.f != i) {
            throw lm.e();
        }
    }

    public void a(ln lnVar) {
        int l = l();
        if (this.h >= this.i) {
            throw lm.g();
        }
        l = c(l);
        this.h++;
        lnVar.b(this);
        a(0);
        this.h--;
        d(l);
    }

    public byte[] a(int i, int i2) {
        if (i2 == 0) {
            return lq.h;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.a, this.b + i, obj, 0, i2);
        return obj;
    }

    public void b() {
        int a;
        do {
            a = a();
            if (a == 0) {
                return;
            }
        } while (b(a));
    }

    public boolean b(int i) {
        switch (lq.a(i)) {
            case 0:
                g();
                return true;
            case 1:
                o();
                return true;
            case 2:
                f(l());
                return true;
            case 3:
                b();
                a(lq.a(lq.b(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                n();
                return true;
            default:
                throw lm.f();
        }
    }

    public double c() {
        return Double.longBitsToDouble(o());
    }

    public int c(int i) {
        if (i < 0) {
            throw lm.b();
        }
        int i2 = this.e + i;
        int i3 = this.g;
        if (i2 > i3) {
            throw lm.a();
        }
        this.g = i2;
        t();
        return i3;
    }

    public float d() {
        return Float.intBitsToFloat(n());
    }

    public void d(int i) {
        this.g = i;
        t();
    }

    public long e() {
        return m();
    }

    public void e(int i) {
        if (i > this.e - this.b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.e = this.b + i;
        }
    }

    public long f() {
        return m();
    }

    public void f(int i) {
        if (i < 0) {
            throw lm.b();
        } else if (this.e + i > this.g) {
            f(this.g - this.e);
            throw lm.a();
        } else if (i <= this.c - this.e) {
            this.e += i;
        } else {
            throw lm.a();
        }
    }

    public int g() {
        return l();
    }

    public boolean h() {
        return l() != 0;
    }

    public String i() {
        int l = l();
        if (l < 0) {
            throw lm.b();
        } else if (l > this.c - this.e) {
            throw lm.a();
        } else {
            String str = new String(this.a, this.e, l, ll.a);
            this.e = l + this.e;
            return str;
        }
    }

    public byte[] j() {
        int l = l();
        if (l < 0) {
            throw lm.b();
        } else if (l == 0) {
            return lq.h;
        } else {
            if (l > this.c - this.e) {
                throw lm.a();
            }
            Object obj = new byte[l];
            System.arraycopy(this.a, this.e, obj, 0, l);
            this.e = l + this.e;
            return obj;
        }
    }

    public long k() {
        return a(m());
    }

    public int l() {
        byte s = s();
        if (s >= (byte) 0) {
            return s;
        }
        int i = s & 127;
        byte s2 = s();
        if (s2 >= (byte) 0) {
            return i | (s2 << 7);
        }
        i |= (s2 & 127) << 7;
        s2 = s();
        if (s2 >= (byte) 0) {
            return i | (s2 << 14);
        }
        i |= (s2 & 127) << 14;
        s2 = s();
        if (s2 >= (byte) 0) {
            return i | (s2 << 21);
        }
        i |= (s2 & 127) << 21;
        s2 = s();
        i |= s2 << 28;
        if (s2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (s() >= (byte) 0) {
                return i;
            }
        }
        throw lm.c();
    }

    public long m() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte s = s();
            j |= ((long) (s & 127)) << i;
            if ((s & 128) == 0) {
                return j;
            }
        }
        throw lm.c();
    }

    public int n() {
        return (((s() & 255) | ((s() & 255) << 8)) | ((s() & 255) << 16)) | ((s() & 255) << 24);
    }

    public long o() {
        byte s = s();
        byte s2 = s();
        return ((((((((((long) s2) & 255) << 8) | (((long) s) & 255)) | ((((long) s()) & 255) << 16)) | ((((long) s()) & 255) << 24)) | ((((long) s()) & 255) << 32)) | ((((long) s()) & 255) << 40)) | ((((long) s()) & 255) << 48)) | ((((long) s()) & 255) << 56);
    }

    public int p() {
        if (this.g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.g - this.e;
    }

    public boolean q() {
        return this.e == this.c;
    }

    public int r() {
        return this.e - this.b;
    }

    public byte s() {
        if (this.e == this.c) {
            throw lm.a();
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }
}
