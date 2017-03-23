package com.google.android.gms.b;

import java.util.Arrays;

public interface lr {

    public static final class a extends lh<a> implements Cloneable {
        public int a;
        public String b;
        public String c;

        public a() {
            a();
        }

        public a a() {
            this.a = 0;
            this.b = "";
            this.c = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public a a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = lfVar.g();
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 26:
                        this.c = lfVar.i();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != 0) {
                lgVar.a(1, this.a);
            }
            if (!(this.b == null || this.b.equals(""))) {
                lgVar.a(2, this.b);
            }
            if (!(this.c == null || this.c.equals(""))) {
                lgVar.a(3, this.c);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != 0) {
                b += lg.b(1, this.a);
            }
            if (!(this.b == null || this.b.equals(""))) {
                b += lg.b(2, this.b);
            }
            return (this.c == null || this.c.equals("")) ? b : b + lg.b(3, this.c);
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public /* synthetic */ lh c() {
            return (a) d();
        }

        public /* synthetic */ Object clone() {
            return g();
        }

        public /* synthetic */ ln d() {
            return (a) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a) {
                return false;
            }
            if (this.b == null) {
                if (aVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(aVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (aVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(aVar.c)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag);
        }

        public a g() {
            try {
                return (a) super.c();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class b extends lh<b> implements Cloneable {
        public byte[] a;
        public String b;
        public byte[][] c;
        public boolean d;

        public b() {
            a();
        }

        public b a() {
            this.a = lq.h;
            this.b = "";
            this.c = lq.g;
            this.d = false;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public b a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = lfVar.j();
                        continue;
                    case 18:
                        int b = lq.b(lfVar, 18);
                        a = this.c == null ? 0 : this.c.length;
                        Object obj = new byte[(b + a)][];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.j();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.j();
                        this.c = obj;
                        continue;
                    case 24:
                        this.d = lfVar.h();
                        continue;
                    case 34:
                        this.b = lfVar.i();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (!Arrays.equals(this.a, lq.h)) {
                lgVar.a(1, this.a);
            }
            if (this.c != null && this.c.length > 0) {
                for (byte[] bArr : this.c) {
                    if (bArr != null) {
                        lgVar.a(2, bArr);
                    }
                }
            }
            if (this.d) {
                lgVar.a(3, this.d);
            }
            if (!(this.b == null || this.b.equals(""))) {
                lgVar.a(4, this.b);
            }
            super.a(lgVar);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (!Arrays.equals(this.a, lq.h)) {
                b += lg.b(1, this.a);
            }
            if (this.c != null && this.c.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i < this.c.length) {
                    byte[] bArr = this.c[i];
                    if (bArr != null) {
                        i3++;
                        i2 += lg.c(bArr);
                    }
                    i++;
                }
                b = (b + i2) + (i3 * 1);
            }
            if (this.d) {
                b += lg.b(3, this.d);
            }
            return (this.b == null || this.b.equals("")) ? b : b + lg.b(4, this.b);
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public /* synthetic */ lh c() {
            return (b) d();
        }

        public /* synthetic */ Object clone() {
            return g();
        }

        public /* synthetic */ ln d() {
            return (b) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Arrays.equals(this.a, bVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (bVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(bVar.b)) {
                return false;
            }
            return (ll.a(this.c, bVar.c) && this.d == bVar.d) ? (this.ag == null || this.ag.b()) ? bVar.ag == null || bVar.ag.b() : this.ag.equals(bVar.ag) : false;
        }

        public b g() {
            try {
                b bVar = (b) super.c();
                if (this.c != null && this.c.length > 0) {
                    bVar.c = (byte[][]) this.c.clone();
                }
                return bVar;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d ? 1231 : 1237) + (((((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.a)) * 31)) * 31) + ll.a(this.c)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends lh<c> implements Cloneable {
        public long a;
        public long b;
        public long c;
        public String d;
        public int e;
        public int f;
        public boolean g;
        public d[] h;
        public byte[] i;
        public a j;
        public byte[] k;
        public String l;
        public String m;
        public String n;
        public long o;
        public b p;
        public byte[] q;
        public String r;
        public int s;
        public int[] t;
        public long u;
        public e v;

        public c() {
            a();
        }

        public c a() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = "";
            this.e = 0;
            this.f = 0;
            this.g = false;
            this.h = d.a();
            this.i = lq.h;
            this.j = null;
            this.k = lq.h;
            this.l = "";
            this.m = "";
            this.n = "";
            this.o = 180000;
            this.p = null;
            this.q = lq.h;
            this.r = "";
            this.s = 0;
            this.t = lq.a;
            this.u = 0;
            this.v = null;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public c a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = lfVar.f();
                        continue;
                    case 18:
                        this.d = lfVar.i();
                        continue;
                    case 26:
                        b = lq.b(lfVar, 26);
                        a = this.h == null ? 0 : this.h.length;
                        obj = new d[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.h, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new d();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new d();
                        lfVar.a(obj[a]);
                        this.h = obj;
                        continue;
                    case 34:
                        this.i = lfVar.j();
                        continue;
                    case 50:
                        this.k = lfVar.j();
                        continue;
                    case 66:
                        this.l = lfVar.i();
                        continue;
                    case 74:
                        if (this.j == null) {
                            this.j = new a();
                        }
                        lfVar.a(this.j);
                        continue;
                    case 80:
                        this.g = lfVar.h();
                        continue;
                    case 88:
                        this.e = lfVar.g();
                        continue;
                    case 96:
                        this.f = lfVar.g();
                        continue;
                    case 106:
                        this.m = lfVar.i();
                        continue;
                    case 114:
                        this.n = lfVar.i();
                        continue;
                    case 120:
                        this.o = lfVar.k();
                        continue;
                    case 130:
                        if (this.p == null) {
                            this.p = new b();
                        }
                        lfVar.a(this.p);
                        continue;
                    case 136:
                        this.b = lfVar.f();
                        continue;
                    case 146:
                        this.q = lfVar.j();
                        continue;
                    case 152:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                                this.s = a;
                                break;
                            default:
                                continue;
                        }
                    case 160:
                        b = lq.b(lfVar, 160);
                        a = this.t == null ? 0 : this.t.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.t, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.g();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.g();
                        this.t = obj;
                        continue;
                    case 162:
                        int c = lfVar.c(lfVar.l());
                        b = lfVar.r();
                        a = 0;
                        while (lfVar.p() > 0) {
                            lfVar.g();
                            a++;
                        }
                        lfVar.e(b);
                        b = this.t == null ? 0 : this.t.length;
                        Object obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.t, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = lfVar.g();
                            b++;
                        }
                        this.t = obj2;
                        lfVar.d(c);
                        continue;
                    case 168:
                        this.c = lfVar.f();
                        continue;
                    case 176:
                        this.u = lfVar.f();
                        continue;
                    case 186:
                        if (this.v == null) {
                            this.v = new e();
                        }
                        lfVar.a(this.v);
                        continue;
                    case 194:
                        this.r = lfVar.i();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            int i = 0;
            if (this.a != 0) {
                lgVar.b(1, this.a);
            }
            if (!(this.d == null || this.d.equals(""))) {
                lgVar.a(2, this.d);
            }
            if (this.h != null && this.h.length > 0) {
                for (ln lnVar : this.h) {
                    if (lnVar != null) {
                        lgVar.a(3, lnVar);
                    }
                }
            }
            if (!Arrays.equals(this.i, lq.h)) {
                lgVar.a(4, this.i);
            }
            if (!Arrays.equals(this.k, lq.h)) {
                lgVar.a(6, this.k);
            }
            if (!(this.l == null || this.l.equals(""))) {
                lgVar.a(8, this.l);
            }
            if (this.j != null) {
                lgVar.a(9, this.j);
            }
            if (this.g) {
                lgVar.a(10, this.g);
            }
            if (this.e != 0) {
                lgVar.a(11, this.e);
            }
            if (this.f != 0) {
                lgVar.a(12, this.f);
            }
            if (!(this.m == null || this.m.equals(""))) {
                lgVar.a(13, this.m);
            }
            if (!(this.n == null || this.n.equals(""))) {
                lgVar.a(14, this.n);
            }
            if (this.o != 180000) {
                lgVar.c(15, this.o);
            }
            if (this.p != null) {
                lgVar.a(16, this.p);
            }
            if (this.b != 0) {
                lgVar.b(17, this.b);
            }
            if (!Arrays.equals(this.q, lq.h)) {
                lgVar.a(18, this.q);
            }
            if (this.s != 0) {
                lgVar.a(19, this.s);
            }
            if (this.t != null && this.t.length > 0) {
                while (i < this.t.length) {
                    lgVar.a(20, this.t[i]);
                    i++;
                }
            }
            if (this.c != 0) {
                lgVar.b(21, this.c);
            }
            if (this.u != 0) {
                lgVar.b(22, this.u);
            }
            if (this.v != null) {
                lgVar.a(23, this.v);
            }
            if (!(this.r == null || this.r.equals(""))) {
                lgVar.a(24, this.r);
            }
            super.a(lgVar);
        }

        protected int b() {
            int i;
            int i2 = 0;
            int b = super.b();
            if (this.a != 0) {
                b += lg.e(1, this.a);
            }
            if (!(this.d == null || this.d.equals(""))) {
                b += lg.b(2, this.d);
            }
            if (this.h != null && this.h.length > 0) {
                i = b;
                for (ln lnVar : this.h) {
                    if (lnVar != null) {
                        i += lg.c(3, lnVar);
                    }
                }
                b = i;
            }
            if (!Arrays.equals(this.i, lq.h)) {
                b += lg.b(4, this.i);
            }
            if (!Arrays.equals(this.k, lq.h)) {
                b += lg.b(6, this.k);
            }
            if (!(this.l == null || this.l.equals(""))) {
                b += lg.b(8, this.l);
            }
            if (this.j != null) {
                b += lg.c(9, this.j);
            }
            if (this.g) {
                b += lg.b(10, this.g);
            }
            if (this.e != 0) {
                b += lg.b(11, this.e);
            }
            if (this.f != 0) {
                b += lg.b(12, this.f);
            }
            if (!(this.m == null || this.m.equals(""))) {
                b += lg.b(13, this.m);
            }
            if (!(this.n == null || this.n.equals(""))) {
                b += lg.b(14, this.n);
            }
            if (this.o != 180000) {
                b += lg.f(15, this.o);
            }
            if (this.p != null) {
                b += lg.c(16, this.p);
            }
            if (this.b != 0) {
                b += lg.e(17, this.b);
            }
            if (!Arrays.equals(this.q, lq.h)) {
                b += lg.b(18, this.q);
            }
            if (this.s != 0) {
                b += lg.b(19, this.s);
            }
            if (this.t != null && this.t.length > 0) {
                i = 0;
                while (i2 < this.t.length) {
                    i += lg.b(this.t[i2]);
                    i2++;
                }
                b = (b + i) + (this.t.length * 2);
            }
            if (this.c != 0) {
                b += lg.e(21, this.c);
            }
            if (this.u != 0) {
                b += lg.e(22, this.u);
            }
            if (this.v != null) {
                b += lg.c(23, this.v);
            }
            return (this.r == null || this.r.equals("")) ? b : b + lg.b(24, this.r);
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public /* synthetic */ lh c() {
            return (c) d();
        }

        public /* synthetic */ Object clone() {
            return g();
        }

        public /* synthetic */ ln d() {
            return (c) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a != cVar.a || this.b != cVar.b || this.c != cVar.c) {
                return false;
            }
            if (this.d == null) {
                if (cVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(cVar.d)) {
                return false;
            }
            if (this.e != cVar.e || this.f != cVar.f || this.g != cVar.g || !ll.a(this.h, cVar.h) || !Arrays.equals(this.i, cVar.i)) {
                return false;
            }
            if (this.j == null) {
                if (cVar.j != null) {
                    return false;
                }
            } else if (!this.j.equals(cVar.j)) {
                return false;
            }
            if (!Arrays.equals(this.k, cVar.k)) {
                return false;
            }
            if (this.l == null) {
                if (cVar.l != null) {
                    return false;
                }
            } else if (!this.l.equals(cVar.l)) {
                return false;
            }
            if (this.m == null) {
                if (cVar.m != null) {
                    return false;
                }
            } else if (!this.m.equals(cVar.m)) {
                return false;
            }
            if (this.n == null) {
                if (cVar.n != null) {
                    return false;
                }
            } else if (!this.n.equals(cVar.n)) {
                return false;
            }
            if (this.o != cVar.o) {
                return false;
            }
            if (this.p == null) {
                if (cVar.p != null) {
                    return false;
                }
            } else if (!this.p.equals(cVar.p)) {
                return false;
            }
            if (!Arrays.equals(this.q, cVar.q)) {
                return false;
            }
            if (this.r == null) {
                if (cVar.r != null) {
                    return false;
                }
            } else if (!this.r.equals(cVar.r)) {
                return false;
            }
            if (this.s != cVar.s || !ll.a(this.t, cVar.t) || this.u != cVar.u) {
                return false;
            }
            if (this.v == null) {
                if (cVar.v != null) {
                    return false;
                }
            } else if (!this.v.equals(cVar.v)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? cVar.ag == null || cVar.ag.b() : this.ag.equals(cVar.ag);
        }

        public c g() {
            try {
                c cVar = (c) super.c();
                if (this.h != null && this.h.length > 0) {
                    cVar.h = new d[this.h.length];
                    for (int i = 0; i < this.h.length; i++) {
                        if (this.h[i] != null) {
                            cVar.h[i] = (d) this.h[i].d();
                        }
                    }
                }
                if (this.j != null) {
                    cVar.j = (a) this.j.d();
                }
                if (this.p != null) {
                    cVar.p = (b) this.p.d();
                }
                if (this.t != null && this.t.length > 0) {
                    cVar.t = (int[]) this.t.clone();
                }
                if (this.v != null) {
                    cVar.v = (e) this.v.d();
                }
                return cVar;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.v == null ? 0 : this.v.hashCode()) + (((((((((this.r == null ? 0 : this.r.hashCode()) + (((((this.p == null ? 0 : this.p.hashCode()) + (((((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((((this.j == null ? 0 : this.j.hashCode()) + (((((((this.g ? 1231 : 1237) + (((((((this.d == null ? 0 : this.d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31) + ll.a(this.h)) * 31) + Arrays.hashCode(this.i)) * 31)) * 31) + Arrays.hashCode(this.k)) * 31)) * 31)) * 31)) * 31) + ((int) (this.o ^ (this.o >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.q)) * 31)) * 31) + this.s) * 31) + ll.a(this.t)) * 31) + ((int) (this.u ^ (this.u >>> 32)))) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends lh<d> implements Cloneable {
        private static volatile d[] c;
        public String a;
        public String b;

        public d() {
            g();
        }

        public static d[] a() {
            if (c == null) {
                synchronized (ll.c) {
                    if (c == null) {
                        c = new d[0];
                    }
                }
            }
            return c;
        }

        public d a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = lfVar.i();
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (!(this.a == null || this.a.equals(""))) {
                lgVar.a(1, this.a);
            }
            if (!(this.b == null || this.b.equals(""))) {
                lgVar.a(2, this.b);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (!(this.a == null || this.a.equals(""))) {
                b += lg.b(1, this.a);
            }
            return (this.b == null || this.b.equals("")) ? b : b + lg.b(2, this.b);
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public /* synthetic */ lh c() {
            return (d) d();
        }

        public /* synthetic */ Object clone() {
            return h();
        }

        public /* synthetic */ ln d() {
            return (d) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == null) {
                if (dVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(dVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (dVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(dVar.b)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? dVar.ag == null || dVar.ag.b() : this.ag.equals(dVar.ag);
        }

        public d g() {
            this.a = "";
            this.b = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public d h() {
            try {
                return (d) super.c();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class e extends lh<e> implements Cloneable {
        public int a;
        public int b;

        public e() {
            a();
        }

        public e a() {
            this.a = -1;
            this.b = 0;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public e a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = lfVar.g();
                        switch (a) {
                            case -1:
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        a = lfVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 100:
                                this.b = a;
                                break;
                            default:
                                continue;
                        }
                    default:
                        if (!super.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != -1) {
                lgVar.a(1, this.a);
            }
            if (this.b != 0) {
                lgVar.a(2, this.b);
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != -1) {
                b += lg.b(1, this.a);
            }
            return this.b != 0 ? b + lg.b(2, this.b) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public /* synthetic */ lh c() {
            return (e) d();
        }

        public /* synthetic */ Object clone() {
            return g();
        }

        public /* synthetic */ ln d() {
            return (e) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return (this.a == eVar.a && this.b == eVar.b) ? (this.ag == null || this.ag.b()) ? eVar.ag == null || eVar.ag.b() : this.ag.equals(eVar.ag) : false;
        }

        public e g() {
            try {
                return (e) super.c();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + this.b) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }
}
