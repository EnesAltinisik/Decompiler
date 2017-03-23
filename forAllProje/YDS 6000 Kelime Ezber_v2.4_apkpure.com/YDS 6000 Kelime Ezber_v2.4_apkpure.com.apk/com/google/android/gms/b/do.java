package com.google.android.gms.b;

public interface do {

    public static final class a extends ln {
        private static volatile a[] e;
        public Integer a;
        public f b;
        public f c;
        public Boolean d;

        public a() {
            c();
        }

        public static a[] a() {
            if (e == null) {
                synchronized (ll.c) {
                    if (e == null) {
                        e = new a[0];
                    }
                }
            }
            return e;
        }

        public a a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(lfVar.g());
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new f();
                        }
                        lfVar.a(this.b);
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new f();
                        }
                        lfVar.a(this.c);
                        continue;
                    case 32:
                        this.d = Boolean.valueOf(lfVar.h());
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c);
            }
            if (this.d != null) {
                lgVar.a(4, this.d.booleanValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null) {
                b += lg.c(2, this.b);
            }
            if (this.c != null) {
                b += lg.c(3, this.c);
            }
            return this.d != null ? b + lg.b(4, this.d.booleanValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public a c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == null) {
                if (aVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(aVar.a)) {
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
            return this.d == null ? aVar.d == null : this.d.equals(aVar.d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.d != null) {
                i = this.d.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class b extends ln {
        private static volatile b[] f;
        public c[] a;
        public String b;
        public Long c;
        public Long d;
        public Integer e;

        public b() {
            c();
        }

        public static b[] a() {
            if (f == null) {
                synchronized (ll.c) {
                    if (f == null) {
                        f = new b[0];
                    }
                }
            }
            return f;
        }

        public b a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = lq.b(lfVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new c[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new c();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new c();
                        lfVar.a(obj[a]);
                        this.a = obj;
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 24:
                        this.c = Long.valueOf(lfVar.f());
                        continue;
                    case 32:
                        this.d = Long.valueOf(lfVar.f());
                        continue;
                    case 40:
                        this.e = Integer.valueOf(lfVar.g());
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null && this.a.length > 0) {
                for (ln lnVar : this.a) {
                    if (lnVar != null) {
                        lgVar.a(1, lnVar);
                    }
                }
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.b(3, this.c.longValue());
            }
            if (this.d != null) {
                lgVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                lgVar.a(5, this.e.intValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null && this.a.length > 0) {
                for (ln lnVar : this.a) {
                    if (lnVar != null) {
                        b += lg.c(1, lnVar);
                    }
                }
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.e(3, this.c.longValue());
            }
            if (this.d != null) {
                b += lg.e(4, this.d.longValue());
            }
            return this.e != null ? b + lg.b(5, this.e.intValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public b c() {
            this.a = c.a();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!ll.a(this.a, bVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (bVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(bVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (bVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(bVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (bVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(bVar.d)) {
                return false;
            }
            return this.e == null ? bVar.e == null : this.e.equals(bVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ll.a(this.a)) * 31)) * 31)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends ln {
        private static volatile c[] f;
        public String a;
        public String b;
        public Long c;
        public Float d;
        public Double e;

        public c() {
            c();
        }

        public static c[] a() {
            if (f == null) {
                synchronized (ll.c) {
                    if (f == null) {
                        f = new c[0];
                    }
                }
            }
            return f;
        }

        public c a(lf lfVar) {
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
                    case 24:
                        this.c = Long.valueOf(lfVar.f());
                        continue;
                    case 37:
                        this.d = Float.valueOf(lfVar.d());
                        continue;
                    case 41:
                        this.e = Double.valueOf(lfVar.c());
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.a(1, this.a);
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.b(3, this.c.longValue());
            }
            if (this.d != null) {
                lgVar.a(4, this.d.floatValue());
            }
            if (this.e != null) {
                lgVar.a(5, this.e.doubleValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a);
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.e(3, this.c.longValue());
            }
            if (this.d != null) {
                b += lg.b(4, this.d.floatValue());
            }
            return this.e != null ? b + lg.b(5, this.e.doubleValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public c c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == null) {
                if (cVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(cVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (cVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(cVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (cVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(cVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (cVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(cVar.d)) {
                return false;
            }
            return this.e == null ? cVar.e == null : this.e.equals(cVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends ln {
        public e[] a;

        public d() {
            a();
        }

        public d a() {
            this.a = e.a();
            this.ah = -1;
            return this;
        }

        public d a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = lq.b(lfVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new e[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new e();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new e();
                        lfVar.a(obj[a]);
                        this.a = obj;
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null && this.a.length > 0) {
                for (ln lnVar : this.a) {
                    if (lnVar != null) {
                        lgVar.a(1, lnVar);
                    }
                }
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null && this.a.length > 0) {
                for (ln lnVar : this.a) {
                    if (lnVar != null) {
                        b += lg.c(1, lnVar);
                    }
                }
            }
            return b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ll.a(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return ((getClass().getName().hashCode() + 527) * 31) + ll.a(this.a);
        }
    }

    public static final class e extends ln {
        private static volatile e[] H;
        public a[] A;
        public String B;
        public Integer C;
        public Integer D;
        public Integer E;
        public String F;
        public Long G;
        public Integer a;
        public b[] b;
        public g[] c;
        public Long d;
        public Long e;
        public Long f;
        public Long g;
        public Long h;
        public String i;
        public String j;
        public String k;
        public String l;
        public Integer m;
        public String n;
        public String o;
        public String p;
        public Long q;
        public Long r;
        public String s;
        public Boolean t;
        public String u;
        public Long v;
        public Integer w;
        public String x;
        public String y;
        public Boolean z;

        public e() {
            c();
        }

        public static e[] a() {
            if (H == null) {
                synchronized (ll.c) {
                    if (H == null) {
                        H = new e[0];
                    }
                }
            }
            return H;
        }

        public e a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(lfVar.g());
                        continue;
                    case 18:
                        b = lq.b(lfVar, 18);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        lfVar.a(obj[a]);
                        this.b = obj;
                        continue;
                    case 26:
                        b = lq.b(lfVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new g[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new g();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new g();
                        lfVar.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 32:
                        this.d = Long.valueOf(lfVar.f());
                        continue;
                    case 40:
                        this.e = Long.valueOf(lfVar.f());
                        continue;
                    case 48:
                        this.f = Long.valueOf(lfVar.f());
                        continue;
                    case 56:
                        this.h = Long.valueOf(lfVar.f());
                        continue;
                    case 66:
                        this.i = lfVar.i();
                        continue;
                    case 74:
                        this.j = lfVar.i();
                        continue;
                    case 82:
                        this.k = lfVar.i();
                        continue;
                    case 90:
                        this.l = lfVar.i();
                        continue;
                    case 96:
                        this.m = Integer.valueOf(lfVar.g());
                        continue;
                    case 106:
                        this.n = lfVar.i();
                        continue;
                    case 114:
                        this.o = lfVar.i();
                        continue;
                    case 130:
                        this.p = lfVar.i();
                        continue;
                    case 136:
                        this.q = Long.valueOf(lfVar.f());
                        continue;
                    case 144:
                        this.r = Long.valueOf(lfVar.f());
                        continue;
                    case 154:
                        this.s = lfVar.i();
                        continue;
                    case 160:
                        this.t = Boolean.valueOf(lfVar.h());
                        continue;
                    case 170:
                        this.u = lfVar.i();
                        continue;
                    case 176:
                        this.v = Long.valueOf(lfVar.f());
                        continue;
                    case 184:
                        this.w = Integer.valueOf(lfVar.g());
                        continue;
                    case 194:
                        this.x = lfVar.i();
                        continue;
                    case 202:
                        this.y = lfVar.i();
                        continue;
                    case 208:
                        this.g = Long.valueOf(lfVar.f());
                        continue;
                    case 224:
                        this.z = Boolean.valueOf(lfVar.h());
                        continue;
                    case 234:
                        b = lq.b(lfVar, 234);
                        a = this.A == null ? 0 : this.A.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.A, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            lfVar.a(obj[a]);
                            lfVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        lfVar.a(obj[a]);
                        this.A = obj;
                        continue;
                    case 242:
                        this.B = lfVar.i();
                        continue;
                    case 248:
                        this.C = Integer.valueOf(lfVar.g());
                        continue;
                    case 256:
                        this.D = Integer.valueOf(lfVar.g());
                        continue;
                    case 264:
                        this.E = Integer.valueOf(lfVar.g());
                        continue;
                    case 274:
                        this.F = lfVar.i();
                        continue;
                    case 280:
                        this.G = Long.valueOf(lfVar.f());
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            int i = 0;
            if (this.a != null) {
                lgVar.a(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                for (ln lnVar : this.b) {
                    if (lnVar != null) {
                        lgVar.a(2, lnVar);
                    }
                }
            }
            if (this.c != null && this.c.length > 0) {
                for (ln lnVar2 : this.c) {
                    if (lnVar2 != null) {
                        lgVar.a(3, lnVar2);
                    }
                }
            }
            if (this.d != null) {
                lgVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                lgVar.b(5, this.e.longValue());
            }
            if (this.f != null) {
                lgVar.b(6, this.f.longValue());
            }
            if (this.h != null) {
                lgVar.b(7, this.h.longValue());
            }
            if (this.i != null) {
                lgVar.a(8, this.i);
            }
            if (this.j != null) {
                lgVar.a(9, this.j);
            }
            if (this.k != null) {
                lgVar.a(10, this.k);
            }
            if (this.l != null) {
                lgVar.a(11, this.l);
            }
            if (this.m != null) {
                lgVar.a(12, this.m.intValue());
            }
            if (this.n != null) {
                lgVar.a(13, this.n);
            }
            if (this.o != null) {
                lgVar.a(14, this.o);
            }
            if (this.p != null) {
                lgVar.a(16, this.p);
            }
            if (this.q != null) {
                lgVar.b(17, this.q.longValue());
            }
            if (this.r != null) {
                lgVar.b(18, this.r.longValue());
            }
            if (this.s != null) {
                lgVar.a(19, this.s);
            }
            if (this.t != null) {
                lgVar.a(20, this.t.booleanValue());
            }
            if (this.u != null) {
                lgVar.a(21, this.u);
            }
            if (this.v != null) {
                lgVar.b(22, this.v.longValue());
            }
            if (this.w != null) {
                lgVar.a(23, this.w.intValue());
            }
            if (this.x != null) {
                lgVar.a(24, this.x);
            }
            if (this.y != null) {
                lgVar.a(25, this.y);
            }
            if (this.g != null) {
                lgVar.b(26, this.g.longValue());
            }
            if (this.z != null) {
                lgVar.a(28, this.z.booleanValue());
            }
            if (this.A != null && this.A.length > 0) {
                while (i < this.A.length) {
                    ln lnVar3 = this.A[i];
                    if (lnVar3 != null) {
                        lgVar.a(29, lnVar3);
                    }
                    i++;
                }
            }
            if (this.B != null) {
                lgVar.a(30, this.B);
            }
            if (this.C != null) {
                lgVar.a(31, this.C.intValue());
            }
            if (this.D != null) {
                lgVar.a(32, this.D.intValue());
            }
            if (this.E != null) {
                lgVar.a(33, this.E.intValue());
            }
            if (this.F != null) {
                lgVar.a(34, this.F);
            }
            if (this.G != null) {
                lgVar.b(35, this.G.longValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int i;
            int i2 = 0;
            int b = super.b();
            if (this.a != null) {
                b += lg.b(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                i = b;
                for (ln lnVar : this.b) {
                    if (lnVar != null) {
                        i += lg.c(2, lnVar);
                    }
                }
                b = i;
            }
            if (this.c != null && this.c.length > 0) {
                i = b;
                for (ln lnVar2 : this.c) {
                    if (lnVar2 != null) {
                        i += lg.c(3, lnVar2);
                    }
                }
                b = i;
            }
            if (this.d != null) {
                b += lg.e(4, this.d.longValue());
            }
            if (this.e != null) {
                b += lg.e(5, this.e.longValue());
            }
            if (this.f != null) {
                b += lg.e(6, this.f.longValue());
            }
            if (this.h != null) {
                b += lg.e(7, this.h.longValue());
            }
            if (this.i != null) {
                b += lg.b(8, this.i);
            }
            if (this.j != null) {
                b += lg.b(9, this.j);
            }
            if (this.k != null) {
                b += lg.b(10, this.k);
            }
            if (this.l != null) {
                b += lg.b(11, this.l);
            }
            if (this.m != null) {
                b += lg.b(12, this.m.intValue());
            }
            if (this.n != null) {
                b += lg.b(13, this.n);
            }
            if (this.o != null) {
                b += lg.b(14, this.o);
            }
            if (this.p != null) {
                b += lg.b(16, this.p);
            }
            if (this.q != null) {
                b += lg.e(17, this.q.longValue());
            }
            if (this.r != null) {
                b += lg.e(18, this.r.longValue());
            }
            if (this.s != null) {
                b += lg.b(19, this.s);
            }
            if (this.t != null) {
                b += lg.b(20, this.t.booleanValue());
            }
            if (this.u != null) {
                b += lg.b(21, this.u);
            }
            if (this.v != null) {
                b += lg.e(22, this.v.longValue());
            }
            if (this.w != null) {
                b += lg.b(23, this.w.intValue());
            }
            if (this.x != null) {
                b += lg.b(24, this.x);
            }
            if (this.y != null) {
                b += lg.b(25, this.y);
            }
            if (this.g != null) {
                b += lg.e(26, this.g.longValue());
            }
            if (this.z != null) {
                b += lg.b(28, this.z.booleanValue());
            }
            if (this.A != null && this.A.length > 0) {
                while (i2 < this.A.length) {
                    ln lnVar3 = this.A[i2];
                    if (lnVar3 != null) {
                        b += lg.c(29, lnVar3);
                    }
                    i2++;
                }
            }
            if (this.B != null) {
                b += lg.b(30, this.B);
            }
            if (this.C != null) {
                b += lg.b(31, this.C.intValue());
            }
            if (this.D != null) {
                b += lg.b(32, this.D.intValue());
            }
            if (this.E != null) {
                b += lg.b(33, this.E.intValue());
            }
            if (this.F != null) {
                b += lg.b(34, this.F);
            }
            return this.G != null ? b + lg.e(35, this.G.longValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public e c() {
            this.a = null;
            this.b = b.a();
            this.c = g.a();
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = a.a();
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a == null) {
                if (eVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(eVar.a)) {
                return false;
            }
            if (!ll.a(this.b, eVar.b)) {
                return false;
            }
            if (!ll.a(this.c, eVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (eVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(eVar.d)) {
                return false;
            }
            if (this.e == null) {
                if (eVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(eVar.e)) {
                return false;
            }
            if (this.f == null) {
                if (eVar.f != null) {
                    return false;
                }
            } else if (!this.f.equals(eVar.f)) {
                return false;
            }
            if (this.g == null) {
                if (eVar.g != null) {
                    return false;
                }
            } else if (!this.g.equals(eVar.g)) {
                return false;
            }
            if (this.h == null) {
                if (eVar.h != null) {
                    return false;
                }
            } else if (!this.h.equals(eVar.h)) {
                return false;
            }
            if (this.i == null) {
                if (eVar.i != null) {
                    return false;
                }
            } else if (!this.i.equals(eVar.i)) {
                return false;
            }
            if (this.j == null) {
                if (eVar.j != null) {
                    return false;
                }
            } else if (!this.j.equals(eVar.j)) {
                return false;
            }
            if (this.k == null) {
                if (eVar.k != null) {
                    return false;
                }
            } else if (!this.k.equals(eVar.k)) {
                return false;
            }
            if (this.l == null) {
                if (eVar.l != null) {
                    return false;
                }
            } else if (!this.l.equals(eVar.l)) {
                return false;
            }
            if (this.m == null) {
                if (eVar.m != null) {
                    return false;
                }
            } else if (!this.m.equals(eVar.m)) {
                return false;
            }
            if (this.n == null) {
                if (eVar.n != null) {
                    return false;
                }
            } else if (!this.n.equals(eVar.n)) {
                return false;
            }
            if (this.o == null) {
                if (eVar.o != null) {
                    return false;
                }
            } else if (!this.o.equals(eVar.o)) {
                return false;
            }
            if (this.p == null) {
                if (eVar.p != null) {
                    return false;
                }
            } else if (!this.p.equals(eVar.p)) {
                return false;
            }
            if (this.q == null) {
                if (eVar.q != null) {
                    return false;
                }
            } else if (!this.q.equals(eVar.q)) {
                return false;
            }
            if (this.r == null) {
                if (eVar.r != null) {
                    return false;
                }
            } else if (!this.r.equals(eVar.r)) {
                return false;
            }
            if (this.s == null) {
                if (eVar.s != null) {
                    return false;
                }
            } else if (!this.s.equals(eVar.s)) {
                return false;
            }
            if (this.t == null) {
                if (eVar.t != null) {
                    return false;
                }
            } else if (!this.t.equals(eVar.t)) {
                return false;
            }
            if (this.u == null) {
                if (eVar.u != null) {
                    return false;
                }
            } else if (!this.u.equals(eVar.u)) {
                return false;
            }
            if (this.v == null) {
                if (eVar.v != null) {
                    return false;
                }
            } else if (!this.v.equals(eVar.v)) {
                return false;
            }
            if (this.w == null) {
                if (eVar.w != null) {
                    return false;
                }
            } else if (!this.w.equals(eVar.w)) {
                return false;
            }
            if (this.x == null) {
                if (eVar.x != null) {
                    return false;
                }
            } else if (!this.x.equals(eVar.x)) {
                return false;
            }
            if (this.y == null) {
                if (eVar.y != null) {
                    return false;
                }
            } else if (!this.y.equals(eVar.y)) {
                return false;
            }
            if (this.z == null) {
                if (eVar.z != null) {
                    return false;
                }
            } else if (!this.z.equals(eVar.z)) {
                return false;
            }
            if (!ll.a(this.A, eVar.A)) {
                return false;
            }
            if (this.B == null) {
                if (eVar.B != null) {
                    return false;
                }
            } else if (!this.B.equals(eVar.B)) {
                return false;
            }
            if (this.C == null) {
                if (eVar.C != null) {
                    return false;
                }
            } else if (!this.C.equals(eVar.C)) {
                return false;
            }
            if (this.D == null) {
                if (eVar.D != null) {
                    return false;
                }
            } else if (!this.D.equals(eVar.D)) {
                return false;
            }
            if (this.E == null) {
                if (eVar.E != null) {
                    return false;
                }
            } else if (!this.E.equals(eVar.E)) {
                return false;
            }
            if (this.F == null) {
                if (eVar.F != null) {
                    return false;
                }
            } else if (!this.F.equals(eVar.F)) {
                return false;
            }
            return this.G == null ? eVar.G == null : this.G.equals(eVar.G);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.F == null ? 0 : this.F.hashCode()) + (((this.E == null ? 0 : this.E.hashCode()) + (((this.D == null ? 0 : this.D.hashCode()) + (((this.C == null ? 0 : this.C.hashCode()) + (((this.B == null ? 0 : this.B.hashCode()) + (((((this.z == null ? 0 : this.z.hashCode()) + (((this.y == null ? 0 : this.y.hashCode()) + (((this.x == null ? 0 : this.x.hashCode()) + (((this.w == null ? 0 : this.w.hashCode()) + (((this.v == null ? 0 : this.v.hashCode()) + (((this.u == null ? 0 : this.u.hashCode()) + (((this.t == null ? 0 : this.t.hashCode()) + (((this.s == null ? 0 : this.s.hashCode()) + (((this.r == null ? 0 : this.r.hashCode()) + (((this.q == null ? 0 : this.q.hashCode()) + (((this.p == null ? 0 : this.p.hashCode()) + (((this.o == null ? 0 : this.o.hashCode()) + (((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((this.k == null ? 0 : this.k.hashCode()) + (((this.j == null ? 0 : this.j.hashCode()) + (((this.i == null ? 0 : this.i.hashCode()) + (((this.h == null ? 0 : this.h.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ll.a(this.b)) * 31) + ll.a(this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + ll.a(this.A)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.G != null) {
                i = this.G.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class f extends ln {
        public long[] a;
        public long[] b;

        public f() {
            a();
        }

        public f a() {
            this.a = lq.b;
            this.b = lq.b;
            this.ah = -1;
            return this;
        }

        public f a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                int b;
                Object obj;
                int c;
                Object obj2;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        b = lq.b(lfVar, 8);
                        a = this.a == null ? 0 : this.a.length;
                        obj = new long[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.e();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.e();
                        this.a = obj;
                        continue;
                    case 10:
                        c = lfVar.c(lfVar.l());
                        b = lfVar.r();
                        a = 0;
                        while (lfVar.p() > 0) {
                            lfVar.e();
                            a++;
                        }
                        lfVar.e(b);
                        b = this.a == null ? 0 : this.a.length;
                        obj2 = new long[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.a, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = lfVar.e();
                            b++;
                        }
                        this.a = obj2;
                        lfVar.d(c);
                        continue;
                    case 16:
                        b = lq.b(lfVar, 16);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new long[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = lfVar.e();
                            lfVar.a();
                            a++;
                        }
                        obj[a] = lfVar.e();
                        this.b = obj;
                        continue;
                    case 18:
                        c = lfVar.c(lfVar.l());
                        b = lfVar.r();
                        a = 0;
                        while (lfVar.p() > 0) {
                            lfVar.e();
                            a++;
                        }
                        lfVar.e(b);
                        b = this.b == null ? 0 : this.b.length;
                        obj2 = new long[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.b, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = lfVar.e();
                            b++;
                        }
                        this.b = obj2;
                        lfVar.d(c);
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            int i = 0;
            if (this.a != null && this.a.length > 0) {
                for (long a : this.a) {
                    lgVar.a(1, a);
                }
            }
            if (this.b != null && this.b.length > 0) {
                while (i < this.b.length) {
                    lgVar.a(2, this.b[i]);
                    i++;
                }
            }
            super.a(lgVar);
        }

        protected int b() {
            int i;
            int i2;
            int i3 = 0;
            int b = super.b();
            if (this.a == null || this.a.length <= 0) {
                i = b;
            } else {
                i2 = 0;
                for (long d : this.a) {
                    i2 += lg.d(d);
                }
                i = (b + i2) + (this.a.length * 1);
            }
            if (this.b == null || this.b.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.b.length) {
                i2 += lg.d(this.b[i3]);
                i3++;
            }
            return (i + i2) + (this.b.length * 1);
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return !ll.a(this.a, fVar.a) ? false : ll.a(this.b, fVar.b);
        }

        public int hashCode() {
            return ((((getClass().getName().hashCode() + 527) * 31) + ll.a(this.a)) * 31) + ll.a(this.b);
        }
    }

    public static final class g extends ln {
        private static volatile g[] g;
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Float e;
        public Double f;

        public g() {
            c();
        }

        public static g[] a() {
            if (g == null) {
                synchronized (ll.c) {
                    if (g == null) {
                        g = new g[0];
                    }
                }
            }
            return g;
        }

        public g a(lf lfVar) {
            while (true) {
                int a = lfVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(lfVar.f());
                        continue;
                    case 18:
                        this.b = lfVar.i();
                        continue;
                    case 26:
                        this.c = lfVar.i();
                        continue;
                    case 32:
                        this.d = Long.valueOf(lfVar.f());
                        continue;
                    case 45:
                        this.e = Float.valueOf(lfVar.d());
                        continue;
                    case 49:
                        this.f = Double.valueOf(lfVar.c());
                        continue;
                    default:
                        if (!lq.a(lfVar, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public void a(lg lgVar) {
            if (this.a != null) {
                lgVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                lgVar.a(2, this.b);
            }
            if (this.c != null) {
                lgVar.a(3, this.c);
            }
            if (this.d != null) {
                lgVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                lgVar.a(5, this.e.floatValue());
            }
            if (this.f != null) {
                lgVar.a(6, this.f.doubleValue());
            }
            super.a(lgVar);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += lg.e(1, this.a.longValue());
            }
            if (this.b != null) {
                b += lg.b(2, this.b);
            }
            if (this.c != null) {
                b += lg.b(3, this.c);
            }
            if (this.d != null) {
                b += lg.e(4, this.d.longValue());
            }
            if (this.e != null) {
                b += lg.b(5, this.e.floatValue());
            }
            return this.f != null ? b + lg.b(6, this.f.doubleValue()) : b;
        }

        public /* synthetic */ ln b(lf lfVar) {
            return a(lfVar);
        }

        public g c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.a == null) {
                if (gVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(gVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (gVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(gVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (gVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(gVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (gVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(gVar.d)) {
                return false;
            }
            if (this.e == null) {
                if (gVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(gVar.e)) {
                return false;
            }
            return this.f == null ? gVar.f == null : this.f.equals(gVar.f);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f != null) {
                i = this.f.hashCode();
            }
            return hashCode + i;
        }
    }
}
